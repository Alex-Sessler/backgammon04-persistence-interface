package backgammon04.model;

import java.util.Date;

public interface Dice {

	public long getId();

	public void setId(long id);

	public byte getValue();

	public void setValue(byte value);

	public Movement getMovement();

	public void setMovement(Movement movement);

	public boolean isPlayed();

	public void setPlayed(boolean played);

	public Date getPlayTime();

	public void setPlayTime(Date playTime);

}