package example.myapp

fun buildAquarium(){
    val aquarium6 = Aquarium(width = 25, length = 25, height = 40)
    aquarium6.printSize()
    val myTower = TowerTank(diameter = 25, height = 40)
    myTower.printSize()
}

fun main(){
    buildAquarium()
}

