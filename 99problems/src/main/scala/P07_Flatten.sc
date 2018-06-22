def flatten(elements: List[Any]): List[Any] = elements flatMap {
  case y : List[_] => flatten(y)
  case w => List(w)
}

val exl: List[Any] = List(1, 2 ,3, 4)
val exll: List[Any] = List("c", "f")


flatten(List(exl, exll))
