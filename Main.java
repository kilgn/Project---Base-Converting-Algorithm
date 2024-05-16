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
        System.out.println(RecursiveBaseConverter(digits, 9));


        
       

        
    }
    // Iterative base converter algorithm.
    public static int IterativeBaseConverter(ArrayList<Integer> digits, int base) // Overall time complexity of O(nlog(n)).
    {
        int answer = 0; // O(1)
        for (int i = 0; i < digits.size();i++) // O(n), depends on the size of my ArrayList.
        {

            answer += digits.get(i) * Math.pow(base,digits.size()-(i+1)); // O(log(n))
            //This line accesses the "digits" ArrayList and multiplies this element with the base to the power respective to the position, and adds this value to "ans".
        }
        return answer; // O(1)
    }
    // Recursive base converter algorithm.
    public static int RecursiveBaseConverter(ArrayList<Integer> digits, int base) // Overall time complexity of O(log(n))
    {
        
        if (digits.size() == 1) // O(1)
        {
            return digits.get(0); // O(1)
        }
        else 
        {   
            int coefficient = digits.get(0); // O(1)
            int digitsSize = digits.size(); // O(1)

            ArrayList<Integer> newDigits = digits; // O(1)
            newDigits.remove(0); // O(1)

            double tempAns = coefficient * Math.pow(base, digitsSize - 1) + RecursiveBaseConverter(newDigits, base); // O(log(n)) 
            int ans = (int)tempAns; // O(1)

            return ans; // O(1)
        }
        

        

    }

}
