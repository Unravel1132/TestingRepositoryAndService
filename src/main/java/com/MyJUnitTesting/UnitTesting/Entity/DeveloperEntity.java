package com.MyJUnitTesting.UnitTesting.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Entity

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Table(name = "Developers")
public class DeveloperEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private String email;
    private String lastName;
    private String specialty;
    @Enumerated(EnumType.STRING)
    private Status status;



//    public boolean equals(Object o){
//        if(this == o) return true;
//        if(o = null || getClass() != o.getClass()) return false;
//
//        DeveloperEntity developerEntity = (DeveloperEntity) o;
//        return Object.equals(id, developerEntity.id
//
//
//    }



}
