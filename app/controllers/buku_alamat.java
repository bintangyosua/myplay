package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

@With(Secure.class)
public class buku_alamat extends Controller {

    public static void index() {
        List daftar = BukuAlamat.findAll();
        render(daftar);
    }

    public static void create() {
        List goldars = GolonganDarah.findAll();
        List kabupatens = Kabupaten.findAll();
        render(goldars, kabupatens);
    }

    public static void save(BukuAlamat bukuAlamat) {
        bukuAlamat.save();
        index();
    }

    public static void delete(Long id) {
        BukuAlamat bukuAlamat = BukuAlamat.findById(id);
        bukuAlamat.delete();
        index();
    }

    public static void edit(Long id) {
        BukuAlamat bukuAlamat = BukuAlamat.find("id=?1", id).first();
        List goldars = GolonganDarah.findAll();
        List kabupatens = Kabupaten.findAll();
        render(bukuAlamat, goldars, kabupatens);
    }
}
