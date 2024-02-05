// ********************************************* LET ****************************************
// muito usada para verificação de nulo.


fun customPrint(s: String) {
    print(s.uppercase())
}
fun main() {
    val empty = "test".let {
        customPrint(it)
        it.isEmpty()
    }
    println(" is empty: $empty")
}

fun printNonNull(str: String?) {
    println("Printing \"$str\":")

    str?.let {
        print("\t")
        println()
    }
}