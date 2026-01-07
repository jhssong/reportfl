{
  "filepath": "/tmp/Math-59b/src/main/java/org/apache/commons/math/linear/FieldLUDecompositionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FieldLUDecompositionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.FieldLUDecomposition\u003cT\u003e"
      ],
      "begin_line": 42,
      "end_line": 420,
      "comment": "\n * Calculates the LUP-decomposition of a square matrix.\n * \u003cp\u003eThe LUP-decomposition of a matrix A consists of three matrices\n * L, U and P that satisfy: PA \u003d LU, L is lower triangular, and U is\n * upper triangular and P is a permutation matrix. All matrices are\n * m\u0026times;m.\u003c/p\u003e\n * \u003cp\u003eSince {@link FieldElement field elements} do not provide an ordering\n * operator, the permutation matrix is computed here only in order to avoid\n * a zero pivot element, no attempt is done to get the largest pivot element.\u003c/p\u003e\n *\n * @param \u003cT\u003e the type of the field elements\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "field"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Field to which the elements belong. "
    },
    {
      "type": "field",
      "varNames": [
        "lu"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Entries of LU decomposition. "
    },
    {
      "type": "field",
      "varNames": [
        "pivot"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Pivot permutation associated with LU decomposition "
    },
    {
      "type": "field",
      "varNames": [
        "even"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Parity of the permutation associated with the LU decomposition "
    },
    {
      "type": "field",
      "varNames": [
        "singular"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Singularity indicator. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedL"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Cached value of L. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedU"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Cached value of U. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedP"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Cached value of P. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImpl.FieldLUDecompositionImpl(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 73,
      "end_line": 153,
      "comment": "\n     * Calculates the LU-decomposition of the given matrix.\n     * @param matrix The matrix to decompose.\n     * @throws NonSquareMatrixException if matrix is not square\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 77,col 9)",
        "(line 79,col 9)-(line 79,col 50)",
        "(line 80,col 9)-(line 80,col 34)",
        "(line 81,col 9)-(line 81,col 30)",
        "(line 82,col 9)-(line 82,col 27)",
        "(line 83,col 9)-(line 83,col 23)",
        "(line 84,col 9)-(line 84,col 23)",
        "(line 85,col 9)-(line 85,col 23)",
        "(line 88,col 9)-(line 90,col 9)",
        "(line 91,col 9)-(line 91,col 24)",
        "(line 92,col 9)-(line 92,col 25)",
        "(line 95,col 9)-(line 151,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImpl.getL()",
      "begin_line": 156,
      "end_line": 169,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 157,col 9)-(line 167,col 9)",
        "(line 168,col 9)-(line 168,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImpl.getU()",
      "begin_line": 172,
      "end_line": 184,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 173,col 9)-(line 182,col 9)",
        "(line 183,col 9)-(line 183,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImpl.getP()",
      "begin_line": 187,
      "end_line": 196,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 188,col 9)-(line 194,col 9)",
        "(line 195,col 9)-(line 195,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImpl.getPivot()",
      "begin_line": 199,
      "end_line": 201,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImpl.getDeterminant()",
      "begin_line": 204,
      "end_line": 215,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 205,col 9)-(line 214,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImpl.getSolver()",
      "begin_line": 218,
      "end_line": 220,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 57)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Solver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.FieldDecompositionSolver\u003cT\u003e"
      ],
      "begin_line": 223,
      "end_line": 419,
      "comment": " Specialized solver. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 226,
      "end_line": 226,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "field"
      ],
      "begin_line": 229,
      "end_line": 229,
      "comment": " Field to which the elements belong. "
    },
    {
      "type": "field",
      "varNames": [
        "lu"
      ],
      "begin_line": 232,
      "end_line": 232,
      "comment": " Entries of LU decomposition. "
    },
    {
      "type": "field",
      "varNames": [
        "pivot"
      ],
      "begin_line": 235,
      "end_line": 235,
      "comment": " Pivot permutation associated with LU decomposition. "
    },
    {
      "type": "field",
      "varNames": [
        "singular"
      ],
      "begin_line": 238,
      "end_line": 238,
      "comment": " Singularity indicator. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImpl.Solver.Solver(org.apache.commons.math.Field\u003cT\u003e, T[][], int[], boolean)",
      "begin_line": 247,
      "end_line": 253,
      "comment": "\n         * Build a solver from decomposed matrix.\n         * @param field field to which the matrix elements belong\n         * @param lu entries of LU decomposition\n         * @param pivot pivot permutation associated with LU decomposition\n         * @param singular singularity indicator\n         ",
      "child_ranges": [
        "(line 249,col 13)-(line 249,col 34)",
        "(line 250,col 13)-(line 250,col 31)",
        "(line 251,col 13)-(line 251,col 34)",
        "(line 252,col 13)-(line 252,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImpl.Solver.isNonSingular()",
      "begin_line": 256,
      "end_line": 258,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 257,col 13)-(line 257,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImpl.Solver.solve(T[])",
      "begin_line": 261,
      "end_line": 297,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 262,col 13)-(line 262,col 39)",
        "(line 263,col 13)-(line 265,col 13)",
        "(line 266,col 13)-(line 268,col 13)",
        "(line 270,col 13)-(line 271,col 82)",
        "(line 274,col 13)-(line 276,col 13)",
        "(line 279,col 13)-(line 284,col 13)",
        "(line 287,col 13)-(line 293,col 13)",
        "(line 295,col 13)-(line 295,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImpl.Solver.solve(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 300,
      "end_line": 341,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 301,col 13)-(line 340,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImpl.Solver.solve(org.apache.commons.math.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 350,
      "end_line": 352,
      "comment": " Solve the linear equation A \u0026times; X \u003d B.\n         * \u003cp\u003eThe A matrix is implicit here. It is \u003c/p\u003e\n         * @param b right-hand side of the equation A \u0026times; X \u003d B\n         * @return a vector X such that A \u0026times; X \u003d B\n         * @throws DimensionMismatchException if the matrices dimensions do not match.\n         * @throws SingularMatrixException if the decomposed matrix is singular.\n         ",
      "child_ranges": [
        "(line 351,col 13)-(line 351,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImpl.Solver.solve(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 355,
      "end_line": 407,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 356,col 13)-(line 356,col 39)",
        "(line 357,col 13)-(line 359,col 13)",
        "(line 360,col 13)-(line 362,col 13)",
        "(line 364,col 13)-(line 364,col 53)",
        "(line 367,col 13)-(line 368,col 107)",
        "(line 369,col 13)-(line 375,col 13)",
        "(line 378,col 13)-(line 387,col 13)",
        "(line 390,col 13)-(line 403,col 13)",
        "(line 405,col 13)-(line 405,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImpl.Solver.getInverse()",
      "begin_line": 410,
      "end_line": 418,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 411,col 13)-(line 411,col 39)",
        "(line 412,col 13)-(line 412,col 41)",
        "(line 413,col 13)-(line 413,col 80)",
        "(line 414,col 13)-(line 416,col 13)",
        "(line 417,col 13)-(line 417,col 35)"
      ]
    }
  ]
}