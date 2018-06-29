def lotto(res: Int, tot: Int): List[Int] = {

  randomSelect(res, List.range(1, tot + 1))

}

def randomSelect[A](index: Int, elements: List[A]): List[A] = {
  if (index <= 0) Nil
  else {
    val (y, w) = removeKth((new util.Random).nextInt(elements.length), elements)
    w :: randomSelect(index - 1, y)
  }
}

def removeKth[A](rindex :Int, elements: List[A]): (List[A], A) = elements.splitAt(rindex) match {

  case (Nil, _) if rindex < 0 => throw new NoSuchElementException
  case (head, y :: tail)  => (head ::: tail, y)
  case (head, Nil) => throw new NoSuchElementException

}

lotto(6, 49)