package org.fasttrackit;


public class App 
{
    public static void main( String[] args )
    {
        Game game = new Game();



       Animal dog = new Dog("Azorel", 2,"Wood Catch");
       Animal dog1 = new Dog("Ciaica", 7,"Running");
       Animal cat = new Cat("Izzy", 5, "Laser");

       game.AddAnimal(dog);
       game.AddAnimal(cat);
       game.AddAnimal(dog1);
       String listaNumeAnimale = game.GetAllAnimalNames();

       System.out.println(listaNumeAnimale);


    }
}
