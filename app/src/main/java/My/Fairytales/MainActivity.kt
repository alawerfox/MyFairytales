package My.Fairytales

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var posterRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        posterRecyclerView =findViewById(R.id.poster)

        val posterList:List<Poster> = listOf(
            Poster(R.drawable.poster1),
            Poster(R.drawable.poster2),
            Poster(R.drawable.poster3),
            Poster(R.drawable.poster4),
            Poster(R.drawable.poster5),
            Poster(R.drawable.poster6),
            Poster(R.drawable.poster7),
            Poster(R.drawable.poster8)
        )

        posterRecyclerView.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)

        posterRecyclerView.adapter=PosterAdapter(posterList)

        listOf(
            findViewById<View>(R.id.menu_button1),
            findViewById<View>(R.id.menu_button2),
            findViewById<View>(R.id.menu_button3),
            findViewById<View>(R.id.menu_button4),
        ).forEach { it.setOnClickListener(this) }
    }

    override fun onClick(p0: View?) {
        val id = p0?.id ?: return

        val intent = Intent(this, PreviewActivity::class.java)

        when(id) {
            R.id.menu_button1 -> {
                intent.putExtra(PreviewActivity.ARG, Fairytale.FAIR_TALE_1)
            }
            R.id.menu_button2 ->{
                intent.putExtra(PreviewActivity.ARG,Fairytale.FAIR_TALE_2)
            }
            R.id.menu_button3 -> {
                intent.putExtra(PreviewActivity.ARG,Fairytale.FAIR_TALE_3)
            }
            R.id.menu_button4 -> {
                intent.putExtra(PreviewActivity.ARG,Fairytale.FAIR_TALE_4)
            }
        }

        startActivity(intent)
    }
}