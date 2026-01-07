{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/stat/regression/SimpleRegression.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimpleRegression",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable",
        "org.apache.commons.math3.stat.regression.UpdatingMultipleLinearRegression"
      ],
      "begin_line": 64,
      "end_line": 891,
      "comment": "\n * Estimates an ordinary least squares regression model\n * with one independent variable.\n * \u003cp\u003e\n * \u003ccode\u003e y \u003d intercept + slope * x  \u003c/code\u003e\u003c/p\u003e\n * \u003cp\u003e\n * Standard errors for \u003ccode\u003eintercept\u003c/code\u003e and \u003ccode\u003eslope\u003c/code\u003e are\n * available as well as ANOVA, r-square and Pearson\u0027s r statistics.\u003c/p\u003e\n * \u003cp\u003e\n * Observations (x,y pairs) can be added to the model one at a time or they\n * can be provided in a 2-dimensional array.  The observations are not stored\n * in memory, so there is no limit to the number of observations that can be\n * added to the model.\u003c/p\u003e\n * \u003cp\u003e\n * \u003cstrong\u003eUsage Notes\u003c/strong\u003e: \u003cul\u003e\n * \u003cli\u003e When there are fewer than two observations in the model, or when\n * there is no variation in the x values (i.e. all x values are the same)\n * all statistics return \u003ccode\u003eNaN\u003c/code\u003e. At least two observations with\n * different x coordinates are required to estimate a bivariate regression\n * model.\n * \u003c/li\u003e\n * \u003cli\u003e Getters for the statistics always compute values based on the current\n * set of observations -- i.e., you can get statistics, then add more data\n * and get updated statistics without using a new instance.  There is no\n * \"compute\" method that updates all statistics.  Each of the getters performs\n * the necessary computations to return the requested statistic.\n * \u003c/li\u003e\n * \u003cli\u003e The intercept term may be suppressed by passing {@code false} to\n * the {@link #SimpleRegression(boolean)} constructor.  When the\n * {@code hasIntercept} property is false, the model is estimated without a\n * constant term and {@link #getIntercept()} returns {@code 0}.\u003c/li\u003e\n * \u003c/ul\u003e\u003c/p\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "sumX"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " sum of x values "
    },
    {
      "type": "field",
      "varNames": [
        "sumXX"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " total variation in x (sum of squared deviations from xbar) "
    },
    {
      "type": "field",
      "varNames": [
        "sumY"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " sum of y values "
    },
    {
      "type": "field",
      "varNames": [
        "sumYY"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " total variation in y (sum of squared deviations from ybar) "
    },
    {
      "type": "field",
      "varNames": [
        "sumXY"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " sum of products "
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " number of observations "
    },
    {
      "type": "field",
      "varNames": [
        "xbar"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " mean of accumulated x values, used in updating formulas "
    },
    {
      "type": "field",
      "varNames": [
        "ybar"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " mean of accumulated y values, used in updating formulas "
    },
    {
      "type": "field",
      "varNames": [
        "hasIntercept"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " include an intercept or not "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegression.SimpleRegression()",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\n     * Create an empty SimpleRegression instance\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegression.SimpleRegression(boolean)",
      "begin_line": 114,
      "end_line": 117,
      "comment": "\n    * Create a SimpleRegression instance, specifying whether or not to estimate\n    * an intercept.\n    *\n    * \u003cp\u003eUse {@code false} to estimate a model with no intercept.  When the\n    * {@code hasIntercept} property is false, the model is estimated without a\n    * constant term and {@link #getIntercept()} returns {@code 0}.\u003c/p\u003e\n    *\n    * @param includeIntercept whether or not to include an intercept term in\n    * the regression model\n    ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 16)",
        "(line 116,col 9)-(line 116,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegression.addData(double, double)",
      "begin_line": 132,
      "end_line": 157,
      "comment": "\n     * Adds the observation (x,y) to the regression data set.\n     * \u003cp\u003e\n     * Uses updating formulas for means and sums of squares defined in\n     * \"Algorithms for Computing the Sample Variance: Analysis and\n     * Recommendations\", Chan, T.F., Golub, G.H., and LeVeque, R.J.\n     * 1983, American Statistician, vol. 37, pp. 242-247, referenced in\n     * Weisberg, S. \"Applied Linear Regression\". 2nd Ed. 1985.\u003c/p\u003e\n     *\n     *\n     * @param x independent variable value\n     * @param y dependent variable value\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 148,col 10)",
        "(line 149,col 9)-(line 153,col 9)",
        "(line 154,col 9)-(line 154,col 18)",
        "(line 155,col 9)-(line 155,col 18)",
        "(line 156,col 9)-(line 156,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegression.append(org.apache.commons.math3.stat.regression.SimpleRegression)",
      "begin_line": 172,
      "end_line": 199,
      "comment": "\n     * Appends data from another regression calculation to this one.\n     *\n     * \u003cp\u003eThe mean update formulae are based on a paper written by Philippe\n     * P\u0026eacute;bay:\n     * \u003ca\n     * href\u003d\"http://prod.sandia.gov/techlib/access-control.cgi/2008/086212.pdf\"\u003e\n     * Formulas for Robust, One-Pass Parallel Computation of Covariances and\n     * Arbitrary-Order Statistical Moments\u003c/a\u003e, 2008, Technical Report\n     * SAND2008-6212, Sandia National Laboratories.\u003c/p\u003e\n     *\n     * @param reg model to append data from\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 195,col 9)",
        "(line 196,col 9)-(line 196,col 25)",
        "(line 197,col 9)-(line 197,col 25)",
        "(line 198,col 9)-(line 198,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegression.removeData(double, double)",
      "begin_line": 214,
      "end_line": 238,
      "comment": "\n     * Removes the observation (x,y) from the regression data set.\n     * \u003cp\u003e\n     * Mirrors the addData method.  This method permits the use of\n     * SimpleRegression instances in streaming mode where the regression\n     * is applied to a sliding \"window\" of observations, however the caller is\n     * responsible for maintaining the set of observations in the window.\u003c/p\u003e\n     *\n     * The method has no effect if there are no points of data (i.e. n\u003d0)\n     *\n     * @param x independent variable value\n     * @param y dependent variable value\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 237,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegression.addData(double[][])",
      "begin_line": 258,
      "end_line": 266,
      "comment": "\n     * Adds the observations represented by the elements in\n     * \u003ccode\u003edata\u003c/code\u003e.\n     * \u003cp\u003e\n     * \u003ccode\u003e(data[0][0],data[0][1])\u003c/code\u003e will be the first observation, then\n     * \u003ccode\u003e(data[1][0],data[1][1])\u003c/code\u003e, etc.\u003c/p\u003e\n     * \u003cp\u003e\n     * This method does not replace data that has already been added.  The\n     * observations represented by \u003ccode\u003edata\u003c/code\u003e are added to the existing\n     * dataset.\u003c/p\u003e\n     * \u003cp\u003e\n     * To replace all data, use \u003ccode\u003eclear()\u003c/code\u003e before adding the new\n     * data.\u003c/p\u003e\n     *\n     * @param data array of observations to be added\n     * @throws ModelSpecificationException if the length of {@code data[i]} is not\n     * greater than or equal to 2\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 265,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegression.addObservation(double[], double)",
      "begin_line": 276,
      "end_line": 282,
      "comment": "\n     * Adds one observation to the regression model.\n     *\n     * @param x the independent variables which form the design matrix\n     * @param y the dependent or response variable\n     * @throws ModelSpecificationException if the length of {@code x} does not equal\n     * the number of independent variables in the model\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 280,col 9)",
        "(line 281,col 9)-(line 281,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegression.addObservations(double[][], double[])",
      "begin_line": 294,
      "end_line": 315,
      "comment": "\n     * Adds a series of observations to the regression model. The lengths of\n     * x and y must be the same and x must be rectangular.\n     *\n     * @param x a series of observations on the independent variables\n     * @param y a series of observations on the dependent variable\n     * The length of x and y must be the same\n     * @throws ModelSpecificationException if {@code x} is not rectangular, does not match\n     * the length of {@code y} or does not contain sufficient data to estimate the model\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 300,col 9)",
        "(line 301,col 9)-(line 301,col 27)",
        "(line 302,col 9)-(line 306,col 9)",
        "(line 307,col 9)-(line 311,col 9)",
        "(line 312,col 9)-(line 314,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegression.removeData(double[][])",
      "begin_line": 330,
      "end_line": 334,
      "comment": "\n     * Removes observations represented by the elements in \u003ccode\u003edata\u003c/code\u003e.\n      * \u003cp\u003e\n     * If the array is larger than the current n, only the first n elements are\n     * processed.  This method permits the use of SimpleRegression instances in\n     * streaming mode where the regression is applied to a sliding \"window\" of\n     * observations, however the caller is responsible for maintaining the set\n     * of observations in the window.\u003c/p\u003e\n     * \u003cp\u003e\n     * To remove all data, use \u003ccode\u003eclear()\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param data array of observations to be removed\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 333,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegression.clear()",
      "begin_line": 339,
      "end_line": 346,
      "comment": "\n     * Clears all data from the model.\n     ",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 18)",
        "(line 341,col 9)-(line 341,col 19)",
        "(line 342,col 9)-(line 342,col 18)",
        "(line 343,col 9)-(line 343,col 19)",
        "(line 344,col 9)-(line 344,col 19)",
        "(line 345,col 9)-(line 345,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegression.getN()",
      "begin_line": 353,
      "end_line": 355,
      "comment": "\n     * Returns the number of observations that have been added to the model.\n     *\n     * @return n number of observations that have been added.\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegression.predict(double)",
      "begin_line": 374,
      "end_line": 380,
      "comment": "\n     * Returns the \"predicted\" \u003ccode\u003ey\u003c/code\u003e value associated with the\n     * supplied \u003ccode\u003ex\u003c/code\u003e value,  based on the data that has been\n     * added to the model when this method is activated.\n     * \u003cp\u003e\n     * \u003ccode\u003e predict(x) \u003d intercept + slope * x \u003c/code\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eAt least two observations (with at least two different x values)\n     * must have been added before invoking this method. If this method is\n     * invoked before a model can be estimated, \u003ccode\u003eDouble,NaN\u003c/code\u003e is\n     * returned.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param x input \u003ccode\u003ex\u003c/code\u003e value\n     * @return predicted \u003ccode\u003ey\u003c/code\u003e value\n     ",
      "child_ranges": [
        "(line 375,col 9)-(line 375,col 37)",
        "(line 376,col 9)-(line 378,col 9)",
        "(line 379,col 9)-(line 379,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegression.getIntercept()",
      "begin_line": 401,
      "end_line": 403,
      "comment": "\n     * Returns the intercept of the estimated regression line, if\n     * {@link #hasIntercept()} is true; otherwise 0.\n     * \u003cp\u003e\n     * The least squares estimate of the intercept is computed using the\n     * \u003ca href\u003d\"http://www.xycoon.com/estimation4.htm\"\u003enormal equations\u003c/a\u003e.\n     * The intercept is sometimes denoted b0.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eAt least two observations (with at least two different x values)\n     * must have been added before invoking this method. If this method is\n     * invoked before a model can be estimated, \u003ccode\u003eDouble,NaN\u003c/code\u003e is\n     * returned.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @return the intercept of the regression line if the model includes an\n     * intercept; 0 otherwise\n     * @see #SimpleRegression(boolean)\n     ",
      "child_ranges": [
        "(line 402,col 9)-(line 402,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegression.hasIntercept()",
      "begin_line": 411,
      "end_line": 413,
      "comment": "\n     * Returns true if the model includes an intercept term.\n     *\n     * @return true if the regression includes an intercept; false otherwise\n     * @see #SimpleRegression(boolean)\n     ",
      "child_ranges": [
        "(line 412,col 9)-(line 412,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegression.getSlope()",
      "begin_line": 431,
      "end_line": 439,
      "comment": "\n    * Returns the slope of the estimated regression line.\n    * \u003cp\u003e\n    * The least squares estimate of the slope is computed using the\n    * \u003ca href\u003d\"http://www.xycoon.com/estimation4.htm\"\u003enormal equations\u003c/a\u003e.\n    * The slope is sometimes denoted b1.\u003c/p\u003e\n    * \u003cp\u003e\n    * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n    * \u003cli\u003eAt least two observations (with at least two different x values)\n    * must have been added before invoking this method. If this method is\n    * invoked before a model can be estimated, \u003ccode\u003eDouble.NaN\u003c/code\u003e is\n    * returned.\n    * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n    *\n    * @return the slope of the regression line\n    ",
      "child_ranges": [
        "(line 432,col 9)-(line 434,col 9)",
        "(line 435,col 9)-(line 437,col 9)",
        "(line 438,col 9)-(line 438,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegression.getSumSquaredErrors()",
      "begin_line": 470,
      "end_line": 472,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://www.xycoon.com/SumOfSquares.htm\"\u003e\n     * sum of squared errors\u003c/a\u003e (SSE) associated with the regression\n     * model.\n     * \u003cp\u003e\n     * The sum is computed using the computational formula\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003ccode\u003eSSE \u003d SYY - (SXY * SXY / SXX)\u003c/code\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * where \u003ccode\u003eSYY\u003c/code\u003e is the sum of the squared deviations of the y\n     * values about their mean, \u003ccode\u003eSXX\u003c/code\u003e is similarly defined and\n     * \u003ccode\u003eSXY\u003c/code\u003e is the sum of the products of x and y mean deviations.\n     * \u003c/p\u003e\u003cp\u003e\n     * The sums are accumulated using the updating algorithm referenced in\n     * {@link #addData}.\u003c/p\u003e\n     * \u003cp\u003e\n     * The return value is constrained to be non-negative - i.e., if due to\n     * rounding errors the computational formula returns a negative result,\n     * 0 is returned.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eAt least two observations (with at least two different x values)\n     * must have been added before invoking this method. If this method is\n     * invoked before a model can be estimated, \u003ccode\u003eDouble,NaN\u003c/code\u003e is\n     * returned.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @return sum of squared errors associated with the regression model\n     ",
      "child_ranges": [
        "(line 471,col 9)-(line 471,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegression.getTotalSumSquares()",
      "begin_line": 484,
      "end_line": 489,
      "comment": "\n     * Returns the sum of squared deviations of the y values about their mean.\n     * \u003cp\u003e\n     * This is defined as SSTO\n     * \u003ca href\u003d\"http://www.xycoon.com/SumOfSquares.htm\"\u003ehere\u003c/a\u003e.\u003c/p\u003e\n     * \u003cp\u003e\n     * If \u003ccode\u003en \u003c 2\u003c/code\u003e, this returns \u003ccode\u003eDouble.NaN\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return sum of squared deviations of y values\n     ",
      "child_ranges": [
        "(line 485,col 9)-(line 487,col 9)",
        "(line 488,col 9)-(line 488,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegression.getXSumSquares()",
      "begin_line": 498,
      "end_line": 503,
      "comment": "\n     * Returns the sum of squared deviations of the x values about their mean.\n     *\n     * If \u003ccode\u003en \u003c 2\u003c/code\u003e, this returns \u003ccode\u003eDouble.NaN\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return sum of squared deviations of x values\n     ",
      "child_ranges": [
        "(line 499,col 9)-(line 501,col 9)",
        "(line 502,col 9)-(line 502,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegression.getSumOfCrossProducts()",
      "begin_line": 510,
      "end_line": 512,
      "comment": "\n     * Returns the sum of crossproducts, x\u003csub\u003ei\u003c/sub\u003e*y\u003csub\u003ei\u003c/sub\u003e.\n     *\n     * @return sum of cross products\n     ",
      "child_ranges": [
        "(line 511,col 9)-(line 511,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegression.getRegressionSumSquares()",
      "begin_line": 530,
      "end_line": 532,
      "comment": "\n     * Returns the sum of squared deviations of the predicted y values about\n     * their mean (which equals the mean of y).\n     * \u003cp\u003e\n     * This is usually abbreviated SSR or SSM.  It is defined as SSM\n     * \u003ca href\u003d\"http://www.xycoon.com/SumOfSquares.htm\"\u003ehere\u003c/a\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eAt least two observations (with at least two different x values)\n     * must have been added before invoking this method. If this method is\n     * invoked before a model can be estimated, \u003ccode\u003eDouble.NaN\u003c/code\u003e is\n     * returned.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @return sum of squared deviations of predicted y values\n     ",
      "child_ranges": [
        "(line 531,col 9)-(line 531,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegression.getMeanSquareError()",
      "begin_line": 544,
      "end_line": 549,
      "comment": "\n     * Returns the sum of squared errors divided by the degrees of freedom,\n     * usually abbreviated MSE.\n     * \u003cp\u003e\n     * If there are fewer than \u003cstrong\u003ethree\u003c/strong\u003e data pairs in the model,\n     * or if there is no variation in \u003ccode\u003ex\u003c/code\u003e, this returns\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return sum of squared deviations of y values\n     ",
      "child_ranges": [
        "(line 545,col 9)-(line 547,col 9)",
        "(line 548,col 9)-(line 548,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegression.getR()",
      "begin_line": 565,
      "end_line": 572,
      "comment": "\n     * Returns \u003ca href\u003d\"http://mathworld.wolfram.com/CorrelationCoefficient.html\"\u003e\n     * Pearson\u0027s product moment correlation coefficient\u003c/a\u003e,\n     * usually denoted r.\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eAt least two observations (with at least two different x values)\n     * must have been added before invoking this method. If this method is\n     * invoked before a model can be estimated, \u003ccode\u003eDouble,NaN\u003c/code\u003e is\n     * returned.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @return Pearson\u0027s r\n     ",
      "child_ranges": [
        "(line 566,col 9)-(line 566,col 31)",
        "(line 567,col 9)-(line 567,col 52)",
        "(line 568,col 9)-(line 570,col 9)",
        "(line 571,col 9)-(line 571,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegression.getRSquare()",
      "begin_line": 588,
      "end_line": 591,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://www.xycoon.com/coefficient1.htm\"\u003e\n     * coefficient of determination\u003c/a\u003e,\n     * usually denoted r-square.\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eAt least two observations (with at least two different x values)\n     * must have been added before invoking this method. If this method is\n     * invoked before a model can be estimated, \u003ccode\u003eDouble,NaN\u003c/code\u003e is\n     * returned.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @return r-square\n     ",
      "child_ranges": [
        "(line 589,col 9)-(line 589,col 43)",
        "(line 590,col 9)-(line 590,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegression.getInterceptStdErr()",
      "begin_line": 605,
      "end_line": 611,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://www.xycoon.com/standarderrorb0.htm\"\u003e\n     * standard error of the intercept estimate\u003c/a\u003e,\n     * usually denoted s(b0).\n     * \u003cp\u003e\n     * If there are fewer that \u003cstrong\u003ethree\u003c/strong\u003e observations in the\n     * model, or if there is no variation in x, this returns\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e.\u003c/p\u003e Additionally, a \u003ccode\u003eDouble.NaN\u003c/code\u003e is\n     * returned when the intercept is constrained to be zero\n     *\n     * @return standard error associated with intercept estimate\n     ",
      "child_ranges": [
        "(line 606,col 9)-(line 608,col 9)",
        "(line 609,col 9)-(line 610,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegression.getSlopeStdErr()",
      "begin_line": 624,
      "end_line": 626,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://www.xycoon.com/standerrorb(1).htm\"\u003estandard\n     * error of the slope estimate\u003c/a\u003e,\n     * usually denoted s(b1).\n     * \u003cp\u003e\n     * If there are fewer that \u003cstrong\u003ethree\u003c/strong\u003e data pairs in the model,\n     * or if there is no variation in x, this returns \u003ccode\u003eDouble.NaN\u003c/code\u003e.\n     * \u003c/p\u003e\n     *\n     * @return standard error associated with slope estimate\n     ",
      "child_ranges": [
        "(line 625,col 9)-(line 625,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegression.getSlopeConfidenceInterval()",
      "begin_line": 650,
      "end_line": 652,
      "comment": "\n     * Returns the half-width of a 95% confidence interval for the slope\n     * estimate.\n     * \u003cp\u003e\n     * The 95% confidence interval is\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003ccode\u003e(getSlope() - getSlopeConfidenceInterval(),\n     * getSlope() + getSlopeConfidenceInterval())\u003c/code\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * If there are fewer that \u003cstrong\u003ethree\u003c/strong\u003e observations in the\n     * model, or if there is no variation in x, this returns\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note\u003c/strong\u003e:\u003cbr\u003e\n     * The validity of this statistic depends on the assumption that the\n     * observations included in the model are drawn from a\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/BivariateNormalDistribution.html\"\u003e\n     * Bivariate Normal Distribution\u003c/a\u003e.\u003c/p\u003e\n     *\n     * @return half-width of 95% confidence interval for the slope estimate\n     * @throws OutOfRangeException if the confidence interval can not be computed.\n     ",
      "child_ranges": [
        "(line 651,col 9)-(line 651,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegression.getSlopeConfidenceInterval(double)",
      "begin_line": 685,
      "end_line": 698,
      "comment": "\n     * Returns the half-width of a (100-100*alpha)% confidence interval for\n     * the slope estimate.\n     * \u003cp\u003e\n     * The (100-100*alpha)% confidence interval is \u003c/p\u003e\n     * \u003cp\u003e\n     * \u003ccode\u003e(getSlope() - getSlopeConfidenceInterval(),\n     * getSlope() + getSlopeConfidenceInterval())\u003c/code\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * To request, for example, a 99% confidence interval, use\n     * \u003ccode\u003ealpha \u003d .01\u003c/code\u003e\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note\u003c/strong\u003e:\u003cbr\u003e\n     * The validity of this statistic depends on the assumption that the\n     * observations included in the model are drawn from a\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/BivariateNormalDistribution.html\"\u003e\n     * Bivariate Normal Distribution\u003c/a\u003e.\u003c/p\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003e Preconditions:\u003c/strong\u003e\u003cul\u003e\n     * \u003cli\u003eIf there are fewer that \u003cstrong\u003ethree\u003c/strong\u003e observations in the\n     * model, or if there is no variation in x, this returns\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e.\n     * \u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003e(0 \u003c alpha \u003c 1)\u003c/code\u003e; otherwise an\n     * \u003ccode\u003eOutOfRangeException\u003c/code\u003e is thrown.\n     * \u003c/li\u003e\u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param alpha the desired significance level\n     * @return half-width of 95% confidence interval for the slope estimate\n     * @throws OutOfRangeException if the confidence interval can not be computed.\n     ",
      "child_ranges": [
        "(line 687,col 9)-(line 689,col 9)",
        "(line 690,col 9)-(line 693,col 9)",
        "(line 695,col 9)-(line 695,col 62)",
        "(line 696,col 9)-(line 697,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegression.getSignificance()",
      "begin_line": 722,
      "end_line": 730,
      "comment": "\n     * Returns the significance level of the slope (equiv) correlation.\n     * \u003cp\u003e\n     * Specifically, the returned value is the smallest \u003ccode\u003ealpha\u003c/code\u003e\n     * such that the slope confidence interval with significance level\n     * equal to \u003ccode\u003ealpha\u003c/code\u003e does not include \u003ccode\u003e0\u003c/code\u003e.\n     * On regression output, this is often denoted \u003ccode\u003eProb(|t| \u003e 0)\u003c/code\u003e\n     * \u003c/p\u003e\u003cp\u003e\n     * \u003cstrong\u003eUsage Note\u003c/strong\u003e:\u003cbr\u003e\n     * The validity of this statistic depends on the assumption that the\n     * observations included in the model are drawn from a\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/BivariateNormalDistribution.html\"\u003e\n     * Bivariate Normal Distribution\u003c/a\u003e.\u003c/p\u003e\n     * \u003cp\u003e\n     * If there are fewer that \u003cstrong\u003ethree\u003c/strong\u003e observations in the\n     * model, or if there is no variation in x, this returns\n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @return significance level for slope/correlation\n     * @throws org.apache.commons.math3.exception.MaxCountExceededException\n     * if the significance level can not be computed.\n     ",
      "child_ranges": [
        "(line 723,col 9)-(line 725,col 9)",
        "(line 727,col 9)-(line 727,col 62)",
        "(line 728,col 9)-(line 729,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegression.getIntercept(double)",
      "begin_line": 742,
      "end_line": 747,
      "comment": "\n    * Returns the intercept of the estimated regression line, given the slope.\n    * \u003cp\u003e\n    * Will return \u003ccode\u003eNaN\u003c/code\u003e if slope is \u003ccode\u003eNaN\u003c/code\u003e.\u003c/p\u003e\n    *\n    * @param slope current slope\n    * @return the intercept of the regression line\n    ",
      "child_ranges": [
        "(line 743,col 7)-(line 745,col 7)",
        "(line 746,col 7)-(line 746,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegression.getRegressionSumSquares(double)",
      "begin_line": 755,
      "end_line": 757,
      "comment": "\n     * Computes SSR from b1.\n     *\n     * @param slope regression slope estimate\n     * @return sum of squared deviations of predicted y values\n     ",
      "child_ranges": [
        "(line 756,col 9)-(line 756,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegression.regress()",
      "begin_line": 771,
      "end_line": 816,
      "comment": "\n     * Performs a regression on data present in buffers and outputs a RegressionResults object.\n     *\n     * \u003cp\u003eIf there are fewer than 3 observations in the model and {@code hasIntercept} is true\n     * a {@code NoDataException} is thrown.  If there is no intercept term, the model must\n     * contain at least 2 observations.\u003c/p\u003e\n     *\n     * @return RegressionResults acts as a container of regression output\n     * @throws ModelSpecificationException if the model is not correctly specified\n     * @throws NoDataException if there is not sufficient data in the model to\n     * estimate the regression parameters\n     ",
      "child_ranges": [
        "(line 772,col 9)-(line 815,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegression.regress(int[])",
      "begin_line": 826,
      "end_line": 890,
      "comment": "\n     * Performs a regression on data present in buffers including only regressors\n     * indexed in variablesToInclude and outputs a RegressionResults object\n     * @param variablesToInclude an array of indices of regressors to include\n     * @return RegressionResults acts as a container of regression output\n     * @throws MathIllegalArgumentException if the variablesToInclude array is null or zero length\n     * @throws OutOfRangeException if a requested variable is not present in model\n     ",
      "child_ranges": [
        "(line 827,col 9)-(line 829,col 9)",
        "(line 830,col 9)-(line 834,col 9)",
        "(line 836,col 9)-(line 887,col 9)",
        "(line 889,col 9)-(line 889,col 20)"
      ]
    }
  ]
}