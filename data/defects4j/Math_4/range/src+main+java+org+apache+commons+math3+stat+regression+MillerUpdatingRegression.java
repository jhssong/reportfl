{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/stat/regression/MillerUpdatingRegression.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MillerUpdatingRegression",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.stat.regression.UpdatingMultipleLinearRegression"
      ],
      "begin_line": 43,
      "end_line": 1102,
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
      "begin_line": 100,
      "end_line": 130,
      "comment": "\n     * This is the augmented constructor for the MillerUpdatingRegression class.\n     *\n     * @param numberOfVariables number of regressors to expect, not including constant\n     * @param includeConstant include a constant automatically\n     * @param errorTolerance  zero tolerance, how machine zero is determined\n     * @throws ModelSpecificationException if {@code numberOfVariables is less than 1}\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 104,col 9)",
        "(line 105,col 9)-(line 109,col 9)",
        "(line 110,col 9)-(line 110,col 44)",
        "(line 111,col 9)-(line 111,col 22)",
        "(line 112,col 9)-(line 112,col 40)",
        "(line 113,col 9)-(line 113,col 42)",
        "(line 114,col 9)-(line 114,col 63)",
        "(line 115,col 9)-(line 115,col 42)",
        "(line 116,col 9)-(line 116,col 42)",
        "(line 117,col 9)-(line 117,col 42)",
        "(line 118,col 9)-(line 118,col 45)",
        "(line 119,col 9)-(line 119,col 48)",
        "(line 120,col 9)-(line 120,col 50)",
        "(line 121,col 9)-(line 121,col 46)",
        "(line 122,col 9)-(line 124,col 9)",
        "(line 125,col 9)-(line 129,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.regression.MillerUpdatingRegression.MillerUpdatingRegression(int, boolean)",
      "begin_line": 139,
      "end_line": 142,
      "comment": "\n     * Primary constructor for the MillerUpdatingRegression.\n     *\n     * @param numberOfVariables maximum number of potential regressors\n     * @param includeConstant include a constant automatically\n     * @throws ModelSpecificationException if {@code numberOfVariables is less than 1}\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.MillerUpdatingRegression.hasIntercept()",
      "begin_line": 148,
      "end_line": 150,
      "comment": "\n     * A getter method which determines whether a constant is included.\n     * @return true regression has an intercept, false no intercept\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.MillerUpdatingRegression.getN()",
      "begin_line": 156,
      "end_line": 158,
      "comment": "\n     * Gets the number of observations added to the regression model.\n     * @return number of observations\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.MillerUpdatingRegression.addObservation(double[], double)",
      "begin_line": 167,
      "end_line": 185,
      "comment": "\n     * Adds an observation to the regression model.\n     * @param x the array with regressor values\n     * @param y  the value of dependent variable given these regressors\n     * @exception ModelSpecificationException if the length of {@code x} does not equal\n     * the number of independent variables in the model\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 174,col 9)",
        "(line 175,col 9)-(line 182,col 9)",
        "(line 183,col 9)-(line 183,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.MillerUpdatingRegression.addObservations(double[][], double[])",
      "begin_line": 194,
      "end_line": 213,
      "comment": "\n     * Adds multiple observations to the model.\n     * @param x observations on the regressors\n     * @param y observations on the regressand\n     * @throws ModelSpecificationException if {@code x} is not rectangular, does not match\n     * the length of {@code y} or does not contain sufficient data to estimate the model\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 200,col 9)",
        "(line 201,col 9)-(line 204,col 9)",
        "(line 205,col 9)-(line 209,col 9)",
        "(line 210,col 9)-(line 212,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.MillerUpdatingRegression.include(double[], double, double)",
      "begin_line": 229,
      "end_line": 285,
      "comment": "\n     * The include method is where the QR decomposition occurs. This statement forms all\n     * intermediate data which will be used for all derivative measures.\n     * According to the miller paper, note that in the original implementation the x vector\n     * is overwritten. In this implementation, the include method is passed a copy of the\n     * original data vector so that there is no contamination of the data. Additionally,\n     * this method differs slightly from Gentleman\u0027s method, in that the assumption is\n     * of dense design matrices, there is some advantage in using the original gentleman algorithm\n     * on sparse matrices.\n     *\n     * @param x observations on the regressors\n     * @param wi weight of the this observation (-1,1)\n     * @param yi observation on the regressand\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 22)",
        "(line 231,col 9)-(line 231,col 22)",
        "(line 232,col 9)-(line 232,col 22)",
        "(line 233,col 9)-(line 233,col 18)",
        "(line 234,col 9)-(line 234,col 18)",
        "(line 235,col 9)-(line 235,col 19)",
        "(line 236,col 9)-(line 236,col 19)",
        "(line 237,col 9)-(line 237,col 18)",
        "(line 238,col 9)-(line 238,col 18)",
        "(line 239,col 9)-(line 239,col 29)",
        "(line 240,col 9)-(line 240,col 34)",
        "(line 241,col 9)-(line 241,col 43)",
        "(line 242,col 9)-(line 283,col 9)",
        "(line 284,col 9)-(line 284,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.MillerUpdatingRegression.smartAdd(double, double)",
      "begin_line": 294,
      "end_line": 310,
      "comment": "\n     * Adds to number a and b such that the contamination due to\n     * numerical smallness of one addend does not corrupt the sum.\n     * @param a - an addend\n     * @param b - an addend\n     * @return the sum of the a and b\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 42)",
        "(line 296,col 9)-(line 296,col 42)",
        "(line 297,col 9)-(line 309,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.MillerUpdatingRegression.clear()",
      "begin_line": 316,
      "end_line": 335,
      "comment": "\n     * As the name suggests,  clear wipes the internals and reorders everything in the\n     * canonical order.\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 33)",
        "(line 318,col 9)-(line 318,col 35)",
        "(line 319,col 9)-(line 319,col 33)",
        "(line 320,col 9)-(line 320,col 35)",
        "(line 321,col 9)-(line 321,col 35)",
        "(line 322,col 9)-(line 322,col 43)",
        "(line 323,col 9)-(line 323,col 41)",
        "(line 324,col 9)-(line 324,col 38)",
        "(line 325,col 9)-(line 325,col 40)",
        "(line 326,col 9)-(line 328,col 9)",
        "(line 329,col 9)-(line 329,col 22)",
        "(line 330,col 9)-(line 330,col 25)",
        "(line 331,col 9)-(line 331,col 24)",
        "(line 332,col 9)-(line 332,col 26)",
        "(line 333,col 9)-(line 333,col 29)",
        "(line 334,col 9)-(line 334,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.MillerUpdatingRegression.tolset()",
      "begin_line": 340,
      "end_line": 358,
      "comment": "\n     * This sets up tolerances for singularity testing.\n     ",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 16)",
        "(line 342,col 9)-(line 342,col 21)",
        "(line 343,col 9)-(line 343,col 40)",
        "(line 344,col 9)-(line 346,col 9)",
        "(line 347,col 9)-(line 347,col 43)",
        "(line 348,col 9)-(line 356,col 9)",
        "(line 357,col 9)-(line 357,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.MillerUpdatingRegression.regcf(int)",
      "begin_line": 371,
      "end_line": 407,
      "comment": "\n     * The regcf method conducts the linear regression and extracts the\n     * parameter vector. Notice that the algorithm can do subset regression\n     * with no alteration.\n     *\n     * @param nreq how many of the regressors to include (either in canonical\n     * order, or in the current reordered state)\n     * @return an array with the estimated slope coefficients\n     * @throws ModelSpecificationException if {@code nreq} is less than 1\n     * or greater than the number of independent variables\n     ",
      "child_ranges": [
        "(line 372,col 9)-(line 372,col 18)",
        "(line 373,col 9)-(line 375,col 9)",
        "(line 376,col 9)-(line 379,col 9)",
        "(line 380,col 9)-(line 382,col 9)",
        "(line 383,col 9)-(line 383,col 46)",
        "(line 384,col 9)-(line 384,col 36)",
        "(line 385,col 9)-(line 398,col 9)",
        "(line 399,col 9)-(line 405,col 9)",
        "(line 406,col 9)-(line 406,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.MillerUpdatingRegression.singcheck()",
      "begin_line": 413,
      "end_line": 453,
      "comment": "\n     * The method which checks for singularities and then eliminates the offending\n     * columns.\n     ",
      "child_ranges": [
        "(line 414,col 9)-(line 414,col 16)",
        "(line 415,col 9)-(line 417,col 9)",
        "(line 418,col 9)-(line 452,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.MillerUpdatingRegression.ss()",
      "begin_line": 464,
      "end_line": 472,
      "comment": "\n     * Calculates the sum of squared errors for the full regression\n     * and all subsets in the following manner: \u003cpre\u003e\n     * rss[] \u003d{\n     * ResidualSumOfSquares_allNvars,\n     * ResidualSumOfSquares_FirstNvars-1,\n     * ResidualSumOfSquares_FirstNvars-2,\n     * ..., ResidualSumOfSquares_FirstVariable} \u003c/pre\u003e\n     ",
      "child_ranges": [
        "(line 465,col 9)-(line 465,col 29)",
        "(line 466,col 9)-(line 466,col 31)",
        "(line 467,col 9)-(line 470,col 9)",
        "(line 471,col 9)-(line 471,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.MillerUpdatingRegression.cov(int)",
      "begin_line": 492,
      "end_line": 538,
      "comment": "\n     * Calculates the cov matrix assuming only the first nreq variables are\n     * included in the calculation. The returned array contains a symmetric\n     * matrix stored in lower triangular form. The matrix will have\n     * ( nreq + 1 ) * nreq / 2 elements. For illustration \u003cpre\u003e\n     * cov \u003d\n     * {\n     *  cov_00,\n     *  cov_10, cov_11,\n     *  cov_20, cov_21, cov22,\n     *  ...\n     * } \u003c/pre\u003e\n     *\n     * @param nreq how many of the regressors to include (either in canonical\n     * order, or in the current reordered state)\n     * @return an array with the variance covariance of the included\n     * regressors in lower triangular form\n     ",
      "child_ranges": [
        "(line 493,col 9)-(line 495,col 9)",
        "(line 496,col 9)-(line 496,col 25)",
        "(line 497,col 9)-(line 501,col 9)",
        "(line 502,col 9)-(line 502,col 56)",
        "(line 503,col 9)-(line 503,col 64)",
        "(line 504,col 9)-(line 504,col 28)",
        "(line 505,col 9)-(line 505,col 66)",
        "(line 506,col 9)-(line 506,col 40)",
        "(line 507,col 9)-(line 507,col 17)",
        "(line 508,col 9)-(line 508,col 17)",
        "(line 509,col 9)-(line 509,col 22)",
        "(line 510,col 9)-(line 510,col 25)",
        "(line 511,col 9)-(line 536,col 9)",
        "(line 537,col 9)-(line 537,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.MillerUpdatingRegression.inverse(double[], int)",
      "begin_line": 547,
      "end_line": 574,
      "comment": "\n     * This internal method calculates the inverse of the upper-triangular portion\n     * of the R matrix.\n     * @param rinv  the storage for the inverse of r\n     * @param nreq how many of the regressors to include (either in canonical\n     * order, or in the current reordered state)\n     ",
      "child_ranges": [
        "(line 548,col 9)-(line 548,col 44)",
        "(line 549,col 9)-(line 549,col 22)",
        "(line 550,col 9)-(line 550,col 22)",
        "(line 551,col 9)-(line 551,col 27)",
        "(line 552,col 9)-(line 552,col 38)",
        "(line 553,col 9)-(line 573,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.MillerUpdatingRegression.getPartialCorrelations(int)",
      "begin_line": 609,
      "end_line": 677,
      "comment": "\n     * In the original algorithm only the partial correlations of the regressors\n     * is returned to the user. In this implementation, we have \u003cpre\u003e\n     * corr \u003d\n     * {\n     *   corrxx - lower triangular\n     *   corrxy - bottom row of the matrix\n     * }\n     * Replaces subroutines PCORR and COR of:\n     * ALGORITHM AS274  APPL. STATIST. (1992) VOL.41, NO. 2 \u003c/pre\u003e\n     *\n     * \u003cp\u003eCalculate partial correlations after the variables in rows\n     * 1, 2, ..., IN have been forced into the regression.\n     * If IN \u003d 1, and the first row of R represents a constant in the\n     * model, then the usual simple correlations are returned.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf IN \u003d 0, the value returned in array CORMAT for the correlation\n     * of variables Xi \u0026 Xj is: \u003cpre\u003e\n     * sum ( Xi.Xj ) / Sqrt ( sum (Xi^2) . sum (Xj^2) )\u003c/pre\u003e\u003c/p\u003e\n     *\n     * \u003cp\u003eOn return, array CORMAT contains the upper triangle of the matrix of\n     * partial correlations stored by rows, excluding the 1\u0027s on the diagonal.\n     * e.g. if IN \u003d 2, the consecutive elements returned are:\n     * (3,4) (3,5) ... (3,ncol), (4,5) (4,6) ... (4,ncol), etc.\n     * Array YCORR stores the partial correlations with the Y-variable\n     * starting with YCORR(IN+1) \u003d partial correlation with the variable in\n     * position (IN+1). \u003c/p\u003e\n     *\n     * @param in how many of the regressors to include (either in canonical\n     * order, or in the current reordered state)\n     * @return an array with the partial correlations of the remainder of\n     * regressors with each other and the regressand, in lower triangular form\n     ",
      "child_ranges": [
        "(line 610,col 9)-(line 610,col 80)",
        "(line 611,col 9)-(line 611,col 16)",
        "(line 612,col 9)-(line 612,col 17)",
        "(line 613,col 9)-(line 613,col 17)",
        "(line 614,col 9)-(line 614,col 32)",
        "(line 615,col 9)-(line 615,col 38)",
        "(line 616,col 9)-(line 616,col 52)",
        "(line 617,col 9)-(line 617,col 57)",
        "(line 618,col 9)-(line 618,col 21)",
        "(line 619,col 9)-(line 619,col 21)",
        "(line 620,col 9)-(line 620,col 21)",
        "(line 621,col 9)-(line 621,col 62)",
        "(line 622,col 9)-(line 624,col 9)",
        "(line 625,col 9)-(line 625,col 34)",
        "(line 626,col 9)-(line 626,col 72)",
        "(line 627,col 9)-(line 629,col 9)",
        "(line 630,col 9)-(line 642,col 9)",
        "(line 643,col 9)-(line 643,col 22)",
        "(line 644,col 9)-(line 646,col 9)",
        "(line 647,col 9)-(line 649,col 9)",
        "(line 650,col 9)-(line 650,col 16)",
        "(line 651,col 9)-(line 674,col 9)",
        "(line 676,col 9)-(line 676,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.MillerUpdatingRegression.vmove(int, int)",
      "begin_line": 687,
      "end_line": 803,
      "comment": "\n     * ALGORITHM AS274 APPL. STATIST. (1992) VOL.41, NO. 2.\n     * Move variable from position FROM to position TO in an\n     * orthogonal reduction produced by AS75.1.\n     *\n     * @param from initial position\n     * @param to destination\n     ",
      "child_ranges": [
        "(line 688,col 9)-(line 688,col 18)",
        "(line 689,col 9)-(line 689,col 18)",
        "(line 690,col 9)-(line 690,col 17)",
        "(line 691,col 9)-(line 691,col 21)",
        "(line 692,col 9)-(line 692,col 21)",
        "(line 693,col 9)-(line 693,col 20)",
        "(line 694,col 9)-(line 694,col 20)",
        "(line 695,col 9)-(line 695,col 17)",
        "(line 696,col 9)-(line 696,col 18)",
        "(line 697,col 9)-(line 697,col 16)",
        "(line 698,col 9)-(line 698,col 15)",
        "(line 699,col 9)-(line 699,col 15)",
        "(line 700,col 9)-(line 700,col 16)",
        "(line 701,col 9)-(line 701,col 16)",
        "(line 702,col 9)-(line 702,col 34)",
        "(line 703,col 9)-(line 705,col 9)",
        "(line 706,col 9)-(line 708,col 9)",
        "(line 709,col 9)-(line 709,col 22)",
        "(line 710,col 9)-(line 718,col 9)",
        "(line 720,col 9)-(line 720,col 22)",
        "(line 721,col 9)-(line 721,col 20)",
        "(line 722,col 9)-(line 802,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.MillerUpdatingRegression.reorderRegressors(int[], int)",
      "begin_line": 820,
      "end_line": 845,
      "comment": "\n     * ALGORITHM AS274  APPL. STATIST. (1992) VOL.41, NO. 2\n     *\n     * \u003cp\u003e Re-order the variables in an orthogonal reduction produced by\n     * AS75.1 so that the N variables in LIST start at position POS1,\n     * though will not necessarily be in the same order as in LIST.\n     * Any variables in VORDER before position POS1 are not moved.\n     * Auxiliary routine called: VMOVE. \u003c/p\u003e\n     *\n     * \u003cp\u003eThis internal method reorders the regressors.\u003c/p\u003e\n     *\n     * @param list the regressors to move\n     * @param pos1 where the list will be placed\n     * @return -1 error, 0 everything ok\n     ",
      "child_ranges": [
        "(line 821,col 9)-(line 821,col 17)",
        "(line 822,col 9)-(line 822,col 14)",
        "(line 823,col 9)-(line 823,col 14)",
        "(line 824,col 9)-(line 826,col 9)",
        "(line 827,col 9)-(line 827,col 20)",
        "(line 828,col 9)-(line 828,col 17)",
        "(line 829,col 9)-(line 843,col 9)",
        "(line 844,col 9)-(line 844,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.MillerUpdatingRegression.getDiagonalOfHatMatrix(double[])",
      "begin_line": 853,
      "end_line": 885,
      "comment": "\n     * Gets the diagonal of the Hat matrix also known as the leverage matrix.\n     *\n     * @param  row_data returns the diagonal of the hat matrix for this observation\n     * @return the diagonal element of the hatmatrix\n     ",
      "child_ranges": [
        "(line 854,col 9)-(line 854,col 45)",
        "(line 855,col 9)-(line 855,col 16)",
        "(line 856,col 9)-(line 856,col 21)",
        "(line 858,col 9)-(line 860,col 9)",
        "(line 861,col 9)-(line 861,col 22)",
        "(line 862,col 9)-(line 868,col 9)",
        "(line 869,col 9)-(line 869,col 25)",
        "(line 870,col 9)-(line 883,col 9)",
        "(line 884,col 9)-(line 884,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.MillerUpdatingRegression.getOrderOfRegressors()",
      "begin_line": 894,
      "end_line": 896,
      "comment": "\n     * Gets the order of the regressors, useful if some type of reordering\n     * has been called. Calling regress with int[]{} args will trigger\n     * a reordering.\n     *\n     * @return int[] with the current order of the regressors\n     ",
      "child_ranges": [
        "(line 895,col 9)-(line 895,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.MillerUpdatingRegression.regress()",
      "begin_line": 905,
      "end_line": 907,
      "comment": "\n     * Conducts a regression on the data in the model, using all regressors.\n     *\n     * @return RegressionResults the structure holding all regression results\n     * @exception  ModelSpecificationException - thrown if number of observations is\n     * less than the number of variables\n     ",
      "child_ranges": [
        "(line 906,col 9)-(line 906,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.MillerUpdatingRegression.regress(int)",
      "begin_line": 919,
      "end_line": 991,
      "comment": "\n     * Conducts a regression on the data in the model, using a subset of regressors.\n     *\n     * @param numberOfRegressors many of the regressors to include (either in canonical\n     * order, or in the current reordered state)\n     * @return RegressionResults the structure holding all regression results\n     * @exception  ModelSpecificationException - thrown if number of observations is\n     * less than the number of variables or number of regressors requested\n     * is greater than the regressors in the model\n     ",
      "child_ranges": [
        "(line 920,col 9)-(line 924,col 9)",
        "(line 925,col 9)-(line 928,col 9)",
        "(line 930,col 9)-(line 930,col 17)",
        "(line 931,col 9)-(line 931,col 20)",
        "(line 933,col 9)-(line 933,col 55)",
        "(line 935,col 9)-(line 935,col 13)",
        "(line 937,col 9)-(line 937,col 52)",
        "(line 939,col 9)-(line 939,col 20)",
        "(line 940,col 9)-(line 944,col 9)",
        "(line 946,col 9)-(line 946,col 37)",
        "(line 947,col 9)-(line 952,col 9)",
        "(line 953,col 9)-(line 990,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.MillerUpdatingRegression.regress(int[])",
      "begin_line": 1005,
      "end_line": 1101,
      "comment": "\n     * Conducts a regression on the data in the model, using regressors in array\n     * Calling this method will change the internal order of the regressors\n     * and care is required in interpreting the hatmatrix.\n     *\n     * @param  variablesToInclude array of variables to include in regression\n     * @return RegressionResults the structure holding all regression results\n     * @exception  ModelSpecificationException - thrown if number of observations is\n     * less than the number of variables, the number of regressors requested\n     * is greater than the regressors in the model or a regressor index in\n     * regressor array does not exist\n     ",
      "child_ranges": [
        "(line 1006,col 9)-(line 1009,col 9)",
        "(line 1010,col 9)-(line 1014,col 9)",
        "(line 1015,col 9)-(line 1015,col 40)",
        "(line 1016,col 9)-(line 1016,col 25)",
        "(line 1017,col 9)-(line 1026,col 9)",
        "(line 1027,col 9)-(line 1027,col 21)",
        "(line 1028,col 9)-(line 1039,col 9)",
        "(line 1041,col 9)-(line 1041,col 37)",
        "(line 1042,col 9)-(line 1042,col 17)",
        "(line 1043,col 9)-(line 1043,col 20)",
        "(line 1045,col 9)-(line 1045,col 50)",
        "(line 1047,col 9)-(line 1047,col 13)",
        "(line 1049,col 9)-(line 1049,col 47)",
        "(line 1051,col 9)-(line 1051,col 20)",
        "(line 1052,col 9)-(line 1056,col 9)",
        "(line 1058,col 9)-(line 1058,col 37)",
        "(line 1059,col 9)-(line 1064,col 9)",
        "(line 1065,col 9)-(line 1100,col 9)"
      ]
    }
  ]
}