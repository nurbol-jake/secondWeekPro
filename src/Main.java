import java.util.Scanner;

    public static double calculateTicketPrice(int age, double basePrice) {
        if (age <= 7) {
            return 0;
        }
        if (age >= 8 && age <= 17) {
            return basePrice * 0.5;
        }
        if (age >= 18 && age <= 64) {
            return basePrice;
        }
        return basePrice * 0.7;
    }

    public static double calculate(double num1, double num2, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) {
                    System.out.println("на ноль делить нельзя!");
                    return 0;
                }
                return num1 / num2;
            default:
                System.out.println("Ошибка:");
                return 0;
        }
    }

    public static int getDaysInMonth(int month, boolean isLeapYear) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
           case 2:
                if (isLeapYear == true) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return -1;
        }
    }
    public static char getGrade(int score) {
        if (score >= 90 && score <= 100) {
            return 'A';
        }
        if (score >= 80 && score <= 89) {
            return 'B';
        }
        if (score >= 70 && score <= 79) {
            return 'C';
        }
        if (score >= 60 && score <= 69) {
            return 'D';
        }
        return 'F';
    }

    public static String getFeedback(char grade) {
        switch (grade) {
            case 'A':
                return "Отличная работа!";
            case 'B':
                return "Хорошо ";
            case 'C':
                return "Удовлетворительно.";
            case 'D':
                return "На грани провала.";
            case 'F':
                return " нужна пересдача.";
            default:
                return "Неизвестная оценка.";
        }
    }

    void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print(" возраст посетителя: ");
        int age = input.nextInt();
        System.out.print(" цену билета: ");
        double basePrice = input.nextDouble();

        double ticketResult = calculateTicketPrice(age, basePrice);
        System.out.println("Цена билета: " + ticketResult);

        System.out.print("первое число: ");
        double number1 = input.nextDouble();
        System.out.print("Введите знак (+, -, *, /): ");
        char op = input.next().charAt(0);
        System.out.print(" второе число: ");
        double number2 = input.nextDouble();

        double calcResult = calculate(number1, number2, op);
        System.out.println("Результат вычисления: " + calcResult);
        System.out.println();

        System.out.print("Введите номер месяца : ");
        int monthNum = input.nextInt();
        System.out.print("Год високосный? (введите true или false): ");
        boolean leapYear = input.nextBoolean();

        int daysResult = getDaysInMonth(monthNum, leapYear);
        System.out.println("Количество дней в этом месяце: " + daysResult);
        System.out.println();

        System.out.print("набранные баллы : (0-100): ");
        int userScore = input.nextInt();


        char userGrade = getGrade(userScore);
        String userFeedback = getFeedback(userGrade);

        System.out.println("оценка: " + userGrade);
        System.out.println("Комментарий: " + userFeedback);

    }
