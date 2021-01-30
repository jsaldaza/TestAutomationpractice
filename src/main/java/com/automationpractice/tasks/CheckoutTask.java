package com.automationpractice.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class CheckoutTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo();
    }
    public static Performable inCheckout(){return Tasks.instrumented(CheckoutTask.class);
    }
}
