{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/linear/LUDecomposition.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LUDecomposition",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 49,
      "end_line": 386,
      "comment": "\n * Calculates the LUP-decomposition of a square matrix.\n * \u003cp\u003eThe LUP-decomposition of a matrix A consists of three matrices L, U and\n * P that satisfy: P\u0026times;A \u003d L\u0026times;U. L is lower triangular (with unit\n * diagonal terms), U is upper triangular and P is a permutation matrix. All\n * matrices are m\u0026times;m.\u003c/p\u003e\n * \u003cp\u003eAs shown by the presence of the P matrix, this decomposition is\n * implemented using partial pivoting.\u003c/p\u003e\n * \u003cp\u003eThis class is based on the class with similar name from the\n * \u003ca href\u003d\"http://math.nist.gov/javanumerics/jama/\"\u003eJAMA\u003c/a\u003e library.\u003c/p\u003e\n * \u003cul\u003e\n *   \u003cli\u003ea {@link #getP() getP} method has been added,\u003c/li\u003e\n *   \u003cli\u003ethe {@code det} method has been renamed as {@link #getDeterminant()\n *   getDeterminant},\u003c/li\u003e\n *   \u003cli\u003ethe {@code getDoublePivot} method has been removed (but the int based\n *   {@link #getPivot() getPivot} method has been kept),\u003c/li\u003e\n *   \u003cli\u003ethe {@code solve} and {@code isNonSingular} methods have been replaced\n *   by a {@link #getSolver() getSolver} method and the equivalent methods\n *   provided by the returned {@link DecompositionSolver}.\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/LUDecomposition.html\"\u003eMathWorld\u003c/a\u003e\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/LU_decomposition\"\u003eWikipedia\u003c/a\u003e\n * @version $Id$\n * @since 2.0 (changed to concrete class in 3.0)\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_TOO_SMALL"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Default bound to determine effective singularity in LU decomposition. "
    },
    {
      "type": "field",
      "varNames": [
        "lu"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Entries of LU decomposition. "
    },
    {
      "type": "field",
      "varNames": [
        "pivot"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Pivot permutation associated with LU decomposition. "
    },
    {
      "type": "field",
      "varNames": [
        "even"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Parity of the permutation associated with the LU decomposition. "
    },
    {
      "type": "field",
      "varNames": [
        "singular"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Singularity indicator. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedL"
      ],
      "begin_line": 61,
      "end_line": 61,
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
      "begin_line": 65,
      "end_line": 65,
      "comment": " Cached value of P. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.LUDecomposition.LUDecomposition(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 75,
      "end_line": 77,
      "comment": "\n     * Calculates the LU-decomposition of the given matrix.\n     * This constructor uses 1e-11 as default value for the singularity\n     * threshold.\n     *\n     * @param matrix Matrix to decompose.\n     * @throws NonSquareMatrixException if matrix is not square.\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.LUDecomposition.LUDecomposition(org.apache.commons.math3.linear.RealMatrix, double)",
      "begin_line": 86,
      "end_line": 165,
      "comment": "\n     * Calculates the LU-decomposition of the given matrix.\n     * @param matrix The matrix to decompose.\n     * @param singularityThreshold threshold (based on partial row norm)\n     * under which a matrix is considered singular\n     * @throws NonSquareMatrixException if matrix is not square\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 90,col 9)",
        "(line 92,col 9)-(line 92,col 50)",
        "(line 93,col 9)-(line 93,col 30)",
        "(line 94,col 9)-(line 94,col 27)",
        "(line 95,col 9)-(line 95,col 23)",
        "(line 96,col 9)-(line 96,col 23)",
        "(line 97,col 9)-(line 97,col 23)",
        "(line 100,col 9)-(line 102,col 9)",
        "(line 103,col 9)-(line 103,col 24)",
        "(line 104,col 9)-(line 104,col 25)",
        "(line 107,col 9)-(line 164,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.LUDecomposition.getL()",
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
      "signature": "org.apache.commons.math3.linear.LUDecomposition.getU()",
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
      "signature": "org.apache.commons.math3.linear.LUDecomposition.getP()",
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
      "signature": "org.apache.commons.math3.linear.LUDecomposition.getPivot()",
      "begin_line": 231,
      "end_line": 233,
      "comment": "\n     * Returns the pivot permutation vector.\n     * @return the pivot permutation vector\n     * @see #getP()\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.LUDecomposition.getDeterminant()",
      "begin_line": 239,
      "end_line": 250,
      "comment": "\n     * Return the determinant of the matrix\n     * @return determinant of the matrix\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 249,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.LUDecomposition.getSolver()",
      "begin_line": 257,
      "end_line": 259,
      "comment": "\n     * Get a solver for finding the A \u0026times; X \u003d B solution in exact linear\n     * sense.\n     * @return a solver\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 47)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Solver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.DecompositionSolver"
      ],
      "begin_line": 262,
      "end_line": 385,
      "comment": " Specialized solver. "
    },
    {
      "type": "field",
      "varNames": [
        "lu"
      ],
      "begin_line": 265,
      "end_line": 265,
      "comment": " Entries of LU decomposition. "
    },
    {
      "type": "field",
      "varNames": [
        "pivot"
      ],
      "begin_line": 268,
      "end_line": 268,
      "comment": " Pivot permutation associated with LU decomposition. "
    },
    {
      "type": "field",
      "varNames": [
        "singular"
      ],
      "begin_line": 271,
      "end_line": 271,
      "comment": " Singularity indicator. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.LUDecomposition.Solver.Solver(double[][], int[], boolean)",
      "begin_line": 279,
      "end_line": 283,
      "comment": "\n         * Build a solver from decomposed matrix.\n         * @param lu entries of LU decomposition\n         * @param pivot pivot permutation associated with LU decomposition\n         * @param singular singularity indicator\n         ",
      "child_ranges": [
        "(line 280,col 13)-(line 280,col 31)",
        "(line 281,col 13)-(line 281,col 34)",
        "(line 282,col 13)-(line 282,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.LUDecomposition.Solver.isNonSingular()",
      "begin_line": 286,
      "end_line": 288,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 287,col 13)-(line 287,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.LUDecomposition.Solver.solve(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 291,
      "end_line": 325,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 292,col 13)-(line 292,col 39)",
        "(line 293,col 13)-(line 295,col 13)",
        "(line 296,col 13)-(line 298,col 13)",
        "(line 300,col 13)-(line 300,col 46)",
        "(line 303,col 13)-(line 305,col 13)",
        "(line 308,col 13)-(line 313,col 13)",
        "(line 316,col 13)-(line 322,col 13)",
        "(line 324,col 13)-(line 324,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.LUDecomposition.Solver.solve(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 328,
      "end_line": 379,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 330,col 13)-(line 330,col 39)",
        "(line 331,col 13)-(line 333,col 13)",
        "(line 334,col 13)-(line 336,col 13)",
        "(line 338,col 13)-(line 338,col 53)",
        "(line 341,col 13)-(line 341,col 55)",
        "(line 342,col 13)-(line 348,col 13)",
        "(line 351,col 13)-(line 360,col 13)",
        "(line 363,col 13)-(line 376,col 13)",
        "(line 378,col 13)-(line 378,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.LUDecomposition.Solver.getInverse()",
      "begin_line": 382,
      "end_line": 384,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 383,col 13)-(line 383,col 77)"
      ]
    }
  ]
}