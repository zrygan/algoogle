def binary_search(seq, key):
    low = 0
    high = len(seq) - 1

    while (low <= high):
        mid = (high - low) // 2

        if seq[mid] < key:
            low = mid + 1
        elif seq[mid] > key:
            high = mid - 1
        else:
            return True
    
    return False