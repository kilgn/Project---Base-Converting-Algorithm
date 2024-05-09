import java.util.ArrayList;
import java.math.*;
class Main 
{
    static int ans = 0;
    public static void main(String[] args)
    {
        ArrayList<Integer> digits = new ArrayList<Integer>();
        digits.add(1);
        digits.add(1);
        digits.add(1);
        digits.add(1);

        System.out.println(RecursiveBaseConverter(digits, 2));
       

        
    }
    // Iterative base converter algorithm.
    public static int IterativeBaseConverter(ArrayList<Integer> digits, int base) // Overall time complexity of O(n).
    {
        int ans = 0;
        for (int i = 0; i < digits.size();i++) // O(n), depends on the size of my ArrayList.
        {

            ans += digits.get(i) * Math.pow(base,digits.size()-(i+1)); // O(1)
            //This line accesses the "digits" ArrayList and multiplies this element with the base to the power respective to the position, and adds this value to "ans".
        }
        return ans;
    }


    public static int RecursiveBaseConverter(ArrayList<Integer> digits, int base)
    {
        if (digits.size() == 1) // O(n), depends on the size of my ArrayList.
        {
            return ans += digits.get(0) * 1;
        }
        else // [1,1,1,1] base 2
        {   
            ans += digits.get(0) * Math.pow(base, digits.size()-1);
            ArrayList<Integer> newDigits = digits;
            newDigits.remove(0);
            RecursiveBaseConverter(newDigits, base);
            return ans;
        }
        

        

    }

}