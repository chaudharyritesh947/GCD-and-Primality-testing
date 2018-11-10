/*lemoins conjucture ..

Any odd integer greater than 5 can be expressed as a sum of an
 odd prime (all primes other than 2 are odd) and an even semiprime.
 A semiprime number is a product of two prime numbers. This is called Lemoine’s conjecture
 .*/
 
// C++ code to verify Lemoine's Conjecture 
// for any odd number >= 7 
#include<bits/stdc++.h> 
using namespace std; 
  
// Function to check if a number is 
// prime or not 
bool isPrime(int n) 
{ 
    if (n < 2) 
        return false; 
          
    for (int i = 2; i <= sqrt(n); i++) { 
        if (n % i == 0) 
            return false; 
    } 
    return true; 
} 
  
// Representing n as p + (2 * q) to satisfy 
// lemoine's conjecture 
void lemoine(int n) 
{ 
    // Declaring a map to hold pairs (p, q) 
    map<int, int> pr; 
      
    // Declaring an iterator for map 
    map<int, int>::iterator it; 
    it = pr.begin(); 
      
    // Finding various values of p for each q 
    // to satisfy n = p + (2 * q) 
    for (int q = 1; q <= n / 2; q++)  
    {  
        int p = n - 2 * q; 
          
        // After finding a pair that satisfies the 
        // equation, check if both p and q are 
        // prime or not 
        if (isPrime(p) && isPrime(q)) 
          
            // If both p and q are prime, store 
            // them in the map 
            pr.insert(it, pair<int, int>(p, q)); 
    } 
      
    // Displaying all pairs (p, q) that satisfy 
    // lemoine's conjecture for the number 'n' 
    for (it = pr.begin(); it != pr.end(); ++it) 
        cout << n << " = " << it->first 
             << " + (2 * " << it->second << ")\n"; 
} 
  
// Driver Function 
int main() 
{ 
    int n = 39; 
    cout << n << " can be expressed as " << endl; 
      
    // Function calling 
    lemoine(n); 
      
    return 0; 
} 
  