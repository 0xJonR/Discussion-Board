package backend

class User(_id: Int, _name: String)  {
  val id = _id
  val name = _name
  var numPosts = 0

  def createPost(uniqueID: Int, title: String, content: String): Post = {
    Post(uniqueID, name, title, content)
  }

  def replyToPost(p: Post, content: String): Unit = {

    val r = new Reply(name, content, p)
    p.addReply(r)
  }
}

class Student(_id: Int, _name: String) extends User(_id: Int, _name: String)
class Professor(_id: Int, _name: String) extends User(_id: Int, _name: String){
  override def replyToPost(post: Post, content: String): Unit = {
    val r = new
  }
}