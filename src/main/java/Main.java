import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setLayout(new GridLayout(1,3));
        f.setSize(800,600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel temPanel = new JPanel();
        temPanel.setLayout(new GridLayout(3,1));
        JPanel northPanel = new JPanel(new GridLayout(4,1));
        JPanel centralPanel = new JPanel(new GridLayout(4,1));
        JPanel southPanel = new JPanel(new GridLayout(4,1));
        northPanel.setBackground(Color.white);
        southPanel.setBackground(Color.white);
        centralPanel.setBackground(Color.white);

        northPanel.setBorder(new LineBorder(Color.BLACK));
        southPanel.setBorder(new LineBorder(Color.BLACK));
        centralPanel.setBorder(new LineBorder(Color.BLACK));

        temPanel.add(northPanel);
        temPanel.add(centralPanel);
        temPanel.add(southPanel);

        Temperature tem1 = new Temperature(0);
        northPanel.add(new JLabel(tem1.getWardName()));
        northPanel.add(new JLabel("Current Temperature:"+tem1.getCurrentTemperature()));
        northPanel.add(new JLabel("Ideal Temperature:"+ tem1.getIdealTemperature()));
        northPanel.add(new JLabel("Heating is " +tem1.getHeatingState()));
        if(tem1.getHeatingState().contains("On"))
        {
            northPanel.setBackground(Color.red);
        }
        else {
            northPanel.setBackground(Color.white);
        }

        Temperature tem2 = new Temperature(1);
        centralPanel.add(new JLabel(tem2.getWardName()));
        centralPanel.add(new JLabel("Current Temperature:"+tem2.getCurrentTemperature()));
        centralPanel.add(new JLabel("Ideal Temperature:"+ tem2.getIdealTemperature()));
        centralPanel.add(new JLabel("Heating is " +tem2.getHeatingState()));
        if(tem2.getHeatingState().contains("On"))
        {
            centralPanel.setBackground(Color.red);
        }
        else {
            centralPanel.setBackground(Color.white);
        }

        Temperature tem3 = new Temperature(2);
        southPanel.add(new JLabel(tem3.getWardName()));
        southPanel.add(new JLabel("Current Temperature:"+tem3.getCurrentTemperature()));
        southPanel.add(new JLabel("Ideal Temperature:"+ tem3.getIdealTemperature()));
        southPanel.add(new JLabel("Heating is " +tem3.getHeatingState()));
        if(tem3.getHeatingState().contains("On"))
        {
            southPanel.setBackground(Color.red);
        }
        else {
            southPanel.setBackground(Color.white);
        }

        JPanel humPanel = new JPanel();
        //Humidity humidity = new Humidity();

        JPanel airPanel = new JPanel();

        f.add(temPanel);
        f.add(humPanel);
        f.add(airPanel);
        f.setVisible(true);

        //Humidity humidity = new Humidity();
        //System.out.println("Inside humidity:"+humidity.getInsideHumidity()+", Outside humidity:"+humidity.getOutsideHumidity()+", Difference between inside and outside:"+humidity.getDifference()+", Dehumidifier is "+humidity.getDehumidifierState());
        //Air air = new Air();
    }
}