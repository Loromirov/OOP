package Task2;

//2) Переписать код SpeedCalculation в соответствии с Open-Closed Principle:
//Подсказка: создайте два дополнительных класса Car и Bus(наследников Vehicle), напишите метод calculateAllowedSpeed(). Использование этого метода позволит сделать класс SpeedCalculation соответствующим OCP

public interface SpeedCalculation {
    public double calculateAllowedSpeed(Vehicle vehicle);
}


