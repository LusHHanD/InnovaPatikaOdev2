package com.innova.alternative;

@Alternative
public class MsSQL implements IDatabaseVersion {

    @Override
    public String databaseVersion(String data) {
        return "MsSQL Version";
    }


}