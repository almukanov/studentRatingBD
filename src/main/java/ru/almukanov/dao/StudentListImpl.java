package ru.almukanov.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import java.util.List;
/*
Make query in DB for obtaining list of chosen grade
*/
@Component
public class StudentListImpl implements StudentList{
    public List getStudentList(String grade){
    SessionFactory sf = GradeDao.HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        return session.createQuery("FROM "+grade).list();
    }


}
