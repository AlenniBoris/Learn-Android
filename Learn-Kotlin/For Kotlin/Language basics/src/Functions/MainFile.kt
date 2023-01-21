package Functions

import java.util.Scanner

//fun hello(){
//    println("Hello")
//}

fun displayUser(name: String, age: Int){
    println("$name + $age")
}

fun user(name: String, age: Int = 18, type: String = "Student"){
    println("$name + $age + $type")
}

// Ошибка, т.к. это val-переменная
//fun change(n: Int){
//    n *= 2
//}

fun printSum(vararg nums: Int){
    var res = 0;
    for (num in nums){
        res+=num;
    }
    println(res)
}

fun printSum2(border: Int,vararg nums: Int){
    var res = 0;
    for (num in nums){
        if(num < border){
            res+=num
        }
    }
    println(res)
}

fun changeNumbers(vararg numbers: Int, koef: Int){
    for(num in numbers){
        print(num*koef)
        print(" ")
    }
}

fun sum(x: Int, y: Int): Int{
    return x+y;
}

fun sum1(x: Int, y: Int) = x+y;

fun checkAge(age: Int){
    if(age < 0 || age > 110){
        println("Invalid age")
        return
    }
    println("Age is valid")
}

fun compareAge(age1: Int, age2: Int){

    fun ageIsValid(age: Int) = age in 1..119;
    if (!ageIsValid(age1) || !ageIsValid(age2)){
        println("Invalid age")
        return
    }

    when{
        age1 > age2 -> println("age1 > age2")
        age1 < age2 -> println("age1 < age2")
        age1 == age2 -> println("age1 = age2")
    }
}

fun sum(a: Double, b:Int){
    println("$a + $b = ${a+b}")
}

fun main(){
//    hello()

//    displayUser("Boris", 18)

//    user("Boris")
//    user("Boris", 19)
//    user("Boris", 21, "Graduate")

//    printSum(1,2,3,4,5,6)
//    printSum2(4,1,2,3,4,5,6)

//    val nums = intArrayOf(1,2,3,4,5)
//    changeNumbers(*nums, koef = 2)

//    println(sum(2,3))
//    println(sum1(2,3))

//    checkAge(120)

//    compareAge(-4,21)

//    println(sum(1,2))
//    sum(1.2, 2)

//    var message: (Int, Int) -> Int
//    message = ::sum
//    var res = message(1,8)
//    println(res)
//    message = ::sum1
//    res = message(2,10)
//    println(res)

//    displayMessage(::morning)
//    displayMessage(::evening)
//    displayMessage(::hello)

//    action(2,3, ::sum)
//    action(10,3, ::subtract)
//    action(5,4, ::multiply)

//    val action1 = selectAction(1)
//    println(action1(1,2))
//    val action2 = selectAction(2)
//    println(action2(7,2))
//    val action3 = selectAction(3)
//    println(action3(8,2))
//    val action4 = selectAction(5)
//    println(action4(1,1))

//    val hello = { println("Hello world") }
//    hello()

//    val hello: ()->Unit = { println("hello world") }
//    println(hello())

//    {println("Hello Kotlin")}();
//    {println("Kotlin on Metanit.com")}()

//    val printer = { message: String -> println(message) }
//    printer("printer")
//
//    val sum = {x:Int, y:Int -> println(x + y)}
//    sum(2, 3)

//    println(selectAction(1)(2,3))
//    action(2,3, ::subtract)

//    val message = fun() = println("Hello")
//    message()

//    val sum = fun(a: Int, b: Int): Int{
//        return a+b
//    }
//    val result = sum(2,3)
//    println(result)

//    val printer = { message: String -> println(message) }
//    printer("Hello")
//    printer("Goodbye")

//    val sum = { x: Int, y: Int ->
//        var result = x + y
//        println("$x plus $y equals $result")
//        result
//    }
//    println(sum(2,3))

    doOperation(5,2 , {a,b -> a+b} )
    doOperation(5,2) { a, b -> a + b }
}


fun doOperation(x: Int, y: Int, op: (Int, Int) ->Int){
    val result = op(x, y)
    println(result)
}

fun selectAction(key: Int) : (Int, Int) -> Int{
    when(key){
        1 -> return ::sum
        2 -> return ::subtract
        3 -> return ::multiply
        else -> return ::empty
    }
}

fun empty(n1: Int, n2: Int) = 0

fun action(n1: Int, n2: Int, op : (Int, Int) -> Int){
    var res = op(n1, n2);
    println(res)
}

fun subtract(n1: Int, n2: Int) = n1 - n2

fun multiply(n1: Int, n2: Int) = n1 * n2

fun displayMessage(mes: () -> Unit){
    mes()
}

fun morning(){
    println("Morning")
}

fun evening(){
    println("Evening")
}

fun hello(){
    println("Hello")
}