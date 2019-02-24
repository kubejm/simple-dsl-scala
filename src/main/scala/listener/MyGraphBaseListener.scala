package listener

import com.simplytyped.GraphBaseListener
import model.{Edge, Graph, Vertex}

class MyGraphBaseListener(var g: Graph) extends GraphBaseListener {
  override def exitEdge(ctx: _root_.com.simplytyped.GraphParser.EdgeContext): Unit = {
    val fromVertex = Vertex(ctx.vertex(0).ID().getText)
    val toVertex = Vertex(ctx.vertex(1).ID().getText)
    val weight = ctx.NUM().getText.toDouble

    val edge = Edge(fromVertex, toVertex, weight)
    g.addEdge(edge)
  }
}
