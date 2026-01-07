{
  "filepath": "/tmp/Math-19b/src/main/java/org/apache/commons/math3/stat/regression/MillerUpdatingRegression.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MillerUpdatingRegression",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.stat.regression.UpdatingMultipleLinearRegression"
      ],
      "begin_line": 43,
      "end_line": 1100,
      "comment": "\n * This class is a concrete implementation of the {@link UpdatingMultipleLinearRegression} interface.\n *\n * \u003cp\u003eThe algorithm is described in: \u003cpre\u003e\n * Algorithm AS 274: Least Squares Routines to Supplement Those of Gentleman\n * Author(s): Alan J. Miller\n * Source: Journal of the Royal Statistical Society.\n * Series C (Applied Statistics), Vol. 41, No. 2\n * (1992), pp. 458-478\n * Published by: Blackwell Publishing for the Royal Statistical Society\n * Stable URL: http://www.jstor.org/stable/2347583 \u003c/pre\u003e\u003c/p\u003e\n *\n * \u003cp\u003eThis method for multiple regression forms the solution to the OLS problem\n * by updating the QR decomposition as described by Gentleman.\u003c/p\u003e\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "nvars"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " number of variables in regression "
    },
    {
      "type": "field",
      "varNames": [
        "d"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " diagonals of cross products matrix "
    },
    {
      "type": "field",
      "varNames": [
        "rhs"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " the elements of the R`Y "
    },
    {
      "type": "field",
      "varNames": [
        "r"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " the off diagonal portion of the R matrix "
    },
    {
      "type": "field",
      "varNames": [
        "tol"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " the tolerance for each of the variables "
    },
    {
      "type": "field",
      "varNames": [
        "rss"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " residual sum of squares for all nested regressions "
    },
    {
      "type": "field",
      "varNames": [
        "vorder"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " order of the regressors "
    },
    {
      "type": "field",
      "varNames": [
        "work_tolset"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " scratch space for tolerance calc "
    },
    {
      "type": "field",
      "varNames": [
        "nobs"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " number of observations entered "
    },
    {
      "type": "field",
      "varNames": [
        "sserr"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " sum of squared errors of largest regression "
    },
    {
      "type": "field",
      "varNames": [
        "rss_set"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " has rss been called? "
    },
    {
      "type": "field",
      "varNames": [
        "tol_set"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " has the tolerance setting method been called "
    },
    {
      "type": "field",
      "varNames": [
        "lindep"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " flags for variables with linear dependency problems "
    },
    {
      "type": "field",
      "varNames": [
        "x_sing"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " singular x values "
    },
    {
      "type": "field",
      "varNames": [
        "work_sing"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " workspace for singularity method "
    },
    {
      "type": "field",
      "varNames": [
        "sumy"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " summation of Y variable "
    },
    {
      "type": "field",
      "varNames": [
        "sumsqy"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " summation of squared Y values "
    },
    {
      "type": "field",
      "varNames": [
        "hasIntercept"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " boolean flag whether a regression constant is added "
    },
    {
      "type": "field",
      "varNames": [
        "epsilon"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " zero tolerance "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.regression.MillerUpdatingRegression.MillerUpdatingRegression()",
      "begin_line": 87,
      "end_line": 90,
      "comment": "\n     *  Set the default constructor to private access\n     *  to prevent inadvertent instantiation\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.regression.MillerUpdatingRegression.MillerUpdatingRegression(int, boolean, double)",
      "begin_line": 99,
      "end_line": 128,
      "comment": "\n     * This is the augmented constructor for the MillerUpdatingRegression class.\n     *\n     * @param numberOfVariables number of regressors to expect, not including constant\n     * @param includeConstant include a constant automatically\n     * @param errorTolerance  zero tolerance, how machine zero is determined\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 102,col 9)",
        "(line 103,col 9)-(line 107,col 9)",
        "(line 108,col 9)-(line 108,col 44)",
        "(line 109,col 9)-(line 109,col 22)",
        "(line 110,col 9)-(line 110,col 40)",
        "(line 111,col 9)-(line 111,col 42)",
        "(line 112,col 9)-(line 112,col 63)",
        "(line 113,col 9)-(line 113,col 42)",
        "(line 114,col 9)-(line 114,col 42)",
        "(line 115,col 9)-(line 115,col 42)",
        "(line 116,col 9)-(line 116,col 45)",
        "(line 117,col 9)-(line 117,col 48)",
        "(line 118,col 9)-(line 118,col 50)",
        "(line 119,col 9)-(line 119,col 46)",
        "(line 120,col 9)-(line 122,col 9)",
        "(line 123,col 9)-(line 127,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.regression.MillerUpdatingRegression.MillerUpdatingRegression(int, boolean)",
      "begin_line": 136,
      "end_line": 138,
      "comment": "\n     * Primary constructor for the MillerUpdatingRegression.\n     *\n     * @param numberOfVariables maximum number of potential regressors\n     * @param includeConstant include a constant automatically\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.MillerUpdatingRegression.hasIntercept()",
      "begin_line": 144,
      "end_line": 146,
      "comment": "\n     * A getter method which determines whether a constant is included.\n     * @return true regression has an intercept, false no intercept\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.MillerUpdatingRegression.getN()",
      "begin_line": 152,
      "end_line": 154,
      "comment": "\n     * Gets the number of observations added to the regression model.\n     * @return number of observations\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.MillerUpdatingRegression.addObservation(double[], double)",
      "begin_line": 163,
      "end_line": 180,
      "comment": "\n     * Adds an observation to the regression model.\n     * @param x the array with regressor values\n     * @param y  the value of dependent variable given these regressors\n     * @exception ModelSpecificationException if the length of {@code x} does not equal\n     * the number of independent variables in the model\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 169,col 9)",
        "(line 170,col 9)-(line 177,col 9)",
        "(line 178,col 9)-(line 178,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.MillerUpdatingRegression.addObservations(double[][], double[])",
      "begin_line": 189,
      "end_line": 208,
      "comment": "\n     * Adds multiple observations to the model.\n     * @param x observations on the regressors\n     * @param y observations on the regressand\n     * @throws ModelSpecificationException if {@code x} is not rectangular, does not match\n     * the length of {@code y} or does not contain sufficient data to estimate the model\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 195,col 9)",
        "(line 196,col 9)-(line 199,col 9)",
        "(line 200,col 9)-(line 204,col 9)",
        "(line 205,col 9)-(line 207,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.MillerUpdatingRegression.include(double[], double, double)",
      "begin_line": 224,
      "end_line": 280,
      "comment": "\n     * The include method is where the QR decomposition occurs. This statement forms all\n     * intermediate data which will be used for all derivative measures.\n     * According to the miller paper, note that in the original implementation the x vector\n     * is overwritten. In this implementation, the include method is passed a copy of the\n     * original data vector so that there is no contamination of the data. Additionally,\n     * this method differs slightly from Gentleman\u0027s method, in that the assumption is\n     * of dense design matrices, there is some advantage in using the original gentleman algorithm\n     * on sparse matrices.\n     *\n     * @param x observations on the regressors\n     * @param wi weight of the this observation (-1,1)\n     * @param yi observation on the regressand\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 22)",
        "(line 226,col 9)-(line 226,col 22)",
        "(line 227,col 9)-(line 227,col 22)",
        "(line 228,col 9)-(line 228,col 18)",
        "(line 229,col 9)-(line 229,col 18)",
        "(line 230,col 9)-(line 230,col 19)",
        "(line 231,col 9)-(line 231,col 19)",
        "(line 232,col 9)-(line 232,col 18)",
        "(line 233,col 9)-(line 233,col 18)",
        "(line 234,col 9)-(line 234,col 29)",
        "(line 235,col 9)-(line 235,col 34)",
        "(line 236,col 9)-(line 236,col 43)",
        "(line 237,col 9)-(line 278,col 9)",
        "(line 279,col 9)-(line 279,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.MillerUpdatingRegression.smartAdd(double, double)",
      "begin_line": 289,
      "end_line": 305,
      "comment": "\n     * Adds to number a and b such that the contamination due to\n     * numerical smallness of one addend does not corrupt the sum.\n     * @param a - an addend\n     * @param b - an addend\n     * @return the sum of the a and b\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 36)",
        "(line 291,col 9)-(line 291,col 36)",
        "(line 292,col 9)-(line 304,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.MillerUpdatingRegression.clear()",
      "begin_line": 311,
      "end_line": 330,
      "comment": "\n     * As the name suggests,  clear wipes the internals and reorders everything in the\n     * canonical order.\n     ",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 33)",
        "(line 313,col 9)-(line 313,col 35)",
        "(line 314,col 9)-(line 314,col 33)",
        "(line 315,col 9)-(line 315,col 35)",
        "(line 316,col 9)-(line 316,col 35)",
        "(line 317,col 9)-(line 317,col 43)",
        "(line 318,col 9)-(line 318,col 41)",
        "(line 319,col 9)-(line 319,col 38)",
        "(line 320,col 9)-(line 320,col 40)",
        "(line 321,col 9)-(line 323,col 9)",
        "(line 324,col 9)-(line 324,col 22)",
        "(line 325,col 9)-(line 325,col 25)",
        "(line 326,col 9)-(line 326,col 24)",
        "(line 327,col 9)-(line 327,col 26)",
        "(line 328,col 9)-(line 328,col 29)",
        "(line 329,col 9)-(line 329,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.MillerUpdatingRegression.tolset()",
      "begin_line": 335,
      "end_line": 353,
      "comment": "\n     * This sets up tolerances for singularity testing.\n     ",
      "child_ranges": [
        "(line 336,col 9)-(line 336,col 16)",
        "(line 337,col 9)-(line 337,col 21)",
        "(line 338,col 9)-(line 338,col 40)",
        "(line 339,col 9)-(line 341,col 9)",
        "(line 342,col 9)-(line 342,col 43)",
        "(line 343,col 9)-(line 351,col 9)",
        "(line 352,col 9)-(line 352,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.MillerUpdatingRegression.regcf(int)",
      "begin_line": 364,
      "end_line": 400,
      "comment": "\n     * The regcf method conducts the linear regression and extracts the\n     * parameter vector. Notice that the algorithm can do subset regression\n     * with no alteration.\n     *\n     * @param nreq how many of the regressors to include (either in canonical\n     * order, or in the current reordered state)\n     * @return an array with the estimated slope coefficients\n     ",
      "child_ranges": [
        "(line 365,col 9)-(line 365,col 18)",
        "(line 366,col 9)-(line 368,col 9)",
        "(line 369,col 9)-(line 372,col 9)",
        "(line 373,col 9)-(line 375,col 9)",
        "(line 376,col 9)-(line 376,col 40)",
        "(line 377,col 9)-(line 377,col 36)",
        "(line 378,col 9)-(line 391,col 9)",
        "(line 392,col 9)-(line 398,col 9)",
        "(line 399,col 9)-(line 399,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.MillerUpdatingRegression.singcheck()",
      "begin_line": 406,
      "end_line": 449,
      "comment": "\n     * The method which checks for singularities and then eliminates the offending\n     * columns.\n     ",
      "child_ranges": [
        "(line 407,col 9)-(line 407,col 20)",
        "(line 408,col 9)-(line 408,col 17)",
        "(line 409,col 9)-(line 409,col 22)",
        "(line 410,col 9)-(line 410,col 16)",
        "(line 411,col 9)-(line 413,col 9)",
        "(line 414,col 9)-(line 448,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.MillerUpdatingRegression.ss()",
      "begin_line": 460,
      "end_line": 468,
      "comment": "\n     * Calculates the sum of squared errors for the full regression\n     * and all subsets in the following manner: \u003cpre\u003e\n     * rss[] \u003d{\n     * ResidualSumOfSquares_allNvars,\n     * ResidualSumOfSquares_FirstNvars-1,\n     * ResidualSumOfSquares_FirstNvars-2,\n     * ..., ResidualSumOfSquares_FirstVariable} \u003c/pre\u003e\n     ",
      "child_ranges": [
        "(line 461,col 9)-(line 461,col 29)",
        "(line 462,col 9)-(line 462,col 31)",
        "(line 463,col 9)-(line 466,col 9)",
        "(line 467,col 9)-(line 467,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.MillerUpdatingRegression.cov(int)",
      "begin_line": 488,
      "end_line": 534,
      "comment": "\n     * Calculates the cov matrix assuming only the first nreq variables are\n     * included in the calculation. The returned array contains a symmetric\n     * matrix stored in lower triangular form. The matrix will have\n     * ( nreq + 1 ) * nreq / 2 elements. For illustration \u003cpre\u003e\n     * cov \u003d\n     * {\n     *  cov_00,\n     *  cov_10, cov_11,\n     *  cov_20, cov_21, cov22,\n     *  ...\n     * } \u003c/pre\u003e\n     *\n     * @param nreq how many of the regressors to include (either in canonical\n     * order, or in the current reordered state)\n     * @return an array with the variance covariance of the included\n     * regressors in lower triangular form\n     ",
      "child_ranges": [
        "(line 489,col 9)-(line 491,col 9)",
        "(line 492,col 9)-(line 492,col 25)",
        "(line 493,col 9)-(line 497,col 9)",
        "(line 498,col 9)-(line 498,col 50)",
        "(line 499,col 9)-(line 499,col 58)",
        "(line 500,col 9)-(line 500,col 28)",
        "(line 501,col 9)-(line 501,col 60)",
        "(line 502,col 9)-(line 502,col 40)",
        "(line 503,col 9)-(line 503,col 17)",
        "(line 504,col 9)-(line 504,col 17)",
        "(line 505,col 9)-(line 505,col 22)",
        "(line 506,col 9)-(line 506,col 25)",
        "(line 507,col 9)-(line 532,col 9)",
        "(line 533,col 9)-(line 533,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.MillerUpdatingRegression.inverse(double[], int)",
      "begin_line": 543,
      "end_line": 571,
      "comment": "\n     * This internal method calculates the inverse of the upper-triangular portion\n     * of the R matrix.\n     * @param rinv  the storage for the inverse of r\n     * @param nreq how many of the regressors to include (either in canonical\n     * order, or in the current reordered state)\n     ",
      "child_ranges": [
        "(line 544,col 9)-(line 544,col 44)",
        "(line 545,col 9)-(line 545,col 22)",
        "(line 546,col 9)-(line 546,col 22)",
        "(line 547,col 9)-(line 547,col 27)",
        "(line 548,col 9)-(line 548,col 18)",
        "(line 549,col 9)-(line 549,col 38)",
        "(line 550,col 9)-(line 570,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.MillerUpdatingRegression.getPartialCorrelations(int)",
      "begin_line": 606,
      "end_line": 675,
      "comment": "\n     * In the original algorithm only the partial correlations of the regressors\n     * is returned to the user. In this implementation, we have \u003cpre\u003e\n     * corr \u003d\n     * {\n     *   corrxx - lower triangular\n     *   corrxy - bottom row of the matrix\n     * }\n     * Replaces subroutines PCORR and COR of:\n     * ALGORITHM AS274  APPL. STATIST. (1992) VOL.41, NO. 2 \u003c/pre\u003e\n     *\n     * \u003cp\u003eCalculate partial correlations after the variables in rows\n     * 1, 2, ..., IN have been forced into the regression.\n     * If IN \u003d 1, and the first row of R represents a constant in the\n     * model, then the usual simple correlations are returned.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf IN \u003d 0, the value returned in array CORMAT for the correlation\n     * of variables Xi \u0026 Xj is: \u003cpre\u003e\n     * sum ( Xi.Xj ) / Sqrt ( sum (Xi^2) . sum (Xj^2) )\u003c/pre\u003e\u003c/p\u003e\n     *\n     * \u003cp\u003eOn return, array CORMAT contains the upper triangle of the matrix of\n     * partial correlations stored by rows, excluding the 1\u0027s on the diagonal.\n     * e.g. if IN \u003d 2, the consecutive elements returned are:\n     * (3,4) (3,5) ... (3,ncol), (4,5) (4,6) ... (4,ncol), etc.\n     * Array YCORR stores the partial correlations with the Y-variable\n     * starting with YCORR(IN+1) \u003d partial correlation with the variable in\n     * position (IN+1). \u003c/p\u003e\n     *\n     * @param in how many of the regressors to include (either in canonical\n     * order, or in the current reordered state)\n     * @return an array with the partial correlations of the remainder of\n     * regressors with each other and the regressand, in lower triangular form\n     ",
      "child_ranges": [
        "(line 607,col 9)-(line 607,col 74)",
        "(line 608,col 9)-(line 608,col 21)",
        "(line 609,col 9)-(line 609,col 16)",
        "(line 610,col 9)-(line 610,col 17)",
        "(line 611,col 9)-(line 611,col 17)",
        "(line 612,col 9)-(line 612,col 26)",
        "(line 613,col 9)-(line 613,col 32)",
        "(line 614,col 9)-(line 614,col 46)",
        "(line 615,col 9)-(line 615,col 51)",
        "(line 616,col 9)-(line 616,col 21)",
        "(line 617,col 9)-(line 617,col 21)",
        "(line 618,col 9)-(line 618,col 21)",
        "(line 619,col 9)-(line 619,col 56)",
        "(line 620,col 9)-(line 622,col 9)",
        "(line 623,col 9)-(line 623,col 28)",
        "(line 624,col 9)-(line 624,col 62)",
        "(line 625,col 9)-(line 627,col 9)",
        "(line 628,col 9)-(line 640,col 9)",
        "(line 641,col 9)-(line 641,col 22)",
        "(line 642,col 9)-(line 644,col 9)",
        "(line 645,col 9)-(line 647,col 9)",
        "(line 648,col 9)-(line 648,col 16)",
        "(line 649,col 9)-(line 672,col 9)",
        "(line 674,col 9)-(line 674,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.MillerUpdatingRegression.vmove(int, int)",
      "begin_line": 685,
      "end_line": 801,
      "comment": "\n     * ALGORITHM AS274 APPL. STATIST. (1992) VOL.41, NO. 2.\n     * Move variable from position FROM to position TO in an\n     * orthogonal reduction produced by AS75.1.\n     *\n     * @param from initial position\n     * @param to destination\n     ",
      "child_ranges": [
        "(line 686,col 9)-(line 686,col 18)",
        "(line 687,col 9)-(line 687,col 18)",
        "(line 688,col 9)-(line 688,col 17)",
        "(line 689,col 9)-(line 689,col 21)",
        "(line 690,col 9)-(line 690,col 21)",
        "(line 691,col 9)-(line 691,col 20)",
        "(line 692,col 9)-(line 692,col 20)",
        "(line 693,col 9)-(line 693,col 17)",
        "(line 694,col 9)-(line 694,col 18)",
        "(line 695,col 9)-(line 695,col 16)",
        "(line 696,col 9)-(line 696,col 15)",
        "(line 697,col 9)-(line 697,col 15)",
        "(line 698,col 9)-(line 698,col 16)",
        "(line 699,col 9)-(line 699,col 16)",
        "(line 700,col 9)-(line 700,col 34)",
        "(line 701,col 9)-(line 703,col 9)",
        "(line 704,col 9)-(line 706,col 9)",
        "(line 707,col 9)-(line 707,col 22)",
        "(line 708,col 9)-(line 716,col 9)",
        "(line 718,col 9)-(line 718,col 22)",
        "(line 719,col 9)-(line 719,col 20)",
        "(line 720,col 9)-(line 800,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.MillerUpdatingRegression.reorderRegressors(int[], int)",
      "begin_line": 818,
      "end_line": 843,
      "comment": "\n     * ALGORITHM AS274  APPL. STATIST. (1992) VOL.41, NO. 2\n     *\n     * \u003cp\u003e Re-order the variables in an orthogonal reduction produced by\n     * AS75.1 so that the N variables in LIST start at position POS1,\n     * though will not necessarily be in the same order as in LIST.\n     * Any variables in VORDER before position POS1 are not moved.\n     * Auxiliary routine called: VMOVE. \u003c/p\u003e\n     *\n     * \u003cp\u003eThis internal method reorders the regressors.\u003c/p\u003e\n     *\n     * @param list the regressors to move\n     * @param pos1 where the list will be placed\n     * @return -1 error, 0 everything ok\n     ",
      "child_ranges": [
        "(line 819,col 9)-(line 819,col 17)",
        "(line 820,col 9)-(line 820,col 14)",
        "(line 821,col 9)-(line 821,col 14)",
        "(line 822,col 9)-(line 824,col 9)",
        "(line 825,col 9)-(line 825,col 20)",
        "(line 826,col 9)-(line 826,col 17)",
        "(line 827,col 9)-(line 841,col 9)",
        "(line 842,col 9)-(line 842,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.MillerUpdatingRegression.getDiagonalOfHatMatrix(double[])",
      "begin_line": 851,
      "end_line": 883,
      "comment": "\n     * Gets the diagonal of the Hat matrix also known as the leverage matrix.\n     *\n     * @param  row_data returns the diagonal of the hat matrix for this observation\n     * @return the diagonal element of the hatmatrix\n     ",
      "child_ranges": [
        "(line 852,col 9)-(line 852,col 45)",
        "(line 853,col 9)-(line 853,col 16)",
        "(line 854,col 9)-(line 854,col 21)",
        "(line 856,col 9)-(line 858,col 9)",
        "(line 859,col 9)-(line 859,col 22)",
        "(line 860,col 9)-(line 866,col 9)",
        "(line 867,col 9)-(line 867,col 25)",
        "(line 868,col 9)-(line 881,col 9)",
        "(line 882,col 9)-(line 882,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.MillerUpdatingRegression.getOrderOfRegressors()",
      "begin_line": 892,
      "end_line": 894,
      "comment": "\n     * Gets the order of the regressors, useful if some type of reordering\n     * has been called. Calling regress with int[]{} args will trigger\n     * a reordering.\n     *\n     * @return int[] with the current order of the regressors\n     ",
      "child_ranges": [
        "(line 893,col 9)-(line 893,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.MillerUpdatingRegression.regress()",
      "begin_line": 903,
      "end_line": 905,
      "comment": "\n     * Conducts a regression on the data in the model, using all regressors.\n     *\n     * @return RegressionResults the structure holding all regression results\n     * @exception  ModelSpecificationException - thrown if number of observations is\n     * less than the number of variables\n     ",
      "child_ranges": [
        "(line 904,col 9)-(line 904,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.MillerUpdatingRegression.regress(int)",
      "begin_line": 917,
      "end_line": 989,
      "comment": "\n     * Conducts a regression on the data in the model, using a subset of regressors.\n     *\n     * @param numberOfRegressors many of the regressors to include (either in canonical\n     * order, or in the current reordered state)\n     * @return RegressionResults the structure holding all regression results\n     * @exception  ModelSpecificationException - thrown if number of observations is\n     * less than the number of variables or number of regressors requested\n     * is greater than the regressors in the model\n     ",
      "child_ranges": [
        "(line 918,col 9)-(line 922,col 9)",
        "(line 923,col 9)-(line 926,col 9)",
        "(line 928,col 9)-(line 928,col 17)",
        "(line 929,col 9)-(line 929,col 20)",
        "(line 931,col 9)-(line 931,col 55)",
        "(line 933,col 9)-(line 933,col 13)",
        "(line 935,col 9)-(line 935,col 52)",
        "(line 937,col 9)-(line 937,col 20)",
        "(line 938,col 9)-(line 942,col 9)",
        "(line 944,col 9)-(line 944,col 37)",
        "(line 945,col 9)-(line 950,col 9)",
        "(line 951,col 9)-(line 988,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.MillerUpdatingRegression.regress(int[])",
      "begin_line": 1003,
      "end_line": 1099,
      "comment": "\n     * Conducts a regression on the data in the model, using regressors in array\n     * Calling this method will change the internal order of the regressors\n     * and care is required in interpreting the hatmatrix.\n     *\n     * @param  variablesToInclude array of variables to include in regression\n     * @return RegressionResults the structure holding all regression results\n     * @exception  ModelSpecificationException - thrown if number of observations is\n     * less than the number of variables, the number of regressors requested\n     * is greater than the regressors in the model or a regressor index in\n     * regressor array does not exist\n     ",
      "child_ranges": [
        "(line 1004,col 9)-(line 1007,col 9)",
        "(line 1008,col 9)-(line 1012,col 9)",
        "(line 1013,col 9)-(line 1013,col 40)",
        "(line 1014,col 9)-(line 1014,col 25)",
        "(line 1015,col 9)-(line 1024,col 9)",
        "(line 1025,col 9)-(line 1025,col 21)",
        "(line 1026,col 9)-(line 1037,col 9)",
        "(line 1039,col 9)-(line 1039,col 37)",
        "(line 1040,col 9)-(line 1040,col 17)",
        "(line 1041,col 9)-(line 1041,col 20)",
        "(line 1043,col 9)-(line 1043,col 50)",
        "(line 1045,col 9)-(line 1045,col 13)",
        "(line 1047,col 9)-(line 1047,col 47)",
        "(line 1049,col 9)-(line 1049,col 20)",
        "(line 1050,col 9)-(line 1054,col 9)",
        "(line 1056,col 9)-(line 1056,col 37)",
        "(line 1057,col 9)-(line 1062,col 9)",
        "(line 1063,col 9)-(line 1098,col 9)"
      ]
    }
  ]
}