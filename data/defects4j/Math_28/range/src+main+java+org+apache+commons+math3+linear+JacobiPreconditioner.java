{
  "filepath": "/tmp/Math-28b/src/main/java/org/apache/commons/math3/linear/JacobiPreconditioner.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JacobiPreconditioner",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.RealLinearOperator"
      ],
      "begin_line": 29,
      "end_line": 130,
      "comment": "\n * This class implements the standard Jacobi (diagonal) preconditioner. For a\n * matrix A\u003csub\u003eij\u003c/sub\u003e, this preconditioner is\n * M \u003d diag(1 / A\u003csub\u003e11\u003c/sub\u003e, 1 / A\u003csub\u003e22\u003c/sub\u003e, \u0026hellip;).\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "diag"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " The diagonal coefficients of the preconditioner. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.JacobiPreconditioner.JacobiPreconditioner(double[], boolean)",
      "begin_line": 42,
      "end_line": 44,
      "comment": "\n     * Creates a new instance of this class.\n     *\n     * @param diag the diagonal coefficients of the linear operator to be\n     * preconditioned\n     * @param deep {@code true} if a deep copy of the above array should be\n     * performed\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.JacobiPreconditioner.create(org.apache.commons.math3.linear.RealLinearOperator)",
      "begin_line": 59,
      "end_line": 80,
      "comment": "\n     * Creates a new instance of this class. This method extracts the diagonal\n     * coefficients of the specified linear operator. If {@code a} does not\n     * extend {@link AbstractRealMatrix}, then the coefficients of the\n     * underlying matrix are not accessible, coefficient extraction is made by\n     * matrix-vector products with the basis vectors (and might therefore take\n     * some time). With matrices, direct entry access is carried out.\n     *\n     * @param a the linear operator for which the preconditioner should be built\n     * @return the diagonal preconditioner made of the inverse of the diagonal\n     * coefficients of the specified linear operator\n     * @throws NonSquareOperatorException if {@code a} is not square\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 45)",
        "(line 62,col 9)-(line 64,col 9)",
        "(line 65,col 9)-(line 65,col 44)",
        "(line 66,col 9)-(line 78,col 9)",
        "(line 79,col 9)-(line 79,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.JacobiPreconditioner.getColumnDimension()",
      "begin_line": 83,
      "end_line": 86,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.JacobiPreconditioner.getRowDimension()",
      "begin_line": 89,
      "end_line": 92,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.JacobiPreconditioner.operate(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 95,
      "end_line": 99,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.JacobiPreconditioner.sqrt()",
      "begin_line": 108,
      "end_line": 129,
      "comment": "\n     * Returns the square root of {@code this} diagonal operator. More\n     * precisely, this method returns\n     * P \u003d diag(1 / \u0026radic;A\u003csub\u003e11\u003c/sub\u003e, 1 / \u0026radic;A\u003csub\u003e22\u003c/sub\u003e, \u0026hellip;).\n     *\n     * @return the square root of {@code this} preconditioner\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 57)",
        "(line 110,col 9)-(line 128,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.JacobiPreconditioner.Anonymous-01b4d464-dca5-461a-9de6-1a0e50a14129.operate(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 112,
      "end_line": 115,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 114,col 17)-(line 114,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.JacobiPreconditioner.Anonymous-b20a666f-a4ed-4247-9193-3df4a7a6832c.getRowDimension()",
      "begin_line": 118,
      "end_line": 121,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 120,col 17)-(line 120,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.JacobiPreconditioner.Anonymous-1a5aca71-5dff-4df2-9672-7181e3481213.getColumnDimension()",
      "begin_line": 124,
      "end_line": 127,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 126,col 17)-(line 126,col 47)"
      ]
    }
  ]
}