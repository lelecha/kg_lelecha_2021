# kg_lelecha_2021

the solution is in the src/solution/Main.java

please run as java Main.java 123 123

we assume that the input are two Strings: s1 and s2

1.  s1 and s2 are not null or empty strings;

2. if s1 and s2 have different length, print false;

I used HashMap to solve the problem, the time complexity is O(n) and space complexity is O(n), n is the length of the String.

we liner scan the strings in a for loop , and put the character in s1 as key and the character in s2 as value

if there is no duplicate key-value pair, we will print true.


