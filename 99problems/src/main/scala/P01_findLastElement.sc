
// Print the last element of a list.

def findLastElement[A](elements: List[A]): A = elements match {

    case y :: Nil => y
    case _ :: tail => findLastElement(tail)
    case _ => throw new NoSuchElementException
}

val exl: List[Int] = List(1, 2, 3, 12)

findLastElement(exl)