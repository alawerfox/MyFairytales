package My.Fairytales

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class PosterAdapter(private val posterList: List<Poster>): RecyclerView.Adapter<PosterViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PosterViewHolder {
        val itemView= LayoutInflater.from(parent.context).inflate(R.layout.view_poster,parent,false)
        return PosterViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: PosterViewHolder, position: Int) {
        val poster = posterList[position]
        holder.bind(poster)
    }

  
    override fun getItemCount(): Int {
        return posterList.size
    }

}