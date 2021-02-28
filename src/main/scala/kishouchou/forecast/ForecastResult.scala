package kishouchou.forecast

private[this] case class Area(
    name: String,
    code: String
)
private[this] case class Areas(
    area: Area,
    weatherCodes: List[String],
    weathers: List[String],
    winds: List[String],
    waves: List[String]
)
private[this] case class TimeSeries(
    timeDefines: List[String],
    areas: List[Areas]
)
case class ForecastResult(
    publishingOffice: String,
    reportDatetime: String,
    timeSeries: List[TimeSeries]
)
