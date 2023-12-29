/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AHMED
 */
public class SubmitAnswersCommand implements Command {
    private final AnswerSubmitter answerSubmitter;

    public SubmitAnswersCommand(AnswerSubmitter answerSubmitter) {
        this.answerSubmitter = answerSubmitter;
    }

    @Override
    public void execute() {
        answerSubmitter.execute();
    }
}
