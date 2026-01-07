{
  "filepath": "/tmp/Math-92b/src/java/org/apache/commons/math/linear/LUDecompositionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LUDecompositionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.LUDecomposition"
      ],
      "begin_line": 32,
      "end_line": 422,
      "comment": "\n * Calculates the LUP-decomposition of a square matrix.\n * \u003cp\u003eThe LUP-decomposition of a matrix A consists of three matrices\n * L, U and P that satisfy: A \u003d LUP, L is lower triangular, and U is\n * upper triangular and P is a permutation matrix. All matrices are\n * m\u0026times;m.\u003c/p\u003e\n * \u003cp\u003eAs shown by the presence of the P matrix, this decomposition is\n * implemented using partial pivoting.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "lu"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Entries of LU decomposition. "
    },
    {
      "type": "field",
      "varNames": [
        "pivot"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Pivot permutation associated with LU decomposition "
    },
    {
      "type": "field",
      "varNames": [
        "even"
      ],
      "begin_line": 44,
      "end_line": 44,
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
      "begin_line": 50,
      "end_line": 50,
      "comment": " Cached value of L. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedU"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Cached value of U. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedP"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Cached value of P. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_TOO_SMALL"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Default bound to determine effective singularity in LU decomposition "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.LUDecompositionImpl(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 66,
      "end_line": 69,
      "comment": "\n     * Calculates the LU-decomposition of the given matrix. \n     * @param matrix The matrix to decompose.\n     * @exception InvalidMatrixException if matrix is not square\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.LUDecompositionImpl(org.apache.commons.math.linear.RealMatrix, double)",
      "begin_line": 78,
      "end_line": 159,
      "comment": "\n     * Calculates the LU-decomposition of the given matrix. \n     * @param matrix The matrix to decompose.\n     * @param singularityThreshold threshold (based on partial row norm)\n     * under which a matrix is considered singular\n     * @exception InvalidMatrixException if matrix is not square\n     ",
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
        "(line 100,col 9)-(line 157,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.getL()",
      "begin_line": 162,
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
      "end_line": 211,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.getDeterminant()",
      "begin_line": 214,
      "end_line": 225,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 215,col 9)-(line 224,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.getSolver()",
      "begin_line": 228,
      "end_line": 230,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 47)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Solver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.DecompositionSolver"
      ],
      "begin_line": 233,
      "end_line": 420,
      "comment": " Specialized solver. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 236,
      "end_line": 236,
      "comment": " Serializable version identifier. "
    },
    {
      "type": "field",
      "varNames": [
        "lu"
      ],
      "begin_line": 239,
      "end_line": 239,
      "comment": " Entries of LU decomposition. "
    },
    {
      "type": "field",
      "varNames": [
        "pivot"
      ],
      "begin_line": 242,
      "end_line": 242,
      "comment": " Pivot permutation associated with LU decomposition. "
    },
    {
      "type": "field",
      "varNames": [
        "singular"
      ],
      "begin_line": 245,
      "end_line": 245,
      "comment": " Singularity indicator. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.Solver.Solver(double[][], int[], boolean)",
      "begin_line": 253,
      "end_line": 257,
      "comment": "\n         * Build a solver from decomposed matrix.\n         * @param lu entries of LU decomposition\n         * @param pivot pivot permutation associated with LU decomposition\n         * @param singular singularity indicator\n         ",
      "child_ranges": [
        "(line 254,col 13)-(line 254,col 31)",
        "(line 255,col 13)-(line 255,col 34)",
        "(line 256,col 13)-(line 256,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.Solver.isNonSingular()",
      "begin_line": 260,
      "end_line": 262,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 261,col 13)-(line 261,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.Solver.solve(double[])",
      "begin_line": 265,
      "end_line": 300,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 268,col 13)-(line 268,col 39)",
        "(line 269,col 13)-(line 271,col 13)",
        "(line 272,col 13)-(line 274,col 13)",
        "(line 276,col 13)-(line 276,col 46)",
        "(line 279,col 13)-(line 281,col 13)",
        "(line 284,col 13)-(line 288,col 13)",
        "(line 291,col 13)-(line 296,col 13)",
        "(line 298,col 13)-(line 298,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealVector)",
      "begin_line": 303,
      "end_line": 342,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 305,col 13)-(line 341,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealVectorImpl)",
      "begin_line": 353,
      "end_line": 356,
      "comment": " Solve the linear equation A \u0026times; X \u003d B.\n         * \u003cp\u003eThe A matrix is implicit here. It is \u003c/p\u003e\n         * @param b right-hand side of the equation A \u0026times; X \u003d B\n         * @return a vector X such that A \u0026times; X \u003d B\n         * @exception IllegalStateException if {@link #decompose(RealMatrix) decompose}\n         * has not been called\n         * @exception IllegalArgumentException if matrices dimensions don\u0027t match\n         * @exception InvalidMatrixException if decomposed matrix is singular\n         ",
      "child_ranges": [
        "(line 355,col 13)-(line 355,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 359,
      "end_line": 412,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 362,col 13)-(line 362,col 39)",
        "(line 363,col 13)-(line 365,col 13)",
        "(line 366,col 13)-(line 368,col 13)",
        "(line 370,col 13)-(line 370,col 53)",
        "(line 373,col 13)-(line 373,col 55)",
        "(line 374,col 13)-(line 380,col 13)",
        "(line 383,col 13)-(line 392,col 13)",
        "(line 395,col 13)-(line 408,col 13)",
        "(line 410,col 13)-(line 410,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.Solver.getInverse()",
      "begin_line": 415,
      "end_line": 418,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 417,col 13)-(line 417,col 77)"
      ]
    }
  ]
}