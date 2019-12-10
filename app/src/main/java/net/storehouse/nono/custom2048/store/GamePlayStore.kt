package net.storehouse.nono.custom2048.store

import androidx.lifecycle.MutableLiveData
import net.storehouse.nono.custom2048.action.SwipeAction
import net.storehouse.nono.custom2048.model.CellValue
import net.storehouse.nono.custom2048.model.Direction
import net.storehouse.nono.custom2048.model.Game2048Model
import kotlin.random.Random

class GamePlayStore : Store() {
    companion object {
        private const val MAX_SQUARES = 16
    }

    val swipe = MutableLiveData<Direction>()

    val score = MutableLiveData<String>()

    var beforeList = mutableListOf<Game2048Model>()

    var afterList = MutableLiveData<MutableList<Game2048Model>>()

    init {
        beforeList = initGame()
    }

    fun onEvent(action: SwipeAction) {

    }

    /**
     * 盤面のリスト初期化。16マスのうちランダムな2マスに初期数字を配置する。
     */
    private fun initGame(): MutableList<Game2048Model> {
        val list = mutableListOf<Game2048Model>()
        // 0 ~ 15の乱数
        val randomA = Random.nextInt(MAX_SQUARES)
        var randomB = Random.nextInt(MAX_SQUARES)
        while (randomA == randomB) {
            randomB = Random.nextInt(MAX_SQUARES)
        }

        for (i in 0 until MAX_SQUARES) {
            when (i) {
                randomA -> list.add(Game2048Model(CellValue.NUM_1, Direction.NONE))
                randomB -> list.add(Game2048Model(CellValue.NUM_1, Direction.NONE))
                else -> list.add(Game2048Model(CellValue.NONE, Direction.NONE))
            }
        }

        return list
    }

}
