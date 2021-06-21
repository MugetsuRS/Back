package com.example.Back.Service;

import com.example.Back.Entity.MedicalClient;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public interface MedicalCleintService {
    Optional<MedicalClient> save(final MedicalClient medicalClient);

    @Transactional
    void update(final MedicalClient medicalClient);

    List<MedicalClient> getallpatients();

    Optional<MedicalClient> findbyid(Integer id);

    void deletepatientbyid(Integer id);

    List<MedicalClient> findbyname(String name);

}
