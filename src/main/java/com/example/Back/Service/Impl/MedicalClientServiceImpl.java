package com.example.Back.Service.Impl;
import com.example.Back.Entity.MedicalClient;
import com.example.Back.Reposiyory.MedicelClientRepository;
import com.example.Back.Service.MedicalCleintService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class MedicalClientServiceImpl implements MedicalCleintService {

    private MedicelClientRepository medicelClientRepository;

    public Optional<MedicalClient> save(final MedicalClient medicalClient) {
        return Optional.of(medicelClientRepository.save(medicalClient));
    }

    //args - object with id field
    @Transactional
    public void update(final MedicalClient medicalClient) {
        medicelClientRepository.save(medicalClient);
    }

    public List<MedicalClient> getallpatients() {
        final List<MedicalClient> medicalClients = medicelClientRepository.findAll();

        return medicalClients;
    }

        public Optional<MedicalClient> findbyid(Integer id) {
        return medicelClientRepository.findById(id);
    }

    public void deletepatientbyid(Integer id) {
        medicelClientRepository.deleteById(id);
    }

    public List<MedicalClient> findbyname(String name) {
        final List<MedicalClient> patients = medicelClientRepository.findByName(name);
        return patients;
    }

    //    @Override
//    @Transactional
//    public Optional<MedicalClient> deleteoptional (Integer id){
//        final Optional<MedicalClient> patient = medicelClientRepository.findById(id);
//        return Optional.of(medicelClientRepository.delete(patient));
//    }

    //    public void editpatient (Integer id,String name, String surrname, String dayofbirth, String country, String state, String address, String sex){
//        final MedicalClient client = medicelClientRepository.getById(id);
//        client.setName(name);
//        client.setAddress(address);
//        client.setCountry(country);
//        client.setDayofbirth(dayofbirth);
//        client.setState(state);
//        client.setSurrname(surrname);
//        client.setSex(sex);
//    }

    //    public Integer savepatient (String name, String surrname, String dayofbirth, String country, String state, String address, String sex, List<Comment> comments){
//        MedicalClient medicalClient = new MedicalClient(name, surrname, dayofbirth, country, state, address,sex, comments);
//
//        return medicelClientRepository.save(medicalClient).getId();
//    }

//    public Integer savecomment (Integer id, List<Comment> comments){
//        final MedicalClient client = medicelClientRepository.getById(id);
//        client.setComments(comments);
//        return medicelClientRepository.save(client).getId();
//    }
}
