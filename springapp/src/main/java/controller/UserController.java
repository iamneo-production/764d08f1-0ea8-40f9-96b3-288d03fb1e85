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
//import service.UserService;

@RestController
public class UserController {

	@Autowired
	IUser user;
	@Autowired
	IDonor donor;
	@Autowired
	ISample sample;
//	@Autowired
//	UserService userService;
	
//	@PostMapping("/login")
//	public User adminLogin(@RequestBody  User u) {
//		user.findById(u.getUid());
//	}
	
//	@PostMapping("/login")
//	public boolean login(@RequestBody User u) {
//		user.findById(u.getEmail());
//	}

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
	
	@GetMapping("/donor/{group}")
	public Donor getAllDonorByGroup(@PathVariable("group") String group) {
		Donor g=donor.findByDonorGroup(group);
		return g;
	}

	@GetMapping("/sample/{group}")
	public Sample getAllSampleByGroup(@PathVariable("group") String group) {
		Sample s=sample.findBySampleGroup(group);
		return s;
	}

//	@GetMapping("/donor/{did}")
//	public Optional<Donor> getAllDonorById(@PathVariable("did") int did) {	
//		return donor.findById(did);
//	}	
//	@GetMapping("/sample/{sid}")
//	public String getAllSampleById(@PathVariable("sid") int sid) {	
//		return sample.findById(sid).get().getSgroup();
//	}

}
