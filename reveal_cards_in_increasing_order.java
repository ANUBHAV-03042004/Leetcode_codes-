import java.util.*;
class reveal_cards_in_increasing_order {
public static int[] deckRevealedIncreasing(int[] deck) {
    Arrays.sort(deck);
    Deque<Integer> ans=new ArrayDeque<>();
    int []res=new int [deck.length];
for(int i=0;i<deck.length;i++)
    {
        ans.add(i);
    }
    for(int i=0;i<deck.length;i++)
    {
res[ans.poll()]=deck[i];
if(!ans.isEmpty()) ans.add(ans.poll());
    }
     return res; 
    }
	public static void main(String[] args) {
	   int[]q={17,13,11,2,3,5,7};
	   System.out.print(Arrays.toString(deckRevealedIncreasing(q)));
	}
}
