fun main() {
    println("--- Task 1 : Triangle Inversé ---")
    task1()

    println("\n--- Task 2 : Triangle Impair ---")
    task2()

    println("\n--- Task 3 : Double Triangle (Diamant) ---")
    task3()
}

// Task 1 — Triangle aligné à droite (5 lignes)
fun task1() {
    for (i in 1..5) {
        val numberOfSpaces = i - 1
        for (j in 1..numberOfSpaces) {
            print(" ")
        }

        val numberOfStars = 6 - i
        for (j in 1..numberOfStars) {
            print("*")
        }
        println()
    }
}

// Task 2 — Triangle “impair” aligné à droite (9 → 1 étoiles)
fun task2() {
    for (i in 1..5) {
        val numberOfSpaces = i - 1
        for (j in 1..numberOfSpaces) {
            print(" ")
        }

        val numberOfStars = 11 - i * 2
        for (j in 1..numberOfStars) {
            print("*")
        }
        println()
    }
}

// Task 3 — Double triangle (montée puis descente)
fun task3() {
    val height = 5

    // 1) Montée
    for (i in 1..height) {
        val numberOfSpaces = height - i
        for (j in 1..numberOfSpaces) print(" ")

        val numberOfStars = i
        for (j in 1..numberOfStars) print("*")

        println()
    }

    // 2) Descente
    for (i in (height - 1) downTo 1) {
        val numberOfSpaces = height - i
        for (j in 1..numberOfSpaces) print(" ")

        val numberOfStars = i
        for (j in 1..numberOfStars) print("*")

        println()
    }
}