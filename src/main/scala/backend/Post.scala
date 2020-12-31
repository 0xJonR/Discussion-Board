package backend

class Post(_uniqueID: Int, _author: String, _title: String, _content: String, _replies: List[Reply] = List[Reply]()) extends Serializable {
  val uniqueID = _uniqueID
  val author = _author
  val title = _title
  var content = _content
  var replies = _replies
  var instructorResponse: Reply = null

  def addReply(r: Reply): Unit = {
    if(r.isInstructorResponse) instructorResponse = r
    else {
      this.replies = this.replies :+ r
    }
  }

}

object Post{
}
