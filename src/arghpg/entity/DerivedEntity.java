package arghpg.entity;

import arghpg.component.GraphicsComponent;
import arghpg.component.InputComponent;
import arghpg.component.PositionComponent;
import arghpg.component.VelocityComponent;
import kcomponent.Entity;

public class DerivedEntity extends Entity {
	public DerivedEntity(int x, int y, int width, int height) {
		PositionComponent positionComponent = new PositionComponent(x, y);
		VelocityComponent velocityComponent = new VelocityComponent(0, 0);
		GraphicsComponent graphicsComponent = new GraphicsComponent(width, height);
		InputComponent inputComponent = new InputComponent();
		
		registerComponent(positionComponent);
		registerComponent(velocityComponent);
		registerComponent(graphicsComponent);
		registerComponent(inputComponent);
	}
	
}
