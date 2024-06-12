package zyBook_Chapter_10.zyBook_10_2;

import javax.swing.*;

public class zyBook_10_2_1 {
    /*
    (Definition of gui (graphical user interface):
    A user interface in which the user supplies inputs through graphical components such as buttons,
    menus, and text fields.)

    当用户输入任何东西，程序都会接收到已经发生的事件event的通知，比如移动鼠标就会生成"鼠标移动mouse move"的事件， 点击就会生成"action"的事件
    (Definition of user-interface event:
    A notification to a program that a user action such as a key press, mouse move,
    or menu selection has occurred.)
    (Definition of event listener: An object that is notified by an event source when an event occurs.)
    (Definition of event source: An object that can notify other classes of events.)

    public interface ActionListener
    {
        void actionPerformed(ActionEvent event);
    }

    public class ClickListener implements ActionListener
    {
       public void actionPerformed(ActionEvent event)
       {
          System.out.println("I was clicked.");
       }
    }

    ActionListener listener = new ClickListener();
    button.addActionListener(listener);
    listener.actionPerformed(event);
     */
    public static void main(String[] args)
    {
        JFrame frame = new ButtonFrame1();
        frame.setTitle("A frame with two components");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
