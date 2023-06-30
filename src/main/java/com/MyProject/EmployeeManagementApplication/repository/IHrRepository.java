package com.MyProject.EmployeeManagementApplication.repository;

import com.MyProject.EmployeeManagementApplication.model.HR;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IHrRepository extends CrudRepository<HR,Integer> {

    @Query(value = "select * from hr" , nativeQuery = true)
    List<HR> findAllHr();
//    @Query(value = "Delete from HR where hr_Name = :hrName",nativeQuery = true)
//    void deleteByHrName(String hrName);
}
