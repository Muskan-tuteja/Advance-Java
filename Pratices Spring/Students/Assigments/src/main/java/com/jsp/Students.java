package com.jsp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Students {
    private int student_Id;
           private String student_Name;
    private String course;
      private String  email;
    private  int percentage;
            private String Requirements;

    public int getStudent_Id() {
        return student_Id;
    }

    public void setStudent_Id(int student_Id) {
        this.student_Id = student_Id;
    }

    public String getStudent_Name() {
        return student_Name;
    }

    public void setStudent_Name(String student_Name) {
        this.student_Name = student_Name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public String getRequirements() {
        return Requirements;
    }

    public void setRequirements(String requirements) {
        Requirements = requirements;
    }

    public Students(@Value(value = "123") int student_Id, @Value(value = "muskan") String student_Name, @Value(value = "Cse") String course, @Value(value = "muskan@gmail.com") String email, @Value(value = "29") int percentage, @Value(value = "java full stack") String requirements) {
        this.student_Id = student_Id;
        this.student_Name = student_Name;
        this.course = course;
        this.email = email;
        this.percentage = percentage;
        Requirements = requirements;
    }
    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + student_Id +
                ", studentName='" + student_Name + '\'' +
                ", course='" + course + '\'' +
                ", email='" + email + '\'' +
                ", percentage=" + percentage +
                ", requirements=" + Requirements +
                '}';
    }
}
