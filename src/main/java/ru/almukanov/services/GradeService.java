package ru.almukanov.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import ru.almukanov.classes.Grade;
import ru.almukanov.classes.Rating;
import ru.almukanov.classes.Students;
import ru.almukanov.dao.GradeDaoImpl;

import java.util.List;

@Component
public class GradeService {
    public GradeDaoImpl getGradeDaoimpl() {
        return gradeDaoimpl;
    }
@Autowired
    public void setGradeDaoimpl(GradeDaoImpl gradeDaoimpl) {
        this.gradeDaoimpl = gradeDaoimpl;
    }

    public  GradeDaoImpl gradeDaoimpl;
    public List<Grade> selectAllGrades() {
        return gradeDaoimpl.select();
    }
    public List<Grade> getGradeById(int id){
     return  gradeDaoimpl.selectById(id);
    }
}
