import java.util.*;
public class find_missing_positive
{
	public static void main(String[] args) {
int n[]={3,4,-1,1,1,2,7};//-1 1 1 2 3 4 7
int ans=1;
Arrays.sort(n);
for(int i=0;i<n.length;i++)
{
  if(n[i]==ans) ans++;
}
       System.out.print(ans);
    }
}
