package backend
import play.api.libs.json._
import play.api.libs.functional.syntax._
import play.api.libs.json.Reads._
import akka.actor._
//case class Post(postID: Int, author: String, title: String, content: String)

class BackendActor() extends Actor{
    override def receive: Receive = ???
}