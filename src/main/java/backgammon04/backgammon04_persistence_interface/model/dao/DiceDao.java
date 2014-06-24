package backgammon04.backgammon04_persistence_interface.model.dao;

import backgammon04.backgammon04_persistence_interface.model.Dice;

public interface DiceDao {
	public void save(Dice dice);

	public Dice get(long id);

	public void delete(Dice dice);
}
