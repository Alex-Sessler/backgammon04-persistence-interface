package backgammon04.backgammon04_persistence_interface.model.dao;

import backgammon04.backgammon04_persistence_interface.model.Board;
import backgammon04.backgammon04_persistence_interface.model.Point;

public interface PointDao {

	public void save(Point point);

	public Point get(long id);

	public void delete(Point point);

	public Point get(Board board, byte internId);
}
