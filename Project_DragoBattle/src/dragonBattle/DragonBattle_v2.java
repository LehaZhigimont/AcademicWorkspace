package dragonBattle;

import java.util.Scanner;

public class DragonBattle_v2 {

	private static int healthDragon = 200;
	private static int healthKnight = 100;
	private static int attackDragon = 3;
	private static int attackKnight = 90;
	private final static int BUFF_ATTACK_DRAGON = 1;
	private final static int DEBUFF_ATTACK_KNIGHT = 5;
	private static boolean stop = false;
	private static int round = 1;
	private static int[] arrayOptimum = new int[60];

	public static void main(String[] args) {
		@SuppressWarnings("resource") // Чтобы сканер не ругался
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the game!!!");
		int action;

		while (!stop) {
			// UI
			Status();
			System.out.println("Choise action");
			System.out.println("|Dragon attack knight  - select 1| " + " |Dragon buff self attack - select 2|");
			System.out.println("|Debuff knight attack  - select 3| " + " |Full healing Dragon     - select 4|");
			System.out.println("|Auto-batle AI - select 5|");
			System.out.println();
			// input
			action = scanner.nextInt();
			// battle
			switch (action) {
			case 1:
				System.out.println("Round: " + round);
				AttackDragon();
				AttackKnight();
				continue;
			case 2:
				System.out.println("Round: " + round);
				Buff();
				AttackKnight();
				continue;
			case 3:
				System.out.println("Round: " + round);
				Debuff();
				AttackKnight();
				continue;
			case 4:
				System.out.println("Round: " + round);
				Healing();
				AttackKnight();
				continue;
			case 5:
				// auto battle
				AutoBattleAI();
				continue;
			default:
				System.out.println("Error input");
			}

		}
	}

	private static void AttackDragon() {
		/**
		 * Метод производит механизм атаки дракона.
		 */

		healthKnight = healthKnight - attackDragon;
		System.out.println("Dragon atacked knight on " + attackDragon + " points");
		GameOver();
		round++;

	}

	private static void AttackKnight() {
		/**
		 * Метод производит механизм атаки рыцаря. После хода проверя состояние
		 * противника на живость.
		 */
		if (healthKnight > 0) {
			healthDragon = healthDragon - attackKnight;
			System.out.println("Knight atacked dragon on " + attackKnight + " points");
			GameOver();
		}
	}

	private static void Buff() {
		/**
		 * Метод производит механизм бафа атаки дракона.
		 */
		attackDragon = attackDragon + BUFF_ATTACK_DRAGON;
		System.out.println("Dragon eploy magik and buff self atack on " + BUFF_ATTACK_DRAGON + " point");
		round++;

	}

	private static void Debuff() {
		/**
		 * Метод производит механизм дебафа атаки рыцаря. Если атака уже равна
		 * 5, дебаф не производиться.
		 */

		if (attackKnight > 0) {
			attackKnight = attackKnight - DEBUFF_ATTACK_KNIGHT;
			System.out.println("Dragon eploy magik and debuff knight attack on " + DEBUFF_ATTACK_KNIGHT + " points");
			round++;

		} else {
			if (attackDragon <= 5)
				attackKnight = 5;
			System.out.println("Dragon eploy magik and debuff knight attack. Attack stay minimal, and Attack Knight = "
					+ attackKnight + " points");
			round++;

		}
	}

	private static void Healing() {
		/**
		 * Метод производит механизм лечения дракона
		 */
		healthDragon = 200;
		System.out.println("Dragon eploy magik and healing seif. Dragon HP = " + healthDragon);
		round++;
	}

	private static void Status() {
		/**
		 * Метод выводит статус параметров.
		 */
		System.out.println();
		System.out.println("HP Dragon = " + healthDragon + " || Attack Dragon = " + attackDragon);
		System.out.println("HP Knight = " + healthKnight + " || Attack Knight = " + attackKnight);
		System.out.println();
	}

	private static void GameOver() {
		/**
		 * Метод проверяет не окончилась ли игра.
		 */
		if (healthDragon <= 0) {
			// дракон умер
			stop = true;
			System.out.println("Knight Win");
			System.out.println("Roundes = " + round);
			System.out.println("Game Over");
		}
		if (healthKnight <= 0) {
			// рыцарь умер
			stop = true;
			System.out.println("Dragon Win");
			System.out.println("Roundes = " + round);
			System.out.println("Game Over");
		}
	}

	
	//private static void Restart() {
		/*
		 * Метод востанавливает параметры по умолчанию.
		 */
		//healthDragon = 200;
		//healthKnight = 100;
		//attackDragon = 3;
		//attackKnight = 90;
		//round = 1;

	//}
    

	private static void AutoBattleAI() {
		/**
		 * Метод псевдо-искуственого интелекта основан на 4 условиях:
		 * 1.Если дракон может убить рыцаря за следующий ход он убивает его.
		 * 2.Если следующим ходом дракон может умереть, он лечится.
		 * 3.Если преведущим ходом дракон колдовал и может бить, он бьёт. 
		 * 4.Если преведушие условия не выполнились, рандомно делает ход кроме лечения.
		 */
		for (int i = 0; healthKnight > 0 && healthDragon > 0; i++) {
			printArray();
			System.out.println();
			System.out.println();
			System.out.println("Round: " + round);
			Status();

			System.out.println();
			// первый ход начинаеться с дебафа
			if (i == 0) {
				Debuff();
				arrayOptimum[i] = 3;
				AttackKnight();
				continue;
			}
			// фаталити1
			if (healthKnight <= attackDragon) {
				AttackDragon();
				arrayOptimum[i] = 1;
				AttackKnight();
				continue;
			}
			// не умераем ли дракон след ходом?
			if (healthDragon <= attackKnight) {
				Healing();
				arrayOptimum[i] = 4;
				AttackKnight();
				continue;
			}
			// если дракон колдовали прошлым ходом
			if (arrayOptimum[i - 1] == 2 || arrayOptimum[i - 1] == 3) {
				AttackDragon();
				arrayOptimum[i] = 1;
				AttackKnight();
				continue;

			}
			// просто рандомный ход(кроме лечения) если не выполнелись
			// преведущие условия
			if (arrayOptimum[i - 1] == 4 || arrayOptimum[i - 1] == 1) {
				int temp = (int) ((Math.random() * 3) + 1);
				if (temp == 1) {
					AttackDragon();
					arrayOptimum[i] = 1;
					AttackKnight();
					continue;
				}
				if (temp == 2) {
					Buff();
					arrayOptimum[i] = 2;
					AttackKnight();
					continue;
				}
				if (temp == 3) {
					Debuff();
					arrayOptimum[i] = 3;
					AttackKnight();
					continue;
				}
			}
		}
		stop = true;
		printArray();

	}

	private static void printArray() {
		/**
		 * Print log optimal step
		 */
		System.out.println();
		System.out.println("Log previous steps:");
		for (int i = 0; arrayOptimum[i] != 0; i++) {

			System.out.print(arrayOptimum[i]);
		}
	}

}
