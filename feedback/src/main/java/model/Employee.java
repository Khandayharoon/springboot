package model;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;
@Data
@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="description")
    private String description;
}
