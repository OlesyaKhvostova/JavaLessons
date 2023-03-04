package zoo;

public class Dolphin extends Animal implements Swimable {
    private int swimSpeed = 10;
    public Dolphin(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Тррррттт!";
    }

    @Override
    public String feed()
    {
        return "Рыба";
    }

    @Override
    public int getSwimSpeed() {
        return this.swimSpeed;
    }
}
