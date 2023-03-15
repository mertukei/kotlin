fun main(args: Array<String>) {
    //WHILE LOOPS
        // while loop
    var counterOne = 0
    while (counterOne <= 5){
        println(counterOne)
        counterOne++
    }
        // do while loop
    var counterTwo = 10
    do {
        println(counterTwo)
        counterTwo++
    }while (counterTwo <= 15)
    //FOR LOOPS
        // for loop
    for ( num in 20.. 25){
        print(num)
    }
    for (num in 50 downTo  45){
        println(num)
    }
        // for each loop
    var names = listOf("Josiah", "James", "Lorna", "Juma", "Victoria")
    names.forEach{
        println(it)
    }
    // REPEAT LOOP
    repeat(5){
        println("hello world")
    }
}