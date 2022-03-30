package ru.almukanov;

import ru.almukanov.classes.Grade;
import ru.almukanov.classes.Rating;
import ru.almukanov.classes.Students;
import ru.almukanov.services.GradeService;
import ru.almukanov.services.RateService;
import ru.almukanov.services.StudentService;

import java.util.Scanner;

public class Processing {
    static double rate;
    static   Scanner scanner;
    static String fileNameRate;
    static String fileNameList;
    static String firstName;
    static String lastName;
    static double rating;

static String chosenGrade;
    public Processing() throws ClassNotFoundException, NoSuchMethodException {
    }

    //add new rate
    public static void process(){
        //choose a grade
        GradeService gradeService = new GradeService();
        StudentService studentService = new StudentService();
        RateService rateService = new RateService();

        for(Grade grades: gradeService.selectAllGrades() ){
            System.out.println(grades.getId() + " - " +grades.getGradeNumber());
        }

        System.out.println("Choose an id of grade");

        scanner = new Scanner(System.in);

        int gradeId = scanner.nextInt();
        for(Grade grade: gradeService.getGradeById(gradeId)){
          chosenGrade  = grade.getGradeNumber();
        }
        //--end--choose a grade
//TODO + rate
        for(Students st: studentService.findAllStudents(chosenGrade)){
            System.out.println(st.getFirstName()+" "+st.getLastName());
            System.out.println("Last rate: "+ rateService.select(st.getId()));
            double r = Calculation.countRate() + rateService.select(st.getId());

            System.out.println("New rate: "+r);

            Rating rate = new Rating(st,r);
            rateService.updateRate(rate);
        }

    }

}
