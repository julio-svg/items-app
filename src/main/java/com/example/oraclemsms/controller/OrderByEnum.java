package com.example.oraclemsms.controller;

public enum OrderByEnum {
    DESCRIPTION("description"),PRICE("price");
    private final String value;

    OrderByEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString(){
        return value;
    }
}
