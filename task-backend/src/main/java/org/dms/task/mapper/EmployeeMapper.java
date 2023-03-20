package org.dms.task.mapper;


import org.dms.task.model.Employee;
import org.mapstruct.Mapper;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import org.dms.task.dto.EmployeeDTO;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

   public Employee map(EmployeeDTO employeeDTO);
   public EmployeeDTO map(Employee employee);
   public List<EmployeeDTO> map(List<Employee> employees);
}
