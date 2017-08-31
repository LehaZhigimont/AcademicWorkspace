package getInput;

import java.util.Scanner;

public class GetIntPositive
{
	@SuppressWarnings("resource")
	public static int get()
	{
		Scanner take = new Scanner(System.in);

		String input = take.nextLine();

		while (!check(input))
		{
			System.out.println("Wrong Input. Retry >>");
			input = take.nextLine();
		}
		//take.close();
		
		return Integer.parseInt(input);
	}

	public static boolean check(String input)
	{
		if (input.length() < 1 || input.length() > 11)
		{
			return false;
		}
		
		for (int i = 0; i < input.length(); i++)
		{
			boolean exist = false;
			for (char j = '0'; j <= '9'; j++)
			{
				if (j == input.charAt(i))
				{
					exist = true;
					break;
				}
			}
			if (!exist)
			{
				return false;
			}
		}
		if (input.length() > 8)
		{
			Long one = Long.parseLong(input);
			if (one < 1 || one > 2147483647)
			{
				return false;
			}
		}
		return true;
	}
}