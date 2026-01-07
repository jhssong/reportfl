{
  "filepath": "/tmp/Math-41b/src/main/java/org/apache/commons/math/linear/FieldLUDecomposition.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FieldLUDecomposition",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 55,
      "end_line": 452,
      "comment": "\n * Calculates the LUP-decomposition of a square matrix.\n * \u003cp\u003eThe LUP-decomposition of a matrix A consists of three matrices\n * L, U and P that satisfy: PA \u003d LU, L is lower triangular, and U is\n * upper triangular and P is a permutation matrix. All matrices are\n * m\u0026times;m.\u003c/p\u003e\n * \u003cp\u003eSince {@link FieldElement field elements} do not provide an ordering\n * operator, the permutation matrix is computed here only in order to avoid\n * a zero pivot element, no attempt is done to get the largest pivot\n * element.\u003c/p\u003e\n * \u003cp\u003eThis class is based on the class with similar name from the\n * \u003ca href\u003d\"http://math.nist.gov/javanumerics/jama/\"\u003eJAMA\u003c/a\u003e library.\u003c/p\u003e\n * \u003cul\u003e\n *   \u003cli\u003ea {@link #getP() getP} method has been added,\u003c/li\u003e\n *   \u003cli\u003ethe {@code det} method has been renamed as {@link #getDeterminant()\n *   getDeterminant},\u003c/li\u003e\n *   \u003cli\u003ethe {@code getDoublePivot} method has been removed (but the int based\n *   {@link #getPivot() getPivot} method has been kept),\u003c/li\u003e\n *   \u003cli\u003ethe {@code solve} and {@code isNonSingular} methods have been replaced\n *   by a {@link #getSolver() getSolver} method and the equivalent methods\n *   provided by the returned {@link DecompositionSolver}.\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * @param \u003cT\u003e the type of the field elements\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/LUDecomposition.html\"\u003eMathWorld\u003c/a\u003e\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/LU_decomposition\"\u003eWikipedia\u003c/a\u003e\n * @version $Id$\n * @since 2.0 (changed to concrete class in 3.0)\n "
    },
    {
      "type": "field",
      "varNames": [
        "field"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Field to which the elements belong. "
    },
    {
      "type": "field",
      "varNames": [
        "lu"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Entries of LU decomposition. "
    },
    {
      "type": "field",
      "varNames": [
        "pivot"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Pivot permutation associated with LU decomposition. "
    },
    {
      "type": "field",
      "varNames": [
        "even"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Parity of the permutation associated with the LU decomposition. "
    },
    {
      "type": "field",
      "varNames": [
        "singular"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Singularity indicator. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedL"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " Cached value of L. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedU"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Cached value of U. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedP"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " Cached value of P. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.FieldLUDecomposition.FieldLUDecomposition(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 86,
      "end_line": 166,
      "comment": "\n     * Calculates the LU-decomposition of the given matrix.\n     * @param matrix The matrix to decompose.\n     * @throws NonSquareMatrixException if matrix is not square\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 90,col 9)",
        "(line 92,col 9)-(line 92,col 50)",
        "(line 93,col 9)-(line 93,col 34)",
        "(line 94,col 9)-(line 94,col 30)",
        "(line 95,col 9)-(line 95,col 27)",
        "(line 96,col 9)-(line 96,col 23)",
        "(line 97,col 9)-(line 97,col 23)",
        "(line 98,col 9)-(line 98,col 23)",
        "(line 101,col 9)-(line 103,col 9)",
        "(line 104,col 9)-(line 104,col 24)",
        "(line 105,col 9)-(line 105,col 25)",
        "(line 108,col 9)-(line 164,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecomposition.getL()",
      "begin_line": 173,
      "end_line": 186,
      "comment": "\n     * Returns the matrix L of the decomposition.\n     * \u003cp\u003eL is a lower-triangular matrix\u003c/p\u003e\n     * @return the L matrix (or null if decomposed matrix is singular)\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 184,col 9)",
        "(line 185,col 9)-(line 185,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecomposition.getU()",
      "begin_line": 193,
      "end_line": 205,
      "comment": "\n     * Returns the matrix U of the decomposition.\n     * \u003cp\u003eU is an upper-triangular matrix\u003c/p\u003e\n     * @return the U matrix (or null if decomposed matrix is singular)\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 203,col 9)",
        "(line 204,col 9)-(line 204,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecomposition.getP()",
      "begin_line": 216,
      "end_line": 225,
      "comment": "\n     * Returns the P rows permutation matrix.\n     * \u003cp\u003eP is a sparse matrix with exactly one element set to 1.0 in\n     * each row and each column, all other elements being set to 0.0.\u003c/p\u003e\n     * \u003cp\u003eThe positions of the 1 elements are given by the {@link #getPivot()\n     * pivot permutation vector}.\u003c/p\u003e\n     * @return the P rows permutation matrix (or null if decomposed matrix is singular)\n     * @see #getPivot()\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 223,col 9)",
        "(line 224,col 9)-(line 224,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecomposition.getPivot()",
      "begin_line": 232,
      "end_line": 234,
      "comment": "\n     * Returns the pivot permutation vector.\n     * @return the pivot permutation vector\n     * @see #getP()\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecomposition.getDeterminant()",
      "begin_line": 240,
      "end_line": 251,
      "comment": "\n     * Return the determinant of the matrix.\n     * @return determinant of the matrix\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 250,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecomposition.getSolver()",
      "begin_line": 257,
      "end_line": 259,
      "comment": "\n     * Get a solver for finding the A \u0026times; X \u003d B solution in exact linear sense.\n     * @return a solver\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 57)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Solver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.FieldDecompositionSolver\u003cT\u003e"
      ],
      "begin_line": 262,
      "end_line": 451,
      "comment": " Specialized solver. "
    },
    {
      "type": "field",
      "varNames": [
        "field"
      ],
      "begin_line": 265,
      "end_line": 265,
      "comment": " Field to which the elements belong. "
    },
    {
      "type": "field",
      "varNames": [
        "lu"
      ],
      "begin_line": 268,
      "end_line": 268,
      "comment": " Entries of LU decomposition. "
    },
    {
      "type": "field",
      "varNames": [
        "pivot"
      ],
      "begin_line": 271,
      "end_line": 271,
      "comment": " Pivot permutation associated with LU decomposition. "
    },
    {
      "type": "field",
      "varNames": [
        "singular"
      ],
      "begin_line": 274,
      "end_line": 274,
      "comment": " Singularity indicator. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.FieldLUDecomposition.Solver.Solver(org.apache.commons.math.Field\u003cT\u003e, T[][], int[], boolean)",
      "begin_line": 283,
      "end_line": 289,
      "comment": "\n         * Build a solver from decomposed matrix.\n         * @param field field to which the matrix elements belong\n         * @param lu entries of LU decomposition\n         * @param pivot pivot permutation associated with LU decomposition\n         * @param singular singularity indicator\n         ",
      "child_ranges": [
        "(line 285,col 13)-(line 285,col 34)",
        "(line 286,col 13)-(line 286,col 31)",
        "(line 287,col 13)-(line 287,col 34)",
        "(line 288,col 13)-(line 288,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecomposition.Solver.isNonSingular()",
      "begin_line": 292,
      "end_line": 294,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 293,col 13)-(line 293,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecomposition.Solver.solve(org.apache.commons.math.linear.FieldVector\u003cT\u003e)",
      "begin_line": 297,
      "end_line": 338,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 298,col 13)-(line 337,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecomposition.Solver.solve(org.apache.commons.math.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 347,
      "end_line": 384,
      "comment": " Solve the linear equation A \u0026times; X \u003d B.\n         * \u003cp\u003eThe A matrix is implicit here. It is \u003c/p\u003e\n         * @param b right-hand side of the equation A \u0026times; X \u003d B\n         * @return a vector X such that A \u0026times; X \u003d B\n         * @throws DimensionMismatchException if the matrices dimensions do not match.\n         * @throws SingularMatrixException if the decomposed matrix is singular.\n         ",
      "child_ranges": [
        "(line 348,col 13)-(line 348,col 39)",
        "(line 349,col 13)-(line 351,col 13)",
        "(line 352,col 13)-(line 354,col 13)",
        "(line 356,col 13)-(line 359,col 54)",
        "(line 362,col 13)-(line 364,col 13)",
        "(line 367,col 13)-(line 372,col 13)",
        "(line 375,col 13)-(line 381,col 13)",
        "(line 383,col 13)-(line 383,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecomposition.Solver.solve(org.apache.commons.math.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 387,
      "end_line": 439,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 388,col 13)-(line 388,col 39)",
        "(line 389,col 13)-(line 391,col 13)",
        "(line 392,col 13)-(line 394,col 13)",
        "(line 396,col 13)-(line 396,col 53)",
        "(line 399,col 13)-(line 400,col 104)",
        "(line 401,col 13)-(line 407,col 13)",
        "(line 410,col 13)-(line 419,col 13)",
        "(line 422,col 13)-(line 435,col 13)",
        "(line 437,col 13)-(line 437,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.FieldLUDecomposition.Solver.getInverse()",
      "begin_line": 442,
      "end_line": 450,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 443,col 13)-(line 443,col 39)",
        "(line 444,col 13)-(line 444,col 41)",
        "(line 445,col 13)-(line 445,col 80)",
        "(line 446,col 13)-(line 448,col 13)",
        "(line 449,col 13)-(line 449,col 35)"
      ]
    }
  ]
}