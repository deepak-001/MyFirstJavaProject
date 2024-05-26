package net.javaguides.ems.repository;

//2nd
import net.javaguides.ems.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

//By using JPaRepository to perform CRUD Operation
public interface EmployeeRepository extends JpaRepository<Employee, Long> {


}
