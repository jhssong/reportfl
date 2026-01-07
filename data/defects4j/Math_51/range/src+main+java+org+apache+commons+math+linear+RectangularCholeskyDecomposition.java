{
  "filepath": "/tmp/Math-51b/src/main/java/org/apache/commons/math/linear/RectangularCholeskyDecomposition.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RectangularCholeskyDecomposition",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 46,
      "end_line": 65,
      "comment": "\n * An interface to classes that implement an algorithm to calculate a\n * rectangular variation of Cholesky decomposition of a real symmetric\n * positive semidefinite matrix.\n * \u003cp\u003eThe rectangular Cholesky decomposition of a real symmetric positive\n * semidefinite matrix A consists of a rectangular matrix B with the same\n * number of rows such that: A is almost equal to BB\u003csup\u003eT\u003c/sup\u003e, depending\n * on a user-defined tolerance. In a sense, this is the square root of A.\u003c/p\u003e\n * \u003cp\u003eThe difference with respect to the regular {@link CholeskyDecomposition}\n * is that rows/columns may be permuted (hence the rectangular shape instead\n * of the traditional triangular shape) and there is a threshold to ignore\n * small diagonal elements. This is used for example to generate {@link\n * org.apache.commons.math.random.CorrelatedRandomVectorGenerator correlated\n * random n-dimensions vectors} in a p-dimension subspace (p \u003c n).\n * In other words, it allows generating random vectors from a covariance\n * matrix that is only positive semidefinite, and not positive definite.\u003c/p\u003e\n * \u003cp\u003eRectangular Cholesky decomposition is \u003cem\u003enot\u003c/em\u003e suited for solving\n * linear systems, so it does not provide any {@link DecompositionSolver\n * decomposition solver}.\u003c/p\u003e\n *\n * @see CholeskyDecomposition\n * @see org.apache.commons.math.random.CorrelatedRandomVectorGenerator\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RectangularCholeskyDecomposition.getRootMatrix()",
      "begin_line": 54,
      "end_line": 54,
      "comment": " Get the root of the covariance matrix.\n     * The root is the rectangular matrix \u003ccode\u003eB\u003c/code\u003e such that\n     * the covariance matrix is equal to \u003ccode\u003eB.B\u003csup\u003eT\u003c/sup\u003e\u003c/code\u003e\n     * @return root of the square matrix\n     * @see #getRank()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.RectangularCholeskyDecomposition.getRank()",
      "begin_line": 63,
      "end_line": 63,
      "comment": " Get the rank of the symmetric positive semidefinite matrix.\n     * The r is the number of independent rows in the symmetric positive semidefinite\n     * matrix, it is also the number of columns of the rectangular\n     * matrix of the decomposition.\n     * @return r of the square matrix.\n     * @see #getRootMatrix()\n     ",
      "child_ranges": []
    }
  ]
}