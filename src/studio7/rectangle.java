package studio7;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class rectangle {
	private double perimeter;
	private double area;
	public double getArea(double length, double width) {
		area = length * width;
		return area;
	}
	public double getPerimeter(double length, double width) {
		perimeter = (2 * length) + (2 * width);
		return perimeter;
	}
	public boolean square(double length, double width, boolean square) {
		square = false;
		if(length==width) {
			square = true;
			return square;
		} else
			return square;

	}
	public static void rectangleDraw(double length, double width) {
		StdDraw.clear();
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledRectangle((0.5 * width), (0.5 *length), (0.5 * width), (0.5 * length));
	}
}
