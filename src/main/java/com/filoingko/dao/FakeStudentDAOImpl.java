package com.filoingko.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import com.filoingko.entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("fakedata")
public class FakeStudentDAOImpl implements StudentDAO {
    private static Map<Integer, Student> students;

    static {
        students = new HashMap<Integer, Student>(){
            {
                put(1, new Student(1,"Kamal","sport"));
                put(2, new Student(2,"Gacvv","sport"));
                put(3, new Student(3,"Nimal","sport"));

            }
        };
    }

    @Override
    public Collection<Student> getAllStudent(){
        return this.students.values();
    }

    @Override
    public Student getStudentById(int id){
        return this.students.get(id);
    }

    @Override
    public void deleteStudentById(int id){
        students.remove(id);
    }

    @Override
    public void updateStudentById(Student student){
        Student st = students.get(student.getId());
        st.setCourse(student.getCourse());
        st.setName(student.getName());
        students.put(student.getId() , student);
    }

    @Override
    public void addStudent(Student student) {
        this.students.put(student.getId() , student);
    }
}
