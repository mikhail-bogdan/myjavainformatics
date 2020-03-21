public class Lab02
{
	public static void main(String[] args)
	{
		Matrix matrix = new Matrix(2), result = new Matrix(2);
		matrix.setElement(0, 1, 1);
		matrix.setElement(1, 1, 0);
		matrix.setElement(1, 0, 1);
		result.setElement(0, 1, 1);
		result.setElement(1, 1, 0);
		result.setElement(1, 0, 1);
		System.out.println(result.toString());
		for(int i = 0; i < 9; i++)
		{
			result = result.product(matrix);
			System.out.println(result);
		}

		System.out.print("\n\n\n\n\n");

		Matrix a = new Matrix(3), b;
		a.setElement(0, 0, 3);
		a.setElement(1, 0, 1);
		a.setElement(2, 0, 2);
		a.setElement(0, 1, 3);
		a.setElement(1, 1, 1);
		a.setElement(2, 1, 2);
		a.setElement(0, 2, 3);
		a.setElement(1, 2, 1);
		a.setElement(2, 2, 2);

		System.out.println(a.toString());

		b = a.doSortRows();
		System.out.println(b.toString());
	}
}
