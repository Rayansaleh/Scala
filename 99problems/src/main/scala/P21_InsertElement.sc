def insertElement[A](el: A, pos: Int, elements: List[A]): List[A] = elements.splitAt(pos) match {

  case (head, tail) => head ::: el :: tail

}

val exl: List[Char] = List('a', 'a', 'a', 'a', 'a', 'a', 'b', 'b', 'a', 'a','c')

insertElement('z', 4, exl)