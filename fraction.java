public class fraction {
    private int numerateur;
    private int denominateur;
     public String toString() {
        return "Je suis une fraction.";
    }

    public Fraction(int numerateur, int denominateur) {
    if (denominateur == 0) {
        throw new IllegalArgumentException("Le dénominateur ne peut pas être nul.");
    }
    this.numerateur = numerateur;
    this.denominateur = denominateur;
}
public int getNumerateur() {
    return numerateur;
}

public int getDenominateur() {
    return denominateur;
}
    }

    
