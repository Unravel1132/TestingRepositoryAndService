package com.MyJUnitTesting.UnitTesting.Repository;

import com.MyJUnitTesting.UnitTesting.Entity.DeveloperEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DeveloperRepository extends JpaRepository<DeveloperEntity, Integer> {
    DeveloperEntity findByEmail(String email);
    @Query("select d from DeveloperEntity d where d.status = 'active' and d.specialty = ?1")
    List<DeveloperEntity> finaActiveBySpeaciality(String speaciality);
}
