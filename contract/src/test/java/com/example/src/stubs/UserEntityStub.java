package com.example.src.stubs;

import com.example.src.impl.repository.UserEntity;

public class UserEntityStub {

    public static UserEntity generationUserEntity() {
        return UserEntity.builder()
            .id("someid")
            .userName("teste")
            .build();
    }

    public static UserEntity generationUserEntity2() {
        return UserEntity.builder()
            .id("someid")
            .userName("teste")
            .build();
    }
}