package getInput;

import java.util.Scanner;

public class GetBinary
{
	@SuppressWarnings("resource")
	public static boolean getBool()
	{
		Scanner take = new Scanner(System.in);

		String input = take.nextLine();

		while (!check(input))
		{
			System.out.println("Wrong Input. Retry >>");
			input = take.nextLine();
		}
		// take.close();

		return (input.equals("yes") || input.equals("1")) ? true : false;
	}
	
	@SuppressWarnings("resource")
	public static int getNumb()
	{
		Scanner take = new Scanner(System.in);

		String input = take.nextLine();

		while (!check(input))
		{
			System.out.println("Wrong Input. Retry >>");
			input = take.nextLine();
		}
		// take.close();

		if (input.equals("yes") || input.equals("1"))
		{
			return 1;
		}
		else
		{
			return 2;
		}
	}

	public static boolean check(String input)
	{
		//если ничего не введено или длина больше максимальной длины для int
		if (input.length() >= 1 || input.length() <= 3)
		{
			if (input.charAt(0) == '1' || input.charAt(0) == '2' || same(input, "yes") || same(input, "no"))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		return false;
	}

	private static boolean same(String input, String string)
	{
		if (input.length() != string.length())
		{
			return false;
		}
		for (int i = 0; i < input.length(); i++)
		{
			if (input.charAt(i) != string.charAt(i))
			{
				return false;
			}
		}
		return true;
	}
}