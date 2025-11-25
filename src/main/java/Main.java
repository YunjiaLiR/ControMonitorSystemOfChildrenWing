import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setLayout(new GridLayout(1,4));
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
            northPanel.setBackground(Color.RED);
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
            centralPanel.setBackground(Color.RED);
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
            southPanel.setBackground(Color.RED);
        }
        else {
            southPanel.setBackground(Color.white);
        }

        JPanel humPanel = new JPanel();
        humPanel.setBackground(Color.white);
        humPanel.setBorder(new LineBorder(Color.BLACK));

        Humidity humidity = new Humidity();
        humPanel.add(new JLabel("Inside humidity:"+humidity.getInsideHumidity()));
        humPanel.add(new JLabel("Outside humidity:"+humidity.getOutsideHumidity()));
        humPanel.add(new JLabel("Difference between inside and outside:"+humidity.getDifference()));
        humPanel.add(new JLabel("Dehumidifier is "+humidity.getDehumidifierState()));
        if(humidity.getDehumidifierState().contains("On"))
        {
            humPanel.setBackground(Color.RED);
        }
        else {
            humPanel.setBackground(Color.white);
        }


        JPanel airPanel = new JPanel();
        airPanel.setBackground(Color.white);
        airPanel.setBorder(new LineBorder(Color.BLACK));
        Air air = new Air();
        airPanel.add(new JLabel("Current Population Level"+ air.getCurrentLevel()));
        airPanel.add(new JLabel("Air Purifier is"+ air.getPurifierState()));
        if(air.getPurifierState().contains("On"))
        {
            airPanel.setBackground(Color.RED);
        }
        else {
            airPanel.setBackground(Color.white);
        }


        JPanel scanPanel = new JPanel();
        scanPanel.setBorder(new LineBorder(Color.BLACK));
        scanPanel.setLayout(new GridLayout(2,1));

        f.add(temPanel);
        f.add(humPanel);
        f.add(airPanel);
        f.add(scanPanel);
        f.setVisible(true);

        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.repaint();
            }
        });
        timer.start();

        Timer timer2 = new Timer(30000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(tem1.getWardName()+"Current Temperature:"+tem1.getCurrentTemperature()+"Ideal Temperature:"+ tem1.getIdealTemperature()+"Heating is " +tem1.getHeatingState());
                System.out.println(tem2.getWardName()+"Current Temperature:"+tem2.getCurrentTemperature()+"Ideal Temperature:"+ tem2.getIdealTemperature()+"Heating is " +tem2.getHeatingState());
                System.out.println(tem3.getWardName()+"Current Temperature:"+tem3.getCurrentTemperature()+"Ideal Temperature:"+ tem3.getIdealTemperature()+"Heating is " +tem3.getHeatingState());
                System.out.println("Inside humidity:"+humidity.getInsideHumidity()+ "Outside humidity:"+humidity.getOutsideHumidity()+"Difference between inside and outside:"+humidity.getDifference()+"Dehumidifier is "+humidity.getDehumidifierState());
                System.out.println("Current Population Level"+ air.getCurrentLevel()+"Air Purifier is"+ air.getPurifierState());
            }
        });
        timer.start();

    }
}