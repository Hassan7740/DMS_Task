package org.dms.task.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


@Entity
@Table(name = "employee", catalog = "task")
public class Employee {
    @Id
    @Column(nullable = false , unique = true)
    private int id ;

    @Column(name = "Name")
    private String name ;

    @JsonFormat(pattern="yyyy-MM-dd")
    @Column(name = "BirthDate" )
    private Date birthDate ;

    @Column(name = "BirthCity")
    private String birthCity ;

    @Column(name = "Code")
    private int code ;

    @Column(name = "Department")
    private String department ;

    @Column(name = "JobTitle")
    private String jobTitle ;

    @Column(name = "DirectManager")
    private String directManager ;

    @Column(name = "ContractType")
    private String contractType ;

    @Column(name = "Status")
    private String status ;


    public Employee() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
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
