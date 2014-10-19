package model
import org.scalatest.{FlatSpec, Matchers}

class IsbnTest extends FlatSpec with Matchers {

  "An Isbn" should "be valid for a valid ISBN" in {
    val valid_isbn = "9788866325154"
    val isbn = new Isbn(valid_isbn)
    isbn.isValid should equal (true)
  }

  it should "be invalid for an invalid ISBN" in {
    val invalidIsbn = "1234567890123"
    val isbn = new Isbn(invalidIsbn)
    isbn.isValid should equal (false)
  }

  it should "be valid for a isbn 10" in {
    val validisbn10 = "0-306-40615-2"
    val isbn = new Isbn(validisbn10)
    isbn.isValid should equal (true)
  }

}
