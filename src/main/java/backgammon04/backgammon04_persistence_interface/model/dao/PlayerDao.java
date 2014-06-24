package backgammon04.backgammon04_persistence_interface.model.dao;

import backgammon04.backgammon04_persistence_interface.model.Game;
import backgammon04.backgammon04_persistence_interface.model.Player;
import backgammon04.backgammon04_persistence_interface.model.User;
import backgammon04.backgammon04_persistence_interface.util.Color;

public interface PlayerDao {

	public void save(Player player);

	public Player get(long id);

	public void delete(Player player);

	public Player get(Game game, Color color);

	public Player get(Game game, User user);
}
