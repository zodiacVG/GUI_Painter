package test;
import javafx.scene.control.ToolBar;

import javax.swing.*;
import java.awt.*;

class DramPanel extends JPanel{    //设置为外部类

}
public class GUI extends JFrame{
    JPanel toolBar;    //工具栏
    JButton fileChoose;  //文件选择按钮
    JButton colorCHOOSE;    //颜色选择按钮
    JButton textInput;
    DramPanel drawPanel;    //画板
    JTextArea message;   //记录组件

    //step2：初始化组件 构造函数
    GUI(){
        toolBar =new JPanel(new GridLayout(1,3));  //文本栏为grid类型
        fileChoose=new JButton("选择文件");
        colorCHOOSE=new JButton("选择颜色");
        textInput=new JButton("输入文本");
        toolBar.add(fileChoose);
        toolBar.add(colorCHOOSE);
        toolBar.add(textInput);
        //step3:添加组件  原因：frame是个框架不是容器，不能直接add。这个函数获得了Jframe 的内容面板
        //第一个参数设置位置
        this.getContentPane().add("North",toolBar);
        drawPanel=new DramPanel();
        drawPanel.setBackground(Color.yellow);  //设置颜色
        this.getContentPane().add("Center",drawPanel);
        message=new JTextArea(3,100);
        this.getContentPane().add("South",message);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);  //设置默认关闭方式
        this.setSize(MAXIMIZED_BOTH,MAXIMIZED_BOTH);    //设置尺寸
        this.setVisible(true);
    }

    GUI(String title){
        this();
        this.setTitle(title);
    }
    public static void main(String[] args){
        GUI window=new GUI("测试");
    }
}
