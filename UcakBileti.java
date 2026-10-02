
package ucakbileti;
import  java.util.Scanner;
public class UcakBileti {
public static void main(String[] args) {
       
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("mesafeyi km turunden giriniz.");
    double mesafe = scanner.nextDouble();
    
    System.out.println("Yasınızı giriniz.");
    double yas = scanner.nextDouble();
    
    System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
    int secim = scanner.nextInt();
    
double ucret = mesafe * 0.10;

		if ((yas > 0) && (mesafe > 0) && ((secim == 1) || (secim == 2))) {

			if (yas < 12) {

				ucret *= 0.5;

			} else if ((yas >= 12) && (yas <= 24)) {

				ucret *= 0.9;

			} else if ((yas > 65)) {

				ucret *= 0.7;
			}

			if (secim == 2) {

				ucret *= 2;
				ucret *= 0.8;

			}

			System.out.println("Toplam Tutar = " + ucret + "TL");
		} else {
			System.out.println("Hatalı Veri Girdiniz !");
		}

	}

}