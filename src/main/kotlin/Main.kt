import Yinglish.chs2yin

fun main(args: Array<String>) {
    if (args[0].isEmpty()) {
        println("没有内容！")
        return
    }
    val yingLevel = if (args[1].matches(Regex("""\D""")) || args[1].isEmpty()) 50 else args[1].toInt()
    println(args[0].chs2yin(yingLevel))
}

