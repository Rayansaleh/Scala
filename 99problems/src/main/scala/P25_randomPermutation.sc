import scala.reflect.ClassTag

def randPermute[A: ClassTag](elements: List[A]): List[A] = {

  val rand = new util.Random
  val x = elements.toArray

  for ( y <- x.length - 1 to 1 by -1){
    val y1 = rand.nextInt(y + 1)
    val w = x(y)
    x.update(y, x(y1))
    x.update(y1, w)
  }
  x.toList
}

val exl: List[Symbol] = List('a, 'b, 'c, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'l)

randPermute(exl)