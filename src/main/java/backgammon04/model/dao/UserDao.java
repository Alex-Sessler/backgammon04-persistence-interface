package backgammon04.model.dao;

import backgammon04.model.User;

public interface UserDao {
	public void save(User user);

	public User get(long id);

	public User getUser(String username);

	public User getByEmail(String email);

	public void delete(User user);
}
