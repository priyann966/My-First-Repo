public class CircleClass {
    float radius;
    float result;
//default constrctor
    public CircleClass() {

    }
    //using the parametrisied constrctor

    public CircleClass(float radius) {
      this.radius=radius;
    }

    public void circumferenceofCircle() {
        result = 2 * (3.14f) * radius;
    }

public static void main(String[] args) {
    CircleClass cc=new CircleClass(6);
    cc.circumferenceofCircle();
    System.out.println("circumference of the Circle is "+cc.result);

    
}
}
