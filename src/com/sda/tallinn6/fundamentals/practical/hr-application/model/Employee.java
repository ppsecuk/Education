package sda.java.model;

import java.math.BigDecimal;
import java.util.Date;

public class Employee {
    //

        private int id;
        private String name;
        private String surname;
        private String gender;
        private Date birthDate;
        private String email;
        private BigDecimal salary;
        private boolean isManager;



        //manual constructor
        public Employee(){

        }


        //automatic constructor
        public Employee(int id, String name, String surname, String gender, Date birthDate, String email, BigDecimal salary, boolean isManager) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.birthDate = birthDate;
        this.email = email;
        this.salary = salary;
        this.isManager = isManager;
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

        public String getSurname() {
                return surname;
        }

        public void setSurname(String surname) {
                this.surname = surname;
        }

        public String getGender() {
                return gender;
        }

        public void setGender(String gender) {
                this.gender = gender;
        }

        public Date getBirthDate() {
                return birthDate;
        }

        public void setBirthDate(Date birthDate) {
                this.birthDate = birthDate;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public BigDecimal getSalary() {
                return salary;
        }

        public void setSalary(BigDecimal salary) {
                this.salary = salary;
        }

        public boolean isManager() {
                return isManager;
        }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender='" + gender + '\'' +
                ", birthDate=" + birthDate +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                ", isManager=" + isManager +
                '}';
    }

    public void setManager(boolean manager) {
                isManager = manager;

        }
}
