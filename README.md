# Unhandled Exception in Scala Method

This repository demonstrates a common coding error in Scala:  failing to properly handle exceptions in methods.  The example shows a scenario where an exception is thrown, potentially leading to unexpected program termination.  The `bug.scala` file shows the erroneous code, while `bugSolution.scala` illustrates how to improve it using either `Try` or a default return value.

## Problem

The `myMethod` function in `bug.scala` throws an `IllegalArgumentException` if the input `x` is not greater than the object's `value`.  Without proper exception handling in the calling code, this can crash the program. 

## Solution

`bugSolution.scala` presents two ways to address this:

1. **Using `Try`:** The `Try` monad gracefully handles potential exceptions.  The program continues executing even if `myMethod` throws an exception.
2. **Default Return Value:** If appropriate, the method can return a default value instead of throwing an exception. This prevents the abrupt program termination, making it more robust.

This example highlights the importance of considering exception handling for robust and reliable Scala programs.