def longest_common_prefix(sentence: str) -> str:
    '''Find the longest common prefix among the given words of the sentence. 

    Args:
        sentence (str): A string of space sepearated words.
    Returns: 
        str: longest prefix. 
    '''
    words = sentence.split()
    
    if not words:
        return ""
    
    # Take the first word as a reference for the prefix
    prefix = words[0]
    
    for word in words[1:]:
        # Reduce the prefix until it matches the current word
        while not word.startswith(prefix):
            prefix = prefix[:-1]
            if not prefix:
                return ""
    
    return prefix
    ...


print(longest_common_prefix('flower flow flight'))

