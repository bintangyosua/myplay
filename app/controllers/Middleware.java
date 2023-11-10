package controllers;

import models.Karya;

public class Middleware {
    public static void checkKarya(String profile, Karya karya) {
        System.out.println("profile: " + profile);
        System.out.println("karya.user.username: " + karya.user.username);
        if (!profile.equals(karya.user.username)) {
            Application.home();
        }

    }
}
