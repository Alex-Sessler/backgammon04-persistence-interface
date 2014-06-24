package backgammon04.backgammon04_persistence_interface.model.dao;

import java.util.List;

import backgammon04.backgammon04_persistence_interface.model.Game;
import backgammon04.backgammon04_persistence_interface.model.User;

public interface GameDao {

	public void save(Game game);

	public Game get(long id);

	public void delete(Game game);

	public List<Game> getOpenGames();

	public List<Game> getOpenGames(User user);

	public List<Game> getMyGames(User user);
}
