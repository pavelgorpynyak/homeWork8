import java.time.LocalDate;

public class Main {

    public static void methodOfLeapYearCalculation(int year) {

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " Это високосный год!");
        } else {
            System.out.println(year + " Это не високосный год!");
        }
    }

    public static void installationOsAdviceMethod(int clientOS, int clientDeviseYear) {

        if (clientOS == 1 && clientDeviseYear >= 2015) {
            System.out.println( "Пожалуйста установите приложение для Android по ссылке" );
        } else if (clientOS == 0 && clientDeviseYear >=2015) {
            System.out.println( "Пожалуйста установите приложение для IOS по ссылке" );
        } else if (clientOS == 1 && clientDeviseYear < 2015) {
            System.out.println( "Пожалуйста установите облегченное приложение для Android по ссылке" );
        } else if ( clientOS == 0 && clientDeviseYear < 2015) {
            System.out.println( "Пожалуйста установите приложение для IOS по ссылке" );
        }
    }

    public static int deliveryDayCalculation(int deliveryDistance) {

        if (deliveryDistance <= 20) {
            System.out.println( "Необходимо дней для доставки:" + " 1. ");
        } else if ( deliveryDistance >= 21 && deliveryDistance <= 60) {
            System.out.println( "Необходимо дней для доставки:" + " 2. ");
        } else if ( deliveryDistance >= 61 && deliveryDistance <= 100 ) {
            System.out.println( "Необходимо дней для доставки:" + " 3. ");
        }
        return deliveryDistance;
    }


    public static void main(String[] args) {
        // Задание 1
        int year = 2020;
        methodOfLeapYearCalculation(year);

        // Задание 2
        int clientOS = 0;
        int clientDeviseYear = LocalDate.now().getYear();
        installationOsAdviceMethod(clientOS,clientDeviseYear);

        // Задание 3
        int deliveryDistance = 95;
        deliveryDayCalculation(deliveryDistance);

    }
}