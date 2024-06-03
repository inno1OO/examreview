package com.example.examreview.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data

@Getter
@Setter
@Document(collection = "employees")
public class Employee {
    @Id
    private ObjectId id;
    @Field(value = "firstname")
    private String firstName;
    @Field(value = "lastname")
    private String lastName;
    @Field(value = "salary")
    private Double salary;


    public Employee(String firstName, String lastName, Double salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

}
