package weapons;

public class DummyShield implements Shield{
    @Override 
    public int protaction() {
        return 0;
    }

    @Override
    public boolean hasShield(){
        return false;
    }

    @Override
    public String toString() {
        return "Without Shield";
    }
}
