def findKthElement[A](index: Int, elements: List[A]): A = (index, elements) match{
  case (0, y :: _) => y
  case (index, _ :: tail) if index > 0 => findKthElement(index - 1, tail)
  case _ => throw new NoSuchElementException
}

val exl: List[Int] = List(1, 2, 3, 4, 5)

findKthElement(2, exl)