import java.util.*;

public class Deck {
   private ArrayList<Card> deck;
   private Random rng = new Random();

   public Deck(){
      deck = new ArrayList<Card>();
      for(int i = 0; i < 4; i++){
        for(int j = 2; j < 15; j++){
          switch(i){
            case 0:
              deck.add(new Card(j,"h"));
              break;
            case 1:
              deck.add(new Card(j,"s"));
              break;
            case 2:
              deck.add(new Card(j,"d"));
              break;
            case 3:
              deck.add(new Card(j,"c"));
              break;
          }
        }
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
