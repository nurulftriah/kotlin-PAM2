class Aquarium2 {
    var width: Int = 20
    var height: Int = 40
    var length: Int = 100

    var volume: Int
        get() = width * height * length / 1000
        set(value) {
            height = (value * 1000) / (width * length)
        }
}

fun main() {
    val aquarium2 = Aquarium2()
    println("Volume awal: ${aquarium2.volume} liter")
    aquarium2.volume = 70
    println("Update height -> Volume baru: ${aquarium2.volume} liter, height: ${aquarium2.height}")
}