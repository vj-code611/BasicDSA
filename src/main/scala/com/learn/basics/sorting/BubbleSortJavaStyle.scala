package com.learn.basics.sorting

/*
1.  Starting from the first index, compare the first and the second elements.
    If the first element is greater than the second element, they are swapped.
    Now, compare the second and the third elements. Swap them if they are not in order.

 2. The same process goes on for the remaining iterations. After each iteration, the largest element among the unsorted elements is placed at the end.
    In each iteration, the comparison takes place up to the last unsorted element.
    The array is sorted when all the unsorted elements are placed at their correct positions.

The above process goes on until the last element.
 */
object BubbleSortJavaStyle extends App {

  def sortMethod1(inArr: Array[Int]) = {

    for (i <- 0 until inArr.length - 1; j <- 0 until inArr.length - i - 1) {
        if (inArr(j) > inArr(j + 1)) {
          val temp = inArr(j)
          inArr(j) = inArr(j + 1)
          inArr(j + 1) = temp
        }
    }

  }

  val inArr = Array(5, 1, 6, 2, 9, 66)
  sortMethod1(inArr)
  println(s"outArr: ${inArr.foreach(println)}")




}
