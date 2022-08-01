package com.neoquant.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neoquant.student.model.StudentAddress;

public interface AddressRepository extends JpaRepository<StudentAddress, Integer> {

}
