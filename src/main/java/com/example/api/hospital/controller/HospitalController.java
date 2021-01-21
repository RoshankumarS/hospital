package com.example.api.hospital.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.common.pojo.Hospital;
import com.example.api.common.pojo.Patient;
import com.example.api.hospital.service.IHospitalService;

@RestController
@RequestMapping("/hospital")
public class HospitalController {
	
	@Autowired
	private IHospitalService hospitalServices;
	
	@GetMapping(value = "/getAllPatient/{hospitalId}", produces="application/json")
	public List<Optional<Patient>> getAllPatient(@PathVariable("hospitalId") int hospitalId) {
		return hospitalServices.getAllPatient(hospitalId);
	}
	
	@GetMapping(value = "/getAllHospital", produces="application/json")
	public List<Hospital> getAllHospital(){
		return hospitalServices.getAllHospital();
	}
	
	@GetMapping(value = "/getHospital/{hospitalId}", produces="application/json")
	public Optional<Hospital> getHospital(@PathVariable("hospitalId") int hospitalId){
		return hospitalServices.getHospital(hospitalId);
	}
	
	@PostMapping(value = "/deleteHospital/{hospitalId}")
	public String deleteHospital(@PathVariable("hospitalId") int hospitalId) {
		return hospitalServices.deleteHospital(hospitalId);
	}

}