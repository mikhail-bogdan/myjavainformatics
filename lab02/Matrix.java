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

	public Matrix(Matrix matrix)
	{
		this(matrix.size);

		for(int i = 0; i < size; i++)
		{
			for(int j = 0; j < size; j++)
			{
				setElement(i, j, matrix.getElement(i, j));
			}
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
		StringBuilder line = new StringBuilder();
		for(int i = 0; i < size; i++)
		{
			line.append("[");
			for(int j = 0; j < size - 1; j++) line.append(getElement(i, j) + ", ");
			line.append(getElement(i, size - 1) + "]\n");
		}
		return line.toString();
	}

	private int rowWeight(int i)
	{
		int sum = 0;
		for(int j = 0; j < size; j++)
			sum += getElement(i, j);
		return sum;
	}

	private void swapRows(int index1, int index2)
	{
		int tmp;
		for(int j = 0; j < size; j++)
		{
			tmp = getElement(index1, j);
			setElement(index1, j, getElement(index2, j));
			setElement(index2, j, tmp);
		}
	}

	public Matrix doSortRows()
	{
		Matrix matrix = new Matrix(this);
		for(int i = 0; i < size; i++)
		{
			for(int j = i + 1; j < size; j++)
			{
				if(matrix.rowWeight(i) > matrix.rowWeight(j))
				{
					//System.out.println("" + i + "   " + j);
					matrix.swapRows(i, j);
				}
			}
		}
		return matrix;
	}
}
