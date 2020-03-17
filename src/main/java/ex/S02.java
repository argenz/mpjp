package ex;

public class S02 {
	public static void main(String[] args) {
		
		System.out.println(S02.distance(1, 10, 2, 9));
		System.out.println(S02.distance(0, 3.55, 0, 3.55));
		System.out.println(S02.score(3.55, 3.55));
	}
	/**
	 * Average speed
	 * 
	 * @param distance in meters
	 * @param time     in seconds
	 * @return speed in meters per second
	 */
	public static double speed(double distance, double time) {
		
		double meanSpeed = distance/time;
		
		return meanSpeed;
	}

	/**
	 * Distance between (x0, y0) and (x1, y1)
	 * 
	 * @param x0 first point x
	 * @param y0 first point y
	 * @param x1 second point x
	 * @param y1 second point y
	 * @return distance
	 */
	
	public static double distance(double x0, double y0, double x1, double y1) {
		
		double dis2 = Math.pow((x0-x1),2) + Math.pow((y0-y1),2);
		double dis  = Math.sqrt(dis2);
		
		return dis;
	}

	/**
	 * Engine capacity
	 * 
	 * @param bore   in mm diameter
	 * @param stroke in mm lunghezza
	 * @param nr     number of cylinders
	 * @return the engine capacity in cm^3
	 */
	public static double engineCapacity(double bore, double stroke, double nr) {
		
		double radius = bore/20;
		double vol = Math.pow(radius, 2)*Math.PI*stroke/10;
		double capacity = vol*nr;
		return capacity;
	}

	/**
	 * Add up all the digits in an integer
	 * 
	 * @param value
	 * @return sum of digits
	 */
	public static int digitSum(int value) {
		value = Math.abs(value);
	
		int sum = 0;
		
		while (value > 0) {
			int digit = value%10;
			value = value/10;
			sum = sum + digit;
		}
		
		return sum ;
	}

	/**
	 * Score based on distance from (0, 0) [1, 5, 10] -> [10, 5, 1, 0]
	 *
	 * @param x
	 * @param y
	 *
	 * @return
	 */
	public static int score(double x, double y) {
		
		//int points = 0;
		
		double dist = S02.distance(0, 0, x, y);
		
		if (dist <= 1) {
			return 10;	
			
		}else if (dist > 1 && dist <= 5) {
			return 5;
			
		}else if (dist > 5 && dist <= 10) {
			return 1;
			
		}else {
			return 0;
		}
	}
}
