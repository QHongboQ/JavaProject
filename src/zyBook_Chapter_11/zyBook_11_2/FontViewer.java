package zyBook_Chapter_11.zyBook_11_2;

import javax.swing.JFrame;
/*
创建一组单选按钮
JRadioButton smallButton = new JRadioButton("Small");
JRadioButton mediumButton = new JRadioButton("Medium");
JRadioButton largeButton = new JRadioButton("Large");

ButtonGroup group = new ButtonGroup();
group.add(smallButton);
group.add(mediumButton);
group.add(largeButton);

if (largeButton.isSelected()) { size = LARGE_SIZE; } // 当选择，执行此功能，使用.isSelected()进行检测是否按下

选择框:
JCheckBox italicCheckBox = new JCheckBox("Italic"); // 使用.isSelected()进行检测

多选组合框   //列表和文本字段的组合
Definition of combo box:
A user-interface component that combines a text field with a drop-down list of selections

JComboBox facenameCombo = new JComboBox();
facenameCombo.addItem("Serif");
facenameCombo.addItem("SansSerif");

String selectedString = (String) facenameCombo.getSelectedItem();   //检测选中选项

每次选中某物，会产生ActionEvent, 所有的组件都监听同一个对象，所以不用区分
 */




/**
 This program allows the user to view font effects.
 */
public class FontViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new FontFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("FontViewer");
        frame.setVisible(true);
    }
}