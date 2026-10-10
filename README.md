# Java Sorting Algorithms

Clean implementations of three classic sorting algorithms in Java.

## Structure
```
src/
├── Main.java                  # demo runner
└── sorting/
    ├── BubbleSort.java
    ├── SelectionSort.java
    └── InsertionSort.java
```

## Run
```bash
javac -d out $(find src -name "*.java")
java -cp out Main
```

## Complexity
| Algorithm | Best | Average | Worst | Space | Stable |
|-----------|------|---------|-------|-------|--------|
| Bubble (optimized) | O(n) | O(n²) | O(n²) | O(1) | Yes |
| Selection | O(n²) | O(n²) | O(n²) | O(1) | No |
| Insertion | O(n) | O(n²) | O(n²) | O(1) | Yes |

## How they work
- **Bubble Sort**: repeatedly swaps adjacent elements that are out of order; stops early if a pass makes no swaps.
- **Selection Sort**: picks the smallest remaining element and places it at the next position.
- **Insertion Sort**: inserts each element into its correct place in the already-sorted left part.
