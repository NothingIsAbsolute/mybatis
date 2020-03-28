package com.liuteng.mapper;

import com.liuteng.pojo.Person;

import java.util.List;

public interface PersonMapper {
    /**
     *
     * @param person
     * @return
     */
    public int save(Person person);
    public int update(Person person);
    public int delete(int pid);
    public List<Person> getAll();

}
