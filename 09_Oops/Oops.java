public class Oops {
    public static void main(String[] args) {

        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.color);
        
        p1.setTip(5);
        System.out.println(p1.tip);
        
        p1.color ="Yellow";
        System.out.println(p1.color);

    }

}

class Pen {
    // property
    String color;
    int tip;

    // object
    void setColor(String newColor) {
        color = newColor;
    }

    // object
    void setTip(int newTip) {
        tip = newTip;
    }

}
