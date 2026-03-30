package gui;

import service.DeviceManager;
import service.ApiService;
import model.Device;

import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {

    private DeviceManager manager;
    private JTextArea textArea;

    public GUI(DeviceManager manager) {

        this.manager = manager;

        setTitle("Smart Home System");
        setSize(500,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        textArea = new JTextArea();
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        JButton refresh = new JButton("Show Devices");
        refresh.addActionListener(e -> showDevices());

        JButton api = new JButton("Fetch Temperature");
        api.addActionListener(e -> fetchTemp());

        JPanel panel = new JPanel();
        panel.add(refresh);
        panel.add(api);

        add(panel, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void showDevices(){
        textArea.setText("");
        for(Device d : manager.getDevices()){
            textArea.append(d.getDetails() + "\n");
        }
    }

    private void fetchTemp(){
        try{
            double t = ApiService.fetchTemperature();
            JOptionPane.showMessageDialog(this,"Temperature: "+t);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    }
}
