public class Matrix
{
	private int[][] data;
	private int sizeX = 0, sizeY = 0;

	public Matrix(int sizeX, int sizeY)
	{
		if(sizeX < 1 || sizeY < 1) throw MatrixException("Wrong matrix size");
		this.data = new int[sizeX][sizeY];
		this.sizeX = sizeX;
		this.sizeY = sizeY;
	}

	public int getSizeX()
	{
		return sizeX;
	}

	public int getSizeY()
	{
		return sizeY;
	}

	public int getElement(int row, int column)
	{
		if(row < 0 || row >= sizeX || column < 0 || column >= sizeY)
			throw MatrixException("Wrong matrix position");
		return data[row][column];
	}

	public void setElement(int row, int column, int value)
	{
		if(row < 0 || row >= sizeX || column < 0 || column >= sizeY)
			throw MatrixException("Wrong matrix position");
		data[row][column] = value;
	}

	public Matrix sum(Matrix n)
	{
		if(n == null) throw MatrixException("Argument is null");
		if(sizeX != n.getSizeX() || sizeY != n.getSizeY())
			throw MatrixException("Matrix size is wrong");
		Matrix matrix = new Matrix(sizeX, sizeY);
		for(int i = 0; i < sizeX; i++)
			for(int j = 0; j < sizeY; j++)
				matrix = data[i][j] + n.getElement(i, j);
		return matrix;
	}

	public Matrix product(Matrix n)
	{
		if(n == null) throw MatrixException("Argument is null");
		if (sizeY != n.getSizeX()) throw MatrixException("Matrix size is wrong");
		Matrix matrix = new Matrix(sizeY, n.getSizeX());
		


		int ** data = new int*[sizey];
		for (int i = 0; i < this->sizey; i++)
			data[i] = new int[matrix.GetSizeX()];

		for (int i = 0; i < this->sizey; i++)
		{
			for (int j = 0; j < matrix.GetSizeY(); j++) {
				int sum = 0;
				for (int a = 0; a < this->sizey; a++)
					sum += this->Get(i, a) * matrix.Get(a, j);
				data[i][j] = sum;
			}
		}
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		Matrix tmp = (Matrix) obj;
		if(sizeX != tmp.sizeX || sizeY != tmp.sizeY)
			return false;
		for(int i = 0; i < sizeX; i++)
			for(int j = 0; j < sizeY; j++)
				if(data[i][j] != tmp.data[i][j]) return false;
		return true;
	}
}
