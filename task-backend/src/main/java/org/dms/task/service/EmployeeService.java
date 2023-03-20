package org.dms.task.service;

import org.dms.task.dto.EmployeeDTO;
import org.dms.task.mapper.EmployeeMapper;
import org.dms.task.model.Employee;
import org.dms.task.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private EmployeeMapper employeeMapper;


    public List<EmployeeDTO> employeeFilterService(EmployeeDTO employeeDTO) {
        List<Employee> employee = employeeRepository.employeefilter(employeeDTO);
        return employeeMapper.map(employee);
    }

}
