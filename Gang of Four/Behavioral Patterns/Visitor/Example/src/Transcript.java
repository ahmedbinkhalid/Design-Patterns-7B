/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FA20-BSE-062
 */
import java.io.Serializable;

public class Transcript implements Serializable {
    private int studentId;
    private String subject;
    private int grade;

    public Transcript(int studentId, String subject, int grade) {
        this.studentId = studentId;
        this.subject = subject;
        this.grade = grade;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getSubject() {
        return subject;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId + ", Subject: " + subject + ", Grade: " + grade;
    }
}