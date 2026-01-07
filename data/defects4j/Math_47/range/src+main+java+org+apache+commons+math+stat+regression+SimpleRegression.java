{
  "filepath": "/tmp/Math-47b/src/main/java/org/apache/commons/math/stat/regression/SimpleRegression.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimpleRegression",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 58,
      "end_line": 588,
      "comment": "\n * Estimates an ordinary least squares regression model\n * with one independent variable.\n * \u003cp\u003e\n * \u003ccode\u003e y \u003d intercept + slope * x  \u003c/code\u003e\u003c/p\u003e\n * \u003cp\u003e\n * Standard errors for \u003ccode\u003eintercept\u003c/code\u003e and \u003ccode\u003eslope\u003c/code\u003e are\n * available as well as ANOVA, r-square and Pearson\u0027s r statistics.\u003c/p\u003e\n * \u003cp\u003e\n * Observations (x,y pairs) can be added to the model one at a time or they\n * can be provided in a 2-dimensional array.  The observations are not stored\n * in memory, so there is no limit to the number of observations that can be\n * added to the model.\u003c/p\u003e\n * \u003cp\u003e\n * \u003cstrong\u003eUsage Notes\u003c/strong\u003e: \u003cul\u003e\n * \u003cli\u003e When there are fewer than two observations in the model, or when\n * there is no variation in the x values (i.e. all x values are the same)\n * all statistics return \u003ccode\u003eNaN\u003c/code\u003e. At least two observations with\n * different x coordinates are required to estimate a bivariate regression\n * model.\n * \u003c/li\u003e\n * \u003cli\u003e getters for the statistics always compute values based on the current\n * set of observations -- i.e., you can get statistics, then add more data\n * and get updated statistics without using a new instance.  There is no\n * \"compute\" method that updates all statistics.  Each of the getters performs\n * the necessary computations to return the requested statistic.\u003c/li\u003e\n * \u003c/ul\u003e\u003c/p\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "sumX"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " sum of x values "
    },
    {
      "type": "field",
      "varNames": [
        "sumXX"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " total variation in x (sum of squared deviations from xbar) "
    },
    {
      "type": "field",
      "varNames": [
        "sumY"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " sum of y values "
    },
    {
      "type": "field",
      "varNames": [
        "sumYY"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " total variation in y (sum of squared deviations from ybar) "
    },
    {
      "type": "field",
      "varNames": [
        "sumXY"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " sum of products "
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " number of observations "
    },
    {
      "type": "field",
      "varNames": [
        "xbar"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " mean of accumulated x values, used in updating formulas "
    },
    {
      "type": "field",
      "varNames": [
        "ybar"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " mean of accumulated y values, used in updating formulas "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.SimpleRegression()",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\n     * Create an empty SimpleRegression instance\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.addData(double, double)",
      "begin_line": 109,
      "end_line": 125,
      "comment": "\n     * Adds the observation (x,y) to the regression data set.\n     * \u003cp\u003e\n     * Uses updating formulas for means and sums of squares defined in\n     * \"Algorithms for Computing the Sample Variance: Analysis and\n     * Recommendations\", Chan, T.F., Golub, G.H., and LeVeque, R.J.\n     * 1983, American Statistician, vol. 37, pp. 242-247, referenced in\n     * Weisberg, S. \"Applied Linear Regression\". 2nd Ed. 1985.\u003c/p\u003e\n     *\n     *\n     * @param x independent variable value\n     * @param y dependent variable value\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 121,col 9)",
        "(line 122,col 9)-(line 122,col 18)",
        "(line 123,col 9)-(line 123,col 18)",
        "(line 124,col 9)-(line 124,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.removeData(double, double)",
      "begin_line": 141,
      "end_line": 154,
      "comment": "\n     * Removes the observation (x,y) from the regression data set.\n     * \u003cp\u003e\n     * Mirrors the addData method.  This method permits the use of\n     * SimpleRegression instances in streaming mode where the regression\n     * is applied to a sliding \"window\" of observations, however the caller is\n     * responsible for maintaining the set of observations in the window.\u003c/p\u003e\n     *\n     * The method has no effect if there are no points of data (i.e. n\u003d0)\n     *\n     * @param x independent variable value\n     * @param y dependent variable value\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 153,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.addData(double[][])",
      "begin_line": 172,
      "end_line": 176,
      "comment": "\n     * Adds the observations represented by the elements in\n     * \u003ccode\u003edata\u003c/code\u003e.\n     * \u003cp\u003e\n     * \u003ccode\u003e(data[0][0],data[0][1])\u003c/code\u003e will be the first observation, then\n     * \u003ccode\u003e(data[1][0],data[1][1])\u003c/code\u003e, etc.\u003c/p\u003e\n     * \u003cp\u003e\n     * This method does not replace data that has already been added.  The\n     * observations represented by \u003ccode\u003edata\u003c/code\u003e are added to the existing\n     * dataset.\u003c/p\u003e\n     * \u003cp\u003e\n     * To replace all data, use \u003ccode\u003eclear()\u003c/code\u003e before adding the new\n     * data.\u003c/p\u003e\n     *\n     * @param data array of observations to be added\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 175,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.removeData(double[][])",
      "begin_line": 192,
      "end_line": 196,
      "comment": "\n     * Removes observations represented by the elements in \u003ccode\u003edata\u003c/code\u003e.\n      * \u003cp\u003e\n     * If the array is larger than the current n, only the first n elements are\n     * processed.  This method permits the use of SimpleRegression instances in\n     * streaming mode where the regression is applied to a sliding \"window\" of\n     * observations, however the caller is responsible for maintaining the set\n     * of observations in the window.\u003c/p\u003e\n     * \u003cp\u003e\n     * To remove all data, use \u003ccode\u003eclear()\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param data array of observations to be removed\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 195,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.clear()",
      "begin_line": 201,
      "end_line": 208,
      "comment": "\n     * Clears all data from the model.\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 18)",
        "(line 203,col 9)-(line 203,col 19)",
        "(line 204,col 9)-(line 204,col 18)",
        "(line 205,col 9)-(line 205,col 19)",
        "(line 206,col 9)-(line 206,col 19)",
        "(line 207,col 9)-(line 207,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.getN()",
      "begin_line": 215,
      "end_line": 217,
      "comment": "\n     * Returns the number of observations that have been added to the model.\n     *\n     * @return n number of observations that have been added.\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.predict(double)",
      "begin_line": 236,
      "end_line": 239,
      "comment": "\n     * Returns the \"predicted\" \u003ccode\u003ey\u003c/code\u003e value associated with the\n     * supplied \u003ccode\u003ex\u003c/code\u003e value,  based on the data that has been\n     * added to the model when this method is activated.\n     * \u003cp\u003e\n     * \u003ccode\u003e predict(x) \u003d intercept + slope * x \u003c/code\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eAt least two observations (with at least two different x values)\n     * must have been added before invoking this method. If this method is\n     * invoked before a model can be estimated, \u003ccode\u003eDouble,NaN\u003c/code\u003e is\n     * returned.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param x input \u003ccode\u003ex\u003c/code\u003e value\n     * @return predicted \u003ccode\u003ey\u003c/code\u003e value\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 31)",
        "(line 238,col 9)-(line 238,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.getIntercept()",
      "begin_line": 257,
      "end_line": 259,
      "comment": "\n     * Returns the intercept of the estimated regression line.\n     * \u003cp\u003e\n     * The least squares estimate of the intercept is computed using the\n     * \u003ca href\u003d\"http://www.xycoon.com/estimation4.htm\"\u003enormal equations\u003c/a\u003e.\n     * The intercept is sometimes denoted b0.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eAt least two observations (with at least two different x values)\n     * must have been added before invoking this method. If this method is\n     * invoked before a model can be estimated, \u003ccode\u003eDouble,NaN\u003c/code\u003e is\n     * returned.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @return the intercept of the regression line\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.getSlope()",
      "begin_line": 277,
      "end_line": 285,
      "comment": "\n    * Returns the slope of the estimated regression line.\n    * \u003cp\u003e\n    * The least squares estimate of the slope is computed using the\n    * \u003ca href\u003d\"http://www.xycoon.com/estimation4.htm\"\u003enormal equations\u003c/a\u003e.\n    * The slope is sometimes denoted b1.\u003c/p\u003e\n    * \u003cp\u003e\n    * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n    * \u003cli\u003eAt least two observations (with at least two different x values)\n    * must have been added before invoking this method. If this method is\n    * invoked before a model can be estimated, \u003ccode\u003eDouble.NaN\u003c/code\u003e is\n    * returned.\n    * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n    *\n    * @return the slope of the regression line\n    ",
      "child_ranges": [
        "(line 278,col 9)-(line 280,col 9)",
        "(line 281,col 9)-(line 283,col 9)",
        "(line 284,col 9)-(line 284,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.getSumSquaredErrors()",
      "begin_line": 316,
      "end_line": 318,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://www.xycoon.com/SumOfSquares.htm\"\u003e\n     * sum of squared errors\u003c/a\u003e (SSE) associated with the regression\n     * model.\n     * \u003cp\u003e\n     * The sum is computed using the computational formula\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003ccode\u003eSSE \u003d SYY - (SXY * SXY / SXX)\u003c/code\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * where \u003ccode\u003eSYY\u003c/code\u003e is the sum of the squared deviations of the y\n     * values about their mean, \u003ccode\u003eSXX\u003c/code\u003e is similarly defined and\n     * \u003ccode\u003eSXY\u003c/code\u003e is the sum of the products of x and y mean deviations.\n     * \u003c/p\u003e\u003cp\u003e\n     * The sums are accumulated using the updating algorithm referenced in\n     * {@link #addData}.\u003c/p\u003e\n     * \u003cp\u003e\n     * The return value is constrained to be non-negative - i.e., if due to\n     * rounding errors the computational formula returns a negative result,\n     * 0 is returned.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eAt least two observations (with at least two different x values)\n     * must have been added before invoking this method. If this method is\n     * invoked before a model can be estimated, \u003ccode\u003eDouble,NaN\u003c/code\u003e is\n     * returned.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @return sum of squared errors associated with the regression model\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.getTotalSumSquares()",
      "begin_line": 330,
      "end_line": 335,
      "comment": "\n     * Returns the sum of squared deviations of the y values about their mean.\n     * \u003cp\u003e\n     * This is defined as SSTO\n     * \u003ca href\u003d\"http://www.xycoon.com/SumOfSquares.htm\"\u003ehere\u003c/a\u003e.\u003c/p\u003e\n     * \u003cp\u003e\n     * If \u003ccode\u003en \u003c 2\u003c/code\u003e, this returns \u003ccode\u003eDouble.NaN\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return sum of squared deviations of y values\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 333,col 9)",
        "(line 334,col 9)-(line 334,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.getXSumSquares()",
      "begin_line": 344,
      "end_line": 349,
      "comment": "\n     * Returns the sum of squared deviations of the x values about their mean.\n     *\n     * If \u003ccode\u003en \u003c 2\u003c/code\u003e, this returns \u003ccode\u003eDouble.NaN\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return sum of squared deviations of x values\n     ",
      "child_ranges": [
        "(line 345,col 9)-(line 347,col 9)",
        "(line 348,col 9)-(line 348,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.getSumOfCrossProducts()",
      "begin_line": 356,
      "end_line": 358,
      "comment": "\n     * Returns the sum of crossproducts, x\u003csub\u003ei\u003c/sub\u003e*y\u003csub\u003ei\u003c/sub\u003e.\n     *\n     * @return sum of cross products\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.getRegressionSumSquares()",
      "begin_line": 376,
      "end_line": 378,
      "comment": "\n     * Returns the sum of squared deviations of the predicted y values about\n     * their mean (which equals the mean of y).\n     * \u003cp\u003e\n     * This is usually abbreviated SSR or SSM.  It is defined as SSM\n     * \u003ca href\u003d\"http://www.xycoon.com/SumOfSquares.htm\"\u003ehere\u003c/a\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eAt least two observations (with at least two different x values)\n     * must have been added before invoking this method. If this method is\n     * invoked before a model can be estimated, \u003ccode\u003eDouble.NaN\u003c/code\u003e is\n     * returned.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @return sum of squared deviations of predicted y values\n     ",
      "child_ranges": [
        "(line 377,col 9)-(line 377,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.getMeanSquareError()",
      "begin_line": 390,
      "end_line": 395,
      "comment": "\n     * Returns the sum of squared errors divided by the degrees of freedom,\n     * usually abbreviated MSE.\n     * \u003cp\u003e\n     * If there are fewer than \u003cstrong\u003ethree\u003c/strong\u003e data pairs in the model,\n     * or if there is no variation in \u003ccode\u003ex\u003c/code\u003e, this returns\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return sum of squared deviations of y values\n     ",
      "child_ranges": [
        "(line 391,col 9)-(line 393,col 9)",
        "(line 394,col 9)-(line 394,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.getR()",
      "begin_line": 411,
      "end_line": 418,
      "comment": "\n     * Returns \u003ca href\u003d\"http://mathworld.wolfram.com/CorrelationCoefficient.html\"\u003e\n     * Pearson\u0027s product moment correlation coefficient\u003c/a\u003e,\n     * usually denoted r.\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eAt least two observations (with at least two different x values)\n     * must have been added before invoking this method. If this method is\n     * invoked before a model can be estimated, \u003ccode\u003eDouble,NaN\u003c/code\u003e is\n     * returned.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @return Pearson\u0027s r\n     ",
      "child_ranges": [
        "(line 412,col 9)-(line 412,col 31)",
        "(line 413,col 9)-(line 413,col 52)",
        "(line 414,col 9)-(line 416,col 9)",
        "(line 417,col 9)-(line 417,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.getRSquare()",
      "begin_line": 434,
      "end_line": 437,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://www.xycoon.com/coefficient1.htm\"\u003e\n     * coefficient of determination\u003c/a\u003e,\n     * usually denoted r-square.\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eAt least two observations (with at least two different x values)\n     * must have been added before invoking this method. If this method is\n     * invoked before a model can be estimated, \u003ccode\u003eDouble,NaN\u003c/code\u003e is\n     * returned.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @return r-square\n     ",
      "child_ranges": [
        "(line 435,col 9)-(line 435,col 43)",
        "(line 436,col 9)-(line 436,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.getInterceptStdErr()",
      "begin_line": 450,
      "end_line": 453,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://www.xycoon.com/standarderrorb0.htm\"\u003e\n     * standard error of the intercept estimate\u003c/a\u003e,\n     * usually denoted s(b0).\n     * \u003cp\u003e\n     * If there are fewer that \u003cstrong\u003ethree\u003c/strong\u003e observations in the\n     * model, or if there is no variation in x, this returns\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return standard error associated with intercept estimate\n     ",
      "child_ranges": [
        "(line 451,col 9)-(line 452,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.getSlopeStdErr()",
      "begin_line": 466,
      "end_line": 468,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://www.xycoon.com/standerrorb(1).htm\"\u003estandard\n     * error of the slope estimate\u003c/a\u003e,\n     * usually denoted s(b1).\n     * \u003cp\u003e\n     * If there are fewer that \u003cstrong\u003ethree\u003c/strong\u003e data pairs in the model,\n     * or if there is no variation in x, this returns \u003ccode\u003eDouble.NaN\u003c/code\u003e.\n     * \u003c/p\u003e\n     *\n     * @return standard error associated with slope estimate\n     ",
      "child_ranges": [
        "(line 467,col 9)-(line 467,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.getSlopeConfidenceInterval()",
      "begin_line": 492,
      "end_line": 494,
      "comment": "\n     * Returns the half-width of a 95% confidence interval for the slope\n     * estimate.\n     * \u003cp\u003e\n     * The 95% confidence interval is\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003ccode\u003e(getSlope() - getSlopeConfidenceInterval(),\n     * getSlope() + getSlopeConfidenceInterval())\u003c/code\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * If there are fewer that \u003cstrong\u003ethree\u003c/strong\u003e observations in the\n     * model, or if there is no variation in x, this returns\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note\u003c/strong\u003e:\u003cbr\u003e\n     * The validity of this statistic depends on the assumption that the\n     * observations included in the model are drawn from a\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/BivariateNormalDistribution.html\"\u003e\n     * Bivariate Normal Distribution\u003c/a\u003e.\u003c/p\u003e\n     *\n     * @return half-width of 95% confidence interval for the slope estimate\n     * @throws MathException if the confidence interval can not be computed.\n     ",
      "child_ranges": [
        "(line 493,col 9)-(line 493,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.getSlopeConfidenceInterval(double)",
      "begin_line": 527,
      "end_line": 536,
      "comment": "\n     * Returns the half-width of a (100-100*alpha)% confidence interval for\n     * the slope estimate.\n     * \u003cp\u003e\n     * The (100-100*alpha)% confidence interval is \u003c/p\u003e\n     * \u003cp\u003e\n     * \u003ccode\u003e(getSlope() - getSlopeConfidenceInterval(),\n     * getSlope() + getSlopeConfidenceInterval())\u003c/code\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * To request, for example, a 99% confidence interval, use\n     * \u003ccode\u003ealpha \u003d .01\u003c/code\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note\u003c/strong\u003e:\u003cbr\u003e\n     * The validity of this statistic depends on the assumption that the\n     * observations included in the model are drawn from a\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/BivariateNormalDistribution.html\"\u003e\n     * Bivariate Normal Distribution\u003c/a\u003e.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003e Preconditions:\u003c/strong\u003e\u003cul\u003e\n     * \u003cli\u003eIf there are fewer that \u003cstrong\u003ethree\u003c/strong\u003e observations in the\n     * model, or if there is no variation in x, this returns\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e.\n     * \u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003e(0 \u003c alpha \u003c 1)\u003c/code\u003e; otherwise an\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param alpha the desired significance level\n     * @return half-width of 95% confidence interval for the slope estimate\n     * @throws MathException if the confidence interval can not be computed.\n     ",
      "child_ranges": [
        "(line 529,col 9)-(line 532,col 9)",
        "(line 533,col 9)-(line 533,col 66)",
        "(line 534,col 9)-(line 535,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.getSignificance()",
      "begin_line": 559,
      "end_line": 563,
      "comment": "\n     * Returns the significance level of the slope (equiv) correlation.\n     * \u003cp\u003e\n     * Specifically, the returned value is the smallest \u003ccode\u003ealpha\u003c/code\u003e\n     * such that the slope confidence interval with significance level\n     * equal to \u003ccode\u003ealpha\u003c/code\u003e does not include \u003ccode\u003e0\u003c/code\u003e.\n     * On regression output, this is often denoted \u003ccode\u003eProb(|t| \u003e 0)\u003c/code\u003e\n     * \u003c/p\u003e\u003cp\u003e\n     * \u003cstrong\u003eUsage Note\u003c/strong\u003e:\u003cbr\u003e\n     * The validity of this statistic depends on the assumption that the\n     * observations included in the model are drawn from a\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/BivariateNormalDistribution.html\"\u003e\n     * Bivariate Normal Distribution\u003c/a\u003e.\u003c/p\u003e\n     * \u003cp\u003e\n     * If there are fewer that \u003cstrong\u003ethree\u003c/strong\u003e observations in the\n     * model, or if there is no variation in x, this returns\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return significance level for slope/correlation\n     * @throws MathException if the significance level can not be computed.\n     ",
      "child_ranges": [
        "(line 560,col 9)-(line 560,col 66)",
        "(line 561,col 9)-(line 562,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.getIntercept(double)",
      "begin_line": 575,
      "end_line": 577,
      "comment": "\n    * Returns the intercept of the estimated regression line, given the slope.\n    * \u003cp\u003e\n    * Will return \u003ccode\u003eNaN\u003c/code\u003e if slope is \u003ccode\u003eNaN\u003c/code\u003e.\u003c/p\u003e\n    *\n    * @param slope current slope\n    * @return the intercept of the regression line\n    ",
      "child_ranges": [
        "(line 576,col 9)-(line 576,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.getRegressionSumSquares(double)",
      "begin_line": 585,
      "end_line": 587,
      "comment": "\n     * Computes SSR from b1.\n     *\n     * @param slope regression slope estimate\n     * @return sum of squared deviations of predicted y values\n     ",
      "child_ranges": [
        "(line 586,col 9)-(line 586,col 37)"
      ]
    }
  ]
}