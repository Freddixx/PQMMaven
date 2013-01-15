#######################################################
#######    Assignment 7: Maven w/ Cobertura    ########
#######################################################

_______________________________________________________
|-----   Part 1 - extend your final exercise 6  ------|

# cobertura:cobertura

..runs without any problems. The report is properly 
generated.

# What is the actual code quality (code coverage) of 
# your existing software?

As I had implemented a few of my tests prior to this 
assignment (cf. with the test list from the previous 
assignments) my code coverage is already at 97%. 


_______________________________________________________
|------    Part 2 - improve the code coverage   ------|

# ..if you've less than 50% of code coverage, what you 
# have to do for improving this measurement?

The code coverage is already at 97%. 

# Is Test-driven development (TDD) a good software 
# development process in combination with code 
# coverage? Why (not)?

Yes, if you stick to the principles of TDD then there
is no piece of code that isn't involved in any test
case. So you are working at a high code covery level
from the start.

# The impact of poor component quality is magnified by 
# the complexity of interactions. What is a good 
# measurement for code coverage, 25% / 50% / 75% / 100%
# in general or complex  development? Why (not)?

A good measurement in general is 75%. As you normally 
have some kind of method overhead that doesn't 
necessarily require testing like getters / setters. 
Moreover there will always be methods that are dead 
simple and would waste time to write a test for.

# Is there a correlation between increasing software 
# complexity and higher code coverage? Yes.

Yes, if you define complex as mentally challenging.
Methods that are hard to grasp definitely need 
testing. Especially software parts that are tough
to understand should be tested thoroughly in order
to guarantee functionality. 

