package keypad;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Keypad k = new Keypad();
		Scanner sc = new Scanner(System.in);
		int numPints = sc.nextInt();
		String[] validPints = new String[numPints];

		for (int i = 0; i < validPints.length; i++) {
			validPints[i] = sc.next();
		}

		int numTests = sc.nextInt();

		List<String> candidatePins = new ArrayList<String>();
		for (int l = 0; l < validPints.length; l++) {
			candidatePins.add(validPints[l]);
		}

		for (int i = 0; i < numTests; i++) { // for all input pins
			String pin = sc.next();
			System.out.print(pin + " ");
			boolean foundPin = false;

			for (String candidate : candidatePins) { // for all candidates
				boolean hasOneError = false;
				boolean invalidCandidate = true;

				for (int j = 0; j < 5; j++) { // for each character
					Button b = k.button[Integer.parseInt(pin.charAt(j) + "")];
					Button compareTo = k.button[Integer.parseInt(candidate
							.charAt(j) + "")];
					if (b.compareTo(compareTo) == 1) { // adjacent buttons
						if (hasOneError) {
							invalidCandidate = true;
							break;
						} else {
							invalidCandidate = false;
							hasOneError = true;
						}
					} else if (b.compareTo(compareTo) == 0) { // same
						invalidCandidate = false;
					} else {
						invalidCandidate = true;
						break;
					}
				}
				if (!invalidCandidate) {
					System.out.println(" VALID " + candidate);
					foundPin = true;
					break;
				}
			}
			if (!foundPin)
				System.out.println(" INVALID");
		}

		System.out.print("END OF OUTPUT");
	}
}
