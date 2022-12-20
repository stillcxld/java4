public class java2 {
    public static void main(String[] args) {

       int ticket = 450; // Стоимость билета
       int bonus = 20;   // Кол-во рублей для одной бонусной мили
       int miles = (ticket/bonus);

        System.out.println("Начислено бонусных миль:");
        System.out.println(miles);
    }
}