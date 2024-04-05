package tekrarlanaSayilar;

import java.util.ArrayList;
import java.util.Scanner;

public class tekrarlananSayilarMain {

	public static  void main(String[] args) {

		// tanımlamlar
		int tekrarlanan_sayi_sayisi = 0;
		ArrayList<Integer> tekrarlanan_sayilar=new ArrayList<>();

		// dizi uzunluğu alma
		Scanner scanner = new Scanner(System.in);
		System.out.print("Kaç tane değer gireceğinizi belirtin: ");
		int dizinin_uzunlugu = scanner.nextInt();
		int[] sayilar = new int[dizinin_uzunlugu];
		
		// dizi eleamnlarını alma
		for (int i = 0; i < dizinin_uzunlugu; i++) {
			System.out.print("Dizinin " + i + ". indeks değerini giriniz: ");
			sayilar[i] = scanner.nextInt();
		}
		//sorgulanacak sayıyı alma
		for (int i =0;i<sayilar.length;i++) {
			int eldeki_sayi=sayilar[i];
			//sorgulama
			for (int j = 0; j < sayilar.length; j++) {
				int aranan_sayi = sayilar[j];
				if (i == j) {//kendisiyse yazmasına engel olma
					continue;
				
				} else {
					if (eldeki_sayi == aranan_sayi) {
						if (tekrarlanan_sayilar.contains(eldeki_sayi)) {//tekrar edenleri farklı algılamasına engel olma
							break;
						}	
						
						// tekrarlananlar listesine ekle
						tekrarlanan_sayilar.add( aranan_sayi);
						tekrarlanan_sayi_sayisi++;
						break;
					}

				}
			}
		}
		// tekrarlananlar listesini yazdır
		System.out.println("Tekrarlanan sayıların adedi: " + tekrarlanan_sayi_sayisi);
		System.out.println("Tekrarlanan sayılar: " + tekrarlanan_sayilar);
	}

}
