package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import model.Donor;
import model.Sample;

public interface ISample  extends JpaRepository<Sample,Integer>{

	@Query(value = "SELECT * FROM sample WHERE sgroup = ?", nativeQuery = true)
    public Sample findBySampleGroup(String sample);
	
	 @Query(value = "SELECT * FROM donor WHERE dgroup = ?", nativeQuery = true)
	    public Donor findByDonorGroup(String group);
}
