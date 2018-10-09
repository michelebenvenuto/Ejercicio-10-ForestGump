class ForrestGump(
        val chocaltebox: BoxOfThings<Chocolate>
)
{
    fun pickChocolate():String{
        var pickedChocolate=this.chocaltebox.pickOne()
        if (pickedChocolate!=null){
            return "Se saco un $pickedChocolate"
        }
        return "No hay chocolate en la caja D:"
    }
}