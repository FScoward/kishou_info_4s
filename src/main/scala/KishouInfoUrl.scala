object KishouInfoUrl {
  private val base = "https://www.jma.go.jp/bosai" 
  val xxx = s"${base}/jmatile/data/wdist/VPFD/130010.json"
  def forecast(areaCode: String) = s"${base}/forecast/data/forecast/${areaCode}.json"
}