# secret-additive

You are given a function 'secret()' that accepts a single integer parameter and returns an integer. In your favorite programming language, write a command-line program that takes one command-line argument (a number) and determines if the secret() function is additive [secret(x+y) = secret(x) + secret(y)], for all combinations x and y, where x and y are all prime numbers less than the number passed via the command-line argument.  Describe how to run your examples. Please generate the list of primes without using built-in functionality.

# How to run the program
Clone the project, open with Intellij, run the AdditiveClient.java which has the main method. Must have Java 5 or above.

# Example output
Enter a number: 100
prime numbers are: [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97]
is secret additive? true