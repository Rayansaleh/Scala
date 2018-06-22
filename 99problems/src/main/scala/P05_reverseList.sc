def reverseList[A](elements: List[A]): List[A] =  {
  elements.foldLeft(List[A]()) { (r, h) => h :: r}
}

val exl: List[Int] = List(1, 2, 3, 4, 5)

reverseList(exl)

