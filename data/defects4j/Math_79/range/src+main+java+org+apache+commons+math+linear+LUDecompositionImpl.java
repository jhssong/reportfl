{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/linear/LUDecompositionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LUDecompositionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.LUDecomposition"
      ],
      "begin_line": 34,
      "end_line": 423,
      "comment": "\n * Calculates the LUP-decomposition of a square matrix.\n * \u003cp\u003eThe LUP-decomposition of a matrix A consists of three matrices\n * L, U and P that satisfy: PA \u003d LU, L is lower triangular, and U is\n * upper triangular and P is a permutation matrix. All matrices are\n * m\u0026times;m.\u003c/p\u003e\n * \u003cp\u003eAs shown by the presence of the P matrix, this decomposition is\n * implemented using partial pivoting.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_TOO_SMALL"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Default bound to determine effective singularity in LU decomposition "
    },
    {
      "type": "field",
      "varNames": [
        "lu"
      ],
      "begin_line": 40,
      "end_line": 40,
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
      "begin_line": 46,
      "end_line": 46,
      "comment": " Parity of the permutation associated with the LU decomposition "
    },
    {
      "type": "field",
      "varNames": [
        "singular"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Singularity indicator. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedL"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Cached value of L. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedU"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Cached value of U. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedP"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Cached value of P. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.LUDecompositionImpl(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 65,
      "end_line": 68,
      "comment": "\n     * Calculates the LU-decomposition of the given matrix.\n     * @param matrix The matrix to decompose.\n     * @exception InvalidMatrixException if matrix is not square\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.LUDecompositionImpl(org.apache.commons.math.linear.RealMatrix, double)",
      "begin_line": 77,
      "end_line": 160,
      "comment": "\n     * Calculates the LU-decomposition of the given matrix.\n     * @param matrix The matrix to decompose.\n     * @param singularityThreshold threshold (based on partial row norm)\n     * under which a matrix is considered singular\n     * @exception NonSquareMatrixException if matrix is not square\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 82,col 9)",
        "(line 84,col 9)-(line 84,col 50)",
        "(line 85,col 9)-(line 85,col 30)",
        "(line 86,col 9)-(line 86,col 27)",
        "(line 87,col 9)-(line 87,col 23)",
        "(line 88,col 9)-(line 88,col 23)",
        "(line 89,col 9)-(line 89,col 23)",
        "(line 92,col 9)-(line 94,col 9)",
        "(line 95,col 9)-(line 95,col 24)",
        "(line 96,col 9)-(line 96,col 25)",
        "(line 99,col 9)-(line 158,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.getL()",
      "begin_line": 163,
      "end_line": 176,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 164,col 9)-(line 174,col 9)",
        "(line 175,col 9)-(line 175,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.getU()",
      "begin_line": 179,
      "end_line": 191,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 180,col 9)-(line 189,col 9)",
        "(line 190,col 9)-(line 190,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.getP()",
      "begin_line": 194,
      "end_line": 203,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 195,col 9)-(line 201,col 9)",
        "(line 202,col 9)-(line 202,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.getPivot()",
      "begin_line": 206,
      "end_line": 208,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.getDeterminant()",
      "begin_line": 211,
      "end_line": 222,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 212,col 9)-(line 221,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.getSolver()",
      "begin_line": 225,
      "end_line": 227,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 47)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Solver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.DecompositionSolver"
      ],
      "begin_line": 230,
      "end_line": 421,
      "comment": " Specialized solver. "
    },
    {
      "type": "field",
      "varNames": [
        "lu"
      ],
      "begin_line": 233,
      "end_line": 233,
      "comment": " Entries of LU decomposition. "
    },
    {
      "type": "field",
      "varNames": [
        "pivot"
      ],
      "begin_line": 236,
      "end_line": 236,
      "comment": " Pivot permutation associated with LU decomposition. "
    },
    {
      "type": "field",
      "varNames": [
        "singular"
      ],
      "begin_line": 239,
      "end_line": 239,
      "comment": " Singularity indicator. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.Solver.Solver(double[][], int[], boolean)",
      "begin_line": 247,
      "end_line": 251,
      "comment": "\n         * Build a solver from decomposed matrix.\n         * @param lu entries of LU decomposition\n         * @param pivot pivot permutation associated with LU decomposition\n         * @param singular singularity indicator\n         ",
      "child_ranges": [
        "(line 248,col 13)-(line 248,col 31)",
        "(line 249,col 13)-(line 249,col 34)",
        "(line 250,col 13)-(line 250,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.Solver.isNonSingular()",
      "begin_line": 254,
      "end_line": 256,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 255,col 13)-(line 255,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.Solver.solve(double[])",
      "begin_line": 259,
      "end_line": 298,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 262,col 13)-(line 262,col 39)",
        "(line 263,col 13)-(line 267,col 13)",
        "(line 268,col 13)-(line 270,col 13)",
        "(line 272,col 13)-(line 272,col 46)",
        "(line 275,col 13)-(line 277,col 13)",
        "(line 280,col 13)-(line 285,col 13)",
        "(line 288,col 13)-(line 294,col 13)",
        "(line 296,col 13)-(line 296,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealVector)",
      "begin_line": 301,
      "end_line": 344,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 303,col 13)-(line 343,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.Solver.solve(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 353,
      "end_line": 356,
      "comment": " Solve the linear equation A \u0026times; X \u003d B.\n         * \u003cp\u003eThe A matrix is implicit here. It is \u003c/p\u003e\n         * @param b right-hand side of the equation A \u0026times; X \u003d B\n         * @return a vector X such that A \u0026times; X \u003d B\n         * @exception IllegalArgumentException if matrices dimensions don\u0027t match\n         * @exception InvalidMatrixException if decomposed matrix is singular\n         ",
      "child_ranges": [
        "(line 355,col 13)-(line 355,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 359,
      "end_line": 414,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 362,col 13)-(line 362,col 39)",
        "(line 363,col 13)-(line 367,col 13)",
        "(line 368,col 13)-(line 370,col 13)",
        "(line 372,col 13)-(line 372,col 53)",
        "(line 375,col 13)-(line 375,col 55)",
        "(line 376,col 13)-(line 382,col 13)",
        "(line 385,col 13)-(line 394,col 13)",
        "(line 397,col 13)-(line 410,col 13)",
        "(line 412,col 13)-(line 412,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.Solver.getInverse()",
      "begin_line": 417,
      "end_line": 419,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 418,col 13)-(line 418,col 77)"
      ]
    }
  ]
}