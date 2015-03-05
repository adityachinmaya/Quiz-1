package quiz1;

import java.util.Scanner;

public class QbRating {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("input attempted passes: ");
		double ATT = (input.nextInt());
		//attempted passes
		
		System.out.print("input number of completions: ");
		double COMP = (input.nextInt());
		//number of completions
		
		System.out.print("input number of passing yards: ");
		double YDS = (input.nextInt());
		//number of passing yards
		
		System.out.print("input number of touchdown passes: ");
		double TD = (input.nextInt());
		//number of touchdown passes
		
		System.out.print("input number of interceptions: ");
		double INT = (input.nextInt());
		//number of interceptions
		
		double Vara = (((COMP/ATT) - 0.3 )* 5);
		if (Vara <  0)
			Vara = 0;
		else if (Vara > 2.375)
			Vara = 2.375;
		else;
			
		double Varb = (((YDS/ATT) - 3 ) * 0.25);
		if (Varb <  0)
			Varb = 0;
		else if (Varb > 2.375)
			Varb = 2.375;
		else;
		
		double Varc = ((TD/ATT) * 20);
		if (Varc <  0)
			Varc = 0;
		else if (Varc > 2.375)
			Varc = 2.375;
		else;
		
		double Vard = (2.375 - ((INT/ATT) * 25));
		if (Vard <  0)
			Vard = 0;
		else if (Vard > 2.375)
			Vard = 2.375;
		else;
		
		double NFLPasserRating = (((Vara + Varb + Varc + Vard)/6) * 100);
		System.out.printf("The QB rating of this quarterback is %3.1f" , NFLPasserRating);
		input.close();
	}
}
