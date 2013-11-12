package jp.atsushi.iwana.kbc;

public class Main {

	public static void main(String[] args) {

		SaxophoneCreator s = new SaxophoneCreator();
		TrumpetCreator t = new TrumpetCreator();

		WindInstrumentProduct wp1 = s.create();
		WindInstrumentProduct wp2 = t.create();

		wp1.play();
		wp2.play();

	}

}
