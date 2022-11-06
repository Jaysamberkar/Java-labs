import javax.swing.*;
import java.awt.event.*;

public class studentform extends JFrame implements ActionListener {
    JLabel l1,l2,l3,l4,l5;
    JTextField txt1,txt2;
    JRadioButton rb1,rb2,rb3;
    JCheckBox cb;
    JCheckBox cb1,cb2,cb3,cb4;
    JTextArea area;

    @SuppressWarnings("unchecked")
    studentform(){
        JFrame f = new JFrame("student form ");
        JLabel l1 = new JLabel("name :");
        l1.setBounds(20,70,80,30);
        txt1 = new JTextField();
        txt1.setBounds(100,20,150,30);
        f.add(l1);
        f.add(txt1);

        l2 = new JLabel("mobile numer ");
        txt2 = new JTextField();
        l2.setBounds(20,120,80,30);
        txt2.setBounds(100,70,150,30);
        f.add(l2);
        f.add(txt2);

        l3 = new JLabel();
        l3.setBounds(20,180,80,30);
        rb1 = new JRadioButton();
        rb2 = new JRadioButton();
        rb1.setBounds(100,120,60,30);
        rb2.setBounds(180,120,60,30);
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        f.add(l3);
        f.add(rb1);
        f.add(rb2);

        JLabel l4 = new JLabel("Age");
        l4.setBounds(100,170,90,20);
        String age[] = {"18","19","20","21","22"};

        JComboBox cb = new JComboBox(age);
        cb.setBounds(100,170,90,20);
        f.add(l4);
        f.add(cb);

        JLabel l5 = new JLabel("hobbies");
        l5.setBounds(20,215,50,30);
        f.add(l5);

        cb1 = new JCheckBox("reading");
        cb1.setBounds(80,220,80,2000);
        f.add(cb1);
        cb2 = new JCheckBox("sports");
        cb2.setBounds(160,220,80,2000);
        f.add(cb2);
        cb3 = new JCheckBox("dancing");
        cb3.setBounds(240,220,80,2000);
        f.add(cb3);
        cb4 = new JCheckBox("travel");
        cb4.setBounds(320,220,80,2000);
        f.add(cb4);

        JButton b = new JButton("submit");
        b.setBounds(140,280,75,20);
        f.add(b);

        area = new JTextArea();
        area.setBounds(30,320,320,100);
        b.addActionListener(this);

        f.setLayout(null);
        f.setVisible(true);
        f.setSize(400,500);

    }

    public void actionPerformed (ActionEvent e){
        String name = txt1.getText();
        String mobile = txt2.getText();
        String gender  = rb1.isSelected() ? "Male": rb2.isSelected() ? "Female": "-";

        String age = cb.getItemAt(cb.getSelectedIndex()).toString();
        String hobby="";

        if (cb1.isSelected()){
            hobby = "Reading";
        }

        if (cb2.isSelected()){
            hobby += " " + "Sports";
        }

        if (cb3.isSelected()){
            hobby += " " + "Dancing";
        }

        if (cb4.isSelected()){
            hobby += " " + "Travel";
        }

        area.setText("Name :"+ name + "\n" + "Mobile Number :" + mobile + "\n" + "Gender :" + gender + "\n" + "Age :" + age + "\n" + "Hobbies :" + hobby);

    }

    public static void main(String[] args){
        new studentform();
    }

    }

