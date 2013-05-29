package arghpg.component;

import kcomponent.Component;

public class VelocityComponent extends Component {
	private int xSpeed;
	private int ySpeed;
	
	public VelocityComponent(int x, int y) {
		super(ComponentType.VELOCITY);
		this.xSpeed = x;
		this.ySpeed = y;
	}

	public int getXSpeed() {
		return xSpeed;
	}

	public void setXSpeed(int xSpeed) {
		this.xSpeed = xSpeed;
	}

	public int getYSpeed() {
		return ySpeed;
	}

	public void setYSpeed(int ySpeed) {
		this.ySpeed = ySpeed;
	}
}
