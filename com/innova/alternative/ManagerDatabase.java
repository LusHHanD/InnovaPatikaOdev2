package com.innova.alternative;

@Named(value = "alternativeCDI")
@ApplicationScoped
public class ManagerDatabase {

    @Inject
    private IDatabaseVersion iDatabaseVersion;

    public String getiDatabaseVersion() {
        return iDatabaseVersion.databaseVersion("versiyonlar: ");
    }
}