package com.MyJUnitTesting.UnitTesting.Util;

import com.MyJUnitTesting.UnitTesting.Entity.DeveloperDto;
import com.MyJUnitTesting.UnitTesting.Entity.DeveloperEntity;
import com.MyJUnitTesting.UnitTesting.Entity.Status;

import static junit.runner.Version.id;

public class DataUtil {



    public static DeveloperEntity getJohnDoeTransient() {
        return DeveloperEntity.builder()
                .firstName("John")
                .lastName("Doe")
                .email("john.doe@mail.com")
                .specialty("Java")
                .status(Status.ACTIVE)
                .build();
    }

    public static DeveloperEntity getMikeSmithTransient() {
        return DeveloperEntity.builder()
                .firstName("Mike")
                .lastName("Smith")
                .email("mike.smith@mail.com")
                .specialty("Java")
                .status(Status.ACTIVE)
                .build();
    }

    public static DeveloperEntity getFrankJonesTransient() {
        return DeveloperEntity.builder()
                .firstName("Frank")
                .lastName("Jones")
                .email("frank.jones@mail.com")
                .specialty("Java")
                .status(Status.DELETED)
                .build();
    }

    public static DeveloperEntity getJohnDoePersisted() {
        return DeveloperEntity.builder()
                .id(1)
                .firstName("John")
                .lastName("Doe")
                .email("john.doe@mail.com")
                .specialty("Java")
                .status(Status.ACTIVE)
                .build();
    }

    public static DeveloperEntity getMikeSmithPersisted() {
        return DeveloperEntity.builder()
                .id(2)
                .firstName("Mike")
                .lastName("Smith")
                .email("mike.smith@mail.com")
                .specialty("Java")
                .status(Status.ACTIVE)
                .build();
    }

    public static DeveloperEntity getFrankJonesPersisted() {
        return DeveloperEntity.builder()
                .id(3)
                .firstName("Frank")
                .lastName("Jones")
                .email("frank.jones@mail.com")
                .specialty("Java")
                .status(Status.DELETED)
                .build();
    }

    public static DeveloperDto getJohnDoeDtoTransient() {
        return DeveloperDto.builder()
                .firstName("John")
                .lastName("Doe")
                .email("john.doe@mail.com")
                .specialty("Java")
                .status(Status.ACTIVE)
                .build();
    }

    public static DeveloperDto getMikeSmithDtoTransient() {
        return DeveloperDto.builder()
                .firstName("Mike")
                .lastName("Smith")
                .email("mike.smith@mail.com")
                .specialty("Java")
                .status(Status.ACTIVE)
                .build();
    }

    public static DeveloperDto getFrankJonesDtoTransient() {
        return DeveloperDto.builder()
                .firstName("Frank")
                .lastName("Jones")
                .email("frank.jones@mail.com")
                .specialty("Java")
                .status(Status.DELETED)
                .build();
    }

    public static DeveloperDto getJohnDoeDtoPersisted() {
        return DeveloperDto.builder()
                .id(1)
                .firstName("John")
                .lastName("Doe")
                .email("john.doe@mail.com")
                .specialty("Java")
                .status(Status.ACTIVE)
                .build();
    }

    public static DeveloperDto getMikeSmithDtoPersisted() {
        return DeveloperDto.builder()
                .id(2)
                .firstName("Mike")
                .lastName("Smith")
                .email("mike.smith@mail.com")
                .specialty("Java")
                .status(Status.ACTIVE)
                .build();
    }

    public static DeveloperDto getFrankJonesDtoPersisted() {
        return DeveloperDto.builder()
                .firstName("Frank")
                .lastName("Jones")
                .email("frank.jones@mail.com")
                .specialty("Java")
                .status(Status.DELETED)
                .build();
    }

    }

