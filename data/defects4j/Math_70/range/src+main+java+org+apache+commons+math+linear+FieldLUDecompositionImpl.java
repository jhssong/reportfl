{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/linear/FieldLUDecompositionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FieldLUDecompositionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.FieldLUDecomposition\u003cT\u003e"
      ],
      "begin_line": 40,
      "end_line": 433,
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
      "end_line": 152,
      "comment": "\n     * Calculates the LU-decomposition of the given matrix.\n     * @param matrix The matrix to decompose.\n     * @exception NonSquareMatrixException if matrix is not square\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 76,col 9)",
        "(line 78,col 9)-(line 78,col 50)",
        "(line 79,col 9)-(line 79,col 34)",
        "(line 80,col 9)-(line 80,col 30)",
        "(line 81,col 9)-(line 81,col 27)",
        "(line 82,col 9)-(line 82,col 23)",
        "(line 83,col 9)-(line 83,col 23)",
        "(line 84,col 9)-(line 84,col 23)",
        "(line 87,col 9)-(line 89,col 9)",
        "(line 90,col 9)-(line 90,col 24)",
        "(line 91,col 9)-(line 91,col 25)",
        "(line 94,col 9)-(line 150,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImpl.getL()",
      "begin_line": 155,
      "end_line": 168,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 156,col 9)-(line 166,col 9)",
        "(line 167,col 9)-(line 167,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImpl.getU()",
      "begin_line": 171,
      "end_line": 183,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 172,col 9)-(line 181,col 9)",
        "(line 182,col 9)-(line 182,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImpl.getP()",
      "begin_line": 186,
      "end_line": 195,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 187,col 9)-(line 193,col 9)",
        "(line 194,col 9)-(line 194,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImpl.getPivot()",
      "begin_line": 198,
      "end_line": 200,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImpl.getDeterminant()",
      "begin_line": 203,
      "end_line": 214,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 204,col 9)-(line 213,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImpl.getSolver()",
      "begin_line": 217,
      "end_line": 219,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 57)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Solver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.FieldDecompositionSolver\u003cT\u003e"
      ],
      "begin_line": 222,
      "end_line": 431,
      "comment": " Specialized solver. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 225,
      "end_line": 225,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "field"
      ],
      "begin_line": 228,
      "end_line": 228,
      "comment": " Field to which the elements belong. "
    },
    {
      "type": "field",
      "varNames": [
        "lu"
      ],
      "begin_line": 231,
      "end_line": 231,
      "comment": " Entries of LU decomposition. "
    },
    {
      "type": "field",
      "varNames": [
        "pivot"
      ],
      "begin_line": 234,
      "end_line": 234,
      "comment": " Pivot permutation associated with LU decomposition. "
    },
    {
      "type": "field",
      "varNames": [
        "singular"
      ],
      "begin_line": 237,
      "end_line": 237,
      "comment": " Singularity indicator. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImpl.Solver.Solver(org.apache.commons.math.Field\u003cT\u003e, T[][], int[], boolean)",
      "begin_line": 246,
      "end_line": 252,
      "comment": "\n         * Build a solver from decomposed matrix.\n         * @param field field to which the matrix elements belong\n         * @param lu entries of LU decomposition\n         * @param pivot pivot permutation associated with LU decomposition\n         * @param singular singularity indicator\n         ",
      "child_ranges": [
        "(line 248,col 13)-(line 248,col 34)",
        "(line 249,col 13)-(line 249,col 31)",
        "(line 250,col 13)-(line 250,col 34)",
        "(line 251,col 13)-(line 251,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImpl.Solver.isNonSingular()",
      "begin_line": 255,
      "end_line": 257,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 256,col 13)-(line 256,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImpl.Solver.solve(T[])",
      "begin_line": 260,
      "end_line": 300,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 263,col 13)-(line 263,col 39)",
        "(line 264,col 13)-(line 268,col 13)",
        "(line 269,col 13)-(line 271,col 13)",
        "(line 273,col 13)-(line 274,col 82)",
        "(line 277,col 13)-(line 279,col 13)",
        "(line 282,col 13)-(line 287,col 13)",
        "(line 290,col 13)-(line 296,col 13)",
        "(line 298,col 13)-(line 298,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImpl.Solver.solve(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 303,
      "end_line": 347,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 305,col 13)-(line 346,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImpl.Solver.solve(org.apache.commons.math.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 356,
      "end_line": 359,
      "comment": " Solve the linear equation A \u0026times; X \u003d B.\n         * \u003cp\u003eThe A matrix is implicit here. It is \u003c/p\u003e\n         * @param b right-hand side of the equation A \u0026times; X \u003d B\n         * @return a vector X such that A \u0026times; X \u003d B\n         * @exception IllegalArgumentException if matrices dimensions don\u0027t match\n         * @exception InvalidMatrixException if decomposed matrix is singular\n         ",
      "child_ranges": [
        "(line 358,col 13)-(line 358,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImpl.Solver.solve(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 362,
      "end_line": 418,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 365,col 13)-(line 365,col 39)",
        "(line 366,col 13)-(line 370,col 13)",
        "(line 371,col 13)-(line 373,col 13)",
        "(line 375,col 13)-(line 375,col 53)",
        "(line 378,col 13)-(line 379,col 107)",
        "(line 380,col 13)-(line 386,col 13)",
        "(line 389,col 13)-(line 398,col 13)",
        "(line 401,col 13)-(line 414,col 13)",
        "(line 416,col 13)-(line 416,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImpl.Solver.getInverse()",
      "begin_line": 421,
      "end_line": 429,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 422,col 13)-(line 422,col 39)",
        "(line 423,col 13)-(line 423,col 41)",
        "(line 424,col 13)-(line 424,col 80)",
        "(line 425,col 13)-(line 427,col 13)",
        "(line 428,col 13)-(line 428,col 35)"
      ]
    }
  ]
}