abstract class Animal {
  abstract void move();
  abstract void eat();
   void label() {
     System.out.println ("Void Label");
   }
}

class Bird extends Animal {
   void eat() {
     System.out.println ("Eats seeds.");
   }

   void move() {
     System.out.println ("Moves by flying.");
   }
}

class Fish extends Animal {
  void eat() {
    System.out.println ("Eats seafood.");
  }

  void move() {
    System.out.println ("Moves by swimming.");
  }
}
