package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import model.Sample;

public interface ISample  extends JpaRepository<Sample,Integer>{

	@Query(value = "SELECT * FROM sample WHERE blood_group = ?", nativeQuery = true)
    public Sample findBySampleGroup(String sample);
	
	 @Query(value = "SELECT * FROM sample WHERE bloodbankid = ?", nativeQuery = true)
	    public Sample findSampleByID(int did);
}
