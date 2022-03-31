package ru.almukanov.classes;

import org.hibernate.annotations.OptimisticLockType;
import org.hibernate.annotations.OptimisticLocking;
import org.springframework.stereotype.Component;
import ru.almukanov.services.StudentService;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "rating", schema="public")
@Component
public class Rating implements Serializable {
    //fields
    @Id
   // @Column(name = "student", nullable = false)
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="student")
    private Students student;

    @Column(name = "rating")
    private double rating;
    //--end--fields

    public Rating() {
    }

    public Rating(Students student, double rating) {
        this.student = student;
        this.rating = rating;
    }


    public Students getStudent() {
        return student;
    }

    public void setStudent(Students student) {
        this.student = student;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

}
