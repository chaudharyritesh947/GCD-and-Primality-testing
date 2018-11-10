
# Python program to display p-smooth  
# number in given range. 
# P-smooth numbers' array 
p_smooth = [1]  
  
def maxPrimeDivisor(n): 
      
    # Returns Maximum Prime  
    # Divisor of n 
    MPD = -1
      
    if n == 1 :  
        return 1
      
    while n % 2 == 0: 
        MPD = 2
        n = n // 2
      
    # math.sqrt(n) + 1 
    size = int(n ** 0.5) + 1
    for odd in range( 3, size, 2 ): 
        while n % odd == 0: 
              
            # Make sure no multiples  
            # of prime, enters here 
            MPD = odd 
            n = n // odd 
      
    # When n is prime itself 
    MPD = max (n, MPD)  
      
    return MPD  
  
  
def generate_p_smooth(p, MAX_LIMIT):     
      
    # generates p-smooth numbers. 
    global p_smooth 
      
    for i in range(2, MAX_LIMIT + 1): 
        if maxPrimeDivisor(i) <= p: 
              
            # Satisfies the condition  
            # of p-smooth number 
            p_smooth.append(i) 
  
  
def find_p_smooth(L, R): 
      
    # finds p-smooth number in the 
    # given [L:R] range. 
    global p_smooth 
    if L <= p_smooth[-1]: 
          
        # If user input exceeds MAX_LIMIT 
        # range, no checking 
        for w in p_smooth : 
            if w > R : break
            if w >= L and w <= R : 
                  
                # Print P-smooth numbers  
                # within range : L to R. 
                print(w, end =" ") 
                  
        print() 
          
# p_smooth number : p = 7 
# L <= R 
p = 7
L, R = 1, 100
  
# Maximum possible value of R 
MAX_LIMIT = 1000
  
# generate the p-smooth numbers 
generate_p_smooth(p, MAX_LIMIT)  
  
# Find an print the p-smooth numbers 
find_p_smooth(L, R)  