package ru.netology.javaqa.JavaHome15;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class TickerManagerTest {
    TicketRepository repository = new TicketRepository();
    TickerManager manager = new TickerManager(repository);

    Ticket ticket1 = new Ticket(11, 18_000, "DME", "LED", 2);
    Ticket ticket2 = new Ticket(13, 3_000, "VKO", "GOJ", 2);
    Ticket ticket3 = new Ticket(2, 34_000, "DME", "EGO", 5);
    Ticket ticket4 = new Ticket(7, 2_500, "VKO", "AER", 1);
    Ticket ticket5 = new Ticket(1, 50_000, "DME", "EVN", 5);
    Ticket ticket6 = new Ticket(4, 14_000, "DME", "LED", 2);
    Ticket ticket7 = new Ticket(9, 12_000, "DME", "LED", 2);

    @Test
    public void AddAllTickets() {
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);

        Ticket[] exppected = {ticket1, ticket2, ticket3, ticket4, ticket5};
        Ticket[] actual = manager.getTickets();

        Assertions.assertArrayEquals(exppected, actual);
    }

    @Test
    public void FindTicket() {
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);

        Ticket[] ecpected = {ticket3};
        Ticket[] actual = manager.findAll("DME", "EGO");

        Assertions.assertArrayEquals(ecpected, actual);
    }

    @Test
    public void FindAllTicketsWhihsSameAir() {
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Ticket[] expected = {ticket1, ticket6, ticket7};
        Ticket[] actual = manager.findAll("DME", "LED");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShoulNotFindTickets() {
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Ticket[] expected = {};
        Ticket[] actual = manager.findAll("PPP", "PPP");

        Assertions.assertArrayEquals(expected, actual);

    }
}

