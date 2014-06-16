package de.htwg.backgammon04.model.dao;

import de.htwg.backgammon04.model.Game;
import de.htwg.backgammon04.model.Player;
import de.htwg.backgammon04.model.User;
import de.htwg.backgammon04.util.Color;

public interface PlayerDao {

	public void save(Player player);

	public Player get(long id);

	public void delete(Player player);

	public Player get(Game game, Color color);

	public Player get(Game game, User user);
}
