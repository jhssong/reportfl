{
  "filepath": "/tmp/Math-4b/src/test/java/org/apache/commons/math3/linear/InverseHilbertMatrix.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "InverseHilbertMatrix",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.RealLinearOperator"
      ],
      "begin_line": 26,
      "end_line": 100,
      "comment": "\n * This class implements inverses of Hilbert Matrices as\n * {@link RealLinearOperator}.\n "
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": " The size of the matrix. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.InverseHilbertMatrix.InverseHilbertMatrix(int)",
      "begin_line": 37,
      "end_line": 39,
      "comment": "\n     * Creates a new instance of this class.\n     *\n     * @param n Size of the matrix to be created.\n     ",
      "child_ranges": [
        "(line 38,col 9)-(line 38,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.InverseHilbertMatrix.getColumnDimension()",
      "begin_line": 42,
      "end_line": 45,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.InverseHilbertMatrix.getEntry(int, int)",
      "begin_line": 55,
      "end_line": 65,
      "comment": "\n     * Returns the {@code (i, j)} entry of the inverse Hilbert matrix. Exact\n     * arithmetic is used; in case of overflow, an exception is thrown.\n     *\n     * @param i Row index (starts at 0).\n     * @param j Column index (starts at 0).\n     * @return The coefficient of the inverse Hilbert matrix.\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 29)",
        "(line 57,col 9)-(line 57,col 73)",
        "(line 58,col 9)-(line 58,col 52)",
        "(line 59,col 9)-(line 59,col 68)",
        "(line 60,col 9)-(line 60,col 52)",
        "(line 61,col 9)-(line 61,col 60)",
        "(line 62,col 9)-(line 62,col 52)",
        "(line 63,col 9)-(line 63,col 52)",
        "(line 64,col 9)-(line 64,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.InverseHilbertMatrix.getRowDimension()",
      "begin_line": 68,
      "end_line": 71,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.InverseHilbertMatrix.operate(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 74,
      "end_line": 99,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 76,col 9)-(line 78,col 9)",
        "(line 79,col 9)-(line 79,col 41)",
        "(line 80,col 9)-(line 97,col 9)",
        "(line 98,col 9)-(line 98,col 45)"
      ]
    }
  ]
}