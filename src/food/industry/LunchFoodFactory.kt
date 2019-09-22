package food.industry

import kotlin.collections.MutableList

class LunchFoodFactory {
    private var menu: MutableList<IFood> = mutableListOf()

    constructor() {
        addMenu()
    }

    private fun addMenu() {
        menu.addAll(
            listOf(
                LunchFood("lun01", "Ca Loc Kho Tieu", 23000.0),
                LunchFood("lun02", "Thit kho tieu", 22000.0),
                LunchFood("lun03", "Ga Kho", 25000.0),
                LunchFood("lun04", "Thit Bo Xao Cu Hanh", 25000.0),
                Drinks(1,"Den Da",price = 20000.0),
                Drinks(2,"Nau Da",price = 25000.0),
                Drinks(3,"Bac Xiu",price = 27000.0),
                Drinks(4,"Capuchino",price = 30000.0),
                Drinks(5,"Cafe Trung",price = 35000.0)

            )
        )
    }

    fun getMenu(): MutableList<IFood> {
        return menu
    }

    fun getLunch(index: Int): IFood {
        return menu.get(index)
    }
}
