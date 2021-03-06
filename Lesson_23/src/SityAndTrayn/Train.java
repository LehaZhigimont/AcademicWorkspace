
package SityAndTrayn;

import java.util.Date;

public class Train {
	private int[] route;
	private long[] schedule;
	private static final long HOUR = 3600000L;
	private static final long H24 = HOUR * 24;

	public Train(String[] citys) {

		route = new int[((int)(Math.random())) * citys.length+4];
		
		for (int i = 0; i < route.length; i++) {
			route[i] = (int) (Math.random() * route.length);
			if (i != 0 && route[i - 1] == route[i]) {
				i--;
			}
		}

		schedule = new long[route.length];

		schedule[0] = System.currentTimeMillis() + (int) (Math.random()) * H24;

		for (int i = 1; i < schedule.length; i++) {
			schedule[i] = schedule[i - 1] + ((int)(Math.random() * HOUR));
		}
	}

	public Train(int[] route, long[] schedule) {
		this.route = route;
		this.schedule = schedule;
	}

	@SuppressWarnings("deprecation")
	@Override
	public String toString() {
		String firstLine = "";
		String secondLine = "";
		for (int i = 0; i < route.length; i++) {
			firstLine = firstLine + "|" + SerchTrains.CITYS[route[i]] + "\t";
		}
		firstLine = firstLine + "\n";
		for (int i = 0; i < schedule.length; i++) {
			Date d = new Date(schedule[i]);
			secondLine = secondLine + d.getHours() + ":" + d.getMinutes() + "\t";
		}

		return firstLine + secondLine;
	}

	public int[] getRoute() {
		return route;
	}

	public void setRoute(int[] route) {
		this.route = route;
	}

	public long[] getSchedule() {
		return schedule;
	}

	public void setSchedule(long[] schedule) {
		this.schedule = schedule;
	}
}
