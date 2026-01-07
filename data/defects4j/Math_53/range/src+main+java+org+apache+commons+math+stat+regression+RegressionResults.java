{
  "filepath": "/tmp/Math-53b/src/main/java/org/apache/commons/math/stat/regression/RegressionResults.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RegressionResults",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 30,
      "end_line": 386,
      "comment": "\n * Results of a Multiple Linear Regression model fit.\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "SSE_IDX"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SST_IDX"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "RSQ_IDX"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MSE_IDX"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ADJRSQ_IDX"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parameters"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "varCovData"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isSymmetricVCD"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "rank"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nobs"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "containsConstant"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "globalFitInfo"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.regression.RegressionResults.RegressionResults()",
      "begin_line": 50,
      "end_line": 59,
      "comment": "\n     *  Set the default constructor to private access\n     *  to prevent inadvertent instantiation\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 31)",
        "(line 53,col 9)-(line 53,col 31)",
        "(line 54,col 9)-(line 54,col 23)",
        "(line 55,col 9)-(line 55,col 23)",
        "(line 56,col 9)-(line 56,col 38)",
        "(line 57,col 9)-(line 57,col 36)",
        "(line 58,col 9)-(line 58,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.regression.RegressionResults.RegressionResults(double[], double[][], boolean, long, int, double, double, double, boolean, boolean)",
      "begin_line": 61,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 68,col 9)-(line 77,col 9)",
        "(line 78,col 9)-(line 78,col 52)",
        "(line 79,col 9)-(line 79,col 25)",
        "(line 80,col 9)-(line 80,col 25)",
        "(line 81,col 9)-(line 81,col 49)",
        "(line 82,col 9)-(line 82,col 43)",
        "(line 83,col 9)-(line 83,col 52)",
        "(line 85,col 9)-(line 88,col 9)",
        "(line 89,col 9)-(line 89,col 42)",
        "(line 90,col 9)-(line 91,col 41)",
        "(line 92,col 9)-(line 94,col 44)",
        "(line 96,col 9)-(line 102,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.RegressionResults.getParameterEstimate(int)",
      "begin_line": 115,
      "end_line": 123,
      "comment": "\n     * \u003cp\u003eReturns the parameter estimate for the regressor at the given index.\u003c/p\u003e\n     *\n     * \u003cp\u003eA redundant regressor will have its redundancy flag set, as well as\n     *  a parameters estimated equal to {@code Double.NaN}\u003c/p\u003e\n     *\n     * @param index an integer index which must be in the range [0, numberOfParameters-1]\n     * @return parameters estimated for regressor at index\n     * @throws IndexOutOfBoundsException thrown if the index \u003e\u003d numberOfParameters\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 118,col 9)",
        "(line 119,col 9)-(line 121,col 9)",
        "(line 122,col 9)-(line 122,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.RegressionResults.getParameterEstimates()",
      "begin_line": 135,
      "end_line": 140,
      "comment": "\n     * \u003cp\u003eReturns a copy of the regression parameters estimates.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe parameter estimates are returned in the natural order of the data.\u003c/p\u003e\n     *\n     * \u003cp\u003eA redundant regressor will have its redundancy flag set, as will\n     *  a parameter estimate equal to {@code Double.NaN}.\u003c/p\u003e\n     *\n     * @return array of parameter estimates, null if no estimation occurred\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 138,col 9)",
        "(line 139,col 9)-(line 139,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.RegressionResults.getStdErrorOfEstimate(int)",
      "begin_line": 151,
      "end_line": 163,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://www.xycoon.com/standerrorb(1).htm\"\u003estandard\n     * error of the parameter estimate at index\u003c/a\u003e,\n     * usually denoted s(b\u003csub\u003eindex\u003c/sub\u003e).\n     *\n     * @param index an integer index which must be in the range [0, numberOfParameters-1]\n     * @return standard errors associated with parameters estimated at index\n     * @throws IndexOutOfBoundsException thrown if the index \u003e\u003d numberOfParameters\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 154,col 9)",
        "(line 155,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 158,col 54)",
        "(line 159,col 9)-(line 161,col 9)",
        "(line 162,col 9)-(line 162,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.RegressionResults.getStdErrorOfEstimates()",
      "begin_line": 176,
      "end_line": 190,
      "comment": "\n     * \u003cp\u003eReturns the \u003ca href\u003d\"http://www.xycoon.com/standerrorb(1).htm\"\u003estandard\n     * error of the parameter estimates\u003c/a\u003e,\n     * usually denoted s(b\u003csub\u003ei\u003c/sub\u003e).\u003c/p\u003e\n     *\n     * \u003cp\u003eIf there are problems with an ill conditioned design matrix then the regressor\n     * which is redundant will be assigned \u003ccode\u003eDouble.NaN\u003c/code\u003e. \u003c/p\u003e\n     *\n     * @return an array standard errors associated with parameters estimates,\n     *  null if no estimation occurred\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 180,col 57)",
        "(line 181,col 9)-(line 188,col 9)",
        "(line 189,col 9)-(line 189,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.RegressionResults.getCovarianceOfParameters(int, int)",
      "begin_line": 202,
      "end_line": 215,
      "comment": "\n     * \u003cp\u003eReturns the covariance between regression parameters i and j.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf there are problems with an ill conditioned design matrix then the covariance\n     * which involves redundant columns will be assigned {@code Double.NaN}. \u003c/p\u003e\n     *\n     * @param i - the ith regression parameter\n     * @param j - the jth regression parameter\n     * @return the covariance of the parameter estimates\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 205,col 9)",
        "(line 206,col 9)-(line 209,col 9)",
        "(line 210,col 9)-(line 213,col 9)",
        "(line 214,col 9)-(line 214,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.RegressionResults.getNumberOfParameters()",
      "begin_line": 225,
      "end_line": 230,
      "comment": "\n     * \u003cp\u003eReturns the number of parameters estimated in the model.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is the maximum number of regressors, some techniques may drop\n     * redundant parameters\u003c/p\u003e\n     *\n     * @return number of regressors, -1 if not estimated\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 228,col 9)",
        "(line 229,col 9)-(line 229,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.RegressionResults.getN()",
      "begin_line": 237,
      "end_line": 239,
      "comment": "\n     * Returns the number of observations added to the regression model.\n     *\n     * @return Number of observations, -1 if an error condition prevents estimation\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.RegressionResults.getTotalSumSquares()",
      "begin_line": 251,
      "end_line": 253,
      "comment": "\n     * \u003cp\u003eReturns the sum of squared deviations of the y values about their mean.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is defined as SSTO\n     * \u003ca href\u003d\"http://www.xycoon.com/SumOfSquares.htm\"\u003ehere\u003c/a\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf {@code n \u003c 2}, this returns {@code Double.NaN}.\u003c/p\u003e\n     *\n     * @return sum of squared deviations of y values\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.RegressionResults.getRegressionSumSquares()",
      "begin_line": 271,
      "end_line": 273,
      "comment": "\n     * \u003cp\u003eReturns the sum of squared deviations of the predicted y values about\n     * their mean (which equals the mean of y).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is usually abbreviated SSR or SSM.  It is defined as SSM\n     * \u003ca href\u003d\"http://www.xycoon.com/SumOfSquares.htm\"\u003ehere\u003c/a\u003e\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eAt least two observations (with at least two different x values)\n     * must have been added before invoking this method. If this method is\n     * invoked before a model can be estimated, \u003ccode\u003eDouble.NaN\u003c/code\u003e is\n     * returned.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @return sum of squared deviations of predicted y values\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.RegressionResults.getErrorSumSquares()",
      "begin_line": 293,
      "end_line": 295,
      "comment": "\n     * \u003cp\u003eReturns the \u003ca href\u003d\"http://www.xycoon.com/SumOfSquares.htm\"\u003e\n     * sum of squared errors\u003c/a\u003e (SSE) associated with the regression\n     * model.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe return value is constrained to be non-negative - i.e., if due to\n     * rounding errors the computational formula returns a negative result,\n     * 0 is returned.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003enumberOfParameters data pairs\n     * must have been added before invoking this method. If this method is\n     * invoked before a model can be estimated, \u003ccode\u003eDouble,NaN\u003c/code\u003e is\n     * returned.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @return sum of squared errors associated with the regression model\n     ",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.RegressionResults.getMeanSquareError()",
      "begin_line": 307,
      "end_line": 309,
      "comment": "\n     * \u003cp\u003eReturns the sum of squared errors divided by the degrees of freedom,\n     * usually abbreviated MSE.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf there are fewer than \u003cstrong\u003enumberOfParameters + 1\u003c/strong\u003e data pairs in the model,\n     * or if there is no variation in \u003ccode\u003ex\u003c/code\u003e, this returns\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return sum of squared deviations of y values\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.RegressionResults.getRSquared()",
      "begin_line": 325,
      "end_line": 327,
      "comment": "\n     * \u003cp\u003eReturns the \u003ca href\u003d\"http://www.xycoon.com/coefficient1.htm\"\u003e\n     * coefficient of multiple determination\u003c/a\u003e,\n     * usually denoted r-square.\u003c/p\u003e\n     *\n     * \u003cp\u003e\u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eAt least numberOfParameters observations (with at least numberOfParameters different x values)\n     * must have been added before invoking this method. If this method is\n     * invoked before a model can be estimated, {@code Double,NaN} is\n     * returned.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @return r-square, a double in the interval [0, 1]\n     ",
      "child_ranges": [
        "(line 326,col 9)-(line 326,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.RegressionResults.getAdjustedRSquared()",
      "begin_line": 343,
      "end_line": 345,
      "comment": "\n     * \u003cp\u003eReturns the adjusted R-squared statistic, defined by the formula \u003cpre\u003e\n     * R\u003csup\u003e2\u003c/sup\u003e\u003csub\u003eadj\u003c/sub\u003e \u003d 1 - [SSR (n - 1)] / [SSTO (n - p)]\n     * \u003c/pre\u003e\n     * where SSR is the sum of squared residuals},\n     * SSTO is the total sum of squares}, n is the number\n     * of observations and p is the number of parameters estimated (including the intercept).\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the regression is estimated without an intercept term, what is returned is \u003cpre\u003e\n     * \u003ccode\u003e 1 - (1 - {@link #getRSquared()} ) * (n / (n - p)) \u003c/code\u003e\n     * \u003c/pre\u003e\u003c/p\u003e\n     *\n     * @return adjusted R-Squared statistic\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.RegressionResults.hasIntercept()",
      "begin_line": 353,
      "end_line": 355,
      "comment": "\n     * Returns true if the regression model has been computed including an intercept.\n     * In this case, the coefficient of the intercept is the first element of the\n     * {@link #getParameterEstimates() parameter estimates}.\n     * @return true if the model has an intercept term\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.RegressionResults.getVcvElement(int, int)",
      "begin_line": 364,
      "end_line": 385,
      "comment": "\n     * Gets the i-jth element of the variance-covariance matrix.\n     *\n     * @param i first variable index\n     * @param j second variable index\n     * @return the requested variance-covariance matrix entry\n     ",
      "child_ranges": [
        "(line 365,col 9)-(line 384,col 9)"
      ]
    }
  ]
}