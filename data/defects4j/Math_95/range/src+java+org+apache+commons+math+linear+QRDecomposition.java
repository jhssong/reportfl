{
  "filepath": "/tmp/Math-95b/src/java/org/apache/commons/math/linear/QRDecomposition.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "QRDecomposition",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.math.linear.DecompositionSolver"
      ],
      "begin_line": 36,
      "end_line": 75,
      "comment": "\n * An interface to classes that implement an algorithm to calculate the \n * QR-decomposition of a real matrix.\n * \u003cp\u003eThis interface is based on the class with similar name from the now defunct\n * \u003ca href\u003d\"http://math.nist.gov/javanumerics/jama/\"\u003eJAMA\u003c/a\u003e library, with the\n * following changes:\u003c/p\u003e\n * \u003cul\u003e\n *   \u003cli\u003eseveral signatures have been added for the \u003ccode\u003esolve\u003c/code\u003e methods (in the superinterface),\u003c/code\u003e\n *   \u003cli\u003ea \u003ccode\u003edecompose\u003c/code\u003e method has been added (in the superinterface),\u003c/code\u003e\n * \u003c/ul\u003e\n *   \n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/QRDecomposition.html\"\u003eMathWorld\u003c/a\u003e\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/QR_decomposition\"\u003eWikipedia\u003c/a\u003e\n * @version $Revision$ $Date$\n * @since 1.2\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecomposition.getR()",
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     * Returns the matrix R of the decomposition. \n     * \u003cp\u003eR is an upper-triangular matrix\u003c/p\u003e\n     * @return the R matrix\n     * @exception IllegalStateException if {@link\n     * DecompositionSolver#decompose(RealMatrix) decompose} has not been called\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecomposition.getQ()",
      "begin_line": 54,
      "end_line": 54,
      "comment": "\n     * Returns the matrix Q of the decomposition.\n     * \u003cp\u003eQ is an orthogonal matrix\u003c/p\u003e\n     * @return the Q matrix\n     * @exception IllegalStateException if {@link\n     * DecompositionSolver#decompose(RealMatrix) decompose} has not been called\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecomposition.getH()",
      "begin_line": 65,
      "end_line": 65,
      "comment": "\n     * Returns the Householder reflector vectors.\n     * \u003cp\u003eH is a lower trapezoidal matrix whose columns represent\n     * each successive Householder reflector vector. This matrix is used\n     * to compute Q.\u003c/p\u003e\n     * @return a matrix containing the Householder reflector vectors\n     * @exception IllegalStateException if {@link\n     * DecompositionSolver#decompose(RealMatrix) decompose} has not been called\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecomposition.isFullRank()",
      "begin_line": 73,
      "end_line": 73,
      "comment": "\n     * Check if the decomposed matrix is full rank.\n     * @return true if the decomposed matrix is full rank\n     * @exception IllegalStateException if {@link\n     * DecompositionSolver#decompose(RealMatrix) decompose} has not been called\n     ",
      "child_ranges": []
    }
  ]
}