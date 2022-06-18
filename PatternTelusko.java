
public class PatternTelusko {

	public static void main(String[] args) {

		System.out.println();

		for (int i = 1; i <= 5; i++) 
		{
			for (int j = 1; j <= 41; j++)
			{
				if ((i == 1 || j == 3) && j < 6)
					System.out.print("*\t");
				else if ((i == 1 || i == 5 || i == 3 || j == 7) && j > 6 && j < 12)
					System.out.print("*\t");
				else if ((i == 5 || j == 13) && j > 12 && j < 18)
					System.out.print("*\t");
				else if ((i == 5 || j == 19 || j == 23) && j > 18 && j < 24)
					System.out.print("*\t");
				else if ((i == 1 || i == 5 || i == 3 || (j == 25 && i == 2) || (j == 29 && i == 4)) && j > 24 && j < 30)
					System.out.print("*\t");
				else if ((j == 31 || (i == 3 && j == 32) || ((i == 2 || i == 4) && j == 33)
						|| ((i == 1 || i == 5) && j == 34)) && j > 30 && j < 36)
					System.out.print("*\t");
				else if ((j == 37 || j == 41 || i == 1 || i == 5) && j > 36)
					System.out.print("*\t");
				else
					System.out.print("\t");
			}
			System.out.println();
		}

	}

}
