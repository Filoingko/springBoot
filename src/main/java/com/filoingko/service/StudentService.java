package com.filoingko.service;

import com.filoingko.dao.FakeStudentDAOImpl;
import com.filoingko.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

    @Autowired
    @Qualifier("fakedata")
    private FakeStudentDAOImpl fakeStudentDAOImpl;

    public Collection<Student> getAllStudent(){
        return this.fakeStudentDAOImpl.getAllStudent();
    }

    public Student getStudentById(int id){
        return this.fakeStudentDAOImpl.getStudentById(id);
    }

    public void deleteStudentById(int id){
        this.fakeStudentDAOImpl.deleteStudentById(id);
    }

    public void updateStudentById(Student student){
        this.fakeStudentDAOImpl.updateStudentById(student);
    }

    public void addStudent(Student student) {
        this.fakeStudentDAOImpl.addStudent(student);
    }
}
