package com.more.classes;

public class Student
{
    private String studentName;
    private String studentNumber;

    public Student(String studentName, String studentNumber)
    {
        this.studentName = studentName;
        this.studentNumber = studentNumber;
    }
    //copy constructor
    public Student(Student student)
    {
        this.studentName=student.studentName;
        this.studentNumber=student.studentNumber;
    }
    public boolean equals(Student object)
    {
        return (this.studentName.equals(object.studentName) &&
                this.studentNumber.equals(object.studentNumber));
    }

    public String getStudentName()
    {
        return studentName;
    }

    public String getStudentNumber()
    {
        return studentNumber;
    }

    public void setStudentName(String studentName)
    {
        this.studentName = studentName;
    }

    public void setStudentNumber(String studentNumber)
    {
        this.studentNumber = studentNumber;
    }

    @Override
    public String toString()
    {
        return "Student Information: \n" +
                "Student Name: " +studentName +"\n" +
                "Student Number: " +studentNumber;
    }
}
