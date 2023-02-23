package example.myapp

//Abstract dan Interface
//abstract class AquariumFish()
//{
//    abstract val color:String
//}

interface FishColor
{
    val color: String
}

interface FishAction
{
    fun eat()
}


//Subclasses
class Shark: FishColor, FishAction
{
    override val color = "grey"
    override fun eat() {
        println("Hunt and eat fish")
    }
}

class Plecostomus: FishAction by PrintingFishAction("eat algea"), FishColor by GoldColor


object GoldColor: FishColor
{
    override val color: String = "gold"
}

class PrintingFishAction(val food: String) : FishAction
{
    override fun eat()
    {
        println(food)
    }
}
