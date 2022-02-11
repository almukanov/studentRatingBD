package ru.almukanov.services;

import ru.almukanov.classes.Rating;
import ru.almukanov.classes.Students;
import ru.almukanov.dao.StudentDao;

import java.util.List;

public class StudentService {

    StudentDao studentDao = new StudentDao();


    public void updateStudent(Students student) {
        studentDao.update(student);
    }

    public List<Students> findAllStudents() {
        return studentDao.findAll();
    }
}
