# BorderControl

It’s the future, you’re the ruler of a totalitarian dystopian society inhabited by citizens and robots, since you’re afraid of rebellions you decide to implement strict control of who enters your city. Your soldiers check the Ids of everyone who enters and leaves.

You will receive from the console an unknown amount of lines until the command "End" is received, on each line, there will be the information for either a citizen or a robot who tries to enter your city in the format 

"{name} {age} {id}" for citizens and "{model} {id}" for robots. 

After the end command on the next line, you will receive a single number representing the last digits of fake ids, all citizens or robots whose Id ends with the specified digits must be detained.

The output of your program should consist of all detained Ids each on a separate line (the order of printing doesn’t matter).

![image](https://user-images.githubusercontent.com/81368587/181762024-fd5a5213-6078-4b52-a504-dd5ed51b5ea6.png)

Examples
--------------------

Input:

     Peter 22 9010101122
     MK-13 558833251
     MK-12 33283122
     End
     122
   
 Output:
 
     9010101122
     33283122

Input:

     Teo 31 7801211340
     Anna 29 8007181534
     IV-228 999999
     Simon 54 3401018380
     KKK-666 80808080
     End
     340
     
Output:
      
     7801211340
