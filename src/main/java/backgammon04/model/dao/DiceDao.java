package backgammon04.model.dao;

import backgammon04.model.Dice;

public interface DiceDao {
	public void save(Dice dice);

	public Dice get(long id);

	public void delete(Dice dice);
}
