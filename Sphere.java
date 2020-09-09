package edu.cvtc.shapes;

public class Sphere extends Shape {
	
	public Sphere (float radius) {
		this.radius = radius;
	}

	@Override
	public float surfaceArea() {
		final float surfaceArea = (float) (12.56 * (radius * radius));
		return surfaceArea;
	}

	@Override
	public float volume() {
		final float volume = (float) (3.93 * (radius * radius * radius));
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
	
	public float getRadius() {
		return radius;
	}
	
	public void setRadius(float radius) {
		this.radius = radius;
	}

}
