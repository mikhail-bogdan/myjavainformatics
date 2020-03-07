public class Lab01_2
{
	public static void main(String[] args)
	{
		Circle circle = new Circle(1, 2, 10);

		System.out.print("Point (0,0) ");

		if(circle.inCircle(0, 0))
		{
			System.out.println("in circle");
		}
		else
		{
			System.out.println("not in circle");
		}

		circle = circle.scale(0.5);

		System.out.print("Point (6, 7) ");

		if(circle.inCircle(6,7))
		{
			System.out.println("in circle");
		}
		else
		{
			System.out.println("not in circle");
		}
	}
}
