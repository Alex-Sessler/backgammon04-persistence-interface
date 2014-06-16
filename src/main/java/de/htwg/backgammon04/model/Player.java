package de.htwg.backgammon04.model;

import de.htwg.backgammon04.util.Color;

public interface Player {

	public long getId();

	public void setId(long id);

	public User getUser();

	public void setUser(User user);

	public Game getGame();

	public void setGame(Game game);

	public Color getColor();

	public void setColor(Color color);
}
