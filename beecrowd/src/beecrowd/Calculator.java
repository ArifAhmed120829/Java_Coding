package beecrowd;

public class Calculator {
    private Fraction f1 = new Fraction();
    private Fraction f2 = new Fraction();
    private Fraction f;
    
    public Calculator() { super(); }
    
    public Calculator(Fraction f) {
        this.f = f;
    }
    
    public void input() {
        f1.inputFraction();
        f2.inputFraction();
    }
    
    public void view() {
        f1.toString();
        System.out.println("Fraction = " + f1.toString());
        f2.toString();
        System.out.println("Fraction = " + f2.toString());
        
    }
    
    public Calculator add() {
        Calculator f = new Calculator(f1.add(f2));
        return f;
    }
}
