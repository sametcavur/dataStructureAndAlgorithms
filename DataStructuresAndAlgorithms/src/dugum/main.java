package dugum;

public class main {

	public static void main(String[] args) {
		
		
		Dugum dugum1 = new Dugum();
		Dugum dugum2 = new Dugum();
		Dugum dugum3 = new Dugum();
		
		dugum1.sayi = 5;
		dugum2.sayi = 15;
		dugum3.sayi = 25;
		
		dugum1.next = dugum2;
		dugum2.next = dugum3;
		dugum3.next = null;

		Dugum template = dugum1;
		
		while(template != null) { //Response 5,15,25
			System.out.println(template.sayi);
			template = template.next;
		}
		
		while(template.next != null) { //Response 5,15
			System.out.println(template.sayi);
			template = template.next;
		}
	}
}
