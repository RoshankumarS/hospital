package com.example.api.hospital.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api.common.dao.PatientRepo;
import com.example.api.common.pojo.Hospital;
import com.example.api.common.pojo.Patient;
import com.example.api.hospital.dao.HospitalRepo;
import com.example.api.hospital.service.IHospitalService;

@Service
public class HospitalServiceImpl implements IHospitalService {

	@Autowired
	private PatientRepo patientRepo;
	
	@Autowired
	private HospitalRepo hospitalRepo;
	
	@Override
	public List<Optional<Patient>> getAllPatient(int hospitalId) {
		return patientRepo.findAllByHospital_id(hospitalId);
	}

	@Override
	public List<Hospital> getAllHospital() {
		return hospitalRepo.findAll();
	}

	@Override
	public Optional<Hospital> getHospital(int hospitalId) {
		return hospitalRepo.findById(hospitalId);
	}

	@Override
	public String deleteHospital(int hospitalId) {
		hospitalRepo.deleteById(hospitalId);
		return "Deleted";
	}
	
}
