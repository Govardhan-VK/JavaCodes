
public class Ineuron {

	public static void main(String[] args) {

		System.out.println();
		
		for (int i = 1; i <= 5; i++) 
		{
			for (int j = 1; j <= 41; j++) 
			{
				if ((i == 1 || j == 3 || i == 5) && j < 6)
					System.out.print("*\t");
				else if (((i == 2 && j == 8) || (i == 3 && j == 9) || (i == 4 && j == 10) || j == 7 || j == 11) && j > 6
						&& j < 12)
					System.out.print("*\t");
				else if ((i == 1 || i == 5 || i == 3 || j == 13) && j > 12 && j < 18)
					System.out.print("*\t");
				else if ((i == 5 || j == 19 || j == 23) && j > 18 && j < 24)
					System.out.print("*\t");
				else if (((i == 1 && j != 29) || i == 3 || j == 25 || (j == 29 && (i == 2 || i == 5))
						|| (i == 4 && j == 28)) && j > 24 && j < 30)
					System.out.print("*\t");
				else if ((j == 31 || j == 35 || i == 1 || i == 5) && j > 30 && j < 36)
					System.out.print("*\t");
				else if (((i == 2 && j == 38) || (i == 3 && j == 39) || (i == 4 && j == 40) || j == 37 || j == 41)
						&& j > 36)
					System.out.print("*\t");
				else
					System.out.print("\t");
			}
			System.out.println();
		}
	}

}
