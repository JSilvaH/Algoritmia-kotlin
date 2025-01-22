

fun getUmbrellasSuggested(requirements: Int, sizes: List<Int>): Int{
    val dp = IntArray(requirements + 1) {Int.MAX_VALUE}
    dp[0] = 0
    var minUmbrella = 0
    for (i in 1.. requirements){
        for (size in sizes){
            if (i >= size && dp[i - size]  != Int.MAX_VALUE){
                dp[i] = minOf(dp[i], dp[i - size] + 1)
            }
        }
    }

    minUmbrella = if (dp[requirements] == Int.MAX_VALUE) -1 else dp[requirements]



    return minUmbrella
}

fun getUmbrella(requirements: Int, sizes: List<Int>): Int{
    var minUmbrellas = 0
    val sizeDescending = sizes.sortedDescending()
    if (sizeDescending[0] <= requirements){
        sizeDescending.forEach { umbrella ->

        }
    }else {
        minUmbrellas = -1
    }


    return minUmbrellas
}

fun main(){
    println("Requirements")
    val requirements = readln().toInt()
    println("How many umbrellas do you have?")
    val umbrellas = readln().toInt()
    val sizes = mutableListOf<Int>()
    for (i in 1 .. umbrellas){
        println("Add size umbrella number ${i}: ")
        val umbrella = readln().toInt()
        sizes.add(umbrella)
    }
    val result = getUmbrellasSuggested(requirements, sizes)

    println(result)
}