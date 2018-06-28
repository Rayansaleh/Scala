def removeKth[A](rindex :Int, elements: List[A]): (List[A], A) = elements.splitAt(rindex) match {

  case (Nil, _) if rindex < 0 => throw new NoSuchElementException
  case (head, y :: tail)  => (head ::: tail, y)
  case (head, Nil) => throw new NoSuchElementException

}

val exl: List[Char] = List('a', 'a', 'a', 'a', 'a', 'a', 'b', 'b', 'a', 'a','c')

removeKth(4, exl)