{
  "filepath": "/tmp/Math-96b/src/java/org/apache/commons/math/linear/LUDecompositionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LUDecompositionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.LUDecomposition"
      ],
      "begin_line": 32,
      "end_line": 394,
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
        "singularityThreshold"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Bound to determine effective singularity in LU decomposition "
    },
    {
      "type": "field",
      "varNames": [
        "m"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Size of the matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "lu"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " Entries of LU decomposition. "
    },
    {
      "type": "field",
      "varNames": [
        "pivot"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " Pivot permutation associated with LU decomposition "
    },
    {
      "type": "field",
      "varNames": [
        "parity"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Parity of the permutation associated with the LU decomposition "
    },
    {
      "type": "field",
      "varNames": [
        "singular"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Singularity indicator. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedL"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Cached value of L. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedU"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Cached value of U. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedP"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Cached value of P. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_TOO_SMALL"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Default bound to determine effective singularity in LU decomposition "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.LUDecompositionImpl(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 73,
      "end_line": 76,
      "comment": "\n     * Calculates the LU-decomposition of the given matrix. \n     * \n     * @param matrix The matrix to decompose.\n     * @exception InvalidMatrixException if matrix is not square\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.LUDecompositionImpl(org.apache.commons.math.linear.RealMatrix, double)",
      "begin_line": 86,
      "end_line": 102,
      "comment": "\n     * Calculates the LU-decomposition of the given matrix. \n     * \n     * @param matrix The matrix to decompose.\n     * @param singularityThreshold threshold (based on partial row norm)\n     * under which a matrix is considered singular\n     * @exception InvalidMatrixException if matrix is not square\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 90,col 9)",
        "(line 91,col 9)-(line 91,col 57)",
        "(line 92,col 9)-(line 92,col 40)",
        "(line 93,col 9)-(line 93,col 30)",
        "(line 94,col 9)-(line 94,col 27)",
        "(line 95,col 9)-(line 95,col 23)",
        "(line 96,col 9)-(line 96,col 23)",
        "(line 97,col 9)-(line 97,col 23)",
        "(line 100,col 9)-(line 100,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.getL()",
      "begin_line": 105,
      "end_line": 115,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 106,col 9)-(line 113,col 9)",
        "(line 114,col 9)-(line 114,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.getU()",
      "begin_line": 118,
      "end_line": 127,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 119,col 9)-(line 125,col 9)",
        "(line 126,col 9)-(line 126,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.getP()",
      "begin_line": 130,
      "end_line": 139,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 131,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 138,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.getPivot()",
      "begin_line": 142,
      "end_line": 144,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.isNonSingular()",
      "begin_line": 147,
      "end_line": 149,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.getDeterminant()",
      "begin_line": 152,
      "end_line": 162,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 153,col 9)-(line 161,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.solve(double[])",
      "begin_line": 165,
      "end_line": 199,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 168,col 9)-(line 170,col 9)",
        "(line 171,col 9)-(line 173,col 9)",
        "(line 175,col 9)-(line 175,col 42)",
        "(line 178,col 9)-(line 180,col 9)",
        "(line 183,col 9)-(line 187,col 9)",
        "(line 190,col 9)-(line 195,col 9)",
        "(line 197,col 9)-(line 197,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.solve(org.apache.commons.math.linear.RealVector)",
      "begin_line": 202,
      "end_line": 240,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 204,col 9)-(line 239,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.solve(org.apache.commons.math.linear.RealVectorImpl)",
      "begin_line": 249,
      "end_line": 252,
      "comment": " Solve the linear equation A \u0026times; X \u003d B.\n     * \u003cp\u003eThe A matrix is implicit here. It is \u003c/p\u003e\n     * @param b right-hand side of the equation A \u0026times; X \u003d B\n     * @return a vector X such that A \u0026times; X \u003d B\n     * @throws IllegalArgumentException if matrices dimensions don\u0027t match\n     * @throws InvalidMatrixException if decomposed matrix is singular\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.solve(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 255,
      "end_line": 306,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 257,col 9)-(line 259,col 9)",
        "(line 260,col 9)-(line 262,col 9)",
        "(line 264,col 9)-(line 264,col 49)",
        "(line 267,col 9)-(line 267,col 51)",
        "(line 268,col 9)-(line 274,col 9)",
        "(line 277,col 9)-(line 286,col 9)",
        "(line 289,col 9)-(line 302,col 9)",
        "(line 304,col 9)-(line 304,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.LUDecompositionImpl.luDecompose()",
      "begin_line": 324,
      "end_line": 392,
      "comment": "\n     * Computes a new\n     * \u003ca href\u003d\"http://www.math.gatech.edu/~bourbaki/math2601/Web-notes/2num.pdf\"\u003e\n     * LU decomposition\u003c/a\u003e for this matrix, storing the result for use by other methods.\n     * \u003cp\u003e\n     * \u003cstrong\u003eImplementation Note\u003c/strong\u003e:\u003cbr\u003e\n     * Uses \u003ca href\u003d\"http://www.damtp.cam.ac.uk/user/fdl/people/sd/lectures/nummeth98/linear.htm\"\u003e\n     * Crout\u0027s algorithm\u003c/a\u003e, with partial pivoting.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note\u003c/strong\u003e:\u003cbr\u003e\n     * This method should rarely be invoked directly. Its only use is\n     * to force recomputation of the LU decomposition when changes have been\n     * made to the underlying data using direct array references. Changes\n     * made using setXxx methods will trigger recomputation when needed\n     * automatically.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 329,col 9)",
        "(line 330,col 9)-(line 330,col 19)",
        "(line 331,col 9)-(line 331,col 25)",
        "(line 334,col 9)-(line 391,col 9)"
      ]
    }
  ]
}