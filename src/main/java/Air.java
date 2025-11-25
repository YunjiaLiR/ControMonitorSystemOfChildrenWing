public class Air
{
    private float currentLevel;
    final float idalLevel = 5;
    private EnvironmentalSystem sensor;
    private boolean isAirPurifierOn;

    public Air()
    {
        currentLevel = sensor.getPollutionFeed().getPollution();
        isAirPurifierOn = identifyPurifierState();
        changePurifierState();

    }
    private boolean identifyPurifierState()
    {
        if (currentLevel>idalLevel)
        {
            return true;
        }
        return false;
    }
    private void changePurifierState()
    {
        if(isAirPurifierOn)
        {
            sensor.getAirPurifier().setOn(true);
        }
        else
        {
            sensor.getAirPurifier().setOn(false);
        }
    }
    public float getCurrentLevel()
    {
        return currentLevel;
    }
    public String getPurifierState()
    {
        if(isAirPurifierOn)
        {
            return "On";
        }
        else
        {
            return "Off";
        }
    }



}
