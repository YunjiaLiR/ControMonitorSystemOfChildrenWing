
public class Main {
    public static void main(String[] args) {
        Temperature tem1 = new Temperature(0);
        Temperature tem2 = new Temperature(1);
        Temperature tem3 = new Temperature(2);
        System.out.println(tem1.getWardName()+": Current Temperature:"+ tem1.getCurrentTemperature()+", Ideal Temperature:"+ tem1.getIdealTemperature()+ ", Heating is "+tem1.getHeatingState());
        System.out.println(tem2.getWardName()+": Current Temperature:"+ tem2.getCurrentTemperature()+", Ideal Temperature:"+ tem2.getIdealTemperature()+ ", Heating is "+tem2.getHeatingState());
        System.out.println(tem3.getWardName()+": Current Temperature:"+ tem3.getCurrentTemperature()+", Ideal Temperature:"+ tem3.getIdealTemperature()+ ", Heating is "+tem3.getHeatingState());


    }
}