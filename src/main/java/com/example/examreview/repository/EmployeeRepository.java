package com.example.examreview.repository;

import com.example.examreview.model.Employee;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends MongoRepository<Employee, ObjectId> {
//    @Override
//    Optional<Employee> findById(String s);

//    Optional<Employee> findByFirstName(String firstName);
//    Optional<Employee> findBySalaryAndFirstName();
//    Optional<Employee> findAllBySalaryIsNotOrderBySalaryAscFirstNameAsc();
    List<Employee> findAllByFirstNameAndLastName(String firstName, String lastName);
}
