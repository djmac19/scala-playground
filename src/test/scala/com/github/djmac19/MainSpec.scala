package com.github.djmac19

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.funspec.AnyFunSpec
import com.github.djmac19.Main._

class MainSpec extends AnyFunSpec {
    describe("genList") {
        it("should generate a list if whatever...") {
            val expectedResult: List[Int] = 
                List(1, 2, 3, 4, 5)

            val actualResult: List[Int] = 
                genList(5)
            
            expectedResult === actualResult
        }

    }
}