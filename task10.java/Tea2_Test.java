public class Tea2_Test {
    public static void main(String[] args) {

        Tea2 tea2 = new Tea2();
        BlackTea bb=new BlackTea();
        GreenTea gg=new GreenTea();
        HerbalTea hh=new HerbalTea();
        System.out.println(tea2.Prepairtea());
        System.out.println(bb.Prepairtea());

        System.out.println(gg.Prepairtea());

        System.out.println(hh.Prepairtea());

        
    }
    
}
