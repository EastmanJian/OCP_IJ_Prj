package edu.exam.ocp.se6.sg.chapter6.encapsulation;

/**
 * Good example of tight encapsulation
 */
public class Student2 {
    private String year;  //fields are declared as private
    private float grade;
    public void setYear(String year) {
        if(!year.equals("Freshman") &&  //validation for the field
        !year.equals("Sophomore") &&
        !year.equals("Junior") &&
        !year.equals("Senior")) {
            throw new IllegalArgumentException(
                    year + " not a valid year");
        } else {
            this.year = year;
        }
    }
    public String getYear() {
        return year;
    }
    public void setGrade(double grade) {
        if(grade < 0.0 || grade > 105.0) { //validation for the field
            throw new IllegalArgumentException(grade + " is out of range");
        } else {
            this.grade = (float) grade; //data type change
        }
    }
    public double getGrade() {
        return grade;
    }
    
    public static void main(String[] args) {
        Student2 s2 = new Student2();
        s2.setYear("Junior");
        s2.setGrade(-24.5);
    }
}