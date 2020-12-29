package backend

class Post(_postID: Int, _author: String, _title: String, _msg: String) extends Serializable {
  // constructors become parameters
  val postID = _postID
  val author = _author
  val title = _title
  val message = _msg

  //TODO:
  /**
   * override def equality
   * override def hashcode
   * override def toString
   * override def copy
   * def JSonReads
   * def toJSON
   */
}
