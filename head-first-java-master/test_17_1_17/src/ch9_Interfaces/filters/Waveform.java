package ch9_Interfaces.filters;

public class Waveform {
	public static long counter;
	private final long id=counter++;
	public String toString(){return "Waveform"+id;}
}
