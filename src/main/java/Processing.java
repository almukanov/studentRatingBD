import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.persistence.Query;
import javax.persistence.TransactionRequiredException;
import javax.persistence.criteria.CriteriaDelete;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Locale;
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

        System.out.println("Choose a grade:");

        scanner = new Scanner(System.in);
        switch(scanner.nextInt()){
            case 1: {
                grade = "StudentRate9d";

                break;
            }
            case 2: {
                grade = "StudentRate9e";

                break;
            }
            default:
                System.out.println("No file");

        }




        //----------rate counting
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction txn = session.beginTransaction();
        //get list of choosen grade
        for(int i =0;i< StudentList.studentList(grade).size(); i++){
            String[] id = StudentList.studentList(grade).get(i).toString().split(" ");
            // get id of student
            Long num = Long.parseLong(id[0]);
            //get current rating of student
            double d = Double.parseDouble(id[3]);
            System.out.println(StudentList.studentList(grade).get(i));
            //calculate a new rating
            rate = d + Calculation.countRate();
            rate = new BigDecimal(rate).setScale(2, RoundingMode.HALF_EVEN).doubleValue();

            Query query = session.createQuery("update "+grade+" set rating = :rating where id = :number");
            query.setParameter("number",num);
            query.setParameter("rating", rate);
            query.executeUpdate();

        }
        txn.commit();
        session.close();





    }
   public static void recordNewStudentRateList() {
//---
   }
}
