package backgammon04.model.dao;

import java.util.List;

import backgammon04.model.Game;
import backgammon04.model.Movement;
import backgammon04.model.Player;

public interface MovementDao {

	public void save(Movement movement);

	public Movement get(long id);

	public void delete(Movement movement);

	public Movement get(Game game, Player player);

	public Movement getLast(Game game);

	public List<Movement> getLast(Game game, int lastSize);
}
