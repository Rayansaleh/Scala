//Pack same elements together from left to right

def packElement[A](elements: List[A]): List[List[A]] = {

  if(elements.isEmpty) List(List())
  else{

    val (packed, next)  = elements span { _ == elements.head }
    if (next == Nil) List(packed)
    else packed :: packElement(next)
  }

}

val exl: List[String] = List("a", "a", "a", "a", "a", "a", "b", "b", "a", "a","c")

packElement(exl)