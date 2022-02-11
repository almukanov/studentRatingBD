package ru.almukanov;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import ru.almukanov.classes.Rating;
import ru.almukanov.classes.Students;
import ru.almukanov.services.RateService;
import ru.almukanov.services.StudentService;

import javax.persistence.Query;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Processing {
    static double rate;
    static   Scanner scanner;
    static String fileNameRate;
    static String fileNameList;
    static String firstName;
    static String lastName;
    static double rating;
   static String grade;

    public Processing() throws ClassNotFoundException, NoSuchMethodException {
    }

    //add new rate
    public static void process(){
        //-------------choose a grade

        System.out.println("Choose a grade: 1-9d, 2-9e, 3-9f, 4-9g, 5-11a, 6-11b, 7-11c, 8-11d, 9-12");

        scanner = new Scanner(System.in);
        switch(scanner.nextInt()){
            case 1: {
                grade = "9d";

                break;
            }
            case 2: {
                grade = "9e";

                break;
            }
            default:
                System.out.println("There is no a chosen grade");

        }


        StudentService studentService = new StudentService();
        RateService rateService = new RateService();


        for(Students st: studentService.findAllStudents(grade)){
            System.out.println(st.getFirstName()+" "+st.getLastName());
            double r = Calculation.countRate();
            Rating rate = new Rating(st,r);
            rateService.updateRate(rate);
        }











    }
   public static void recordNewStudentRateList() {
//---
   }
}
