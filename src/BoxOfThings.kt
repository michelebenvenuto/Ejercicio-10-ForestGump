import java.util.*

class BoxOfThings<T>(
    var buffer: ArrayList<T>
)
{
    fun pickOne(): T? {
        if (this.buffer.size>0){
            return this.buffer.removeAt(Random().nextInt((this.buffer.size)))
        }
        return null
    }
}
