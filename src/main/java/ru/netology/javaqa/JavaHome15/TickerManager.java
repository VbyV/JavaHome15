package ru.netology.javaqa.JavaHome15;

public class TickerManager {
    protected TicketRepository repository;

    public TickerManager(TicketRepository repository) {
        this.repository = repository;
    }

    public void add(Ticket ticket) {
        repository.save(ticket);
    }

    public Ticket[] getTickets() {
        return repository.getTickets();
    }

    public Ticket[] findAll(String from, String to) {
        Ticket[] result = new Ticket[0];
        for (Ticket ticket : repository.getTickets()) {
            if (matches(ticket, from, to)) {
                Ticket[] tmp = new Ticket[result.length + 1];
                for (int i = 0; i < result.length; i++) {
                    tmp[i] = result[i];
                }
                tmp[tmp.length - 1] = ticket;
                result = tmp;
            }
        }
        return result;
    }

    public boolean matches(Ticket ticket, String airFrom, String airTo) {
        if (ticket.getAirFrom().contains(airFrom) && ticket.getAirTo().contains(airTo)) {
            return true;
        } else {
            return false;
        }
    }
}
