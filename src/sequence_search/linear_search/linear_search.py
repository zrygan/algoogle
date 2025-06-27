def linear_search(seq, key):
    for item in seq:
        if item == key:
            return True
    
    return False