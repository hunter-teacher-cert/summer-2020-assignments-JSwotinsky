import java.io.*;
import java.util.*;

/**
 *Think Java 2.12, Exercise 3
 *Jonathan Swotisnky
 */

public class Time{
	public static void main(String[] args){
		int hours = 16;
		int minutes = 19;
		int seconds = 35;
		int hoursAtStart = hours;
		int minutesAtStart = minutes;
		int secondsAtStart = seconds;
		final int SECONDS_PER_DAY = 86400;
		
		int secondsSinceMidnight = hours*3600 + minutes*60 + seconds;
		int startTotalSeconds = secondsSinceMidnight;
		int remainingSeconds = SECONDS_PER_DAY - secondsSinceMidnight;
		int percentOfDay = 100*secondsSinceMidnight/SECONDS_PER_DAY;
		
		System.out.printf("The number of seconds that has passed since midnight is %d.\n",secondsSinceMidnight);
		System.out.printf("There are %d seconds remaining today.\n",remainingSeconds);
		System.out.printf("%d%% of the day has passed.\n",percentOfDay);
		
		hours = 16;
		minutes = 47;
		seconds = 0;
		
		secondsSinceMidnight = hours*3600 + minutes*60 + seconds;
		int elapsedSeconds = secondsSinceMidnight - startTotalSeconds;
		int elapsedHours = elapsedSeconds / 3600;
		elapsedSeconds = elapsedSeconds - (3600*elapsedHours);
		int elapsedMinutes = elapsedSeconds / 60;
		elapsedSeconds = elapsedSeconds % 60; 
		
		System.out.printf("%d hours, %d minutes, and %d seconds have been spent working on this exercise.\n", elapsedHours,elapsedMinutes,elapsedSeconds);
	}
}

