int binary_search(int *seq, int key)
{
    int low = 0;
    int high = len(seq) - 1;

    while (low <= high)
    {
        int mid = low + ((high - low) / 2);

        if (seq[mid] < key)
            low = mid + 1;
        else if (seq[mid] > key)
            high = mid - 1;
        else
            return 1;
    }

    return 0;
}