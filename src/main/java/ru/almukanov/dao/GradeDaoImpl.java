package ru.almukanov.dao;

import ru.almukanov.classes.Grade;

import java.util.List;

public class GradeDaoImpl implements GradeDao{


    @Override
    public List<Grade> select() {
            return HibernateUtil.getSessionFactory().openSession().createQuery("FROM Grade").list();

    }

    public List<Grade> selectById(int id) {
       return HibernateUtil.getSessionFactory().openSession().createQuery("FROM Grade WHERE id =" + id).list();

    }
}
