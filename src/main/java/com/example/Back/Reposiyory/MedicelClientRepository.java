package com.example.Back.Reposiyory;

import com.example.Back.Entity.MedicalClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MedicelClientRepository extends JpaRepository<MedicalClient, Integer> {
    List<MedicalClient> findByName(String name);

}
