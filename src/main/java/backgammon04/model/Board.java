package backgammon04.model;

import java.util.Set;

public interface Board {

	public long getId();

	public void setId(long id);

	public Game getGame();

	public void setGame(Game game);

	public Set<Point> getPointList();

	public void setPointList(Set<Point> pointList);

}