{
  "filepath": "/tmp/Math-91b/src/java/org/apache/commons/math/linear/decomposition/LUDecompositionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LUDecompositionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.decomposition.LUDecomposition"
      ],
      "begin_line": 40,
      "end_line": 429,
      "comment": "\n * Calculates the LUP-decomposition of a square matrix.\n * \u003cp\u003eThe LUP-decomposition of a matrix A consists of three matrices\n * L, U and P that satisfy: A \u003d LUP, L is lower triangular, and U is\n * upper triangular and P is a permutation matrix. All matrices are\n * m\u0026times;m.\u003c/p\u003e\n * \u003cp\u003eAs shown by the presence of the P matrix, this decomposition is\n * implemented using partial pivoting.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Serializable version identifier. "
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
      "type": "field",
      "varNames": [
        "DEFAULT_TOO_SMALL"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Default bound to determine effective singularity in LU decomposition "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.decomposition.LUDecompositionImpl.LUDecompositionImpl(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 74,
      "end_line": 77,
      "comment": "\n     * Calculates the LU-decomposition of the given matrix. \n     * @param matrix The matrix to decompose.\n     * @exception InvalidMatrixException if matrix is not square\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.decomposition.LUDecompositionImpl.LUDecompositionImpl(org.apache.commons.math.linear.RealMatrix, double)",
      "begin_line": 86,
      "end_line": 167,
      "comment": "\n     * Calculates the LU-decomposition of the given matrix. \n     * @param matrix The matrix to decompose.\n     * @param singularityThreshold threshold (based on partial row norm)\n     * under which a matrix is considered singular\n     * @exception NonSquareMatrixException if matrix is not square\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 91,col 9)",
        "(line 93,col 9)-(line 93,col 50)",
        "(line 94,col 9)-(line 94,col 30)",
        "(line 95,col 9)-(line 95,col 27)",
        "(line 96,col 9)-(line 96,col 23)",
        "(line 97,col 9)-(line 97,col 23)",
        "(line 98,col 9)-(line 98,col 23)",
        "(line 101,col 9)-(line 103,col 9)",
        "(line 104,col 9)-(line 104,col 24)",
        "(line 105,col 9)-(line 105,col 25)",
        "(line 108,col 9)-(line 165,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.LUDecompositionImpl.getL()",
      "begin_line": 170,
      "end_line": 183,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 171,col 9)-(line 181,col 9)",
        "(line 182,col 9)-(line 182,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.LUDecompositionImpl.getU()",
      "begin_line": 186,
      "end_line": 198,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 187,col 9)-(line 196,col 9)",
        "(line 197,col 9)-(line 197,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.LUDecompositionImpl.getP()",
      "begin_line": 201,
      "end_line": 210,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 202,col 9)-(line 208,col 9)",
        "(line 209,col 9)-(line 209,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.LUDecompositionImpl.getPivot()",
      "begin_line": 213,
      "end_line": 215,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.LUDecompositionImpl.getDeterminant()",
      "begin_line": 218,
      "end_line": 229,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 219,col 9)-(line 228,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.LUDecompositionImpl.getSolver()",
      "begin_line": 232,
      "end_line": 234,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 47)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Solver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.decomposition.DecompositionSolver"
      ],
      "begin_line": 237,
      "end_line": 427,
      "comment": " Specialized solver. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 240,
      "end_line": 240,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "lu"
      ],
      "begin_line": 243,
      "end_line": 243,
      "comment": " Entries of LU decomposition. "
    },
    {
      "type": "field",
      "varNames": [
        "pivot"
      ],
      "begin_line": 246,
      "end_line": 246,
      "comment": " Pivot permutation associated with LU decomposition. "
    },
    {
      "type": "field",
      "varNames": [
        "singular"
      ],
      "begin_line": 249,
      "end_line": 249,
      "comment": " Singularity indicator. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.decomposition.LUDecompositionImpl.Solver.Solver(double[][], int[], boolean)",
      "begin_line": 257,
      "end_line": 261,
      "comment": "\n         * Build a solver from decomposed matrix.\n         * @param lu entries of LU decomposition\n         * @param pivot pivot permutation associated with LU decomposition\n         * @param singular singularity indicator\n         ",
      "child_ranges": [
        "(line 258,col 13)-(line 258,col 31)",
        "(line 259,col 13)-(line 259,col 34)",
        "(line 260,col 13)-(line 260,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.LUDecompositionImpl.Solver.isNonSingular()",
      "begin_line": 264,
      "end_line": 266,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 265,col 13)-(line 265,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.LUDecompositionImpl.Solver.solve(double[])",
      "begin_line": 269,
      "end_line": 306,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 272,col 13)-(line 272,col 39)",
        "(line 273,col 13)-(line 277,col 13)",
        "(line 278,col 13)-(line 280,col 13)",
        "(line 282,col 13)-(line 282,col 46)",
        "(line 285,col 13)-(line 287,col 13)",
        "(line 290,col 13)-(line 294,col 13)",
        "(line 297,col 13)-(line 302,col 13)",
        "(line 304,col 13)-(line 304,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.LUDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealVector)",
      "begin_line": 309,
      "end_line": 350,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 311,col 13)-(line 349,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.LUDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealVectorImpl)",
      "begin_line": 359,
      "end_line": 362,
      "comment": " Solve the linear equation A \u0026times; X \u003d B.\n         * \u003cp\u003eThe A matrix is implicit here. It is \u003c/p\u003e\n         * @param b right-hand side of the equation A \u0026times; X \u003d B\n         * @return a vector X such that A \u0026times; X \u003d B\n         * @exception IllegalArgumentException if matrices dimensions don\u0027t match\n         * @exception InvalidMatrixException if decomposed matrix is singular\n         ",
      "child_ranges": [
        "(line 361,col 13)-(line 361,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.LUDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 365,
      "end_line": 420,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 368,col 13)-(line 368,col 39)",
        "(line 369,col 13)-(line 373,col 13)",
        "(line 374,col 13)-(line 376,col 13)",
        "(line 378,col 13)-(line 378,col 53)",
        "(line 381,col 13)-(line 381,col 55)",
        "(line 382,col 13)-(line 388,col 13)",
        "(line 391,col 13)-(line 400,col 13)",
        "(line 403,col 13)-(line 416,col 13)",
        "(line 418,col 13)-(line 418,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.decomposition.LUDecompositionImpl.Solver.getInverse()",
      "begin_line": 423,
      "end_line": 425,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 424,col 13)-(line 424,col 77)"
      ]
    }
  ]
}