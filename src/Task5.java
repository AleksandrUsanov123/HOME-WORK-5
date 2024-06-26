public class Task5 {
    System.out.println("Задание: 5");
    int[] array = new int[10];

    // Заполнение массива случайными числами от -10 до +10
    for (int i = 0; i < array.length; i++) {
        array[i] = getRandomNumber(-10, 10);
    }

    // Подсчет повторяющихся значений и вывод на консоль
    for (int i = 0; i < array.length; i++) {
        int count = 0;
        for (int j = i + 1; j < array.length; j++) {
            if (array[i] == array[j]) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println(array[i] + " - " + (count + 1) + " раз(a)");
        }
    }
}

// Метод для генерации случайного числа в заданном диапазоне
public static int getRandomNumber(int min, int max) {
    return (int) (Math.random() * (max - min + 1) + min);



}
