package backgammon04.backgammon04_persistence_interface.model;

import java.util.Date;
import java.util.Set;

import backgammon04.backgammon04_persistence_interface.util.Color;

public interface Game {

	public long getId();

	public void setId(long id);

	public Set<Player> getPlayers();

	public void setPlayers(Set<Player> players);

	public Date getInitialized();

	public void setInitialized(Date initialized);

	public Date getStarted();

	public void setStarted(Date started);

	public Date getEnded();

	public void setEnded(Date ended);

	public Board getBoard();

	public void setBoard(Board board);

	public Set<Movement> getMovementList();

	public void setMovementList(Set<Movement> movementList);

	public Color getColor();

	public void setColor(Color currentPlayer);

}