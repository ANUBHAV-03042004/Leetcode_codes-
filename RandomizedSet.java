import java.util.*;
class RandomizedSet {
    Set<Integer> v=new HashSet<Integer>();
    public RandomizedSet() {
            }
    
    public boolean insert(int val) {
        if(v.contains(val)) return false;
        else v.add(val); return true;
    }
    
    public boolean remove(int val) {
        if(v.contains(val))
        {
             v.remove(val); 
             return true;
        }
        else return false;
    }
    public int getRandom() {
          Integer[] a = v.toArray(new Integer[v.size()]);
            Random rndm = new Random(); 
            int rndmNum = rndm.nextInt(v.size()); 
  
        return a[rndmNum];
    }
public static void main(String[] args) {
 //Your RandomizedSet object will be instantiated and called as such:
 //["RandomizedSet", "insert", "remove", "insert", "getRandom", "remove", "insert", "getRandom"]
  RandomizedSet obj = new RandomizedSet();
//  [[], [1], [2], [2], [], [1], [2], []]

 boolean param_1 = obj.insert(1);
 System.out.println(param_1);
  boolean param_2 = obj.remove(2);
   System.out.println(param_2);
   
 param_1 = obj.insert(2);
 System.out.println(param_1);
 
 
  int param_3 = obj.getRandom();
   System.out.println(param_3);
   
      param_2 = obj.remove(1);
   System.out.println(param_2);
   
      
param_1 = obj.insert(2);
 System.out.println(param_1);
 
   param_3 = obj.getRandom();
   System.out.println(param_3);
 
	}
}
