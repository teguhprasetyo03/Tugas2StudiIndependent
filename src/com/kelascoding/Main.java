package com.kelascoding;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int nUas, nUts, nUpm;
        double nRata;
        String nama;
        char predikat;
        System.out.println("Program Menghitung Nilai Mahasiswa");

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nama Mahasiswa : ");
        nama = input.nextLine();

        System.out.println("Masukkan Nilai UTS : ");
        nUts = input.nextInt();

        System.out.println("Masukkan Nilai UAS : ");
        nUas = input.nextInt();

        System.out.println("Masukkan Nilai UAS : ");
        nUpm = input.nextInt();

        nRata = nUts*0.2+nUas*0.3+nUpm*0.5;

        if (nRata>=91){
            predikat = 'A';
        } else if (nRata >=76  && nRata >= 85){
            predikat = 'B';
        } else if(nRata >= 75 && nRata >= 65){
            predikat = 'C';
        } else if (nRata >= 64 && nRata >= 50){
            predikat = 'D';
        } else{
            predikat = 'E';
        }

        System.out.println("Nama Mahasiswa : "+nama);
        System.out.println("Nilai Rata-Ratanya adalah : " +nRata);
        System.out.println("Predikat Yang Diperoleh Adalah : "+predikat);
    }
}
