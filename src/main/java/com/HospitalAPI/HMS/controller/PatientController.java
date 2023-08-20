package com.HospitalAPI.HMS.controller;

import com.HospitalAPI.HMS.model.Patient;
import com.HospitalAPI.HMS.repository.PatientRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
// allows the class to handle the requests made by the client.

@RequestMapping("/api/v1/hospital")
// used to map web requests onto specific handler classes and/or handler methods
public class PatientController {

    PatientRepository patientRepository;

    @PostMapping("/add")
    public ResponseEntity<Object> addPatient(@RequestBody Patient patient){
        patientRepository.save(patient);
        return ResponseEntity.ok("Successfully added patient");
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Object> deletePatient(@PathVariable Long id){
        patientRepository.deleteById(id);
        return ResponseEntity.ok("Successfully deleted patient");
    }

    @PutMapping("/update")
    public ResponseEntity<Object> updatePatient(@PathVariable Long id){

        return null;
    }
}
