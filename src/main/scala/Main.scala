import kishouchou.{AreaCode, KishouInfoUrl}

import io.Source

@main def hello: Unit = {
    println("Hello world!")
    println(msg)
    // val res = Source.fromURL("https://www.jma.go.jp/bosai/jmatile/data/wdist/VPFD/130010.json")
    // println(res.mkString)

//    val pathCode = Source.fromURL("http://www.jma.go.jp/bosai/common/const/area.json")
  val res = Source.fromURL(KishouInfoUrl.forecast(AreaCode.Tokyo.code))
  println(res.mkString)
}

def msg = "I was compiled by Scala 3. :)"
