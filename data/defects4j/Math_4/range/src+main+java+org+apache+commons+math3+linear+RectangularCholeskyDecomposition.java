{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/linear/RectangularCholeskyDecomposition.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RectangularCholeskyDecomposition",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 45,
      "end_line": 196,
      "comment": "\n * Calculates the rectangular Cholesky decomposition of a matrix.\n * \u003cp\u003eThe rectangular Cholesky decomposition of a real symmetric positive\n * semidefinite matrix A consists of a rectangular matrix B with the same\n * number of rows such that: A is almost equal to BB\u003csup\u003eT\u003c/sup\u003e, depending\n * on a user-defined tolerance. In a sense, this is the square root of A.\u003c/p\u003e\n * \u003cp\u003eThe difference with respect to the regular {@link CholeskyDecomposition}\n * is that rows/columns may be permuted (hence the rectangular shape instead\n * of the traditional triangular shape) and there is a threshold to ignore\n * small diagonal elements. This is used for example to generate {@link\n * org.apache.commons.math3.random.CorrelatedRandomVectorGenerator correlated\n * random n-dimensions vectors} in a p-dimension subspace (p \u003c n).\n * In other words, it allows generating random vectors from a covariance\n * matrix that is only positive semidefinite, and not positive definite.\u003c/p\u003e\n * \u003cp\u003eRectangular Cholesky decomposition is \u003cem\u003enot\u003c/em\u003e suited for solving\n * linear systems, so it does not provide any {@link DecompositionSolver\n * decomposition solver}.\u003c/p\u003e\n *\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/CholeskyDecomposition.html\"\u003eMathWorld\u003c/a\u003e\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Cholesky_decomposition\"\u003eWikipedia\u003c/a\u003e\n * @version $Id$\n * @since 2.0 (changed to concrete class in 3.0)\n "
    },
    {
      "type": "field",
      "varNames": [
        "root"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Permutated Cholesky root of the symmetric positive semidefinite matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "rank"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Rank of the symmetric positive semidefinite matrix. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.RectangularCholeskyDecomposition.RectangularCholeskyDecomposition(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 68,
      "end_line": 71,
      "comment": "\n     * Decompose a symmetric positive semidefinite matrix.\n     * \u003cp\u003e\n     * \u003cb\u003eNote:\u003c/b\u003e this constructor follows the linpack method to detect dependent\n     * columns by proceeding with the Cholesky algorithm until a nonpositive diagonal\n     * element is encountered.\n     *\n     * @see \u003ca href\u003d\"http://eprints.ma.man.ac.uk/1193/01/covered/MIMS_ep2008_56.pdf\"\u003e\n     * Analysis of the Cholesky Decomposition of a Semi-definite Matrix\u003c/a\u003e\n     *\n     * @param matrix Symmetric positive semidefinite matrix.\n     * @exception NonPositiveDefiniteMatrixException if the matrix is not\n     * positive semidefinite.\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.RectangularCholeskyDecomposition.RectangularCholeskyDecomposition(org.apache.commons.math3.linear.RealMatrix, double)",
      "begin_line": 82,
      "end_line": 173,
      "comment": "\n     * Decompose a symmetric positive semidefinite matrix.\n     *\n     * @param matrix Symmetric positive semidefinite matrix.\n     * @param small Diagonal elements threshold under which columns are\n     * considered to be dependent on previous ones and are discarded.\n     * @exception NonPositiveDefiniteMatrixException if the matrix is not\n     * positive semidefinite.\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 51)",
        "(line 86,col 9)-(line 86,col 46)",
        "(line 87,col 9)-(line 87,col 54)",
        "(line 89,col 9)-(line 89,col 37)",
        "(line 90,col 9)-(line 92,col 9)",
        "(line 94,col 9)-(line 94,col 18)",
        "(line 95,col 9)-(line 162,col 9)",
        "(line 165,col 9)-(line 165,col 17)",
        "(line 166,col 9)-(line 166,col 54)",
        "(line 167,col 9)-(line 171,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RectangularCholeskyDecomposition.getRootMatrix()",
      "begin_line": 181,
      "end_line": 183,
      "comment": " Get the root of the covariance matrix.\n     * The root is the rectangular matrix \u003ccode\u003eB\u003c/code\u003e such that\n     * the covariance matrix is equal to \u003ccode\u003eB.B\u003csup\u003eT\u003c/sup\u003e\u003c/code\u003e\n     * @return root of the square matrix\n     * @see #getRank()\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.RectangularCholeskyDecomposition.getRank()",
      "begin_line": 192,
      "end_line": 194,
      "comment": " Get the rank of the symmetric positive semidefinite matrix.\n     * The r is the number of independent rows in the symmetric positive semidefinite\n     * matrix, it is also the number of columns of the rectangular\n     * matrix of the decomposition.\n     * @return r of the square matrix.\n     * @see #getRootMatrix()\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 20)"
      ]
    }
  ]
}