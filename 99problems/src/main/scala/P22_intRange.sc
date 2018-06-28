def unfoldr[A, B](s: B)(f: B => Option[(A, B)]): List[A] = f(s) match {

  case None => Nil
  case Some((r, n)) => r :: unfoldr(n)(f)
}

def intRange(min: Int, max: Int): List[Int] = unfoldr(min) {

    n => if( n > max) None
    else Some((n, n + 1))
}

intRange(4, 9)