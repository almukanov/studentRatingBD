package ru.almukanov.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;
import ru.almukanov.classes.Students;

import java.util.List;
@Component
public class StudentDaoImpl implements StudentDao{

    public void delete(Students student)  {
        Session session = GradeDao.HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(student);
        tx1.commit();
        session.close();
    }

    public void update(Students student) {
        Session session = GradeDao.HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(student);
        tx1.commit();
        session.close();

    }

    public List<Students> findAll(String gr) {

       return GradeDao.HibernateUtil.getSessionFactory().openSession().createQuery("FROM  Students s WHERE s.grade.gradeNumber  = "+"'"+gr+"'").list();


    }


    public Students findStudentById(int id) {
        return GradeDao.HibernateUtil.getSessionFactory().openSession().get(Students.class, id);
    }
}
