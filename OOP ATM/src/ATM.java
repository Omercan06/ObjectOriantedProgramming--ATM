import java.util.Scanner;

public class ATM {

	public void calis(Hesap hesap) {
			
			Login login = new Login();
			Scanner input = new Scanner(System.in);
			System.out.println("Bankamiza hosgeldiniz.");
			System.out.println("**********************");
			System.out.println("Kullanici Girisi");
			System.out.println("***********************");
			int giris_hakki = 3;
			
			while(true) {
				
				if(login.login(hesap)) {
					
					System.out.println("Giris Basarili");
					break;
				}
				else {
					System.out.println("Giris basarisiz");
					giris_hakki -= 1;
					System.out.println("Kalan giris hakki: " +giris_hakki);
				}
				
				if(giris_hakki == 0) {
					System.out.println("Giris hakkiniz bitti");
					return;
					
					
				}
			}
			System.out.println("**************************");
			String islem = "1. Bakiye Goruntuleme\n"
					+ "2. Para Yatirma\n"
					+ "3. Para Cekme\n"
					+ "Cikis icin q'ya basin";
			System.out.println(islem);
			System.out.println("***************************");
			
			while(true) {
				
				System.out.println("Ýslemi seciniz: ");
				String islem1 = input.nextLine();
				
				if(islem1.equals("q")) {
					break;
				}
				else if(islem1.equals("1"))
				{
					System.out.println("Bakiyeniz: " +hesap.getBakiye());
				}
				else if(islem1.equals("2")) {
					
					System.out.println("Yatirmak istediginiz tutari girin:");
					int tutar = input.nextInt();
					input.nextLine();
					hesap.ParaYatir(tutar);
					System.out.println("Para hesabiniza yatirildi");
				}
				else if(islem1.equals("3"))
					{
						System.out.println("Cekmek istediginiz tutari girin:");
						int miktar = input.nextInt();
						input.nextLine();
						hesap.ParaCekme(miktar);
						System.out.println("Paraniz cekiliyor.");
					}
				else {
					System.out.println("Gecersiz islem");
				}
			
				
			}
		
		}
}
