/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AHMED
 */
public class ExamResults {
    private GradingStrategy gradingStrategy;

    public void setGradingStrategy(GradingStrategy gradingStrategy) {
        this.gradingStrategy = gradingStrategy;
    }

    public void calculateResults() {
        if (gradingStrategy != null) {
            gradingStrategy.grade(this);
        } else {
            System.out.println("No grading strategy set");
        }
    }
}

