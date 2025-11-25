public class Air
{
    private double currentLevel;
    final double idalLevel = 5;
    private EnvironmentalSystem sensor;
    public Air()
    {
        currentLevel = sensor.getPollutionFeed().getPollution();
    }
}
