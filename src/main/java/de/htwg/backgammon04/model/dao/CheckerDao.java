package de.htwg.backgammon04.model.dao;

import de.htwg.backgammon04.model.Checker;

public interface CheckerDao {

	public void save(Checker checker);

	public Checker get(long id);

	public void delete(Checker checker);

}
