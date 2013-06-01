package arghpg.system;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import arghpg.component.ComponentType;
import arghpg.component.PositionComponent;
import arghpg.component.VelocityComponent;

import kcomponent.Entity;
import kcomponent.EntityManager;

public class PhysicsSystem {
	private static EntityManager componentEntityManager = EntityManager.getInstance();
	private List<Integer> physicsComponents;
	
	public PhysicsSystem() {
		physicsComponents = new ArrayList<Integer>();
		physicsComponents.add(ComponentType.POSITION);
		physicsComponents.add(ComponentType.VELOCITY);
	}

	public void update(float delta) {
		Set<Entity> entities = componentEntityManager.getEntities(physicsComponents);
		for (Entity entity : entities) {
			VelocityComponent vComponent = (VelocityComponent)entity.getComponent(ComponentType.VELOCITY);
			float xDelta = vComponent.getXSpeed() * delta;
			float yDelta = vComponent.getYSpeed() * delta;

			PositionComponent pComponent = (PositionComponent)entity.getComponent(ComponentType.POSITION);
			pComponent.integrateWithVelocity(xDelta, yDelta);
		}
	}

}
