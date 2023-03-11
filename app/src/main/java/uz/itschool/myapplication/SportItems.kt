package uz.itschool.myapplication

import android.widget.ImageView
import android.widget.TextView

data class SportItems(var img: Int, var tv1: String, var tv2:String, var tv3: String )

object Mocklist {


    fun getModel() : List<SportItems>{

        val itemModel1 =  SportItems(
            R.drawable.baseball_bg,
            "Baseball",
            "News",
            "Baseball is a bat-and-ball game played between two teams who take turns between batting and fielding a baseball. "
        )

        val itemModel2 =  SportItems(
            R.drawable.badminton_bg,
            "Badminton",
            "News",
            "Badminton is a racket sport played on a rectangular court that is divided by a net. It can be played by either two opposing players (singles) or two opposing pairs (doubles) who take positions on opposite halves of a court."
        )

        val itemModel3 =  SportItems(
            R.drawable.soccer,
            "Soccer",
            "News",
            "Association football, more commonly known as football or soccer, is a team sport played between two teams of 11 players who primarily use their feet to propel a ball around a rectangular field called a pitch."
        )

        val itemModel4 =  SportItems(
            R.drawable.basketball,
            "Basketball",
            "News",
            "Basketball is a team sport in which two teams, most commonly of five players each, opposing one another on a rectangular court, compete with the primary objective of shooting a basketball through the defender's hoop, while preventing the opposing team from shooting through their own hoop."
        )

        val itemList: ArrayList<SportItems> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)
        itemList.add(itemModel4)

        return itemList
    }
}
