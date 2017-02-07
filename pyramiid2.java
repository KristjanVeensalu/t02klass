
import java.util.Scanner;

public class pyramiid2{
  public static void main(String[] args){
	System.out.println("Arvutan pyramiidi omadusi.");
	double diameeter;
	double korgus;
	double kkorgus;
	Scanner in = new Scanner(System.in);
	System.out.println("Pyramiidi diameeter: ");
    diameeter = in.nextDouble();
	System.out.println("Pyramiidi korgus: ");
    korgus = in.nextDouble();
	System.out.println("Pyramiidi kulje korgus: ");
    kkorgus = in.nextDouble();
    pyramiid kujund1 = new pyramiid(diameeter, korgus, kkorgus);
	System.out.println(kujund1.toString());
  }
}

//[krisveen@greeny t02klass]$ javac pyramiid2.java
//[krisveen@greeny t02klass]$ java pyramiid2
//Arvutan pyramiidi omadusi.
//Pyramiidi diameeter:
//10
//Pyramiidi korgus:
//10
//Pyramiidi kulje korgus:
//10
//Pyramiid 10.0 x 10.0, Pohja umbermoot 40.0,cm Pohja pindala 100.0 cm2 Kulgpindala 200.0 cm2 Kogupindala 300.0 cm2 Ruumala 333.0 cm3
//[krisveen@greeny t02klass]$
