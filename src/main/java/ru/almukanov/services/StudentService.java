package ru.almukanov.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import ru.almukanov.classes.Students;
import ru.almukanov.dao.StudentDaoImpl;

import java.util.List;
@Component
public class StudentService {
    public StudentService(StudentDaoImpl studentDaoImpl) {
        this.studentDaoImpl = studentDaoImpl;
    }

    private StudentDaoImpl studentDaoImpl;


    public StudentDaoImpl getStudentDaoImpl() {
        return studentDaoImpl;
    }

    public void setStudentDaoImpl(StudentDaoImpl studentDaoImpl) {
        this.studentDaoImpl = studentDaoImpl;
    }







    public List<Students> findAllStudents(String grade) {
        return studentDaoImpl.findAll(grade);
    }
    public Students findStudentById(int id) {
        return studentDaoImpl.findStudentById(id);
    }
}
