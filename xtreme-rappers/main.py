import itertools
from itertools import combinations
import string
import random
def rSubset(arr, r): 
    return list(combinations(arr, r)) 
  
def randomString(stringLength=10):
    """Generate a random string of fixed length """
    letters = string.ascii_lowercase
    return ''.join(random.choice(letters) for i in range(stringLength))

# Driver Function 
if __name__ == "__main__": 

    a = input()
    a=a.split(' ')

    rapper_a_word_list = [randomString(4) for x in range(int(a[0]))]
    rapper_b_word_list = [randomString(4) for x in range(int(a[1]))]
    print(rapper_a_word_list, rapper_b_word_list)
    r = 2



    a = rSubset(rapper_a_word_list, 2)
    b = rSubset(rapper_b_word_list, 1)
    print(a, b)
    kemungkinan = [(x,y) for x in a for y in b]
    print(len(kemungkinan))

