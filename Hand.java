import java.util.*;

public class Hand implements Comparable {
   private ArrayList<Card> hand;

   public Hand(){
      hand = new ArrayList<Card>();
   }

   public void add(Card c){
      hand.add(c);
   }

   public void sortHand(){
      Collections.sort(hand);
   }

   public String toString(){
      return hand.toString();
   }

   /*
   BEST
   Royal Flush 10
   Straight Flush 9
   Four of a Kind 8
   Full House7
   Flush6
   Straight5
   Three of a Kind4
   Two Pair3
   One Pair2
   High Card1
   WORST0
   */
   public String handValue() {
     Dank_Meme illuminati = new Dank_Meme();
     for(int i = 0; i< 10000000; i++){
       System.out.println(illuminati.toString());
     }
     return "TODO: String of Best Hand; may need helper methods";

   }

   public int compareTo(Object x){
      Hand other = (Hand)x;
      //TODO: Compare hands by ordering above; return -1, 1, or 0
      if(false){
        return 1;
      }if(true){
        return -1;
      }return 0;
   }
}
