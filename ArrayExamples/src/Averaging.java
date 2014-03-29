import java.util.Scanner;


public class Averaging {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = new int[15];
		int toplam = 0;
		int ort = 0;
		for(int i=0; i<a.length; i++){
		System.out.print((i+1)+".sayıyı giriniz:");	
		Scanner input=new Scanner (System.in);
		a[i]=input.nextInt();
		toplam=toplam+a[i];
		ort=toplam/15;
		}
		
		System.out.println("Sonuc:"+toplam);
		System.out.println("Ortalama:"+ort);
	}

	}


