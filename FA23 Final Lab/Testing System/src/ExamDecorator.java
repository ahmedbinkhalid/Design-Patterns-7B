/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AHMED
 */
public abstract class ExamDecorator implements Exam {
    protected Exam decoratedExam;

    public ExamDecorator(Exam decoratedExam) {
        this.decoratedExam = decoratedExam;
    }

    @Override
    public void conduct() {
        decoratedExam.conduct();
    }
}





