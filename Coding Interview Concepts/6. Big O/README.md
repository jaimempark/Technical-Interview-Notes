## Big O


Big O time: the metric used to descibe the efficiency of algorithms


Runtime generally has 3 different cases:

- Best Case: In the best case scenario, quicksort will on average traverse the array just once, leading to O(N) runtime.

- Worst Case: If the pivot is repeatedly the biggest element in the array, recursion will split the array by 1 each time instead of halving it, leading to O(N^2) runtime.(this can happen if the array is sorted in reverse order and the pivot is the first element in the subarray)

- Expected Case: The pivot is not expected to be the lowest or the highest number all the time. In every other case, the runtime is O(N log N)


We don't usually care about the best case scenario, only the worst case and expected case.
