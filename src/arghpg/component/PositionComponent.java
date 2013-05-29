package arghpg.component;

import kcomponent.Component;

public class PositionComponent extends Component {
	private int x;
	private int y;

	public PositionComponent(int x, int y) {
		super(ComponentType.POSITION);
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
}
