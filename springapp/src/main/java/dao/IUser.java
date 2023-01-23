package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import model.User;

public interface IUser extends JpaRepository<User,Integer>{

	 @Query(value = "SELECT uname FROM user WHERE uname=?", nativeQuery = true)
	  public User findByUname(String uname);

	 @Query(value = "SELECT upassword FROM user WHERE upassword=?", nativeQuery = true)
	  public User findByUpassword(String upassword);
	
}
