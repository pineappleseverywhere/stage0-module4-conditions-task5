package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        boolean isLeap = false;

        // Проверяем, делится ли год на 4
        if (year % 4 == 0) {
            // Если год делится на 4, проверяем, делится ли он на 100
            if (year % 100 == 0) {
                // Если год делится на 100, проверяем, делится ли он на 400
                if (year % 400 == 0) {
                    isLeap = true;
                }
            } else {
                isLeap = true;
            }
        }

        if (isLeap) {
            System.out.println("leap");
        } else {
            System.out.println("not leap");
        }
    }
}
