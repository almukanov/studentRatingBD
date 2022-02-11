/*package ru.almukanov.classes;

import org.hibernate.annotations.OptimisticLockType;
import org.hibernate.annotations.OptimisticLocking;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "grade", schema="public")

public class Grade {
    public Grade() {
    }

    public Grade(String gradeNumber) {
        this.gradeNumber = gradeNumber;

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    public String getGradeNumber() {
        return gradeNumber;
    }

    public void setGradeNumber(String gradeNumber) {
        this.gradeNumber = gradeNumber;
    }




    public List<Students> getStudents() {
        return students;
    }

    public void setStudents(List<Students> students) {
        this.students = students;
    }

    @Column(name = "grade_number", nullable = false)
    private String gradeNumber;
    @OneToMany(mappedBy = "grade",  orphanRemoval = true)
    private List<Students> students;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

*/