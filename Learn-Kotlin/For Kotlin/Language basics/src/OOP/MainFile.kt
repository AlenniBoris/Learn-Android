package OOP

fun main(){
//    val tom: Person = Person("Tom", 17)
//    val bob: Person = Person("Bob")
//    val sam: Person = Person("Sam", 35)
//
//    tom.sayHello()
//    tom.go("Las-Vegas")
//    println(tom.personToString())


//    val tom: Employee = Employee("Tom", "Innowise")
//    tom.printName()
//    tom.printCompany()

//    val tom: Person = Person("Tom", 18)
//    tom.printPerson()
//    tom.age = 12
//    tom.printPerson()

//    val tom = Person("Tom")
//    println("${ tom._name } ; ${ tom._age }")
//    val bob = Employee("Tom")
//    println("${ bob._name } ; ${ bob._age }")

    val Alice: Person = Person("Alice", 18)
    println(Alice.toString())
    val Kate: Person = Alice.copy(name = "Kate")
    println(Kate.toString())
}

data class Person(val name: String, val age: Int){}

//open class Employee(name: String, override var _age: Int = 10): Person(name, _age){}
//
//open class Person(val _name: String,open var _age: Int = 0){}

//class Person(_name: String, _age: Int){
//    var name: String = _name
//    var age: Int = _age
//        set(value) {
//            field = value + 2
//        }
//
//    fun printPerson(){
//        println("Person(name='$name', age=$age)")
//    }
//}

//open class Person{
//    var name: String = "Undefined"
//
//    constructor(userName: String){
//        name = userName
//    }
//
//    fun printName(){
//        println(name)
//    }
//}
//
//class Employee(empName: String, val company: String): Person(empName){
//    fun printCompany(){
//        println(company)
//    }
//}

//class Person constructor(_name: String){
//    private var name: String = _name
//    private var age : Int = 0
//
//    constructor(_name: String, _age: Int) : this(_name){
//        age = _age
//    }
//
//    fun sayHello(){
//        println("Hello, my name is $name")
//    }
//
//    fun go(location: String){
//        println("$name goes to $location")
//    }
//
//    fun personToString() : String{
//        return "Name: $name  Age: $age"
//    }
//}
