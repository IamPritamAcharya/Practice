# Python program to print all the permutation
# of the given String.

# Count of total permutations
total = 0

def swap(arr, i, j):
    temp = arr[i]
    arr[i] = arr[j]
    arr[j] = temp
    return arr

def permute(i, s):
    global total

    # Base case
    if(i == (len(s) - 1)):
        print(s)
        total += 1
        return
    
    prev = '*'
    
    # Loop from j = 1 to length of String
    for j in range(i,len(s)):
        temp = list(s)
        if (j > i and temp[i] == temp[j]):
            continue
        if (prev != '*' and prev == s[j]):
            continue
        
        # Swap the elements
        temp = swap(temp,i,j)
        prev = s[j]
        
        # Recursion call
        permute(i + 1, "".join(temp))

def sortString(inputString):

    # Convert input string to char array
    tempArray = list(inputString)
        
    # Sort tempArray
    tempArray.sort()
        
    # Return new sorted string
    return "".join(tempArray)

# Driver code
s = "abca"

# Sort
s = sortString(s)

# Function call
permute(0, s)
print(f"Total distinct permutations = {total}")

# This code is contributed by shinjanpatra