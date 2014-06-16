package de.htwg.backgammon04.model.dao;

import de.htwg.backgammon04.model.Dice;

public interface DiceDao {
	public void save(Dice dice);

	public Dice get(long id);

	public void delete(Dice dice);
}
