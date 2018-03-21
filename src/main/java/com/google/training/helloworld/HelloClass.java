package com.google.training.helloworld;

import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.Named;

public class HelloClass {
    public String message = "Hello World";

    public HelloClass () {}

    public HelloClass (String planet) { this.message = "Greetings, Earth! We come with peace from the planet of " + planet; }

    public String getMessage() {
        return message;
    }
}
