package com.learn.basics.search

/*
Complexity:
Worst case: O(log n)
Best case: O(1)
 */

object BinarySearchJavaStyle {

  def binarySearch(input: Array[Int], searchEle: Int):Int = {
    var low = 0
    var high = input.length
    var mid = (low+high)/2
    while(low< high && searchEle != input(mid)){
      if(searchEle < input(mid)) high = mid else low = mid+1
      mid = (low+high)/2
    }
    if(low<high) mid else -1
  }


  def main(args: Array[String]): Unit = {

    println(s"Index of 6 in Array :${binarySearch(Array(1, 2, 3, 4, 5, 6), 6)}")
    println(s"Index of 1 in Array :${binarySearch(Array(1, 2, 3, 4, 5, 6), 1)}")
    println(s"Index of 10 in Array :${binarySearch(Array(1, 2, 3, 4, 5, 6), 10)}")

  }



}
