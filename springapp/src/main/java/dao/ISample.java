package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import model.Sample;

public interface ISample  extends JpaRepository<Sample,Integer>{

}
