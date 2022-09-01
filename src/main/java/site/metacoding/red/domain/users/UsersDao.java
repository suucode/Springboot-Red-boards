package site.metacoding.red.domain.users;

import java.util.List;

public interface UsersDao {
	public void insert(Users user);
	public Users findById(Integer id);
	public List<Users> findAll();
	public void deletById(Integer id);
	public void update(Users users);
}
