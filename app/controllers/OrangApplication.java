package controllers;

import play.mvc.Controller;
import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

@With(Secure.class)
public class OrangApplication extends Controller {
    
    public static void index() {
        List<Orang> daftar = Orang.findAll();
        render(daftar);
    }

    public static void create() {
        List<GolonganDarah> goldars = GolonganDarah.findAll();
        List<Kabupaten> kabupatens = Kabupaten.findAll();
        render(goldars, kabupatens);
    }

    public static void save(Orang orang) {
        orang.save();
        index();
    }

    public static void delete(Long id) {
        Orang orang = Orang.findById(id);
        orang.delete();
        index();
    }

    public static void edit(Long id) {
        Orang orang = Orang.find("id=?1", id).first();
        List<GolonganDarah> goldars = GolonganDarah.findAll();
        List<Kabupaten> kabupatens = Kabupaten.findAll();
        render(orang, goldars, kabupatens);
    }
}
