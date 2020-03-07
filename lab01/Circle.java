class Circle
{
	private double x, y, radius;

	public Circle(double x, double y, double radius)
	{
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public boolean inCircle(double x, double y)
	{
		if((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y) > radius * radius)
			return false;
		return true;
	}

	public Circle scale(double factor)
	{
		return new Circle(this.x, this.y, this.radius * factor);
	}
}
