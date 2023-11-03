package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class buku_alamat extends Controller {

    public static void index() {
        List daftar = BukuAlamat.findAll();
        render(daftar);
    }

    public static void create() {
        render();
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
}
