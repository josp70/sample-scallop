package com.jsuit

import org.rogach.scallop._

class Conf(arguments: Seq[String]) extends ScallopConf(arguments) {
  val apples = opt[Int](required = true)
  val bananas = opt[Int]()
  val name = trailArg[String]()
  verify()
}

object Main extends App {
    val conf = new Conf(args)  // Note: This line also works for "object Main extends App"
    println("apples are: " + conf.apples())
}
