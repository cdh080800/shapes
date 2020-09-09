package edu.cvtc.shapes;

public class Cuboid extends Shape {
	
	public Cuboid (float width, float height, float depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	@Override
	public float surfaceArea() {
		final float surfaceArea = (float) (2 * (depth * width) + 2 * (depth * height) + 2 * (height * width));
		return surfaceArea;
	}

	@Override
	public float volume() {
		final float volume = (float) (width * depth * height);
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
	
	public float width = 0;
	public float height = 0;
	public float depth = 0;
	
	public float getWidth() {
		return width;
	}
	
	public void setWidth(float width) {
		this.width = width;
	}
	
	public float getHeight() {
		return height;
	}
	
	public void setHeight(float height) {
		this.height = height;
	}
	
	public float getDepth() {
		return depth;
	}
	
	public void setDepth(float depth) {
		this.depth = depth;
	}
	

}
