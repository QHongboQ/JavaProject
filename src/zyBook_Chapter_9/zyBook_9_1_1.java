package zyBook_Chapter_9;
import java.util.Scanner;

/**
 This program shows a simple quiz with one question.
 */

public class zyBook_9_1_1 {
    public static void main(String[] args)
    {
        // inheritance is a relationship between a more general class (called the superclass)
        // The subclass inherits(继承) data(数据) and behavior(行为) from the superclass.
        // Definition of inheritance: This is a relationship between a more general superclass and a more specialized subclass.
        // Definition of superclass: A general class from which a more specialized class (a subclass) inherits
        // Definition of subclass: A class that inherits variables and methods from a superclass but adds instance variables, adds methods, or redefines methods.
        Scanner in = new Scanner(System.in);

        Question q = new Question();
        q.setText("Who was the inventor of Java?");
        q.setAnswer("James Gosling");

        q.display();
        System.out.print("Your answer: ");
        String response = in.nextLine();
        System.out.println(q.checkAnswer(response));

        // 若使用System.out.print(class), 则会自动进入到class中的toString，然后调用并且打印
        // subclass 会具有全部superclass的功能，并且可以多添新功能
        // 若subclass中没有method，superclass中有method，则当调用的时候，系统会在subclass中寻找，然后没找到去superclass中寻找，然后执行
        // 若在subclass中存在method，在superclass中不存在，则直接执行subclass中的method
        // 若在sub和super中都存在，则sub中的会overshadow superclass中的method，会直接覆盖掉，然后执行subclass中的method

        // 继承的语法为 public class subClassName extends superClassName, 之后就和正常的class一样了
        // 在subclass中创建变量同样会遵循覆盖原则，若创建了同样的变量，则会覆盖掉superclass中的变量
        // 由于在superclass中，变量定义为private，所以不可以在subclass中使用，我们需要考虑别的方法
        // 必须使用getter method来访问这个private变量

        // 若覆盖了后，想使用superclass中的method，则使用语法: super.methodName(); 来调用指定superclass中的method

        // overriding: 就是在subclass中写一个与superclass相同名字的method，他就会覆盖掉这个method，当调用的时候会调用subclass中新写的class

        // 可以在subclass中声明任何新的函数,若生成和superclass一样的函数，则会override the method

        // SuperClass 的 instance是private 不可访问的，所以要有getter method

        // 除非特别指定，否则superclass将使用默认的construct进行初始化，指定的时候语法为: super(传入参数)， 这句话必须是subclass的第一语句

        // Definition of abstract method: A method with a name, parameter variable types, and return type but without an implementation.

        /*
        创建了一个ArrayList<class> 后，一般通过一个for循环来调用打印其中所有元素:
        int count = 1;
        for (Plant plant : myGarden) {
            System.out.println("Plant " + count + " Information: ");
            plant.printInfo();
            System.out.println(); // Adding a newline for better readability
            count++;
        }
         */

        // 在具体实施中，还是具体事情该创建什么class就创建什么class，只是你创建subclass的时候不用再声明已经存在的method了，只用继承就行了


    }
}

