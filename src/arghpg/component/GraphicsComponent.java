package arghpg.component;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Rectangle;

import kcomponent.Component;

public class GraphicsComponent extends Component {
	private float width;
	private float height;
	
	public GraphicsComponent(float width, float height) {
		super(ComponentType.GRAPHICS);
		this.width = width;
		this.height = height;
	}

//	public float getWidth() {
//		return width;
//	}
//
//	public void setWidth(float width) {
//		this.width = width;
//	}
//
//	public float getHeight() {
//		return height;
//	}
//
//	public void setHeight(float height) {
//		this.height = height;
//	}
	
	public void draw(Graphics graphics, float x, float y) {
		graphics.draw(new Rectangle(x, y, width, height));
	}
}
