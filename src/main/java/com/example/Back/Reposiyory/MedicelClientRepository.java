package com.example.Back.Reposiyory;

import com.example.Back.Entity.MedicalClient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MedicelClientRepository extends JpaRepository<MedicalClient, Integer> {
    List<MedicalClient> findByName(String name);

}
