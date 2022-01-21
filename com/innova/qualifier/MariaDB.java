package com.innova.qualifier;

public class MariaDB implements IDatabaseVersion {

    @Override
    public String databaseVersion(String data) {
        return "Opsiyonel MariaDB";
    }
}