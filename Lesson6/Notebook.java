import java.util.Map;

public class Notebook {
    Integer id;
    Integer ramSize;
    Integer hddSize;
    String os;
    String color;
    Notebook(Integer ram, Integer hdd, String osName, String bodyColor)
    {
        ramSize = ram;
        hddSize = hdd;
        os = osName;
        color = bodyColor; 
    }
    @Override
    public String toString() {
        return String.format("Color = %s OS = %s RAM = %d HDD = %d", color, os, ramSize, hddSize);
    }

    boolean IsNeeded(Map<String, String> params)
    {
        boolean res = true;
        for (String key : params.keySet())
        {
            if (res)
            {
                if (key == "MinRam")
                {
                    Integer ramMin =  Integer.parseInt(params.get(key));
                    if (ramSize < ramMin)
                    {
                        res = false;
                    }
                }

                if (key == "Os")
                {
                    res = params.get(key).equalsIgnoreCase(os);
                }

                if (key == "Color")
                {
                    res = params.get(key).equalsIgnoreCase(color);
                }
            }
        }
        return res;
    }
}
