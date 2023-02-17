fun main(){
    val name = "Akirachix"
    println(name[0]+""+name[2]+""+name[3])
    greetPerson("Rachel",23)
    countWord("Milcah")
   hiFive("Rachel")
    hiFive("Clever")
}
fun greetPerson(name: String, age: Int): String{
    var greetperson=("Hi, my name is $name and I am $age years old")
    println(greetperson)
    return greetperson
}
fun countWord(word: String){
    println(word.length)
}
fun hiFive(name: String){
    if (name=="Rachel")
        println("That's me")
    else
        println("I don't know who that is")
}