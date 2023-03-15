package weapons;

public class IronShield implements Shield{
    @Override 
    public int protaction() {
        return 20;
    }

    @Override
    public boolean hasShield(){
        return true;
    }

    @Override
    public String toString() {
        return "Protaction IronShield= " + protaction();
    }
}
