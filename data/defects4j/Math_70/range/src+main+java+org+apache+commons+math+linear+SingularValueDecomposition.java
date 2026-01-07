{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/linear/SingularValueDecomposition.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SingularValueDecomposition",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 53,
      "end_line": 147,
      "comment": "\n * An interface to classes that implement an algorithm to calculate the\n * Singular Value Decomposition of a real matrix.\n * \u003cp\u003e\n * The Singular Value Decomposition of matrix A is a set of three matrices: U,\n * \u0026Sigma; and V such that A \u003d U \u0026times; \u0026Sigma; \u0026times; V\u003csup\u003eT\u003c/sup\u003e. Let A be\n * a m \u0026times; n matrix, then U is a m \u0026times; p orthogonal matrix, \u0026Sigma; is a\n * p \u0026times; p diagonal matrix with positive or null elements, V is a p \u0026times;\n * n orthogonal matrix (hence V\u003csup\u003eT\u003c/sup\u003e is also orthogonal) where\n * p\u003dmin(m,n).\n * \u003c/p\u003e\n * \u003cp\u003eThis interface is similar to the class with similar name from the\n * \u003ca href\u003d\"http://math.nist.gov/javanumerics/jama/\"\u003eJAMA\u003c/a\u003e library, with the\n * following changes:\u003c/p\u003e\n * \u003cul\u003e\n *   \u003cli\u003ethe \u003ccode\u003enorm2\u003c/code\u003e method which has been renamed as {@link #getNorm()\n *   getNorm},\u003c/li\u003e\n *   \u003cli\u003ethe \u003ccode\u003econd\u003c/code\u003e method which has been renamed as {@link\n *   #getConditionNumber() getConditionNumber},\u003c/li\u003e\n *   \u003cli\u003ethe \u003ccode\u003erank\u003c/code\u003e method which has been renamed as {@link #getRank()\n *   getRank},\u003c/li\u003e\n *   \u003cli\u003ea {@link #getUT() getUT} method has been added,\u003c/li\u003e\n *   \u003cli\u003ea {@link #getVT() getVT} method has been added,\u003c/li\u003e\n *   \u003cli\u003ea {@link #getSolver() getSolver} method has been added,\u003c/li\u003e\n *   \u003cli\u003ea {@link #getCovariance(double) getCovariance} method has been added.\u003c/li\u003e\n * \u003c/ul\u003e\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/SingularValueDecomposition.html\"\u003eMathWorld\u003c/a\u003e\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Singular_value_decomposition\"\u003eWikipedia\u003c/a\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecomposition.getU()",
      "begin_line": 61,
      "end_line": 61,
      "comment": "\n     * Returns the matrix U of the decomposition.\n     * \u003cp\u003eU is an orthogonal matrix, i.e. its transpose is also its inverse.\u003c/p\u003e\n     * @return the U matrix\n     * @see #getUT()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecomposition.getUT()",
      "begin_line": 69,
      "end_line": 69,
      "comment": "\n     * Returns the transpose of the matrix U of the decomposition.\n     * \u003cp\u003eU is an orthogonal matrix, i.e. its transpose is also its inverse.\u003c/p\u003e\n     * @return the U matrix (or null if decomposed matrix is singular)\n     * @see #getU()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecomposition.getS()",
      "begin_line": 77,
      "end_line": 77,
      "comment": "\n     * Returns the diagonal matrix \u0026Sigma; of the decomposition.\n     * \u003cp\u003e\u0026Sigma; is a diagonal matrix. The singular values are provided in\n     * non-increasing order, for compatibility with Jama.\u003c/p\u003e\n     * @return the \u0026Sigma; matrix\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecomposition.getSingularValues()",
      "begin_line": 85,
      "end_line": 85,
      "comment": "\n     * Returns the diagonal elements of the matrix \u0026Sigma; of the decomposition.\n     * \u003cp\u003eThe singular values are provided in non-increasing order, for\n     * compatibility with Jama.\u003c/p\u003e\n     * @return the diagonal elements of the \u0026Sigma; matrix\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecomposition.getV()",
      "begin_line": 93,
      "end_line": 93,
      "comment": "\n     * Returns the matrix V of the decomposition.\n     * \u003cp\u003eV is an orthogonal matrix, i.e. its transpose is also its inverse.\u003c/p\u003e\n     * @return the V matrix (or null if decomposed matrix is singular)\n     * @see #getVT()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecomposition.getVT()",
      "begin_line": 101,
      "end_line": 101,
      "comment": "\n     * Returns the transpose of the matrix V of the decomposition.\n     * \u003cp\u003eV is an orthogonal matrix, i.e. its transpose is also its inverse.\u003c/p\u003e\n     * @return the V matrix (or null if decomposed matrix is singular)\n     * @see #getV()\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecomposition.getCovariance(double)",
      "begin_line": 114,
      "end_line": 114,
      "comment": "\n     * Returns the n \u0026times; n covariance matrix.\n     * \u003cp\u003eThe covariance matrix is V \u0026times; J \u0026times; V\u003csup\u003eT\u003c/sup\u003e\n     * where J is the diagonal matrix of the inverse of the squares of\n     * the singular values.\u003c/p\u003e\n     * @param minSingularValue value below which singular values are ignored\n     * (a 0 or negative value implies all singular value will be used)\n     * @return covariance matrix\n     * @exception IllegalArgumentException if minSingularValue is larger than\n     * the largest singular value, meaning all singular values are ignored\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecomposition.getNorm()",
      "begin_line": 123,
      "end_line": 123,
      "comment": "\n     * Returns the L\u003csub\u003e2\u003c/sub\u003e norm of the matrix.\n     * \u003cp\u003eThe L\u003csub\u003e2\u003c/sub\u003e norm is max(|A \u0026times; u|\u003csub\u003e2\u003c/sub\u003e /\n     * |u|\u003csub\u003e2\u003c/sub\u003e), where |.|\u003csub\u003e2\u003c/sub\u003e denotes the vectorial 2-norm\n     * (i.e. the traditional euclidian norm).\u003c/p\u003e\n     * @return norm\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecomposition.getConditionNumber()",
      "begin_line": 129,
      "end_line": 129,
      "comment": "\n     * Return the condition number of the matrix.\n     * @return condition number of the matrix\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecomposition.getRank()",
      "begin_line": 139,
      "end_line": 139,
      "comment": "\n     * Return the effective numerical matrix rank.\n     * \u003cp\u003eThe effective numerical rank is the number of non-negligible\n     * singular values. The threshold used to identify non-negligible\n     * terms is max(m,n) \u0026times; ulp(s\u003csub\u003e1\u003c/sub\u003e) where ulp(s\u003csub\u003e1\u003c/sub\u003e)\n     * is the least significant bit of the largest singular value.\u003c/p\u003e\n     * @return effective numerical matrix rank\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecomposition.getSolver()",
      "begin_line": 145,
      "end_line": 145,
      "comment": "\n     * Get a solver for finding the A \u0026times; X \u003d B solution in least square sense.\n     * @return a solver\n     ",
      "child_ranges": []
    }
  ]
}