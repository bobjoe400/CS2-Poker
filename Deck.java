import java.util.*;

public class Deck {
   private ArrayList<Card> deck;
   private Random rng = new Random();

   public Deck(){
      deck = new ArrayList<Card>();
      for(int j = 2; j < 15; j++){
              deck.add(new Card(j,"h"));
              deck.add(new Card(j,"s"));
              deck.add(new Card(j,"d"));
              deck.add(new Card(j,"c"));
      }
   }

   public Card remove(){
      int rand = rng.nextInt(deck.size()-1);
      return deck.remove(rand);
   }

   public String toString(){
      return deck.toString();
   }
}
