package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dao.IDonor;
import dao.ISample;
import model.Donor;
import model.Sample;

@RestController
@RequestMapping("admin")
public class AdminController { 

	@Autowired
	IDonor donor;
	@Autowired
	ISample sample;
	
	@GetMapping("/donor")
	public List<Donor> getAllDonor(){
		return donor.findAll();
	}

	@GetMapping("/sample")
	public List<Sample> getAllSample(){
		return sample.findAll();
	}
	
	@PostMapping("/addSample")
	public String addSample(@RequestBody Sample s) {
		sample.save(s);
		return "Sample added";		
	}
	@DeleteMapping("/sample/{sid}")
	public String deleteMovie(@PathVariable("sid") int sid) {
		sample.deleteById(sid);
		return "Sample deleted";
	}
	
	@PutMapping("/sample/{sid}")
	public String updateSample(@RequestBody Sample s) {
		sample.findById(s.getBloodBankID()).map( update ->{
			update.setBloodBankID(s.getBloodBankID());
			update.setBloodGroup(s.getBloodGroup());
			update.setBloodPressure(s.getBloodPressure());
			update.setPhlevel(s.getPhlevel());
			update.setActive(s.isActive());
			return sample.save(update);
		});
		return "Sample Updated";
	}
	
	@PutMapping("/donor/{id}")
	public String updateDonor(@RequestBody Donor d) {
		donor.findById(d.getId()).map( update ->{
			update.setId(d.getId());
			update.setDonorEmail(d.getDonorEmail());
			update.setBloodGroup(d.getBloodGroup());
			update.setBloodPressure(d.getBloodPressure());
			update.setPhLevel(d.getPhLevel());
			update.setActive(d.isActive());
			return donor.save(update);
		});
		return "Donor Updated";
	}
	
	@DeleteMapping("/donor/{id}")
	public String deleteDonor(@PathVariable("id") int id) {
		donor.deleteById(id);
		return "Donor Removed";
	}
}
