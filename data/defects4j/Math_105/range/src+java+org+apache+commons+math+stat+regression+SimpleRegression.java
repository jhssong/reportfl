{
  "filepath": "/tmp/Math-105b/src/java/org/apache/commons/math/stat/regression/SimpleRegression.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimpleRegression",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 54,
      "end_line": 519,
      "comment": "\n * Estimates an ordinary least squares regression model\n * with one independent variable.\n * \u003cp\u003e\n * \u003ccode\u003e y \u003d intercept + slope * x  \u003c/code\u003e\n * \u003cp\u003e\n * Standard errors for \u003ccode\u003eintercept\u003c/code\u003e and \u003ccode\u003eslope\u003c/code\u003e are \n * available as well as ANOVA, r-square and Pearson\u0027s r statistics.\n * \u003cp\u003e\n * Observations (x,y pairs) can be added to the model one at a time or they \n * can be provided in a 2-dimensional array.  The observations are not stored\n * in memory, so there is no limit to the number of observations that can be\n * added to the model. \n * \u003cp\u003e\n * \u003cstrong\u003eUsage Notes\u003c/strong\u003e: \u003cul\u003e\n * \u003cli\u003e When there are fewer than two observations in the model, or when\n * there is no variation in the x values (i.e. all x values are the same) \n * all statistics return \u003ccode\u003eNaN\u003c/code\u003e. At least two observations with\n * different x coordinates are requred to estimate a bivariate regression \n * model.\n * \u003c/li\u003e\n * \u003cli\u003e getters for the statistics always compute values based on the current\n * set of observations -- i.e., you can get statistics, then add more data\n * and get updated statistics without using a new instance.  There is no \n * \"compute\" method that updates all statistics.  Each of the getters performs\n * the necessary computations to return the requested statistic.\u003c/li\u003e\n * \u003c/ul\u003e\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "sumX"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " sum of x values "
    },
    {
      "type": "field",
      "varNames": [
        "sumXX"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " total variation in x (sum of squared deviations from xbar) "
    },
    {
      "type": "field",
      "varNames": [
        "sumY"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " sum of y values "
    },
    {
      "type": "field",
      "varNames": [
        "sumYY"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " total variation in y (sum of squared deviations from ybar) "
    },
    {
      "type": "field",
      "varNames": [
        "sumXY"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " sum of products "
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " number of observations "
    },
    {
      "type": "field",
      "varNames": [
        "xbar"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " mean of accumulated x values, used in updating formulas "
    },
    {
      "type": "field",
      "varNames": [
        "ybar"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " mean of accumulated y values, used in updating formulas "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.SimpleRegression()",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n     * Create an empty SimpleRegression instance\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.addData(double, double)",
      "begin_line": 105,
      "end_line": 121,
      "comment": "\n     * Adds the observation (x,y) to the regression data set.\n     * \u003cp\u003e\n     * Uses updating formulas for means and sums of squares defined in \n     * \"Algorithms for Computing the Sample Variance: Analysis and\n     * Recommendations\", Chan, T.F., Golub, G.H., and LeVeque, R.J. \n     * 1983, American Statistician, vol. 37, pp. 242-247, referenced in\n     * Weisberg, S. \"Applied Linear Regression\". 2nd Ed. 1985\n     *\n     *\n     * @param x independent variable value\n     * @param y dependent variable value\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 117,col 9)",
        "(line 118,col 9)-(line 118,col 18)",
        "(line 119,col 9)-(line 119,col 18)",
        "(line 120,col 9)-(line 120,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.addData(double[][])",
      "begin_line": 139,
      "end_line": 143,
      "comment": "\n     * Adds the observations represented by the elements in \n     * \u003ccode\u003edata\u003c/code\u003e.\n     * \u003cp\u003e\n     * \u003ccode\u003e(data[0][0],data[0][1])\u003c/code\u003e will be the first observation, then\n     * \u003ccode\u003e(data[1][0],data[1][1])\u003c/code\u003e, etc. \n     * \u003cp\u003e \n     * This method does not replace data that has already been added.  The\n     * observations represented by \u003ccode\u003edata\u003c/code\u003e are added to the existing\n     * dataset.\n     * \u003cp\u003e \n     * To replace all data, use \u003ccode\u003eclear()\u003c/code\u003e before adding the new \n     * data.\n     * \n     * @param data array of observations to be added\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 142,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.clear()",
      "begin_line": 148,
      "end_line": 155,
      "comment": "\n     * Clears all data from the model.\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 18)",
        "(line 150,col 9)-(line 150,col 19)",
        "(line 151,col 9)-(line 151,col 18)",
        "(line 152,col 9)-(line 152,col 19)",
        "(line 153,col 9)-(line 153,col 19)",
        "(line 154,col 9)-(line 154,col 14)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.getN()",
      "begin_line": 162,
      "end_line": 164,
      "comment": "\n     * Returns the number of observations that have been added to the model.\n     *\n     * @return n number of observations that have been added.\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.predict(double)",
      "begin_line": 183,
      "end_line": 186,
      "comment": "\n     * Returns the \"predicted\" \u003ccode\u003ey\u003c/code\u003e value associated with the \n     * supplied \u003ccode\u003ex\u003c/code\u003e value,  based on the data that has been\n     * added to the model when this method is activated.\n     * \u003cp\u003e\n     * \u003ccode\u003e predict(x) \u003d intercept + slope * x \u003c/code\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eAt least two observations (with at least two different x values)\n     * must have been added before invoking this method. If this method is \n     * invoked before a model can be estimated, \u003ccode\u003eDouble,NaN\u003c/code\u003e is\n     * returned.\n     * \u003c/li\u003e\u003c/ul\u003e\n     *\n     * @param x input \u003ccode\u003ex\u003c/code\u003e value\n     * @return predicted \u003ccode\u003ey\u003c/code\u003e value\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 31)",
        "(line 185,col 9)-(line 185,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.getIntercept()",
      "begin_line": 204,
      "end_line": 206,
      "comment": "\n     * Returns the intercept of the estimated regression line.\n     * \u003cp\u003e\n     * The least squares estimate of the intercept is computed using the \n     * \u003ca href\u003d\"http://www.xycoon.com/estimation4.htm\"\u003enormal equations\u003c/a\u003e.\n     * The intercept is sometimes denoted b0. \n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eAt least two observations (with at least two different x values)\n     * must have been added before invoking this method. If this method is \n     * invoked before a model can be estimated, \u003ccode\u003eDouble,NaN\u003c/code\u003e is\n     * returned.\n     * \u003c/li\u003e\u003c/ul\u003e\n     *\n     * @return the intercept of the regression line\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.getSlope()",
      "begin_line": 224,
      "end_line": 232,
      "comment": "\n    * Returns the slope of the estimated regression line.  \n    * \u003cp\u003e\n    * The least squares estimate of the slope is computed using the \n    * \u003ca href\u003d\"http://www.xycoon.com/estimation4.htm\"\u003enormal equations\u003c/a\u003e.\n    * The slope is sometimes denoted b1. \n    * \u003cp\u003e\n    * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n    * \u003cli\u003eAt least two observations (with at least two different x values)\n    * must have been added before invoking this method. If this method is \n    * invoked before a model can be estimated, \u003ccode\u003eDouble.NaN\u003c/code\u003e is\n    * returned.\n    * \u003c/li\u003e\u003c/ul\u003e\n    *\n    * @return the slope of the regression line\n    ",
      "child_ranges": [
        "(line 225,col 9)-(line 227,col 9)",
        "(line 228,col 9)-(line 230,col 9)",
        "(line 231,col 9)-(line 231,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.getSumSquaredErrors()",
      "begin_line": 263,
      "end_line": 265,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://www.xycoon.com/SumOfSquares.htm\"\u003e\n     * sum of squared errors\u003c/a\u003e (SSE) associated with the regression \n     * model.\n     * \u003cp\u003e\n     * The sum is computed using the computational formula\n     * \u003cp\u003e\n     * \u003ccode\u003eSSE \u003d SYY - (SXY * SXY / SXX)\u003c/code\u003e\n     * \u003cp\u003e\n     * where \u003ccode\u003eSYY\u003c/code\u003e is the sum of the squared deviations of the y\n     * values about their mean, \u003ccode\u003eSXX\u003c/code\u003e is similarly defined and\n     * \u003ccode\u003eSXY\u003c/code\u003e is the sum of the products of x and y mean deviations.\n     * \u003cp\u003e\n     * The sums are accumulated using the updating algorithm referenced in \n     * {@link #addData}.  \n     * \u003cp\u003e\n     * The return value is constrained to be non-negative - i.e., if due to \n     * rounding errors the computational formula returns a negative result, \n     * 0 is returned.\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eAt least two observations (with at least two different x values)\n     * must have been added before invoking this method. If this method is \n     * invoked before a model can be estimated, \u003ccode\u003eDouble,NaN\u003c/code\u003e is\n     * returned.\n     * \u003c/li\u003e\u003c/ul\u003e\n     *\n     * @return sum of squared errors associated with the regression model\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.getTotalSumSquares()",
      "begin_line": 277,
      "end_line": 282,
      "comment": "\n     * Returns the sum of squared deviations of the y values about their mean.\n     * \u003cp\u003e\n     * This is defined as SSTO \n     * \u003ca href\u003d\"http://www.xycoon.com/SumOfSquares.htm\"\u003ehere\u003c/a\u003e.\n     * \u003cp\u003e\n     * If \u003ccode\u003en \u003c 2\u003c/code\u003e, this returns \u003ccode\u003eDouble.NaN\u003c/code\u003e.\n     *\n     * @return sum of squared deviations of y values\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 280,col 9)",
        "(line 281,col 9)-(line 281,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.getRegressionSumSquares()",
      "begin_line": 300,
      "end_line": 302,
      "comment": "\n     * Returns the sum of squared deviations of the predicted y values about \n     * their mean (which equals the mean of y).\n     * \u003cp\u003e\n     * This is usually abbreviated SSR or SSM.  It is defined as SSM \n     * \u003ca href\u003d\"http://www.xycoon.com/SumOfSquares.htm\"\u003ehere\u003c/a\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eAt least two observations (with at least two different x values)\n     * must have been added before invoking this method. If this method is \n     * invoked before a model can be estimated, \u003ccode\u003eDouble.NaN\u003c/code\u003e is\n     * returned.\n     * \u003c/li\u003e\u003c/ul\u003e\n     *\n     * @return sum of squared deviations of predicted y values\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.getMeanSquareError()",
      "begin_line": 314,
      "end_line": 319,
      "comment": "\n     * Returns the sum of squared errors divided by the degrees of freedom,\n     * usually abbreviated MSE. \n     * \u003cp\u003e\n     * If there are fewer than \u003cstrong\u003ethree\u003c/strong\u003e data pairs in the model,\n     * or if there is no variation in \u003ccode\u003ex\u003c/code\u003e, this returns \n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e.\n     *\n     * @return sum of squared deviations of y values\n     ",
      "child_ranges": [
        "(line 315,col 9)-(line 317,col 9)",
        "(line 318,col 9)-(line 318,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.getR()",
      "begin_line": 335,
      "end_line": 342,
      "comment": "\n     * Returns \u003ca href\u003d\"http://mathworld.wolfram.com/CorrelationCoefficient.html\"\u003e\n     * Pearson\u0027s product moment correlation coefficient\u003c/a\u003e,\n     * usually denoted r. \n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eAt least two observations (with at least two different x values)\n     * must have been added before invoking this method. If this method is \n     * invoked before a model can be estimated, \u003ccode\u003eDouble,NaN\u003c/code\u003e is\n     * returned.\n     * \u003c/li\u003e\u003c/ul\u003e\n     *\n     * @return Pearson\u0027s r\n     ",
      "child_ranges": [
        "(line 336,col 9)-(line 336,col 31)",
        "(line 337,col 9)-(line 337,col 48)",
        "(line 338,col 9)-(line 340,col 9)",
        "(line 341,col 9)-(line 341,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.getRSquare()",
      "begin_line": 358,
      "end_line": 361,
      "comment": " \n     * Returns the \u003ca href\u003d\"http://www.xycoon.com/coefficient1.htm\"\u003e \n     * coefficient of determination\u003c/a\u003e,\n     * usually denoted r-square. \n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e: \u003cul\u003e\n     * \u003cli\u003eAt least two observations (with at least two different x values)\n     * must have been added before invoking this method. If this method is \n     * invoked before a model can be estimated, \u003ccode\u003eDouble,NaN\u003c/code\u003e is\n     * returned.\n     * \u003c/li\u003e\u003c/ul\u003e\n     *\n     * @return r-square\n     ",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 43)",
        "(line 360,col 9)-(line 360,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.getInterceptStdErr()",
      "begin_line": 374,
      "end_line": 377,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://www.xycoon.com/standarderrorb0.htm\"\u003e\n     * standard error of the intercept estimate\u003c/a\u003e, \n     * usually denoted s(b0). \n     * \u003cp\u003e\n     * If there are fewer that \u003cstrong\u003ethree\u003c/strong\u003e observations in the \n     * model, or if there is no variation in x, this returns \n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e.\n     *\n     * @return standard error associated with intercept estimate\n     ",
      "child_ranges": [
        "(line 375,col 9)-(line 376,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.getSlopeStdErr()",
      "begin_line": 389,
      "end_line": 391,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://www.xycoon.com/standerrorb(1).htm\"\u003estandard\n     * error of the slope estimate\u003c/a\u003e,\n     * usually denoted s(b1). \n     * \u003cp\u003e\n     * If there are fewer that \u003cstrong\u003ethree\u003c/strong\u003e data pairs in the model,\n     * or if there is no variation in x, this returns \u003ccode\u003eDouble.NaN\u003c/code\u003e.\n     *\n     * @return standard error associated with slope estimate\n     ",
      "child_ranges": [
        "(line 390,col 9)-(line 390,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.getSlopeConfidenceInterval()",
      "begin_line": 416,
      "end_line": 418,
      "comment": "\n     * Returns the half-width of a 95% confidence interval for the slope\n     * estimate.\n     * \u003cp\u003e\n     * The 95% confidence interval is \n     * \u003cp\u003e\n     * \u003ccode\u003e(getSlope() - getSlopeConfidenceInterval(), \n     * getSlope() + getSlopeConfidenceInterval())\u003c/code\u003e\n     * \u003cp\u003e\n     * If there are fewer that \u003cstrong\u003ethree\u003c/strong\u003e observations in the \n     * model, or if there is no variation in x, this returns \n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e.\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note\u003c/strong\u003e:\u003cbr\u003e\n     * The validity of this statistic depends on the assumption that the \n     * observations included in the model are drawn from a\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/BivariateNormalDistribution.html\"\u003e\n     * Bivariate Normal Distribution\u003c/a\u003e.\n     *\n     * @return half-width of 95% confidence interval for the slope estimate\n     * \n     * @throws MathException if the confidence interval can not be computed.\n     ",
      "child_ranges": [
        "(line 417,col 9)-(line 417,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.getSlopeConfidenceInterval(double)",
      "begin_line": 451,
      "end_line": 458,
      "comment": "\n     * Returns the half-width of a (100-100*alpha)% confidence interval for \n     * the slope estimate.\n     * \u003cp\u003e\n     * The (100-100*alpha)% confidence interval is \n     * \u003cp\u003e\n     * \u003ccode\u003e(getSlope() - getSlopeConfidenceInterval(), \n     * getSlope() + getSlopeConfidenceInterval())\u003c/code\u003e\n     * \u003cp\u003e\n     * To request, for example, a 99% confidence interval, use \n     * \u003ccode\u003ealpha \u003d .01\u003c/code\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note\u003c/strong\u003e:\u003cbr\u003e\n     * The validity of this statistic depends on the assumption that the \n     * observations included in the model are drawn from a\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/BivariateNormalDistribution.html\"\u003e\n     * Bivariate Normal Distribution\u003c/a\u003e.\n     * \u003cp\u003e\n     * \u003cstrong\u003e Preconditions:\u003c/strong\u003e\u003cul\u003e\n     * \u003cli\u003eIf there are fewer that \u003cstrong\u003ethree\u003c/strong\u003e observations in the \n     * model, or if there is no variation in x, this returns \n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e. \n     * \u003c/li\u003e\n     * \u003cli\u003e\u003ccode\u003e(0 \u003c alpha \u003c 1)\u003c/code\u003e; otherwise an \n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown.\n     * \u003c/li\u003e\u003c/ul\u003e    \n     *\n     * @param alpha the desired significance level \n     * @return half-width of 95% confidence interval for the slope estimate\n     * @throws MathException if the confidence interval can not be computed.\n     ",
      "child_ranges": [
        "(line 453,col 9)-(line 455,col 9)",
        "(line 456,col 9)-(line 457,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.getSignificance()",
      "begin_line": 481,
      "end_line": 484,
      "comment": "\n     * Returns the significance level of the slope (equiv) correlation. \n     * \u003cp\u003e\n     * Specifically, the returned value is the smallest \u003ccode\u003ealpha\u003c/code\u003e\n     * such that the slope confidence interval with significance level\n     * equal to \u003ccode\u003ealpha\u003c/code\u003e does not include \u003ccode\u003e0\u003c/code\u003e.\n     * On regression output, this is often denoted \u003ccode\u003eProb(|t| \u003e 0)\u003c/code\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003eUsage Note\u003c/strong\u003e:\u003cbr\u003e\n     * The validity of this statistic depends on the assumption that the \n     * observations included in the model are drawn from a\n     * \u003ca href\u003d\"http://mathworld.wolfram.com/BivariateNormalDistribution.html\"\u003e\n     * Bivariate Normal Distribution\u003c/a\u003e.\n     * \u003cp\u003e\n     * If there are fewer that \u003cstrong\u003ethree\u003c/strong\u003e observations in the \n     * model, or if there is no variation in x, this returns \n     * \u003ccode\u003eDouble.NaN\u003c/code\u003e.\n     *\n     * @return significance level for slope/correlation\n     * @throws MathException if the significance level can not be computed.\n     ",
      "child_ranges": [
        "(line 482,col 9)-(line 483,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.getIntercept(double)",
      "begin_line": 496,
      "end_line": 498,
      "comment": "\n    * Returns the intercept of the estimated regression line, given the slope.\n    * \u003cp\u003e\n    * Will return \u003ccode\u003eNaN\u003c/code\u003e if slope is \u003ccode\u003eNaN\u003c/code\u003e.\n    *\n    * @param slope current slope\n    * @return the intercept of the regression line\n    ",
      "child_ranges": [
        "(line 497,col 9)-(line 497,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.getRegressionSumSquares(double)",
      "begin_line": 506,
      "end_line": 508,
      "comment": "\n     * Computes SSR from b1.\n     * \n     * @param slope regression slope estimate\n     * @return sum of squared deviations of predicted y values\n     ",
      "child_ranges": [
        "(line 507,col 9)-(line 507,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegression.getTDistribution()",
      "begin_line": 516,
      "end_line": 518,
      "comment": "\n     * Uses distribution framework to get a t distribution instance \n     * with df \u003d n - 2\n     *\n     * @return t distribution with df \u003d n - 2\n     ",
      "child_ranges": [
        "(line 517,col 9)-(line 517,col 76)"
      ]
    }
  ]
}