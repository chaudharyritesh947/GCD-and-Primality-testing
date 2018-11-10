
// Java program to check if given n is 
// k-rough or not. 
  
class GFG { 
      
// Returns true if n is k rough else false 
static boolean isKRough(int n, int k) 
{ 
    // If n is even, then smallest  
    // prime factor becomes 2. 
    if (n % 2 == 0) 
        return (k <= 2); 
  
    // n must be odd at this point. So we 
    // can skip one element (Note i = i + 2) 
    for (int i = 3; i*i <= n; i = i + 2) 
        if (n % i == 0) 
            return (i >= k); 
  
return (n >= k); 
} 
  
/* Driver program to test above function */
public static void main(String[] args) 
{ 
    int n = 75, k = 3; 
    if (isKRough(n, k)) 
        System.out.println(n + " is a " + 
                     k + "-rough number"); 
    else
        System.out.println(n + " is not a " + 
                        k + "-rough number"); 
} 
} 
  