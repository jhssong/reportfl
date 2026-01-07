{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/linear/RealVectorPreservingVisitor.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RealVectorPreservingVisitor",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 27,
      "end_line": 58,
      "comment": "\n * This interface defines a visitor for the entries of a vector. Visitors\n * implementing this interface do not alter the entries of the vector being\n * visited.\n *\n * @version $Id$\n * @since 3.1\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorPreservingVisitor.start(int, int, int)",
      "begin_line": 36,
      "end_line": 36,
      "comment": "\n     * Start visiting a vector. This method is called once, before any entry\n     * of the vector is visited.\n     *\n     * @param dimension the size of the vector\n     * @param start the index of the first entry to be visited\n     * @param end the index of the last entry to be visited (inclusive)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorPreservingVisitor.visit(int, double)",
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n     * Visit one entry of the vector.\n     *\n     * @param index the index of the entry being visited\n     * @param value the value of the entry being visited\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RealVectorPreservingVisitor.end()",
      "begin_line": 57,
      "end_line": 57,
      "comment": "\n     * End visiting a vector. This method is called once, after all entries of\n     * the vector have been visited.\n     *\n     * @return the value returned by\n     * {@link RealVector#walkInDefaultOrder(RealVectorPreservingVisitor)},\n     * {@link RealVector#walkInDefaultOrder(RealVectorPreservingVisitor, int, int)},\n     * {@link RealVector#walkInOptimizedOrder(RealVectorPreservingVisitor)}\n     * or\n     * {@link RealVector#walkInOptimizedOrder(RealVectorPreservingVisitor, int, int)}\n     ",
      "child_ranges": []
    }
  ]
}