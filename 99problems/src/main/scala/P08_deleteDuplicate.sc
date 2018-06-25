//Delete every Duplicates in the list

def deleteDuplicate[A](elements: List[A]): List[A] = {

  elements.distinct
}

val exl: List[String] = List("a", "a", "a", "b", "b", "c")

deleteDuplicate (exl)