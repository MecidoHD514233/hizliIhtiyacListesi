/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hesapmakinesi;

import java.util.Scanner;
import java.util.*;

public class HesapMakinesi {

    public static void main(String[] args) {
       
        
        
        System.out.println("Hesap Makinesine Hosgeldiniz ");
        Scanner klavye = new Scanner(System.in);
        
        int i=0;
        do {
        
        System.out.println("Lütfen birinci sayıyı giriniz : ");
        int biris = klavye.nextInt();
        System.out.println("Lütfen ikinci sayıyı giriniz : ");
        int ikis = klavye.nextInt();
        
         System.out.println("Lütfen Yapmak İstediğiniz İşlemi seçiniz : ");
          System.out.println("Toplama için 1 i  "+"Çıkarma için 2 yi  "+"Çarpma için 3 ü  "+"Bölme için 4 "+ "ü Seçiniz ");
         int secme= klavye.nextInt();
         
         if (secme==1) {
           int  toplam=biris+ikis;
           int   sonuc=toplam;
           System.out.println("Yapmak istediğiniz işlemin sonucu : "+ sonuc);
         } else if  (secme==2) {
           int  cıkarım=biris-ikis;
           int   sonuc=cıkarım;
           System.out.println("Yapmak istediğiniz işlemin sonucu : "+ sonuc);
           }else if  (secme==3) {
           int  carpım=biris*ikis;
           int   sonuc=carpım;
           System.out.println("Yapmak istediğiniz işlemin sonucu : "+ sonuc);
           }else if  (secme==4) {
           int  bolum=biris-ikis;
           int   sonuc=bolum;
           System.out.println("Yapmak istediğiniz işlemin sonucu : "+ sonuc);
           }
         i++;
           }
          
         while(i<100);
        }
}
        
    
