package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import model.User;

public interface IUser extends JpaRepository<User,Integer>{

	 @Query(value = "SELECT*FROM user WHERE email=?", nativeQuery = true)
	  public User findByEmail(String email);

	 @Query(value = "SELECT*FROM user WHERE password=?", nativeQuery = true)
	  public User findByPassword(String password);
	
}
