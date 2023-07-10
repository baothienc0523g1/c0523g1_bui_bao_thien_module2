package ss06_inheritence.exercise.LopPoint2D;

public class Point3D extends Point2D {
    private float x;
    private float y;
    private float z;
    public Point3D(){
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }
    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    public float getZ() {
        return this.z;
    }
    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public float[] getXYZ() {
        float data[] = new float[3];
        data[0] = x;
        data[1] = y;
        data[2] = z;
        return data;
    }

    @Override
    public String toString() {
        return "A 3D object have x = : " + getX() + ", y = " + getY()
        + " and z = " + getZ() + ", this is a subclass of " + super.toString();
    }

    public static void main(String[] args) {
        Point3D point3D = new Point3D(3,4,5);
        System.out.println(point3D.toString());
        point3D = new Point3D(5,6,8);
        System.out.println(point3D.getX());
        point3D.setX(5555);
        System.out.println(point3D.getX());

    }
}
