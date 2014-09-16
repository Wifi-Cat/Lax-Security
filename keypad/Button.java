package keypad;

import java.util.ArrayList;
import java.util.List;

public class Button implements Comparable<Button> {
	/*
	 * The number
	 */
	int label;
	List<Button> adjacent;

	public Button(int label) {
		adjacent = new ArrayList<Button>();
		this.label = label;
	}

	public void addAdjButton(Button adj) {
		adjacent.add(adj);
	}

	@Override
	public int compareTo(Button o) {
		return o == this ? 0 : adjacent.contains(o) ? 1 : -1;
	}

}
