package de.htwg.backgammon04.model.dao;

import de.htwg.backgammon04.model.Board;
import de.htwg.backgammon04.model.Point;

public interface PointDao {

	public void save(Point point);

	public Point get(long id);

	public void delete(Point point);

	public Point get(Board board, byte internId);
}
