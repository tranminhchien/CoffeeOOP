import food.industry.LunchFoodFactory

fun main(args: Array<String>) {
    var foodMenu = LunchFoodFactory()
    println("*** Menu Hom Nay ***")
    displayMenu(foodMenu)
    userChoice(foodMenu)
}

fun displayMenu(foodMenu: LunchFoodFactory) {
    for ((index, item) in foodMenu.getMenu().withIndex()) {
        println("${index + 1}. $item")
    }
}

fun userChoice(foodMenu: LunchFoodFactory) {
    var choice: String?
    do {
        var isInvalidChoice = false
        print("Vui long nhap so thu tu cua mon an: ")
        choice = readLine()
        var index: Int? = choice?.toInt()
        // chua validate du lieu la so khi nhap vao
        if (index!! > foodMenu.getMenu().size) {
            isInvalidChoice = true
            println("Moi ban chon lai")
        }
    } while (isInvalidChoice)

    var userChoice = foodMenu.getLunch(choice?.toInt()!! - 1)
    println("Ban chon: $userChoice")

}
