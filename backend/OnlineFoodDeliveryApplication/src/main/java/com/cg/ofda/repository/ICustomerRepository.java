package com.cg.ofda.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cg.ofda.dto.CustomerDto;


@Repository
public interface ICustomerRepository extends JpaRepository<CustomerDto, Long>{

	Optional<CustomerDto> findByEmail(String email);

}
