package backgammon04.backgammon04_persistence_interface.model.dao;

import backgammon04.backgammon04_persistence_interface.model.Checker;

public interface CheckerDao {

	public void save(Checker checker);

	public Checker get(long id);

	public void delete(Checker checker);

}
