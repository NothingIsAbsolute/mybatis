package com.liuteng.dao;


import com.liuteng.mapper.PersonMapper;
import com.liuteng.pojo.Person;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyTest {

    InputStream is= null;
    SqlSessionFactory build =null;
    SqlSession session = null;
    PersonMapper personMapper = null;
    @Before
    public void before() throws IOException {
         is= Resources.getResourceAsStream("mybatis-cfg.xml");
         build = new SqlSessionFactoryBuilder().build(is);
         session = build.openSession();
         personMapper = session.getMapper(PersonMapper.class);
    }
    //查询
    @Test
    public void test01() throws IOException {
        List<Person> personList = personMapper.getAll();
        System.out.println(personList);
    }

    //添加
    @Test
    public void test02()  {
        Person p = new Person("王五",8,"南京");
        int i = personMapper.save(p);
        System.out.println("添加成功了"+i+"行");
    }
    //修改
    @Test
    public void test03()  {
        Person p = new Person("张三",1,"北京");
        int i = personMapper.update(p);
        System.out.println("修改成功了"+i+"行");
    }
    //删除
    @Test
    public void test04() {
        int i = personMapper.delete(6);
        System.out.println("删除成功了"+i+"行");
    }
    @After
    public void affer(){
        session.commit();
        session.close();
    }
}
