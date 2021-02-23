package com.learn.basics.sorting

/**
 * Functional implementation of bubble sort
 * sort function swaps each element in the given list and create new list and iterate the same operation for length of the list times.
 * sort function takes three parameters
 * a) iteration list -> this is used to track the iteration. after each iteration element is dropped so that sort function exists the iteration list is empty
 * b) source list -> this is source list taken for element wise sorting
 * c) result -> stores the element as it get sorted and at end of each iteration, it will be the source for next sort iteration
 */

object BubbleSortFunctionalWay extends App  {
  def bubblesort(source: List[Int]) : List[Int]  = {

    def sort(iteration: List[Int], source: List[Int] , result: List[Int]) : List[Int]= source match {
      case h1 :: h2 :: rest =>
        if(h1 > h2) sort(iteration, h1 :: rest, result :+ h2)
        else sort(iteration, h2 :: rest, result :+ h1)
      case l:: Nil => sort(iteration, Nil, result :+ l)
      case Nil => if(iteration.isEmpty)  result else sort(iteration.dropRight(1), result, Nil )
    }
    sort(source,source,Nil)
  }
  println(bubblesort(List(4,3,2,224,15,17,9,4,225,1,7)))
  //List(1, 2, 3, 4, 4, 7, 9, 15, 17, 224, 225)
}
