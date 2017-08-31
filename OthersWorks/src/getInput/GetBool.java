package getInput;

import java.util.Scanner;

public class GetBool
{
	@SuppressWarnings("resource")
	public static boolean get()
	{
		Scanner take = new Scanner(System.in);

		String input = take.nextLine();

		while (!check(input))
		{
			System.out.println("Wrong Input. Retry >>");
			input = take.nextLine();
		}
		// take.close();
		return (input.equals("yes") || input.equals("1")) ? (true) : (false);

	}

	private static boolean check(String input)
	{
		//если ничего не введено или длина больше максимальной длины для int
		if (input.length() >= 1 || input.length() <= 3)
		{
			if (input.charAt(0) == '1' || input.charAt(0) == '2'
					|| input.equals("yes") || input.equals("no"))
			{
				return true;
			}
		}
		return false;
	}
}