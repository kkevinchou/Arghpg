package arghpg.component;

import kcomponent.Component;

public class PositionComponent extends Component {
	private float x;
	private float y;

	public PositionComponent(float x, float y) {
		super(ComponentType.POSITION);
		this.x = x;
		this.y = y;
	}
	
	public void integrateWithVelocity(float xDelta, float yDelta) {
		this.x += xDelta;
		this.y += yDelta;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
	
}
