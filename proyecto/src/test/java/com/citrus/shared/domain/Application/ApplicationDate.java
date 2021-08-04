package com.citrus.shared.domain.Application;

import java.util.Date;

import com.citrus.shared.domain.MotherCreator;

public class ApplicationDate {

    public static Date random() {
        return MotherCreator.random().date().birthday();
    }
}
