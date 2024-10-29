
public class Hesap {

	private String kullanici_adi;
	private String parola;
	private int bakiye;
	
	public Hesap(String kullanici_adi,String parola,int bakiye) {
		
		this.kullanici_adi = kullanici_adi;
		this.parola = parola;
		this.bakiye = bakiye;
		
	}
	
	public void setKullanici_adi(String kullanici_adi) {
		
		this.kullanici_adi = kullanici_adi;
	}
	public String getKullanici_adi() {
		
		return kullanici_adi;
	}
	
	
	public void setParola(String parola) {
		
		this.parola = parola;
	}
	public String getParola() {
	
		return parola;
	}
	
	
	public void setBakiye(int bakiye) {
		
		this.bakiye = bakiye;
	}
	public double getBakiye() {
		
		return bakiye;
	}
	
	public void ParaYatir(int miktar) {
		
		bakiye += miktar;
		System.out.println("Guncel bakiye = " +bakiye);
	}
	public void ParaCekme(int miktar) {
		
		if(bakiye - miktar < 0) {
			
			System.out.println("Yetersiz bakiye!");
		}
		else {
			
			bakiye -=miktar;
			System.out.println("Guncel bakiye = " +bakiye);
		}
		
	}
	
}
