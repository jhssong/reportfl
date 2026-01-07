{
  "filepath": "/tmp/Math-95b/src/java/org/apache/commons/math/linear/LUDecompositionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LUDecompositionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.LUDecomposition"
      ],
      "begin_line": 32,
      "end_line": 429,
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
        "parity"
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
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.LUDecompositionImpl()",
      "begin_line": 72,
      "end_line": 73,
      "comment": "\n     * Build a new instance.\n     * \u003cp\u003eNote that either {@link #decompose(RealMatrix)} or\n     * {@link #decompose(RealMatrix, double)} \u003cstrong\u003emust\u003c/strong\u003e be called\n     * before any of the {@link #getP()}, {@link #getPivot()}, {@link #getL()},\n     * {@link #getU()}, {@link #getDeterminant()}, {@link #isNonSingular()},\n     * {@link #solve(double[])}, {@link #solve(RealMatrix)}, {@link #solve(RealVector)}\n     * or {@link #solve(RealVectorImpl)} methods can be called.\u003c/p\u003e\n     * @see #decompose(RealMatrix)\n     * @see #decompose(RealMatrix, double)\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.LUDecompositionImpl(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 82,
      "end_line": 85,
      "comment": "\n     * Calculates the LU-decomposition of the given matrix. \n     * \u003cp\u003eCalling this constructor is equivalent to first call the no-arguments\n     * constructor and then call {@link #decompose(RealMatrix)}.\u003c/p\u003e\n     * @param matrix The matrix to decompose.\n     * @exception InvalidMatrixException if matrix is not square\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.LUDecompositionImpl(org.apache.commons.math.linear.RealMatrix, double)",
      "begin_line": 96,
      "end_line": 99,
      "comment": "\n     * Calculates the LU-decomposition of the given matrix. \n     * \u003cp\u003eCalling this constructor is equivalent to first call the no-arguments\n     * constructor and then call {@link #decompose(RealMatrix, double)}.\u003c/p\u003e\n     * @param matrix The matrix to decompose.\n     * @param singularityThreshold threshold (based on partial row norm)\n     * under which a matrix is considered singular\n     * @exception InvalidMatrixException if matrix is not square\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.decompose(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 102,
      "end_line": 105,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.decompose(org.apache.commons.math.linear.RealMatrix, double)",
      "begin_line": 108,
      "end_line": 187,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 110,col 9)-(line 112,col 9)",
        "(line 113,col 9)-(line 113,col 50)",
        "(line 114,col 9)-(line 114,col 30)",
        "(line 115,col 9)-(line 115,col 27)",
        "(line 116,col 9)-(line 116,col 23)",
        "(line 117,col 9)-(line 117,col 23)",
        "(line 118,col 9)-(line 118,col 23)",
        "(line 121,col 9)-(line 123,col 9)",
        "(line 124,col 9)-(line 124,col 19)",
        "(line 125,col 9)-(line 125,col 25)",
        "(line 128,col 9)-(line 185,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.getL()",
      "begin_line": 190,
      "end_line": 203,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 26)",
        "(line 193,col 9)-(line 201,col 9)",
        "(line 202,col 9)-(line 202,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.getU()",
      "begin_line": 206,
      "end_line": 218,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 26)",
        "(line 209,col 9)-(line 216,col 9)",
        "(line 217,col 9)-(line 217,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.getP()",
      "begin_line": 221,
      "end_line": 233,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 26)",
        "(line 224,col 9)-(line 231,col 9)",
        "(line 232,col 9)-(line 232,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.getPivot()",
      "begin_line": 236,
      "end_line": 240,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 26)",
        "(line 239,col 9)-(line 239,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.isNonSingular()",
      "begin_line": 243,
      "end_line": 247,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 26)",
        "(line 246,col 9)-(line 246,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.getDeterminant()",
      "begin_line": 250,
      "end_line": 263,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 26)",
        "(line 253,col 9)-(line 262,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.solve(double[])",
      "begin_line": 266,
      "end_line": 302,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 26)",
        "(line 270,col 9)-(line 270,col 35)",
        "(line 271,col 9)-(line 273,col 9)",
        "(line 274,col 9)-(line 276,col 9)",
        "(line 278,col 9)-(line 278,col 42)",
        "(line 281,col 9)-(line 283,col 9)",
        "(line 286,col 9)-(line 290,col 9)",
        "(line 293,col 9)-(line 298,col 9)",
        "(line 300,col 9)-(line 300,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.solve(org.apache.commons.math.linear.RealVector)",
      "begin_line": 305,
      "end_line": 345,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 307,col 9)-(line 344,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.solve(org.apache.commons.math.linear.RealVectorImpl)",
      "begin_line": 354,
      "end_line": 357,
      "comment": " Solve the linear equation A \u0026times; X \u003d B.\n     * \u003cp\u003eThe A matrix is implicit here. It is \u003c/p\u003e\n     * @param b right-hand side of the equation A \u0026times; X \u003d B\n     * @return a vector X such that A \u0026times; X \u003d B\n     * @throws IllegalArgumentException if matrices dimensions don\u0027t match\n     * @throws InvalidMatrixException if decomposed matrix is singular\n     ",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.solve(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 360,
      "end_line": 414,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 363,col 9)-(line 363,col 26)",
        "(line 364,col 9)-(line 364,col 35)",
        "(line 365,col 9)-(line 367,col 9)",
        "(line 368,col 9)-(line 370,col 9)",
        "(line 372,col 9)-(line 372,col 49)",
        "(line 375,col 9)-(line 375,col 51)",
        "(line 376,col 9)-(line 382,col 9)",
        "(line 385,col 9)-(line 394,col 9)",
        "(line 397,col 9)-(line 410,col 9)",
        "(line 412,col 9)-(line 412,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.checkDecomposed()",
      "begin_line": 422,
      "end_line": 427,
      "comment": "\n     * Check if either {@link #decompose(RealMatrix)} or {@link\n     * #decompose(RealMatrix, double) has been called.\n     * @exception IllegalStateException if {@link #decompose(RealMatrix) decompose}\n     * has not been called\n     ",
      "child_ranges": [
        "(line 424,col 9)-(line 426,col 9)"
      ]
    }
  ]
}