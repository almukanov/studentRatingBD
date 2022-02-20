package ru.almukanov.dao;

import org.hibernate.Hibernate;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import ru.almukanov.HibernateUtil;
import ru.almukanov.classes.Students;

import java.util.List;

import static org.junit.Assert.*;

public class StudentDaoImplTest {
    @Test
    public void testNumberOfGrades() {
        List<Integer> l = HibernateUtil.getSessionFactory().openSession().createQuery("FROM Grade").list();
        Assert.assertTrue(l.size()==4);
    }

    @Test
    public void testSelectFromDB(){
        List<Students> l = HibernateUtil.getSessionFactory().openSession().createQuery("Select firstName  FROM Students ").list();
        Assert.assertEquals(l.get(0),"Иван");
    }


}