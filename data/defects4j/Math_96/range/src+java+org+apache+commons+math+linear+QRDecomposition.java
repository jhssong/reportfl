{
  "filepath": "/tmp/Math-96b/src/java/org/apache/commons/math/linear/QRDecomposition.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "QRDecomposition",
      "is_interface": true,
      "parent_types": [
        "org.apache.commons.math.linear.DecompositionSolver"
      ],
      "begin_line": 31,
      "end_line": 62,
      "comment": "\n * An interface to classes that implement a algorithm to calculate the \n * QR-decomposition of a real matrix.\n * \u003cp\u003eThis interface is similar to the class with similar name from the now defunct\n * \u003ca href\u003d\"http://math.nist.gov/javanumerics/jama/\"\u003eJAMA\u003c/a\u003e library.\u003c/p\u003e\n *   \n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/QRDecomposition.html\"\u003eMathWorld\u003c/a\u003e\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/QR_decomposition\"\u003eWikipedia\u003c/a\u003e\n * @version $Revision$ $Date$\n * @since 1.2\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecomposition.getR()",
      "begin_line": 38,
      "end_line": 38,
      "comment": "\n     * Returns the matrix R of the decomposition. \n     * \u003cp\u003eR is an upper-triangular matrix\u003c/p\u003e\n     * @return the R matrix\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecomposition.getQ()",
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     * Returns the matrix Q of the decomposition.\n     * \u003cp\u003eQ is an orthogonal matrix\u003c/p\u003e\n     * @return the Q matrix\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecomposition.getH()",
      "begin_line": 54,
      "end_line": 54,
      "comment": "\n     * Returns the Householder reflector vectors.\n     * \u003cp\u003eH is a lower trapezoidal matrix whose columns represent\n     * each successive Householder reflector vector. This matrix is used\n     * to compute Q.\u003c/p\u003e\n     * @return a matrix containing the Householder reflector vectors\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecomposition.isFullRank()",
      "begin_line": 60,
      "end_line": 60,
      "comment": "\n     * Check if the decomposed matrix is full rank.\n     * @return true if the decomposed matrix is full rank\n     ",
      "child_ranges": []
    }
  ]
}