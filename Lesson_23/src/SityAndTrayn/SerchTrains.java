package SityAndTrayn;

import java.util.Date;

/*
* найти поезд с минимальным ратоянием
* найти поезд с минмальным временем
*/

public class SerchTrains {
	public static final String[] CITYS = {"A","B","C","D"};
	public static final int[][] DISTANSE_MATRIX = 
		{{0,3,4,5}
		,{3,0,7,8}
		,{4,7,0,2}
		,{5,8,2,0}};
	public static int NUM_OF_TRAIN = 5;
	public static Train[] trains = new Train[NUM_OF_TRAIN];
	
	
	
	public static void main(String[] args) {
		Train testTrain = new Train(CITYS);
		System.out.println(testTrain);
		
		for(int i =0; i < NUM_OF_TRAIN; i++){
			trains[i] = new Train(CITYS);
		}
		//TODO Create search minDistanse
		//TODO Create search minTime

		long time = 485174528175L;
		Date d  = new Date(time);
		System.out.println(d.toString());
	}
	
}