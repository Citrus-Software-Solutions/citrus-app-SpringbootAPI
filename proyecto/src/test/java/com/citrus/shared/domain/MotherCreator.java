package com.citrus.shared.domain;

import com.github.javafaker.Faker;

public class MotherCreator {

    private final static Faker faker = new Faker();

    public static Faker random() {
        return faker;
    }
}
