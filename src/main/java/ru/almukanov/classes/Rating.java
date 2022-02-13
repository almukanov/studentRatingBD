package ru.almukanov.classes;

import org.hibernate.annotations.OptimisticLockType;
import org.hibernate.annotations.OptimisticLocking;
import ru.almukanov.services.StudentService;

import javax.persistence.*;

@Entity
@Table(name = "rating", schema="public")

public class Rating {

//fields
    @Id
    @Column(name = "student", nullable = false)
    private int student;

    @Column(name = "rating")
    private double rating;
//--end--fields

    public Rating() {
    }

    public Rating( Students student, double rating) {
        this.rating = rating;
        this.student = student.getId();
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

}
