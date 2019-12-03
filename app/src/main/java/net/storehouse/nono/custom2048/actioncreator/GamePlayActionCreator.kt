package net.storehouse.nono.custom2048.actioncreator

import net.storehouse.nono.custom2048.action.SwipeAction
import net.storehouse.nono.custom2048.model.Direction
import net.storehouse.nono.custom2048.util.Dispatcher

class GamePlayActionCreator(val dispacther: Dispatcher) {
    fun swipe(direction: Direction) {
        dispacther.dispatch(SwipeAction(direction))
    }


}
