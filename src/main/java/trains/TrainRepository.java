package trains;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TrainRepository {

/*
    private JdbcTemplate jdbcTemplate;


    public TrainRepository(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }


    public long insertAndGetTrain(Train train) {


        KeyHolder holder = new GeneratedKeyHolder();
        jdbcTemplate.update(con -> {
            PreparedStatement ps = con.prepareStatement("insert into trains(destination, departure, max_capacity, number_of_passengers) values(?,?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);
            // ps.setLong(1, train.getId());
            ps.setString(1, train.getDestination());
            ps.setTimestamp(2, Timestamp.valueOf(train.getDeparture()));
            ps.setLong(3, train.getMaxCapacity());
            ps.setLong(4, train.getNumberOfPassengers());
            return ps;
        }, holder);
        return holder.getKey().longValue();


    }

    public Train findById(long id) {

        return jdbcTemplate.queryForObject("select id, destination, departure, max_capacity, number_of_passengers from trains where id=?",
                (rs, rowNum) -> new Train(rs.getLong("id"), rs.getString("destination"),
                        rs.getTimestamp("departure").toLocalDateTime(),
                        rs.getLong("max_capacity"), rs.getLong("number_of_passengers")), id);

    }


    public void updateNumberOfPassengersById(long id, int amount){
        jdbcTemplate.update("update trains set number_of_passengers = number_of_passengers + ? where id = ?", amount, id);
    }


    public List<Train>  getTrainsByDestination(String destination) {
        List<Train> result = new ArrayList<>();


        try (Connection connection = dataSource.getConnection();
             PreparedStatement stmt =
                     connection.prepareStatement("select id, destination, departure, max_capacity, number_of_passengers from trains where destination=? order by departure")
        ) {
            stmt.setString(1, destination );

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Train train =new Train(rs.getLong("id"), rs.getString("destination"),
                            rs.getTimestamp("departure").toLocalDateTime(),
                            rs.getLong("max_capacity"), rs.getLong("number_of_passengers"));
                    result.add(train);
                }
            }
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot query!", sqle);
        }
        return result;
    }




    public long insertTrain(String destination, LocalDateTime departure, int maxCapacity) {
        return insertAndGetTrain(new Train(0, destination, departure, maxCapacity, 0));
    }



 */

}
