package trains;

import java.time.LocalDateTime;

public class Train {

    private long id;
    private String destination;
    private LocalDateTime departure;
    private long maxCapacity;
    private long numberOfPassengers;

    public Train(long id, String destination, LocalDateTime departure, long maxCapacity, long numberOfPassengers) {
        this.id = id;
        this.destination = destination;
        this.departure = departure;
        this.maxCapacity = maxCapacity;
        this.numberOfPassengers = numberOfPassengers;
    }

    public long getId() {
        return id;
    }

    public String getDestination() {
        return destination;
    }

    public LocalDateTime getDeparture() {
        return departure;
    }

    public long getMaxCapacity() {
        return maxCapacity;
    }

    public long getNumberOfPassengers() {
        return numberOfPassengers;
    }
}
