package backgammon04.backgammon04_persistence_interface.model;

public interface User {

	public Long getId();

	public void setId(Long id);

	public String getUsername();

	public void setUsername(String username);

	public String getEmail();

	public void setEmail(String email);

	public String getPassword();

	public void setPassword(String password);
}
