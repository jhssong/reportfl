{
  "filepath": "/tmp/Math-51b/src/main/java/org/apache/commons/math/stat/regression/MillerUpdatingRegression.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MillerUpdatingRegression",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.regression.UpdatingMultipleLinearRegression"
      ],
      "begin_line": 42,
      "end_line": 1130,
      "comment": "\n * \u003cp\u003eThis class is a concrete implementation of the {@link UpdatingMultipleLinearRegression} interface.\u003c/p\u003e\n *\n * \u003cp\u003eThe algorithm is described in: \u003cpre\u003e\n * Algorithm AS 274: Least Squares Routines to Supplement Those of Gentleman\n * Author(s): Alan J. Miller\n * Source: Journal of the Royal Statistical Society.\n * Series C (Applied Statistics), Vol. 41, No. 2\n * (1992), pp. 458-478\n * Published by: Blackwell Publishing for the Royal Statistical Society\n * Stable URL: http://www.jstor.org/stable/2347583 \u003c/pre\u003e\u003c/p\u003e\n *\n * \u003cp\u003eThis method for multiple regression forms the solution to the OLS problem\n * by updating the QR decomposition as described by Gentleman.\u003c/p\u003e\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "nvars"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " number of variables in regression "
    },
    {
      "type": "field",
      "varNames": [
        "d"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " diagonals of cross products matrix "
    },
    {
      "type": "field",
      "varNames": [
        "rhs"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " the elements of the R`Y "
    },
    {
      "type": "field",
      "varNames": [
        "r"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " the off diagonal portion of the R matrix "
    },
    {
      "type": "field",
      "varNames": [
        "tol"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " the tolerance for each of the variables "
    },
    {
      "type": "field",
      "varNames": [
        "rss"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " residual sum of squares for all nested regressions "
    },
    {
      "type": "field",
      "varNames": [
        "vorder"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " order of the regressors "
    },
    {
      "type": "field",
      "varNames": [
        "work_tolset"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " scratch space for tolerance calc "
    },
    {
      "type": "field",
      "varNames": [
        "nobs"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " number of observations entered "
    },
    {
      "type": "field",
      "varNames": [
        "sserr"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " sum of squared errors of largest regression "
    },
    {
      "type": "field",
      "varNames": [
        "rss_set"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " has rss been called? "
    },
    {
      "type": "field",
      "varNames": [
        "tol_set"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " has the tolerance setting method been called "
    },
    {
      "type": "field",
      "varNames": [
        "lindep"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " flags for variables with linear dependency problems "
    },
    {
      "type": "field",
      "varNames": [
        "x_sing"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " singular x values "
    },
    {
      "type": "field",
      "varNames": [
        "work_sing"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " workspace for singularity method "
    },
    {
      "type": "field",
      "varNames": [
        "sumy"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " summation of Y variable "
    },
    {
      "type": "field",
      "varNames": [
        "sumsqy"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " summation of squared Y values "
    },
    {
      "type": "field",
      "varNames": [
        "hasIntercept"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " boolean flag whether a regression constant is added "
    },
    {
      "type": "field",
      "varNames": [
        "epsilon"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " zero tolerance "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.regression.MillerUpdatingRegression.MillerUpdatingRegression()",
      "begin_line": 86,
      "end_line": 107,
      "comment": "\n     *  Set the default constructor to private access\n     *  to prevent inadvertent instantiation\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 22)",
        "(line 89,col 9)-(line 89,col 34)",
        "(line 90,col 9)-(line 90,col 27)",
        "(line 91,col 9)-(line 91,col 23)",
        "(line 92,col 9)-(line 92,col 24)",
        "(line 93,col 9)-(line 93,col 22)",
        "(line 94,col 9)-(line 94,col 24)",
        "(line 95,col 9)-(line 95,col 24)",
        "(line 96,col 9)-(line 96,col 29)",
        "(line 97,col 9)-(line 97,col 32)",
        "(line 98,col 9)-(line 98,col 33)",
        "(line 99,col 9)-(line 99,col 31)",
        "(line 100,col 9)-(line 100,col 24)",
        "(line 101,col 9)-(line 101,col 29)",
        "(line 102,col 9)-(line 102,col 27)",
        "(line 103,col 9)-(line 103,col 30)",
        "(line 104,col 9)-(line 104,col 32)",
        "(line 105,col 9)-(line 105,col 27)",
        "(line 106,col 9)-(line 106,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.regression.MillerUpdatingRegression.MillerUpdatingRegression(int, boolean, double)",
      "begin_line": 116,
      "end_line": 146,
      "comment": "\n     * This is the augmented constructor for the MillerUpdatingRegression class\n     *\n     * @param numberOfVariables number of regressors to expect, not including constant\n     * @param includeConstant include a constant automatically\n     * @param errorTolerance  zero tolerance, how machine zero is determined\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 119,col 9)",
        "(line 120,col 9)-(line 124,col 9)",
        "(line 125,col 9)-(line 125,col 44)",
        "(line 126,col 9)-(line 126,col 22)",
        "(line 127,col 9)-(line 127,col 40)",
        "(line 128,col 9)-(line 128,col 42)",
        "(line 129,col 9)-(line 129,col 63)",
        "(line 130,col 9)-(line 130,col 42)",
        "(line 131,col 9)-(line 131,col 42)",
        "(line 132,col 9)-(line 132,col 42)",
        "(line 133,col 9)-(line 133,col 45)",
        "(line 134,col 9)-(line 134,col 48)",
        "(line 135,col 9)-(line 135,col 50)",
        "(line 136,col 9)-(line 136,col 46)",
        "(line 137,col 9)-(line 139,col 9)",
        "(line 140,col 9)-(line 144,col 9)",
        "(line 145,col 9)-(line 145,col 15)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.regression.MillerUpdatingRegression.MillerUpdatingRegression(int, boolean)",
      "begin_line": 154,
      "end_line": 156,
      "comment": "\n     * Primary constructor for the MillerUpdatingRegression\n     *\n     * @param numberOfVariables maximum number of potential regressors\n     * @param includeConstant include a constant automatically\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.MillerUpdatingRegression.hasIntercept()",
      "begin_line": 162,
      "end_line": 164,
      "comment": "\n     * A getter method which determines whether a constant is included\n     * @return true regression has an intercept, false no intercept\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.MillerUpdatingRegression.getN()",
      "begin_line": 170,
      "end_line": 172,
      "comment": "\n     * Gets the number of observations added to the regression model\n     * @return number of observations\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.MillerUpdatingRegression.addObservation(double[], double)",
      "begin_line": 181,
      "end_line": 199,
      "comment": "\n     * Adds an observation to the regression model\n     * @param x the array with regressor values\n     * @param y  the value of dependent variable given these regressors\n     * @exception ModelSpecificationException if the length of {@code x} does not equal\n     * the number of independent variables in the model\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 187,col 9)",
        "(line 188,col 9)-(line 195,col 9)",
        "(line 196,col 9)-(line 196,col 15)",
        "(line 197,col 9)-(line 197,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.MillerUpdatingRegression.addObservations(double[][], double[])",
      "begin_line": 208,
      "end_line": 228,
      "comment": "\n     * Adds multiple observations to the model\n     * @param x observations on the regressors\n     * @param y observations on the regressand\n     * @throws ModelSpecificationException if {@code x} is not rectangular, does not match\n     * the length of {@code y} or does not contain sufficient data to estimate the model\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 214,col 9)",
        "(line 215,col 9)-(line 218,col 9)",
        "(line 219,col 9)-(line 223,col 9)",
        "(line 224,col 9)-(line 226,col 9)",
        "(line 227,col 9)-(line 227,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.MillerUpdatingRegression.include(double[], double, double)",
      "begin_line": 244,
      "end_line": 301,
      "comment": "\n     * The include method is where the QR decomposition occurs. This statement forms all\n     * intermediate data which will be used for all derivative measures.\n     * According to the miller paper, note that in the original implementation the x vector\n     * is overwritten. In this implementation, the include method is passed a copy of the\n     * original data vector so that there is no contamination of the data. Additionally,\n     * this method differs slightly from Gentleman\u0027s method, in that the assumption is\n     * of dense design matrices, there is some advantage in using the original gentleman algorithm\n     * on sparse matrices.\n     *\n     * @param x observations on the regressors\n     * @param wi weight of the this observation (-1,1)\n     * @param yi observation on the regressand\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 22)",
        "(line 246,col 9)-(line 246,col 22)",
        "(line 247,col 9)-(line 247,col 22)",
        "(line 248,col 9)-(line 248,col 18)",
        "(line 249,col 9)-(line 249,col 18)",
        "(line 250,col 9)-(line 250,col 19)",
        "(line 251,col 9)-(line 251,col 19)",
        "(line 252,col 9)-(line 252,col 18)",
        "(line 253,col 9)-(line 253,col 18)",
        "(line 254,col 9)-(line 254,col 29)",
        "(line 255,col 9)-(line 255,col 34)",
        "(line 256,col 9)-(line 256,col 43)",
        "(line 257,col 9)-(line 298,col 9)",
        "(line 299,col 9)-(line 299,col 43)",
        "(line 300,col 9)-(line 300,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.MillerUpdatingRegression.smartAdd(double, double)",
      "begin_line": 310,
      "end_line": 326,
      "comment": "\n     * Adds to number a and b such that the contamination due to\n     * numerical smallness of one addend does not corrupt the sum\n     * @param a - an addend\n     * @param b - an addend\n     * @return the sum of the a and b\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 36)",
        "(line 312,col 9)-(line 312,col 36)",
        "(line 313,col 9)-(line 325,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.MillerUpdatingRegression.clear()",
      "begin_line": 332,
      "end_line": 352,
      "comment": "\n     * As the name suggests,  clear wipes the internals and reorders everything in the\n     * canonical order.\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 33)",
        "(line 334,col 9)-(line 334,col 35)",
        "(line 335,col 9)-(line 335,col 33)",
        "(line 336,col 9)-(line 336,col 35)",
        "(line 337,col 9)-(line 337,col 35)",
        "(line 338,col 9)-(line 338,col 43)",
        "(line 339,col 9)-(line 339,col 41)",
        "(line 340,col 9)-(line 340,col 38)",
        "(line 341,col 9)-(line 341,col 40)",
        "(line 342,col 9)-(line 344,col 9)",
        "(line 345,col 9)-(line 345,col 22)",
        "(line 346,col 9)-(line 346,col 25)",
        "(line 347,col 9)-(line 347,col 24)",
        "(line 348,col 9)-(line 348,col 26)",
        "(line 349,col 9)-(line 349,col 29)",
        "(line 350,col 9)-(line 350,col 29)",
        "(line 351,col 9)-(line 351,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.MillerUpdatingRegression.tolset()",
      "begin_line": 357,
      "end_line": 376,
      "comment": "\n     * This sets up tolerances for singularity testing.\n     ",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 16)",
        "(line 359,col 9)-(line 359,col 21)",
        "(line 360,col 9)-(line 360,col 40)",
        "(line 361,col 9)-(line 363,col 9)",
        "(line 364,col 9)-(line 364,col 43)",
        "(line 365,col 9)-(line 373,col 9)",
        "(line 374,col 9)-(line 374,col 23)",
        "(line 375,col 9)-(line 375,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.MillerUpdatingRegression.regcf(int)",
      "begin_line": 387,
      "end_line": 423,
      "comment": "\n     * The regcf method conducts the linear regression and extracts the\n     * parameter vector. Notice that the algorithm can do subset regression\n     * with no alteration.\n     *\n     * @param nreq how many of the regressors to include (either in canonical\n     * order, or in the current reordered state)\n     * @return an array with the estimated slope coefficients\n     ",
      "child_ranges": [
        "(line 388,col 9)-(line 388,col 18)",
        "(line 389,col 9)-(line 391,col 9)",
        "(line 392,col 9)-(line 395,col 9)",
        "(line 396,col 9)-(line 398,col 9)",
        "(line 399,col 9)-(line 399,col 40)",
        "(line 400,col 9)-(line 400,col 36)",
        "(line 401,col 9)-(line 414,col 9)",
        "(line 415,col 9)-(line 421,col 9)",
        "(line 422,col 9)-(line 422,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.MillerUpdatingRegression.singcheck()",
      "begin_line": 429,
      "end_line": 473,
      "comment": "\n     * The method which checks for singularities and then eliminates the offending\n     * columns.\n     ",
      "child_ranges": [
        "(line 430,col 9)-(line 430,col 20)",
        "(line 431,col 9)-(line 431,col 17)",
        "(line 432,col 9)-(line 432,col 22)",
        "(line 433,col 9)-(line 433,col 16)",
        "(line 434,col 9)-(line 436,col 9)",
        "(line 437,col 9)-(line 471,col 9)",
        "(line 472,col 9)-(line 472,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.MillerUpdatingRegression.ss()",
      "begin_line": 484,
      "end_line": 493,
      "comment": "\n     * Calculates the sum of squared errors for the full regression\n     * and all subsets in the following manner: \u003cpre\u003e\n     * rss[] \u003d{\n     * ResidualSumOfSquares_allNvars,\n     * ResidualSumOfSquares_FirstNvars-1,\n     * ResidualSumOfSquares_FirstNvars-2,\n     * ..., ResidualSumOfSquares_FirstVariable} \u003c/pre\u003e\n     ",
      "child_ranges": [
        "(line 485,col 9)-(line 485,col 29)",
        "(line 486,col 9)-(line 486,col 31)",
        "(line 487,col 9)-(line 490,col 9)",
        "(line 491,col 9)-(line 491,col 23)",
        "(line 492,col 9)-(line 492,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.MillerUpdatingRegression.cov(int)",
      "begin_line": 513,
      "end_line": 559,
      "comment": "\n     * Calculates the cov matrix assuming only the first nreq variables are\n     * included in the calculation. The returned array contains a symmetric\n     * matrix stored in lower triangular form. The matrix will have\n     * ( nreq + 1 ) * nreq / 2 elements. For illustration \u003cpre\u003e\n     * cov \u003d\n     * {\n     *  cov_00,\n     *  cov_10, cov_11,\n     *  cov_20, cov_21, cov22,\n     *  ...\n     * } \u003c/pre\u003e\n     *\n     * @param nreq how many of the regressors to include (either in canonical\n     * order, or in the current reordered state)\n     * @return an array with the variance covariance of the included\n     * regressors in lower triangular form\n     ",
      "child_ranges": [
        "(line 514,col 9)-(line 516,col 9)",
        "(line 517,col 9)-(line 517,col 25)",
        "(line 518,col 9)-(line 522,col 9)",
        "(line 523,col 9)-(line 523,col 50)",
        "(line 524,col 9)-(line 524,col 58)",
        "(line 525,col 9)-(line 525,col 28)",
        "(line 526,col 9)-(line 526,col 60)",
        "(line 527,col 9)-(line 527,col 40)",
        "(line 528,col 9)-(line 528,col 17)",
        "(line 529,col 9)-(line 529,col 17)",
        "(line 530,col 9)-(line 530,col 22)",
        "(line 531,col 9)-(line 531,col 25)",
        "(line 532,col 9)-(line 557,col 9)",
        "(line 558,col 9)-(line 558,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.MillerUpdatingRegression.inverse(double[], int)",
      "begin_line": 568,
      "end_line": 597,
      "comment": "\n     * This internal method calculates the inverse of the upper-triangular portion\n     * of the R matrix.\n     * @param rinv  the storage for the inverse of r\n     * @param nreq how many of the regressors to include (either in canonical\n     * order, or in the current reordered state)\n     ",
      "child_ranges": [
        "(line 569,col 9)-(line 569,col 44)",
        "(line 570,col 9)-(line 570,col 22)",
        "(line 571,col 9)-(line 571,col 22)",
        "(line 572,col 9)-(line 572,col 27)",
        "(line 573,col 9)-(line 573,col 18)",
        "(line 574,col 9)-(line 574,col 38)",
        "(line 575,col 9)-(line 595,col 9)",
        "(line 596,col 9)-(line 596,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.MillerUpdatingRegression.getPartialCorrelations(int)",
      "begin_line": 632,
      "end_line": 701,
      "comment": "\n     * \u003cp\u003eIn the original algorithm only the partial correlations of the regressors\n     * is returned to the user. In this implementation, we have \u003cpre\u003e\n     * corr \u003d\n     * {\n     *   corrxx - lower triangular\n     *   corrxy - bottom row of the matrix\n     * }\n     * Replaces subroutines PCORR and COR of:\n     * ALGORITHM AS274  APPL. STATIST. (1992) VOL.41, NO. 2 \u003c/pre\u003e\u003c/p\u003e\n     *\n     * \u003cp\u003eCalculate partial correlations after the variables in rows\n     * 1, 2, ..., IN have been forced into the regression.\n     * If IN \u003d 1, and the first row of R represents a constant in the\n     * model, then the usual simple correlations are returned.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf IN \u003d 0, the value returned in array CORMAT for the correlation\n     * of variables Xi \u0026 Xj is: \u003cpre\u003e\n     * sum ( Xi.Xj ) / Sqrt ( sum (Xi^2) . sum (Xj^2) )\u003c/pre\u003e\u003c/p\u003e\n     *\n     * \u003cp\u003eOn return, array CORMAT contains the upper triangle of the matrix of\n     * partial correlations stored by rows, excluding the 1\u0027s on the diagonal.\n     * e.g. if IN \u003d 2, the consecutive elements returned are:\n     * (3,4) (3,5) ... (3,ncol), (4,5) (4,6) ... (4,ncol), etc.\n     * Array YCORR stores the partial correlations with the Y-variable\n     * starting with YCORR(IN+1) \u003d partial correlation with the variable in\n     * position (IN+1). \u003c/p\u003e\n     *\n     * @param in how many of the regressors to include (either in canonical\n     * order, or in the current reordered state)\n     * @return an array with the partial correlations of the remainder of\n     * regressors with each other and the regressand, in lower triangular form\n     ",
      "child_ranges": [
        "(line 633,col 9)-(line 633,col 74)",
        "(line 634,col 9)-(line 634,col 21)",
        "(line 635,col 9)-(line 635,col 16)",
        "(line 636,col 9)-(line 636,col 17)",
        "(line 637,col 9)-(line 637,col 17)",
        "(line 638,col 9)-(line 638,col 26)",
        "(line 639,col 9)-(line 639,col 32)",
        "(line 640,col 9)-(line 640,col 46)",
        "(line 641,col 9)-(line 641,col 51)",
        "(line 642,col 9)-(line 642,col 21)",
        "(line 643,col 9)-(line 643,col 21)",
        "(line 644,col 9)-(line 644,col 21)",
        "(line 645,col 9)-(line 645,col 56)",
        "(line 646,col 9)-(line 648,col 9)",
        "(line 649,col 9)-(line 649,col 28)",
        "(line 650,col 9)-(line 650,col 62)",
        "(line 651,col 9)-(line 653,col 9)",
        "(line 654,col 9)-(line 666,col 9)",
        "(line 667,col 9)-(line 667,col 22)",
        "(line 668,col 9)-(line 670,col 9)",
        "(line 671,col 9)-(line 673,col 9)",
        "(line 674,col 9)-(line 674,col 16)",
        "(line 675,col 9)-(line 698,col 9)",
        "(line 700,col 9)-(line 700,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.MillerUpdatingRegression.vmove(int, int)",
      "begin_line": 711,
      "end_line": 827,
      "comment": "\n     * ALGORITHM AS274 APPL. STATIST. (1992) VOL.41, NO. 2.\n     * Move variable from position FROM to position TO in an\n     * orthogonal reduction produced by AS75.1.\n     *\n     * @param from initial position\n     * @param to destination\n     ",
      "child_ranges": [
        "(line 712,col 9)-(line 712,col 18)",
        "(line 713,col 9)-(line 713,col 18)",
        "(line 714,col 9)-(line 714,col 17)",
        "(line 715,col 9)-(line 715,col 21)",
        "(line 716,col 9)-(line 716,col 21)",
        "(line 717,col 9)-(line 717,col 20)",
        "(line 718,col 9)-(line 718,col 20)",
        "(line 719,col 9)-(line 719,col 17)",
        "(line 720,col 9)-(line 720,col 18)",
        "(line 721,col 9)-(line 721,col 16)",
        "(line 722,col 9)-(line 722,col 15)",
        "(line 723,col 9)-(line 723,col 15)",
        "(line 724,col 9)-(line 724,col 16)",
        "(line 725,col 9)-(line 725,col 16)",
        "(line 726,col 9)-(line 726,col 34)",
        "(line 727,col 9)-(line 729,col 9)",
        "(line 730,col 9)-(line 732,col 9)",
        "(line 733,col 9)-(line 733,col 22)",
        "(line 734,col 9)-(line 742,col 9)",
        "(line 744,col 9)-(line 744,col 22)",
        "(line 745,col 9)-(line 745,col 20)",
        "(line 746,col 9)-(line 826,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.MillerUpdatingRegression.reorderRegressors(int[], int)",
      "begin_line": 844,
      "end_line": 871,
      "comment": "\n     * \u003cp\u003eALGORITHM AS274  APPL. STATIST. (1992) VOL.41, NO. 2\u003c/p\u003e\n     *\n     * \u003cp\u003e Re-order the variables in an orthogonal reduction produced by\n     * AS75.1 so that the N variables in LIST start at position POS1,\n     * though will not necessarily be in the same order as in LIST.\n     * Any variables in VORDER before position POS1 are not moved.\n     * Auxiliary routine called: VMOVE. \u003c/p\u003e\n     *\n     * \u003cp\u003eThis internal method reorders the regressors.\u003c/p\u003e\n     *\n     * @param list the regressors to move\n     * @param pos1 where the list will be placed\n     * @return -1 error, 0 everything ok\n     ",
      "child_ranges": [
        "(line 845,col 9)-(line 845,col 17)",
        "(line 846,col 9)-(line 846,col 14)",
        "(line 847,col 9)-(line 847,col 14)",
        "(line 848,col 9)-(line 850,col 9)",
        "(line 851,col 9)-(line 851,col 20)",
        "(line 852,col 9)-(line 852,col 17)",
        "(line 853,col 9)-(line 869,col 9)",
        "(line 870,col 9)-(line 870,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.MillerUpdatingRegression.getDiagonalOfHatMatrix(double[])",
      "begin_line": 879,
      "end_line": 911,
      "comment": "\n     * Gets the diagonal of the Hat matrix also known as the leverage matrix.\n     *\n     * @param  row_data returns the diagonal of the hat matrix for this observation\n     * @return the diagonal element of the hatmatrix\n     ",
      "child_ranges": [
        "(line 880,col 9)-(line 880,col 45)",
        "(line 881,col 9)-(line 881,col 16)",
        "(line 882,col 9)-(line 882,col 21)",
        "(line 884,col 9)-(line 886,col 9)",
        "(line 887,col 9)-(line 887,col 22)",
        "(line 888,col 9)-(line 894,col 9)",
        "(line 895,col 9)-(line 895,col 25)",
        "(line 896,col 9)-(line 909,col 9)",
        "(line 910,col 9)-(line 910,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.MillerUpdatingRegression.getOrderOfRegressors()",
      "begin_line": 920,
      "end_line": 922,
      "comment": "\n     * Gets the order of the regressors, useful if some type of reordering\n     * has been called. Calling regress with int[]{} args will trigger\n     * a reordering.\n     *\n     * @return int[] with the current order of the regressors\n     ",
      "child_ranges": [
        "(line 921,col 9)-(line 921,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.MillerUpdatingRegression.regress()",
      "begin_line": 931,
      "end_line": 933,
      "comment": "\n     * Conducts a regression on the data in the model, using all regressors.\n     *\n     * @return RegressionResults the structure holding all regression results\n     * @exception  ModelSpecificationException - thrown if number of observations is\n     * less than the number of variables\n     ",
      "child_ranges": [
        "(line 932,col 9)-(line 932,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.MillerUpdatingRegression.regress(int)",
      "begin_line": 945,
      "end_line": 1017,
      "comment": "\n     * Conducts a regression on the data in the model, using a subset of regressors.\n     *\n     * @param numberOfRegressors many of the regressors to include (either in canonical\n     * order, or in the current reordered state)\n     * @return RegressionResults the structure holding all regression results\n     * @exception  ModelSpecificationException - thrown if number of observations is\n     * less than the number of variables or number of regressors requested\n     * is greater than the regressors in the model\n     ",
      "child_ranges": [
        "(line 946,col 9)-(line 950,col 9)",
        "(line 951,col 9)-(line 954,col 9)",
        "(line 955,col 9)-(line 955,col 22)",
        "(line 957,col 9)-(line 957,col 25)",
        "(line 959,col 9)-(line 959,col 55)",
        "(line 961,col 9)-(line 961,col 18)",
        "(line 963,col 9)-(line 963,col 52)",
        "(line 965,col 9)-(line 965,col 20)",
        "(line 966,col 9)-(line 970,col 9)",
        "(line 972,col 9)-(line 972,col 37)",
        "(line 973,col 9)-(line 978,col 9)",
        "(line 979,col 9)-(line 1016,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.MillerUpdatingRegression.regress(int[])",
      "begin_line": 1031,
      "end_line": 1129,
      "comment": "\n     * Conducts a regression on the data in the model, using regressors in array\n     * Calling this method will change the internal order of the regressors\n     * and care is required in interpreting the hatmatrix.\n     *\n     * @param  variablesToInclude array of variables to include in regression\n     * @return RegressionResults the structure holding all regression results\n     * @exception  ModelSpecificationException - thrown if number of observations is\n     * less than the number of variables, the number of regressors requested\n     * is greater than the regressors in the model or a regressor index in\n     * regressor array does not exist\n     ",
      "child_ranges": [
        "(line 1032,col 9)-(line 1035,col 9)",
        "(line 1036,col 9)-(line 1040,col 9)",
        "(line 1041,col 9)-(line 1041,col 40)",
        "(line 1042,col 9)-(line 1042,col 25)",
        "(line 1043,col 9)-(line 1052,col 9)",
        "(line 1053,col 9)-(line 1053,col 21)",
        "(line 1054,col 9)-(line 1065,col 9)",
        "(line 1067,col 9)-(line 1067,col 42)",
        "(line 1069,col 9)-(line 1069,col 22)",
        "(line 1071,col 9)-(line 1071,col 25)",
        "(line 1073,col 9)-(line 1073,col 50)",
        "(line 1075,col 9)-(line 1075,col 18)",
        "(line 1077,col 9)-(line 1077,col 47)",
        "(line 1079,col 9)-(line 1079,col 20)",
        "(line 1080,col 9)-(line 1084,col 9)",
        "(line 1086,col 9)-(line 1086,col 37)",
        "(line 1087,col 9)-(line 1092,col 9)",
        "(line 1093,col 9)-(line 1128,col 9)"
      ]
    }
  ]
}