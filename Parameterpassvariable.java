public class Girlfriend {
    public String name;
    public int old;
    public String color;
    public String face;
    
    public void variables(String k, int m, String n, String f){
    name=k;
    old=m;
    color=n;
    face=f;
    
    }
    
    
    public void display(){
    System.out.println("name:"+name);
    System.out.println("old:"+old);
    System.out.println("color:"+name);
    System.out.println("face:"+face);
    }
    
public class Parameterpassvariable {

    public static void main(String[] args) {
        Girlfriend g1=new Girlfriend();
        g1.variables("sadiya",19,"white","beautifull");
        g1.display();
        System.out.println(" ");
        
        Girlfriend g2=new Girlfriend();
        g2.variables("porimoni",19,"white","beautifull");
        g2.display();
        System.out.println(" ");
        
        Girlfriend g3=new Girlfriend();
        g3.variables("sabnur",19,"white","beautifull");
        g3.display();
        
        
        
        System.out.println("Hello World!");
    }
}
