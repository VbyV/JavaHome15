package ru.netology.javaqa.JavaHome15;

import org.testng.annotations.Test;

public class TicketTest {

    @Test
    public void TestComparable() {
        Ticket ticket1 = new Ticket(11, 18_000, "DME", "LED", 2);
        Ticket ticket2 = new Ticket(13,3_000, "VKO", "GOJ", 2);
        Ticket ticket3 = new Ticket(2,34_000, "DME", "EGO", 5);
        Ticket ticket4 = new Ticket(7, 2_500, "VKO", "AER", 1);
        Ticket ticket5 = new Ticket(1, 50_000, "DME", "EVN", 5);
        Ticket ticket6 = new Ticket(16, 18_000, "VKO", "GGG", 3);

        System.out.println(ticket1.compareTo(ticket2));
        System.out.println(ticket1.compareTo(ticket4));
        System.out.println(ticket5.compareTo(ticket3));
        System.out.println(ticket4.compareTo(ticket1));
        System.out.println(ticket1.compareTo(ticket6));
    }
}
