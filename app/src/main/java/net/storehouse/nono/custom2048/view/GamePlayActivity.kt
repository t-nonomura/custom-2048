package net.storehouse.nono.custom2048.view

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import net.storehouse.nono.custom2048.R
import net.storehouse.nono.custom2048.actioncreator.GamePlayActionCreator
import net.storehouse.nono.custom2048.store.GamePlayStore
import org.koin.android.ext.android.inject
import org.koin.android.viewmodel.ext.android.viewModel

class GamePlayActivity : AppCompatActivity() {

    val actionCreator: GamePlayActionCreator by inject()
    val store: GamePlayStore by viewModel()

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_game_play)

        observe()
    }

    private fun observe() {
        store.afterList.observe(this, Observer {
            updateBoard()
        })

        store.score.observe(this, Observer {
            updateScore()
        })
    }

    /**
     * 盤面を更新する
     */
    private fun updateBoard() {

    }

    /**
     * スコアを更新する
     */
    private fun updateScore() {
        
    }
}
