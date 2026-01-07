{
  "filepath": "/tmp/Math-96b/src/java/org/apache/commons/math/linear/LUDecomposition.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LUDecomposition",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.math.linear.DecompositionSolver"
      ],
      "begin_line": 37,
      "end_line": 85,
      "comment": "\n * An interface to classes that implement a algorithm to calculate the \n * LU-decomposition of a real matrix.\n * \u003cp\u003eThe LU-decomposition of matrix A is a set of three matrices: P, L and U\n * such that P\u0026times;A \u003d L\u0026times;U. P is a rows permutation matrix that is used\n * to rearrange the rows of A before so that it can be decomposed. L is a lower\n * triangular matrix with unit diagonal terms and U is an upper triangular matrix.\u003c/p\u003e\n * \u003cp\u003eThis interface is similar to the class with similar name from the now defunct\n * \u003ca href\u003d\"http://math.nist.gov/javanumerics/jama/\"\u003eJAMA\u003c/a\u003e library, with the\n * exception of the \u003ccode\u003edet\u003c/code\u003e method which has been renamed as {@link\n * #getDeterminant() getDeterminant}.\u003c/p\u003e\n *   \n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/LUDecomposition.html\"\u003eMathWorld\u003c/a\u003e\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/LU_decomposition\"\u003eWikipedia\u003c/a\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecomposition.getL()",
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n     * Returns the matrix L of the decomposition. \n     * \u003cp\u003eL is an lower-triangular matrix\u003c/p\u003e\n     * @return the L matrix (or null if decomposed matrix is singular)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecomposition.getU()",
      "begin_line": 51,
      "end_line": 51,
      "comment": "\n     * Returns the matrix U of the decomposition. \n     * \u003cp\u003eU is an upper-triangular matrix\u003c/p\u003e\n     * @return the U matrix (or null if decomposed matrix is singular)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecomposition.getP()",
      "begin_line": 62,
      "end_line": 62,
      "comment": "\n     * Returns the P rows permutation matrix.\n     * \u003cp\u003eP is a sparse matrix with exactly one element set to 1.0 in\n     * each row and each column, all other elements being set to 0.0.\u003c/p\u003e\n     * \u003cp\u003eThe positions of the 1 elements are given by the {@link #getPivot()\n     * pivot permutation vector}.\u003c/p\u003e\n     * @return the P rows permutation matrix (or null if decomposed matrix is singular)\n     * @see #getPivot()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecomposition.getPivot()",
      "begin_line": 69,
      "end_line": 69,
      "comment": "\n     * Returns the pivot permutation vector.\n     * @return the pivot permutation vector\n     * @see #getPermutation()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecomposition.isNonSingular()",
      "begin_line": 76,
      "end_line": 76,
      "comment": "\n     * Check if the decomposed matrix is non-singular.\n     * @return true if the decomposed matrix is non-singular\n     * @see #getDeterminant()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecomposition.getDeterminant()",
      "begin_line": 83,
      "end_line": 83,
      "comment": "\n     * Return the determinant of the matrix\n     * @return determinant of the matrix\n     * @see #isNonSingular()\n     ",
      "child_ranges": []
    }
  ]
}