package ru.almukanov.dao;

import org.hibernate.Hibernate;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import ru.almukanov.HibernateUtil;
import ru.almukanov.Processing;
import ru.almukanov.classes.Grade;
import ru.almukanov.classes.Students;
import ru.almukanov.services.GradeService;
import ru.almukanov.services.RateService;
import ru.almukanov.services.StudentService;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;
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

    @Test
    public void NotRightIndex(){
try {
  Grade s = (Grade) HibernateUtil.getSessionFactory().openSession().createQuery("FROM Grade WHERE id =" + 100).getSingleResult();
    Assert.fail();
}catch (Exception ex){
    ex.printStackTrace();
}

    }

}