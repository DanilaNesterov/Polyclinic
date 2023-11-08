package appointment

import java.time.LocalDate
import java.time.LocalTime

class TimeForAppointment(
    val time: LocalTime,
    val date: LocalDate,
    var timeIsFree: Boolean = true
) {

}