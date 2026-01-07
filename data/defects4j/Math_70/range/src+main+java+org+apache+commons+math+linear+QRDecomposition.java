{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/linear/QRDecomposition.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "QRDecomposition",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 39,
      "end_line": 77,
      "comment": "\n * An interface to classes that implement an algorithm to calculate the\n * QR-decomposition of a real matrix.\n * \u003cp\u003eThis interface is based on the class with similar name from the\n * \u003ca href\u003d\"http://math.nist.gov/javanumerics/jama/\"\u003eJAMA\u003c/a\u003e library, with the\n * following changes:\u003c/p\u003e\n * \u003cul\u003e\n *   \u003cli\u003ea {@link #getQT() getQT} method has been added,\u003c/li\u003e\n *   \u003cli\u003ethe \u003ccode\u003esolve\u003c/code\u003e and \u003ccode\u003eisFullRank\u003c/code\u003e methods have been replaced\n *   by a {@link #getSolver() getSolver} method and the equivalent methods provided by\n *   the returned {@link DecompositionSolver}.\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/QRDecomposition.html\"\u003eMathWorld\u003c/a\u003e\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/QR_decomposition\"\u003eWikipedia\u003c/a\u003e\n * @version $Revision$ $Date$\n * @since 1.2\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecomposition.getR()",
      "begin_line": 46,
      "end_line": 46,
      "comment": "\n     * Returns the matrix R of the decomposition.\n     * \u003cp\u003eR is an upper-triangular matrix\u003c/p\u003e\n     * @return the R matrix\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecomposition.getQ()",
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * Returns the matrix Q of the decomposition.\n     * \u003cp\u003eQ is an orthogonal matrix\u003c/p\u003e\n     * @return the Q matrix\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecomposition.getQT()",
      "begin_line": 60,
      "end_line": 60,
      "comment": "\n     * Returns the transpose of the matrix Q of the decomposition.\n     * \u003cp\u003eQ is an orthogonal matrix\u003c/p\u003e\n     * @return the Q matrix\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecomposition.getH()",
      "begin_line": 69,
      "end_line": 69,
      "comment": "\n     * Returns the Householder reflector vectors.\n     * \u003cp\u003eH is a lower trapezoidal matrix whose columns represent\n     * each successive Householder reflector vector. This matrix is used\n     * to compute Q.\u003c/p\u003e\n     * @return a matrix containing the Householder reflector vectors\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.QRDecomposition.getSolver()",
      "begin_line": 75,
      "end_line": 75,
      "comment": "\n     * Get a solver for finding the A \u0026times; X \u003d B solution in least square sense.\n     * @return a solver\n     ",
      "child_ranges": []
    }
  ]
}