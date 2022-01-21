package com.innova.alternative;

@Alternative
public class MariaDB implements IDatabaseVersion {

    @Override
    public String databaseVersion(String data) {
        return "MariaDB Version";
    }
}