package arghpg.system;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kcommon.datastructures.SlidingList;

import org.newdawn.slick.Input;

public class SlickInputManager {

	private Map<Integer, SlidingList<Boolean>> keyHistory;
	private List<Integer> inputKeys;
	
	public SlickInputManager() {
		keyHistory = new HashMap<Integer, SlidingList<Boolean>>();
		inputKeys = new ArrayList<Integer>();
	}
	
	public void addInputKeys(List<Integer> keys) {
		inputKeys.addAll(keys);
	}
	
	public void addInputKey(int key) {
		inputKeys.add(key);
	}
	
	public void trackInputKeys(Input input) {
		for (Integer inputKey : inputKeys) {
			trackInputKey(inputKey, input);
		}
	}
	
	private void trackInputKey(int inputKey, Input input) {
		if (keyHistory.get(inputKey) == null) {
			keyHistory.put(inputKey, new SlidingList<Boolean>(2));
		}
		
		keyHistory.get(inputKey).push(input.isKeyDown(inputKey));
	}
	
	public boolean keyPressed(int key) {
		List<Boolean> history = keyHistory.get(key).getElements();
		
		if (history.size() == 0) {
			return false;
		}
		
		if (history.size() == 1) {
			if (history.get(0)) {
				return true;
			} else {
				return false;
			}
		}
		
		boolean first = history.get(0);
		boolean last = history.get(1);
		
		return !first && last;
	}
	
	public boolean keyReleased(int key) {
		List<Boolean> history = keyHistory.get(key).getElements();
		
		if (history.size() < 2) {
			return false;
		}
		
		boolean first = history.get(0);
		boolean last = history.get(1);
		
		return first && !last;
	}

}
