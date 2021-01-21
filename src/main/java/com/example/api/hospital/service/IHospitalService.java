package com.example.api.hospital.service;

import java.util.List;
import java.util.Optional;

import com.example.api.common.pojo.Hospital;
import com.example.api.common.pojo.Patient;

public interface IHospitalService {

	public List<Optional<Patient>> getAllPatient(int hospitalId);

	public List<Hospital> getAllHospital();

	public Optional<Hospital> getHospital(int hospitalId);

	public String deleteHospital(int hospitalId);
	
}