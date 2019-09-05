/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge.rpl;

import java.util.Scanner;

/**
 *
 * @author yusri
 */
public class ChallengeRPL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String A,B,C,D,E,F;
        double Nilai ;
        double Tugas;
        double Laporan;
        double Ujian;
        double Akhir;
        System.out.println("=====KONVERSI NILAI=====");
        System.out.println("0-40=F");
        System.out.println("41-55=E");
        System.out.println("56-74=D"); 
        System.out.println("75-85=C");
        System.out.println("86-92=B");
        System.out.println("93-100=A");
        //Scanner
       Scanner scanner=new Scanner(System.in);
       System.out.println("Berapa Nilai Anda:");
       Nilai=scanner.nextInt();
       
       //Proses
       Tugas=(Nilai*3.0);
       System.out.println("Tugas:"+Tugas);
       Laporan=(Nilai/2);
       System.out.println("Laporan:"+Laporan);
       Ujian=(Nilai*5);
       System.out.println("Ujian:"+Ujian);
       Akhir=Tugas+Laporan+Ujian;
       System.out.println("Akhir:"+Akhir);
       //Penilaian
       if(Nilai<0&&Nilai<=40){
           System.out.println("Golongan F");
       }if(Nilai<41&&Nilai<=55){
           System.out.println("Golongan E");
       }else if(Nilai<56&&Nilai<=74){
           System.out.println("Golongan D");
       }if (Nilai>75&&Nilai<=85){
        System.out.println("Golongan C");
    }else if(Nilai>86&&Nilai<=92){
        System.out.println("Golongan B");
    }else{
        System.out.println("Golongan A");
    }
       //Kelulusan
         String grade=(Nilai <75)?"belum kompeten":"kompeten";
                 System.out.println(Nilai +"=>"+grade);
           
       
       
        
        
    }
    
}
