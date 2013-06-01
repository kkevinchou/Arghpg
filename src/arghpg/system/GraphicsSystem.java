package arghpg.system;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.newdawn.slick.Graphics;

import kcomponent.Entity;
import kcomponent.EntityManager;
import arghpg.component.ComponentType;
import arghpg.component.GraphicsComponent;
import arghpg.component.PositionComponent;

public class GraphicsSystem  {
	private static EntityManager componentEntityManager = EntityManager.getInstance();
	private List<Integer> graphicsComponents;
	
	public GraphicsSystem() {
		graphicsComponents = new ArrayList<Integer>();
		graphicsComponents.add(ComponentType.POSITION);
		graphicsComponents.add(ComponentType.GRAPHICS);
	}
	
	public void update(Graphics graphics) {
		Set<Entity> entities = componentEntityManager.getEntities(graphicsComponents);
		
		for (Entity entity : entities) {
			PositionComponent pComponent = (PositionComponent)entity.getComponent(ComponentType.POSITION);
			float x = pComponent.getX();
			float y = pComponent.getY();

			GraphicsComponent gComponent = (GraphicsComponent)entity.getComponent(ComponentType.GRAPHICS);
			gComponent.draw(graphics, x, y);
		}
	}
}
