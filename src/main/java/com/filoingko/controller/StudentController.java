package com.filoingko.controller;

import com.filoingko.entity.Student;
import com.filoingko.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.Media;
import java.awt.*;
import java.util.Collection;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Student> getAllStudent(){
        return studentService.getAllStudent();
    }

    @RequestMapping(value = "/{id}" , method = RequestMethod.GET)
    public Student getStudentById(@PathVariable("id") int id){
        return this.studentService.getStudentById(id);
    }

    @RequestMapping(value = "/{id}" , method = RequestMethod.DELETE)
     public void deletestudentById(@PathVariable("id") int id){
        studentService.deleteStudentById(id);
    }

    @RequestMapping(method = RequestMethod.PUT , consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateStudentBuId(@RequestBody Student student){
        studentService.updateStudentById(student);
    }

    @RequestMapping(method = RequestMethod.POST , consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }


}
