{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/linear/FieldMatrixChangingVisitor.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FieldMatrixChangingVisitor",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 29,
      "end_line": 62,
      "comment": "\n * Interface defining a visitor for matrix entries.\n *\n * @param \u003cT\u003e the type of the field elements\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldMatrixChangingVisitor.start(int, int, int, int, int, int)",
      "begin_line": 41,
      "end_line": 42,
      "comment": "\n     * Start visiting a matrix.\n     * \u003cp\u003eThis method is called once before any entry of the matrix is visited.\u003c/p\u003e\n     * @param rows number of rows of the matrix\n     * @param columns number of columns of the matrix\n     * @param startRow Initial row index\n     * @param endRow Final row index (inclusive)\n     * @param startColumn Initial column index\n     * @param endColumn Final column index (inclusive)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldMatrixChangingVisitor.visit(int, int, T)",
      "begin_line": 52,
      "end_line": 53,
      "comment": "\n     * Visit one matrix entry.\n     * @param row row index of the entry\n     * @param column column index of the entry\n     * @param value current value of the entry\n     * @return the new value to be set for the entry\n     * @throws MatrixVisitorException if something wrong occurs\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldMatrixChangingVisitor.end()",
      "begin_line": 60,
      "end_line": 60,
      "comment": "\n     * End visiting a matrix.\n     * \u003cp\u003eThis method is called once after all entries of the matrix have been visited.\u003c/p\u003e\n     * @return the value that the \u003ccode\u003ewalkInXxxOrder\u003c/code\u003e must return\n     ",
      "child_ranges": []
    }
  ]
}