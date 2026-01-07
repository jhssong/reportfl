{
  "filepath": "/tmp/Math-95b/src/java/org/apache/commons/math/linear/LUDecomposition.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LUDecomposition",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.math.linear.DecompositionSolver"
      ],
      "begin_line": 41,
      "end_line": 116,
      "comment": "\n * An interface to classes that implement an algorithm to calculate the \n * LU-decomposition of a real matrix.\n * \u003cp\u003eThe LU-decomposition of matrix A is a set of three matrices: P, L and U\n * such that P\u0026times;A \u003d L\u0026times;U. P is a rows permutation matrix that is used\n * to rearrange the rows of A before so that it can be decomposed. L is a lower\n * triangular matrix with unit diagonal terms and U is an upper triangular matrix.\u003c/p\u003e\n * \u003cp\u003eThis interface is based on the class with similar name from the now defunct\n * \u003ca href\u003d\"http://math.nist.gov/javanumerics/jama/\"\u003eJAMA\u003c/a\u003e library, with the\n * following changes:\u003c/p\u003e\n * \u003cul\u003e\n *   \u003cli\u003eseveral signatures have been added for the \u003ccode\u003esolve\u003c/code\u003e methods (in the superinterface),\u003c/code\u003e\n *   \u003cli\u003ea \u003ccode\u003edecompose\u003c/code\u003e method has been added (in the superinterface),\u003c/code\u003e\n *   \u003cli\u003ethe \u003ccode\u003edet\u003c/code\u003e method has been renamed as {@link #getDeterminant() getDeterminant}.\u003c/li\u003e\n * \u003c/ul\u003e\n *   \n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/LUDecomposition.html\"\u003eMathWorld\u003c/a\u003e\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/LU_decomposition\"\u003eWikipedia\u003c/a\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecomposition.decompose(org.apache.commons.math.linear.RealMatrix, double)",
      "begin_line": 56,
      "end_line": 56,
      "comment": "\n     * Computes a new\n     * \u003ca href\u003d\"http://www.math.gatech.edu/~bourbaki/math2601/Web-notes/2num.pdf\"\u003e\n     * LU decomposition\u003c/a\u003e for this matrix, storing the result for use by other methods.\n     * \u003cp\u003e\n     * \u003cstrong\u003eImplementation Note\u003c/strong\u003e:\u003cbr\u003e\n     * Uses \u003ca href\u003d\"http://www.damtp.cam.ac.uk/user/fdl/people/sd/lectures/nummeth98/linear.htm\"\u003e\n     * Crout\u0027s algorithm\u003c/a\u003e, with partial pivoting.\u003c/p\u003e\n     * @param matrix The matrix to decompose.\n     * @param singularityThreshold threshold (based on partial row norm)\n     * under which a matrix is considered singular\n     * @exception InvalidMatrixException if matrix is not square\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecomposition.getL()",
      "begin_line": 65,
      "end_line": 65,
      "comment": "\n     * Returns the matrix L of the decomposition. \n     * \u003cp\u003eL is an lower-triangular matrix\u003c/p\u003e\n     * @return the L matrix (or null if decomposed matrix is singular)\n     * @exception IllegalStateException if {@link\n     * DecompositionSolver#decompose(RealMatrix) decompose} has not been called\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecomposition.getU()",
      "begin_line": 74,
      "end_line": 74,
      "comment": "\n     * Returns the matrix U of the decomposition. \n     * \u003cp\u003eU is an upper-triangular matrix\u003c/p\u003e\n     * @return the U matrix (or null if decomposed matrix is singular)\n     * @exception IllegalStateException if {@link\n     * DecompositionSolver#decompose(RealMatrix) decompose} has not been called\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecomposition.getP()",
      "begin_line": 87,
      "end_line": 87,
      "comment": "\n     * Returns the P rows permutation matrix.\n     * \u003cp\u003eP is a sparse matrix with exactly one element set to 1.0 in\n     * each row and each column, all other elements being set to 0.0.\u003c/p\u003e\n     * \u003cp\u003eThe positions of the 1 elements are given by the {@link #getPivot()\n     * pivot permutation vector}.\u003c/p\u003e\n     * @return the P rows permutation matrix (or null if decomposed matrix is singular)\n     * @exception IllegalStateException if {@link\n     * DecompositionSolver#decompose(RealMatrix) decompose} has not been called\n     * @see #getPivot()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecomposition.getPivot()",
      "begin_line": 96,
      "end_line": 96,
      "comment": "\n     * Returns the pivot permutation vector.\n     * @return the pivot permutation vector\n     * @exception IllegalStateException if {@link\n     * DecompositionSolver#decompose(RealMatrix) decompose} has not been called\n     * @see #getPermutation()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecomposition.isNonSingular()",
      "begin_line": 105,
      "end_line": 105,
      "comment": "\n     * Check if the decomposed matrix is non-singular.\n     * @return true if the decomposed matrix is non-singular\n     * @exception IllegalStateException if {@link\n     * DecompositionSolver#decompose(RealMatrix) decompose} has not been called\n     * @see #getDeterminant()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecomposition.getDeterminant()",
      "begin_line": 114,
      "end_line": 114,
      "comment": "\n     * Return the determinant of the matrix\n     * @return determinant of the matrix\n     * @exception IllegalStateException if {@link\n     * DecompositionSolver#decompose(RealMatrix) decompose} has not been called\n     * @see #isNonSingular()\n     ",
      "child_ranges": []
    }
  ]
}