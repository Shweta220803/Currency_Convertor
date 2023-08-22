
import java.util.Scanner;
class Currency_Convertor{
	
	 public static void main(String[] args) {

	 	double rupee, dollar, pound, euro, yen, taka, pkr;

	 	Scanner sc = new Scanner(System.in);

	 	System.out.println("Given Choices for Conversion from one currency to another :");
	 	System.out.println("1. Indian Rupee");
	    System.out.println("2. American Dollar");
	 	System.out.println("3 .British Pound");
	 	System.out.println("4. Euro");
	    System.out.println("5. Japnees Yen");
	 	System.out.println("6. Bangladeshi Taka ");
	 	System.out.println("7. Pakistani Rupees ");




	 	System.out.println("Choose the currency from given choices :");
	 	int choice = sc.nextInt();

	    System.out.println("Enter the amount : ");
	    double amount = sc.nextDouble();





	 	switch(choice){

	 		case 1 : // conversion from INR to other currency


	 		// Indian Rupee (INR) to dollar conversion
	 		dollar = amount / 75;
	 		System.out.println(amount + " Rupee = "+ dollar + " USD");
 

      	   // Indian Rupee (INR) to British Pound conversion
            pound = amount / 100;
            System.out.println(amount + " Rupee = " + pound + " British Pound");


            // Indian Rupee (INR) to euro conversion
	 		euro = amount / 90;
	 		System.out.println(amount + " Rupee = "+ euro + " Euro");
 

      	   // Indian Rupee (INR) to Japanese Yen conversion
            yen = amount * 1.5;
	 		System.out.println(amount + " Rupee = "+ yen + " Japanese Yen");

	 		// Indian Rupee (INR) to Bangladesi Taka(BDt) conversion
	 		taka = amount * 1.3;
	 		System.out.println(amount + " Rupee = "+ taka + " Bangladeshi Taka");
 

      	   // Indian Rupee (INR) to Pakistani rupeeconversion
            pkr = amount * 2.5;
	 		System.out.println(amount + " Rupee = "+ pkr + " Pakistani Rupee");

	 		break;

	 		case 2 : // conversion from Dollar to other currency

	 		// dollar to Indian Rupee (INR) conversion
	 		rupee = amount * 75;
	 		System.out.println(amount + " Dollar = " + rupee + " INR");
 

      	   // dollar to pound conversion
            pound = amount * 0.72;
	 		System.out.println(amount + " Dollar = " + pound + " British Pound");

      	   // dollar to euro conversion
	 		euro = amount * 0.91 ;
	 		System.out.println(amount + " Dollar = " + euro + " Euro");
 

      	   // dollar to yen conversion
            yen = amount * 110;
	 		System.out.println(amount + " Dollar = " + yen + " Japanese Yen");

      	   // dollar to Taka conversion
	 		taka = amount * 100;
	 		System.out.println(amount + " Dollar = " + taka + " Bangladesi Taka");
 

      	   // dollar to pakistani rupee  conversion
            pkr = amount * 150;
	 		System.out.println(amount + " Dollar = " + pkr + " Pakistani Rupee");
 
	 		break;



	 		case 3 :  // conversion from Pound to other currency

	 		// pound to Indian Rupee (INR) conversion
	 		rupee = amount * 100;
	 		System.out.println(amount + " British Pound = " + rupee + " INR");
 

      	   // pound to dollar conversion
            dollar = amount * 1.3;
	 		System.out.println(amount + " British Pound = " + dollar + " USD");

      	   // pound to euro conversion
	 		euro = amount * 1.2;
	 		System.out.println(amount + " British Pound = " + euro + " Euro");
 

      	   // pound to yen conversion
            yen = amount * 150;
	 		System.out.println(amount + " British Pound = " + yen + " Japanese Yen");

      	   // pound to Taka conversion
	 		taka = amount * 120;
	 		System.out.println(amount + " British Pound = " + taka + " Bangladesi Taka");
 

      	   // pound to pakistani rupee  conversion
            pkr = amount * 250;
	 		System.out.println(amount + " British Pound = " + pkr + " Pakistani Rupee");




	 		break;

	 		case 4 :  // conversion from Euro to other currency

	 		// euro to Indian Rupee (INR) conversion
	 		rupee = amount * 85;
	 		System.out.println(amount + " Euro = " + rupee + " INR");
 

      	   // euro to dollar conversion
            dollar = amount * 1.2;
	 		System.out.println(amount + " Euro = " + dollar + " USD");

      	   // euro to pound conversion
	 		pound = amount * 0.85;
	 		System.out.println(amount + " Euro = " + pound + " British Pound");
 

      	   // euro to yen conversion
            yen = amount * 130;
	 		System.out.println(amount + " Euro = " + yen + " Japanese Yen");

      	   // euro to Taka conversion
	 		taka = amount * 100;
	 		System.out.println(amount + " Euro = " + taka + " Bangladesi Taka");
 
      	   // euro to pakistani rupee  conversion
            pkr = amount * 220;
	 		System.out.println(amount + " Euro = " + pkr + " Pakistani Rupee");

	 		break;

	 		case 5 : // conversion from yen to other currency

	 		// yen to Indian Rupee (INR) conversion
	 		rupee = amount * 0.60;
	 		System.out.println(amount + " yen = " + rupee + " INR");
 

      	   // yen to dollar conversion
            dollar = amount * 0.009;
	 		System.out.println(amount + " yen = " + dollar + " USD");

      	   // yen to pound conversion
	 		pound = amount * 0.006;
	 		System.out.println(amount + " yen = " + pound + " British Pound");
 

      	   // yen to euro conversion
            euro = amount * 0.008;
	 		System.out.println(amount + " yen = " + euro + " Euro");

      	   // yen to Taka conversion
	 		taka = amount * 1.20;
	 		System.out.println(amount + " yen = " + taka + " Bangladesi Taka");
 

      	   // yen to pakistani rupee  conversion
            pkr = amount * 1.40;
	 		System.out.println(amount + " yen = " + pkr + " Pakistani Rupee");		 		

	 		break;


	 		case 6 : // conversion from taka to other currency

	 		// taka to Indian Rupee (INR) conversion
	 		rupee = amount * 0.60;
	 		System.out.println(amount + " Bangladeshi Taka = " + rupee + " INR");
 

      	   // taka to dollar conversion
            dollar = amount * 0.009;
	 		System.out.println(amount + " Bangladeshi Taka = " + dollar + " USD");

      	   // taka to pound conversion
	 		pound = amount * 0.006;
	 		System.out.println(amount + " Bangladeshi Taka = " + pound + " British Pound");
 

      	   // taka to euro conversion
            euro = amount * 0.008;
	 		System.out.println(amount + " Bangladeshi Taka = " + euro + " Euro");

      	   // taka to yen conversion
	 		yen = amount * 1.20;
	 		System.out.println(amount + "Bangladeshi Taka = " + yen + "Japanese Yen");
 

      	   // taka to pakistani rupee  conversion
            pkr = amount * 1.40;
	 		System.out.println(amount + " Bangladeshi Taka = " + pkr + " Pakistani Rupee");		 		


	 		break;

	 		case 7 : // conversion from pakistani rupee to other currency

	 		// pkr to Indian Rupee (INR) conversion
	 		rupee = amount * 0.60;
	 		System.out.println(amount + " Pakistani Rupee = " + rupee + " INR");
 

      	   // pkr to dollar conversion
            dollar = amount * 0.009;
	 		System.out.println(amount + " Pakistani Rupee = " + dollar + " USD");

      	   // pkr to pound conversion
	 		pound = amount * 0.006;
	 		System.out.println(amount + " Pakistani Rupee = " + pound + " British Pound");
 

      	   // pkr to euro conversion
            euro = amount * 0.008;
	 		System.out.println(amount + " Pakistani Rupee = " + euro + " Euro");

      	   // pkr to yen conversion
	 		yen = amount * 1.20;
	 		System.out.println(amount + " Pakistani Rupee = " + yen + " Japanese Yen");
 

      	   // pkr to taka  conversion
            taka = amount * 1.40;
	 		System.out.println(amount + " Bangladeshi Taka = " + taka + " Bangladeshi Taka");		 		

	 		break;


	 		default:
	 		System.out.println("Invalid Entry");


	 	}




		
	}
}