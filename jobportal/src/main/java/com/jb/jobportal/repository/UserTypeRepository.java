package com.jb.jobportal.repository;

import com.jb.jobportal.entity.UserType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserTypeRepository extends JpaRepository<UserType,Integer> {
}
