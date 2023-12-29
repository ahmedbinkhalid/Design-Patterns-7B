/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AHMED
 */
public class Examst {
    private ExamState state;

    public void conduct() {
        // Conduct exam logic
        if (state != null) {
            state.handle();
        }
    }

    public void setState(ExamState state) {
        this.state = state;
    }
}
