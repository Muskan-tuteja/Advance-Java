package com.springcore;

public class Students {
    private int Student_id;
    private String Student_name;
    private String Student_email;

    public String getStudent_name() {
        return Student_name;
    }

    public void setStudent_name(String student_name) {
        Student_name = student_name;
    }

    public int getStudent_id() {
        return Student_id;
    }

    public void setStudent_id(int student_id) {
        Student_id = student_id;
    }

    public String getStudent_email() {
        return Student_email;
    }

    public void setStudent_email(String student_email) {
        Student_email = student_email;
    }

    public Students(int student_id, String student_name, String student_email) {
        Student_id = student_id;
        Student_name = student_name;
        Student_email = student_email;
    }
    public Students() {
        super();
    }

    @Override
    public String toString() {
        return "Students{" +
                "Student_id=" + Student_id +
                ", Student_name='" + Student_name + '\'' +
                ", Student_email='" + Student_email + '\'' +
                '}';
    }
}
