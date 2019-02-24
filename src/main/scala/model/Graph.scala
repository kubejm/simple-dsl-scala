package model

class Graph() {
  private var _edges = List[Edge]()
  private var _vertices = Set[Vertex]()

  def edges = _edges

  def vertices = _vertices

  def addEdge(edge: Edge): Unit = {
    _edges = _edges :+ edge

    _vertices += edge.fromVertex
    _vertices += edge.toVertex
  }

  def addVertice(vertex: Vertex): Unit = {
    _vertices += vertex
  }
}
