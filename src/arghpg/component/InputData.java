package arghpg.component;

public class InputData {
	public boolean up;
	public boolean down;
	public boolean left;
	public boolean right;
	
	public boolean mouseDown;
	public float mouseX;
	public float mouseY;

	public InputData(boolean up, boolean down, boolean left, boolean right,
			boolean mouseDown, float mouseX, float mouseY) {
		super();
		this.up = up;
		this.down = down;
		this.left = left;
		this.right = right;
		this.mouseDown = mouseDown;
		this.mouseX = mouseX;
		this.mouseY = mouseY;
	}
	
	public InputData() {
		this(false, false, false, false, false, 0f, 0f);
	}
}
