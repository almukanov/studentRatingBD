package ru.almukanov.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import ru.almukanov.HibernateUtil;
import ru.almukanov.classes.Grade;
import ru.almukanov.classes.Rating;
import ru.almukanov.classes.Students;

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
