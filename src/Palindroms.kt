fun main(args: Array<String>){
    val textOne = "jose"
    val textTwo = "sejo "

    println(palindromesOne(normalizeW(textOne), normalizeW(textTwo)))
    println(palindromesTwo(textOne, textTwo))

}
///////////////////////////////////////////////////////////////////////////////////////////
fun palindromesTwo(textOne: String, textTwo: String):Boolean{
    return sortWord(textOne) == sortWord(textTwo)
}

fun sortWord(word: String):String{
    val charArray = word.toLowerCase().trim().toCharArray()
    charArray.sort()
    return String(charArray)
}
//////////////////////////////////////////////////////////////////////////////////////////////
fun palindromesOne(textOne: String, textTwo: String): Boolean {
    if(textOne.length != textTwo.length) return false

    val charArrayOne = textOne.toCharArray()
    val charArrayTwo = textTwo.toCharArray()
    charArrayOne.sort()
    charArrayTwo.sort()
    val word1 = String(charArrayOne)
    val word2 = String(charArrayTwo)

    if (word1 == word2){
        return true
    }
    return  false

}

fun normalizeW(word:String): String{
    return word.toLowerCase().trim();
}
