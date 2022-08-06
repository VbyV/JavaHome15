package ru.netology.javaqa.JavaHome15;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TicketRepositoryTest {
    Ticket ticket1 = new Ticket(11, 18_000, "DME", "LED", 2);
    Ticket ticket2 = new Ticket(13,3_000, "VKO", "GOJ", 2);
    Ticket ticket3 = new Ticket(2,34_000, "DME", "EGO", 5);
    Ticket ticket4 = new Ticket(7, 2_500, "VKO", "AER", 1);
    Ticket ticket5 = new Ticket(1, 50_000, "DME", "EVN", 5);

    @Test
    public void SaveAll() {
    TicketRepository repository = new TicketRepository();
    repository.save(ticket1);
    repository.save(ticket2);
    repository.save(ticket3);
    repository.save(ticket4);
    repository.save(ticket5);

    Ticket[] expected = {ticket1, ticket2, ticket3, ticket4, ticket5};
    Ticket[] actual = repository.getTickets();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void RemoveById() {
        TicketRepository repository = new TicketRepository();
        repository.save(ticket1);
        repository.save(ticket2);
        repository.save(ticket3);
        repository.removeById(ticket2.getId());

        Ticket[] expected = {ticket1, ticket3};
        Ticket[] actual = repository.getTickets();

        Assertions.assertArrayEquals(expected, actual);
    }

}
