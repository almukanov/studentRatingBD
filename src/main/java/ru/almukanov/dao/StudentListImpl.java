package ru.almukanov.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;
/*
Make query in DB for obtaining list of chosen grade
*/
public class StudentListImpl implements StudentList{
    public List getStudentList(String grade){
    SessionFactory sf = GradeDao.HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        return session.createQuery("FROM "+grade).list();
    }


}
