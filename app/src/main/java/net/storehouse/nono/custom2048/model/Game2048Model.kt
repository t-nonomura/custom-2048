package net.storehouse.nono.custom2048.model

data class Game2048Model(
//    val position: Position,
    val cellValue: CellValue,
    val direction: Direction
)

enum class Position {
    P_1, P_2, P_3, P_4, P_5,
    P_6, P_7, P_8, P_9, P_10,
    P_11, P_12, P_13, P_14, P_15,
    P_16, P_17, P_18, P_19, P_20,
    P_21, P_22, P_23, P_24, P_25
}

enum class CellValue {
    NONE,
    NUM_1,
    NUM_2,
    NUM_4,
    NUM_8,
    NUM_16,
    NUM_32,
    NUM_64,
    NUM_128,
    NUM_256,
    NUM_512,
    NUM_1024,
    NUM_2048,
}

enum class Direction {
    NONE,
    UP,
    DOWN,
    LEFT,
    RIGHT
}
