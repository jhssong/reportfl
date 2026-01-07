{
  "filepath": "/tmp/Math-41b/src/main/java/org/apache/commons/math/linear/PivotingQRDecomposition.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PivotingQRDecomposition",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 29,
      "end_line": 420,
      "comment": "\n *\n * @author gregsterijevski\n "
    },
    {
      "type": "field",
      "varNames": [
        "qr"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "rDiag"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " The diagonal elements of R. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedQ"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Cached value of Q. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedQT"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Cached value of QT. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedR"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Cached value of R. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedH"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Cached value of H. "
    },
    {
      "type": "field",
      "varNames": [
        "permutation"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " permutation info "
    },
    {
      "type": "field",
      "varNames": [
        "rank"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " the rank *"
    },
    {
      "type": "field",
      "varNames": [
        "beta"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " vector of column multipliers "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.PivotingQRDecomposition.isSingular()",
      "begin_line": 49,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.PivotingQRDecomposition.getRank()",
      "begin_line": 53,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.PivotingQRDecomposition.getOrder()",
      "begin_line": 57,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.PivotingQRDecomposition.PivotingQRDecomposition(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 61,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.PivotingQRDecomposition.PivotingQRDecomposition(org.apache.commons.math.linear.RealMatrix, boolean)",
      "begin_line": 65,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.PivotingQRDecomposition.PivotingQRDecomposition(org.apache.commons.math.linear.RealMatrix, double, boolean)",
      "begin_line": 69,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 50)",
        "(line 72,col 9)-(line 72,col 53)",
        "(line 73,col 9)-(line 73,col 30)",
        "(line 74,col 9)-(line 74,col 33)",
        "(line 76,col 9)-(line 76,col 37)",
        "(line 77,col 9)-(line 77,col 41)",
        "(line 78,col 9)-(line 78,col 23)",
        "(line 79,col 9)-(line 79,col 24)",
        "(line 80,col 9)-(line 80,col 23)",
        "(line 81,col 9)-(line 81,col 23)",
        "(line 84,col 9)-(line 86,col 9)",
        "(line 88,col 9)-(line 150,col 9)",
        "(line 151,col 9)-(line 151,col 20)",
        "(line 152,col 9)-(line 152,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.PivotingQRDecomposition.getQ()",
      "begin_line": 160,
      "end_line": 165,
      "comment": "\n     * Returns the matrix Q of the decomposition.\n     * \u003cp\u003eQ is an orthogonal matrix\u003c/p\u003e\n     * @return the Q matrix\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 164,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.PivotingQRDecomposition.getQT()",
      "begin_line": 172,
      "end_line": 208,
      "comment": "\n     * Returns the transpose of the matrix Q of the decomposition.\n     * \u003cp\u003eQ is an orthogonal matrix\u003c/p\u003e\n     * @return the Q matrix\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 205,col 9)",
        "(line 207,col 9)-(line 207,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.PivotingQRDecomposition.getR()",
      "begin_line": 215,
      "end_line": 231,
      "comment": "\n     * Returns the matrix R of the decomposition.\n     * \u003cp\u003eR is an upper-triangular matrix\u003c/p\u003e\n     * @return the R matrix\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 228,col 9)",
        "(line 230,col 9)-(line 230,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.PivotingQRDecomposition.getH()",
      "begin_line": 233,
      "end_line": 247,
      "comment": "",
      "child_ranges": [
        "(line 234,col 9)-(line 244,col 9)",
        "(line 246,col 9)-(line 246,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.PivotingQRDecomposition.getPermutationMatrix()",
      "begin_line": 249,
      "end_line": 255,
      "comment": "",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 81)",
        "(line 251,col 9)-(line 253,col 9)",
        "(line 254,col 9)-(line 254,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.PivotingQRDecomposition.getSolver()",
      "begin_line": 257,
      "end_line": 259,
      "comment": "",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 56)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Solver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.DecompositionSolver"
      ],
      "begin_line": 262,
      "end_line": 419,
      "comment": " Specialized solver. "
    },
    {
      "type": "field",
      "varNames": [
        "qr"
      ],
      "begin_line": 270,
      "end_line": 270,
      "comment": "\n         * A packed TRANSPOSED representation of the QR decomposition.\n         * \u003cp\u003eThe elements BELOW the diagonal are the elements of the UPPER triangular\n         * matrix R, and the rows ABOVE the diagonal are the Householder reflector vectors\n         * from which an explicit form of Q can be recomputed if desired.\u003c/p\u003e\n         "
    },
    {
      "type": "field",
      "varNames": [
        "rDiag"
      ],
      "begin_line": 272,
      "end_line": 272,
      "comment": " The diagonal elements of R. "
    },
    {
      "type": "field",
      "varNames": [
        "rank"
      ],
      "begin_line": 274,
      "end_line": 274,
      "comment": " The rank of the matrix      "
    },
    {
      "type": "field",
      "varNames": [
        "perm"
      ],
      "begin_line": 276,
      "end_line": 276,
      "comment": " The permutation matrix      "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.PivotingQRDecomposition.Solver.Solver(double[][], double[], int[], int)",
      "begin_line": 283,
      "end_line": 288,
      "comment": "\n         * Build a solver from decomposed matrix.\n         * @param qrt packed TRANSPOSED representation of the QR decomposition\n         * @param rDiag diagonal elements of R\n         ",
      "child_ranges": [
        "(line 284,col 13)-(line 284,col 25)",
        "(line 285,col 13)-(line 285,col 31)",
        "(line 286,col 13)-(line 286,col 29)",
        "(line 287,col 13)-(line 287,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.PivotingQRDecomposition.Solver.isNonSingular()",
      "begin_line": 291,
      "end_line": 297,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 292,col 13)-(line 296,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.PivotingQRDecomposition.Solver.solve(org.apache.commons.math.linear.RealVector)",
      "begin_line": 300,
      "end_line": 337,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 301,col 13)-(line 301,col 39)",
        "(line 302,col 13)-(line 302,col 36)",
        "(line 303,col 13)-(line 305,col 13)",
        "(line 306,col 13)-(line 308,col 13)",
        "(line 310,col 13)-(line 310,col 45)",
        "(line 311,col 13)-(line 311,col 43)",
        "(line 314,col 13)-(line 324,col 13)",
        "(line 326,col 13)-(line 335,col 13)",
        "(line 336,col 13)-(line 336,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.PivotingQRDecomposition.Solver.solve(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 340,
      "end_line": 413,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 341,col 13)-(line 341,col 42)",
        "(line 342,col 13)-(line 342,col 39)",
        "(line 343,col 13)-(line 345,col 13)",
        "(line 346,col 13)-(line 348,col 13)",
        "(line 350,col 13)-(line 350,col 55)",
        "(line 351,col 13)-(line 351,col 61)",
        "(line 352,col 13)-(line 352,col 70)",
        "(line 353,col 13)-(line 353,col 89)",
        "(line 354,col 13)-(line 354,col 76)",
        "(line 355,col 13)-(line 355,col 57)",
        "(line 357,col 13)-(line 410,col 13)",
        "(line 412,col 13)-(line 412,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.PivotingQRDecomposition.Solver.getInverse()",
      "begin_line": 416,
      "end_line": 418,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 417,col 13)-(line 417,col 77)"
      ]
    }
  ]
}