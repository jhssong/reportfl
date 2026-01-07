{
  "filepath": "/tmp/Math-67b/src/main/java/org/apache/commons/math/linear/LUDecompositionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LUDecompositionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.LUDecomposition"
      ],
      "begin_line": 35,
      "end_line": 422,
      "comment": "\n * Calculates the LUP-decomposition of a square matrix.\n * \u003cp\u003eThe LUP-decomposition of a matrix A consists of three matrices\n * L, U and P that satisfy: PA \u003d LU, L is lower triangular, and U is\n * upper triangular and P is a permutation matrix. All matrices are\n * m\u0026times;m.\u003c/p\u003e\n * \u003cp\u003eAs shown by the presence of the P matrix, this decomposition is\n * implemented using partial pivoting.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_TOO_SMALL"
      ],
      "begin_line": 38,
      "end_line": 38,
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
      "begin_line": 44,
      "end_line": 44,
      "comment": " Pivot permutation associated with LU decomposition "
    },
    {
      "type": "field",
      "varNames": [
        "even"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Parity of the permutation associated with the LU decomposition "
    },
    {
      "type": "field",
      "varNames": [
        "singular"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Singularity indicator. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedL"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Cached value of L. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedU"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Cached value of U. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedP"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Cached value of P. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.LUDecompositionImpl(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 66,
      "end_line": 69,
      "comment": "\n     * Calculates the LU-decomposition of the given matrix.\n     * @param matrix The matrix to decompose.\n     * @exception InvalidMatrixException if matrix is not square\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.LUDecompositionImpl(org.apache.commons.math.linear.RealMatrix, double)",
      "begin_line": 78,
      "end_line": 161,
      "comment": "\n     * Calculates the LU-decomposition of the given matrix.\n     * @param matrix The matrix to decompose.\n     * @param singularityThreshold threshold (based on partial row norm)\n     * under which a matrix is considered singular\n     * @exception NonSquareMatrixException if matrix is not square\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 83,col 9)",
        "(line 85,col 9)-(line 85,col 50)",
        "(line 86,col 9)-(line 86,col 30)",
        "(line 87,col 9)-(line 87,col 27)",
        "(line 88,col 9)-(line 88,col 23)",
        "(line 89,col 9)-(line 89,col 23)",
        "(line 90,col 9)-(line 90,col 23)",
        "(line 93,col 9)-(line 95,col 9)",
        "(line 96,col 9)-(line 96,col 24)",
        "(line 97,col 9)-(line 97,col 25)",
        "(line 100,col 9)-(line 159,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.getL()",
      "begin_line": 164,
      "end_line": 177,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 165,col 9)-(line 175,col 9)",
        "(line 176,col 9)-(line 176,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.getU()",
      "begin_line": 180,
      "end_line": 192,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 181,col 9)-(line 190,col 9)",
        "(line 191,col 9)-(line 191,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.getP()",
      "begin_line": 195,
      "end_line": 204,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 196,col 9)-(line 202,col 9)",
        "(line 203,col 9)-(line 203,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.getPivot()",
      "begin_line": 207,
      "end_line": 209,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.getDeterminant()",
      "begin_line": 212,
      "end_line": 223,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 213,col 9)-(line 222,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.getSolver()",
      "begin_line": 226,
      "end_line": 228,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 47)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Solver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.DecompositionSolver"
      ],
      "begin_line": 231,
      "end_line": 420,
      "comment": " Specialized solver. "
    },
    {
      "type": "field",
      "varNames": [
        "lu"
      ],
      "begin_line": 234,
      "end_line": 234,
      "comment": " Entries of LU decomposition. "
    },
    {
      "type": "field",
      "varNames": [
        "pivot"
      ],
      "begin_line": 237,
      "end_line": 237,
      "comment": " Pivot permutation associated with LU decomposition. "
    },
    {
      "type": "field",
      "varNames": [
        "singular"
      ],
      "begin_line": 240,
      "end_line": 240,
      "comment": " Singularity indicator. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.Solver.Solver(double[][], int[], boolean)",
      "begin_line": 248,
      "end_line": 252,
      "comment": "\n         * Build a solver from decomposed matrix.\n         * @param lu entries of LU decomposition\n         * @param pivot pivot permutation associated with LU decomposition\n         * @param singular singularity indicator\n         ",
      "child_ranges": [
        "(line 249,col 13)-(line 249,col 31)",
        "(line 250,col 13)-(line 250,col 34)",
        "(line 251,col 13)-(line 251,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.Solver.isNonSingular()",
      "begin_line": 255,
      "end_line": 257,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 256,col 13)-(line 256,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.Solver.solve(double[])",
      "begin_line": 260,
      "end_line": 298,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 263,col 13)-(line 263,col 39)",
        "(line 264,col 13)-(line 267,col 13)",
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
      "end_line": 343,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 303,col 13)-(line 342,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.Solver.solve(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 352,
      "end_line": 355,
      "comment": " Solve the linear equation A \u0026times; X \u003d B.\n         * \u003cp\u003eThe A matrix is implicit here. It is \u003c/p\u003e\n         * @param b right-hand side of the equation A \u0026times; X \u003d B\n         * @return a vector X such that A \u0026times; X \u003d B\n         * @exception IllegalArgumentException if matrices dimensions don\u0027t match\n         * @exception InvalidMatrixException if decomposed matrix is singular\n         ",
      "child_ranges": [
        "(line 354,col 13)-(line 354,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 358,
      "end_line": 413,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 361,col 13)-(line 361,col 39)",
        "(line 362,col 13)-(line 366,col 13)",
        "(line 367,col 13)-(line 369,col 13)",
        "(line 371,col 13)-(line 371,col 53)",
        "(line 374,col 13)-(line 374,col 55)",
        "(line 375,col 13)-(line 381,col 13)",
        "(line 384,col 13)-(line 393,col 13)",
        "(line 396,col 13)-(line 409,col 13)",
        "(line 411,col 13)-(line 411,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.Solver.getInverse()",
      "begin_line": 416,
      "end_line": 418,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 417,col 13)-(line 417,col 77)"
      ]
    }
  ]
}