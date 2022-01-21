package com.innova.qualifier;

@Default
public class MySQL implements IDatabaseVersion {

    @Override
    public String databaseVersion(String data) {
        return "MySQL";
    }
}