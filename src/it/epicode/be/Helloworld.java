package it.epicode.be;
import java.util.Scanner;

public class Helloworld {

public static void main (String[] args)
		{
		// Stampa a console  la frase
		System.out.println("This is my first Epicode Java Project!");
		
		//ES A
		
		//ES 1
		System.out.println("ES 1");
		System.out.println("Il risultato della moltiplicazione è: "+moltiplica(5,3));
		
		//ES 2
		System.out.println("ES 2");
		System.out.println("Il risultato della concatenazione è: "+concatena("Oggi siamo solo in ",3));
		
		//ES 3
		System.out.println("ES 3");
		String[] array= {"uno","due","tre","quattro","cinque"};
		
		String[] nuovoArray=inseriscilnArray(array,"topo");
		
		for (int i=0;i<6;i++) {
			System.out.println("Il risultato del nuovo array è: "+nuovoArray[i]);
		}
		
		//FINE ES A
		
		//ES B
		
		//ES 1B
		System.out.println("ES 1B");
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Inserisci la prima stringa: ");
			String s1=sc.nextLine();
			System.out.print("Inserisci la seconda stringa: ");
			String s2=sc.nextLine();
			System.out.print("Inserisci la terza stringa: ");
			String s3=sc.nextLine();
			
			System.out.println("Stringa secondo l'ordine di inserimento: "+s1+" "+s2+" "+s3);
			System.out.println("Stringa secondo l'ordine inverso di inserimento: "+s3+" "+s2+" "+s1);
		}
		//ES 2A
		System.out.println("ES 2A");
		System.out.println("Il risultato del perimetro è: "+perimetroRettangolo(2.5,3.2));
		
		//ES 2B 
		System.out.println("ES 2B");
		if (pariDispari(6)==1) {
			System.out.println("Il numero inserito è dispari");
		}else {
			System.out.println("Il numero inserito è pari");
		}
		
		//ES 2C 
		System.out.println("ES 2C");
		System.out.println("L'area del triangolo equivale a: "+ areaTriangolo(5.2,9.5));
		
		}

        



public static int moltiplica(int n1,int n2){
	return (n1*n2);
}

public static String concatena(String c,int n) {
	return c+n;
}

public static String[] inseriscilnArray(String[] stringArray, String s) {
	String[] newArray= new String[6];
	
	newArray[0]=stringArray[0];
	newArray[1]=stringArray[1];
	newArray[2]=s;
	newArray[3]=stringArray[2];
	newArray[4]=stringArray[3];
	newArray[5]=stringArray[4];
	
	return newArray;
}

public static double perimetroRettangolo(double n1, double n2) {
	return (n1+n2)*2;
}

public static int pariDispari(int n) {
	if(n%2==0) {
		return 0;
	}else {
		return 1;
	}
	}

public static double areaTriangolo(double b, double h) {
	return (b*h)/2;
}


}
	






