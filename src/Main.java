import java.util.HashMap;
public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Задача 1");
		task1();
		System.out.println("\nЗадача 2");
		task2();
		System.out.println("\nЗадача 3");
		task3();
		System.out.println("\nЗадача 4");
		task4();
		System.out.println("\nЗадача 5");
		task5();
		System.out.println("\nЗадача 6");
		task6();
		System.out.println("\nЗадача 7");
		task7();
		System.out.println("\nЗадача 8");
		task8();
	}

	//Задача 1
	//Объявите переменные типа int, byte, short, long, float, double.
	//Название переменных может быть любым, но если состоит из двух слов и более, должно соответствовать правилу camelCase.
	//Выведите в консоль значение каждой переменной в формате «Значение переменной … с типом … равно …».
	public static void task1()
	{
		int thirtyTwoBit = 2147483647;
		System.out.println("Значение переменной thirtyTwoBit с типом int равно " + thirtyTwoBit);

		byte eightBit = 127;
		System.out.println("Значение переменной eightBit с типом byte равно " + eightBit);

		short sixteenBit = 32767;
		System.out.println("Значение переменной sixteenBit с типом short равно " + sixteenBit);

		long sixtyFourBit = 2L;
		System.out.println("Значение переменной sixtyFourBit с типом long равно " + sixtyFourBit);

		float earthdiggers = 1.5f;
		System.out.println("Значение переменной earthdiggers с типом float равно " + earthdiggers);

		double pie = 3.14159265358979;
		System.out.println("Значение переменной pie с типом double равно " + pie);
	}

	//Задача 2
	//Ниже дан список различных значений. Инициализируйте переменные, используйте изученные ранее типы переменных.
	//Значения:
	//27.12
	//987 678 965 549
	//2,786
	//569
	//-159
	//27897
	//67
	public static void task2()
	{
		float firstValue = 27.12f;
		long secondValue = 987678965549L;
		double thirdValue = 2.786;
		short fourthValue = 569;
		int fifthValue = -159;
		int sixthValue = 27897;
		byte seventhValue = 67;
		System.out.println("В ТЗ не указана необходимость вывода информации в консоль");
	}

	//Задача 3
	//Три школьных учителя, Людмила Павловна, Анна Сергеевна и Екатерина Андреевна, ведут три класса.
	//У Людмилы Павловны — 23 ученика , у Анны Сергеевны — 27 учеников, у Екатерины Андреевны — 30 учеников.
	//Три учительницы закупили все вместе 480 листов бумаги на все три класса. Посчитайте, сколько достанется листов каждому ученику.
	//Результат задачи выведите в консоль в формате: «На каждого ученика рассчитано … листов бумаги».
	//Для объявления переменных не используйте тип var.
	public static void task3()
	{
		int studentsOfLyudmilaPavlovna = 23;
		int studentsOfAnnaSergeevna = 27;
		int studentsOfEkaterinaAndreevna = 30;
		int paperAmount = 480;
		int paperPerStudent = paperAmount / (studentsOfAnnaSergeevna + studentsOfEkaterinaAndreevna + studentsOfLyudmilaPavlovna);
		System.out.printf("На каждого ученика рассчитано %s листов бумаги\n", paperPerStudent);
	}

	//Задача 4
	//Производительность машины для изготовления бутылок — 16 бутылок за 2 минуты. Какая производительность машины будет:
	//за 20 минут,
	//в сутки,
	//за 3 дня,
	//за 1 месяц?
	//Рассчитывайте производительность работы машины в том случае, если она работает без перерыва заданный промежуток времени.
	//Результаты подсчетов выведите в консоль в формате: «За … машина произвела … штук бутылок».
	//Для объявления переменных не используйте тип var.
	public static void task4()
	{
		int bottlesPerTwoMinutes = 16;
		int bottlesPerMinute = bottlesPerTwoMinutes / 2;
		System.out.println("За 20 минут машина произвела " + (20 * bottlesPerMinute) + " штук бутылок");
		System.out.println("За сутки машина произвела " + (24 * 60 * bottlesPerMinute) + " штук бутылок");
		System.out.println("За трое суток машина произвела " + (3 * 24 * 60 * bottlesPerMinute) + " штук бутылок");
		System.out.println("За месяц машина произвела " + (30 * 24 * 60 * bottlesPerMinute) + " штук бутылок");
	}

	//Задача 5
	//На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой. На один класс уходит 2 банки белой и 4 банки коричневой краски. Сколько банок каждой краски было куплено?
	//Выведите результат задачи в консоль в формате: «В школе, где … классов, нужно … банок белой краски и … банок коричневой краски».
	//Для объявления переменных не используйте тип var.
	public static void task5()
	{
		int totalPaintAmount = 120;
		int whitePaintPerRoom = 2;
		int brownPaintPerRoom = 4;
		int roomsCount = totalPaintAmount / (whitePaintPerRoom + brownPaintPerRoom);
		int totalWhitePaintAmount = roomsCount * whitePaintPerRoom;
		int totalBrownPaintAmount = roomsCount * brownPaintPerRoom;
		System.out.println("В школе, где " + roomsCount + " классов, нужно " + totalWhitePaintAmount + " банок белой краски и " + totalBrownPaintAmount + " банок коричневой краски");
	}

	//Задача 6
	//Спортсмены следят за своим весом и тщательно относятся к тому, что и сколько они съедают.
	//Вот один из рецептов, по которому спортсмен готовит себе завтрак:
	//Бананы — 5 штук (1 банан — 80 грамм).
	//Молоко — 200 мл (100 мл = 105 грамм).
	//Мороженое-пломбир — 2 брикета по 100 грамм.
	//Яйца сырые – 4 яйца (1 яйцо — 70 грамм).
	//Смешать всё в блендере — и готово.
	//Подсчитайте вес (количество граммов) такого спортзавтрака, а затем переведите его в килограммы.
	//Результат в граммах и килограммах напечатайте в консоль.
	public static void task6()
	{
		int bananaCount = 5;
		int bananaWeight = 80;

		int milkAmount = 2;
		int milkWeight = 105;

		int icecreamCount = 2;
		int icecreamWeight = 100;

		int eggCount = 4;
		int eggWeight = 70;

		int totalWeight = bananaCount * bananaWeight +
				milkAmount * milkWeight +
				icecreamCount * icecreamWeight +
				eggCount * eggWeight;

		float totalWeightInKilograms = (float)totalWeight / 1000;

		System.out.println("Вес завтрака в килограмах равен " + totalWeightInKilograms);
		System.out.println("Вес завтрака в граммах равен " + totalWeight);
	}

	//Задача 7
	//Правила соревнований обновились, и спортсмену, чтобы оставаться в своей весовой категории, нужно сбросить 7 кг. Тренер скорректировал рацион так, чтобы спортсмен мог терять в весе от 250 до 500 грамм в день.
	//Посчитайте, сколько дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм, а сколько — если каждый день будет худеть на 500 грамм.
	//Посчитайте, сколько может потребоваться дней в среднем, чтобы добиться результата похудения.
	//Результаты всех подсчетов выведите в консоль.
	public static void task7()
	{
		int weightToLose = 7000;
		int weightLostPerDayFloor = 250;
		int weightLostPerDayCeiling = 500;

		int minDaysToLoseWeight = weightToLose / weightLostPerDayCeiling;
		int maxDaysToLoseWeight = weightToLose / weightLostPerDayFloor;

		float averageLossPerDay = (float) (weightLostPerDayFloor + weightLostPerDayCeiling) / 2;
		float averageDaysToLoseWeight = weightToLose / averageLossPerDay;
		System.out.println("Минимальное количество дней, необходимое для потери нужного веса, равно " + minDaysToLoseWeight);
		System.out.println("Максимальное количество дней, необходимое для потери нужного веса, равно " + maxDaysToLoseWeight);
		System.out.println("Среднее количество дней, необходимое для потери нужного веса, равно " + averageDaysToLoseWeight);
	}

	//Задача 8
	//Представим, что мы работаем в большой компании, штат которой состоит из нескольких сотен сотрудников. В компании есть правило: чем дольше сотрудник работает в компании, тем ценнее он для бизнеса. Поэтому сотрудники, которые работают в компании дольше 3 лет, получают повышение зарплаты раз в год. Каждый год повышение составляет 10% от текущей зарплаты.
	//К вам пришел руководитель с задачей автоматизировать повышение зарплаты, а также провести расчет для следующих сотрудников:
	//Маша получает 67 760 рублей в месяц.
	//Денис получает 83 690 рублей в месяц.
	//Кристина получает 76 230 рублей в месяц.
	//Каждому нужно увеличить зарплату на 10% от текущей месячной. Дополнительно руководитель попросил посчитать разницу между годовым доходом с нынешней зарплатой и после повышения.
	//Посчитайте, сколько будет получать каждый из сотрудников, а также разницу между годовым доходом до и после повышения.
	//Выведите в консоль информацию по каждому сотруднику. Например: «Маша теперь получает ... рублей. Годовой доход вырос на ... рублей».
	public static void task8()
	{
		HashMap<String, Float> salary = new HashMap();
		salary.put("Маша", (float)67760);
		salary.put("Денис", (float)83690);
		salary.put("Кристина", (float)76230);

		float increaseRate = 1.1f;

		salary.forEach((key, value) -> {
			float newValue = value * increaseRate;
			salary.put(key, newValue);
			System.out.printf("%s теперь получает %s рублей в месяц, годовой доход увеличился на %s рублей\n", key, newValue, ((newValue - value) * 12));
		});
	}
}
