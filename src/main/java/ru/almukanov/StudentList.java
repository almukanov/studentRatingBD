package ru.almukanov;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;
/*
Make query in DB for optaining list of chosen grade
*/
public class StudentList {
public static List studentList(String grade){
    SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();

        return session.createQuery("FROM "+grade).list();




}



}
