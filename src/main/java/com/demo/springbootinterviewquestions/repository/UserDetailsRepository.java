package com.demo.springbootinterviewquestions.repository;

import com.demo.springbootinterviewquestions.dto.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepository extends JpaRepository<UserDetails, Integer> {
}
