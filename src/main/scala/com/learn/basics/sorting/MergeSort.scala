package com.learn.basics.sorting

object MergeSort extends App {

  def mergeSort(inList: List[Int]): List[Int] = {
    val n = inList.length / 2
    if (n == 0) inList
    else {
      def merge(a: List[Int], b: List[Int]): List[Int] =
        (a, b) match {
          case(Nil, b) => b
          case(a, Nil) => a
          case(a1 :: aTail, b1 :: bTail) =>
            if (a1 < b1) a1::merge(aTail, b)
            else b1 :: merge(a, bTail)
        }
      val (left, right) = inList.splitAt(n)
      merge(mergeSort(left), mergeSort(right))
    }
  }

  val inList = List(2, 4, 1, 10, 15, 32, 6)
  println(s"Sorted List : ${mergeSort(inList)}")

}
