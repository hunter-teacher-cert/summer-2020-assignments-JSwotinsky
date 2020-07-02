import java.io.*;
import java.util.*;

public class Time{
	// your time class code goes in here
	private int hour;
	private int minute;
	private double second;	
    
	public Time(){
		this.hour = 0;
		this.minute = 0;
		this.second = 0.0;
	}// end Time() constructor
	
	public Time(int hour, int minute, double second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;	
	}// end Time(hour,minute, second) constructor


	/*
	Getter (accessor) methods for hour, second, and minute:
	*/

	public int getHour(){
		return this.hour;
	}// end getHour

	public int getMinute(){
		return this.minute;
	}// end getMinute

	public double getSecond(){
		return this.second;
	}// end getSecond
	
	
	/*
	Setter (mutator) methods for hour, second, and minute:
	*/

	public void setHour(int hour){
		this.hour = hour;
	}// end setHour

	public void setMinute(int minute){
		this.minute = minute;
	}// end setMinute

	public void setSecond(double second){
		this.second = second;
	}// end setSecond
	
	
	/*
	Print time methods:
	*/
	public static void printTime(Time t){
		System.out.printf("%02d:%02d:%04.1f\n",t.hour,t.minute,t.second);
	}// end printTime

	
	public void printTime2(){
		System.out.printf("%02d:%02d:%04.1f\n",hour,minute,second);
	}// end printTime
	
	
	/*
	Time to String methods
	*/
	public String toString() {
		return String.format("%02d:%02d:%04.1f", this.hour, this.minute, this.second);
	}// end toString

	/*
	Equals methods
	*/
	public boolean equals(Time that){
		return this.hour == that.hour && this.minute == that.minute && this.second == that.second;
	}// end equals
	
}
