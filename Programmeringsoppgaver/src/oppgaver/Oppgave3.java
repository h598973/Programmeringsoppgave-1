package oppgaver;

import static javax.swing.JOptionPane.showInputDialog;

public class Oppgave3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(showInputDialog("Heltall?")); // setter inn heltall
		int x = n; // gir x en midlertidig verdi

		do {
			x = x * (n - 1);
			n--;

		} while (n > 1);
		System.out.println("n! er " + x);
	}
}
