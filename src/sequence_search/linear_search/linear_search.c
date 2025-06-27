int linear_search(int* seq, int key)
{
    for (int item = 0; item < len(seq); item++)
    {
        if (seq[item] == key)
        {
            return 1;
        }
    }

    return 0;
}