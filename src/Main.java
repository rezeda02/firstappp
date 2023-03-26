 public class Main {

    public static void main(String[] args) {

        // запонение экрана
        if (possibility()) { // если имеется возможность купить деловой гардероб
            System.out.println("Имеется достаточно средств для покупки делового гардероба");
            System.out.println("Остаток от покупки " + balance() + " серебрянных монет");
        } else { // иначе
            System.out.println("Недостаточно средств для покупки делового гардероба");
            System.out.println(" - ");
        }
    }
    // задание полей
    static float coat = 70; // пальто
    static byte coatDiscount = 77; // скидка (в процентах)
    static float hat = 25; // шляпа
    static byte hatDiscount = 37;
    static float businesssuit = 53; // деловой костюм
    static byte businesssuitDiscount = 44;
    static float shirt = 19; // сорочка
    static float shoes =41; // туфли
    static byte shoesDiscount = 32;
    static float account = 312; // счёт пользователя

    // метод подсчёта стоимости делового гардероба
    private static float calculation() {
        // создание и инициализация переменной подсчёта стоимости
        float count = (coat * (100 - coatDiscount) + hat * (100 - hatDiscount)
                + businesssuit * (100 - businesssuitDiscount) + shirt
                + shoes * (100 - shoesDiscount)) / 100;
        return count; // возврат подсчитанного значения
    }

    // метод определения возможностей бюджета покупки делового гардероба
    private static boolean possibility() {
        if (calculation() <= account) { // если стоимость гардероба меньше имеющихся средств
            return true; // то возврат истинного значения
        } else { // иначе
            return false; // возврат ложного значения
        }
    }

    // метод определения возможной сдачи
    private static float balance() {
        if(possibility()) { // если имеется возможность купить деловой гардероб
            return account - calculation(); // то возвращается остаток от покупки
        } else { // иначе
            return -1; // возвращается маркер недостатка денежных средств
        }
    }




}
