package com.shekhargulati.ninetynine_problems.scala.arithmetic

import org.scalatest.{FunSpec, Matchers}

class Problem32Test extends FunSpec with Matchers {

  describe("Problem 32 Spec") {

    it("[2,2,2] are prime factors of 8") {
      val fs = Problem32.primeFactors(8)
      fs should be(List(2, 2, 2))
    }

    it("[2,2,3] are prime factors of 12") {
      val fs = Problem32.primeFactors(12)
      fs should be(List(2, 2, 3))
    }

    it("[3,3,5,7] are prime factors of 315") {
      val fs = Problem32.primeFactors(315)
      fs should be(List(3, 3, 5, 7))
    }

    it("[3,11] are prime factors of 33") {
      val fs = Problem32.primeFactors(33)
      fs should be(List(3, 11))
    }
  }
}