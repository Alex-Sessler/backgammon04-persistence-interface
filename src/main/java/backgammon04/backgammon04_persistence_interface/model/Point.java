package backgammon04.backgammon04_persistence_interface.model;

import java.util.Set;

public interface Point {

	public long getId();

	public void setId(long id);

	public byte getInternId();

	public void setInternId(byte internId);

	public Board getBoard();

	public void setBoard(Board board);

	public Set<Checker> getCheckerList();

	public void setCheckerList(Set<Checker> checkerList);

}