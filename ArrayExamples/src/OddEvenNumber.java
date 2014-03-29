import java.util.Scanner;


public class OddEvenNumber {

	/**
	 * @param args
	 */
	
		public static void main(String[] args) {
			int [] tc = new int[10];
			int teksay = 0;
			int ciftsay = 0;
			
			for(int i=0; i<tc.length; i++){
				System.out.print((i+1)+".Sayıyı giriniz:" );
				Scanner input= new Scanner (System.in);
				tc[i]=input.nextInt();
				if(tc[i]%2==0){
					System.out.println("Çift");
					++ciftsay;
				}
				else{
					System.out.println("Tek");
					++teksay;
				}
			
			}
		System.out.println("Girdiğiniz 10 adet sayıdan\n" +ciftsay+" tanesi cift\n"+teksay+" tanesi tek");	
			

		}


	}


