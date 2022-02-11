package ru.almukanov;


import org.hibernate.Session;

import ru.almukanov.classes.Rating;
import ru.almukanov.classes.Students;
import ru.almukanov.services.RateService;
import ru.almukanov.services.StudentService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
      Processing.process();


    }



}
