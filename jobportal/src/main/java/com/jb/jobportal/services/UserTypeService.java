package com.jb.jobportal.services;

import com.jb.jobportal.entity.UserType;
import com.jb.jobportal.repository.UserTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserTypeService {
    private  final UserTypeRepository userTypeRepository;
   @Autowired
    public UserTypeService(UserTypeRepository userTypeRepository){
        this.userTypeRepository =userTypeRepository;
    }
    public List<UserType> getAll(){
        return userTypeRepository.findAll();
    }
}
