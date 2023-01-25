package controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import dao.IDonor;
import dao.ISample;
import dao.IUser;
import model.Donor;
import model.Sample;
import model.User;

@RestController
public class UserController {

	@Autowired
	IUser user;
	@Autowired
	IDonor donor;
	@Autowired
	ISample sample;
	
	@PostMapping("/login")
	public String adminLogin(@RequestBody  User u) {
		if(user.findByEmail(u.getEmail()) != null) {
		if(user.findByPassword(u.getPassword())!=null) {
			return "true";
		}
		else {
			return "false";
		}
		}
		else {
			return "true";
		}
	}

	@PostMapping("/signup")
	public String signup(@RequestBody User u){
		user.save(u);
		return "true";
	}
	
	@GetMapping("/donor")
	public List<Donor> getAllDonor(){
		return donor.findAll();
	}
	
	@GetMapping("/sample")
	public List<Sample> getAllSample(){
		return sample.findAll();
	}
	
	@GetMapping("/donor/{did}")
	public Donor getAllDonorById(@PathVariable("did") int did) {	
		Donor s1;
		s1=donor.findDonorByID(did);
		return s1;
	}	
	@GetMapping("/sample/{sid}")
	public String getAllSampleById(@PathVariable("sid") int sid) {	
		return sample.findById(sid).get().getBloodGroup();
	} 
}
