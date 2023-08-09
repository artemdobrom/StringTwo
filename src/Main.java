// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String phoneNumber = "9604157537";

        phoneNumber = phoneNumber.replace("-", "");    //тут мы удаляем все "-", которые могуть быть
        phoneNumber = phoneNumber.replace(" ", "");  // тут удалили все пробелы
        phoneNumber = phoneNumber.replace("_", "");
        phoneNumber = phoneNumber.replace("+", "");


                                                     //у строки тоже есть функия ленг,но со скобками
        if (phoneNumber.length()==10) {              //CTRL+ALT+T - и строчка от которой мы хотим сделать оператор иф
//            phoneNumber = '7' + phoneNumber;          //этим кодом мы добавили в начало, если количесво цифр 10, тогда нужно прибавить на конце цифру "7"


        } else if (phoneNumber.length() > 11) {       //тут мы доворим, что если номер длинее стандартного, тогда должна вылести ошибка
            throw new RuntimeException("Телеофон слишком длинный");    // команда для Ошибки с красными буквами в ИДЕИ "throw new RuntimeException()"
        } else if (phoneNumber.length() < 10) {
            throw new RuntimeException("Телефон слишком короткий");  //метод chartAt и в скобках тот индекс, который нас интересует (отчёт идёт с 0)
        } else if (phoneNumber.length() == 11 && phoneNumber.charAt(0) != '7') {
            throw new RuntimeException("Первая цифра не '7'");
        }

        System.out.println("phoneNumber = " + phoneNumber);

        String expectedPhone = "79604157537";    //Образец правильной формы ввода номера
        if (phoneNumber.equals(expectedPhone)) {
            System.out.println("Успех");
        } else {
            System.out.println("Номер задан в не корректной форме");
        }


    }
}