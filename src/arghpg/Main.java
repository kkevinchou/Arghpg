package arghpg;

import kcomponent.EntityManager;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

import arghpg.entity.DerivedEntity;
import arghpg.system.GraphicsSystem;
import arghpg.system.InputSystem;
import arghpg.system.PhysicsSystem;

public class Main extends BasicGame {
	private static final String TITLE = "Arghpg";
	private static int WIDTH = 800;
	private static int HEIGHT = 600;
	private static int FPS = 60;
	
	PhysicsSystem physicsSystem;
	GraphicsSystem graphicsSystem;
	InputSystem inputSystem;
	EntityManager manager;

	@Override
	public void init(GameContainer container) throws SlickException {
		physicsSystem = new PhysicsSystem();
		graphicsSystem = new GraphicsSystem();
		inputSystem = new InputSystem();
		
		manager = EntityManager.getInstance();
		manager.register(new DerivedEntity(100, 100, 100, 100));
	}

	@Override
	public void render(GameContainer container, Graphics graphics) throws SlickException {
		graphicsSystem.update(graphics);
	}

	@Override
	public void update(GameContainer container, int deltaMillis) throws SlickException {
		float deltaSeconds = (float)deltaMillis / 1000;
		
		inputSystem.update(container.getInput());
		physicsSystem.update(deltaSeconds);
	}
	
	public Main(String title) {
		super(title);
	}

	public static void main(String[] args) {
		Main game = new Main(TITLE);
		try {
			AppGameContainer app = new AppGameContainer(game);
			app.setDisplayMode(WIDTH, HEIGHT, false);
			app.setTargetFrameRate(FPS);
			app.setShowFPS(true);
			app.start();
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}

}
