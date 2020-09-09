package edu.cvtc.shapes;

public class Cylinder extends Shape {
	
	public Cylinder (float radius, float height) {
		this.radius = radius;
		this.height = height;
	}

	@Override
	public float surfaceArea() {
		final float surfaceArea = (float) (6.28 * (radius * height));
		return surfaceArea;
	}

	@Override
	public float volume() {
		final float volume = (float) (3.14 * (radius * radius)*(height));
		return volume;
	}

	@Override
	public String render() {
		
		if (surfaceArea() < 0 || volume() < 0) {
			final String render = "The surface area and voulme can't be negative.";
			return render;
		}else {
			final String render = "The shapes surface area is " + surfaceArea()
			+ "The shapes volume is " + volume();
			return render;
		}
		
	}
	
	
	public float radius = 0;
	public float height = 0;
	
	public float getHeight() {
		return height;
	}
	
	public void setHeight(float height) {
		this.height = height;
	}
	
	public float getRadius() {
		return radius;
	}
	
	public void setRadius(float radius) {
		this.radius = radius;
	}

}
