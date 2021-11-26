public class DefineLeapYear {

    public static void defineLeapYear(int year) {
        if (!(year % 4 == 0) || (year % 100 == 0) && (!(year % 400 == 0))) {
            System.out.println(year + " год не високосный");
        } else {
            System.out.println(year + " год - високосный");
        }
    }
}