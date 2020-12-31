package backend

class Reply(_author: String, _content: String, _thread: Post, _instructorResponse: Boolean = false) {
  val author : String = _author
  val content: String = _content
  val thread : Post = _thread
  val isInstructorResponse: Boolean = _instructorResponse
}
