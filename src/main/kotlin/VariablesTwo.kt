fun main(args: Array<String>) {
    var x:Int
    val y:Int

    x = 20
    x = 30
    println(x)

    y= 40
    println(y)
    // Calculating SI of a loan borrowed
    var principle = 100000
    var rate = 2.5
    var time = 5
    var interest = (principle * rate * time) / 100.0
    println("your interest is $interest")

    // Calculating the volume of a cylinder

    var radius = 200
    var height = 150
    var pie = 3.14
    var volume = (pie * radius * height) * 1/3

    println("your volume is $volume")
}