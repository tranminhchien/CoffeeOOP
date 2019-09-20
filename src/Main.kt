class Menu{
    var Name : String = ""
    var Price : Double = 0.0
    var Amount: Int = 0
    constructor()
    constructor(Name:String,Price:Double,Amount:Int){
        this.Name = Name;
        this.Price = Price;
        this.Amount = Amount;
    }
    fun OutPutBill():Double{
        return Price * Amount
    }

}

fun main(arg: Array<String>) {
    var Option1 = Menu("Coffee",1.5,2)
    var Option2 = Menu("Milk Coffee",2.0,1)
    var a : Double = Option1.OutPutBill()
    var b : Double = Option2.OutPutBill()
    var c: Double = a + b
    println("${Option1.Name} Price:${Option1.Price}$ Amount:${Option1.Amount}  =${Option1.OutPutBill()}$")
    println("${Option2.Name} Price:${Option2.Price}$ Amount:${Option2.Amount}  =${Option2.OutPutBill()}$")
    println("Total:$c $")
    println("Thank you!!")
}