package com.github.djmac19
import com.github.djmac19.Main.Monday
import com.github.djmac19.Main.Tuesday
import com.github.djmac19.Main.Wednesday
import com.github.djmac19.Main.Thursday
import com.github.djmac19.Main.Friday

object Main extends App {
    def genList(i: Int): List[Int] = 
        (0 to i).toList


    def isEven(x: Int): Option[String] = 
        if (x % 2 == 0) {
            Some("this is even")
        } else {
            None
        }
        
    sealed trait Weekdays
    case object Monday extends Weekdays
    case object Tuesday extends Weekdays
    case object Wednesday extends Weekdays
    case object Thursday extends Weekdays
    case object Friday extends Weekdays

    def outputWeekdayString(day: Weekdays): String =
        day match {
            case Monday => "Monday"
            case Tuesday => "Tuesday"
            case Wednesday => "Wednesday"
            case Thursday => "Thursday"
            case Friday => "Friday"
        }


    
}