package ru.almukanov.services;

import ru.almukanov.classes.Students;
import ru.almukanov.dao.StudentDaoImpl;

import java.util.List;

public class StudentService {

    StudentDaoImpl studentDaoImpl = new StudentDaoImpl();


    public void updateStudent(Students student) {
        studentDaoImpl.update(student);
    }

    public List<Students> findAllStudents(String grade) {
        return studentDaoImpl.findAll(grade);
    }
}
