package orders

import food.industry.IFood

class Order {
    var orderlist: MutableSet<IFood> = mutableSetOf()
    fun addOrder(food: IFood) {
        orderlist.add(food)
    }

    fun viewAllOrder(): Set<IFood> {
        return orderlist
    }
}