package classes;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table (name = "rating", schema="rating")
public class StudentRate11a implements Serializable {
    public StudentRate11a() {
    }

    public StudentRate11a(Long id, String firstName, String lastName, Double rating) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.rating = rating;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "rating")
    private Double rating;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return  ""+id + " " + firstName  + " " + lastName;
    }
}
