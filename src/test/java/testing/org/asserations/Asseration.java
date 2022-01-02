package testing.org.asserations;

public class Asseration {
	public static void assert1(String expected, String actual)
	{
		if (expected.equals(actual))
		{
			
			System.out.println("Asseration passed");
		}
		
		else {
			System.out.println("Asseration failed");
		}
	}

}
