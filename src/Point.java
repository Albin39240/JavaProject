
public class Point {
	private int x;
	private int y;
	private int r;
	
	public void Point(int abs, int ord) {
		initialise(abs,ord);
	}
	public Point() {
		x=0;
		y=0;
	}
	public void initialise(int abs, int ord) {
		x = abs;
		y = ord;
	}
}
