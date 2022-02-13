package ru.almukanov.dao;

import ru.almukanov.classes.Grade;
import ru.almukanov.classes.Rating;

import java.util.List;

public interface GradeDao {
    public List<Grade> select();
}
