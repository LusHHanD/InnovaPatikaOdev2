package com.innova.alternative;

@Alternative
public class MySQL implements IDatabaseVersion {

    @Override
    public String databaseVersion(String data) {
        return "MySQL Version";
    }
}