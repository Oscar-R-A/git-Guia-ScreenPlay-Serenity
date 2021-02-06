package co.com.choucair.certification.proyectobase.questions;

import co.com.choucair.certification.proyectobase.tasks.LastStep;
import co.com.choucair.certification.proyectobase.userinterface.UTestSingUp4;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question <Boolean> {
    private String question;

    public Answer(String question) {
        this.question = question;
    }
    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String login = Text.of(UTestSingUp4.VALIDATE_LOGIN).viewedBy(actor).asString();
        if (question.equals(login)){
            result = true;
        }else {
            result = false;
        }
        return result;

    }
}