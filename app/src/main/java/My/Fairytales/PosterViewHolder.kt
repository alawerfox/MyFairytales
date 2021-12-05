package My.Fairytales

import androidx.appcompat.view.menu.MenuView
import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class PosterViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView)  {

    private val posterImageView: ImageView = itemView.findViewById(R.id.poster)

    fun bind(poster: Poster) {
        posterImageView.setImageResource(poster.image)
    }
}