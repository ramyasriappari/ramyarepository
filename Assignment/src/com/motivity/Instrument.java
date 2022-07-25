package com.motivity;

abstract class Instrument {
	abstract void play();
}
	class Piano extends Instrument
	{
		void play()
		{
		System.out.println("Piano sounds like:tan tan tan");
		}
	}
		class Flute extends Instrument
		{
			void play()
			{
				System.out.println("Flute sounds like:toot toot toot");
			}
		}
			class Guitar extends Instrument
			{
				void play()
				{
					System.out.println("Guitar sounds like:tin tin tin");
				}
				
			}
		
	

	


