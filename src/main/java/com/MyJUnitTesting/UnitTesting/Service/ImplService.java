package com.MyJUnitTesting.UnitTesting.Service;


import com.MyJUnitTesting.UnitTesting.Entity.DeveloperEntity;
import com.MyJUnitTesting.UnitTesting.Entity.Status;
import com.MyJUnitTesting.UnitTesting.Expection.DeveloperNotFound;
import com.MyJUnitTesting.UnitTesting.Expection.DeveloperWithDublicateException;
import com.MyJUnitTesting.UnitTesting.Repository.DeveloperRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ImplService implements DeveloperService {

    private final DeveloperRepository developerRepository;


    @Override
    public DeveloperEntity saveDeveloper(DeveloperEntity developerEntity) {

        DeveloperEntity duplicateCandidate = developerRepository.findByEmail(developerEntity.getEmail());

        if (Objects.nonNull(duplicateCandidate)) {

            throw new DeveloperWithDublicateException("Developer is already exists");
        }

        return developerRepository.save(developerEntity);
    }

    @Override
    public DeveloperEntity update(DeveloperEntity developerEntity) {
        boolean isExists = developerRepository.existsById(developerEntity.getId());

        if (!isExists) {
            throw new DeveloperNotFound("Нет такого девелопера");
        }
        return developerRepository.save(developerEntity);
    }
    @Override
    public DeveloperEntity getDeveloperById(Integer id) {


        return developerRepository.findById(id).orElseThrow(() -> new DeveloperNotFound("Нетакого"));
    }
    @Override
    public DeveloperEntity getByEmail(String email) {

        DeveloperEntity obraineDeveloper = developerRepository.findByEmail(email);
        if (Objects.isNull(obraineDeveloper)) {
            throw new DeveloperNotFound("Developer non found");
        }
        return obraineDeveloper;
    }
    @Override
    public List<DeveloperEntity> getAllDeveloper() {
        return developerRepository.findAll()
                .stream().filter(d -> {
                            return d.getStatus().equals(Status.ACTIVE);
                        }
                )
                .sorted().collect(Collectors.toList());
    }
    @Override
    public List<DeveloperEntity> getAllActiveBySpeacality(String speciality) {
        return developerRepository.finaActiveBySpeaciality(speciality);
    }
    @Override
    public void softDeleteById(Integer id) {
        DeveloperEntity obtaintdeveloper = developerRepository.findById(id).orElseThrow(
                () -> new DeveloperNotFound("Error not found"));
        obtaintdeveloper.setStatus(Status.DELETED);
        developerRepository.save(obtaintdeveloper);

    }

    @Override
    public void hardDeleteById(Integer id) {
        DeveloperEntity obtaintdeveloper = developerRepository.findById(id).orElseThrow(
                () -> new DeveloperNotFound("Error not found"));

        developerRepository.deleteById(obtaintdeveloper.getId());
    }
}
