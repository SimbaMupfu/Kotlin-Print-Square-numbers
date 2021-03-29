
    fun main(args: Array<String>){
        val squares = Array(51) { i -> i  }
        for(i in 0 until(squares.size)){
            println("The square for $i is ${squares[i]}")
        }

        println(squares.component5())
        println(squares.elementAt(9))
        println(squares.elementAtOrElse(55) { "Not Available" })

        //check if the square is odd or even
        for(i in squares.indices){
            if(i % 2 == 0){
                println("The square of $i is an odd number")
            }else{
                println("The square of $i is an even number")
            }
        }
    }
