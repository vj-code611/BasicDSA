package com.learn.basics.search

object BinarySearchFunctionalWay {

  def binarySearch(input: Array[Int], searchEle: Int, low: Int, high: Int): Int = {
    if (low >= high) -1
    else {
      val mid = (low + high) / 2

      if(searchEle==input(mid)) mid
      else if (searchEle < input(mid)) binarySearch(input, searchEle, low, mid)
      else binarySearch(input, searchEle, mid + 1, high)
    }
  }

  def main(args: Array[String]): Unit = {
    val inArr = Array(1, 2, 3, 4, 5, 6)
    val len = inArr.length
    println(s"Index of 6 in Array :${binarySearch(inArr, 6, 0, len)}")
    println(s"Index of 1 in Array :${binarySearch(inArr, 1, 0, len)}")
    println(s"Index of 10 in Array :${binarySearch(inArr, 10, 0, len)}")
  }

}
