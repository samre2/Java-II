package EverestBankGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CreateAccount extends JFrame implements ActionListener {

    JFrame myFrame;
    JLabel lblfname, lbllname, lblage, lbladdress;
    JTextField txtfname, txtlname, txtage, txtaddress;
    JButton btnLogIn, btnClose;

    public CreateAccount(){
        myFrame = new JFrame("Add account");
        myFrame.setLayout(null);
        myFrame.setSize(600,600);


        lblfname = new JLabel("Enter first name ");
        lblfname.setBounds(20,30,200,30);

        txtfname = new JTextField();
        txtfname.setBounds(210,30,200,30);

        lbllname = new JLabel("Enter last name ");
        lbllname.setBounds(20,80,200,30);

        txtlname = new JTextField();
        txtlname.setBounds(210,80,200,30);

        lblage = new JLabel("Enter your age ");
        lblage.setBounds(20,130,200,30);

        txtage = new JTextField();
        txtage.setBounds(210,130,200,30);

        lbladdress = new JLabel("Enter your address ");
        lbladdress.setBounds(20,180,200,30);

        txtaddress = new JTextField();
        txtaddress.setBounds(210,180,200,30);

        btnLogIn = new JButton("Log in");
        btnLogIn.setBounds(20,230,180,30);

        btnClose = new JButton("Close");
        btnClose.setBounds(210,230,180,30);

        btnLogIn.addActionListener(this);
        btnClose.addActionListener(this);



        myFrame.add(lblfname);
        myFrame.add(lbllname);
        myFrame.add(txtfname);
        myFrame.add(txtlname);
        myFrame.add(lblage);
        myFrame.add(txtage);
        myFrame.add(lbladdress);
        myFrame.add(txtaddress);
        myFrame.add(btnLogIn);
        myFrame.add(btnClose);


        myFrame.setVisible(true);
        myFrame.setLocationRelativeTo(null);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnLogIn){

    }else if(e.getSource()==btnClose){
          System.exit(0);
        }}
    public static void main(String[] args) {
        new CreateAccount();
    }
}
