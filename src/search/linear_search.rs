pub fn linear_search(seq: &[i32], key: i32) -> bool {
    for item in seq.iter() {
        if *item == key{
            return true;
        }
    }

    false
}