def findLastButOne[A](elements: List[A]): A = elements match {
    case y :: List(w) => y
    case _ :: tail => findLastButOne(tail)
    case _ => throw new NoSuchElementException
}

val exl: List[String] = List("a", "b", "c", "d")

findLastButOne(exl)