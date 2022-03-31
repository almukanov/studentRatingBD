package ru.almukanov;

import com.sun.org.apache.bcel.internal.util.ClassPath;
import javafx.application.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import ru.almukanov.classes.Grade;
import ru.almukanov.classes.Rating;
import ru.almukanov.classes.Students;
import ru.almukanov.services.GradeService;
import ru.almukanov.services.RateService;
import ru.almukanov.services.StudentService;

import java.util.Scanner;
@Component
public class Processing {
    ApplicationContext context
            = new ClassPathXmlApplicationContext("applicationContext.xml");
    static double rate;
    static   Scanner scanner;
    static String fileNameRate;
    static String fileNameList;
    static String firstName;
    static String lastName;
    static double rating;
    GradeService gradeService = context.getBean("gradeService",GradeService.class);
    StudentService studentService = context.getBean("studentService",StudentService.class);;
    RateService rateService = context.getBean("rateService",RateService.class);;
static String chosenGrade;
    public Processing() throws ClassNotFoundException, NoSuchMethodException {
    }

    //add new rate

    public GradeService getGradeService() {
        return gradeService;
    }

    public void setGradeService(GradeService gradeService) {
        this.gradeService = gradeService;
    }

    public StudentService getStudentService() {
        return studentService;
    }

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    public RateService getRateService() {
        return rateService;
    }

    public void setRateService(RateService rateService) {
        this.rateService = rateService;
    }

    public  void process(){
        //choose a grade



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
