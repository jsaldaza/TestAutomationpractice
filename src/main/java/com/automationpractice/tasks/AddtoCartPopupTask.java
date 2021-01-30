package com.automationpractice.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;

import static com.automationpractice.userinterfaces.ProductregisterUserinterfaces.*;

public class AddtoCartPopupTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Switch.toFrame(0),
                Click.on(BTN_ADD_TO_CART),
                Switch.toDefaultContext(),
                Click.on(BTN_CONTINUE_SHOPPING));
    }
    public static Performable inPopUp (){return Tasks.instrumented(AddtoCartPopupTask.class);}
}
