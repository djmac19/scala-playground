package com.github.djmac19

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.funspec.AnyFunSpec
import com.github.djmac19.Main._

class MainSpec extends AnyFunSpec {
    describe("genList") {
        it("should generate a list of all integers between 1 and i (inclusive)") {
            val expectedResult: List[Int] = 
                List(1, 2, 3, 4, 5)

            val actualResult: List[Int] = 
                genList(5)

            expectedResult === actualResult
        }

    }
    describe("isEven") {
        it("should return 'this is even' when passed an even number") {
            
            val expectedResult = "this is even"

            val optActualResult: Option[String] = isEven(10)

            val actualResult =  optActualResult match {
                case Some(value) => value
                case None =>    fail
            }

            actualResult === expectedResult

        }
    }
    describe("outputWeekdayString") {
        it("should return 'Monday' when passed the weekday Monday") {
            val expectedResult = "Monday"
            val actualResult = outputWeekdayString(Monday)
            actualResult === expectedResult
        }
    }
}