public class Main {
    public static void main(String[] args) {
        // Объявляем переменные для входных данных
        int ticketPrice = 13676; // Стоимость билета в рублях
        int milesPerRub = 20; // Количество рублей для одной бонусной мили

        // Рассчитываем количество бонусных миль
        int bonusMiles = ticketPrice / milesPerRub;

        // Выводим результат на экран
        System.out.println("Количество начисленных миль: " + bonusMiles);
    }
}