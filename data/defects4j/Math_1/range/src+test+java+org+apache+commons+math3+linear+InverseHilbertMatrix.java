{
  "filepath": "/tmp/Math-1b/src/test/java/org/apache/commons/math3/linear/InverseHilbertMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "InverseHilbertMatrix",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.RealLinearOperator"
      ],
      "begin_line": 27,
      "end_line": 101,
      "comment": "\n * This class implements inverses of Hilbert Matrices as\n * {@link RealLinearOperator}.\n "
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " The size of the matrix. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.InverseHilbertMatrix.InverseHilbertMatrix(int)",
      "begin_line": 38,
      "end_line": 40,
      "comment": "\n     * Creates a new instance of this class.\n     *\n     * @param n Size of the matrix to be created.\n     ",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.InverseHilbertMatrix.getColumnDimension()",
      "begin_line": 43,
      "end_line": 46,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.InverseHilbertMatrix.getEntry(int, int)",
      "begin_line": 56,
      "end_line": 66,
      "comment": "\n     * Returns the {@code (i, j)} entry of the inverse Hilbert matrix. Exact\n     * arithmetic is used; in case of overflow, an exception is thrown.\n     *\n     * @param i Row index (starts at 0).\n     * @param j Column index (starts at 0).\n     * @return The coefficient of the inverse Hilbert matrix.\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 29)",
        "(line 58,col 9)-(line 58,col 76)",
        "(line 59,col 9)-(line 59,col 52)",
        "(line 60,col 9)-(line 60,col 71)",
        "(line 61,col 9)-(line 61,col 52)",
        "(line 62,col 9)-(line 62,col 63)",
        "(line 63,col 9)-(line 63,col 52)",
        "(line 64,col 9)-(line 64,col 52)",
        "(line 65,col 9)-(line 65,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.InverseHilbertMatrix.getRowDimension()",
      "begin_line": 69,
      "end_line": 72,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.InverseHilbertMatrix.operate(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 75,
      "end_line": 100,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 77,col 9)-(line 79,col 9)",
        "(line 80,col 9)-(line 80,col 41)",
        "(line 81,col 9)-(line 98,col 9)",
        "(line 99,col 9)-(line 99,col 45)"
      ]
    }
  ]
}