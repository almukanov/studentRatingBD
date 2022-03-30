package ru.almukanov.dao;

import ru.almukanov.classes.Students;

import java.util.ArrayList;
import java.util.List;

public interface StudentList {
    List getStudentList(String grade);
}
