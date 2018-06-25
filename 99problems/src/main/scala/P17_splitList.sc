//Split list in 2 parts at the given index

def splitList[A](index: Int, elements: List[A]): (List[A], List[A]) = {

  (elements.take(index), elements.drop(index))
}

val exl: List[Char] = List('a', 'a', 'a', 'a', 'a', 'a', 'b', 'b', 'a', 'a','c')

splitList(5, exl)