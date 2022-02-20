package ru.almukanov.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.almukanov.HibernateUtil;
import ru.almukanov.classes.Grade;
import ru.almukanov.classes.Rating;
import ru.almukanov.classes.Students;

import java.time.LocalDateTime;
import java.util.List;

public class RateDaoImpl implements RateDao {
    Logger logger = LoggerFactory.getLogger(RateDaoImpl.class);

    public double select(int id) {
       return ((double) HibernateUtil.getSessionFactory().openSession().createQuery("SELECT rating FROM Rating where student =" + id).list().get(0));

    }

    public void save(Rating rate) {
        LocalDateTime dt1 = LocalDateTime.now();
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(rate);
        tx1.commit();
        session.close();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST2 {} {}",dt1, dt2);
    }

    public void update(Rating rate) {
        LocalDateTime dt1 = LocalDateTime.now();
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
            session.update(rate);
            tx1.commit();
            session.close();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST2 {} {}",dt1, dt2);

    }

    public void delete(Rating rate) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(rate);
        tx1.commit();
        session.close();
    }




}
