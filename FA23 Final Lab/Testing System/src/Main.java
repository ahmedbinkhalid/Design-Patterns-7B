/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AHMED
 */
public class Main {
    public static void main(String[] args) {
        // Step 1: Demonstrate Singleton
        Singleton singleton = Singleton.getInstance();

        // Step 2: Demonstrate Factory Method
        ExamFactory mathExamFactory = new MathExamFactory();
        Exam mathExam = mathExamFactory.createExam();
        mathExam.conduct();

        // Step 3: Demonstrate Observer
        Observer student = new Student();
        Observer parent = new Parent();
        ExamResult examResult = new ExamResult();
        examResult.addObserver(student);
        examResult.addObserver(parent);
        examResult.notifyObservers();

        // Step 4: Demonstrate Strategy
        GradingStrategy passFailStrategy = new PassFailGradingStrategy();
        ExamResults examResults = new ExamResults();
        examResults.setGradingStrategy(passFailStrategy);
        examResults.calculateResults();

        // Step 5: Demonstrate Command
        ExamScheduler examScheduler = new ExamScheduler();
        Command scheduleExamCommand = new ScheduleExamCommand(examScheduler);
        scheduleExamCommand.execute();

        // Step 6: Demonstrate Decorator
        Exam baseExam = new ScienceExam();
        Exam decoratedExam = new PerformanceAnalyticsDecorator(new TimedExamDecorator(baseExam));
        decoratedExam.conduct();

        // Step 7: Demonstrate State
//        Exam exam = new Exam();
//        ExamState ongoingState = new OngoingExamState();
//        ExamState completedState = new CompletedExamState();
//        exam.setState(ongoingState);
//        exam.conduct();
//        exam.setState(completedState);
//        exam.conduct();
    }
}

