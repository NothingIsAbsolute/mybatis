package com.liuteng.pojo;

public class Person {
    private String name;
    private int pid;
    private String address;

    public Person() {
    }

    public Person(String name, int pid, String address) {
        this.name = name;
        this.pid = pid;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", pid=" + pid +
                ", address='" + address + '\'' +
                '}';
    }
}
