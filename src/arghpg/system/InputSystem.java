package arghpg.system;

import java.util.Set;

import org.newdawn.slick.Input;

import arghpg.component.ComponentType;
import arghpg.component.InputComponent;
import arghpg.component.VelocityComponent;

import kcomponent.Entity;
import kcomponent.EntityManager;

public class InputSystem {
	private static EntityManager componentEntityManager = EntityManager.getInstance();
	private SlickInputManager inputManager;
	
	public InputSystem() {
		inputManager = new SlickInputManager();
		inputManager.addInputKey(Input.KEY_W);
		inputManager.addInputKey(Input.KEY_S);
		inputManager.addInputKey(Input.KEY_A);
		inputManager.addInputKey(Input.KEY_D);
		
	}
	
	public void update(Input input) {
		inputManager.trackInputKeys(input);
		
		Set<Entity> entities = componentEntityManager.getEntities(ComponentType.INPUT);
		
//		for (Entity entity : entities) {
//			InputComponent inputComponent = (InputComponent)entity.getComponent(ComponentType.INPUT);
//			inputComponent.update(input);
//		}
		
		for (Entity entity : entities) {
			VelocityComponent vComponent = (VelocityComponent)entity.getComponent(ComponentType.VELOCITY);
			
			if (inputManager.keyPressed(Input.KEY_W)) {
				vComponent.setYSpeed(vComponent.getYSpeed() - 100);
			} else if (inputManager.keyReleased(Input.KEY_W)) {
				vComponent.setYSpeed(vComponent.getYSpeed() + 100);
			}
			
			if (inputManager.keyPressed(Input.KEY_S)) {
				vComponent.setYSpeed(vComponent.getYSpeed() + 100);
			} else if (inputManager.keyReleased(Input.KEY_S)) {
				vComponent.setYSpeed(vComponent.getYSpeed() - 100);
			}
			
			if (inputManager.keyPressed(Input.KEY_A)) {
				vComponent.setXSpeed(vComponent.getXSpeed() - 100);
			} else if (inputManager.keyReleased(Input.KEY_A)) {
				vComponent.setXSpeed(vComponent.getXSpeed() + 100);
			}
			
			if (inputManager.keyPressed(Input.KEY_D)) {
				vComponent.setXSpeed(vComponent.getXSpeed() + 100);
			} else if (inputManager.keyReleased(Input.KEY_D)) {
				vComponent.setXSpeed(vComponent.getXSpeed() - 100);
			}
		}
	}
}
