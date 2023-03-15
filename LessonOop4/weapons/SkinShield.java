package weapons;

public class SkinShield implements Shield{
    @Override 
    public int protaction() {
        return 10;
    }

    @Override
    public boolean hasShield(){
        return true;
    }

    @Override
    public String toString() {
        return "Protaction SkinShield= " + protaction();
    }
}
