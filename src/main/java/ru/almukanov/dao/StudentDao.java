package ru.almukanov.dao;

import ru.almukanov.classes.Students;

import java.util.List;

public interface StudentDao {
    public void delete(Students student);
    public void update(Students student);
    public List<Students> findAll();

}
