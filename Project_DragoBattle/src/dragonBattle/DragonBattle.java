package dragonBattle;

import java.util.Scanner;

public class DragonBattle {
	private static int healthDragon = 200;
	private static int healthKnight = 100;
	private static int attackDragon = 3;
	private static int attackKnight = 90;
	private final static int BUFF_ATTACK_DRAGON = 1;
	private final static int DEBUFF_ATTACK_KNIGHT = 5;
	private static boolean stop = false;
	private static int round = 1;
	private static int[] arrayOptimum = new int[70];

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the game!!!");
		int action;

		while (!stop) {
			// UI
			Status();
			System.out.println("Choise action");
			System.out.println("|Dragon attack knight  - select 1| " + " |Dragon buff self attack - select 2|");
			System.out.println("|Debuff knight attack  - select 3| " + " |Full healing Dragon     - select 4|");
			System.out.println("|Auto-batle - select 5|");
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
				AutoBattle();
				continue;
			default:
				System.out.println("Error input");
			}

		}
	}

	private static void AttackDragon() {
		/*
		 * Метод производит механизм атаки дракона.
		 */

		healthKnight = healthKnight - attackDragon;
		System.out.println("Dragon atacked knight on " + attackDragon + " points");
		GameOver();
		round++;

	}

	private static void AttackKnight() {
		/*
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
		/*
		 * Метод производит механизм бафа атаки дракона.
		 */
		attackDragon = attackDragon + BUFF_ATTACK_DRAGON;
		System.out.println("Dragon eploy magik and buff self atack on " + BUFF_ATTACK_DRAGON + " point");
		round++;

	}

	private static void Debuff() {
		/*
		 * Метод производит механизм дебафа атаки рыцаря. <br> <i>Если атака уже
		 * равна 5, дебаф не производиться</i>
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
		/*
		 * Метод производит механизм лечения дракона
		 */
		healthDragon = 200;
		System.out.println("Dragon eploy magik and healing seif. Dragon HP = " + healthDragon);
		round++;
	}

	private static void Status() {
		/*
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
			stop = true;
			System.out.println("Knight Win");
			System.out.println("Roundes = " + round);
			System.out.println("Game Over");
		}
		if (healthKnight <= 0) {
			stop = true;
			System.out.println("Dragon Win");
			System.out.println("Roundes = " + round);
			System.out.println("Game Over");
		}
	}

	private static void Restart() {
		/*
		 * Метод востанавливает параметры по умолчанию.
		 */
		healthDragon = 200;
		healthKnight = 100;
		attackDragon = 3;
		attackKnight = 90;
		round = 1;

	}

	//
	//
	//
	//
	//
	//
	//
	//
	//
	//
	//
	@SuppressWarnings("resource")
	private static void AutoBattle() {
		/*
		 * Метод вызывает метод поиска оптимальной последовательности действий.
		 * Затем выводит его и предлагае вручную проверить или вести
		 * автоматически.
		 */
		Scanner scanner = new Scanner(System.in);
		SearchOptimal();
		int button;
		System.out.println();
		System.out.println("Optimal batle:");
		System.out.println();

		// отображение 'оптимальной' последовательности
		for (int i = 0; arrayOptimum[i] != 0; i++) {
			System.out.print(arrayOptimum[i] + "|");
			if (i % 9 == 0)
				System.out.println(); // первод строки для удобства

		}

		System.out.println("Push '1' and enter, if you want auto-input");
		System.out.println("If you want input manual, input 2");
		button = scanner.nextInt();
		/////////////////
		// Выполняет ПК//
		/////////////////
		if (button == '1') {
			for (int i = 0; arrayOptimum[i] != 0; i++) {
				// просто подставляються значения ячейки для действия
				Status();// для отладки

				if (arrayOptimum[i] == 1)
					AttackDragon();
				if (arrayOptimum[i] == 2)
					Buff();
				if (arrayOptimum[i] == 3)
					Debuff();
				if (arrayOptimum[i] == 4)
					Healing();
				AttackKnight();
			}
		}
		// если ввести 2 програма просто вернется к стартовому
		// меню

	}

	private static void SearchOptimal() {
		/**
		 * Метод ищет оптимальное количество ходов и записывает их в масив
		 * длиной 70 т.к. вручную было выявлено что отимальных ходов меньше.
		 * Также длинна масива и являеться ограниченим вариаций.
		 * 
		 **/
		int[] array = new int[70];
		int countOptimum = array.length;
		// long variables = (long) (Math.pow(4, 70));
		// ускоряем проверку уменьшив ограничив время поиска, всеравно рандом с
		// малой вероятностью создаст нужные последовательности
		long variables = 10000000;

		for (long variablesCount = 1; variablesCount < variables; variablesCount++) {
			Restart();// Проверяем возможные вариации

			// создание масива и заполнение вариациями;
			/////////////////////////////////////////////////////
			// нужно придумать алгоритм перебора всех возможных вариатнов
			for (int i = 0; i < countOptimum; i++) {
				array[i] = (int) (Math.random() * 5);
				if (array[i] == 0) {
					array[i] = 4;
				}
			}
			////////////////////////////////////////////////////
			int count = 0;
			// проверка массива на оптимальность
			for (int i = 0; i < countOptimum; i++) {
				// просто подставляються значения ячейки для действия
				// Status();//для отладки

				if (array[i] == 1)
					AttackDragon();
				if (array[i] == 2)
					Buff();
				if (array[i] == 3)
					Debuff();
				if (array[i] == 4)
					Healing();
				// после дракона ходит рыцарь
				AttackKnight();
				//
				//
				// условие продолжения цикла
				if (healthDragon <= 0)
					break;// если дракон умер выходим из неправильной
							// последовательности

				if (healthKnight > 0) {
					count++;
				}
				// если оптимальные ходы найдены(рыцарь мертв), записываем их в
				// правильный масив
				else {
					if (count < countOptimum) {
						countOptimum = count;// тут как бы должен был
												// создоваться масив
												// исключительно нужной длинны
						// но т.к. я захотел разделить методы поиска и
						// выполнения пришлось создать глобальную ссылку просто
						// с большим масивом.
						for (int j = 0; j < arrayOptimum.length; j++) {
							arrayOptimum[j] = array[j];
						}
						break;
					}
				}
				// отладочная информация
				System.out.println();
				System.err.println("countOptimum = " + countOptimum);
				System.err.println("count = " + count);
				System.err.println("variablesCount = " + variablesCount);
				System.out.println();
			}
		}
		Restart();
	}
}
