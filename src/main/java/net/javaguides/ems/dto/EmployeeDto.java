package net.javaguides.ems.dto;

//3rd
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

//It is used to transfer data between client and server
//EmployeeDto build response for RestAPI
public class EmployeeDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}
