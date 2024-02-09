import org.example.AviaSouls;
import org.example.Ticket;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class AviaSoulsTest {
    AviaSouls manager = new AviaSouls();

    @Test
    public void shouldCompareTicketPrices() {

        Ticket ticket1 = new Ticket("Los Angeles", "New York", 15_000, 12_00, 18_00);
        Ticket ticket2 = new Ticket("New York", "New Hampshire", 7_000, 17_00, 18_30);

        System.out.println(ticket1.compareTo(ticket2));
    }


    @Test
    public void shouldOrganiseTicketsByPrice() {

        Ticket ticket1 = new Ticket("Los Angeles", "New York", 15_000, 12, 18);
        Ticket ticket2 = new Ticket("New York", "London", 40_000, 8, 17);
        Ticket ticket3 = new Ticket("New York", "London", 45_000, 10, 14);
        Ticket ticket4 = new Ticket("London", "Berlin", 20_000, 17, 19);
        Ticket ticket5 = new Ticket("New York", "London", 43_000, 11, 19);
        Ticket ticket6 = new Ticket("New York", "London", 41_000, 6, 15);
        Ticket ticket7 = new Ticket("New York", "New Hampshire", 7_000, 17, 18);
        Ticket ticket8 = new Ticket("New York", "London", 48_000, 11, 18);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Ticket[] actual = manager.search("London", "Berlin");
        Ticket[] expected = {ticket4};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldOrganiseTicketsByPrice2Test() {

        Ticket ticket1 = new Ticket("Los Angeles", "New York", 15_000, 12, 18);
        Ticket ticket2 = new Ticket("New York", "London", 40_000, 8, 17);
        Ticket ticket3 = new Ticket("New York", "London", 45_000, 10, 14);
        Ticket ticket4 = new Ticket("London", "Berlin", 20_000, 17, 19);
        Ticket ticket5 = new Ticket("New York", "London", 43_000, 11, 19);
        Ticket ticket6 = new Ticket("New York", "London", 41_000, 6, 15);
        Ticket ticket7 = new Ticket("New York", "New Hampshire", 7_000, 17, 18);
        Ticket ticket8 = new Ticket("New York", "London", 48_000, 11, 18);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Ticket[] actual = manager.search("New York", "London");
        Ticket[] expected = {ticket2, ticket6, ticket5, ticket3, ticket8};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldOrganiseTicketsByPrice3Test() {

        Ticket ticket1 = new Ticket("Los Angeles", "New York", 15_000, 12, 18);
        Ticket ticket2 = new Ticket("New York", "London", 40_000, 8, 17);
        Ticket ticket3 = new Ticket("New York", "London", 45_000, 10, 14);
        Ticket ticket4 = new Ticket("London", "Berlin", 20_000, 17, 19);
        Ticket ticket5 = new Ticket("New York", "London", 43_000, 11, 19);
        Ticket ticket6 = new Ticket("New York", "London", 41_000, 6, 15);
        Ticket ticket7 = new Ticket("New York", "New Hampshire", 7_000, 17, 18);
        Ticket ticket8 = new Ticket("New York", "London", 48_000, 11, 18);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Ticket[] actual = manager.search("London", "Paris");
        Ticket[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldComparePricesBasedOnFlightTime() {

        Ticket ticket1 = new Ticket("Los Angeles", "New York", 15_000, 12, 18);
        Ticket ticket2 = new Ticket("New York", "London", 40_000, 8, 17);
        Ticket ticket3 = new Ticket("New York", "London", 45_000, 8, 14);
        Ticket ticket4 = new Ticket("London", "Berlin", 20_000, 17, 19);
        Ticket ticket5 = new Ticket("New York", "London", 43_000, 11, 19);
        Ticket ticket6 = new Ticket("New York", "London", 41_000, 6, 15);
        Ticket ticket7 = new Ticket("New York", "New Hampshire", 7_000, 17, 18);
        Ticket ticket8 = new Ticket("New York", "London", 48_000, 11, 18);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Ticket[] actual = manager.search("New York", "London");
        Ticket[] expected = {ticket3, ticket8, ticket5, ticket2, ticket6};
    }

    @Test
    public void shouldComparePricesBasedOnFlightTime2Test() {

        Ticket ticket1 = new Ticket("Los Angeles", "New York", 15_000, 12, 18);
        Ticket ticket2 = new Ticket("New York", "London", 40_000, 8, 17);
        Ticket ticket3 = new Ticket("New York", "London", 45_000, 8, 14);
        Ticket ticket4 = new Ticket("London", "Berlin", 20_000, 17, 19);
        Ticket ticket5 = new Ticket("New York", "London", 43_000, 11, 19);
        Ticket ticket6 = new Ticket("New York", "London", 41_000, 6, 15);
        Ticket ticket7 = new Ticket("New York", "New Hampshire", 7_000, 17, 18);
        Ticket ticket8 = new Ticket("New York", "London", 48_000, 11, 18);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Ticket[] actual = manager.search("New York", "New Hampshire");
        Ticket[] expected = {ticket7};
    }

    @Test
    public void shouldComparePricesBasedOnFlightTime3Test() {

        Ticket ticket1 = new Ticket("Los Angeles", "New York", 15_000, 12, 18);
        Ticket ticket2 = new Ticket("New York", "London", 40_000, 8, 17);
        Ticket ticket3 = new Ticket("New York", "London", 45_000, 8, 14);
        Ticket ticket4 = new Ticket("London", "Berlin", 20_000, 17, 19);
        Ticket ticket5 = new Ticket("New York", "London", 43_000, 11, 19);
        Ticket ticket6 = new Ticket("New York", "London", 41_000, 6, 15);
        Ticket ticket7 = new Ticket("New York", "New Hampshire", 7_000, 17, 18);
        Ticket ticket8 = new Ticket("New York", "London", 48_000, 11, 18);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Ticket[] actual = manager.search("New York", "Berlin");
        Ticket[] expected = {};
    }
}
