/*
    Implement an algorithm to determine if a string has all unique characters. What if
    you cannot use additional data structures
*/

fun main(args: Array<String>){
    print(isUniqueChars("aa"))
}



fun isUniqueChars(str: String): String{
    if (str.length > 128) return  "Character repeated"

    val map = HashMap<Char, Int>()

    for (i in str.indices){
        if(map.containsKey(str[i])){
            return "Character repeated"
        }else{
            map[str[i]] = i
        }
    }
    return "No character is  repeated"
}