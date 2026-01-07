{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/linear/CholeskyDecomposition.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CholeskyDecomposition",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 43,
      "end_line": 71,
      "comment": "\n * An interface to classes that implement an algorithm to calculate the\n * Cholesky decomposition of a real symmetric positive-definite matrix.\n * \u003cp\u003eThis interface is based on the class with similar name from the\n * \u003ca href\u003d\"http://math.nist.gov/javanumerics/jama/\"\u003eJAMA\u003c/a\u003e library, with the\n * following changes:\u003c/p\u003e\n * \u003cul\u003e\n *   \u003cli\u003ea {@link #getLT() getLT} method has been added,\u003c/li\u003e\n *   \u003cli\u003ethe \u003ccode\u003eisspd\u003c/code\u003e method has been removed, the constructors of\n *   implementation classes being expected to throw {@link\n *   NotPositiveDefiniteMatrixException} when a matrix cannot be decomposed,\u003c/li\u003e\n *   \u003cli\u003ea {@link #getDeterminant() getDeterminant} method has been added,\u003c/li\u003e\n *   \u003cli\u003ethe \u003ccode\u003esolve\u003c/code\u003e method has been replaced by a {@link\n *   #getSolver() getSolver} method and the equivalent method provided by\n *   the returned {@link DecompositionSolver}.\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/CholeskyDecomposition.html\"\u003eMathWorld\u003c/a\u003e\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Cholesky_decomposition\"\u003eWikipedia\u003c/a\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.CholeskyDecomposition.getL()",
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n     * Returns the matrix L of the decomposition.\n     * \u003cp\u003eL is an lower-triangular matrix\u003c/p\u003e\n     * @return the L matrix\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.CholeskyDecomposition.getLT()",
      "begin_line": 57,
      "end_line": 57,
      "comment": "\n     * Returns the transpose of the matrix L of the decomposition.\n     * \u003cp\u003eL\u003csup\u003eT\u003c/sup\u003e is an upper-triangular matrix\u003c/p\u003e\n     * @return the transpose of the matrix L of the decomposition\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.CholeskyDecomposition.getDeterminant()",
      "begin_line": 63,
      "end_line": 63,
      "comment": "\n     * Return the determinant of the matrix\n     * @return determinant of the matrix\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.CholeskyDecomposition.getSolver()",
      "begin_line": 69,
      "end_line": 69,
      "comment": "\n     * Get a solver for finding the A \u0026times; X \u003d B solution in least square sense.\n     * @return a solver\n     ",
      "child_ranges": []
    }
  ]
}