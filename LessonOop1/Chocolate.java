public class Chocolate extends Product{
    private String producer = new String();
    private String color = new String();
    public Chocolate(String producer, String color, double cost) {
        super("Шоколад", cost);
        this.producer = producer;
        this.color = color;
    }

    @Override
    public String toString() {
        StringBuilder localString = new StringBuilder(super.toString());
        localString.append(String.format(" Цвет %s; Производитель: %s", color, producer));
        return localString.toString();
    }
}
