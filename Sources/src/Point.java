public class Point {
	private int x,y;
	
	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	public Point()
	{
		this(0,0);
	}
	
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
}