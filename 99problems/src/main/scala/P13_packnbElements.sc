def packnbElements[A](elements: List[A]): List[(Int, Any)] = {

  if(elements.isEmpty) Nil
  else {
    val (h, t) = elements span { _ == elements.head }
    (h.length, h.head) :: packnbElements(t)
  }
}

val exl: List[Char] = List('a', 'a', 'a', 'a', 'a', 'a', 'b', 'b', 'a', 'a','c')

packnbElements(exl)
