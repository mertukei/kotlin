fun main(args: Array<String>) {
    //IF STATEMENT
    var age = 20
    if (age < 18){
        println("sorry, you are underage")
    }else{
        println("welcome to the party")
    }

    var weight = 100
    var height =1.9
    var bmi = weight / (height * height)
    if (bmi <= 18){
        println("Underweight")
    }else if (bmi <= 29){
        println("normal weight")
    }else if (bmi <= 34){
        println("overweight")
    }else {
        println("obese")
    }

    // WHEN STATEMENT
    var bettingNumber = 0
    when(bettingNumber){
        1->{
           println("you lost")
        }
        2->{
            println("you lost")
        }
        3->{
            println("you lost")
        }
        4->{
            println("you lost")
        }
        else->{
            println("enter a number from 1-4 bet")
        }
    }



    
}