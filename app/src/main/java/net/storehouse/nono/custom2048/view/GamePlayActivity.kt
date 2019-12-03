package net.storehouse.nono.custom2048.view

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import net.storehouse.nono.custom2048.R
import net.storehouse.nono.custom2048.actioncreator.GamePlayActionCreator
import org.koin.android.ext.android.inject

class GamePlayActivity : AppCompatActivity() {

    val actionCreator: GamePlayActionCreator by inject()

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_game_play)
    }
}
