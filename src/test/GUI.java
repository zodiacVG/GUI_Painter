package test;
import javafx.scene.control.ToolBar;

import javax.swing.*;
import java.awt.*;

class DramPanel extends JPanel{    //����Ϊ�ⲿ��

}
public class GUI extends JFrame{
    JPanel toolBar;    //������
    JButton fileChoose;  //�ļ�ѡ��ť
    JButton colorCHOOSE;    //��ɫѡ��ť
    JButton textInput;
    DramPanel drawPanel;    //����
    JTextArea message;   //��¼���

    //step2����ʼ����� ���캯��
    GUI(){
        toolBar =new JPanel(new GridLayout(1,3));  //�ı���Ϊgrid����
        fileChoose=new JButton("ѡ���ļ�");
        colorCHOOSE=new JButton("ѡ����ɫ");
        textInput=new JButton("�����ı�");
        toolBar.add(fileChoose);
        toolBar.add(colorCHOOSE);
        toolBar.add(textInput);
        //step3:������  ԭ��frame�Ǹ���ܲ�������������ֱ��add��������������Jframe ���������
        //��һ����������λ��
        this.getContentPane().add("North",toolBar);
        drawPanel=new DramPanel();
        drawPanel.setBackground(Color.yellow);  //������ɫ
        this.getContentPane().add("Center",drawPanel);
        message=new JTextArea(3,100);
        this.getContentPane().add("South",message);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);  //����Ĭ�Ϲرշ�ʽ
        this.setSize(MAXIMIZED_BOTH,MAXIMIZED_BOTH);    //���óߴ�
        this.setVisible(true);
    }

    GUI(String title){
        this();
        this.setTitle(title);
    }
    public static void main(String[] args){
        GUI window=new GUI("����");
    }
}
