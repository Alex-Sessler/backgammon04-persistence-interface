package backgammon04.model.dao;

import backgammon04.model.Checker;

public interface CheckerDao {

	public void save(Checker checker);

	public Checker get(long id);

	public void delete(Checker checker);

}
