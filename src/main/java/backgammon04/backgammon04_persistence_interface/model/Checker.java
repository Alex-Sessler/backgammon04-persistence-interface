package backgammon04.backgammon04_persistence_interface.model;

public interface Checker {
	public long getId();

	public void setId(long id);

	public byte getInternId();

	public void setInternId(byte internId);

	public Player getPlayer();

	public void setPlayer(Player player);

	public Point getPoint();

	public void setPoint(Point point);
}
