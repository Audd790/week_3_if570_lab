package example.myapp.decor

fun makeDecorations()
{
    val decoration1 = Decoration("Granite")
    println(decoration1)

    val decoration2 = Decoration("Slate")
    println(decoration2)

    val decoration3 = Decoration("Slate")
    println(decoration3)
    println(decoration1.equals(decoration2))
    println(decoration3.equals(decoration2))

    val d5 = Decoration2("crystal", "wood", "diver")
    println(d5)

    val(rock, wood, diver) = d5
    println(rock)
    println(wood)
    println(diver)
}
data class Decoration(val rocks:String)
data class Decoration2(val rocks:String, val wood:String, val diver:String)



fun main()
{
    makeDecorations()
}