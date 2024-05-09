import java.util.ArrayList;
import java.math.*;
class Main 
{
    public static void main(String[] args) // [1,2,3,4] base 2
    {

        private int IterativeBaseConverter(ArrayList<Integer> digits, int base)
        {
            int ans = 0;
            for (int i = 0; i < digits.size(); i++;)
            {
                ans += digits[i] * Math.pow(base,digits.size()-i);
            }
            return ans


        }

        
    }
}