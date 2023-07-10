package ss07_abstractclass_and_interface.practice.Comparator;

import ss06_inheritence.practice.Circle.Circle;
import java.util.Comparator;
public class CircleComparator implements Comparator<Circle> {
    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }
}
