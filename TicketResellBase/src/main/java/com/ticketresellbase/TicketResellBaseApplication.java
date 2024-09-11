package com.ticketresellbase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TicketResellBaseApplication {

    public static void main(String[] args) {
        ApplicationContext context= SpringApplication.run(TicketResellBaseApplication.class, args);
    }

}
