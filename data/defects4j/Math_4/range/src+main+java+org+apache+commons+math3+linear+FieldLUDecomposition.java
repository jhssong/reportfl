{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/linear/FieldLUDecomposition.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FieldLUDecomposition",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 54,
      "end_line": 445,
      "comment": "\n * Calculates the LUP-decomposition of a square matrix.\n * \u003cp\u003eThe LUP-decomposition of a matrix A consists of three matrices\n * L, U and P that satisfy: PA \u003d LU, L is lower triangular, and U is\n * upper triangular and P is a permutation matrix. All matrices are\n * m\u0026times;m.\u003c/p\u003e\n * \u003cp\u003eSince {@link FieldElement field elements} do not provide an ordering\n * operator, the permutation matrix is computed here only in order to avoid\n * a zero pivot element, no attempt is done to get the largest pivot\n * element.\u003c/p\u003e\n * \u003cp\u003eThis class is based on the class with similar name from the\n * \u003ca href\u003d\"http://math.nist.gov/javanumerics/jama/\"\u003eJAMA\u003c/a\u003e library.\u003c/p\u003e\n * \u003cul\u003e\n *   \u003cli\u003ea {@link #getP() getP} method has been added,\u003c/li\u003e\n *   \u003cli\u003ethe {@code det} method has been renamed as {@link #getDeterminant()\n *   getDeterminant},\u003c/li\u003e\n *   \u003cli\u003ethe {@code getDoublePivot} method has been removed (but the int based\n *   {@link #getPivot() getPivot} method has been kept),\u003c/li\u003e\n *   \u003cli\u003ethe {@code solve} and {@code isNonSingular} methods have been replaced\n *   by a {@link #getSolver() getSolver} method and the equivalent methods\n *   provided by the returned {@link DecompositionSolver}.\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * @param \u003cT\u003e the type of the field elements\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/LUDecomposition.html\"\u003eMathWorld\u003c/a\u003e\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/LU_decomposition\"\u003eWikipedia\u003c/a\u003e\n * @version $Id$\n * @since 2.0 (changed to concrete class in 3.0)\n "
    },
    {
      "type": "field",
      "varNames": [
        "field"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Field to which the elements belong. "
    },
    {
      "type": "field",
      "varNames": [
        "lu"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Entries of LU decomposition. "
    },
    {
      "type": "field",
      "varNames": [
        "pivot"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Pivot permutation associated with LU decomposition. "
    },
    {
      "type": "field",
      "varNames": [
        "even"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Parity of the permutation associated with the LU decomposition. "
    },
    {
      "type": "field",
      "varNames": [
        "singular"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Singularity indicator. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedL"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " Cached value of L. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedU"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " Cached value of U. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedP"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " Cached value of P. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.FieldLUDecomposition.FieldLUDecomposition(org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 85,
      "end_line": 165,
      "comment": "\n     * Calculates the LU-decomposition of the given matrix.\n     * @param matrix The matrix to decompose.\n     * @throws NonSquareMatrixException if matrix is not square\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 89,col 9)",
        "(line 91,col 9)-(line 91,col 50)",
        "(line 92,col 9)-(line 92,col 34)",
        "(line 93,col 9)-(line 93,col 30)",
        "(line 94,col 9)-(line 94,col 27)",
        "(line 95,col 9)-(line 95,col 23)",
        "(line 96,col 9)-(line 96,col 23)",
        "(line 97,col 9)-(line 97,col 23)",
        "(line 100,col 9)-(line 102,col 9)",
        "(line 103,col 9)-(line 103,col 24)",
        "(line 104,col 9)-(line 104,col 25)",
        "(line 107,col 9)-(line 163,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldLUDecomposition.getL()",
      "begin_line": 172,
      "end_line": 185,
      "comment": "\n     * Returns the matrix L of the decomposition.\n     * \u003cp\u003eL is a lower-triangular matrix\u003c/p\u003e\n     * @return the L matrix (or null if decomposed matrix is singular)\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 183,col 9)",
        "(line 184,col 9)-(line 184,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldLUDecomposition.getU()",
      "begin_line": 192,
      "end_line": 204,
      "comment": "\n     * Returns the matrix U of the decomposition.\n     * \u003cp\u003eU is an upper-triangular matrix\u003c/p\u003e\n     * @return the U matrix (or null if decomposed matrix is singular)\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 202,col 9)",
        "(line 203,col 9)-(line 203,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldLUDecomposition.getP()",
      "begin_line": 215,
      "end_line": 224,
      "comment": "\n     * Returns the P rows permutation matrix.\n     * \u003cp\u003eP is a sparse matrix with exactly one element set to 1.0 in\n     * each row and each column, all other elements being set to 0.0.\u003c/p\u003e\n     * \u003cp\u003eThe positions of the 1 elements are given by the {@link #getPivot()\n     * pivot permutation vector}.\u003c/p\u003e\n     * @return the P rows permutation matrix (or null if decomposed matrix is singular)\n     * @see #getPivot()\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 222,col 9)",
        "(line 223,col 9)-(line 223,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldLUDecomposition.getPivot()",
      "begin_line": 231,
      "end_line": 233,
      "comment": "\n     * Returns the pivot permutation vector.\n     * @return the pivot permutation vector\n     * @see #getP()\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldLUDecomposition.getDeterminant()",
      "begin_line": 239,
      "end_line": 250,
      "comment": "\n     * Return the determinant of the matrix.\n     * @return determinant of the matrix\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 249,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldLUDecomposition.getSolver()",
      "begin_line": 256,
      "end_line": 258,
      "comment": "\n     * Get a solver for finding the A \u0026times; X \u003d B solution in exact linear sense.\n     * @return a solver\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 57)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Solver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.FieldDecompositionSolver\u003cT\u003e"
      ],
      "begin_line": 261,
      "end_line": 444,
      "comment": " Specialized solver. "
    },
    {
      "type": "field",
      "varNames": [
        "field"
      ],
      "begin_line": 264,
      "end_line": 264,
      "comment": " Field to which the elements belong. "
    },
    {
      "type": "field",
      "varNames": [
        "lu"
      ],
      "begin_line": 267,
      "end_line": 267,
      "comment": " Entries of LU decomposition. "
    },
    {
      "type": "field",
      "varNames": [
        "pivot"
      ],
      "begin_line": 270,
      "end_line": 270,
      "comment": " Pivot permutation associated with LU decomposition. "
    },
    {
      "type": "field",
      "varNames": [
        "singular"
      ],
      "begin_line": 273,
      "end_line": 273,
      "comment": " Singularity indicator. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.FieldLUDecomposition.Solver.Solver(org.apache.commons.math3.Field\u003cT\u003e, T[][], int[], boolean)",
      "begin_line": 282,
      "end_line": 288,
      "comment": "\n         * Build a solver from decomposed matrix.\n         * @param field field to which the matrix elements belong\n         * @param lu entries of LU decomposition\n         * @param pivot pivot permutation associated with LU decomposition\n         * @param singular singularity indicator\n         ",
      "child_ranges": [
        "(line 284,col 13)-(line 284,col 34)",
        "(line 285,col 13)-(line 285,col 31)",
        "(line 286,col 13)-(line 286,col 34)",
        "(line 287,col 13)-(line 287,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldLUDecomposition.Solver.isNonSingular()",
      "begin_line": 291,
      "end_line": 293,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 292,col 13)-(line 292,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldLUDecomposition.Solver.solve(org.apache.commons.math3.linear.FieldVector\u003cT\u003e)",
      "begin_line": 296,
      "end_line": 335,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 297,col 13)-(line 334,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldLUDecomposition.Solver.solve(org.apache.commons.math3.linear.ArrayFieldVector\u003cT\u003e)",
      "begin_line": 344,
      "end_line": 378,
      "comment": " Solve the linear equation A \u0026times; X \u003d B.\n         * \u003cp\u003eThe A matrix is implicit here. It is \u003c/p\u003e\n         * @param b right-hand side of the equation A \u0026times; X \u003d B\n         * @return a vector X such that A \u0026times; X \u003d B\n         * @throws DimensionMismatchException if the matrices dimensions do not match.\n         * @throws SingularMatrixException if the decomposed matrix is singular.\n         ",
      "child_ranges": [
        "(line 345,col 13)-(line 345,col 39)",
        "(line 346,col 13)-(line 346,col 48)",
        "(line 347,col 13)-(line 349,col 13)",
        "(line 350,col 13)-(line 352,col 13)",
        "(line 355,col 13)-(line 355,col 59)",
        "(line 356,col 13)-(line 358,col 13)",
        "(line 361,col 13)-(line 366,col 13)",
        "(line 369,col 13)-(line 375,col 13)",
        "(line 377,col 13)-(line 377,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldLUDecomposition.Solver.solve(org.apache.commons.math3.linear.FieldMatrix\u003cT\u003e)",
      "begin_line": 381,
      "end_line": 432,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 382,col 13)-(line 382,col 39)",
        "(line 383,col 13)-(line 385,col 13)",
        "(line 386,col 13)-(line 388,col 13)",
        "(line 390,col 13)-(line 390,col 53)",
        "(line 393,col 13)-(line 393,col 68)",
        "(line 394,col 13)-(line 400,col 13)",
        "(line 403,col 13)-(line 412,col 13)",
        "(line 415,col 13)-(line 428,col 13)",
        "(line 430,col 13)-(line 430,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.FieldLUDecomposition.Solver.getInverse()",
      "begin_line": 435,
      "end_line": 443,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 436,col 13)-(line 436,col 39)",
        "(line 437,col 13)-(line 437,col 41)",
        "(line 438,col 13)-(line 438,col 80)",
        "(line 439,col 13)-(line 441,col 13)",
        "(line 442,col 13)-(line 442,col 35)"
      ]
    }
  ]
}