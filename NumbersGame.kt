fun main(){
    print("Guess a number between 0 and 10:")
    var selectedNumber = 8
    try {

        var guess = readLine()!!.toInt()
        if(guess in 0..10){
            if(selectedNumber == guess){
                println("You get it!")
            }else{
                println("Wrong guess. The answer was 8")
            }
        }
        else{
            println("You should choose from 0 to 10")
        }

    }catch (e: Exception){
        println("Please enter numbers only.")
    }finally {
        print("Game Over")
    }
}