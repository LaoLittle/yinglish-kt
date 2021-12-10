import com.huaban.analysis.jieba.JiebaSegmenter
import com.huaban.analysis.jieba.WordDictionary

object Yinglish {

    fun String.chs2yin(yingLevel: Int): String {
        val b = JiebaSegmenter().process(this, JiebaSegmenter.SegMode.SEARCH)
        var yinglish = ""

        b.forEach { keyWord ->
            val part = WordDictionary.getInstance().parts[keyWord.word]
            val chars = keyWord.word.toCharArray()
            yinglish = yinglish.plus(getYinglishNode(chars, part, yingLevel))
        }
        return yinglish
    }

    private fun getYinglishNode(chars: CharArray, part: String?, yingLevel: Int): String {
        val randomOneTen = { (1..100).random() }
        var pon = ""
        if (randomOneTen() > yingLevel)
            return String(chars)
        if (chars[0] == '！' || chars[0] == '!')
            return "❤"
        if (chars[0] == '。' || chars[0] == '，')
            return "…"
        if (chars.size > 1 && randomOneTen() > 50)
            return "${chars[0]}…${String(chars)}"
        else if (part == "n" && randomOneTen() > 50) {
            repeat(chars.count()) { pon += "〇" }
            return pon
        }
        return "…${String(chars)}"
    }
}