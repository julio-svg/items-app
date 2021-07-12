package com.example.oraclemsms.controller;

public enum SortEnum {
    ASCENT("asc") ,DESCENT("desc");
    private final String value;

    SortEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString(){
        return value;
    }
}
