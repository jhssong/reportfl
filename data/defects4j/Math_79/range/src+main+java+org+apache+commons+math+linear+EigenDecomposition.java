{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/linear/EigenDecomposition.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EigenDecomposition",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 44,
      "end_line": 131,
      "comment": "\n * An interface to classes that implement an algorithm to calculate the\n * eigen decomposition of a real matrix.\n * \u003cp\u003eThe eigen decomposition of matrix A is a set of two matrices:\n * V and D such that A \u003d V \u0026times; D \u0026times; V\u003csup\u003eT\u003c/sup\u003e.\n * A, V and D are all m \u0026times; m matrices.\u003c/p\u003e\n * \u003cp\u003eThis interface is similar in spirit to the \u003ccode\u003eEigenvalueDecomposition\u003c/code\u003e\n * class from the \u003ca href\u003d\"http://math.nist.gov/javanumerics/jama/\"\u003eJAMA\u003c/a\u003e\n * library, with the following changes:\u003c/p\u003e\n * \u003cul\u003e\n *   \u003cli\u003ea {@link #getVT() getVt} method has been added,\u003c/li\u003e\n *   \u003cli\u003etwo {@link #getRealEigenvalue(int) getRealEigenvalue} and {@link #getImagEigenvalue(int)\n *   getImagEigenvalue} methods to pick up a single eigenvalue have been added,\u003c/li\u003e\n *   \u003cli\u003ea {@link #getEigenvector(int) getEigenvector} method to pick up a single\n *   eigenvector has been added,\u003c/li\u003e\n *   \u003cli\u003ea {@link #getDeterminant() getDeterminant} method has been added.\u003c/li\u003e\n *   \u003cli\u003ea {@link #getSolver() getSolver} method has been added.\u003c/li\u003e\n * \u003c/ul\u003e\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/EigenDecomposition.html\"\u003eMathWorld\u003c/a\u003e\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Eigendecomposition_of_a_matrix\"\u003eWikipedia\u003c/a\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecomposition.getV()",
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     * Returns the matrix V of the decomposition.\n     * \u003cp\u003eV is an orthogonal matrix, i.e. its transpose is also its inverse.\u003c/p\u003e\n     * \u003cp\u003eThe columns of V are the eigenvectors of the original matrix.\u003c/p\u003e\n     * @return the V matrix\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecomposition.getD()",
      "begin_line": 63,
      "end_line": 63,
      "comment": "\n     * Returns the block diagonal matrix D of the decomposition.\n     * \u003cp\u003eD is a block diagonal matrix.\u003c/p\u003e\n     * \u003cp\u003eReal eigenvalues are on the diagonal while complex values are on\n     * 2x2 blocks { {real +imaginary}, {-imaginary, real} }.\u003c/p\u003e\n     * @return the D matrix\n     * @see #getRealEigenvalues()\n     * @see #getImagEigenvalues()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecomposition.getVT()",
      "begin_line": 71,
      "end_line": 71,
      "comment": "\n     * Returns the transpose of the matrix V of the decomposition.\n     * \u003cp\u003eV is an orthogonal matrix, i.e. its transpose is also its inverse.\u003c/p\u003e\n     * \u003cp\u003eThe columns of V are the eigenvectors of the original matrix.\u003c/p\u003e\n     * @return the transpose of the V matrix\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecomposition.getRealEigenvalues()",
      "begin_line": 80,
      "end_line": 80,
      "comment": "\n     * Returns a copy of the real parts of the eigenvalues of the original matrix.\n     * @return a copy of the real parts of the eigenvalues of the original matrix\n     * @see #getD()\n     * @see #getRealEigenvalue(int)\n     * @see #getImagEigenvalues()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecomposition.getRealEigenvalue(int)",
      "begin_line": 90,
      "end_line": 90,
      "comment": "\n     * Returns the real part of the i\u003csup\u003eth\u003c/sup\u003e eigenvalue of the original matrix.\n     * @param i index of the eigenvalue (counting from 0)\n     * @return real part of the i\u003csup\u003eth\u003c/sup\u003e eigenvalue of the original matrix\n     * @see #getD()\n     * @see #getRealEigenvalues()\n     * @see #getImagEigenvalue(int)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecomposition.getImagEigenvalues()",
      "begin_line": 99,
      "end_line": 99,
      "comment": "\n     * Returns a copy of the imaginary parts of the eigenvalues of the original matrix.\n     * @return a copy of the imaginary parts of the eigenvalues of the original matrix\n     * @see #getD()\n     * @see #getImagEigenvalue(int)\n     * @see #getRealEigenvalues()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecomposition.getImagEigenvalue(int)",
      "begin_line": 109,
      "end_line": 109,
      "comment": "\n     * Returns the imaginary part of the i\u003csup\u003eth\u003c/sup\u003e eigenvalue of the original matrix.\n     * @param i index of the eigenvalue (counting from 0)\n     * @return imaginary part of the i\u003csup\u003eth\u003c/sup\u003e eigenvalue of the original matrix\n     * @see #getD()\n     * @see #getImagEigenvalues()\n     * @see #getRealEigenvalue(int)\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecomposition.getEigenvector(int)",
      "begin_line": 117,
      "end_line": 117,
      "comment": "\n     * Returns a copy of the i\u003csup\u003eth\u003c/sup\u003e eigenvector of the original matrix.\n     * @param i index of the eigenvector (counting from 0)\n     * @return copy of the i\u003csup\u003eth\u003c/sup\u003e eigenvector of the original matrix\n     * @see #getD()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecomposition.getDeterminant()",
      "begin_line": 123,
      "end_line": 123,
      "comment": "\n     * Return the determinant of the matrix\n     * @return determinant of the matrix\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.EigenDecomposition.getSolver()",
      "begin_line": 129,
      "end_line": 129,
      "comment": "\n     * Get a solver for finding the A \u0026times; X \u003d B solution in exact linear sense.\n     * @return a solver\n     ",
      "child_ranges": []
    }
  ]
}