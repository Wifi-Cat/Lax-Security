package keypad;


public class Keypad {
	public Button[] button;

	public Keypad() {
		button = new Button[10];
		for (int i = 0; i < button.length; i++) {
			button[i] = new Button(i);
		}

		button[0].addAdjButton(button[8]);
		button[1].addAdjButton(button[2]);
		button[1].addAdjButton(button[4]);
		button[2].addAdjButton(button[1]);
		button[2].addAdjButton(button[3]);
		button[2].addAdjButton(button[5]);
		button[3].addAdjButton(button[2]);
		button[3].addAdjButton(button[6]);
		button[4].addAdjButton(button[1]);
		button[4].addAdjButton(button[5]);
		button[4].addAdjButton(button[7]);
		button[5].addAdjButton(button[2]);
		button[5].addAdjButton(button[4]);
		button[5].addAdjButton(button[6]);
		button[5].addAdjButton(button[8]);
		button[6].addAdjButton(button[3]);
		button[6].addAdjButton(button[5]);
		button[6].addAdjButton(button[9]);
		button[7].addAdjButton(button[4]);
		button[7].addAdjButton(button[8]);
		button[8].addAdjButton(button[5]);
		button[8].addAdjButton(button[7]);
		button[8].addAdjButton(button[9]);
		button[8].addAdjButton(button[0]);
		button[9].addAdjButton(button[6]);
		button[9].addAdjButton(button[8]);

	}

}
