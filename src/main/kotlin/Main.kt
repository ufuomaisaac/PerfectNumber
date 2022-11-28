fun main(args: Array<String>) {
    fun main(args: Array<String>) {
        checkPerfectNumber(45)
    }

    fun checkPerfectNumber(num : Int) {
        var result = 0
        for(i in 1 .. num/2) {
            if(num % i == 0) {
                result += i
            }
        }
        if(result == num) {
            println("$num is a perfect number")
        } else
            println("$num is not a perfect number")
    }

}