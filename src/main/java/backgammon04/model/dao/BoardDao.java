package backgammon04.model.dao;

import backgammon04.model.Board;

public interface BoardDao {

	public void save(Board board);

	public Board get(long id);

	public void delete(Board board);
}
