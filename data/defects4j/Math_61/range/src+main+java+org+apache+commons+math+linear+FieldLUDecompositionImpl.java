{
  "filepath": "/tmp/Math-61b/src/main/java/org/apache/commons/math/linear/FieldLUDecompositionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FieldLUDecompositionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.FieldLUDecomposition\u003cT\u003e"
      ],
      "begin_line": 41,
      "end_line": 434,
      "comment": "\n * Calculates the LUP-decomposition of a square matrix.\n * \u003cp\u003eThe LUP-decomposition of a matrix A consists of three matrices\n * L, U and P that satisfy: PA \u003d LU, L is lower triangular, and U is\n * upper triangular and P is a permutation matrix. All matrices are\n * m\u0026times;m.\u003c/p\u003e\n * \u003cp\u003eSince {@link FieldElement field elements} do not provide an ordering\n * operator, the permutation matrix is computed here only in order to avoid\n * a zero pivot element, no attempt is done to get the largest pivot element.\u003c/p\u003e\n *\n * @param \u003cT\u003e the type of the field elements\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "field"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Field to which the elements belong. "
    },
    {
      "type": "field",
      "varNames": [
        "lu"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Entries of LU decomposition. "
    },
    {
      "type": "field",
      "varNames": [
        "pivot"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Pivot permutation associated with LU decomposition "
    },
    {
      "type": "field",
      "varNames": [
        "even"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Parity of the permutation associated with the LU decomposition "
    },
    {
      "type": "field",
      "varNames": [
        "singular"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Singularity indicator. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedL"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Cached value of L. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedU"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Cached value of U. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedP"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Cached value of P. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImpl.FieldLUDecompositionImpl(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 72,
      "end_line": 153,
      "comment": "\n     * Calculates the LU-decomposition of the given matrix.\n     * @param matrix The matrix to decompose.\n     * @exception NonSquareMatrixException if matrix is not square\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 77,col 9)",
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
      "end_line": 432,
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
      "end_line": 301,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 264,col 13)-(line 264,col 39)",
        "(line 265,col 13)-(line 269,col 13)",
        "(line 270,col 13)-(line 272,col 13)",
        "(line 274,col 13)-(line 275,col 82)",
        "(line 278,col 13)-(line 280,col 13)",
        "(line 283,col 13)-(line 288,col 13)",
        "(line 291,col 13)-(line 297,col 13)",
        "(line 299,col 13)-(line 299,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImpl.Solver.solve(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 304,
      "end_line": 348,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 306,col 13)-(line 347,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImpl.Solver.solve(org.apache.commons.math.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 357,
      "end_line": 360,
      "comment": " Solve the linear equation A \u0026times; X \u003d B.\n         * \u003cp\u003eThe A matrix is implicit here. It is \u003c/p\u003e\n         * @param b right-hand side of the equation A \u0026times; X \u003d B\n         * @return a vector X such that A \u0026times; X \u003d B\n         * @exception IllegalArgumentException if matrices dimensions don\u0027t match\n         * @exception InvalidMatrixException if decomposed matrix is singular\n         ",
      "child_ranges": [
        "(line 359,col 13)-(line 359,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImpl.Solver.solve(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 363,
      "end_line": 419,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 366,col 13)-(line 366,col 39)",
        "(line 367,col 13)-(line 371,col 13)",
        "(line 372,col 13)-(line 374,col 13)",
        "(line 376,col 13)-(line 376,col 53)",
        "(line 379,col 13)-(line 380,col 107)",
        "(line 381,col 13)-(line 387,col 13)",
        "(line 390,col 13)-(line 399,col 13)",
        "(line 402,col 13)-(line 415,col 13)",
        "(line 417,col 13)-(line 417,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecompositionImpl.Solver.getInverse()",
      "begin_line": 422,
      "end_line": 430,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 423,col 13)-(line 423,col 39)",
        "(line 424,col 13)-(line 424,col 41)",
        "(line 425,col 13)-(line 425,col 80)",
        "(line 426,col 13)-(line 428,col 13)",
        "(line 429,col 13)-(line 429,col 35)"
      ]
    }
  ]
}