package kdv;

import java.util.Scanner;

public class Kdv {

	public static void main(String[] args) {
		
	double kdv = 1.8 ;	
	
	double diger = 0.8 ;
		
	Scanner input = new Scanner(System.in);
	
	System.out.print("Ürün Fiyatını Giriniz : ");
	
	double fiyat = input.nextDouble();
	
	if (fiyat <0 && fiyat > 1000) {
		
	double kdvli = fiyat*kdv;
	
	System.out.print("Kdv'li Fiyat : "+(fiyat+kdvli));
		
	}
	
	else {
		
	double kdvli2 = fiyat * diger ;
		
	System.out.print("Kdv'li fiyat : "+ (fiyat+kdvli2));
	
	}
	
	
	

	}

}
