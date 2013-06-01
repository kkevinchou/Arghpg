package arghpg.component;

import kcomponent.Component;

public class VelocityComponent extends Component {
	private float xSpeed;
	private float ySpeed;
	
	public VelocityComponent(float x, float y) {
		super(ComponentType.VELOCITY);
		this.xSpeed = x;
		this.ySpeed = y;
	}

	public float getXSpeed() {
		return xSpeed;
	}

	public void setXSpeed(float xSpeed) {
		this.xSpeed = xSpeed;
	}

	public float getYSpeed() {
		return ySpeed;
	}

	public void setYSpeed(float ySpeed) {
		this.ySpeed = ySpeed;
	}
}
