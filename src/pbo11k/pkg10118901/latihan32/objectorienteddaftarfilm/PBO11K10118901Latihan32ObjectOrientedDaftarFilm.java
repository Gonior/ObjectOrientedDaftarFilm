/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118901.latihan32.objectorienteddaftarfilm;

/**
 *
 * @author 
 * NAMA                 : Dedi Cahya
 * KELAS                : PBO11K
 * NIM                  : 10118901
 * Deskripsi Program    : Menampilkan film dengan konsep orientasi objek
 * 
 */
public class PBO11K10118901Latihan32ObjectOrientedDaftarFilm {
    public static Film f = new Film();
    public static void tmpl(String n,String g, double r, int d) {
        f.filmName = n;
        f.filmGenre = g;
        f.filmRating = r;
        f.filmDuration = d;
        f.nowPlaying();
    }
    public static void main(String[] args) {
        tmpl("Venom","Action, Horror, Scifi",8.5,120);
        tmpl("Small Foot","Animation",9.0,96);
        tmpl("Crazy Rich Asian","Comedy",7.8,119);
        tmpl("Asih","Horror",6.0,100);
    }
    
}
