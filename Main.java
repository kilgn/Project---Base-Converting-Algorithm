import java.util.ArrayList;
import java.math.*;
class Main 
{
    public static void main(String[] args)
    {
        ArrayList<Integer> digits = new ArrayList<Integer>();
        digits.add(1);
        digits.add(2);
        digits.add(0);
        digits.add(5);
        System.out.println(IterativeBaseConverter(digits, 9));
       

        
    }
    // Iterative base converter algorithm.
    public static int IterativeBaseConverter(ArrayList<Integer> digits, int base) // Overall time complexity of O(n).
    {
        int ans = 0;
        for (int i = 0; i < digits.size();i++) // O(n)
        {

            ans += digits.get(i) * Math.pow(base,digits.size()-(i+1)); // O(1)
            //This line accesses the "digits" ArrayList and multiplies this element with the base to the power respective to the position, and adds this value to "ans".
        }
        return ans;
    }

    public static int RecursiveBaseConverter(ArrayList<Integer> digits, int base)
    {
        int ans = 0;
        if (digits.size() == 1)
        {
            return ans += digits.get(0);
        }
        else
        {   // [1,2,3,4] base 2
            ans += digits.get(0) * Math.pow(base,digits.size()-1);
            
        }

        return ans;

    }


}