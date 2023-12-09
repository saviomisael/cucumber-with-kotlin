package hellocucumber

class IsItFriday {
    companion object {
        fun isItFriday(today: String): String {
            if(today == "Sunday") return "Nope"

            return "TGIF"
        }
    }
}