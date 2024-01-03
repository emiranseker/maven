package tr.edu.medipol.yazilimort;

import java.util.Iterator;

public class hesaplamalar {

	public static int faktoriyelrec(int n) {
		if(n==1) return 1;
		return n* faktoriyelrec(n-1);
	}
	public static  int faktoriyelloop(int n) {
		int sonuc=1;
		for(int i=n;i>=1;i++) { 
	sonuc=sonuc*i;
	return sonuc;
		}
		return sonuc;
	

}
	public static int topla(int sayi1,int sayi2){
		int sonuc=0;
		sonuc=sayi1+sayi2;
		
		return sonuc;
	}
	public static int cikart(int sayi1,int sayi2) {
		int sonuc=0;
		sonuc=sayi1-sayi2;
		
		return sonuc;
		
	}
	public static int carpma(int sayi1,int sayi2) {
		int sonuc=1;
		sonuc=sayi1*sayi2;
		
		return sonuc;
	}

}