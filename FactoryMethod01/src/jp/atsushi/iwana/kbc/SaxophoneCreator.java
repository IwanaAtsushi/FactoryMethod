package jp.atsushi.iwana.kbc;

public class SaxophoneCreator extends AbstractCreator {
	public WindInstrumentProduct createInstrument() {
		return new Saxophone();
	}
}
