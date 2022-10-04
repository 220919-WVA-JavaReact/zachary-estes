package com.revature.courses.models;

import java.util.Objects;

public class Teacher {
    // My fields here should match what I have in the database with a similar data type

    private int teacherId;

    private String first;
    private String last;
    private String username;
    private String password;

    // now the plan is to create some constructors and some getters and setters and override some object class methods


    public Teacher(int teacherId, String first, String last, String username, String password) {
        this.teacherId = teacherId;
        this.first = first;
        this.last = last;
        this.username = username;
        this.password = password;
    }

    public Teacher(String first, String last, String username, String password) {
        this.first = first;
        this.last = last;
        this.username = username;
        this.password = password;
    }

    //creating getter/setter classes
    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // We can also generate some methods that override the existing methods from the object class

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", first='" + first + '\'' +
                ", last='" + last + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        //explicit type casting
        Teacher teacher = (Teacher) o;
        return teacherId == teacher.teacherId && first.equals(teacher.first) && last.equals(teacher.last) && username.equals(teacher.username) && password.equals(teacher.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teacherId, first, last, username, password);
    }


}
