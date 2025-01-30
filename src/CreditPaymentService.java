public class CreditPaymentService {

    // Метод для расчета аннуитетного платежа
    public double calculate(double principal, double annualRate, int years) {
        double monthlyRate = annualRate / 12 / 100; // Преобразуем годовую процентную ставку в месячную
        int numberOfPayments = years * 12; // Общее количество месяцев

        // Рассчитываем аннуитетный платеж
        double monthlyPayment = (principal * (monthlyRate * Math.pow(1 + monthlyRate, numberOfPayments)))
                / (Math.pow(1 + monthlyRate, numberOfPayments) - 1);

        return monthlyPayment; // Возвращаем ежемесячный платеж
    }
}