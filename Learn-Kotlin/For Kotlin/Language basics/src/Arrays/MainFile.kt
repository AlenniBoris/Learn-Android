package Arrays

import java.util.Arrays
import java.util.Vector

fun main(){
//    val arr : Array<Int> = Array(5, {5})

//    val arr : Array<Int> = arrayOf(1,2,3,4,5)

    val arr : Array<Int> = Array(5) { it -> it * 2 }

//    for (el in arr){
//        println(el)
//    }

//    var i = 0
//    while (i in arr.indices){
//        println(arr[i])
//        ++i
//    }

//    for (i in arr.indices){
//        println(arr[i])
//    }

//    println(5 in arr)
//    println(4 in arr)

//    val numbers = intArrayOf(1,2,3,4,5)
//    val numbers = IntArray(5, {5})
//    for (i in numbers.indices){
//        println(numbers[i])
//    }

    var i = 0;
    val matrix : Array<Array<Int>> = Array(4, { Array(4, { i++ * 2 } ) } )
    for (line in matrix){
        for (row in line){
            print("$row \t")
        }
        println()
    }
}

