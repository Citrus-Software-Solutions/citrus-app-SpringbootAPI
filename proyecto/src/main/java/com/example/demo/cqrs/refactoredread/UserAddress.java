package com.example.demo.cqrs.refactoredread;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.example.demo.cqrs.classes.Address;

public class UserAddress {
    private Map<String, Set<Address>> addressByRegion = new HashMap<>();
}
