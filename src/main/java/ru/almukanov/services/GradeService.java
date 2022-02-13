package ru.almukanov.services;

import ru.almukanov.classes.Grade;
import ru.almukanov.classes.Rating;
import ru.almukanov.classes.Students;
import ru.almukanov.dao.GradeDaoImpl;

import java.util.List;

public class GradeService {
    GradeDaoImpl gradeDaoimpl = new GradeDaoImpl();

    public GradeService() {
    }


    public List<Grade> selectAllGrades() {
        return gradeDaoimpl.select();
    }

    public List<Grade> getGradeById(int id){
     return  gradeDaoimpl.selectById(id);
    }
}
