package jp.atsushi.iwana.kbc;

public abstract class WindInstrumentProduct {

	private String plate;	//ネームプレート

	//ネームプレートを付ける
	public void setPlate( String plate ) {
		this.plate = plate;
	}

	//ネームプレート表示
	public void printPlate() {
		System.out.println("名前：" + plate);
	}

	//演奏テスト
	public abstract void play();
}
