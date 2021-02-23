package com.learn.basics.stakeDS

object StakeDS extends App{

  private var list :List[Int] = List[Int]()

  def size:Int= list.size

  def push(a:Int) = list= list:+a

  def pop:Int = {
    val pop= if(! list.isEmpty){
      list = list.tail
      list.head
    } else -1
    pop
  }

  val in = StakeDS
  in.push(10)
  in.push(6)
  in.push(9)
  in.push(66)
  list.foreach(println)
  println(s"initial size: ${in.size}")
  println(in.pop)
  println("List:")
  list.foreach(println)
  println(s"After 1st pop-size: ${in.size}")
  println(in.pop)
  println("List:")
  list.foreach(println)
  println(s"After 2nd pop-size: ${in.size}")
  println(in.pop)
  println(s"After 3rd pop-size: ${in.size}")
  println("List:")
  list.foreach(println)




}
