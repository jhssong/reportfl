{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/stat/regression/SimpleRegression.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimpleRegression",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 56,
      "end_line": 621,
      "comment": "\n * Estimates an ordinary least squares regression model\n * with one independent variable.\n * \u003cp\u003e\n * \u003ccode\u003e y \u003d intercept + slope * x  \u003c/code\u003e\u003c/p\u003e\n * \u003cp\u003e\n * Standard errors for \u003ccode\u003eintercept\u003c/code\u003e and \u003ccode\u003eslope\u003c/code\u003e are\n * available as well as ANOVA, r-square and Pearson\u0027s r statistics.\u003c/p\u003e\n * \u003cp\u003e\n * Observations (x,y pairs) can be added to the model one at a time or they\n * can be provided in a 2-dimensional array.  The observations are not stored\n * in memory, so there is no limit to the number of observations that can be\n * added to the model.\u003c/p\u003e\n * \u003cp\u003e\n * \u003cstrong\u003eUsage Notes\u003c/strong\u003e: \u003cul\u003e\n * \u003cli\u003e When there are fewer than two observations in the model, or when\n * there is no variation in the x values (i.e. all x values are the same)\n * all statistics return \u003ccode\u003eNaN\u003c/code\u003e. At least two observations with\n * different x coordinates are requred to estimate a bivariate regression\n * model.\n * \u003c/li\u003e\n * \u003cli\u003e getters for the statistics always compute values based on the current\n * set of observations -- i.e., you can get statistics, then add more data\n * and get updated statistics without using a new instance.  There is no\n * \"compute\" method that updates all statistics.  Each of the getters performs\n * the necessary computations to return the requested statistic.\u003c/li\u003e\n * \u003c/ul\u003e\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "distribution"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " the distribution used to compute inference statistics. "
    },
    {
      "type": "field",
      "varNames": [
        "sumX"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " sum of x values "
    },
    {
      "type": "field",
      "varNames": [
        "sumXX"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " total variation in x (sum of squared deviations from xbar) "
    },
    {
      "type": "field",
      "varNames": [
        "sumY"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " sum of y values "
    },
    {
      "type": "field",
      "varNames": [
        "sumYY"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " total variation in y (sum of squared deviations from ybar) "
    },
    {
      "type": "field",
      "varNames": [
        "sumXY"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " sum of products "
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " number of observations "
    },
    {
      "type": "field",
      "varNames": [
        "xbar"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " mean of accumulated x values, used in updating formulas "
    },
    {
      "type": "field",
      "varNames": [
        "ybar"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " mean of accumulated y values, used in updating formulas "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.SimpleRegression()",
      "begin_line": 93,
      "end_line": 95,
      "comment": "\n     * Create an empty SimpleRegression instance\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.SimpleRegression(org.apache.commons.math.distribution.TDistribution)",
      "begin_line": 103,
      "end_line": 106,
      "comment": "\n     * Create an empty SimpleRegression using the given distribution object to\n     * compute inference statistics.\n     * @param t the distribution used to compute inference statistics.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 16)",
        "(line 105,col 9)-(line 105,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.addData(double, double)",
      "begin_line": 121,
      "end_line": 141,
      "comment": "\n     * Adds the observation (x,y) to the regression data set.\n     * \u003cp\u003e\n     * Uses updating formulas for means and sums of squares defined in\n     * \"Algorithms for Computing the Sample Variance: Analysis and\n     * Recommendations\", Chan, T.F., Golub, G.H., and LeVeque, R.J.\n     * 1983, American Statistician, vol. 37, pp. 242-247, referenced in\n     * Weisberg, S. \"Applied Linear Regression\". 2nd Ed. 1985.\u003c/p\u003e\n     *\n     *\n     * @param x independent variable value\n     * @param y dependent variable value\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 133,col 9)",
        "(line 134,col 9)-(line 134,col 18)",
        "(line 135,col 9)-(line 135,col 18)",
        "(line 136,col 9)-(line 136,col 12)",
        "(line 138,col 9)-(line 140,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.removeData(double, double)",
      "begin_line": 157,
      "end_line": 174,
      "comment": "\n     * Removes the observation (x,y) from the regression data set.\n     * \u003cp\u003e\n     * Mirrors the addData method.  This method permits the use of\n     * SimpleRegression instances in streaming mode where the regression\n     * is applied to a sliding \"window\" of observations, however the caller is\n     * responsible for maintaining the set of observations in the window.\u003c/p\u003e\n     *\n     * The method has no effect if there are no points of data (i.e. n\u003d0)\n     *\n     * @param x independent variable value\n     * @param y dependent variable value\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 173,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.addData(double[][])",
      "begin_line": 192,
      "end_line": 196,
      "comment": "\n     * Adds the observations represented by the elements in\n     * \u003ccode\u003edata\u003c/code\u003e.\n     * \u003cp\u003e\n     * \u003ccode\u003e(data[0][0],data[0][1])\u003c/code\u003e will be the first observation, then\n     * \u003ccode\u003e(data[1][0],data[1][1])\u003c/code\u003e, etc.\u003c/p\u003e\n     * \u003cp\u003e\n     * This method does not replace data that has already been added.  The\n     * observations represented by \u003ccode\u003edata\u003c/code\u003e are added to the existing\n     * dataset.\u003c/p\u003e\n     * \u003cp\u003e\n     * To replace all data, use \u003ccode\u003eclear()\u003c/code\u003e before adding the new\n     * data.\u003c/p\u003e\n     *\n     * @param data array of observations to be added\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 195,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.removeData(double[][])",
      "begin_line": 212,
      "end_line": 216,
      "comment": "\n     * Removes observations represented by the elements in \u003ccode\u003edata\u003c/code\u003e.\n      * \u003cp\u003e\n     * If the array is larger than the current n, only the first n elements are\n     * processed.  This method permits the use of SimpleRegression instances in\n     * streaming mode where the regression is applied to a sliding \"window\" of\n     * observations, however the caller is responsible for maintaining the set\n     * of observations in the window.\u003c/p\u003e\n     * \u003cp\u003e\n     * To remove all data, use \u003ccode\u003eclear()\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param data array of observations to be removed\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 215,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.clear()",
      "begin_line": 221,
      "end_line": 228,
      "comment": "\n     * Clears all data from the model.\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 18)",
        "(line 223,col 9)-(line 223,col 19)",
        "(line 224,col 9)-(line 224,col 18)",
        "(line 225,col 9)-(line 225,col 19)",
        "(line 226,col 9)-(line 226,col 19)",
        "(line 227,col 9)-(line 227,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.getN()",
      "begin_line": 235,
      "end_line": 237,
      "comment": "\n     * Returns the number of observations that have been added to the model.\n     *\n     * @return n number of observations that have been added.\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.predict(double)",
      "begin_line": 256,
      "end_line": 259,
      "comment": "\n     * Returns the \"predicted\" \u003ccode\u003ey\u003c/code\u003e value associated with the\n     * supplied \u003ccode\u003ex\u003c/code\u003e value,  based on the data that has been\n     * added to the model when this method is activated.\n     * \u003cp\u003e\n     * \u003ccode\u003e predict(x) \u003d intercept + slope * x \u003c/code\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eAt least two observations (with at least two different x values)\n     * must have been added before invoking this method. If this method is\n     * invoked before a model can be estimated, \u003ccode\u003eDouble,NaN\u003c/code\u003e is\n     * returned.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param x input \u003ccode\u003ex\u003c/code\u003e value\n     * @return predicted \u003ccode\u003ey\u003c/code\u003e value\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 31)",
        "(line 258,col 9)-(line 258,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.getIntercept()",
      "begin_line": 277,
      "end_line": 279,
      "comment": "\n     * Returns the intercept of the estimated regression line.\n     * \u003cp\u003e\n     * The least squares estimate of the intercept is computed using the\n     * \u003ca href\u003d\"http://www.xycoon.com/estimation4.htm\"\u003enormal equations\u003c/a\u003e.\n     * The intercept is sometimes denoted b0.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eAt least two observations (with at least two different x values)\n     * must have been added before invoking this method. If this method is\n     * invoked before a model can be estimated, \u003ccode\u003eDouble,NaN\u003c/code\u003e is\n     * returned.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @return the intercept of the regression line\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.getSlope()",
      "begin_line": 297,
      "end_line": 305,
      "comment": "\n    * Returns the slope of the estimated regression line.\n    * \u003cp\u003e\n    * The least squares estimate of the slope is computed using the\n    * \u003ca href\u003d\"http://www.xycoon.com/estimation4.htm\"\u003enormal equations\u003c/a\u003e.\n    * The slope is sometimes denoted b1.\u003c/p\u003e\n    * \u003cp\u003e\n    * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n    * \u003cli\u003eAt least two observations (with at least two different x values)\n    * must have been added before invoking this method. If this method is\n    * invoked before a model can be estimated, \u003ccode\u003eDouble.NaN\u003c/code\u003e is\n    * returned.\n    * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n    *\n    * @return the slope of the regression line\n    ",
      "child_ranges": [
        "(line 298,col 9)-(line 300,col 9)",
        "(line 301,col 9)-(line 303,col 9)",
        "(line 304,col 9)-(line 304,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.getSumSquaredErrors()",
      "begin_line": 336,
      "end_line": 338,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://www.xycoon.com/SumOfSquares.htm\"\u003e\n     * sum of squared errors\u003c/a\u003e (SSE) associated with the regression\n     * model.\n     * \u003cp\u003e\n     * The sum is computed using the computational formula\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003ccode\u003eSSE \u003d SYY - (SXY * SXY / SXX)\u003c/code\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * where \u003ccode\u003eSYY\u003c/code\u003e is the sum of the squared deviations of the y\n     * values about their mean, \u003ccode\u003eSXX\u003c/code\u003e is similarly defined and\n     * \u003ccode\u003eSXY\u003c/code\u003e is the sum of the products of x and y mean deviations.\n     * \u003c/p\u003e\u003cp\u003e\n     * The sums are accumulated using the updating algorithm referenced in\n     * {@link #addData}.\u003c/p\u003e\n     * \u003cp\u003e\n     * The return value is constrained to be non-negative - i.e., if due to\n     * rounding errors the computational formula returns a negative result,\n     * 0 is returned.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eAt least two observations (with at least two different x values)\n     * must have been added before invoking this method. If this method is\n     * invoked before a model can be estimated, \u003ccode\u003eDouble,NaN\u003c/code\u003e is\n     * returned.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @return sum of squared errors associated with the regression model\n     ",
      "child_ranges": [
        "(line 337,col 9)-(line 337,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.getTotalSumSquares()",
      "begin_line": 350,
      "end_line": 355,
      "comment": "\n     * Returns the sum of squared deviations of the y values about their mean.\n     * \u003cp\u003e\n     * This is defined as SSTO\n     * \u003ca href\u003d\"http://www.xycoon.com/SumOfSquares.htm\"\u003ehere\u003c/a\u003e.\u003c/p\u003e\n     * \u003cp\u003e\n     * If \u003ccode\u003en \u003c 2\u003c/code\u003e, this returns \u003ccode\u003eDouble.NaN\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return sum of squared deviations of y values\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 353,col 9)",
        "(line 354,col 9)-(line 354,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.getXSumSquares()",
      "begin_line": 364,
      "end_line": 369,
      "comment": "\n     * Returns the sum of squared deviations of the x values about their mean.\n     *\n     * If \u003ccode\u003en \u003c 2\u003c/code\u003e, this returns \u003ccode\u003eDouble.NaN\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return sum of squared deviations of x values\n     ",
      "child_ranges": [
        "(line 365,col 9)-(line 367,col 9)",
        "(line 368,col 9)-(line 368,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.getSumOfCrossProducts()",
      "begin_line": 376,
      "end_line": 378,
      "comment": "\n     * Returns the sum of crossproducts, x\u003csub\u003ei\u003c/sub\u003e*y\u003csub\u003ei\u003c/sub\u003e.\n     *\n     * @return sum of cross products\n     ",
      "child_ranges": [
        "(line 377,col 9)-(line 377,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.getRegressionSumSquares()",
      "begin_line": 396,
      "end_line": 398,
      "comment": "\n     * Returns the sum of squared deviations of the predicted y values about\n     * their mean (which equals the mean of y).\n     * \u003cp\u003e\n     * This is usually abbreviated SSR or SSM.  It is defined as SSM\n     * \u003ca href\u003d\"http://www.xycoon.com/SumOfSquares.htm\"\u003ehere\u003c/a\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eAt least two observations (with at least two different x values)\n     * must have been added before invoking this method. If this method is\n     * invoked before a model can be estimated, \u003ccode\u003eDouble.NaN\u003c/code\u003e is\n     * returned.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @return sum of squared deviations of predicted y values\n     ",
      "child_ranges": [
        "(line 397,col 9)-(line 397,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.getMeanSquareError()",
      "begin_line": 410,
      "end_line": 415,
      "comment": "\n     * Returns the sum of squared errors divided by the degrees of freedom,\n     * usually abbreviated MSE.\n     * \u003cp\u003e\n     * If there are fewer than \u003cstrong\u003ethree\u003c/strong\u003e data pairs in the model,\n     * or if there is no variation in \u003ccode\u003ex\u003c/code\u003e, this returns\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return sum of squared deviations of y values\n     ",
      "child_ranges": [
        "(line 411,col 9)-(line 413,col 9)",
        "(line 414,col 9)-(line 414,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.getR()",
      "begin_line": 431,
      "end_line": 438,
      "comment": "\n     * Returns \u003ca href\u003d\"http://mathworld.wolfram.com/CorrelationCoefficient.html\"\u003e\n     * Pearson\u0027s product moment correlation coefficient\u003c/a\u003e,\n     * usually denoted r.\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eAt least two observations (with at least two different x values)\n     * must have been added before invoking this method. If this method is\n     * invoked before a model can be estimated, \u003ccode\u003eDouble,NaN\u003c/code\u003e is\n     * returned.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @return Pearson\u0027s r\n     ",
      "child_ranges": [
        "(line 432,col 9)-(line 432,col 31)",
        "(line 433,col 9)-(line 433,col 48)",
        "(line 434,col 9)-(line 436,col 9)",
        "(line 437,col 9)-(line 437,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.getRSquare()",
      "begin_line": 454,
      "end_line": 457,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://www.xycoon.com/coefficient1.htm\"\u003e\n     * coefficient of determination\u003c/a\u003e,\n     * usually denoted r-square.\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eAt least two observations (with at least two different x values)\n     * must have been added before invoking this method. If this method is\n     * invoked before a model can be estimated, \u003ccode\u003eDouble,NaN\u003c/code\u003e is\n     * returned.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @return r-square\n     ",
      "child_ranges": [
        "(line 455,col 9)-(line 455,col 43)",
        "(line 456,col 9)-(line 456,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.getInterceptStdErr()",
      "begin_line": 470,
      "end_line": 473,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://www.xycoon.com/standarderrorb0.htm\"\u003e\n     * standard error of the intercept estimate\u003c/a\u003e,\n     * usually denoted s(b0).\n     * \u003cp\u003e\n     * If there are fewer that \u003cstrong\u003ethree\u003c/strong\u003e observations in the\n     * model, or if there is no variation in x, this returns\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return standard error associated with intercept estimate\n     ",
      "child_ranges": [
        "(line 471,col 9)-(line 472,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.getSlopeStdErr()",
      "begin_line": 486,
      "end_line": 488,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://www.xycoon.com/standerrorb(1).htm\"\u003estandard\n     * error of the slope estimate\u003c/a\u003e,\n     * usually denoted s(b1).\n     * \u003cp\u003e\n     * If there are fewer that \u003cstrong\u003ethree\u003c/strong\u003e data pairs in the model,\n     * or if there is no variation in x, this returns \u003ccode\u003eDouble.NaN\u003c/code\u003e.\n     * \u003c/p\u003e\n     *\n     * @return standard error associated with slope estimate\n     ",
      "child_ranges": [
        "(line 487,col 9)-(line 487,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.getSlopeConfidenceInterval()",
      "begin_line": 512,
      "end_line": 514,
      "comment": "\n     * Returns the half-width of a 95% confidence interval for the slope\n     * estimate.\n     * \u003cp\u003e\n     * The 95% confidence interval is\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003ccode\u003e(getSlope() - getSlopeConfidenceInterval(),\n     * getSlope() + getSlopeConfidenceInterval())\u003c/code\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * If there are fewer that \u003cstrong\u003ethree\u003c/strong\u003e observations in the\n     * model, or if there is no variation in x, this returns\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note\u003c/strong\u003e:\u003cbr\u003e\n     * The validity of this statistic depends on the assumption that the\n     * observations included in the model are drawn from a\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/BivariateNormalDistribution.html\"\u003e\n     * Bivariate Normal Distribution\u003c/a\u003e.\u003c/p\u003e\n     *\n     * @return half-width of 95% confidence interval for the slope estimate\n     * @throws MathException if the confidence interval can not be computed.\n     ",
      "child_ranges": [
        "(line 513,col 9)-(line 513,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.getSlopeConfidenceInterval(double)",
      "begin_line": 547,
      "end_line": 556,
      "comment": "\n     * Returns the half-width of a (100-100*alpha)% confidence interval for\n     * the slope estimate.\n     * \u003cp\u003e\n     * The (100-100*alpha)% confidence interval is \u003c/p\u003e\n     * \u003cp\u003e\n     * \u003ccode\u003e(getSlope() - getSlopeConfidenceInterval(),\n     * getSlope() + getSlopeConfidenceInterval())\u003c/code\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * To request, for example, a 99% confidence interval, use\n     * \u003ccode\u003ealpha \u003d .01\u003c/code\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note\u003c/strong\u003e:\u003cbr\u003e\n     * The validity of this statistic depends on the assumption that the\n     * observations included in the model are drawn from a\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/BivariateNormalDistribution.html\"\u003e\n     * Bivariate Normal Distribution\u003c/a\u003e.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003e Preconditions:\u003c/strong\u003e\u003cul\u003e\n     * \u003cli\u003eIf there are fewer that \u003cstrong\u003ethree\u003c/strong\u003e observations in the\n     * model, or if there is no variation in x, this returns\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e.\n     * \u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003e(0 \u003c alpha \u003c 1)\u003c/code\u003e; otherwise an\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param alpha the desired significance level\n     * @return half-width of 95% confidence interval for the slope estimate\n     * @throws MathException if the confidence interval can not be computed.\n     ",
      "child_ranges": [
        "(line 549,col 9)-(line 553,col 9)",
        "(line 554,col 9)-(line 555,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.getSignificance()",
      "begin_line": 579,
      "end_line": 582,
      "comment": "\n     * Returns the significance level of the slope (equiv) correlation.\n     * \u003cp\u003e\n     * Specifically, the returned value is the smallest \u003ccode\u003ealpha\u003c/code\u003e\n     * such that the slope confidence interval with significance level\n     * equal to \u003ccode\u003ealpha\u003c/code\u003e does not include \u003ccode\u003e0\u003c/code\u003e.\n     * On regression output, this is often denoted \u003ccode\u003eProb(|t| \u003e 0)\u003c/code\u003e\n     * \u003c/p\u003e\u003cp\u003e\n     * \u003cstrong\u003eUsage Note\u003c/strong\u003e:\u003cbr\u003e\n     * The validity of this statistic depends on the assumption that the\n     * observations included in the model are drawn from a\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/BivariateNormalDistribution.html\"\u003e\n     * Bivariate Normal Distribution\u003c/a\u003e.\u003c/p\u003e\n     * \u003cp\u003e\n     * If there are fewer that \u003cstrong\u003ethree\u003c/strong\u003e observations in the\n     * model, or if there is no variation in x, this returns\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return significance level for slope/correlation\n     * @throws MathException if the significance level can not be computed.\n     ",
      "child_ranges": [
        "(line 580,col 9)-(line 581,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.getIntercept(double)",
      "begin_line": 594,
      "end_line": 596,
      "comment": "\n    * Returns the intercept of the estimated regression line, given the slope.\n    * \u003cp\u003e\n    * Will return \u003ccode\u003eNaN\u003c/code\u003e if slope is \u003ccode\u003eNaN\u003c/code\u003e.\u003c/p\u003e\n    *\n    * @param slope current slope\n    * @return the intercept of the regression line\n    ",
      "child_ranges": [
        "(line 595,col 9)-(line 595,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.getRegressionSumSquares(double)",
      "begin_line": 604,
      "end_line": 606,
      "comment": "\n     * Computes SSR from b1.\n     *\n     * @param slope regression slope estimate\n     * @return sum of squared deviations of predicted y values\n     ",
      "child_ranges": [
        "(line 605,col 9)-(line 605,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.setDistribution(org.apache.commons.math.distribution.TDistribution)",
      "begin_line": 613,
      "end_line": 620,
      "comment": "\n     * Modify the distribution used to compute inference statistics.\n     * @param value the new distribution\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 614,col 9)-(line 614,col 29)",
        "(line 617,col 9)-(line 619,col 9)"
      ]
    }
  ]
}