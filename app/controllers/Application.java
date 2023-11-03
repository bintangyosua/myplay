package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        render();
    }

    public static void test() {
        render();
    }

    public static void newMahasiswa() {
        render();
    }

    public static void buatBaru(Mahasiswa objmhs) {
        objmhs.nama = objmhs.nama + " ganteng sekali";
        render(objmhs);
    }

}