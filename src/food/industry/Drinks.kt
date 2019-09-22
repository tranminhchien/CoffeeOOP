package food.industry

data class Drinks(var id: Int,var name: String,var price: Double):IFood {
    override fun toString(): String{
        return "$name\t\t\t\t$price";
    }
}