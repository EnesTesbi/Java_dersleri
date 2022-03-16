//Kurucular ve Yikici
import java.util.Iterator;
public class Kurucular {
	public int a;
	public String ad;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kurucular nesne=new Kurucular();
		System.out.println("Default kurucu için a:"+ nesne.a);
		System.out.println("Default kurucu için ad:"+ nesne.ad);
		System.out.println("-----------------");
		Kurucular nesne2=new Kurucular(100);
		System.out.println("Default kurucu için a:"+ nesne2.a);
		System.out.println("Default kurucu için ad:"+ nesne2.ad);
		System.out.println("-----------------");
		Kurucular nesne3=new Kurucular("ÝSTE");
		System.out.println("Default kurucu için a:"+ nesne3.a);
		System.out.println("Default kurucu için ad:"+ nesne3.ad);
		System.out.println("-----------------");
		Kurucular nesne4=new Kurucular(1453, "ÝSTE-BM");
		System.out.println("Default kurucu için a:"+ nesne4.a);
		System.out.println("Default kurucu için ad:"+ nesne4.ad);
		System.out.println("-----------------");
		
		Kurucular nesne5=new Kurucular("--ÝSTE-BM--", 1071);
		
		System.out.println("Default kurucu için a:"+ nesne5.a);
		System.out.println("Default kurucu için ad:"+ nesne5.ad);
		
		System.out.println("String");
		System.out.println(45);
		
		
	}
	
	Kurucular() {
		// TODO Auto-generated constructor stub
		this.a=-1;
		this.ad="Varsayýlan";
	}
	Kurucular(int a){
		this(); //Parametresiz kurucu
		this.a=a;
		this.ad="-Varsayýlan-";
		
	}
	Kurucular(String ad){
		this(5);//int parametreli constructer cagirildi
		this.ad=ad;
		this.a=-2;
	}
	Kurucular(int a, String ad){
		this.ad=ad;
		this.a=a;
	}
	Kurucular(String ad, int a){
		this.ad=ad;
		this.a=a;
	}
	
	//Yikici fonksiyon: Deconstructer
	public void finalize(){
		System.out.println("DeConstructer tetiklendi");
	}

}
