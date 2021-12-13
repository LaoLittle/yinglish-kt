# 淫语翻译机！

能把中文翻译成淫语的翻译机！

## 样例

```kotlin
import Yinglish
s = "不行，那里不行。"
println(s.chs2yin(50))
// 不行，那……那里不行……
s2 = "吃葡萄不吐葡萄皮。"
println(s2.chs2yin(50))
// ……吃〇〇不吐葡……葡萄皮……
```


## 说明

```kotlin
s.chs2yin(yinLev)
```

s是原字符串，yinLev是1~100的实数，越大越淫乱，表示每个词语被转化的概率。