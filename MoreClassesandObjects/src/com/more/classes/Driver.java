package com.more.classes;

public class Driver
{
    public static void main(String[] args) {
        Subject subject1 = new Subject("TPGIOAB", "Technical Programming");

        Student student1 = new Student("Chuck Norris", "19834268892");

        ExamPaper paper = new ExamPaper(student1, subject1, 100);
        System.out.println(paper);
        System.out.println("Subject code: " +paper.getSubject().getSubjectCode());
        System.out.println("Student number: " +paper.getStudent().getStudentNumber());
    }
}
