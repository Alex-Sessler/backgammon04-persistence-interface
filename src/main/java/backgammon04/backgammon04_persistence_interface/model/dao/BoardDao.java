package backgammon04.backgammon04_persistence_interface.model.dao;

import backgammon04.backgammon04_persistence_interface.model.Board;

public interface BoardDao {

	public void save(Board board);

	public Board get(long id);

	public void delete(Board board);
}
