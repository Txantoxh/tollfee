import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.event.ActionListener; // 1st step
import java.awt.event.ActionEvent; //  1st step.
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;


public class Tollfee1 extends JFrame {
private JLabel fullNameLabel, genderLabel1, genderLabel2, genderlabel3,fullNameLabel1, carLabel,truckLabel, motorcycleLabel;
private JButton goButton, resetButton,lButton;
private ButtonGroup vehicleGroup ;
private JRadioButton mButton, tButton, x;
private JTextField fullNameTextField,fullNameTextField2;
private JPanel northPanel,westPanel, westPanel2, southPanel, centerPanel, westPanel3;
private JCheckBox insurance;
private JComboBox feeBox;
private ImageIcon carIcon , motorcycleIcon,truckIcon;


public Tollfee1(){ 
 fullNameLabel = new JLabel("Types of Vehicle:");
  northPanel =new JPanel();
  northPanel.add(fullNameLabel);
 mButton = new JRadioButton ("");
 carIcon = new ImageIcon("car.gif");
 carLabel = new JLabel(carIcon);

 
 tButton =new JRadioButton("");
 truckIcon = new ImageIcon("truck.gif");
 truckLabel = new JLabel(truckIcon);
 
 x =new JRadioButton("");
 motorcycleIcon = new ImageIcon("motorcycle.gif");
 motorcycleLabel = new JLabel(motorcycleIcon);
 
 
 vehicleGroup = new ButtonGroup();
  vehicleGroup.add(mButton);
 vehicleGroup.add(tButton);
  vehicleGroup.add(x);
 
 northPanel.add(mButton);
 northPanel.add(carLabel);
 
 northPanel.add(tButton);
 northPanel.add(truckLabel);
 
 northPanel.add(x);
 northPanel.add(motorcycleLabel);
 add(northPanel, BorderLayout.NORTH);
 
 
fullNameLabel = new JLabel("Type of Fee:");
String dayList [] = {"Regular tolls", "Peek Weekends"};
feeBox = new JComboBox(dayList);
centerPanel =new JPanel();
centerPanel.add(fullNameLabel);
centerPanel.add(feeBox);
add(centerPanel, BorderLayout.CENTER);
 
  

goButton = new JButton("pay fee");
resetButton= new JButton("Print Receipt");
lButton = new JButton("clear");

southPanel = new JPanel();
southPanel.add(goButton);
southPanel.add(resetButton);
southPanel.add(lButton);
add(southPanel,BorderLayout.SOUTH);  
  


 setVisible(true);
setSize(400,400);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


}

public static void main(String [] args) {
Tollfee1 app = new Tollfee1();

}// end of method
} // end of class