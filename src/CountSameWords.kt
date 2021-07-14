fun main(args:Array<String>){
    val str = "La percepción actual de los habitantes prehispánicos de Cuba viene de los relatos de los conquistadores ibéricos, llamados Cronistas de las Indias, como Bartolomé de las Casas, quien distinguió tres culturas diferentes en cuanto a rasgos étnicos, lingüísticos y de desarrollo tecnológico y social, las cuales llamó Guanahatabey, Siboney (o Sibuney) y Taína."


    countSameWords(str)
}

fun countSameWords(str: String){
    val map = HashMap<String, Int>()
    val words = str.split(" ")
    for (word in words){
        if (map.containsKey(normalize(word))){
            val value = map[normalize(word)]
            map[normalize(word)] = value!!.plus(1)
        }else {
            map[normalize(word)] = 1
        }
    }
    print(map)
}

fun normalize(word: String) :String{
    return word.toLowerCase()
        .replace(",","")
        .replace(".","")
        .replace("!","")
        .replace("(","")
        .replace(")", "")
}

