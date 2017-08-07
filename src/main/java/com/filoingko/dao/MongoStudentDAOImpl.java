package com.filoingko.dao;

import com.filoingko.entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
@Qualifier("mongodata")
public class MongoStudentDAOImpl implements StudentDAO {


    @Override
    public Collection<Student> getAllStudent() {
        return null;
    }

    @Override
    public Student getStudentById(int id) {
        return null;
    }

    @Override
    public void deleteStudentById(int id) {

    }

    @Override
    public void updateStudentById(Student student) {

    }

    @Override
    public void addStudent(Student student) {

    }
}
