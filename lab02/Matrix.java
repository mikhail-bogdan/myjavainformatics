public class Matrix
{
	private int[][] data;
	private int size;

	public Matrix(int size)
	{
		this.data = new int[size][size];
		this.size = size;
		for(int i = 0; i < size; i++)
		{
			data[i][i] = 1;
		}
	}

	public Matrix sum(Matrix n)
	{
		Matrix matrix = new Matrix(size);
		for(int i = 0; i < size; i++)
		{
			for(int j = 0; j < size; j++)
			{
				matrix.setElement(i, j, getElement(i, j) + n.getElement(i, j));
			}
		}
		return matrix;
	}

	public Matrix product(Matrix n)
	{
		Matrix matrix = new Matrix(size);
		for(int i = 0; i < size; i++)
		{
			for(int j = 0; j < size; j++)
			{
				int sum = 0;
				for(int k = 0; k < size; k++)
				{
					sum += getElement(i, k) * n.getElement(k, j);
				}
				matrix.setElement(i, j, sum);
			}
		}
		return matrix;
	}

	public void setElement(int row, int column, int value)
	{
		data[row][column] = value;
	}

	public int getElement(int row, int column)
	{
		return data[row][column];
	}

	public String toString()
	{
		String line = "";
		for(int i = 0; i < size; i++)
		{
			line += "[";
			for(int j = 0; j < size - 1; j++) line += data[i][j] + ", ";
			line += "" + data[i][size - 1];
			line += "]\n";
		}
		return line;
	}
}
