package Example01

fun main(args: Array<String>) {
    val testMap: HashMap<String, String> = HashMap<String, String>();
    addTestData(testMap)
    for ((key, value) in testMap) {
        println("$key - $value")
    }
}

fun addTestData(map: HashMap<String, String>) {
    map["123"] = "12312"
    map["ddd"] = "asdas"
}

class MapIter {
}