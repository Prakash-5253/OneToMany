package com.example.demoForOneToMany.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="student_table")
public class Student {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "std_id")
    private String id;
    private String name;
    private Integer age;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_id",referencedColumnName = "std_id")
   private List<Sport> sport;
}
