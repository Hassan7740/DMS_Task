package org.dms.task.controller;

import org.dms.task.dto.EmployeeDTO;
import org.dms.task.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
@CrossOrigin(origins = {"http://localhost:4200"}, methods = { RequestMethod.POST })
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("all")
    public ResponseEntity findAllEmployee(@RequestBody EmployeeDTO employeeDTO) {
        try {
            List<EmployeeDTO> employees = employeeService.employeeFilterService(employeeDTO);
            return ResponseEntity.ok().body(employees);
        } catch (HttpMessageNotReadableException e) {
            return ResponseEntity.badRequest().body("something went Wrong kindly refer Back to our back end developer");
        }
    }

}
