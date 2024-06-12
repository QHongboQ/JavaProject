package zyBook_Chapter_11.zyBook_11_1;
import javax.swing.JFrame;

public class zyBook_11_1 {
    /*
    Definition of panel: A user-interface component with no visual appearance. It can be used to group other components.

    Definition of layout manager: A class that arranges user-interface components inside a container.

    JPanel 是从左到右布局，没空位时换行
    border layout 边框布局，可以布局东南西北中
    A layout management scheme in which components are placed into the center or one of the four borders of their container.
    panel.setLayout(new BorderLayout());
    panel.add(component, BorderLayout.NORTH);
    panel.add(component, BorderLayout.EAST);
    panel.add(component, BorderLayout.SOUTH);
    panel.add(component, BorderLayout.WEST);
    panel.add(component, BorderLayout.CENTER);

    Definition of grid layout: A layout management scheme in which components are placed into a two-dimensional grid.
    网格布局，每个组件有自己的格子，可以放入到相对应的格子中
    JPanel buttonPanel = new JPanel();
    buttonPanel.setLayout(new GridLayout(4, 3));    // 创建一个4行3列的表格
    buttonPanel.add(button7);   从左到右添加组件

    这些布局组合起来，就能实现更多的布局分布，比如:
    JPanel keypadPanel = new JPanel();
    keypadPanel.setLayout(new BorderLayout());
    buttonPanel = new JPanel();
    buttonPanel.setLayout(new GridLayout(4, 3));
    buttonPanel.add(button7);
    buttonPanel.add(button8);
    // . . .
    keypadPanel.add(buttonPanel, BorderLayout.CENTER);
    JTextField display = new JTextField();
    keypadPanel.add(display, BorderLayout.NORTH);

     */


    public static void main(String[] args)
    {
        JFrame frame = new CalculatorFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Calculator");
        frame.setVisible(true);
    }
}
