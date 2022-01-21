package com.innova.interceptor;

import com.innova.alternative.ApplicationScoped;
import com.innova.alternative.Inject;
import com.innova.alternative.Named;

import java.io.Serializable;

@Named("interceptorAOP")
@ApplicationScoped
public class AopBean implements Serializable {
    private static final long serialVersionUID = 1548548484848998489L;

    @Inject
    private Login login;

    public String getLogin() {
        return login.isLogin("Admin sayfası admin.xhtml");
    }

}