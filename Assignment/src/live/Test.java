package live;

import music.Playable;
import music.String.Veena;
import music.wind.Saxophone;

public class Test {

	public static void main(String[] args) {
		Playable ob= new Veena();
		ob.play();
       ob=new Saxophone();
       ob.play();
	}

}
