package food.industry

import kotlin.collections.MutableList

class LunchFoodMenu {
    private var menu: MutableList<IFood> = mutableListOf()

    constructor() {
        initMenu()
    }

    private fun initMenu() {
        menu.addAll(
            listOf(
                LunchFood("lun01", "Ca Loc Kho Tieu", 23000.0),
                LunchFood("lun02", "Thit kho tieu", 22000.0),
                LunchFood("lun03", "Ga Kho", 25000.0),
                LunchFood("lun04", "Thit Bo Xao Cu Hanh", 25000.0)
            )
        )
    }

    fun getMenu(): MutableList<IFood> {
        return menu
    }

    fun setMenu(newFood: IFood) {
        menu.add(newFood)
    }

    fun getMenuItem(index: Int): IFood {
        return menu.get(index)
    }
}
