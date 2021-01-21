package com.example.api.hospital.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.api.common.pojo.Hospital;

public interface HospitalRepo extends JpaRepository<Hospital, Integer>{

}