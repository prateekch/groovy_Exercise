package Exercise5

class HourMinute {
    int hours, minutes

    HourMinute plus(HourMinute hourMinute) {
        HourMinute tempHourMinute = new HourMinute()

        if (hourMinute.hours <= 24 && hourMinute.hours >= 0)
            tempHourMinute.hours = hours + hourMinute.hours
        if (hourMinute.minutes <= 60 && hourMinute.minutes >= 0)
            tempHourMinute.minutes = minutes + hourMinute.minutes
        if (tempHourMinute.minutes >= 60) {
            tempHourMinute.hours += (tempHourMinute.minutes / 60)
            tempHourMinute.minutes = (tempHourMinute.minutes % 60)
        }
        tempHourMinute
    }

    HourMinute minus(HourMinute hourMinute) {
        HourMinute tempHourMinute = new HourMinute()
        if (hourMinute.hours <= 24 && hourMinute.hours >= 0)
            tempHourMinute.hours = hours - hourMinute.hours
        if (hourMinute.minutes <= 60 && hourMinute.minutes >= 0)
            tempHourMinute.minutes = minutes - hourMinute.minutes
        if (tempHourMinute.minutes <= 0) {
            tempHourMinute.minutes = Math.abs(tempHourMinute.minutes)
            tempHourMinute.hours -= (tempHourMinute.minutes / 60)
            tempHourMinute.minutes = (tempHourMinute.minutes % 60)
        }
        tempHourMinute
    }


    static void main(String[] args) {
        def hourMinute1 = new HourMinute();
        hourMinute1.hours = 1
        hourMinute1.minutes = 20

        def hourMinute2 = new HourMinute();
        hourMinute2.hours = 0
        hourMinute2.minutes = 30

        def newHourMinute = hourMinute1 + hourMinute2;
        println "Overload + operator    " +newHourMinute

        newHourMinute = hourMinute1 - hourMinute2
        println "Overload - operator    "+newHourMinute
    }

    @Override
    String toString() {
        return "HourMinute{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                '}'
    }
}
