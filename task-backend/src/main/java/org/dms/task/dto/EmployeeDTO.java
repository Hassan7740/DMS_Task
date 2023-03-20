package org.dms.task.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import java.util.Date;

@JsonSerialize
@AllArgsConstructor
public class EmployeeDTO {

    private Integer id = null;
    private String name = null;
    @JsonFormat(shape = JsonFormat.Shape.STRING ,pattern="yyyy-MM-dd" ,  locale ="##defualt"  )
    private Date birthDate = null;
    private String birthCity = null;
    private Integer code = null;
    private String department = null;
    private String jobTitle = null;
    private String directManager = null;
    private String contractType = null;
    private String status = null;


    public Integer getId() {
        return id;
    }
        public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getBirthCity() {
        return birthCity;
    }

    public void setBirthCity(String birthCity) {
        this.birthCity = birthCity;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getDirectManager() {
        return directManager;
    }

    public void setDirectManager(String directManager) {
        this.directManager = directManager;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
