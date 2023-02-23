package example.myapp

fun buildAquarium(){
    val aquarium = Aquarium()
    aquarium.printSize()
    aquarium.height = 60
    aquarium.printSize()
}

fun main(){
    buildAquarium()
}

