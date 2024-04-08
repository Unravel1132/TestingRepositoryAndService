package com.MyJUnitTesting.UnitTesting.Service;

import com.MyJUnitTesting.UnitTesting.Entity.DeveloperEntity;

import java.util.List;

public interface DeveloperService {

    DeveloperEntity saveDeveloper(DeveloperEntity developerEntity);

    DeveloperEntity update(DeveloperEntity developerEntity);

    DeveloperEntity getDeveloperById(Integer id);

    DeveloperEntity getByEmail(String email);

    List<DeveloperEntity> getAllDeveloper();

    List<DeveloperEntity> getAllActiveBySpeacality(String speciality);

    void softDeleteById(Integer id);

    void hardDeleteById(Integer id);

}
