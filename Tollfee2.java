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


public class Tollfee2 extends  JFrame implements ActionListener {
private JLabel fullNameLabel, genderLabel1, genderLabel2, genderlabel3,fullNameLabel1, carLabel,truckLabel, motorcycleLabel;
private JButton goButton, resetButton,lButton;
private ButtonGroup vehicleGroup ;
private JRadioButton mButton, fButton, x;
private JTextField fullNameTextField,fullNameTextField2;
private JPanel northPanel,westPanel, westPanel2, southPanel, centerPanel, westPanel3;
private JCheckBox insurance;
private JComboBox feeBox;
private ImageIcon carIcon , motorcycleIcon,truckIcon;


public Tollfee2(){ 
 fullNameLabel = new JLabel("Types of Vehicle:");
  northPanel =new JPanel();
  northPanel.add(fullNameLabel);
 mButton = new JRadioButton ("");
 carIcon = new ImageIcon("car.gif");
 carLabel = new JLabel(carIcon);

 
 fButton =new JRadioButton("");
 truckIcon = new ImageIcon("truck.gif");
 truckLabel = new JLabel(truckIcon);
 
 x =new JRadioButton("");
 motorcycleIcon = new ImageIcon("motorcycle.gif");
 motorcycleLabel = new JLabel(motorcycleIcon);
 
 
 vehicleGroup = new ButtonGroup();
 vehicleGroup.add(mButton);
 vehicleGroup.add(fButton);
  vehicleGroup.add(x);
 
 northPanel.add(mButton);
 northPanel.add(carLabel);
 
 northPanel.add(fButton);
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
goButton.addActionListener(this);

lButton = new JButton("clear");
lButton.addActionListener(this);

resetButton= new JButton("Print Receipt");
//resetButton.addActionListener(this);

southPanel = new JPanel();
southPanel.add(goButton);
southPanel.add(resetButton);
southPanel.add(lButton);
add(southPanel,BorderLayout.SOUTH);  
  


 setVisible(true);
setSize(400,400);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


}
public void actionPerformed(ActionEvent event)
{
 if(event.getSource()== goButton)
    {
      //String fullname = fullNameTextField.getText();   // 9th step
     // String comment = commentArea.getText();   // 12 the step so that we can clear the comment area.
      String state = feeBox.getSelectedItem().toString(); 
     // String balance = fullNameTextField2.getText();
      
      
   
     
    String vehicle ="";
     if(mButton.isSelected()){
       vehicle = "";
    
       String output ="Vehicle Type: 2 Axels"+ "\n Fee type:"+ state;
       JOptionPane.showMessageDialog(null,output);
 
     }
        else if (fButton.isSelected()){
        vehicle = "";
        String y ="Vehicle Type:3 or more Axels"+ "\nFee type:"+ state;
       JOptionPane.showMessageDialog(null,y);}
       
         if(x.isSelected()){
        vehicle="";
         String e ="Vehicle Type:Motorcycle"+ "\nFee type:"+ state;
       JOptionPane.showMessageDialog(null,e);
       }
       
     

     }
      
  else if(event.getSource()== lButton){
      
                                      //JOptionPane.showMessageDialog(null, "clear"); //8 step placing the poping message for clear buton.
   //fullNameTextField.setText(" "); // 11the step to clear the text field we use " "
    //fullNameTextField2.setText(" ");
    feeBox.setSelectedIndex(0); //15th to bring the dropbox in initial stage.
    //movieBox.setSelected(false);//18
    //musicBox.setSelected(false);//
    vehicleGroup.clearSelection();//19
    }
  }

public static void main(String [] args) {
Tollfee2 app = new Tollfee2();

}// end of method
} // end of class