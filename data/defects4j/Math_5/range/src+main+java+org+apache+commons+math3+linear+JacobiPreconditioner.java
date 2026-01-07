{
  "filepath": "/tmp/Math-5b/src/main/java/org/apache/commons/math3/linear/JacobiPreconditioner.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JacobiPreconditioner",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.RealLinearOperator"
      ],
      "begin_line": 30,
      "end_line": 136,
      "comment": "\n * This class implements the standard Jacobi (diagonal) preconditioner. For a\n * matrix A\u003csub\u003eij\u003c/sub\u003e, this preconditioner is\n * M \u003d diag(1 / A\u003csub\u003e11\u003c/sub\u003e, 1 / A\u003csub\u003e22\u003c/sub\u003e, \u0026hellip;).\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "diag"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " The diagonal coefficients of the preconditioner. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.JacobiPreconditioner.JacobiPreconditioner(double[], boolean)",
      "begin_line": 43,
      "end_line": 45,
      "comment": "\n     * Creates a new instance of this class.\n     *\n     * @param diag the diagonal coefficients of the linear operator to be\n     * preconditioned\n     * @param deep {@code true} if a deep copy of the above array should be\n     * performed\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.JacobiPreconditioner.create(org.apache.commons.math3.linear.RealLinearOperator)",
      "begin_line": 60,
      "end_line": 81,
      "comment": "\n     * Creates a new instance of this class. This method extracts the diagonal\n     * coefficients of the specified linear operator. If {@code a} does not\n     * extend {@link AbstractRealMatrix}, then the coefficients of the\n     * underlying matrix are not accessible, coefficient extraction is made by\n     * matrix-vector products with the basis vectors (and might therefore take\n     * some time). With matrices, direct entry access is carried out.\n     *\n     * @param a the linear operator for which the preconditioner should be built\n     * @return the diagonal preconditioner made of the inverse of the diagonal\n     * coefficients of the specified linear operator\n     * @throws NonSquareOperatorException if {@code a} is not square\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 45)",
        "(line 63,col 9)-(line 65,col 9)",
        "(line 66,col 9)-(line 66,col 44)",
        "(line 67,col 9)-(line 79,col 9)",
        "(line 80,col 9)-(line 80,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.JacobiPreconditioner.getColumnDimension()",
      "begin_line": 84,
      "end_line": 87,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.JacobiPreconditioner.getRowDimension()",
      "begin_line": 90,
      "end_line": 93,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.JacobiPreconditioner.operate(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 96,
      "end_line": 102,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 99,col 9)-(line 101,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.JacobiPreconditioner.sqrt()",
      "begin_line": 112,
      "end_line": 135,
      "comment": "\n     * Returns the square root of {@code this} diagonal operator. More\n     * precisely, this method returns\n     * P \u003d diag(1 / \u0026radic;A\u003csub\u003e11\u003c/sub\u003e, 1 / \u0026radic;A\u003csub\u003e22\u003c/sub\u003e, \u0026hellip;).\n     *\n     * @return the square root of {@code this} preconditioner\n     * @since 3.1\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 57)",
        "(line 114,col 9)-(line 134,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.JacobiPreconditioner.Anonymous-a10adec5-4bf4-4f83-8747-20cfede5b242.operate(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 116,
      "end_line": 121,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 118,col 17)-(line 120,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.JacobiPreconditioner.Anonymous-3e99d6f7-c087-457c-8bec-d226b2216e16.getRowDimension()",
      "begin_line": 124,
      "end_line": 127,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 126,col 17)-(line 126,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.JacobiPreconditioner.Anonymous-341d9e26-5df9-402e-8c39-761d79c06de6.getColumnDimension()",
      "begin_line": 130,
      "end_line": 133,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 132,col 17)-(line 132,col 47)"
      ]
    }
  ]
}