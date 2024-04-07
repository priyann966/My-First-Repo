public class Tea {
    String water = "Hot Water";
    String sugar = "Sugar";
    String leaves = "Tea leaves";
    String milk = "Milk";
    String tea;

    public void PrepairTea(String tea){
       tea = water + leaves;
       
    }
    public void Addmilk(String tea){
       tea = tea + milk;
      
    }
    public void Addsugar(String tea){
        tea = tea + sugar;
    }
    public static void main(String[] args) {

        Tea tea = new Tea();
        tea.PrepairTea("basic tea with leaves and water");
        System.out.println("basic tea with leaves and water");
        tea.Addmilk("tea with basic tea and milk");
        System.out.println("tea with basic tea and milk");
        tea.Addsugar("tea with basic tea and sugar");
        System.out.println("tea with basic tea and sugar");
    }
        
    
}

