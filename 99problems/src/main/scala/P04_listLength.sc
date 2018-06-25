//Print the list's size

def listLength[A](elements: List[A]): Int = elements.foldLeft(0) {
  (y, _) => y + 1
}

val exl: List[Int] = List(1, 2, 3 ,8, 18, 12, 12)

listLength(exl)

