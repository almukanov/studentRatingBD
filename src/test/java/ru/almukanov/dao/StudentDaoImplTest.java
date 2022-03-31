package ru.almukanov.dao;

import org.junit.Assert;
import org.junit.Test;
import ru.almukanov.classes.Grade;
import ru.almukanov.classes.Students;

import java.util.List;

public class StudentDaoImplTest {

    @Test
    public void testNumberOfGrades() {
        List<Integer> l = GradeDao.HibernateUtil.getSessionFactory().openSession().createQuery("FROM Grade").list();
        Assert.assertTrue(l.size()==4);
    }

    @Test
    public void testSelectFromDB(){
        List<Students> l = GradeDao.HibernateUtil.getSessionFactory().openSession().createQuery("Select firstName  FROM Students ").list();
        Assert.assertEquals(l.get(0),"Иван");
    }

    @Test
    public void NotRightIndex(){
try {
  Grade s = (Grade) GradeDao.HibernateUtil.getSessionFactory().openSession().createQuery("FROM Grade WHERE id =" + 100).getSingleResult();
    Assert.fail();
}catch (Exception ex){
    ex.printStackTrace();
}

    }


}