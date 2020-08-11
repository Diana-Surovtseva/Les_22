import java.util.Objects;

public class Car {
    private String model;
    private String color;
    private int year;
    private int price;

    public Car(String model, String color, int year, int price) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year &&
                price == car.price &&
                Objects.equals(model, car.model) &&
                Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        //логическоеУсловие ? выражение1 : выражение2
        //Если логическоеУсловие равно true, то вычисляется выражение1 и его результат становится результатом выполнения всего оператора. Если же логическоеУсловие равно false, то вычисляется выражение2, и его значение становится результатом работы оператора.
        // Оба операнда выражение1 и выражение2 должны возвращать значение одинакового (или совместимого) типа.
        int result = model !=null ? model.hashCode():0;
        return Objects.hash(model, color, year, price);
    }
}