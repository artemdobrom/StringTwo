// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String phoneNumber = "9604157537";
        if (phoneNumber.length()==10) {                                         //у строки тоже есть функия ленг,но со скобками
                                                       //CTRL+ALT+T - и строчка от которой мы хотим сделать оператор иф
            phoneNumber = '7' + phoneNumber;          //этим кодом мы сказали, что если количесво цифр 10, тогда нужно прибавить на конце цифру "7"

        } else if (phoneNumber.length() > 11) {       //тут мы доворим, что если номер длинее стандартного, тогда должна вылести ошибка
            throw new RuntimeException("Телеофон слишком длинный");    // команда для Ошибки с красными буквами в ИДЕИ "throw new RuntimeException()"
        } else if (phoneNumber.length() < 10) {
            throw new RuntimeException("Телефон слишком короткий");
        }


        System.out.println("phoneNumber = " + phoneNumber);

    }
}