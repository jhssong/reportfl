{
  "filepath": "/tmp/Math-33b/src/main/java/org/apache/commons/math3/linear/SingularValueDecomposition.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SingularValueDecomposition",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 54,
      "end_line": 736,
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
      "signature": "org.apache.commons.math3.linear.SingularValueDecomposition.SingularValueDecomposition(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 88,
      "end_line": 480,
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
        "(line 272,col 9)-(line 467,col 9)",
        "(line 470,col 9)-(line 471,col 62)",
        "(line 473,col 9)-(line 479,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SingularValueDecomposition.getU()",
      "begin_line": 488,
      "end_line": 492,
      "comment": "\n     * Returns the matrix U of the decomposition.\n     * \u003cp\u003eU is an orthogonal matrix, i.e. its transpose is also its inverse.\u003c/p\u003e\n     * @return the U matrix\n     * @see #getUT()\n     ",
      "child_ranges": [
        "(line 490,col 9)-(line 490,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SingularValueDecomposition.getUT()",
      "begin_line": 500,
      "end_line": 506,
      "comment": "\n     * Returns the transpose of the matrix U of the decomposition.\n     * \u003cp\u003eU is an orthogonal matrix, i.e. its transpose is also its inverse.\u003c/p\u003e\n     * @return the U matrix (or null if decomposed matrix is singular)\n     * @see #getU()\n     ",
      "child_ranges": [
        "(line 501,col 9)-(line 503,col 9)",
        "(line 505,col 9)-(line 505,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SingularValueDecomposition.getS()",
      "begin_line": 514,
      "end_line": 520,
      "comment": "\n     * Returns the diagonal matrix \u0026Sigma; of the decomposition.\n     * \u003cp\u003e\u0026Sigma; is a diagonal matrix. The singular values are provided in\n     * non-increasing order, for compatibility with Jama.\u003c/p\u003e\n     * @return the \u0026Sigma; matrix\n     ",
      "child_ranges": [
        "(line 515,col 9)-(line 518,col 9)",
        "(line 519,col 9)-(line 519,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SingularValueDecomposition.getSingularValues()",
      "begin_line": 528,
      "end_line": 530,
      "comment": "\n     * Returns the diagonal elements of the matrix \u0026Sigma; of the decomposition.\n     * \u003cp\u003eThe singular values are provided in non-increasing order, for\n     * compatibility with Jama.\u003c/p\u003e\n     * @return the diagonal elements of the \u0026Sigma; matrix\n     ",
      "child_ranges": [
        "(line 529,col 9)-(line 529,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SingularValueDecomposition.getV()",
      "begin_line": 538,
      "end_line": 541,
      "comment": "\n     * Returns the matrix V of the decomposition.\n     * \u003cp\u003eV is an orthogonal matrix, i.e. its transpose is also its inverse.\u003c/p\u003e\n     * @return the V matrix (or null if decomposed matrix is singular)\n     * @see #getVT()\n     ",
      "child_ranges": [
        "(line 540,col 9)-(line 540,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SingularValueDecomposition.getVT()",
      "begin_line": 549,
      "end_line": 555,
      "comment": "\n     * Returns the transpose of the matrix V of the decomposition.\n     * \u003cp\u003eV is an orthogonal matrix, i.e. its transpose is also its inverse.\u003c/p\u003e\n     * @return the V matrix (or null if decomposed matrix is singular)\n     * @see #getV()\n     ",
      "child_ranges": [
        "(line 550,col 9)-(line 552,col 9)",
        "(line 554,col 9)-(line 554,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SingularValueDecomposition.getCovariance(double)",
      "begin_line": 568,
      "end_line": 594,
      "comment": "\n     * Returns the n \u0026times; n covariance matrix.\n     * \u003cp\u003eThe covariance matrix is V \u0026times; J \u0026times; V\u003csup\u003eT\u003c/sup\u003e\n     * where J is the diagonal matrix of the inverse of the squares of\n     * the singular values.\u003c/p\u003e\n     * @param minSingularValue value below which singular values are ignored\n     * (a 0 or negative value implies all singular value will be used)\n     * @return covariance matrix\n     * @exception IllegalArgumentException if minSingularValue is larger than\n     * the largest singular value, meaning all singular values are ignored\n     ",
      "child_ranges": [
        "(line 570,col 9)-(line 570,col 44)",
        "(line 571,col 9)-(line 571,col 26)",
        "(line 572,col 9)-(line 575,col 9)",
        "(line 577,col 9)-(line 580,col 9)",
        "(line 582,col 9)-(line 582,col 57)",
        "(line 583,col 9)-(line 590,col 39)",
        "(line 592,col 9)-(line 592,col 62)",
        "(line 593,col 9)-(line 593,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SingularValueDecomposition.Anonymous-4abcc63d-fdc3-41f0-ad9e-8ab9bb5c641d.visit(int, int, double)",
      "begin_line": 585,
      "end_line": 589,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 588,col 17)-(line 588,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SingularValueDecomposition.getNorm()",
      "begin_line": 603,
      "end_line": 605,
      "comment": "\n     * Returns the L\u003csub\u003e2\u003c/sub\u003e norm of the matrix.\n     * \u003cp\u003eThe L\u003csub\u003e2\u003c/sub\u003e norm is max(|A \u0026times; u|\u003csub\u003e2\u003c/sub\u003e /\n     * |u|\u003csub\u003e2\u003c/sub\u003e), where |.|\u003csub\u003e2\u003c/sub\u003e denotes the vectorial 2-norm\n     * (i.e. the traditional euclidian norm).\u003c/p\u003e\n     * @return norm\n     ",
      "child_ranges": [
        "(line 604,col 9)-(line 604,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SingularValueDecomposition.getConditionNumber()",
      "begin_line": 611,
      "end_line": 613,
      "comment": "\n     * Return the condition number of the matrix.\n     * @return condition number of the matrix\n     ",
      "child_ranges": [
        "(line 612,col 9)-(line 612,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SingularValueDecomposition.getInverseConditionNumber()",
      "begin_line": 622,
      "end_line": 624,
      "comment": "\n     * Computes the inverse of the condition number.\n     * In cases of rank deficiency, the {@link #getConditionNumber() condition\n     * number} will become undefined.\n     *\n     * @return the inverse of the condition number.\n     ",
      "child_ranges": [
        "(line 623,col 9)-(line 623,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SingularValueDecomposition.getRank()",
      "begin_line": 634,
      "end_line": 642,
      "comment": "\n     * Return the effective numerical matrix rank.\n     * \u003cp\u003eThe effective numerical rank is the number of non-negligible\n     * singular values. The threshold used to identify non-negligible\n     * terms is max(m,n) \u0026times; ulp(s\u003csub\u003e1\u003c/sub\u003e) where ulp(s\u003csub\u003e1\u003c/sub\u003e)\n     * is the least significant bit of the largest singular value.\u003c/p\u003e\n     * @return effective numerical matrix rank\n     ",
      "child_ranges": [
        "(line 635,col 9)-(line 635,col 18)",
        "(line 636,col 9)-(line 640,col 9)",
        "(line 641,col 9)-(line 641,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SingularValueDecomposition.getSolver()",
      "begin_line": 648,
      "end_line": 650,
      "comment": "\n     * Get a solver for finding the A \u0026times; X \u003d B solution in least square sense.\n     * @return a solver\n     ",
      "child_ranges": [
        "(line 649,col 9)-(line 649,col 80)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Solver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.linear.DecompositionSolver"
      ],
      "begin_line": 653,
      "end_line": 735,
      "comment": " Specialized solver. "
    },
    {
      "type": "field",
      "varNames": [
        "pseudoInverse"
      ],
      "begin_line": 655,
      "end_line": 655,
      "comment": " Pseudo-inverse of the initial matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "nonSingular"
      ],
      "begin_line": 657,
      "end_line": 657,
      "comment": " Singularity indicator. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.linear.SingularValueDecomposition.Solver.Solver(double[], org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix, boolean, double)",
      "begin_line": 668,
      "end_line": 685,
      "comment": "\n         * Build a solver from decomposed matrix.\n         *\n         * @param singularValues Singular values.\n         * @param uT U\u003csup\u003eT\u003c/sup\u003e matrix of the decomposition.\n         * @param v V matrix of the decomposition.\n         * @param nonSingular Singularity indicator.\n         * @param tol tolerance for singular values\n         ",
      "child_ranges": [
        "(line 670,col 13)-(line 670,col 48)",
        "(line 671,col 13)-(line 682,col 13)",
        "(line 683,col 13)-(line 683,col 77)",
        "(line 684,col 13)-(line 684,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SingularValueDecomposition.Solver.solve(org.apache.commons.math3.linear.RealVector)",
      "begin_line": 698,
      "end_line": 700,
      "comment": "\n         * Solve the linear equation A \u0026times; X \u003d B in least square sense.\n         * \u003cp\u003e\n         * The m\u0026times;n matrix A may not be square, the solution X is such that\n         * ||A \u0026times; X - B|| is minimal.\n         * \u003c/p\u003e\n         * @param b Right-hand side of the equation A \u0026times; X \u003d B\n         * @return a vector X that minimizes the two norm of A \u0026times; X - B\n         * @throws org.apache.commons.math3.exception.DimensionMismatchException\n         * if the matrices dimensions do not match.\n         ",
      "child_ranges": [
        "(line 699,col 13)-(line 699,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SingularValueDecomposition.Solver.solve(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 714,
      "end_line": 716,
      "comment": "\n         * Solve the linear equation A \u0026times; X \u003d B in least square sense.\n         * \u003cp\u003e\n         * The m\u0026times;n matrix A may not be square, the solution X is such that\n         * ||A \u0026times; X - B|| is minimal.\n         * \u003c/p\u003e\n         *\n         * @param b Right-hand side of the equation A \u0026times; X \u003d B\n         * @return a matrix X that minimizes the two norm of A \u0026times; X - B\n         * @throws org.apache.commons.math3.exception.DimensionMismatchException\n         * if the matrices dimensions do not match.\n         ",
      "child_ranges": [
        "(line 715,col 13)-(line 715,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SingularValueDecomposition.Solver.isNonSingular()",
      "begin_line": 723,
      "end_line": 725,
      "comment": "\n         * Check if the decomposed matrix is non-singular.\n         *\n         * @return {@code true} if the decomposed matrix is non-singular.\n         ",
      "child_ranges": [
        "(line 724,col 13)-(line 724,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.linear.SingularValueDecomposition.Solver.getInverse()",
      "begin_line": 732,
      "end_line": 734,
      "comment": "\n         * Get the pseudo-inverse of the decomposed matrix.\n         *\n         * @return the inverse matrix.\n         ",
      "child_ranges": [
        "(line 733,col 13)-(line 733,col 33)"
      ]
    }
  ]
}