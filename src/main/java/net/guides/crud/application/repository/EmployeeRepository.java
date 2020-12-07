package net.guides.crud.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.guides.crud.application.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
