package chipmunk.java;

public class Segment extends Shape {

	public Segment(Body body_, Vec2 p0, Vec2 p1, float offset) {
		vertices = new Vec2[2];
		vertices[0] = p0;
		vertices[1] = p1;
		currentPosition = new Vec2[vertices.length];
		body = body_;
	}		
	
	public boolean collides(Poly poly) {
		return false;
	}	
	
	public boolean collides(Segment segment) {
		return false;
	}

	public boolean collides(Circle circle) {
		return false;
	}	
}	
