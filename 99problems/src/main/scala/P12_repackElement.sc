//Create a list of elements depending of the number of they are suppose to appear

def repackeElement[A](elements: List[(Int, A)]): List[Char] = {
  elements flatMap { case (h, t) => List.fill(h)(t).mkString}
}

val exl: List[(Int, Char)] = List((6,'a'), (2,'b'), (2,'a'), (1,'c'))

repackeElement(exl)