import javax.print.attribute.standard.PresentationDirection;

public class Main {

    public static void main(String[] args) {
        /*第一题*/
        Square square = new Square();
        square.makeVisible();
        Circle circle = new Circle();
        circle.makeVisible();

        /*第二题*/
        circle.moveDown();
        circle.moveDown();
        circle.moveDown();
        circle.makeInvisible();
        circle.makeInvisible();
        circle.makeVisible();

        /*第三题*/
        circle.moveVertical(50);
        circle.slowMoveVertical(-50);
        circle.changeSize(50);
        circle.moveHorizontal(-70);

        /*第四题*/
        circle.changeColor("red");

        /*第五题*/
        circle.changeColor("pink");/*指定一个系统无法识别的颜色时，图形变成黑色*/

        /*第六题*/
        /*circle.changeColor(red);/*不加双引号会出错*/

        /*第十六题*/
        Circle newcircle= new Circle();
        newcircle.changeColor("red");
        newcircle.makeVisible();
        Canvas.wait(2000);
        newcircle.slowMoveVertical(500);
    }
}
