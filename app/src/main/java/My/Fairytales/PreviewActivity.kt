package My.Fairytales

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class PreviewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fairytale_text)

        val fairyTale = intent.extras?.getSerializable(ARG) ?: return
        val (title, content) = when (fairyTale) {
            Fairytale.FAIR_TALE_1 ->
                R.string.Fairytale1 to readFairyTale(R.raw.fairytale1)


            Fairytale.FAIR_TALE_2 ->
                R.string.Fairytale2 to readFairyTale(R.raw.fairytale2)

            Fairytale.FAIR_TALE_3 ->
                R.string.Fairytale3 to readFairyTale(R.raw.fairytale3)

            Fairytale.FAIR_TALE_4 ->
                R.string.Fairytale4 to readFairyTale(R.raw.fairytale4)

            else -> return
        }

        findViewById<TextView>(R.id.fairy_tale_title).setText(title)
        findViewById<TextView>(R.id.fairy_tale_content).setText(content)
    }

    private fun readFairyTale(resId: Int): String {
        return resources.openRawResource(resId)
            .bufferedReader()
            .use {
                it.readText()
            }
    }

    companion object {
        const val ARG = "fairy_tale_arg"
    }
}