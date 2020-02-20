public class Int
{
	private int value = 0;

	public String toString()
	{
		return "" + value;
	}

	public void increment()
	{
		value++;
	}

	public void decrement()
	{
		value--;
	}

	public void add(Int n)
	{
		value += n.value;
	}

	public void substract(Int n)
	{
		value -= n.value;
	}
}
