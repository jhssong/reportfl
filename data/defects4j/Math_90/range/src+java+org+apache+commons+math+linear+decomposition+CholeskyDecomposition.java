{
  "filepath": "/tmp/Math-90b/src/java/org/apache/commons/math/linear/decomposition/CholeskyDecomposition.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CholeskyDecomposition",
      "is_interface": true,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 46,
      "end_line": 74,
      "comment": "\n * An interface to classes that implement an algorithm to calculate the \n * Cholesky decomposition of a real symmetric positive-definite matrix.\n * \u003cp\u003eThis interface is based on the class with similar name from the now defunct\n * \u003ca href\u003d\"http://math.nist.gov/javanumerics/jama/\"\u003eJAMA\u003c/a\u003e library, with the\n * following changes:\u003c/p\u003e\n * \u003cul\u003e\n *   \u003cli\u003ea {@link #getLT() getLT} method has been added,\u003c/li\u003e\n *   \u003cli\u003ethe \u003ccode\u003eisspd\u003c/code\u003e method has been removed, the constructors of\n *   implementation classes being expected to throw {@link\n *   NotPositiveDefiniteMatrixException} when a matrix cannot be decomposed,\u003c/li\u003e\n *   \u003cli\u003ea {@link #getDeterminant() getDeterminant} method has been added,\u003c/li\u003e\n *   \u003cli\u003ethe \u003ccode\u003esolve\u003c/code\u003e method has been replaced by a {@link\n *   #getSolver() getSolver} method and the equivalent method provided by\n *   the returned {@link DecompositionSolver}.\u003c/li\u003e\n * \u003c/ul\u003e\n *   \n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/CholeskyDecomposition.html\"\u003eMathWorld\u003c/a\u003e\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Cholesky_decomposition\"\u003eWikipedia\u003c/a\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.CholeskyDecomposition.getL()",
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * Returns the matrix L of the decomposition. \n     * \u003cp\u003eL is an lower-triangular matrix\u003c/p\u003e\n     * @return the L matrix\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.CholeskyDecomposition.getLT()",
      "begin_line": 60,
      "end_line": 60,
      "comment": "\n     * Returns the transpose of the matrix L of the decomposition.\n     * \u003cp\u003eL\u003csup\u003eT\u003c/sup\u003e is an upper-triangular matrix\u003c/p\u003e\n     * @return the transpose of the matrix L of the decomposition\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.CholeskyDecomposition.getDeterminant()",
      "begin_line": 66,
      "end_line": 66,
      "comment": "\n     * Return the determinant of the matrix\n     * @return determinant of the matrix\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.CholeskyDecomposition.getSolver()",
      "begin_line": 72,
      "end_line": 72,
      "comment": "\n     * Get a solver for finding the A \u0026times; X \u003d B solution in least square sense.\n     * @return a solver\n     ",
      "child_ranges": []
    }
  ]
}