package com.HospitalAPI.HMS.controller;

import com.HospitalAPI.HMS.model.Patient;
import com.HospitalAPI.HMS.repository.PatientRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
