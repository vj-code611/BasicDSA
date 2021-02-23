package com.learn.basics.search

/*
It scans the element one-by-one until the item that is searched matches the item currently scanned
Complexity:
Worst case: O(n) => if the item to search is present at last index
Best case: O(1) => if the item to search is present at first index
 */

object LinearSearch {

  def linearSearch[T](input:List[T], searchEle: T):Boolean={
    if(input.isEmpty) false
    else if (input.head == searchEle) true
    else linearSearch(input.tail, searchEle)
  }

  def main(args:Array[String]): Unit ={
    println(linearSearch(List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 20, 34, 56, 345, 1245), 10))
    println(linearSearch(List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 20, 34, 56, 345, 1245), 15))
    println(linearSearch(List('a','b','c'), 'c'))
    println(linearSearch(List('a','b','c'), 'd'))
  }


}
