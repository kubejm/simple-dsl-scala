import java.io.{File, FileInputStream}

import com.simplytyped.{GraphLexer, GraphParser}
import listener.MyGraphBaseListener
import model.Graph
import org.antlr.v4.runtime.{CharStreams, CommonTokenStream}

object SimpleDSLApplication {
  def main(args: Array[String]) : Unit = {
    if ( args.length != 1 ) {
      println("Please provide a file as an argument")
      System.exit(1)
    }

    val file = new File(args(0))
    val is = new FileInputStream(file)

    val cs = CharStreams.fromStream(is)

    val lexer = new GraphLexer(cs)

    val tokens = new CommonTokenStream(lexer)

    val parser = new GraphParser(tokens)

    val g = new Graph()

    parser.addParseListener(new MyGraphBaseListener(g))

    parser.graph()

    printGraph(g)
  }

  def printGraph(g: Graph): Unit = {
    println("Vertices...")
    g.vertices.foreach(v => print(v.label + " "))

    println("")

    println("Edges...")
    g.edges.foreach { println }
  }
}
