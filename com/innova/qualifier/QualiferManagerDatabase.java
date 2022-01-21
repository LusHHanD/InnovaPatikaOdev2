package com.innova.qualifier;

import com.innova.alternative.ApplicationScoped;
import com.innova.alternative.Inject;
import com.innova.alternative.Named;

import java.io.Serializable;

@Named("qualiferCDI")
@ApplicationScoped
public class QualiferManagerDatabase implements Serializable {
    private static final long serialVersionUID = 3097860167944776376L;


    @Inject
    private IDatabaseVersion iDatabaseVersion;

    public String getiDatabaseVersion() {
        return iDatabaseVersion.databaseVersion(" Sürüm ");
    }

}