public class Humidity
{
    private int outsideH;
    private int insideH;
    private EnvironmentalSystem sensor;
    private boolean isDehumidifierOn;

    public Humidity()
    {
        outsideH = sensor.getHumidityFeed().getOutsideHumidity();
        insideH = sensor.getHumidityFeed().getInsideHumidity();
        isDehumidifierOn = identifyDehumidifierState();
        changeDehumidifierState();
    }

    private boolean identifyDehumidifierState()
    {
        if (insideH>(outsideH*1.1))
        {
            return true;
        }
        return false;
    }
    private void changeDehumidifierState()
    {
        if (isDehumidifierOn)
        {
            sensor.getDehumudifier().setOn(true);
        }
        else
        {
            sensor.getDehumudifier().setOn(false);
        }
    }
    public int getInsideHumidity()
    {
        return insideH;
    }
    public int getOutsideHumidity()
    {
        return outsideH;
    }
    public int getDifference()
    {
        return Math.abs(insideH-outsideH);
    }
    public String getDehumidifierState()
    {
        if(isDehumidifierOn)
        {
            return "On";
        }
        else
        {
            return "Off";
        }
    }

}
