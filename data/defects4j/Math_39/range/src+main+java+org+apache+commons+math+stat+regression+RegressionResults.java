{
  "filepath": "/tmp/Math-39b/src/main/java/org/apache/commons/math/stat/regression/RegressionResults.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RegressionResults",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 30,
      "end_line": 422,
      "comment": "\n * Results of a Multiple Linear Regression model fit.\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "SSE_IDX"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " INDEX of Sum of Squared Errors "
    },
    {
      "type": "field",
      "varNames": [
        "SST_IDX"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " INDEX of Sum of Squares of Model "
    },
    {
      "type": "field",
      "varNames": [
        "RSQ_IDX"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " INDEX of R-Squared of regression "
    },
    {
      "type": "field",
      "varNames": [
        "MSE_IDX"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " INDEX of Mean Squared Error "
    },
    {
      "type": "field",
      "varNames": [
        "ADJRSQ_IDX"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " INDEX of Adjusted R Squared "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " UID "
    },
    {
      "type": "field",
      "varNames": [
        "parameters"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " regression slope parameters "
    },
    {
      "type": "field",
      "varNames": [
        "varCovData"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " variance covariance matrix of parameters "
    },
    {
      "type": "field",
      "varNames": [
        "isSymmetricVCD"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " boolean flag for variance covariance matrix in symm compressed storage "
    },
    {
      "type": "field",
      "varNames": [
        "rank"
      ],
      "begin_line": 51,
      "end_line": 52,
      "comment": " rank of the solution "
    },
    {
      "type": "field",
      "varNames": [
        "nobs"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " number of observations on which results are based "
    },
    {
      "type": "field",
      "varNames": [
        "containsConstant"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " boolean flag indicator of whether a constant was included"
    },
    {
      "type": "field",
      "varNames": [
        "globalFitInfo"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " array storing global results, SSE, MSE, RSQ, adjRSQ "
    },
    {
      "type": "field",
      "varNames": [
        "indexOutOfBound"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " error message "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.regression.RegressionResults.RegressionResults()",
      "begin_line": 66,
      "end_line": 75,
      "comment": "\n     *  Set the default constructor to private access\n     *  to prevent inadvertent instantiation\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 31)",
        "(line 69,col 9)-(line 69,col 31)",
        "(line 70,col 9)-(line 70,col 23)",
        "(line 71,col 9)-(line 71,col 23)",
        "(line 72,col 9)-(line 72,col 38)",
        "(line 73,col 9)-(line 73,col 36)",
        "(line 74,col 9)-(line 74,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.regression.RegressionResults.RegressionResults(double[], double[][], boolean, long, int, double, double, double, boolean, boolean)",
      "begin_line": 94,
      "end_line": 138,
      "comment": "\n     * Constructor for Regression Results.\n     *\n     * @param parameters a double array with the regression slope estimates\n     * @param varcov the variance covariance matrix, stored either in a square matrix\n     * or as a compressed\n     * @param isSymmetricCompressed a flag which denotes that the variance covariance\n     * matrix is in symmetric compressed format\n     * @param nobs the number of observations of the regression estimation\n     * @param rank the number of independent variables in the regression\n     * @param sumy the sum of the independent variable\n     * @param sumysq the sum of the squared independent variable\n     * @param sse sum of squared errors\n     * @param containsConstant true model has constant,  false model does not have constant\n     * @param copyData if true a deep copy of all input data is made, if false only references\n     * are copied and the RegressionResults become mutable\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 110,col 9)",
        "(line 111,col 9)-(line 111,col 52)",
        "(line 112,col 9)-(line 112,col 25)",
        "(line 113,col 9)-(line 113,col 25)",
        "(line 114,col 9)-(line 114,col 49)",
        "(line 115,col 9)-(line 115,col 43)",
        "(line 116,col 9)-(line 116,col 52)",
        "(line 118,col 9)-(line 121,col 9)",
        "(line 123,col 9)-(line 123,col 42)",
        "(line 124,col 9)-(line 125,col 30)",
        "(line 126,col 9)-(line 128,col 44)",
        "(line 130,col 9)-(line 137,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.RegressionResults.getParameterEstimate(int)",
      "begin_line": 150,
      "end_line": 158,
      "comment": "\n     * \u003cp\u003eReturns the parameter estimate for the regressor at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eA redundant regressor will have its redundancy flag set, as well as\n     *  a parameters estimated equal to {@code Double.NaN}\u003c/p\u003e\n     *\n     * @param index an integer index which must be in the range [0, numberOfParameters-1]\n     * @return parameters estimated for regressor at index\n     * @throws IndexOutOfBoundsException thrown if the index \u003e\u003d numberOfParameters\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 153,col 9)",
        "(line 154,col 9)-(line 156,col 9)",
        "(line 157,col 9)-(line 157,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.RegressionResults.getParameterEstimates()",
      "begin_line": 170,
      "end_line": 175,
      "comment": "\n     * \u003cp\u003eReturns a copy of the regression parameters estimates.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe parameter estimates are returned in the natural order of the data.\u003c/p\u003e\n     *\n     * \u003cp\u003eA redundant regressor will have its redundancy flag set, as will\n     *  a parameter estimate equal to {@code Double.NaN}.\u003c/p\u003e\n     *\n     * @return array of parameter estimates, null if no estimation occurred\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 173,col 9)",
        "(line 174,col 9)-(line 174,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.RegressionResults.getStdErrorOfEstimate(int)",
      "begin_line": 186,
      "end_line": 198,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://www.xycoon.com/standerrorb(1).htm\"\u003estandard\n     * error of the parameter estimate at index\u003c/a\u003e,\n     * usually denoted s(b\u003csub\u003eindex\u003c/sub\u003e).\n     *\n     * @param index an integer index which must be in the range [0, numberOfParameters-1]\n     * @return standard errors associated with parameters estimated at index\n     * @throws IndexOutOfBoundsException thrown if the index \u003e\u003d numberOfParameters\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 189,col 9)",
        "(line 190,col 9)-(line 192,col 9)",
        "(line 193,col 9)-(line 193,col 54)",
        "(line 194,col 9)-(line 196,col 9)",
        "(line 197,col 9)-(line 197,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.RegressionResults.getStdErrorOfEstimates()",
      "begin_line": 211,
      "end_line": 225,
      "comment": "\n     * \u003cp\u003eReturns the \u003ca href\u003d\"http://www.xycoon.com/standerrorb(1).htm\"\u003estandard\n     * error of the parameter estimates\u003c/a\u003e,\n     * usually denoted s(b\u003csub\u003ei\u003c/sub\u003e).\u003c/p\u003e\n     *\n     * \u003cp\u003eIf there are problems with an ill conditioned design matrix then the regressor\n     * which is redundant will be assigned \u003ccode\u003eDouble.NaN\u003c/code\u003e. \u003c/p\u003e\n     *\n     * @return an array standard errors associated with parameters estimates,\n     *  null if no estimation occurred\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 214,col 9)",
        "(line 215,col 9)-(line 215,col 57)",
        "(line 216,col 9)-(line 223,col 9)",
        "(line 224,col 9)-(line 224,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.RegressionResults.getCovarianceOfParameters(int, int)",
      "begin_line": 238,
      "end_line": 251,
      "comment": "\n     * \u003cp\u003eReturns the covariance between regression parameters i and j.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf there are problems with an ill conditioned design matrix then the covariance\n     * which involves redundant columns will be assigned {@code Double.NaN}. \u003c/p\u003e\n     *\n     * @param i - the ith regression parameter\n     * @param j - the jth regression parameter\n     * @return the covariance of the parameter estimates\n     * @throws IndexOutOfBoundsException thrown when i,j \u003e\u003d number of parameters\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 241,col 9)",
        "(line 242,col 9)-(line 245,col 9)",
        "(line 246,col 9)-(line 249,col 9)",
        "(line 250,col 9)-(line 250,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.RegressionResults.getNumberOfParameters()",
      "begin_line": 261,
      "end_line": 266,
      "comment": "\n     * \u003cp\u003eReturns the number of parameters estimated in the model.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is the maximum number of regressors, some techniques may drop\n     * redundant parameters\u003c/p\u003e\n     *\n     * @return number of regressors, -1 if not estimated\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 264,col 9)",
        "(line 265,col 9)-(line 265,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.RegressionResults.getN()",
      "begin_line": 273,
      "end_line": 275,
      "comment": "\n     * Returns the number of observations added to the regression model.\n     *\n     * @return Number of observations, -1 if an error condition prevents estimation\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.RegressionResults.getTotalSumSquares()",
      "begin_line": 287,
      "end_line": 289,
      "comment": "\n     * \u003cp\u003eReturns the sum of squared deviations of the y values about their mean.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is defined as SSTO\n     * \u003ca href\u003d\"http://www.xycoon.com/SumOfSquares.htm\"\u003ehere\u003c/a\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf {@code n \u003c 2}, this returns {@code Double.NaN}.\u003c/p\u003e\n     *\n     * @return sum of squared deviations of y values\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.RegressionResults.getRegressionSumSquares()",
      "begin_line": 307,
      "end_line": 309,
      "comment": "\n     * \u003cp\u003eReturns the sum of squared deviations of the predicted y values about\n     * their mean (which equals the mean of y).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is usually abbreviated SSR or SSM.  It is defined as SSM\n     * \u003ca href\u003d\"http://www.xycoon.com/SumOfSquares.htm\"\u003ehere\u003c/a\u003e\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eAt least two observations (with at least two different x values)\n     * must have been added before invoking this method. If this method is\n     * invoked before a model can be estimated, \u003ccode\u003eDouble.NaN\u003c/code\u003e is\n     * returned.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @return sum of squared deviations of predicted y values\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.RegressionResults.getErrorSumSquares()",
      "begin_line": 329,
      "end_line": 331,
      "comment": "\n     * \u003cp\u003eReturns the \u003ca href\u003d\"http://www.xycoon.com/SumOfSquares.htm\"\u003e\n     * sum of squared errors\u003c/a\u003e (SSE) associated with the regression\n     * model.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe return value is constrained to be non-negative - i.e., if due to\n     * rounding errors the computational formula returns a negative result,\n     * 0 is returned.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003enumberOfParameters data pairs\n     * must have been added before invoking this method. If this method is\n     * invoked before a model can be estimated, \u003ccode\u003eDouble,NaN\u003c/code\u003e is\n     * returned.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @return sum of squared errors associated with the regression model\n     ",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.RegressionResults.getMeanSquareError()",
      "begin_line": 343,
      "end_line": 345,
      "comment": "\n     * \u003cp\u003eReturns the sum of squared errors divided by the degrees of freedom,\n     * usually abbreviated MSE.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf there are fewer than \u003cstrong\u003enumberOfParameters + 1\u003c/strong\u003e data pairs in the model,\n     * or if there is no variation in \u003ccode\u003ex\u003c/code\u003e, this returns\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return sum of squared deviations of y values\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.RegressionResults.getRSquared()",
      "begin_line": 361,
      "end_line": 363,
      "comment": "\n     * \u003cp\u003eReturns the \u003ca href\u003d\"http://www.xycoon.com/coefficient1.htm\"\u003e\n     * coefficient of multiple determination\u003c/a\u003e,\n     * usually denoted r-square.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eAt least numberOfParameters observations (with at least numberOfParameters different x values)\n     * must have been added before invoking this method. If this method is\n     * invoked before a model can be estimated, {@code Double,NaN} is\n     * returned.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @return r-square, a double in the interval [0, 1]\n     ",
      "child_ranges": [
        "(line 362,col 9)-(line 362,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.RegressionResults.getAdjustedRSquared()",
      "begin_line": 379,
      "end_line": 381,
      "comment": "\n     * \u003cp\u003eReturns the adjusted R-squared statistic, defined by the formula \u003cpre\u003e\n     * R\u003csup\u003e2\u003c/sup\u003e\u003csub\u003eadj\u003c/sub\u003e \u003d 1 - [SSR (n - 1)] / [SSTO (n - p)]\n     * \u003c/pre\u003e\n     * where SSR is the sum of squared residuals},\n     * SSTO is the total sum of squares}, n is the number\n     * of observations and p is the number of parameters estimated (including the intercept).\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the regression is estimated without an intercept term, what is returned is \u003cpre\u003e\n     * \u003ccode\u003e 1 - (1 - {@link #getRSquared()} ) * (n / (n - p)) \u003c/code\u003e\n     * \u003c/pre\u003e\u003c/p\u003e\n     *\n     * @return adjusted R-Squared statistic\n     ",
      "child_ranges": [
        "(line 380,col 9)-(line 380,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.RegressionResults.hasIntercept()",
      "begin_line": 389,
      "end_line": 391,
      "comment": "\n     * Returns true if the regression model has been computed including an intercept.\n     * In this case, the coefficient of the intercept is the first element of the\n     * {@link #getParameterEstimates() parameter estimates}.\n     * @return true if the model has an intercept term\n     ",
      "child_ranges": [
        "(line 390,col 9)-(line 390,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.RegressionResults.getVcvElement(int, int)",
      "begin_line": 400,
      "end_line": 421,
      "comment": "\n     * Gets the i-jth element of the variance-covariance matrix.\n     *\n     * @param i first variable index\n     * @param j second variable index\n     * @return the requested variance-covariance matrix entry\n     ",
      "child_ranges": [
        "(line 401,col 9)-(line 420,col 9)"
      ]
    }
  ]
}