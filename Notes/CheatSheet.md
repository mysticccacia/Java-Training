🔹 String Methods
str.length(),
str.charAt(i),
str.equals("abc"),
str.contains("ab"),
str.startsWith("H"),
str.toLowerCase(),
str.trim(),
str.split(" ")


🔹 ArrayList Methods
list.add(val),
list.get(i),
list.set(i, val),
list.remove(i),
list.contains(val),
list.clear(),
list.isEmpty(),
list.removeIf()


🔷 String (Immutable)

Once created, cannot be changed.

Stored in String pool (interned).

Commonly used for read-only or fixed text.

| Method                                                  | Description                                     |
| ------------------------------------------------------- | ----------------------------------------------- |
| `length()`                                              | Returns the length of the string                |
| `charAt(int index)`                                     | Returns the character at the specified index    |
| `substring(int start, int end)`                         | Returns substring                               |
| `equals(String another)`                                | Compares two strings                            |
| `equalsIgnoreCase(String another)`                      | Ignores case while comparing                    |
| `compareTo(String another)`                             | Lexicographical comparison                      |
| `toLowerCase()` / `toUpperCase()`                       | Changes case                                    |
| `trim()`                                                | Removes leading/trailing whitespace             |
| `replace(char old, char new)`                           | Replaces characters                             |
| `contains(CharSequence s)`                              | Checks if sequence exists                       |
| `startsWith(String prefix)` / `endsWith(String suffix)` | Checks start/end                                |
| `split(String regex)`                                   | Splits string using regex                       |
| `indexOf(String str)` / `lastIndexOf(String str)`       | Finds position                                  |
| `isEmpty()`                                             | Checks if string is empty                       |
| `concat(String str)`                                    | Appends another string                          |
| `intern()`                                              | Adds to string pool or returns pooled reference |



Primitive Type → Wrapper Class:
int → Integer
char → Character 
float → Float 
double → Double
boolean → Boolean
byte → Byte
short → Short 
long → Long

 Integer Class Methods:

 parseInt(String s) → int: Converts String to int 
 valueOf(String s) → Integer: Converts String to Integer object 
 compare(int a, int b): Compares two integers 
 toBinaryString(int n): Returns binary string of int 
 intValue(): Returns int value from Integer object

 Character Class Methods:

 isDigit(char ch): Checks if character is a digit 
 isLetter(char ch): Checks if character is a letter
 toUpperCase(char ch): Converts char to uppercase 
 toLowerCase(char ch): Converts char to lowercase

 Boolean Class Methods:

 parseBoolean(String s): Converts String to boolean 
 compare(boolean x, boolean y): Compares
 two booleans 
 booleanValue(): Returns boolean value from Boolean object

 Double & Float Class Methods:

 parseDouble(String s): Converts String to double 
 parseFloat(String s): Converts String to float
 isNaN(double d): Checks if value is NaN 
 doubleValue(): Returns double value from Double object
 floatValue(): Returns float value from Float object

 Autoboxing & Unboxing:

 Autoboxing: Primitive → Wrapper object automatically

 Example: Integer x = 5; Unboxing: Wrapper object → Primitive automatically
 Example: int y = x