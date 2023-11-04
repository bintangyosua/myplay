package controllers;

import models.*;

public class Security extends controllers.Secure.Security {
    public static boolean authenticate(String username, String password) {
        boolean boleh = false;

        User x = User.find("username=?1 and password=?2", username, password).first();

        if(x != null){
            boleh = true;
        }

        return boleh;
    }
    
}
