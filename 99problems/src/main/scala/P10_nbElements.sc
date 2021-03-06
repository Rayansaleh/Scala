//Pack same elements together and print them with their given number

def nbElements[A](elements: List[A]): List[(Int, A)] = {
  packElement(elements) map { e => (e.length, e.head)}
}

def packElement[A](elements: List[A]): List[List[A]] = {

  if(elements.isEmpty) List(List())
  else{

    val (packed, next)  = elements span { _ == elements.head }
    if (next == Nil) List(packed)
    else packed :: packElement(next)
  }

}

val exl: List[String] = List("a", "a", "a", "a", "a", "a", "b", "b", "a", "a","c")

nbElements(exl)