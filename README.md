# [Confitura 2015](http://tech.viacom.com/warsawsdc/confitura2015/)
## Build
``` ./gradlew clean build ```
## Duplicates

You have *very big* list of elements. Please provide best solution to detect and remove duplicated elements.

Please provide a solution and **comments** about its benefits and drawbacks. Please give us complexity (`O(n)`, `O(n^2)`, `O(ln(n))`, ...). Please think about custom classes like:

```java
class Person {
    String name;
    int age;
}
```
## Solution assumptions
For the purpose of keeping focus on algorithm logic instead of data structures, I did not try to implement custom 
list or cache. All operations are done on java.util collections: List and HashSet. Because of that, to use this 
solution with custom class, it needs to implement equals and hashCode.
Also, if we've done it DDD style, removeDuplicates function would be inside of the data structure (list), which was 
impossible here because of the use of built-in collection.

## Complexity
Running time: O(n) - single run over the list O(n) + virtually O(1) for set lookup for each element => O(n) in total
Memory usage: O(n) - if list does not contain duplicates we will end up with set with n elements.

You can check contest bye-laws [here](http://tech.viacom.com/warsawsdc/confitura2015/Regulamin_konkurs_Viacom_programmer_adventure_2015.pdf).

Check out our Confitura 2015 site [here](http://tech.viacom.com/warsawsdc/confitura2015/)

We are hiring! Visit our [career site](http://tech.viacom.com/careers/).
