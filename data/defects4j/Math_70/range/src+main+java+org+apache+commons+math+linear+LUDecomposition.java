{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/linear/LUDecomposition.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LUDecomposition",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 46,
      "end_line": 92,
      "comment": "\n * An interface to classes that implement an algorithm to calculate the\n * LU-decomposition of a real matrix.\n * \u003cp\u003eThe LU-decomposition of matrix A is a set of three matrices: P, L and U\n * such that P\u0026times;A \u003d L\u0026times;U. P is a rows permutation matrix that is used\n * to rearrange the rows of A before so that it can be decomposed. L is a lower\n * triangular matrix with unit diagonal terms and U is an upper triangular matrix.\u003c/p\u003e\n * \u003cp\u003eThis interface is based on the class with similar name from the\n * \u003ca href\u003d\"http://math.nist.gov/javanumerics/jama/\"\u003eJAMA\u003c/a\u003e library.\u003c/p\u003e\n * \u003cul\u003e\n *   \u003cli\u003ea {@link #getP() getP} method has been added,\u003c/li\u003e\n *   \u003cli\u003ethe \u003ccode\u003edet\u003c/code\u003e method has been renamed as {@link #getDeterminant()\n *   getDeterminant},\u003c/li\u003e\n *   \u003cli\u003ethe \u003ccode\u003egetDoublePivot\u003c/code\u003e method has been removed (but the int based\n *   {@link #getPivot() getPivot} method has been kept),\u003c/li\u003e\n *   \u003cli\u003ethe \u003ccode\u003esolve\u003c/code\u003e and \u003ccode\u003eisNonSingular\u003c/code\u003e methods have been replaced\n *   by a {@link #getSolver() getSolver} method and the equivalent methods provided by\n *   the returned {@link DecompositionSolver}.\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/LUDecomposition.html\"\u003eMathWorld\u003c/a\u003e\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/LU_decomposition\"\u003eWikipedia\u003c/a\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecomposition.getL()",
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * Returns the matrix L of the decomposition.\n     * \u003cp\u003eL is an lower-triangular matrix\u003c/p\u003e\n     * @return the L matrix (or null if decomposed matrix is singular)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecomposition.getU()",
      "begin_line": 60,
      "end_line": 60,
      "comment": "\n     * Returns the matrix U of the decomposition.\n     * \u003cp\u003eU is an upper-triangular matrix\u003c/p\u003e\n     * @return the U matrix (or null if decomposed matrix is singular)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecomposition.getP()",
      "begin_line": 71,
      "end_line": 71,
      "comment": "\n     * Returns the P rows permutation matrix.\n     * \u003cp\u003eP is a sparse matrix with exactly one element set to 1.0 in\n     * each row and each column, all other elements being set to 0.0.\u003c/p\u003e\n     * \u003cp\u003eThe positions of the 1 elements are given by the {@link #getPivot()\n     * pivot permutation vector}.\u003c/p\u003e\n     * @return the P rows permutation matrix (or null if decomposed matrix is singular)\n     * @see #getPivot()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecomposition.getPivot()",
      "begin_line": 78,
      "end_line": 78,
      "comment": "\n     * Returns the pivot permutation vector.\n     * @return the pivot permutation vector\n     * @see #getP()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecomposition.getDeterminant()",
      "begin_line": 84,
      "end_line": 84,
      "comment": "\n     * Return the determinant of the matrix\n     * @return determinant of the matrix\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecomposition.getSolver()",
      "begin_line": 90,
      "end_line": 90,
      "comment": "\n     * Get a solver for finding the A \u0026times; X \u003d B solution in exact linear sense.\n     * @return a solver\n     ",
      "child_ranges": []
    }
  ]
}