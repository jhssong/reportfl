{
  "filepath": "/tmp/Math-48b/src/main/java/org/apache/commons/math/linear/SingularValueDecompositionImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SingularValueDecompositionImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.SingularValueDecomposition"
      ],
      "begin_line": 37,
      "end_line": 688,
      "comment": "\n * Calculates the compact Singular Value Decomposition of a matrix.\n * \u003cp\u003e\n * The Singular Value Decomposition of matrix A is a set of three matrices: U,\n * \u0026Sigma; and V such that A \u003d U \u0026times; \u0026Sigma; \u0026times; V\u003csup\u003eT\u003c/sup\u003e. Let A be\n * a m \u0026times; n matrix, then U is a m \u0026times; p orthogonal matrix, \u0026Sigma; is a\n * p \u0026times; p diagonal matrix with positive or null elements, V is a p \u0026times;\n * n orthogonal matrix (hence V\u003csup\u003eT\u003c/sup\u003e is also orthogonal) where\n * p\u003dmin(m,n).\n * \u003c/p\u003e\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "EPS"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Relative threshold for small singular values. "
    },
    {
      "type": "field",
      "varNames": [
        "TINY"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Absolute threshold for small singular values. "
    },
    {
      "type": "field",
      "varNames": [
        "singularValues"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Computed singular values. "
    },
    {
      "type": "field",
      "varNames": [
        "m"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " max(row dimension, column dimension). "
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " min(row dimension, column dimension). "
    },
    {
      "type": "field",
      "varNames": [
        "transposed"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " Indicator for transposed matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedU"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " Cached value of U matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedUt"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Cached value of transposed U matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedS"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Cached value of S (diagonal) matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedV"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Cached value of V matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "cachedVt"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Cached value of transposed V matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "tol"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": "\n     * Tolerance value for small singular values, calculated once we have\n     * populated \"singularValues\".\n     *"
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.SingularValueDecompositionImpl(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 71,
      "end_line": 460,
      "comment": "\n     * Calculates the compact Singular Value Decomposition of the given matrix.\n     *\n     * @param matrix Matrix to decompose.\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 27)",
        "(line 75,col 9)-(line 85,col 9)",
        "(line 87,col 9)-(line 87,col 39)",
        "(line 88,col 9)-(line 88,col 46)",
        "(line 89,col 9)-(line 89,col 46)",
        "(line 90,col 9)-(line 90,col 41)",
        "(line 91,col 9)-(line 91,col 44)",
        "(line 94,col 9)-(line 94,col 47)",
        "(line 95,col 9)-(line 95,col 47)",
        "(line 96,col 9)-(line 183,col 9)",
        "(line 185,col 9)-(line 185,col 18)",
        "(line 186,col 9)-(line 188,col 9)",
        "(line 189,col 9)-(line 191,col 9)",
        "(line 192,col 9)-(line 194,col 9)",
        "(line 195,col 9)-(line 195,col 21)",
        "(line 198,col 9)-(line 203,col 9)",
        "(line 204,col 9)-(line 229,col 9)",
        "(line 232,col 9)-(line 250,col 9)",
        "(line 253,col 9)-(line 253,col 29)",
        "(line 254,col 9)-(line 254,col 21)",
        "(line 255,col 9)-(line 447,col 9)",
        "(line 450,col 9)-(line 451,col 62)",
        "(line 453,col 9)-(line 459,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.getU()",
      "begin_line": 463,
      "end_line": 467,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 465,col 9)-(line 465,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.getUT()",
      "begin_line": 470,
      "end_line": 476,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 471,col 9)-(line 473,col 9)",
        "(line 475,col 9)-(line 475,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.getS()",
      "begin_line": 479,
      "end_line": 485,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 480,col 9)-(line 483,col 9)",
        "(line 484,col 9)-(line 484,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.getSingularValues()",
      "begin_line": 488,
      "end_line": 490,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 489,col 9)-(line 489,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.getV()",
      "begin_line": 493,
      "end_line": 496,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 495,col 9)-(line 495,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.getVT()",
      "begin_line": 499,
      "end_line": 505,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 500,col 9)-(line 502,col 9)",
        "(line 504,col 9)-(line 504,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.getCovariance(double)",
      "begin_line": 508,
      "end_line": 534,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 510,col 9)-(line 510,col 44)",
        "(line 511,col 9)-(line 511,col 26)",
        "(line 512,col 9)-(line 515,col 9)",
        "(line 517,col 9)-(line 520,col 9)",
        "(line 522,col 9)-(line 522,col 57)",
        "(line 523,col 9)-(line 530,col 39)",
        "(line 532,col 9)-(line 532,col 62)",
        "(line 533,col 9)-(line 533,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.Anonymous-1b1470eb-a220-4a3b-9f71-39372c2e28cf.visit(int, int, double)",
      "begin_line": 525,
      "end_line": 529,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 528,col 17)-(line 528,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.getNorm()",
      "begin_line": 537,
      "end_line": 539,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 538,col 9)-(line 538,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.getConditionNumber()",
      "begin_line": 542,
      "end_line": 544,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 543,col 9)-(line 543,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.getInverseConditionNumber()",
      "begin_line": 553,
      "end_line": 555,
      "comment": "\n     * Computes the inverse of the condition number.\n     * In cases of rank deficiency, the {@link #getConditionNumber() condition\n     * number} will become undefined.\n     *\n     * @return the inverse of the condition number.\n     ",
      "child_ranges": [
        "(line 554,col 9)-(line 554,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.getRank()",
      "begin_line": 558,
      "end_line": 566,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 559,col 9)-(line 559,col 18)",
        "(line 560,col 9)-(line 564,col 9)",
        "(line 565,col 9)-(line 565,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.getSolver()",
      "begin_line": 569,
      "end_line": 571,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 570,col 9)-(line 570,col 80)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Solver",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.DecompositionSolver"
      ],
      "begin_line": 574,
      "end_line": 687,
      "comment": " Specialized solver. "
    },
    {
      "type": "field",
      "varNames": [
        "pseudoInverse"
      ],
      "begin_line": 576,
      "end_line": 576,
      "comment": " Pseudo-inverse of the initial matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "nonSingular"
      ],
      "begin_line": 578,
      "end_line": 578,
      "comment": " Singularity indicator. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.Solver.Solver(double[], org.apache.commons.math.linear.RealMatrix, org.apache.commons.math.linear.RealMatrix, boolean, double)",
      "begin_line": 589,
      "end_line": 606,
      "comment": "\n         * Build a solver from decomposed matrix.\n         *\n         * @param singularValues Singular values.\n         * @param uT U\u003csup\u003eT\u003c/sup\u003e matrix of the decomposition.\n         * @param v V matrix of the decomposition.\n         * @param nonSingular Singularity indicator.\n         * @param tol tolerance for singular values\n         ",
      "child_ranges": [
        "(line 591,col 13)-(line 591,col 48)",
        "(line 592,col 13)-(line 603,col 13)",
        "(line 604,col 13)-(line 604,col 77)",
        "(line 605,col 13)-(line 605,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.Solver.solve(double[])",
      "begin_line": 619,
      "end_line": 621,
      "comment": "\n         * Solve the linear equation A \u0026times; X \u003d B in least square sense.\n         * \u003cp\u003e\n         * The m\u0026times;n matrix A may not be square, the solution X is such that\n         * ||A \u0026times; X - B|| is minimal.\n         * \u003c/p\u003e\n         * @param b Right-hand side of the equation A \u0026times; X \u003d B\n         * @return a vector X that minimizes the two norm of A \u0026times; X - B\n         * @throws org.apache.commons.math.exception.DimensionMismatchException\n         * if the matrices dimensions do not match.\n         ",
      "child_ranges": [
        "(line 620,col 13)-(line 620,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealVector)",
      "begin_line": 634,
      "end_line": 636,
      "comment": "\n         * Solve the linear equation A \u0026times; X \u003d B in least square sense.\n         * \u003cp\u003e\n         * The m\u0026times;n matrix A may not be square, the solution X is such that\n         * ||A \u0026times; X - B|| is minimal.\n         * \u003c/p\u003e\n         * @param b Right-hand side of the equation A \u0026times; X \u003d B\n         * @return a vector X that minimizes the two norm of A \u0026times; X - B\n         * @throws org.apache.commons.math.exception.DimensionMismatchException\n         * if the matrices dimensions do not match.\n         ",
      "child_ranges": [
        "(line 635,col 13)-(line 635,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.Solver.solve(double[][])",
      "begin_line": 650,
      "end_line": 652,
      "comment": "\n         * Solve the linear equation A \u0026times; X \u003d B in least square sense.\n         * \u003cp\u003e\n         * The m\u0026times;n matrix A may not be square, the solution X is such that\n         * ||A \u0026times; X - B|| is minimal.\n         * \u003c/p\u003e\n         *\n         * @param b Right-hand side of the equation A \u0026times; X \u003d B\n         * @return a matrix X that minimizes the two norm of A \u0026times; X - B\n         * @throws org.apache.commons.math.exception.DimensionMismatchException\n         * if the matrices dimensions do not match.\n         ",
      "child_ranges": [
        "(line 651,col 13)-(line 651,col 85)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.Solver.solve(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 666,
      "end_line": 668,
      "comment": "\n         * Solve the linear equation A \u0026times; X \u003d B in least square sense.\n         * \u003cp\u003e\n         * The m\u0026times;n matrix A may not be square, the solution X is such that\n         * ||A \u0026times; X - B|| is minimal.\n         * \u003c/p\u003e\n         *\n         * @param b Right-hand side of the equation A \u0026times; X \u003d B\n         * @return a matrix X that minimizes the two norm of A \u0026times; X - B\n         * @throws org.apache.commons.math.exception.DimensionMismatchException\n         * if the matrices dimensions do not match.\n         ",
      "child_ranges": [
        "(line 667,col 13)-(line 667,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.Solver.isNonSingular()",
      "begin_line": 675,
      "end_line": 677,
      "comment": "\n         * Check if the decomposed matrix is non-singular.\n         *\n         * @return {@code true} if the decomposed matrix is non-singular.\n         ",
      "child_ranges": [
        "(line 676,col 13)-(line 676,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.linear.SingularValueDecompositionImpl.Solver.getInverse()",
      "begin_line": 684,
      "end_line": 686,
      "comment": "\n         * Get the pseudo-inverse of the decomposed matrix.\n         *\n         * @return the inverse matrix.\n         ",
      "child_ranges": [
        "(line 685,col 13)-(line 685,col 33)"
      ]
    }
  ]
}