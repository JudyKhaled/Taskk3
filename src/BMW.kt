

class BMW(model:String, color:String,speed:Int) : Car(model,color,speed){
    override fun getFuelType(): String {
        return "Gas"
    }
}