package food.industry

data class LunchFood(var id:String, var title:String, var price:Double):IFood{
    override fun toString(): String {
        return "$title\t\t\t\t\t$price"
    }
}