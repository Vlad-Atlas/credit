public class Main {
    public static void main(String[] args) {
        CreditPaymentService creditPaymentService = new CreditPaymentService();

        // данные для расчетов
        double principal = 1_000_000; // Сумма кредита в рублях
        double annualRate = 9.99;       // Годовая процентная ставка 9.9%

        // Расчет для 1 года
        int years1 = 1; // Срок кредита в годах
        double payment1 = creditPaymentService.calculate(principal, annualRate, years1);
        System.out.println("Ежемесячный платеж (1 год): " + Math.round(payment1));

        // Расчет для 2 лет
        int years2 = 2; // Срок кредита в годах
        double payment2 = creditPaymentService.calculate(principal, annualRate, years2);
        System.out.println("Ежемесячный платеж (2 года): " + Math.round(payment2));

        // Расчет для 3 лет
        int years3 = 3; // Срок кредита в годах
        double payment3 = creditPaymentService.calculate(principal, annualRate, years3);
        System.out.println("Ежемесячный платеж (3 года): " + Math.round(payment3));
    }
}