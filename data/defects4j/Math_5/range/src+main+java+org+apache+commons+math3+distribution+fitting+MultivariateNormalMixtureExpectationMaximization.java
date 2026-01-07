{
  "filepath": "/tmp/Math-5b/src/main/java/org/apache/commons/math3/distribution/fitting/MultivariateNormalMixtureExpectationMaximization.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultivariateNormalMixtureExpectationMaximization",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 54,
      "end_line": 440,
      "comment": "\n * Expectation-Maximization\u003c/a\u003e algorithm for fitting the parameters of\n * multivariate normal mixture model distributions.\n *\n * This implementation is pure original code based on \u003ca\n * href\u003d\"https://www.ee.washington.edu/techsite/papers/documents/UWEETR-2010-0002.pdf\"\u003e\n * EM Demystified: An Expectation-Maximization Tutorial\u003c/a\u003e by Yihua Chen and Maya R. Gupta,\n * Department of Electrical Engineering, University of Washington, Seattle, WA 98195.\n * It was verified using external tools like \u003ca\n * href\u003d\"http://cran.r-project.org/web/packages/mixtools/index.html\"\u003eCRAN Mixtools\u003c/a\u003e\n * (see the JUnit test cases) but it is \u003cstrong\u003enot\u003c/strong\u003e based on Mixtools code at all.\n * The discussion of the origin of this class can be seen in the comments of the \u003ca\n * href\u003d\"https://issues.apache.org/jira/browse/MATH-817\"\u003eMATH-817\u003c/a\u003e JIRA issue.\n * @version $Id$\n * @since 3.2\n "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": "\n     * The data to fit.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fittedModel"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": "\n     * The model fit against the data.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "logLikelihood"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": "\n     * The log likelihood of the data given the fitted model.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "defaultMaxIterations"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": "\n     * Default maximum number of iterations allowed per fitting process.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "defaultThreshold"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": "\n     * Default convergence threshold for fitting.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.fitting.MultivariateNormalMixtureExpectationMaximization.MultivariateNormalMixtureExpectationMaximization(double[][])",
      "begin_line": 86,
      "end_line": 108,
      "comment": "\n     * Creates an object to fit a multivariate normal mixture model to data.\n     *\n     * @param data Data to use in fitting procedure\n     * @throws NotStrictlyPositiveException if data has no rows\n     * @throws DimensionMismatchException if rows of data have different numbers\n     *             of columns\n     * @throws NumberIsTooSmallException if the number of columns in the data is\n     *             less than 2\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 92,col 9)",
        "(line 94,col 9)-(line 94,col 60)",
        "(line 96,col 9)-(line 107,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.fitting.MultivariateNormalMixtureExpectationMaximization.fit(org.apache.commons.math3.distribution.MixtureMultivariateNormalDistribution, int, double)",
      "begin_line": 133,
      "end_line": 260,
      "comment": "\n     * Fit a mixture model to the data supplied to the constructor.\n     *\n     * The quality of the fit depends on the concavity of the data provided to\n     * the constructor and the initial mixture provided to this function. If the\n     * data has many local optima, multiple runs of the fitting function with\n     * different initial mixtures may be required to find the optimal solution.\n     * If a SingularMatrixException is encountered, it is possible that another\n     * initialization would work.\n     *\n     * @param initialMixture Model containing initial values of weights and\n     *            multivariate normals\n     * @param maxIterations Maximum iterations allowed for fit\n     * @param threshold Convergence threshold computed as difference in\n     *             logLikelihoods between successive iterations\n     * @throws SingularMatrixException if any component\u0027s covariance matrix is\n     *             singular during fitting\n     * @throws NotStrictlyPositiveException if numComponents is less than one\n     *             or threshold is less than Double.MIN_VALUE\n     * @throws DimensionMismatchException if initialMixture mean vector and data\n     *             number of columns are not equal\n     * @see #estimateMultivariateNormalMixtureModelDistribution\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 141,col 9)",
        "(line 143,col 9)-(line 145,col 9)",
        "(line 147,col 9)-(line 147,col 34)",
        "(line 151,col 9)-(line 151,col 43)",
        "(line 152,col 9)-(line 152,col 60)",
        "(line 154,col 9)-(line 155,col 82)",
        "(line 157,col 9)-(line 159,col 9)",
        "(line 161,col 9)-(line 161,col 30)",
        "(line 162,col 9)-(line 162,col 42)",
        "(line 164,col 9)-(line 164,col 49)",
        "(line 167,col 9)-(line 167,col 96)",
        "(line 169,col 9)-(line 254,col 9)",
        "(line 256,col 9)-(line 259,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.fitting.MultivariateNormalMixtureExpectationMaximization.fit(org.apache.commons.math3.distribution.MixtureMultivariateNormalDistribution)",
      "begin_line": 280,
      "end_line": 284,
      "comment": "\n     * Fit a mixture model to the data supplied to the constructor.\n     *\n     * The quality of the fit depends on the concavity of the data provided to\n     * the constructor and the initial mixture provided to this function. If the\n     * data has many local optima, multiple runs of the fitting function with\n     * different initial mixtures may be required to find the optimal solution.\n     * If a SingularMatrixException is encountered, it is possible that another\n     * initialization would work.\n     *\n     * @param initialMixture Model containing initial values of weights and\n     *            multivariate normals\n     * @throws SingularMatrixException if any component\u0027s covariance matrix is\n     *             singular during fitting\n     * @throws NotStrictlyPositiveException if numComponents is less than one or\n     *             threshold is less than Double.MIN_VALUE\n     * @see #estimateMultivariateNormalMixtureModelDistribution\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.fitting.MultivariateNormalMixtureExpectationMaximization.estimate(double[][], int)",
      "begin_line": 305,
      "end_line": 379,
      "comment": "\n     * Helper method to create a multivariate normal mixture model which can be\n     * used to initialize {@link #fit(MixtureMultivariateRealDistribution)}.\n     *\n     * This method uses the data supplied to the constructor to try to determine\n     * a good mixture model at which to start the fit, but it is not guaranteed\n     * to supply a model which will find the optimal solution or even converge.\n     *\n     * @param data Data to estimate distribution\n     * @param numComponents Number of components for estimated mixture\n     * @return Multivariate normal mixture model estimated from the data\n     * @throws NumberIsTooLargeException if {@code numComponents\\ is greater\n     * than the number of data rows.\n     * @throws NumberIsTooSmallException if {@code numComponents \u003c 2}.\n     * @throws NotStrictlyPositiveException if data has less than 2 rows\n     * @throws DimensionMismatchException if rows of data have different numbers\n     *             of columns\n     * @see #fit\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 311,col 9)",
        "(line 312,col 9)-(line 314,col 9)",
        "(line 315,col 9)-(line 317,col 9)",
        "(line 319,col 9)-(line 319,col 40)",
        "(line 320,col 9)-(line 320,col 43)",
        "(line 323,col 9)-(line 323,col 58)",
        "(line 324,col 9)-(line 326,col 9)",
        "(line 327,col 9)-(line 327,col 32)",
        "(line 329,col 9)-(line 329,col 44)",
        "(line 332,col 9)-(line 332,col 45)",
        "(line 335,col 9)-(line 336,col 78)",
        "(line 339,col 9)-(line 376,col 9)",
        "(line 378,col 9)-(line 378,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.fitting.MultivariateNormalMixtureExpectationMaximization.getLogLikelihood()",
      "begin_line": 386,
      "end_line": 388,
      "comment": "\n     * Gets the log likelihood of the data under the fitted model.\n     *\n     * @return Log likelihood of data or zero of no data has been fit\n     ",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.fitting.MultivariateNormalMixtureExpectationMaximization.getFittedModel()",
      "begin_line": 395,
      "end_line": 397,
      "comment": "\n     * Gets the fitted model.\n     *\n     * @return fitted model or {@code null} if no fit has been performed yet.\n     ",
      "child_ranges": [
        "(line 396,col 9)-(line 396,col 86)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DataRow",
      "is_interface": false,
      "parent_types": [
        "java.lang.Comparable\u003corg.apache.commons.math3.distribution.fitting.MultivariateNormalMixtureExpectationMaximization.DataRow\u003e"
      ],
      "begin_line": 402,
      "end_line": 439,
      "comment": "\n     * Class used for sorting user-supplied data.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "row"
      ],
      "begin_line": 404,
      "end_line": 404,
      "comment": " One data row. "
    },
    {
      "type": "field",
      "varNames": [
        "mean"
      ],
      "begin_line": 406,
      "end_line": 406,
      "comment": " Mean of the data row. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.distribution.fitting.MultivariateNormalMixtureExpectationMaximization.DataRow.DataRow(double[])",
      "begin_line": 412,
      "end_line": 421,
      "comment": "\n         * Create a data row.\n         * @param data Data to use for the row\n         ",
      "child_ranges": [
        "(line 414,col 13)-(line 414,col 23)",
        "(line 416,col 13)-(line 416,col 22)",
        "(line 417,col 13)-(line 419,col 13)",
        "(line 420,col 13)-(line 420,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.fitting.MultivariateNormalMixtureExpectationMaximization.DataRow.compareTo(org.apache.commons.math3.distribution.fitting.MultivariateNormalMixtureExpectationMaximization.DataRow)",
      "begin_line": 428,
      "end_line": 430,
      "comment": "\n         * Compare two data rows.\n         * @param other The other row\n         * @return int for sorting\n         ",
      "child_ranges": [
        "(line 429,col 13)-(line 429,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.distribution.fitting.MultivariateNormalMixtureExpectationMaximization.DataRow.getRow()",
      "begin_line": 436,
      "end_line": 438,
      "comment": "\n         * Get a data row.\n         * @return data row array\n         ",
      "child_ranges": [
        "(line 437,col 13)-(line 437,col 23)"
      ]
    }
  ]
}