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
	}
}
