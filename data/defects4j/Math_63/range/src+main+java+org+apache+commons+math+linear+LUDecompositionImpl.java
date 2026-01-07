{
  "filepath": "/tmp/Math-63b/src/main/java/org/apache/commons/math/linear/LUDecompositionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LUDecompositionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.LUDecomposition"
      ],
      "begin_line": 36,
      "end_line": 423,
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
      "begin_line": 42,
      "end_line": 42,
      "comment": " Entries of LU decomposition. "
    },
    {
      "type": "field",
      "varNames": [
        "pivot"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " Pivot permutation associated with LU decomposition "
    },
    {
      "type": "field",
      "varNames": [
        "even"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Parity of the permutation associated with the LU decomposition "
    },
    {
      "type": "field",
      "varNames": [
        "singular"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Singularity indicator. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedL"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Cached value of L. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedU"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Cached value of U. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedP"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Cached value of P. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.LUDecompositionImpl(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 67,
      "end_line": 70,
      "comment": "\n     * Calculates the LU-decomposition of the given matrix.\n     * @param matrix The matrix to decompose.\n     * @exception InvalidMatrixException if matrix is not square\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.LUDecompositionImpl(org.apache.commons.math.linear.RealMatrix, double)",
      "begin_line": 79,
      "end_line": 162,
      "comment": "\n     * Calculates the LU-decomposition of the given matrix.\n     * @param matrix The matrix to decompose.\n     * @param singularityThreshold threshold (based on partial row norm)\n     * under which a matrix is considered singular\n     * @exception NonSquareMatrixException if matrix is not square\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 84,col 9)",
        "(line 86,col 9)-(line 86,col 50)",
        "(line 87,col 9)-(line 87,col 30)",
        "(line 88,col 9)-(line 88,col 27)",
        "(line 89,col 9)-(line 89,col 23)",
        "(line 90,col 9)-(line 90,col 23)",
        "(line 91,col 9)-(line 91,col 23)",
        "(line 94,col 9)-(line 96,col 9)",
        "(line 97,col 9)-(line 97,col 24)",
        "(line 98,col 9)-(line 98,col 25)",
        "(line 101,col 9)-(line 160,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.getL()",
      "begin_line": 165,
      "end_line": 178,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 166,col 9)-(line 176,col 9)",
        "(line 177,col 9)-(line 177,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.getU()",
      "begin_line": 181,
      "end_line": 193,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 182,col 9)-(line 191,col 9)",
        "(line 192,col 9)-(line 192,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.getP()",
      "begin_line": 196,
      "end_line": 205,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 197,col 9)-(line 203,col 9)",
        "(line 204,col 9)-(line 204,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.getPivot()",
      "begin_line": 208,
      "end_line": 210,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.getDeterminant()",
      "begin_line": 213,
      "end_line": 224,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 214,col 9)-(line 223,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.getSolver()",
      "begin_line": 227,
      "end_line": 229,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 47)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Solver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.DecompositionSolver"
      ],
      "begin_line": 232,
      "end_line": 421,
      "comment": " Specialized solver. "
    },
    {
      "type": "field",
      "varNames": [
        "lu"
      ],
      "begin_line": 235,
      "end_line": 235,
      "comment": " Entries of LU decomposition. "
    },
    {
      "type": "field",
      "varNames": [
        "pivot"
      ],
      "begin_line": 238,
      "end_line": 238,
      "comment": " Pivot permutation associated with LU decomposition. "
    },
    {
      "type": "field",
      "varNames": [
        "singular"
      ],
      "begin_line": 241,
      "end_line": 241,
      "comment": " Singularity indicator. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.Solver.Solver(double[][], int[], boolean)",
      "begin_line": 249,
      "end_line": 253,
      "comment": "\n         * Build a solver from decomposed matrix.\n         * @param lu entries of LU decomposition\n         * @param pivot pivot permutation associated with LU decomposition\n         * @param singular singularity indicator\n         ",
      "child_ranges": [
        "(line 250,col 13)-(line 250,col 31)",
        "(line 251,col 13)-(line 251,col 34)",
        "(line 252,col 13)-(line 252,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.Solver.isNonSingular()",
      "begin_line": 256,
      "end_line": 258,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 257,col 13)-(line 257,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.Solver.solve(double[])",
      "begin_line": 261,
      "end_line": 299,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 264,col 13)-(line 264,col 39)",
        "(line 265,col 13)-(line 268,col 13)",
        "(line 269,col 13)-(line 271,col 13)",
        "(line 273,col 13)-(line 273,col 46)",
        "(line 276,col 13)-(line 278,col 13)",
        "(line 281,col 13)-(line 286,col 13)",
        "(line 289,col 13)-(line 295,col 13)",
        "(line 297,col 13)-(line 297,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealVector)",
      "begin_line": 302,
      "end_line": 344,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 304,col 13)-(line 343,col 13)"
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