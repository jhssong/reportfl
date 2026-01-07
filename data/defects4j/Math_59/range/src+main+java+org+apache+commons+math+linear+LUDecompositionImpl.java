{
  "filepath": "/tmp/Math-59b/src/main/java/org/apache/commons/math/linear/LUDecompositionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LUDecompositionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.LUDecomposition"
      ],
      "begin_line": 37,
      "end_line": 400,
      "comment": "\n * Calculates the LUP-decomposition of a square matrix.\n * \u003cp\u003eThe LUP-decomposition of a matrix A consists of three matrices\n * L, U and P that satisfy: PA \u003d LU, L is lower triangular, and U is\n * upper triangular and P is a permutation matrix. All matrices are\n * m\u0026times;m.\u003c/p\u003e\n * \u003cp\u003eAs shown by the presence of the P matrix, this decomposition is\n * implemented using partial pivoting.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_TOO_SMALL"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Default bound to determine effective singularity in LU decomposition "
    },
    {
      "type": "field",
      "varNames": [
        "lu"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Entries of LU decomposition. "
    },
    {
      "type": "field",
      "varNames": [
        "pivot"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Pivot permutation associated with LU decomposition "
    },
    {
      "type": "field",
      "varNames": [
        "even"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Parity of the permutation associated with the LU decomposition "
    },
    {
      "type": "field",
      "varNames": [
        "singular"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Singularity indicator. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedL"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Cached value of L. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedU"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Cached value of U. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedP"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Cached value of P. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.LUDecompositionImpl(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * Calculates the LU-decomposition of the given matrix.\n     * @param matrix Matrix to decompose.\n     * @throws NonSquareMatrixException if matrix is not square.\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.LUDecompositionImpl(org.apache.commons.math.linear.RealMatrix, double)",
      "begin_line": 71,
      "end_line": 152,
      "comment": "\n     * Calculates the LU-decomposition of the given matrix.\n     * @param matrix The matrix to decompose.\n     * @param singularityThreshold threshold (based on partial row norm)\n     * under which a matrix is considered singular\n     * @throws NonSquareMatrixException if matrix is not square\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 75,col 9)",
        "(line 77,col 9)-(line 77,col 50)",
        "(line 78,col 9)-(line 78,col 30)",
        "(line 79,col 9)-(line 79,col 27)",
        "(line 80,col 9)-(line 80,col 23)",
        "(line 81,col 9)-(line 81,col 23)",
        "(line 82,col 9)-(line 82,col 23)",
        "(line 85,col 9)-(line 87,col 9)",
        "(line 88,col 9)-(line 88,col 24)",
        "(line 89,col 9)-(line 89,col 25)",
        "(line 92,col 9)-(line 151,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.getL()",
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
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.getU()",
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
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.getP()",
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
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.getPivot()",
      "begin_line": 198,
      "end_line": 200,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.getDeterminant()",
      "begin_line": 203,
      "end_line": 214,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 204,col 9)-(line 213,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.getSolver()",
      "begin_line": 217,
      "end_line": 219,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 47)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Solver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.DecompositionSolver"
      ],
      "begin_line": 222,
      "end_line": 399,
      "comment": " Specialized solver. "
    },
    {
      "type": "field",
      "varNames": [
        "lu"
      ],
      "begin_line": 225,
      "end_line": 225,
      "comment": " Entries of LU decomposition. "
    },
    {
      "type": "field",
      "varNames": [
        "pivot"
      ],
      "begin_line": 228,
      "end_line": 228,
      "comment": " Pivot permutation associated with LU decomposition. "
    },
    {
      "type": "field",
      "varNames": [
        "singular"
      ],
      "begin_line": 231,
      "end_line": 231,
      "comment": " Singularity indicator. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.Solver.Solver(double[][], int[], boolean)",
      "begin_line": 239,
      "end_line": 243,
      "comment": "\n         * Build a solver from decomposed matrix.\n         * @param lu entries of LU decomposition\n         * @param pivot pivot permutation associated with LU decomposition\n         * @param singular singularity indicator\n         ",
      "child_ranges": [
        "(line 240,col 13)-(line 240,col 31)",
        "(line 241,col 13)-(line 241,col 34)",
        "(line 242,col 13)-(line 242,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.Solver.isNonSingular()",
      "begin_line": 246,
      "end_line": 248,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 247,col 13)-(line 247,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.Solver.solve(double[])",
      "begin_line": 251,
      "end_line": 285,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 252,col 13)-(line 252,col 39)",
        "(line 253,col 13)-(line 255,col 13)",
        "(line 256,col 13)-(line 258,col 13)",
        "(line 260,col 13)-(line 260,col 46)",
        "(line 263,col 13)-(line 265,col 13)",
        "(line 268,col 13)-(line 273,col 13)",
        "(line 276,col 13)-(line 282,col 13)",
        "(line 284,col 13)-(line 284,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealVector)",
      "begin_line": 288,
      "end_line": 327,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 289,col 13)-(line 326,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.Solver.solve(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 337,
      "end_line": 339,
      "comment": " Solve the linear equation A \u0026times; X \u003d B.\n         * \u003cp\u003eThe A matrix is implicit here. It is \u003c/p\u003e\n         * @param b right-hand side of the equation A \u0026times; X \u003d B\n         * @return a vector X such that A \u0026times; X \u003d B\n         * @throws DimensionMismatchException if the matrices dimensions\n         * do not match.\n         * @throws SingularMatrixException if decomposed matrix is singular.\n         ",
      "child_ranges": [
        "(line 338,col 13)-(line 338,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 342,
      "end_line": 393,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 344,col 13)-(line 344,col 39)",
        "(line 345,col 13)-(line 347,col 13)",
        "(line 348,col 13)-(line 350,col 13)",
        "(line 352,col 13)-(line 352,col 53)",
        "(line 355,col 13)-(line 355,col 55)",
        "(line 356,col 13)-(line 362,col 13)",
        "(line 365,col 13)-(line 374,col 13)",
        "(line 377,col 13)-(line 390,col 13)",
        "(line 392,col 13)-(line 392,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.Solver.getInverse()",
      "begin_line": 396,
      "end_line": 398,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 397,col 13)-(line 397,col 77)"
      ]
    }
  ]
}