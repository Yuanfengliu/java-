package ch9_Interfaces.filters;

public class Filter {
	public String name(){
		return getClass().getSimpleName();
	}
	public Waveform process(Waveform input){return input};
}
