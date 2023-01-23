package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import model.Donor;

public interface IDonor extends JpaRepository<Donor,Integer>{
	@Query(value = "SELECT * FROM donor WHERE bloodGroup = ?", nativeQuery = true)
	public Donor findByDonorGroup(String bloodGroup);
}

