class Chocolate(val name:String):Candy(name)
{
    override fun toString(): String {
        return """
            Chocolate: ${this.name}
        """.trimIndent()
    }
}