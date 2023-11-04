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

    public static void onDisconnected() {
        Application.home();
    }

    public static void onAuthenticated() {
        buku_alamat.index();
    }

    public static boolean check(String profile) {
        if ("admin".equals(profile))  {
            return User.find("username=?1", connected()).<User>first().isAdmin;
        }

        return false;
    }
    
}
