import java.util.Scanner;

public class Main {
	
	
			


	public static void main(String[] args) {
		
		Scanner in =new Scanner(System.in);
		
		int opcionPelo;
		do {
			System.out.println("1 - WWWWWWWWW");
			System.out.println("2 - \\\\\\//////");
			System.out.println("3 - |\"\"\"\"\"\"\"|");
			System.out.println("4 - |||||||||");
			System.out.println("Introducce una opción");
			
			opcionPelo = in.nextInt();
			
			if(opcionPelo < 1 || opcionPelo > 4)
				
				System.out.println("La opción no es correcta");

		
		} while (opcionPelo < 1 || opcionPelo >4);
		
		
		
		
		
		
		int opcionOjos;
		do {
			System.out.println("1 - | OO |");
			System.out.println("2 - |-(· ·)-|");
			System.out.println("3 - |-(o o)-|");
			System.out.println("4 - || \\/ |");
			System.out.println("Introducce una opción");
			
			opcionOjos = in.nextInt();
			
			if(opcionOjos < 1 || opcionOjos > 4)
				
				System.out.println("La opción no es correcta");

		
		} while (opcionOjos < 1 || opcionOjos >4);		
		
		
		
		
		int opcionOrejas;
		do {
			System.out.println("1 - @   J    @");
			System.out.println("2 - {   \"   }");
			System.out.println("3 - [   j    ]");
			System.out.println("4 - <   -    >");
			System.out.println("Introducce una opción");
			
			opcionOrejas = in.nextInt();
			
			if(opcionOrejas< 1 || opcionOrejas > 4)
				
				System.out.println("La opción no es correcta");

		
		} while (opcionOrejas < 1 || opcionOrejas >4);		

		
		int Boca;
		do {
			System.out.println("1 - |   ===  |");
			System.out.println("2 - |    -   |");
			System.out.println("3 - |        |");
			System.out.println("4 - |   ___  |");
			System.out.println("Introducce una opción");
			
			Boca = in.nextInt();
			
			if(Boca< 1 || Boca > 4)
				
				System.out.println("La opción no es correcta");

		
		} while (Boca < 1 || Boca >4);
		
		switch (opcionPelo) {
		case 1 :
			System.out.println("WWWWWWWWW");
			break;
		
		case 2 :
			System.out.println("\\\\\\//////");
			break;
			
		case 3 :
			System.out.println("|\"\"\"\"\"\"\"|");
			break;
		
		case 4 :
			System.out.println("|||||||||");
			
		}
			
			
			switch (opcionOjos) {
			case 1 :
				System.out.println("| OO |");
				break;
			
			case 2 :
				System.out.println("|-(· ·)-|");
				break;
				
			case 3 :
				System.out.println("|-(o o)-|");
				break;
			
			case 4 :
				System.out.println("|| \\\\/ |");
			
			}
			
			switch (opcionOrejas) {
			case 1 :
				System.out.println("@   J    @");
				break;
			
			case 2 :
				System.out.println("{   \\\"   }");
				break;
				
			case 3 :
				System.out.println("[   j    ]");
				break;
			
			case 4 :
				System.out.println("|| \\\\/ |");
			
			}
		
			switch (Boca) {
			case 1 :
				System.out.println("|   ===  |");
				break;
			
			case 2 :
				System.out.println("|    -   |");
				break;
				
			case 3 :
				System.out.println("|        |");
				break;
			
			case 4 :
				System.out.println("|   ___  |");
		
			}
				System.out.println("\\______/");
	}

}
