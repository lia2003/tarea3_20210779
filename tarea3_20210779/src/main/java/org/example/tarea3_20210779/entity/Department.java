package org.example.tarea3_20210779.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "departments")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "department_id", nullable = false)
    private Integer department_id;

    @Column(name = "department_name", length = 30)
    private String departmentName;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;
    

}
