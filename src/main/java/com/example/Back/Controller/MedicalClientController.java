package com.example.Back.Controller;
import com.example.Back.Entity.MedicalClient;
import com.example.Back.Service.MedicalCleintService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RequiredArgsConstructor
@RestController
@CrossOrigin("*")
@RequestMapping("/patient")
public class MedicalClientController {
    private final MedicalCleintService medicalCleintService;

    @GetMapping("/all")
    public ResponseEntity<List<MedicalClient>> getMedicalClients(){
        final List<MedicalClient> medicalClients = medicalCleintService.getallpatients();
        return ResponseEntity.ok(medicalClients);
    }

    @GetMapping("/{medicalcleintid}")
    public ResponseEntity<MedicalClient> getbyid(@PathVariable Integer medicalcleintid){
        final MedicalClient medicalClient = medicalCleintService.findbyid(medicalcleintid)
                .orElseThrow(() -> new IllegalStateException("Hotel with id: " + medicalcleintid + " not found"));
        return ResponseEntity.ok(medicalClient);
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<List<MedicalClient>> getbyname(@PathVariable String name){
        final List<MedicalClient> medicalClients = medicalCleintService.findbyname(name);
        return ResponseEntity.ok(medicalClients);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create (@RequestBody @Valid final MedicalClient medicalClient){
        medicalCleintService.save(medicalClient);
    }

    @DeleteMapping("/delete")
    @ResponseStatus(HttpStatus.OK)
    public void deletepatient(@RequestParam final Integer patientid){
        medicalCleintService.deletepatientbyid(patientid);
    }


}
