package ru.almukanov;


import org.apache.log4j.PropertyConfigurator;
import org.hibernate.Session;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.almukanov.classes.Rating;
import ru.almukanov.classes.Students;
import ru.almukanov.dao.RateDaoImpl;
import ru.almukanov.services.RateService;
import ru.almukanov.services.StudentService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        PropertyConfigurator.configure("src/main/resources/log4j.properties");


      Processing.process();


    }



}
