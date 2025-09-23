class Main {
  public static void main(String[] args) {
        System.out.println("Bonjour ! ");

        Fraction f = new Fraction();
        
        Fraction fZero = Fraction.ZERO; 

           Fraction fUN   = Fraction.UN;

        System.out.println("constante UN ="+fUN);    
        Fraction f1 = new Fraction(3, 4); // constr 2 arguments
        Fraction f2 = new Fraction(5);    // constr 1 argument
        Fraction f3 = new Fraction(); 
      
    
       

        Fraction somme = f1.add(f2);
        System.out.println(f1 + " + " + f2 + " = " + somme);


        System.out.println(f.toString1());
        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);
        System.out.println("f3 = " + f3);
        System.out.println("f1 en double = " + f1.doubleValue()); // 0.75
        System.out.println("f2 en double = " + f2.doubleValue()); // 5.0
        System.out.println("f3 en double = " + f3.doubleValue()); // 0.0
        assert fZero.toString().equals("0/1") : "Erreur : ZERO incorrecte";
        assert fUN.toString().equals("1/1") : "Erreur : UN incorrecte";
        assert f1.toString().equals("3/4") : "Erreur : f1 incorrecte";
        assert f2.toString().equals("5/1") : "Erreur : f2 incorrecte";
        assert f3.toString().equals("0/1") : "Erreur : f3 incorrecte";
        assert f1.doubleValue() == 0.75 : "Erreur : f1 double incorrect";
        assert f2.doubleValue() == 5.0 : "Erreur : f2 double incorrect";
        assert f3.doubleValue() == 0.0 : "Erreur : f3 double incorrect";
        assert somme.toString().equals("5/6") : "Erreur : addition incorrecte";
         System.out.println("Tous les tests marchent  !");


  }
}
