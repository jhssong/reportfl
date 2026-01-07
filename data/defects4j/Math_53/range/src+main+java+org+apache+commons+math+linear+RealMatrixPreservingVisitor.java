{
  "filepath": "/tmp/Math-53b/src/main/java/org/apache/commons/math/linear/RealMatrixPreservingVisitor.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RealMatrixPreservingVisitor",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 27,
      "end_line": 57,
      "comment": "\n * Interface defining a visitor for matrix entries.\n *\n * @see DefaultRealMatrixPreservingVisitor\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixPreservingVisitor.start(int, int, int, int, int, int)",
      "begin_line": 38,
      "end_line": 39,
      "comment": "\n     * Start visiting a matrix.\n     * \u003cp\u003eThis method is called once before any entry of the matrix is visited.\u003c/p\u003e\n     * @param rows number of rows of the matrix\n     * @param columns number of columns of the matrix\n     * @param startRow Initial row index\n     * @param endRow Final row index (inclusive)\n     * @param startColumn Initial column index\n     * @param endColumn Final column index (inclusive)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixPreservingVisitor.visit(int, int, double)",
      "begin_line": 49,
      "end_line": 49,
      "comment": "\n     * Visit one matrix entry.\n     * @param row row index of the entry\n     * @param column column index of the entry\n     * @param value current value of the entry\n     * @throws org.apache.commons.math.exception.MathUserException if the visitor\n     * cannot process an entry.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RealMatrixPreservingVisitor.end()",
      "begin_line": 56,
      "end_line": 56,
      "comment": "\n     * End visiting a matrix.\n     * \u003cp\u003eThis method is called once after all entries of the matrix have been visited.\u003c/p\u003e\n     * @return the value that the \u003ccode\u003ewalkInXxxOrder\u003c/code\u003e must return\n     ",
      "child_ranges": []
    }
  ]
}