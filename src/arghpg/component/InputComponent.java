package arghpg.component;

import org.newdawn.slick.Input;

import kcomponent.Component;

public class InputComponent extends Component {
	private InputData inputData;
	
	public InputComponent() {
		super(ComponentType.INPUT);
		inputData = new InputData();
	}
	
	public void update(Input input) {
		inputData.up = input.isKeyDown(Input.KEY_W);
		inputData.down = input.isKeyDown(Input.KEY_S);
		inputData.left = input.isKeyDown(Input.KEY_A);
		inputData.right = input.isKeyDown(Input.KEY_D);
		
		inputData.mouseX = input.getMouseX();
		inputData.mouseY = input.getMouseY();
		inputData.mouseDown = input.isMouseButtonDown(0);
	}
	
	public InputData getInputData() {
		return inputData;
	}
}
