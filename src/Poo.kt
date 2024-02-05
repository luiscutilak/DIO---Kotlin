// PROGRAMAÇAO ORIENTADA A OBJETOS


// ******************************** (Inheritance) HERANÇA SIMPLES ******************************************

/*
open class Dog {      // open class pode ser usada como extensao de outra classe - sem o * Open * nao conseguimos extender essa classe
    open fun sayHello() {
        println("wow wow!");
    }
}

class Yorkshire : Dog() {  // Si le, yorkshire é um chachorro, ou seja ele herda todas as caracteristicas da classe Dog()
    override fun sayHello(){  // sobreescrever a função sayHello() herdada da classe Dog()
        println("wif wif!")
    }
}

fun main() {
    val dog = Yorkshire()
    dog.sayHello()
}

 */

// **************************** Herança Com Parametro Construtor *************************************


/*
open class Tiger(val origin: String) {   // a classe Tiger, esta declarada como Open, ou seja, pode extender a uma classe filha, e receber parametros
    fun sayHello() {                                        // a funcao sayHello() nao extende a outras classes. ´Pois nao tem o Open
        println("A Tiger from $origin says: grrrrhhhh!")
    }
}

class SiberianTiger : Tiger("Siberia") // Criamos a classe filha SiberianTiger : Herdada da classe Tiger que espera um parametro do tipo String

fun main() {
    val tiger: Tiger = SiberianTiger()          //instanciando OBJETO, SiberianTiger(), Herdado da classe Tiger,
    tiger.sayHello()   // chamando a função já instanciada com nome tiger. chamando a função sayHello()
}

 */

// ***************************** Herança Passando Argumentos do Construtor para a Superclasse ******************************

/*
open class Lion(val name: String, val origin:String) {
    fun sayHello(){
        print ("$name, the lion from $origin says: graoh!")
    }

}

class Asiatic(name: String) : Lion(name = name, origin = "India")
fun main() {
    val lion: Lion = Asiatic("Rufo")
    lion.sayHello()
}

// exploramos os 4 conceitos da Orientação a objetos.

// * Abstração
// * Encapsulamento ( todas as funções são finally, não tem como sobrescrever)
// * Herança
// * Polimorfismo - a questão que podemos tratar o "Lion" de uma forma mais genérica! ou o "Asiatic" como uma forma mais especifica.

*/

// ******************************************* DATA CLASSES *************************************************

// Data classes são classes pra que armazenemos valores!
// override  -> sobescrever a fução apenas para igualar e testar a condição de igualdade do Id.
// hashCode -> é um código HASH pega as propriedades que existem dentro da estrutura(objeto) de dados e gera um valor, por exemplo, Objeto User, secondUser, thirdUser
data class User(val name: String, val id: Int) {
    override fun equals(other: Any?) = other is User && other.id == this.id
}

fun main() {
    val user = User("Alex", 1)
    println(user)
    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)

    println("user == secondUser: ${user == secondUser}") // dois iguais compara somente as estruturas do objeto entao retorna true(comparação entre user e secondUser, que tem estruras iguais, como Id, e nome.
    println("user == thirdUser: ${user == thirdUser}") //

    println(user.hashCode())
    println(secondUser.hashCode())
    println(thirdUser.hashCode())

    println(user.copy())
    println(user === user.copy())
    println(user.copy("Max"))
    println(user.copy(id = 3))
    println(user.copy("Max", id = 4))

    println("name = ${secondUser.component1()}")
    println("id = ${thirdUser.component2()}")

}












