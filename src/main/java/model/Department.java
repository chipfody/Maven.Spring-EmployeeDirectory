package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long departmentNumber;
    private String departmentName;
    private String managerName;

    public Department() {
    }

    public Department(Long departmentNumber, String departmentName, String managerName) {
        this.departmentNumber = departmentNumber;
        this.departmentName = departmentName;
        this.managerName = managerName;
    }

    public Long getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(Long departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }
}
