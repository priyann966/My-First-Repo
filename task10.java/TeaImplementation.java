

class Tea3{
    public String Prepairtea(){
        return "prepairing the basictea"; 
    }
    
}
class Blacktea3 extends Tea3 {
    @Override
    public String Prepairtea() {
        return"Prepairing the blacktea";
    }
    
}
class Greentea3 extends Tea3 {
    @Override
    public String Prepairtea() {
        return "prepairing the greentea";
    }
    
    
}
class Herbaltea3 extends Tea3 {
    @Override
    public String Prepairtea() {
        return "prepairing the herbaltea";
    }
  
    
}
public class TeaImplementation{
    public static void main(String[] args) {
        

Tea3 [] teaarray=new Tea3[4];
teaarray[0]=new Tea3();
System.out.println(teaarray[0].Prepairtea());
teaarray[1]=new Blacktea3();
System.out.println(teaarray[1].Prepairtea());

teaarray[2]=new Greentea3();
System.out.println(teaarray[2].Prepairtea());

teaarray[3]=new Herbaltea3();
System.out.println(teaarray[3].Prepairtea());
    }
}
