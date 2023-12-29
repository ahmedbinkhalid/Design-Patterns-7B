/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AHMED
 */
public class TimedExamDecorator extends ExamDecorator {
    public TimedExamDecorator(Exam decoratedExam) {
        super(decoratedExam);
    }

    @Override
    public void conduct() {
        super.conduct();
        System.out.println("Timed Exam");
    }

    @Override
    public void setState(ExamState ongoingState) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
