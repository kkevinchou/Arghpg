package arghpg.entity;

import arghpg.component.GraphicsComponent;
import arghpg.component.PositionComponent;
import arghpg.component.VelocityComponent;
import kcomponent.ComponentEntity;

public class Entity extends ComponentEntity {
	public Entity(int x, int y, int width, int height) {
		PositionComponent positionComponent = new PositionComponent(0, 0);
		VelocityComponent velocityComponent = new VelocityComponent(0, 0);
		GraphicsComponent graphicsComponent = new GraphicsComponent();
		
		registerComponent(positionComponent);
		registerComponent(velocityComponent);
		registerComponent(graphicsComponent);
	}
	
}
