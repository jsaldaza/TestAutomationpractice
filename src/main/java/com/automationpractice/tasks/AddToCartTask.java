package com.automationpractice.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;

import static com.automationpractice.userinterfaces.ProductregisterUserinterfaces.*;

public class AddToCartTask implements Task {
    public static Performable inAddCart() {
        return Tasks.instrumented(AddToCartTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MoveMouse.to(MOUSE_BLOUSE),
                Click.on(ADD_TO_CART));
    }
}
