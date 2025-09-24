class Aquarium(var width: Int, var height: Int, var length: Int) {
    fun volume() = width * height * length
}

fun main() {
    val aquarium = Aquarium(20, 40, 100)
    println("Volume akuarium: ${aquarium.volume()} liter")
}