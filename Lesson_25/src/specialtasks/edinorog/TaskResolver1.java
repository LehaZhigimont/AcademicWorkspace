package specialtasks.edinorog;

public class TaskResolver1 {

	public static String resolveOneCase(String caseInput) {
		// e.g. caseInput = 6 2 0 2 0 2 0
		String[] inputAsArray = caseInput.split(" ");
		int N = Integer.parseInt(inputAsArray[0]); // кол-во единорогов
		int R = Integer.parseInt(inputAsArray[1]); // кол-во красногривых
		int O = Integer.parseInt(inputAsArray[2]); // кол-во оранжевогривых
		int Y = Integer.parseInt(inputAsArray[3]); // кол-во желтогривых
		int G = Integer.parseInt(inputAsArray[4]); // кол-во зеленогривых
		int B = Integer.parseInt(inputAsArray[5]); // кол-во голубогривых
		int V = Integer.parseInt(inputAsArray[6]); // кол-во фиолетовогривых

		String answer = resolveTask(N, R, O, Y, G, B, V);

		return answer;
	}

	private static String resolveTask(int N, int R, int O, int Y, int G, int B, int V) {

		char[] stall = new char[N];
		// кого поставить первым
		if (R >= Y && R >= B) {
			stall[0] = 'R';
			R--;
		} else {
			if (Y > R && Y >= B) {
				stall[0] = 'Y';
				Y--;
			} else if (B > R && B > Y) {
				stall[0] = 'B';
				B--;

			}
		}
		// проверка кого поставить следующего
		for (int i = 1; i < stall.length; i++) {

			if (stall[i - 1] == 'R') {
				if (Y > B) {
					stall[i] = 'Y';
					Y--;
				} else {
					stall[i] = 'B';
					B--;
				}
			} else if (stall[i - 1] == 'Y') {
				if (R > B) {
					stall[i] = 'R';
					Y--;
				} else {
					stall[i] = 'B';
					B--;
				}
			} else {
				if (R > Y) {
					stall[i] = 'R';
					R--;
				} else {
					stall[i] = 'Y';
					Y--;
				}

			}

			// проверка ухода в минус
			if (B < 0 || Y < 0 || R < 0 || stall[0] == stall[stall.length - 1]) {
				return "IMPOSSIBLE";
			}
			if(stall[stall.length-1]==stall[0]){
				char temp = stall[stall.length];
				stall[stall.length-1] = stall[stall.length-2];
				stall[stall.length-2] = temp;
				if(stall[stall.length-2]==stall[stall.length-3]){
					return "IMPOSSIBLE";
				}
			}
		}

		String resault = new String(stall);
		return resault;
	}

}
