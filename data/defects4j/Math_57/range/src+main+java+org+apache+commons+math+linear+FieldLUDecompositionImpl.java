{
  "filepath": "/tmp/Math-57b/src/main/java/org/apache/commons/math/linear/FieldLUDecompositionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FieldLUDecompositionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.FieldLUDecomposition\u003cT\u003e"
      ],
      "begin_line": 40,
      "end_line": 418,
      "comment": "\n * Calculates the LUP-decomposition of a square matrix.\n * \u003cp\u003eThe LUP-decomposition of a matrix A consists of three matrices\n * L, U and P that satisfy: PA \u003d LU, L is lower triangular, and U is\n * upper triangular and P is a permutation matrix. All matrices are\n * m\u0026times;m.\u003c/p\u003e\n * \u003cp\u003eSince {@link FieldElement field elements} do not provide an ordering\n * operator, the permutation matrix is computed here only in order to avoid\n * a zero pivot element, no attempt is done to get the largest pivot element.\u003c/p\u003e\n *\n * @param \u003cT\u003e the type of the field elements\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "field"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Field to which the elements belong. "
    },
    {
      "type": "field",
      "varNames": [
        "lu"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " Entries of LU decomposition. "
    },
    {
      "type": "field",
      "varNames": [
        "pivot"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Pivot permutation associated with LU decomposition "
    },
    {
      "type": "field",
      "varNames": [
        "even"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Parity of the permutation associated with the LU decomposition "
    },
    {
      "type": "field",
      "varNames": [
        "singular"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Singularity indicator. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedL"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Cached value of L. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedU"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Cached value of U. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedP"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Cached value of P. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImpl.FieldLUDecompositionImpl(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 71,
      "end_line": 151,
      "comment": "\n     * Calculates the LU-decomposition of the given matrix.\n     * @param matrix The matrix to decompose.\n     * @throws NonSquareMatrixException if matrix is not square\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 75,col 9)",
        "(line 77,col 9)-(line 77,col 50)",
        "(line 78,col 9)-(line 78,col 34)",
        "(line 79,col 9)-(line 79,col 30)",
        "(line 80,col 9)-(line 80,col 27)",
        "(line 81,col 9)-(line 81,col 23)",
        "(line 82,col 9)-(line 82,col 23)",
        "(line 83,col 9)-(line 83,col 23)",
        "(line 86,col 9)-(line 88,col 9)",
        "(line 89,col 9)-(line 89,col 24)",
        "(line 90,col 9)-(line 90,col 25)",
        "(line 93,col 9)-(line 149,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImpl.getL()",
      "begin_line": 154,
      "end_line": 167,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 155,col 9)-(line 165,col 9)",
        "(line 166,col 9)-(line 166,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImpl.getU()",
      "begin_line": 170,
      "end_line": 182,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 171,col 9)-(line 180,col 9)",
        "(line 181,col 9)-(line 181,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImpl.getP()",
      "begin_line": 185,
      "end_line": 194,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 186,col 9)-(line 192,col 9)",
        "(line 193,col 9)-(line 193,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImpl.getPivot()",
      "begin_line": 197,
      "end_line": 199,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImpl.getDeterminant()",
      "begin_line": 202,
      "end_line": 213,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 203,col 9)-(line 212,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImpl.getSolver()",
      "begin_line": 216,
      "end_line": 218,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 57)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Solver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.FieldDecompositionSolver\u003cT\u003e"
      ],
      "begin_line": 221,
      "end_line": 417,
      "comment": " Specialized solver. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 224,
      "end_line": 224,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "field"
      ],
      "begin_line": 227,
      "end_line": 227,
      "comment": " Field to which the elements belong. "
    },
    {
      "type": "field",
      "varNames": [
        "lu"
      ],
      "begin_line": 230,
      "end_line": 230,
      "comment": " Entries of LU decomposition. "
    },
    {
      "type": "field",
      "varNames": [
        "pivot"
      ],
      "begin_line": 233,
      "end_line": 233,
      "comment": " Pivot permutation associated with LU decomposition. "
    },
    {
      "type": "field",
      "varNames": [
        "singular"
      ],
      "begin_line": 236,
      "end_line": 236,
      "comment": " Singularity indicator. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImpl.Solver.Solver(org.apache.commons.math.Field\u003cT\u003e, T[][], int[], boolean)",
      "begin_line": 245,
      "end_line": 251,
      "comment": "\n         * Build a solver from decomposed matrix.\n         * @param field field to which the matrix elements belong\n         * @param lu entries of LU decomposition\n         * @param pivot pivot permutation associated with LU decomposition\n         * @param singular singularity indicator\n         ",
      "child_ranges": [
        "(line 247,col 13)-(line 247,col 34)",
        "(line 248,col 13)-(line 248,col 31)",
        "(line 249,col 13)-(line 249,col 34)",
        "(line 250,col 13)-(line 250,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImpl.Solver.isNonSingular()",
      "begin_line": 254,
      "end_line": 256,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 255,col 13)-(line 255,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImpl.Solver.solve(T[])",
      "begin_line": 259,
      "end_line": 295,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 260,col 13)-(line 260,col 39)",
        "(line 261,col 13)-(line 263,col 13)",
        "(line 264,col 13)-(line 266,col 13)",
        "(line 268,col 13)-(line 269,col 82)",
        "(line 272,col 13)-(line 274,col 13)",
        "(line 277,col 13)-(line 282,col 13)",
        "(line 285,col 13)-(line 291,col 13)",
        "(line 293,col 13)-(line 293,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImpl.Solver.solve(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 298,
      "end_line": 339,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 299,col 13)-(line 338,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImpl.Solver.solve(org.apache.commons.math.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 348,
      "end_line": 350,
      "comment": " Solve the linear equation A \u0026times; X \u003d B.\n         * \u003cp\u003eThe A matrix is implicit here. It is \u003c/p\u003e\n         * @param b right-hand side of the equation A \u0026times; X \u003d B\n         * @return a vector X such that A \u0026times; X \u003d B\n         * @throws DimensionMismatchException if the matrices dimensions do not match.\n         * @throws SingularMatrixException if the decomposed matrix is singular.\n         ",
      "child_ranges": [
        "(line 349,col 13)-(line 349,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImpl.Solver.solve(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 353,
      "end_line": 405,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 354,col 13)-(line 354,col 39)",
        "(line 355,col 13)-(line 357,col 13)",
        "(line 358,col 13)-(line 360,col 13)",
        "(line 362,col 13)-(line 362,col 53)",
        "(line 365,col 13)-(line 366,col 107)",
        "(line 367,col 13)-(line 373,col 13)",
        "(line 376,col 13)-(line 385,col 13)",
        "(line 388,col 13)-(line 401,col 13)",
        "(line 403,col 13)-(line 403,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImpl.Solver.getInverse()",
      "begin_line": 408,
      "end_line": 416,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 409,col 13)-(line 409,col 39)",
        "(line 410,col 13)-(line 410,col 41)",
        "(line 411,col 13)-(line 411,col 80)",
        "(line 412,col 13)-(line 414,col 13)",
        "(line 415,col 13)-(line 415,col 35)"
      ]
    }
  ]
}