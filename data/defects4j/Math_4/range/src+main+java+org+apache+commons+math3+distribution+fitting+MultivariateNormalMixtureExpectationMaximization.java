{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/distribution/fitting/MultivariateNormalMixtureExpectationMaximization.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultivariateNormalMixtureExpectationMaximization",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 53,
      "end_line": 452,
      "comment": "\n * Expectation-Maximization\u003c/a\u003e algorithm for fitting the parameters of\n * multivariate normal mixture model distributions.\n *\n * This implementation is pure original code based on \u003ca\n * href\u003d\"https://www.ee.washington.edu/techsite/papers/documents/UWEETR-2010-0002.pdf\"\u003e\n * EM Demystified: An Expectation-Maximization Tutorial\u003c/a\u003e by Yihua Chen and Maya R. Gupta,\n * Department of Electrical Engineering, University of Washington, Seattle, WA 98195.\n * It was verified using external tools like \u003ca\n * href\u003d\"http://cran.r-project.org/web/packages/mixtools/index.html\"\u003eCRAN Mixtools\u003c/a\u003e\n * (see the JUnit test cases) but it is \u003cstrong\u003enot\u003c/strong\u003e based on Mixtools code at all.\n * The discussion of the origin of this class can be seen in the comments of the \u003ca\n * href\u003d\"https://issues.apache.org/jira/browse/MATH-817\"\u003eMATH-817\u003c/a\u003e JIRA issue.\n * @version $Id$\n * @since 3.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MAX_ITERATIONS"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": "\n     * Default maximum number of iterations allowed per fitting process.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_THRESHOLD"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": "\n     * Default convergence threshold for fitting.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": "\n     * The data to fit.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fittedModel"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": "\n     * The model fit against the data.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "logLikelihood"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": "\n     * The log likelihood of the data given the fitted model.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.fitting.MultivariateNormalMixtureExpectationMaximization.MultivariateNormalMixtureExpectationMaximization(double[][])",
      "begin_line": 85,
      "end_line": 107,
      "comment": "\n     * Creates an object to fit a multivariate normal mixture model to data.\n     *\n     * @param data Data to use in fitting procedure\n     * @throws NotStrictlyPositiveException if data has no rows\n     * @throws DimensionMismatchException if rows of data have different numbers\n     *             of columns\n     * @throws NumberIsTooSmallException if the number of columns in the data is\n     *             less than 2\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 91,col 9)",
        "(line 93,col 9)-(line 93,col 60)",
        "(line 95,col 9)-(line 106,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.fitting.MultivariateNormalMixtureExpectationMaximization.fit(org.apache.commons.math3.distribution.MixtureMultivariateNormalDistribution, int, double)",
      "begin_line": 131,
      "end_line": 258,
      "comment": "\n     * Fit a mixture model to the data supplied to the constructor.\n     *\n     * The quality of the fit depends on the concavity of the data provided to\n     * the constructor and the initial mixture provided to this function. If the\n     * data has many local optima, multiple runs of the fitting function with\n     * different initial mixtures may be required to find the optimal solution.\n     * If a SingularMatrixException is encountered, it is possible that another\n     * initialization would work.\n     *\n     * @param initialMixture Model containing initial values of weights and\n     *            multivariate normals\n     * @param maxIterations Maximum iterations allowed for fit\n     * @param threshold Convergence threshold computed as difference in\n     *             logLikelihoods between successive iterations\n     * @throws SingularMatrixException if any component\u0027s covariance matrix is\n     *             singular during fitting\n     * @throws NotStrictlyPositiveException if numComponents is less than one\n     *             or threshold is less than Double.MIN_VALUE\n     * @throws DimensionMismatchException if initialMixture mean vector and data\n     *             number of columns are not equal\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 139,col 9)",
        "(line 141,col 9)-(line 143,col 9)",
        "(line 145,col 9)-(line 145,col 34)",
        "(line 149,col 9)-(line 149,col 43)",
        "(line 150,col 9)-(line 150,col 60)",
        "(line 152,col 9)-(line 153,col 82)",
        "(line 155,col 9)-(line 157,col 9)",
        "(line 159,col 9)-(line 159,col 30)",
        "(line 160,col 9)-(line 160,col 42)",
        "(line 162,col 9)-(line 162,col 49)",
        "(line 165,col 9)-(line 165,col 96)",
        "(line 167,col 9)-(line 252,col 9)",
        "(line 254,col 9)-(line 257,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.fitting.MultivariateNormalMixtureExpectationMaximization.fit(org.apache.commons.math3.distribution.MixtureMultivariateNormalDistribution)",
      "begin_line": 277,
      "end_line": 281,
      "comment": "\n     * Fit a mixture model to the data supplied to the constructor.\n     *\n     * The quality of the fit depends on the concavity of the data provided to\n     * the constructor and the initial mixture provided to this function. If the\n     * data has many local optima, multiple runs of the fitting function with\n     * different initial mixtures may be required to find the optimal solution.\n     * If a SingularMatrixException is encountered, it is possible that another\n     * initialization would work.\n     *\n     * @param initialMixture Model containing initial values of weights and\n     *            multivariate normals\n     * @throws SingularMatrixException if any component\u0027s covariance matrix is\n     *             singular during fitting\n     * @throws NotStrictlyPositiveException if numComponents is less than one or\n     *             threshold is less than Double.MIN_VALUE\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.fitting.MultivariateNormalMixtureExpectationMaximization.estimate(double[][], int)",
      "begin_line": 301,
      "end_line": 370,
      "comment": "\n     * Helper method to create a multivariate normal mixture model which can be\n     * used to initialize {@link #fit(MixtureMultivariateNormalDistribution)}.\n     *\n     * This method uses the data supplied to the constructor to try to determine\n     * a good mixture model at which to start the fit, but it is not guaranteed\n     * to supply a model which will find the optimal solution or even converge.\n     *\n     * @param data Data to estimate distribution\n     * @param numComponents Number of components for estimated mixture\n     * @return Multivariate normal mixture model estimated from the data\n     * @throws NumberIsTooLargeException if {@code numComponents} is greater\n     * than the number of data rows.\n     * @throws NumberIsTooSmallException if {@code numComponents \u003c 2}.\n     * @throws NotStrictlyPositiveException if data has less than 2 rows\n     * @throws DimensionMismatchException if rows of data have different numbers\n     *             of columns\n     ",
      "child_ranges": [
        "(line 305,col 9)-(line 307,col 9)",
        "(line 308,col 9)-(line 310,col 9)",
        "(line 311,col 9)-(line 313,col 9)",
        "(line 315,col 9)-(line 315,col 40)",
        "(line 316,col 9)-(line 316,col 43)",
        "(line 319,col 9)-(line 319,col 58)",
        "(line 320,col 9)-(line 322,col 9)",
        "(line 323,col 9)-(line 323,col 32)",
        "(line 326,col 9)-(line 326,col 49)",
        "(line 329,col 9)-(line 330,col 78)",
        "(line 333,col 9)-(line 367,col 9)",
        "(line 369,col 9)-(line 369,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.fitting.MultivariateNormalMixtureExpectationMaximization.getLogLikelihood()",
      "begin_line": 377,
      "end_line": 379,
      "comment": "\n     * Gets the log likelihood of the data under the fitted model.\n     *\n     * @return Log likelihood of data or zero of no data has been fit\n     ",
      "child_ranges": [
        "(line 378,col 9)-(line 378,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.fitting.MultivariateNormalMixtureExpectationMaximization.getFittedModel()",
      "begin_line": 386,
      "end_line": 388,
      "comment": "\n     * Gets the fitted model.\n     *\n     * @return fitted model or {@code null} if no fit has been performed yet.\n     ",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 86)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DataRow",
      "is_interface": false,
      "parent_types": [
        "java.lang.Comparable\u003corg.apache.commons.math3.distribution.fitting.MultivariateNormalMixtureExpectationMaximization.DataRow\u003e"
      ],
      "begin_line": 393,
      "end_line": 451,
      "comment": "\n     * Class used for sorting user-supplied data.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "row"
      ],
      "begin_line": 395,
      "end_line": 395,
      "comment": " One data row. "
    },
    {
      "type": "field",
      "varNames": [
        "mean"
      ],
      "begin_line": 397,
      "end_line": 397,
      "comment": " Mean of the data row. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.fitting.MultivariateNormalMixtureExpectationMaximization.DataRow.DataRow(double[])",
      "begin_line": 403,
      "end_line": 412,
      "comment": "\n         * Create a data row.\n         * @param data Data to use for the row\n         ",
      "child_ranges": [
        "(line 405,col 13)-(line 405,col 23)",
        "(line 407,col 13)-(line 407,col 22)",
        "(line 408,col 13)-(line 410,col 13)",
        "(line 411,col 13)-(line 411,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.fitting.MultivariateNormalMixtureExpectationMaximization.DataRow.compareTo(org.apache.commons.math3.distribution.fitting.MultivariateNormalMixtureExpectationMaximization.DataRow)",
      "begin_line": 419,
      "end_line": 421,
      "comment": "\n         * Compare two data rows.\n         * @param other The other row\n         * @return int for sorting\n         ",
      "child_ranges": [
        "(line 420,col 13)-(line 420,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.fitting.MultivariateNormalMixtureExpectationMaximization.DataRow.equals(java.lang.Object)",
      "begin_line": 424,
      "end_line": 437,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 427,col 13)-(line 429,col 13)",
        "(line 431,col 13)-(line 433,col 13)",
        "(line 435,col 13)-(line 435,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.fitting.MultivariateNormalMixtureExpectationMaximization.DataRow.hashCode()",
      "begin_line": 440,
      "end_line": 443,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 442,col 13)-(line 442,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.fitting.MultivariateNormalMixtureExpectationMaximization.DataRow.getRow()",
      "begin_line": 448,
      "end_line": 450,
      "comment": "\n         * Get a data row.\n         * @return data row array\n         ",
      "child_ranges": [
        "(line 449,col 13)-(line 449,col 23)"
      ]
    }
  ]
}