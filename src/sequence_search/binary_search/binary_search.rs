pub fn binary_search(seq: Vec<i32>, key: i32) -> bool {
    let mut low: usize = 0;
    let mut high: usize = seq.len();

    while low <= high {
        let mid = low + ((high - low) / 2);
        
        if seq[mid] < key {
            low = mid + 1;
        } else if seq[mid] > key {
            high = mid - 1;
        } else {
            return true;
        }
    }

    false
}