# Data Structures and Algorithms
---
Data structures are ways of organizing and storing data so that it can be accessed and used efficiently. 

Some examples of data structures include: _```Array```_, _```ArrayList```_, _```Linked List```_, _```Queue```_, _```Deque```_, _```Stack```_, _```Hash Table```_, _```Tree```_, and _```Graph```_.

Algorithms are a set of instructions for solving a specific problem or accomplishing a specific task.

Some examples of algorithms include: _```Binary Search```_, _```Sorting Algorithms```_ (Bubble Sort, Merge Sort, Quick Sort), _```Depth First Search```_, _```Breadth First Search```_, and _```Dijkstra's Algorithm```_.

We have to be careful with our choices of data structures and algorithms because they have a significant impact on the efficiency and performance of our programs. Different data structures and algorithms have different time and space complexities, which affect the execution time and memory usage of our programs.

## Data Structures
---

* ### ```Array```

An array is a collection of elements of the same data type, stored in contiguous memory locations.

Use cases:
- Storing and accessing data in an ordered manner
- Implementing other data structures such as stacks and queues
- Mathematical operations (linear algebra)

Types:
- Static Array: has a fixed size and cannot be resized at runtime
- Dynamic Array: can resize during runtime as needed

* ### ```ArrayList```

An ArrayList is similar to an array, but can grow and shrink in size dynamically.

Use cases:
- Similar to arrays, but when size is not known beforehand
- When elements need to be added/removed from the middle of the collection

* ### ```Linked List```

A linked list is a collection of elements, each containing a reference to the next element in the list.

Use cases:
- When inserting or deleting elements in the middle of a collection frequently
- Implementing other data structures such as stacks and queues
- Implementing graphs and trees

Types:
- Singly Linked List: each element only points to the next element
- Doubly Linked List: each element points to both the next and previous elements

* ### ```Queue```

A queue is a collection of elements that follows the First-In-First-Out (FIFO) principle.

Use cases:
- Modeling real-life scenarios such as waiting in line
- Implementing breadth-first search algorithm
- Implementing a print spooler

* ### ```Deque```

A deque (short for double-ended queue) is a collection of elements that allows adding and removing elements from both ends.

Use cases:
- Implementing data structures such as stacks and queues
- Modeling real-life scenarios such as checking for palindromes
- Implementing algorithms such as sliding window maximum

* ### ```Stack```

A stack is a collection of elements that follows the Last-In-First-Out (LIFO) principle.

Use cases:
- Implementing algorithms such as depth-first search
- Implementing data structures such as undo-redo functionality
- Parsing expressions

* ### ```Hash Table```

A hash table is a collection of key-value pairs that uses a hash function to compute an index into an array of buckets, from which the desired value can be found.

Use cases:
- Implementing dictionaries, maps, and symbol tables
- Caching
- Counting occurrences of elements

* ### ```Tree```

A tree is a collection of elements (nodes) that are connected hierarchically.

Use cases:
- Representing hierarchical data such as file systems, organization charts, and family trees
- Implementing search algorithms such as binary search
- Implementing decision trees

Types:
- Binary Tree: each node has at most two children
- AVL Tree: a self-balancing binary search tree
- B-Tree: a self-balancing tree that can have more than two children per node

* ### ```Graph```

A graph is a collection of vertices (nodes) and edges that connect them.

Use cases:
- Representing relationships between objects, such as social networks
- Implementing search algorithms such as depth-first search and breadth-first search
- Modeling real-life scenarios such as airline routes and traffic flow
- Representing computer networks

Types:
- Directed Graph: edges have a direction and represent a one-way relationship
- Undirected Graph: edges do not have a direction and represent a two-way relationship
- Weighted Graph: edges have a weight or cost associated with them
- Directed Acyclic Graph (DAG): a directed graph with no cycles



## Algorithms
---

#### Properties of an algorithm:
* >_```Correctness```_: An algorithm is correct if it produces the desired output for every valid input.

* >_```Efficiency```_: An algorithm is efficient if it runs with reasonable time and space complexity.

* >_```Readability```_: An algorithm is readable if it is easy to understand and maintain.

* >_```Robustness```_: An algorithm is robust if it can handle unexpected inputs and situations.

* ### ```Sorting Algorithms```
- Sorting algorithm organizes data in a particular order (ascending, descending, or any other user-defined order).
- Use cases:
	- Finding the maximum or minimum value in an array or list
	- Searching for an item in a database
	- Generating a list of data in a particular order
	- Creating a frequency distribution of values in a dataset
- Types:
	- Bubble Sort: repeatedly compares adjacent elements and swaps them if they are in the wrong order
	- Merge Sort: divides the list into halves, sorts each half, and then merges the two halves back together
	- Quick Sort: selects a "pivot" element and moves smaller elements to one side and larger elements to the other
	- Insertion Sort: iterates through the list and repeatedly inserts each element into its correct position

* ### ```Searching Algorithms```
- Searching algorithm finds the position of a target value within a dataset.
- Use cases:
	- Searching for a file on a computer
	- Finding a specific item in a database
	- Looking up an email in an inbox
	- Searching for a word or phrase on a webpage
- Types:
	- Linear Search: checks each element in turn until the target value is found or the end of the list is reached
	- Binary Search: divides the list in half and checks whether the target value is in the first or second half, repeating the process until the target value is found

* ### ```Greedy Algorithms```
- Greedy algorithm makes the locally optimal choice at each step with the hope of finding a global optimum.
- Use cases:
	- Finding the shortest path in a graph
	- Solving the knapsack problem
	- Scheduling tasks to maximize productivity
- Types:
	- Dijkstra's Algorithm: finds the shortest path between nodes in a graph
	- Kruskal's Algorithm: finds the minimum spanning tree of a graph
	- Huffman Encoding: compresses data by assigning shorter codes to more frequent symbols

* ### ```Dynamic Programming```
- Dynamic programming solves problems by breaking them down into smaller subproblems and solving each subproblem only once.
- Use cases:
	- Finding the longest common subsequence of two strings
	- Solving the traveling salesman problem
	- Maximizing the value of a knapsack
- Types:
	- Memoization: stores the results of expensive function calls and returns the cached result when the same inputs occur again
	- Tabulation: builds a table and iteratively fills it in from small subproblems to larger ones



## Proof Techniques
---

We need to use proof techniques when designing data structures and algorithms because it allows us to reason about the correctness, efficiency, and other properties of our solutions. By using proof techniques, we can ensure that our algorithms and data structures are reliable, efficient, and maintainable.

Proof techniques used when designing algorithms and data structures include:

* Induction: Induction is a proof technique that allows us to prove that a statement holds true for all values of a variable. Induction is commonly used to prove the correctness of recursive algorithms or data structures.

* Contradiction: Contradiction is a proof technique that allows us to prove that a statement is true by assuming that it is false and then deriving a contradiction. Contradiction is commonly used to prove the correctness of algorithms that rely on certain assumptions.

* Invariants: Invariants are statements that remain true throughout the execution of an algorithm or operation. Invariants can be used to prove the correctness of algorithms by showing that certain properties hold true at different points in the algorithm.

* Reduction: Reduction is a proof technique that allows us to reduce a problem to a known problem or data structure. Reduction is commonly used to prove the efficiency of algorithms by showing that the time complexity of the new problem is equivalent to the time complexity of the known problem.

* Recurrence relations: Recurrence relations are equations that describe the time complexity of a recursive algorithm or data structure. Recurrence relations can be used to prove the efficiency of algorithms by solving the equation to find the time complexity.

* Pseudocode: Pseudocode is a high-level language that is used to describe algorithms in a structured and readable manner. Pseudocode can be used to prove the correctness of algorithms by showing that the algorithm correctly implements the desired functionality.