package com.example.examreview;

import com.example.examreview.model.Employee;
import com.example.examreview.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Comparator;


@RequiredArgsConstructor
@SpringBootApplication
public class ExamReviewApplication implements CommandLineRunner {

    private final EmployeeRepository employeeRepository;

    public static void main(String[] args) {
        SpringApplication.run(ExamReviewApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Employee emp1 = new Employee("Lumane", "Innocent", 38.8);
        Employee emp2 = new Employee("John", "Doe", 50000.0);
        Employee emp3 = new Employee("Jane", "Dona", 50000.0);
        Employee emp4 = new Employee("Alice", "Smith", 60000.0);
        Employee emp5 = new Employee("Bob", "Brown", 45000.0);


//        System.out.println(employeeRepository.save(emp1).getFirstName() + " is saved");
//        System.out.println(employeeRepository.save(emp2).getFirstName() + "is saved");
//        System.out.println(employeeRepository.save(emp3).getFirstName() + "is saved");
//        System.out.println(employeeRepository.save(emp4).getFirstName() + "is saved");
//        System.out.println(employeeRepository.save(emp5).getFirstName() + "is saved");
        employeeRepository.findAll()
                .stream()
                .sorted(
                        Comparator.comparing(Employee::getSalary)
                                .thenComparing(Employee::getLastName, Comparator.reverseOrder())
                )
                .forEach(System.out::println);
//        System.out.println((employeeRepository.findAll()));
    }
}
