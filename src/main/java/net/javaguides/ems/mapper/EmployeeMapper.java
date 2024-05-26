package net.javaguides.ems.mapper;


import net.javaguides.ems.dto.EmployeeDto;
import net.javaguides.ems.entity.Employee;

//4th
//It is used to map EmployeeEntity to EmployeeDto and vice-versa
//So whenever we build the RestFull Services, We have to convert the EmployeeDto into EmployeeJPA Entity and vice-versa
public class EmployeeMapper {
    //Here mapping Employee Jpa to Employee Dto
    public static EmployeeDto mapToEmployeeDto(Employee employee) {
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }

    //Similarlly mapping Employee Dto to Employee Jpa
    public static Employee mapToEmployee(EmployeeDto employeeDto) {
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail()
        );
    }
}
