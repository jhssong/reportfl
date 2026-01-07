{
  "filepath": "/tmp/Math-45b/src/main/java/org/apache/commons/math/linear/SingularValueDecomposition.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SingularValueDecomposition",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 54,
      "end_line": 733,
      "comment": "\n * Calculates the compact Singular Value Decomposition of a matrix.\n * \u003cp\u003e\n * The Singular Value Decomposition of matrix A is a set of three matrices: U,\n * \u0026Sigma; and V such that A \u003d U \u0026times; \u0026Sigma; \u0026times; V\u003csup\u003eT\u003c/sup\u003e. Let A be\n * a m \u0026times; n matrix, then U is a m \u0026times; p orthogonal matrix, \u0026Sigma; is a\n * p \u0026times; p diagonal matrix with positive or null elements, V is a p \u0026times;\n * n orthogonal matrix (hence V\u003csup\u003eT\u003c/sup\u003e is also orthogonal) where\n * p\u003dmin(m,n).\n * \u003c/p\u003e\n * \u003cp\u003eThis class is similar to the class with similar name from the\n * \u003ca href\u003d\"http://math.nist.gov/javanumerics/jama/\"\u003eJAMA\u003c/a\u003e library, with the\n * following changes:\u003c/p\u003e\n * \u003cul\u003e\n *   \u003cli\u003ethe {@code norm2} method which has been renamed as {@link #getNorm()\n *   getNorm},\u003c/li\u003e\n *   \u003cli\u003ethe {@code cond} method which has been renamed as {@link\n *   #getConditionNumber() getConditionNumber},\u003c/li\u003e\n *   \u003cli\u003ethe {@code rank} method which has been renamed as {@link #getRank()\n *   getRank},\u003c/li\u003e\n *   \u003cli\u003ea {@link #getUT() getUT} method has been added,\u003c/li\u003e\n *   \u003cli\u003ea {@link #getVT() getVT} method has been added,\u003c/li\u003e\n *   \u003cli\u003ea {@link #getSolver() getSolver} method has been added,\u003c/li\u003e\n *   \u003cli\u003ea {@link #getCovariance(double) getCovariance} method has been added.\u003c/li\u003e\n * \u003c/ul\u003e\n * @see \u003ca href\u003d\"http://mathworld.wolfram.com/SingularValueDecomposition.html\"\u003eMathWorld\u003c/a\u003e\n * @see \u003ca href\u003d\"http://en.wikipedia.org/wiki/Singular_value_decomposition\"\u003eWikipedia\u003c/a\u003e\n * @version $Id$\n * @since 2.0 (changed to concrete class in 3.0)\n "
    },
    {
      "type": "field",
      "varNames": [
        "EPS"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Relative threshold for small singular values. "
    },
    {
      "type": "field",
      "varNames": [
        "TINY"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Absolute threshold for small singular values. "
    },
    {
      "type": "field",
      "varNames": [
        "singularValues"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Computed singular values. "
    },
    {
      "type": "field",
      "varNames": [
        "m"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " max(row dimension, column dimension). "
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " min(row dimension, column dimension). "
    },
    {
      "type": "field",
      "varNames": [
        "transposed"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " Indicator for transposed matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedU"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " Cached value of U matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedUt"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Cached value of transposed U matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedS"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " Cached value of S (diagonal) matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedV"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " Cached value of V matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedVt"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Cached value of transposed V matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "tol"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": "\n     * Tolerance value for small singular values, calculated once we have\n     * populated \"singularValues\".\n     *"
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SingularValueDecomposition.SingularValueDecomposition(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 88,
      "end_line": 477,
      "comment": "\n     * Calculates the compact Singular Value Decomposition of the given matrix.\n     *\n     * @param matrix Matrix to decompose.\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 27)",
        "(line 92,col 9)-(line 102,col 9)",
        "(line 104,col 9)-(line 104,col 39)",
        "(line 105,col 9)-(line 105,col 46)",
        "(line 106,col 9)-(line 106,col 46)",
        "(line 107,col 9)-(line 107,col 41)",
        "(line 108,col 9)-(line 108,col 44)",
        "(line 111,col 9)-(line 111,col 47)",
        "(line 112,col 9)-(line 112,col 47)",
        "(line 113,col 9)-(line 200,col 9)",
        "(line 202,col 9)-(line 202,col 18)",
        "(line 203,col 9)-(line 205,col 9)",
        "(line 206,col 9)-(line 208,col 9)",
        "(line 209,col 9)-(line 211,col 9)",
        "(line 212,col 9)-(line 212,col 21)",
        "(line 215,col 9)-(line 220,col 9)",
        "(line 221,col 9)-(line 246,col 9)",
        "(line 249,col 9)-(line 267,col 9)",
        "(line 270,col 9)-(line 270,col 29)",
        "(line 271,col 9)-(line 271,col 21)",
        "(line 272,col 9)-(line 464,col 9)",
        "(line 467,col 9)-(line 468,col 62)",
        "(line 470,col 9)-(line 476,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecomposition.getU()",
      "begin_line": 485,
      "end_line": 489,
      "comment": "\n     * Returns the matrix U of the decomposition.\n     * \u003cp\u003eU is an orthogonal matrix, i.e. its transpose is also its inverse.\u003c/p\u003e\n     * @return the U matrix\n     * @see #getUT()\n     ",
      "child_ranges": [
        "(line 487,col 9)-(line 487,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecomposition.getUT()",
      "begin_line": 497,
      "end_line": 503,
      "comment": "\n     * Returns the transpose of the matrix U of the decomposition.\n     * \u003cp\u003eU is an orthogonal matrix, i.e. its transpose is also its inverse.\u003c/p\u003e\n     * @return the U matrix (or null if decomposed matrix is singular)\n     * @see #getU()\n     ",
      "child_ranges": [
        "(line 498,col 9)-(line 500,col 9)",
        "(line 502,col 9)-(line 502,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecomposition.getS()",
      "begin_line": 511,
      "end_line": 517,
      "comment": "\n     * Returns the diagonal matrix \u0026Sigma; of the decomposition.\n     * \u003cp\u003e\u0026Sigma; is a diagonal matrix. The singular values are provided in\n     * non-increasing order, for compatibility with Jama.\u003c/p\u003e\n     * @return the \u0026Sigma; matrix\n     ",
      "child_ranges": [
        "(line 512,col 9)-(line 515,col 9)",
        "(line 516,col 9)-(line 516,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecomposition.getSingularValues()",
      "begin_line": 525,
      "end_line": 527,
      "comment": "\n     * Returns the diagonal elements of the matrix \u0026Sigma; of the decomposition.\n     * \u003cp\u003eThe singular values are provided in non-increasing order, for\n     * compatibility with Jama.\u003c/p\u003e\n     * @return the diagonal elements of the \u0026Sigma; matrix\n     ",
      "child_ranges": [
        "(line 526,col 9)-(line 526,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecomposition.getV()",
      "begin_line": 535,
      "end_line": 538,
      "comment": "\n     * Returns the matrix V of the decomposition.\n     * \u003cp\u003eV is an orthogonal matrix, i.e. its transpose is also its inverse.\u003c/p\u003e\n     * @return the V matrix (or null if decomposed matrix is singular)\n     * @see #getVT()\n     ",
      "child_ranges": [
        "(line 537,col 9)-(line 537,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecomposition.getVT()",
      "begin_line": 546,
      "end_line": 552,
      "comment": "\n     * Returns the transpose of the matrix V of the decomposition.\n     * \u003cp\u003eV is an orthogonal matrix, i.e. its transpose is also its inverse.\u003c/p\u003e\n     * @return the V matrix (or null if decomposed matrix is singular)\n     * @see #getV()\n     ",
      "child_ranges": [
        "(line 547,col 9)-(line 549,col 9)",
        "(line 551,col 9)-(line 551,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecomposition.getCovariance(double)",
      "begin_line": 565,
      "end_line": 591,
      "comment": "\n     * Returns the n \u0026times; n covariance matrix.\n     * \u003cp\u003eThe covariance matrix is V \u0026times; J \u0026times; V\u003csup\u003eT\u003c/sup\u003e\n     * where J is the diagonal matrix of the inverse of the squares of\n     * the singular values.\u003c/p\u003e\n     * @param minSingularValue value below which singular values are ignored\n     * (a 0 or negative value implies all singular value will be used)\n     * @return covariance matrix\n     * @exception IllegalArgumentException if minSingularValue is larger than\n     * the largest singular value, meaning all singular values are ignored\n     ",
      "child_ranges": [
        "(line 567,col 9)-(line 567,col 44)",
        "(line 568,col 9)-(line 568,col 26)",
        "(line 569,col 9)-(line 572,col 9)",
        "(line 574,col 9)-(line 577,col 9)",
        "(line 579,col 9)-(line 579,col 57)",
        "(line 580,col 9)-(line 587,col 39)",
        "(line 589,col 9)-(line 589,col 62)",
        "(line 590,col 9)-(line 590,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecomposition.Anonymous-e9c596f8-81d7-49f3-bb98-ff9ff8c8863e.visit(int, int, double)",
      "begin_line": 582,
      "end_line": 586,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 585,col 17)-(line 585,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecomposition.getNorm()",
      "begin_line": 600,
      "end_line": 602,
      "comment": "\n     * Returns the L\u003csub\u003e2\u003c/sub\u003e norm of the matrix.\n     * \u003cp\u003eThe L\u003csub\u003e2\u003c/sub\u003e norm is max(|A \u0026times; u|\u003csub\u003e2\u003c/sub\u003e /\n     * |u|\u003csub\u003e2\u003c/sub\u003e), where |.|\u003csub\u003e2\u003c/sub\u003e denotes the vectorial 2-norm\n     * (i.e. the traditional euclidian norm).\u003c/p\u003e\n     * @return norm\n     ",
      "child_ranges": [
        "(line 601,col 9)-(line 601,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecomposition.getConditionNumber()",
      "begin_line": 608,
      "end_line": 610,
      "comment": "\n     * Return the condition number of the matrix.\n     * @return condition number of the matrix\n     ",
      "child_ranges": [
        "(line 609,col 9)-(line 609,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecomposition.getInverseConditionNumber()",
      "begin_line": 619,
      "end_line": 621,
      "comment": "\n     * Computes the inverse of the condition number.\n     * In cases of rank deficiency, the {@link #getConditionNumber() condition\n     * number} will become undefined.\n     *\n     * @return the inverse of the condition number.\n     ",
      "child_ranges": [
        "(line 620,col 9)-(line 620,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecomposition.getRank()",
      "begin_line": 631,
      "end_line": 639,
      "comment": "\n     * Return the effective numerical matrix rank.\n     * \u003cp\u003eThe effective numerical rank is the number of non-negligible\n     * singular values. The threshold used to identify non-negligible\n     * terms is max(m,n) \u0026times; ulp(s\u003csub\u003e1\u003c/sub\u003e) where ulp(s\u003csub\u003e1\u003c/sub\u003e)\n     * is the least significant bit of the largest singular value.\u003c/p\u003e\n     * @return effective numerical matrix rank\n     ",
      "child_ranges": [
        "(line 632,col 9)-(line 632,col 18)",
        "(line 633,col 9)-(line 637,col 9)",
        "(line 638,col 9)-(line 638,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecomposition.getSolver()",
      "begin_line": 645,
      "end_line": 647,
      "comment": "\n     * Get a solver for finding the A \u0026times; X \u003d B solution in least square sense.\n     * @return a solver\n     ",
      "child_ranges": [
        "(line 646,col 9)-(line 646,col 80)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Solver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.DecompositionSolver"
      ],
      "begin_line": 650,
      "end_line": 732,
      "comment": " Specialized solver. "
    },
    {
      "type": "field",
      "varNames": [
        "pseudoInverse"
      ],
      "begin_line": 652,
      "end_line": 652,
      "comment": " Pseudo-inverse of the initial matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "nonSingular"
      ],
      "begin_line": 654,
      "end_line": 654,
      "comment": " Singularity indicator. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SingularValueDecomposition.Solver.Solver(double[], org.apache.commons.math.linear.RealMatrix, org.apache.commons.math.linear.RealMatrix, boolean, double)",
      "begin_line": 665,
      "end_line": 682,
      "comment": "\n         * Build a solver from decomposed matrix.\n         *\n         * @param singularValues Singular values.\n         * @param uT U\u003csup\u003eT\u003c/sup\u003e matrix of the decomposition.\n         * @param v V matrix of the decomposition.\n         * @param nonSingular Singularity indicator.\n         * @param tol tolerance for singular values\n         ",
      "child_ranges": [
        "(line 667,col 13)-(line 667,col 48)",
        "(line 668,col 13)-(line 679,col 13)",
        "(line 680,col 13)-(line 680,col 77)",
        "(line 681,col 13)-(line 681,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecomposition.Solver.solve(org.apache.commons.math.linear.RealVector)",
      "begin_line": 695,
      "end_line": 697,
      "comment": "\n         * Solve the linear equation A \u0026times; X \u003d B in least square sense.\n         * \u003cp\u003e\n         * The m\u0026times;n matrix A may not be square, the solution X is such that\n         * ||A \u0026times; X - B|| is minimal.\n         * \u003c/p\u003e\n         * @param b Right-hand side of the equation A \u0026times; X \u003d B\n         * @return a vector X that minimizes the two norm of A \u0026times; X - B\n         * @throws org.apache.commons.math.exception.DimensionMismatchException\n         * if the matrices dimensions do not match.\n         ",
      "child_ranges": [
        "(line 696,col 13)-(line 696,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecomposition.Solver.solve(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 711,
      "end_line": 713,
      "comment": "\n         * Solve the linear equation A \u0026times; X \u003d B in least square sense.\n         * \u003cp\u003e\n         * The m\u0026times;n matrix A may not be square, the solution X is such that\n         * ||A \u0026times; X - B|| is minimal.\n         * \u003c/p\u003e\n         *\n         * @param b Right-hand side of the equation A \u0026times; X \u003d B\n         * @return a matrix X that minimizes the two norm of A \u0026times; X - B\n         * @throws org.apache.commons.math.exception.DimensionMismatchException\n         * if the matrices dimensions do not match.\n         ",
      "child_ranges": [
        "(line 712,col 13)-(line 712,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecomposition.Solver.isNonSingular()",
      "begin_line": 720,
      "end_line": 722,
      "comment": "\n         * Check if the decomposed matrix is non-singular.\n         *\n         * @return {@code true} if the decomposed matrix is non-singular.\n         ",
      "child_ranges": [
        "(line 721,col 13)-(line 721,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecomposition.Solver.getInverse()",
      "begin_line": 729,
      "end_line": 731,
      "comment": "\n         * Get the pseudo-inverse of the decomposed matrix.\n         *\n         * @return the inverse matrix.\n         ",
      "child_ranges": [
        "(line 730,col 13)-(line 730,col 33)"
      ]
    }
  ]
}