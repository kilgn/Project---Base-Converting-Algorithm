import java.util.ArrayList;
import java.math.*;
class Main 
{
    public static void main(String[] args)
    {
        ArrayList<Integer> digits = new ArrayList<Integer>();
        digits.add(1); digits.add(2); digits.add(0); digits.add(5);
        System.out.println(RecursiveBaseConverter(digits, 9));


        
       

        
    }
    // Iterative base converter algorithm.
    public static int IterativeBaseConverter(ArrayList<Integer> digits, int base) // Overall time complexity of O(n).
    {
        int answer = 0;
        for (int i = 0; i < digits.size();i++) // O(n), depends on the size of my ArrayList.
        {

            answer += digits.get(i) * Math.pow(base,digits.size()-(i+1)); // O(1)
            //This line accesses the "digits" ArrayList and multiplies this element with the base to the power respective to the position, and adds this value to "ans".
        }
        return answer;
    }
    static double ans = 0;
    public static int RecursiveBaseConverter(ArrayList<Integer> digits, int base)
    {
        
        if (digits.size() == 1) // O(n), depends on the size of my ArrayList.
        {
            return digits.get(0);
        }
        else // temp list [1,2,0,5]
        {   
            ArrayList<Integer> newDigits = digits;
            newDigits.remove(0);
            ans += digits.get(0) * Math.pow(base, digits.size() - 1) + RecursiveBaseConverter(newDigits, base);
            int newAns = (int)ans;
            return newAns;
        }
        

        

    }

}