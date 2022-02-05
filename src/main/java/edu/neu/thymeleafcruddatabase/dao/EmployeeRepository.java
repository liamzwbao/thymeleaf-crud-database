package edu.neu.thymeleafcruddatabase.dao;

import edu.neu.thymeleafcruddatabase.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
