package backgammon04.backgammon04_persistence_interface.model.dao;

import java.util.List;

import backgammon04.backgammon04_persistence_interface.model.Game;
import backgammon04.backgammon04_persistence_interface.model.Movement;
import backgammon04.backgammon04_persistence_interface.model.Player;

public interface MovementDao {

	public void save(Movement movement);

	public Movement get(long id);

	public void delete(Movement movement);

	public Movement get(Game game, Player player);

	public Movement getLast(Game game);

	public List<Movement> getLast(Game game, int lastSize);
}
