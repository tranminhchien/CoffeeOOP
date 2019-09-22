import food.industry.IFood
import food.industry.LunchFoodMenu
import orders.Order
import java.lang.Exception

fun main(args: Array<String>) {
    var foodMenu = LunchFoodMenu()
    println("*** Menu Hom Nay ***")
    displayMenu(foodMenu)

}

fun displayMenu(foodMenu: LunchFoodMenu) {
    for ((index, item) in foodMenu.getMenu().withIndex()) {
        println("${index + 1}. $item")
    }
}

fun multiChoice(foodMenu: LunchFoodMenu) {
    var orders = Order()
    var userChoice = userChoice(foodMenu)
    orders.addOrder(userChoice)

    var isContinueChoice = true
    while (isContinueChoice) {
        println("Ban co muon chon them khong (y/n): ")
        var choice = readLine()
        if (choice == "y") {
            orders.addOrder(userChoice)
        } else {
            isContinueChoice = false
        }
    }

    println("Ban chon: ")
    for (item in orders.viewAllOrder()) {
        println(item)
    }
}

fun userChoice(foodMenu: LunchFoodMenu): IFood {
    var choice: String?

    do {
        var isInvalidChoice = false
        print("Vui long nhap so thu tu cua mon an: ")
        choice = readLine()
        try {
            if (choice?.toInt()!! > foodMenu.getMenu().size) {
                isInvalidChoice = true
                println("Chon dung so di thim")
            }
        } catch (e: Exception) {
            isInvalidChoice = true
            println("Nhap lai bang so di thim")
        }
        // chua validate du lieu phai la so khi nhap vao
    } while (isInvalidChoice)

    var userChoice = foodMenu.getMenuItem(choice?.toInt()!! - 1)
//    println("Ban chon: $userChoice")
    return userChoice
}
