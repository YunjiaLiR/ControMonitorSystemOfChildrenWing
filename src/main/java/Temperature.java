import java.text.DecimalFormat;

public class Temperature
{
    private double idealT;
    private int wardID;
    private EnvironmentalSystem sensor;
    private double currentT;
    private boolean isHeatingOn;
    private DecimalFormat oneDigit = new DecimalFormat("#,##0.0");

    public Temperature(int wardID)
    {
        this.wardID=wardID;
        idealT = setIdealT(wardID);
        sensor = new EnvironmentalSystem();
        currentT = sensor.getTempFeed().getTemp(wardID);
        identifyHeatingState();
        changeHeatingState();
    }
    private double setIdealT(int wardID)
    {
        if (wardID == 0)
        {
            return 23.0;
        }
        else if (wardID == 1)
        {
            return 22.0;
        }
        else if (wardID == 2)
        {
            return 20.0;
        }
        else
        {
            System.out.println("Invalid wardID for Temperature");
            return 0.0;
        }
    }
    public double getIdealTemperature()
    {
        return idealT;
    }
    public double getCurrentTemperature()
    {
        return Double.valueOf(oneDigit.format(currentT));
    }
    public String getWardName()
    {
        if (wardID == 0)
        {
            return "North Ward";
        }
        else if (wardID == 1)
        {
            return "Central Ward";
        }
        else if (wardID == 2)
        {
            return "South Ward";
        }
        else
        {
            return "Invalid Name";
        }
    }
    public void identifyHeatingState()
    {
        if (currentT< (idealT-0.5)||currentT>(idealT+0.5))
        {
            isHeatingOn = true;
        }
        else
        {
            isHeatingOn = false;
        }
    }
    public void changeHeatingState()
    {
        if (isHeatingOn)
        {
            sensor.getHeating().getHeater(wardID).setOn(true);
        }
        else
        {
            sensor.getHeating().getHeater(wardID).setOn(false);
        }
    }
    public String getHeatingState()
    {
        if (isHeatingOn)
        {
            return "On";
        }
        else
        {
            return "Off";
        }
    }

}
