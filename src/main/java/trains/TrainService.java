package trains;

import java.util.List;

public class TrainService {

    /*
    private TrainRepository trainRepository;

    public TrainService(TrainRepository trp) {
        this.trainRepository = trp;
    }


    public Train buyTicketForTrain(String destination, int amount) {
        List<Train> trains = trainRepository.getTrainsByDestination(destination);
        for (Train t : trains) {
            if ((t.getMaxCapacity() - t.getNumberOfPassengers()) >= amount) {
                trainRepository.updateNumberOfPassengersById(t.getId(), amount);
                return t;
            }
        }
        throw new IllegalStateException("Cannot buy ticket for train " + destination);
    }


     */
}
