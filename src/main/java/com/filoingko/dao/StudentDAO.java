package com.filoingko.dao;

import com.filoingko.entity.Student;

import java.util.Collection;

public interface StudentDAO {
    Collection<Student> getAllStudent();

    Student getStudentById(int id);

    void deleteStudentById(int id);

    void updateStudentById(Student student);

    void addStudent(Student student);
}
