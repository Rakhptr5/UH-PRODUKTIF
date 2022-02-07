/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilaisiswa;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class siswa {

    Scanner input = new Scanner(System.in);
    String nama;
    String nilai;
    String Mapel;
    String NISN;
    String Detail;
    String inputLUR;
    String inputneh;
    String inputlgi;
    int Nilai;

    void NAMA() {
        nama = "NAMA :";
        System.out.print(nama);
    }

    void atas() {
        inputLUR = input.nextLine();

    }

    void NISN0() {
        NISN = "NISN :";
        System.out.print(NISN);
    }
     void tengah() {
        inputneh = input.nextLine();
    }
    void MapelNaon() {
        Mapel = "Mata Pelajaran :";
        System.out.print(Mapel);       
    }
    void tengah2() {
        inputlgi = input.nextLine();
    }
    void NILAISISWA() {
        nilai = " Masukkan Nilai :";
        System.out.print(nilai);
    }

    void bawah() {
        Nilai = input.nextInt();
    }

    void DETAIL() {
        Detail = "Hasil Keterangan Kelulusan : ";
        System.out.println("Loading Hasil");
        System.out.println("...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("============");
        System.out.println("Nama Anda : " + inputLUR);
        System.out.println("NISN Anda : " + inputneh);
        System.out.print(Detail);
    }

    void HASIL() {
        if (Nilai > 75) {
            System.out.println("HORE! Anda Lulus! Dengan Nilai " + Nilai + " di Mata Pelajaran "+inputlgi+ " Ibukmu Bangga le...");

        }
        if (Nilai < 75) {
            System.out.println("Anda tidak lulus di Mata Pelajaran "+inputlgi+ "Dengan Nilai " + Nilai + " mohon sabar ini ujian");
        }
    }

}
