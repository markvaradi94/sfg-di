package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setup() {
        controller = new PropertyInjectedController();
        controller.greetingServiceImpl = new ConstructorGreetingService();
    }

    @Test
    void getGreeting() {
        assertThat(controller.sayHello()).isEqualTo("Hello World");
    }
}