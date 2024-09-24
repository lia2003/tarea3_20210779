package org.example.tarea3_20210779.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "jobs")
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_id", length = 10)
    private String jobId;

    @Column(name = "job_title", length = 35)
    private String jobTitle;


}
