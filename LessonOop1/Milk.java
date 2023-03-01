import java.util.Date;

public class Milk extends Product {
    private Date expireDate = new Date();
    private String producer = new String();
    public Milk(String producer, double cost, Date expireDate) {
        super("Молоко", cost);
        this.producer = producer;
        this.expireDate = expireDate;
    }

    @Override
    public String toString() {
        StringBuilder localString = new StringBuilder(super.toString());
        localString.append(String.format(" годно до %s; Производитель: %s", expireDate.toString(), producer));
        return localString.toString();
    }
}