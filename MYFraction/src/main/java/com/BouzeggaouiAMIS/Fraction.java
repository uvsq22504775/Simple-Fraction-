public class Fraction {
    private int numerateur;
    private int denominateur;
     public String toString1() {
        return "Je suis une fraction.";
    } 
    public static final Fraction ZERO = new Fraction(0, 1);
    public static final Fraction UN = new Fraction(1, 1);

   public Fraction(int numerateur, int denominateur) {
        if (denominateur == 0) throw new IllegalArgumentException("Denominateur = 0 interdit");
        this.numerateur = numerateur;
        this.denominateur = denominateur;
    }

    public Fraction(int numerateur) {
        this(numerateur, 1);
    }

    public Fraction() {
        this(0, 1);
    }

    public String toString() {
        return numerateur + "/" + denominateur;
    }
    public int getNumerateur() {
        return numerateur;
    }

    public int getDenominateur() {
        return denominateur;
    }
    public double doubleValue() {
    return (double) numerateur / denominateur;
}
    public Fraction add(Fraction other) {
    int newNumerateur = this.numerateur * other.denominateur + this.denominateur * other.numerateur;
    int newDenominateur = this.denominateur * other.denominateur;
    return new Fraction(newNumerateur, newDenominateur);
}
    }

    
