package companionobject

fun main(args: Array<String>) {
    println(TheCarLikeLightinMcQueen.driveInstructionGeneric())
}

/**
 * Companion object
 *
 * > static code
 * > makes class code available without the need for an object
 *
 *
 * */

class TheCarLikeLightinMcQueen {
    companion object {
        fun driveInstructionGeneric(): String {
            return "Drive safe!"
        }
    }
}