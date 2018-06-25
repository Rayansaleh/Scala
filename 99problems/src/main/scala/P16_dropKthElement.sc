//Delete an element depending on the given index

def dropKthElement[A](index: Int, elements: List[A]): List[A] = {

  elements.take(index - 1) ++ elements.drop(index)

}

val exl: List[Int] = List(1, 2, 3, 4, 5)

dropKthElement(5, exl)