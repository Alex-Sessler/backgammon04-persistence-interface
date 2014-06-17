package backgammon04.model;

import java.util.Date;
import java.util.Set;

public interface Movement {

	public long getId();

	public void setId(long id);

	public Date getCreated();

	public void setCreated(Date created);

	public Player getPlayer();

	public void setPlayer(Player player);

	public Checker getChecker();

	public void setChecker(Checker checker);

	public Point getTargetPoint();

	public void setTargetPoint(Point targetPoint);

	public Set<Dice> getDices();

	public void setDices(Set<Dice> dices);

	public Game getGame();

	public void setGame(Game game);

}