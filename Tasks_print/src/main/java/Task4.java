/*
 *** Примечание:***************************************************************************************
 * в каждом задании любое вычисляемое или просто "новое" значение следует сначала заносить в отдельную
 * переменную,  а затем выводить на экран значение этой переменной.
 ******************************************************************************************************
 */

/*
 * Задание:
 *** Напишите класс, который выводит на экран в одной строке имя человека и фамилию, в другой - телефон,
 *** всё это - в рамке из "звёздочек".
 */

public class Task4 {

    public static void main(String[] args) {

        String fio = " Пётр Петров";
        String telephon = "+375295555555";

        System.out.println("*******************");
        System.out.println("*  " + fio +"   *");
        System.out.println("*  " + telephon +"  *");
        System.out.println("*******************");

    }


}