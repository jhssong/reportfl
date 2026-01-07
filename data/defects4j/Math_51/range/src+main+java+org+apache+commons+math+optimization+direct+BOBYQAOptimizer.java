{
  "filepath": "/tmp/Math-51b/src/main/java/org/apache/commons/math/optimization/direct/BOBYQAOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BOBYQAOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.direct.BaseAbstractScalarOptimizer\u003corg.apache.commons.math.analysis.MultivariateRealFunction\u003e",
        "org.apache.commons.math.optimization.MultivariateRealOptimizer"
      ],
      "begin_line": 55,
      "end_line": 3208,
      "comment": "\n * Powell\u0027s BOBYQA algorithm. This implementation is translated and\n * adapted from the Fortran version available\n * \u003ca href\u003d\"http://plato.asu.edu/ftp/other_software/bobyqa.zip\"\u003ehere\u003c/a\u003e.\n * See \u003ca href\u003d\"http://www.optimization-online.org/DB_HTML/2010/05/2616.html\"\u003e\n * this paper\u003c/a\u003e for an introduction.\n * \u003cbr/\u003e\n * BOBYQA is particularly well suited for high dimensional problems\n * where derivatives are not available. In most cases it outperforms the\n * {@link PowellOptimizer} significantly. Stochastic algorithms like\n * {@link CMAESOptimizer} succeed more often than BOBYQA, but are more\n * expensive. BOBYQA could also be considered as a replacement of any\n * derivative-based optimizer when the derivatives are approximated by\n * finite differences.\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ONE"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TWO"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TEN"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SIXTEEN"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TWO_HUNDRED_FIFTY"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MINUS_ONE"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "HALF"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ONE_OVER_FOUR"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ONE_OVER_EIGHT"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ONE_OVER_TEN"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ONE_OVER_A_THOUSAND"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MINIMUM_PROBLEM_DIMENSION"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " Minimum dimension of the problem: {@value} "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INITIAL_RADIUS"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " Default value for {@link #initialTrustRegionRadius}: {@value} . "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_STOPPING_RADIUS"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Default value for {@link #stoppingTrustRegionRadius}: {@value} . "
    },
    {
      "type": "field",
      "varNames": [
        "numberOfInterpolationPoints"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": "\n     * numberOfInterpolationPoints XXX\n     "
    },
    {
      "type": "field",
      "varNames": [
        "initialTrustRegionRadius"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": "\n     * initialTrustRegionRadius XXX\n     "
    },
    {
      "type": "field",
      "varNames": [
        "stoppingTrustRegionRadius"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": "\n     * stoppingTrustRegionRadius XXX\n     "
    },
    {
      "type": "field",
      "varNames": [
        "lowerBound"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": "\n     * Lower bounds of the objective variables.\n     * {@code null} means no bounds.\n     * XXX Should probably be passed to the \"optimize\" method (overload not existing yet).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "upperBound"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": "\n     * Upper bounds of the objective variables.\n     * {@code null} means no bounds.\n     * XXX Should probably be passed to the \"optimize\" method (overload not existing yet).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "isMinimize"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": " Goal type (minimize or maximize). "
    },
    {
      "type": "field",
      "varNames": [
        "currentBest"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": "\n     * Current best values for the variables to be optimized.\n     * The vector will be changed in-place to contain the values of the least\n     * calculated objective function values.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "boundDifference"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": " Differences between the upper and lower bounds. "
    },
    {
      "type": "field",
      "varNames": [
        "trustRegionCenterInterpolationPointIndex"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": "\n     * Index of the interpolation point at the trust region center.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.BOBYQAOptimizer.BOBYQAOptimizer(int)",
      "begin_line": 124,
      "end_line": 126,
      "comment": "\n     * @param numberOfInterpolationPoints Number of interpolation conditions.\n     * For a problem of dimension {@code n}, its value must be in the interval\n     * {@code [n+2, (n+1)(n+2)/2]}.\n     * Choices that exceed {@code 2n+1} are not recommended.\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.BOBYQAOptimizer.BOBYQAOptimizer(int, double[], double[])",
      "begin_line": 136,
      "end_line": 144,
      "comment": "\n     * @param numberOfInterpolationPoints Number of interpolation conditions.\n     * For a problem of dimension {@code n}, its value must be in the interval\n     * {@code [n+2, (n+1)(n+2)/2]}.\n     * Choices that exceed {@code 2n+1} are not recommended.\n     * @param lowerBound Lower bounds (constraints) of the objective variables.\n     * @param upperBound Upperer bounds (constraints) of the objective variables.\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 143,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.BOBYQAOptimizer.BOBYQAOptimizer(int, double[], double[], double, double)",
      "begin_line": 156,
      "end_line": 166,
      "comment": "\n     * @param numberOfInterpolationPoints Number of interpolation conditions.\n     * For a problem of dimension {@code n}, its value must be in the interval\n     * {@code [n+2, (n+1)(n+2)/2]}.\n     * Choices that exceed {@code 2n+1} are not recommended.\n     * @param lowerBound Lower bounds (constraints) of the objective variables.\n     * @param upperBound Upperer bounds (constraints) of the objective variables.\n     * @param initialTrustRegionRadius Initial trust region radius.\n     * @param stoppingTrustRegionRadius Stopping trust region radius.\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 83)",
        "(line 162,col 9)-(line 162,col 83)",
        "(line 163,col 9)-(line 163,col 71)",
        "(line 164,col 9)-(line 164,col 65)",
        "(line 165,col 9)-(line 165,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BOBYQAOptimizer.doOptimize()",
      "begin_line": 169,
      "end_line": 181,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 16)",
        "(line 174,col 9)-(line 174,col 58)",
        "(line 175,col 9)-(line 175,col 59)",
        "(line 177,col 9)-(line 177,col 38)",
        "(line 179,col 9)-(line 180,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqa()",
      "begin_line": 215,
      "end_line": 301,
      "comment": "\n     *     This subroutine seeks the least value of a function of many variables,\n     *     by applying a trust region method that forms quadratic models by\n     *     interpolation. There is usually some freedom in the interpolation\n     *     conditions, which is taken up by minimizing the Frobenius norm of\n     *     the change to the second derivative of the model, beginning with the\n     *     zero matrix. The values of the variables are constrained by upper and\n     *     lower bounds. The arguments of the subroutine are as follows.\n     *\n     *     N must be set to the number of variables and must be at least two.\n     *     NPT is the number of interpolation conditions. Its value must be in\n     *       the interval [N+2,(N+1)(N+2)/2]. Choices that exceed 2*N+1 are not\n     *       recommended.\n     *     Initial values of the variables must be set in X(1),X(2),...,X(N). They\n     *       will be changed to the values that give the least calculated F.\n     *     For I\u003d1,2,...,N, XL(I) and XU(I) must provide the lower and upper\n     *       bounds, respectively, on X(I). The construction of quadratic models\n     *       requires XL(I) to be strictly less than XU(I) for each I. Further,\n     *       the contribution to a model from changes to the I-th variable is\n     *       damaged severely by rounding errors if XU(I)-XL(I) is too small.\n     *     RHOBEG and RHOEND must be set to the initial and final values of a trust\n     *       region radius, so both must be positive with RHOEND no greater than\n     *       RHOBEG. Typically, RHOBEG should be about one tenth of the greatest\n     *       expected change to a variable, while RHOEND should indicate the\n     *       accuracy that is required in the final values of the variables. An\n     *       error return occurs if any of the differences XU(I)-XL(I), I\u003d1,...,N,\n     *       is less than 2*RHOBEG.\n     *     MAXFUN must be set to an upper bound on the number of calls of CALFUN.\n     *     The array W will be used for working space. Its length must be at least\n     *       (NPT+5)*(NPT+N)+3*N*(N+5)/2.\n     * @return\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 49)",
        "(line 219,col 9)-(line 219,col 52)",
        "(line 221,col 9)-(line 221,col 29)",
        "(line 222,col 9)-(line 222,col 33)",
        "(line 229,col 9)-(line 229,col 55)",
        "(line 230,col 9)-(line 230,col 60)",
        "(line 231,col 9)-(line 231,col 56)",
        "(line 232,col 9)-(line 232,col 54)",
        "(line 233,col 9)-(line 233,col 54)",
        "(line 234,col 9)-(line 234,col 61)",
        "(line 235,col 9)-(line 235,col 54)",
        "(line 236,col 9)-(line 236,col 62)",
        "(line 237,col 9)-(line 237,col 70)",
        "(line 238,col 9)-(line 238,col 58)",
        "(line 239,col 9)-(line 239,col 58)",
        "(line 240,col 9)-(line 240,col 54)",
        "(line 241,col 9)-(line 241,col 54)",
        "(line 242,col 9)-(line 242,col 53)",
        "(line 243,col 9)-(line 243,col 57)",
        "(line 252,col 9)-(line 282,col 9)",
        "(line 286,col 9)-(line 300,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqb(org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranMatrix, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranMatrix, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranMatrix, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray)",
      "begin_line": 355,
      "end_line": 1281,
      "comment": "\n     *     The arguments N, NPT, X, XL, XU, RHOBEG, RHOEND, IPRINT and MAXFUN\n     *       are identical to the corresponding arguments in SUBROUTINE BOBYQA.\n     *     XBASE holds a shift of origin that should reduce the contributions\n     *       from rounding errors to values of the model and Lagrange functions.\n     *     XPT is a two-dimensional array that holds the coordinates of the\n     *       interpolation points relative to XBASE.\n     *     FVAL holds the values of F at the interpolation points.\n     *     XOPT is set to the displacement from XBASE of the trust region centre.\n     *     GOPT holds the gradient of the quadratic model at XBASE+XOPT.\n     *     HQ holds the explicit second derivatives of the quadratic model.\n     *     PQ contains the parameters of the implicit second derivatives of the\n     *       quadratic model.\n     *     BMAT holds the last N columns of H.\n     *     ZMAT holds the factorization of the leading NPT by NPT submatrix of H,\n     *       this factorization being ZMAT times ZMAT^T, which provides both the\n     *       correct rank and positive semi-definiteness.\n     *     NDIM is the first dimension of BMAT and has the value NPT+N.\n     *     SL and SU hold the differences XL-XBASE and XU-XBASE, respectively.\n     *       All the components of every XOPT are going to satisfy the bounds\n     *       SL(I) .LEQ. XOPT(I) .LEQ. SU(I), with appropriate equalities when\n     *       XOPT is on a constraint boundary.\n     *     XNEW is chosen by SUBROUTINE TRSBOX or ALTMOV. Usually XBASE+XNEW is the\n     *       vector of variables for the next call of CALFUN. XNEW also satisfies\n     *       the SL and SU constraints in the way that has just been mentioned.\n     *     XALT is an alternative to XNEW, chosen by ALTMOV, that may replace XNEW\n     *       in order to increase the denominator in the updating of UPDATE.\n     *     D is reserved for a trial step from XOPT, which is usually XNEW-XOPT.\n     *     VLAG contains the values of the Lagrange functions at a new point X.\n     *       They are part of a product that requires VLAG to be of length NDIM.\n     *     W is a one-dimensional array that is used for working space. Its length\n     *       must be at least 3*NDIM \u003d 3*(NPT+N).\n     *\n     * @param xbase\n     * @param xpt\n     * @param fval\n     * @param xopt\n     * @param gopt\n     * @param hq\n     * @param pq\n     * @param bmat\n     * @param zmat\n     * @param sl\n     * @param su\n     * @param xnew\n     * @param xalt\n     * @param d__\n     * @param vlag\n     * @return\n     ",
      "child_ranges": [
        "(line 374,col 9)-(line 374,col 49)",
        "(line 375,col 9)-(line 375,col 52)",
        "(line 376,col 9)-(line 376,col 48)",
        "(line 377,col 9)-(line 377,col 29)",
        "(line 378,col 9)-(line 378,col 34)",
        "(line 379,col 9)-(line 379,col 34)",
        "(line 381,col 9)-(line 381,col 55)",
        "(line 382,col 9)-(line 382,col 57)",
        "(line 383,col 9)-(line 383,col 57)",
        "(line 385,col 9)-(line 385,col 35)",
        "(line 386,col 9)-(line 386,col 34)",
        "(line 387,col 9)-(line 387,col 32)",
        "(line 388,col 9)-(line 388,col 35)",
        "(line 391,col 9)-(line 391,col 23)",
        "(line 392,col 9)-(line 392,col 38)",
        "(line 395,col 9)-(line 395,col 21)",
        "(line 396,col 9)-(line 396,col 23)",
        "(line 397,col 9)-(line 397,col 18)",
        "(line 398,col 9)-(line 398,col 71)",
        "(line 399,col 9)-(line 399,col 21)",
        "(line 400,col 9)-(line 400,col 44)",
        "(line 401,col 9)-(line 401,col 20)",
        "(line 402,col 9)-(line 402,col 17)",
        "(line 403,col 9)-(line 403,col 98)",
        "(line 404,col 9)-(line 404,col 18)",
        "(line 405,col 9)-(line 405,col 80)",
        "(line 406,col 9)-(line 406,col 25)",
        "(line 407,col 9)-(line 407,col 58)",
        "(line 408,col 9)-(line 408,col 18)",
        "(line 409,col 9)-(line 409,col 29)",
        "(line 410,col 9)-(line 410,col 46)",
        "(line 411,col 9)-(line 411,col 22)",
        "(line 412,col 9)-(line 412,col 22)",
        "(line 413,col 9)-(line 413,col 26)",
        "(line 414,col 9)-(line 414,col 19)",
        "(line 428,col 9)-(line 428,col 53)",
        "(line 430,col 9)-(line 432,col 30)",
        "(line 433,col 9)-(line 433,col 29)",
        "(line 434,col 9)-(line 439,col 9)",
        "(line 440,col 9)-(line 440,col 33)",
        "(line 441,col 9)-(line 441,col 18)",
        "(line 445,col 9)-(line 445,col 39)",
        "(line 446,col 9)-(line 446,col 20)",
        "(line 447,col 9)-(line 447,col 33)",
        "(line 448,col 9)-(line 448,col 19)",
        "(line 449,col 9)-(line 449,col 21)",
        "(line 450,col 9)-(line 450,col 21)",
        "(line 451,col 9)-(line 451,col 18)",
        "(line 452,col 9)-(line 452,col 33)",
        "(line 457,col 9)-(line 457,col 23)",
        "(line 458,col 9)-(line 1280,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BOBYQAOptimizer.altmov(org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranMatrix, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranMatrix, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranMatrix, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray, int, double, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray)",
      "begin_line": 1326,
      "end_line": 1675,
      "comment": "\n     *     The arguments N, NPT, XPT, XOPT, BMAT, ZMAT, NDIM, SL and SU all have\n     *       the same meanings as the corresponding arguments of BOBYQB.\n     *     KOPT is the index of the optimal interpolation point.\n     *     KNEW is the index of the interpolation point that is going to be moved.\n     *     ADELT is the current trust region bound.\n     *     XNEW will be set to a suitable new position for the interpolation point\n     *       XPT(KNEW,.). Specifically, it satisfies the SL, SU and trust region\n     *       bounds and it should provide a large denominator in the next call of\n     *       UPDATE. The step XNEW-XOPT from XOPT is restricted to moves along the\n     *       straight lines through XOPT and another interpolation point.\n     *     XALT also provides a large value of the modulus of the KNEW-th Lagrange\n     *       function subject to the constraints that have been mentioned, its main\n     *       difference from XNEW being that XALT-XOPT is a constrained version of\n     *       the Cauchy step within the trust region. An exception is that XALT is\n     *       not calculated if all components of GLAG (see below) are zero.\n     *     ALPHA will be set to the KNEW-th diagonal element of the H matrix.\n     *     CAUCHY will be set to the square of the KNEW-th Lagrange function at\n     *       the step XALT-XOPT from XOPT for the vector XALT that is returned,\n     *       except that CAUCHY is set to zero if XALT is not calculated.\n     *     GLAG is a working space vector of length N for the gradient of the\n     *       KNEW-th Lagrange function at XOPT.\n     *     HCOL is a working space vector of length NPT for the second derivative\n     *       coefficients of the KNEW-th Lagrange function.\n     *     W is a working space vector of length 2N that is going to hold the\n     *       constrained Cauchy step from XOPT of the Lagrange function, followed\n     *       by the downhill version of XALT when the uphill step is calculated.\n     *\n     *     Set the first NPT components of W to the leading elements of the\n     *     KNEW-th column of the H matrix.\n     * @param xpt\n     * @param xopt\n     * @param bmat\n     * @param zmat\n     * @param sl\n     * @param su\n     * @param knew\n     * @param adelt\n     * @param xnew\n     * @param xalt\n     ",
      "child_ranges": [
        "(line 1340,col 9)-(line 1340,col 49)",
        "(line 1341,col 9)-(line 1341,col 52)",
        "(line 1342,col 9)-(line 1342,col 48)",
        "(line 1344,col 9)-(line 1344,col 54)",
        "(line 1345,col 9)-(line 1345,col 56)",
        "(line 1347,col 9)-(line 1347,col 55)",
        "(line 1348,col 9)-(line 1348,col 55)",
        "(line 1350,col 9)-(line 1350,col 34)",
        "(line 1351,col 9)-(line 1351,col 35)",
        "(line 1354,col 9)-(line 1354,col 38)",
        "(line 1357,col 9)-(line 1357,col 28)",
        "(line 1358,col 9)-(line 1358,col 23)",
        "(line 1359,col 9)-(line 1359,col 20)",
        "(line 1360,col 9)-(line 1360,col 17)",
        "(line 1361,col 9)-(line 1361,col 32)",
        "(line 1362,col 9)-(line 1362,col 21)",
        "(line 1363,col 9)-(line 1363,col 34)",
        "(line 1364,col 9)-(line 1364,col 18)",
        "(line 1365,col 9)-(line 1366,col 19)",
        "(line 1367,col 9)-(line 1367,col 23)",
        "(line 1368,col 9)-(line 1368,col 110)",
        "(line 1372,col 9)-(line 1372,col 38)",
        "(line 1373,col 9)-(line 1375,col 9)",
        "(line 1376,col 9)-(line 1381,col 9)",
        "(line 1382,col 9)-(line 1382,col 36)",
        "(line 1383,col 9)-(line 1383,col 26)",
        "(line 1387,col 9)-(line 1389,col 9)",
        "(line 1390,col 9)-(line 1399,col 9)",
        "(line 1407,col 9)-(line 1407,col 22)",
        "(line 1408,col 9)-(line 1514,col 9)",
        "(line 1518,col 9)-(line 1526,col 9)",
        "(line 1527,col 9)-(line 1529,col 9)",
        "(line 1530,col 9)-(line 1532,col 9)",
        "(line 1538,col 9)-(line 1538,col 31)",
        "(line 1539,col 9)-(line 1539,col 18)",
        "(line 1541,col 9)-(line 1666,col 14)",
        "(line 1667,col 9)-(line 1672,col 9)",
        "(line 1674,col 9)-(line 1674,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BOBYQAOptimizer.prelim(org.apache.commons.math.linear.ArrayRealVector, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranMatrix, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranMatrix, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranMatrix, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray)",
      "begin_line": 1708,
      "end_line": 1896,
      "comment": "\n     *     SUBROUTINE PRELIM sets the elements of XBASE, XPT, FVAL, GOPT, HQ, PQ,\n     *     BMAT and ZMAT for the first iteration, and it maintains the values of\n     *     NF and KOPT. The vector X is also changed by PRELIM.\n     *\n     *     The arguments N, NPT, X, XL, XU, RHOBEG, IPRINT and MAXFUN are the\n     *       same as the corresponding arguments in SUBROUTINE BOBYQA.\n     *     The arguments XBASE, XPT, FVAL, HQ, PQ, BMAT, ZMAT, NDIM, SL and SU\n     *       are the same as the corresponding arguments in BOBYQB, the elements\n     *       of SL and SU being set in BOBYQA.\n     *     GOPT is usually the gradient of the quadratic model at XOPT+XBASE, but\n     *       it is set by PRELIM to the gradient of the quadratic model at XBASE.\n     *       If XOPT is nonzero, BOBYQB will change it to its usual value later.\n     *     NF is maintaned as the number of calls of CALFUN so far.\n     *     KOPT will be such that the least calculated value of F so far is at\n     *       the point XPT(KOPT,.)+XBASE in the space of the variables.\n     *\n     * @param currentBest\n     * @param xbase\n     * @param xpt\n     * @param fval\n     * @param gopt\n     * @param hq\n     * @param pq\n     * @param bmat\n     * @param zmat\n     * @param sl\n     * @param su\n     ",
      "child_ranges": [
        "(line 1723,col 9)-(line 1723,col 49)",
        "(line 1724,col 9)-(line 1724,col 52)",
        "(line 1725,col 9)-(line 1725,col 48)",
        "(line 1727,col 9)-(line 1727,col 81)",
        "(line 1728,col 9)-(line 1728,col 41)",
        "(line 1729,col 9)-(line 1729,col 29)",
        "(line 1732,col 9)-(line 1732,col 38)",
        "(line 1735,col 9)-(line 1735,col 17)",
        "(line 1736,col 9)-(line 1736,col 20)",
        "(line 1737,col 9)-(line 1737,col 38)",
        "(line 1738,col 9)-(line 1738,col 66)",
        "(line 1739,col 9)-(line 1739,col 18)",
        "(line 1748,col 9)-(line 1756,col 9)",
        "(line 1757,col 9)-(line 1759,col 9)",
        "(line 1760,col 9)-(line 1765,col 9)",
        "(line 1771,col 9)-(line 1895,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BOBYQAOptimizer.rescue(org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranMatrix, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranMatrix, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranMatrix, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray, double, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray)",
      "begin_line": 1950,
      "end_line": 2432,
      "comment": "\n     *     The first NDIM+NPT elements of the array W are used for working space.\n     *     The final elements of BMAT and ZMAT are set in a well-conditioned way\n     *       to the values that are appropriate for the new interpolation points.\n     *     The elements of GOPT, HQ and PQ are also revised to the values that are\n     *       appropriate to the final quadratic model.\n     *\n     *     The arguments N, NPT, XL, XU, IPRINT, MAXFUN, XBASE, XPT, FVAL, XOPT,\n     *       GOPT, HQ, PQ, BMAT, ZMAT, NDIM, SL and SU have the same meanings as\n     *       the corresponding arguments of BOBYQB on the entry to RESCUE.\n     *     NF is maintained as the number of calls of CALFUN so far, except that\n     *       NF is set to -1 if the value of MAXFUN prevents further progress.\n     *     KOPT is maintained so that FVAL(KOPT) is the least calculated function\n     *       value. Its correct value must be given on entry. It is updated if a\n     *       new least function value is found, but the corresponding changes to\n     *       XOPT and GOPT have to be made later by the calling program.\n     *     DELTA is the current trust region radius.\n     *     VLAG is a working space vector that will be used for the values of the\n     *       provisional Lagrange functions at each of the interpolation points.\n     *       They are part of a product that requires VLAG to be of length NDIM.\n     *     PTSAUX is also a working space array. For J\u003d1,2,...,N, PTSAUX(1,J) and\n     *       PTSAUX(2,J) specify the two positions of provisional interpolation\n     *       points when a nonzero step is taken along e_J (the J-th coordinate\n     *       direction) through XBASE+XOPT, as specified below. Usually these\n     *       steps have length DELTA, but other lengths are chosen if necessary\n     *       in order to satisfy the given bounds on the variables.\n     *     PTSID is also a working space array. It has NPT components that denote\n     *       provisional new positions of the original interpolation points, in\n     *       case changes are needed to restore the linear independence of the\n     *       interpolation conditions. The K-th point is a candidate for change\n     *       if and only if PTSID(K) is nonzero. In this case let p and q be the\n     *       int parts of PTSID(K) and (PTSID(K)-p) multiplied by N+1. If p\n     *       and q are both positive, the step from XBASE+XOPT to the new K-th\n     *       interpolation point is PTSAUX(1,p)*e_p + PTSAUX(1,q)*e_q. Otherwise\n     *       the step is PTSAUX(1,p)*e_p or PTSAUX(2,q)*e_q in the cases q\u003d0 or\n     *       p\u003d0, respectively.\n     * @param xbase\n     * @param xpt\n     * @param fval\n     * @param xopt\n     * @param gopt\n     * @param hq\n     * @param pq\n     * @param bmat\n     * @param zmat\n     * @param sl\n     * @param su\n     * @param delta\n     * @param vlag\n     ",
      "child_ranges": [
        "(line 1967,col 9)-(line 1967,col 49)",
        "(line 1968,col 9)-(line 1968,col 52)",
        "(line 1969,col 9)-(line 1969,col 48)",
        "(line 1971,col 9)-(line 1971,col 61)",
        "(line 1972,col 9)-(line 1972,col 57)",
        "(line 1974,col 9)-(line 1974,col 57)",
        "(line 1975,col 9)-(line 1975,col 55)",
        "(line 1976,col 9)-(line 1976,col 57)",
        "(line 1978,col 9)-(line 1978,col 29)",
        "(line 1979,col 9)-(line 1979,col 48)",
        "(line 1980,col 9)-(line 1980,col 34)",
        "(line 1983,col 9)-(line 1983,col 38)",
        "(line 1987,col 9)-(line 1987,col 17)",
        "(line 1988,col 9)-(line 1988,col 27)",
        "(line 1989,col 9)-(line 1989,col 39)",
        "(line 1990,col 9)-(line 1990,col 20)",
        "(line 1991,col 9)-(line 1991,col 21)",
        "(line 1992,col 9)-(line 1992,col 43)",
        "(line 1993,col 9)-(line 1993,col 17)",
        "(line 1994,col 9)-(line 1994,col 20)",
        "(line 1995,col 9)-(line 1995,col 23)",
        "(line 1996,col 9)-(line 1996,col 26)",
        "(line 1997,col 9)-(line 1997,col 69)",
        "(line 1998,col 9)-(line 1998,col 38)",
        "(line 2011,col 9)-(line 2011,col 21)",
        "(line 2012,col 9)-(line 2012,col 20)",
        "(line 2013,col 9)-(line 2027,col 9)",
        "(line 2032,col 9)-(line 2032,col 15)",
        "(line 2033,col 9)-(line 2042,col 9)",
        "(line 2047,col 9)-(line 2073,col 9)",
        "(line 2074,col 9)-(line 2074,col 72)",
        "(line 2080,col 9)-(line 2080,col 33)",
        "(line 2081,col 9)-(line 2104,col 9)",
        "(line 2108,col 9)-(line 2124,col 9)",
        "(line 2125,col 9)-(line 2125,col 19)",
        "(line 2126,col 9)-(line 2126,col 17)",
        "(line 2127,col 9)-(line 2127,col 56)",
        "(line 2132,col 9)-(line 2132,col 23)",
        "(line 2133,col 9)-(line 2431,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BOBYQAOptimizer.trsbox(org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranMatrix, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray, double, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray)",
      "begin_line": 2491,
      "end_line": 2968,
      "comment": "\n     *     A version of the truncated conjugate gradient is applied. If a line\n     *     search is restricted by a constraint, then the procedure is restarted,\n     *     the values of the variables that are at their bounds being fixed. If\n     *     the trust region boundary is reached, then further changes may be made\n     *     to D, each one being in the two dimensional space that is spanned\n     *     by the current D and the gradient of Q at XOPT+D, staying on the trust\n     *     region boundary. Termination occurs when the reduction in Q seems to\n     *     be close to the greatest reduction that can be achieved.\n     *     The arguments N, NPT, XPT, XOPT, GOPT, HQ, PQ, SL and SU have the same\n     *       meanings as the corresponding arguments of BOBYQB.\n     *     DELTA is the trust region radius for the present calculation, which\n     *       seeks a small value of the quadratic model within distance DELTA of\n     *       XOPT subject to the bounds on the variables.\n     *     XNEW will be set to a new vector of variables that is approximately\n     *       the one that minimizes the quadratic model within the trust region\n     *       subject to the SL and SU constraints on the variables. It satisfies\n     *       as equations the bounds that become active during the calculation.\n     *     D is the calculated trial step from XOPT, generated iteratively from an\n     *       initial value of zero. Thus XNEW is XOPT+D after the final iteration.\n     *     GNEW holds the gradient of the quadratic model at XOPT+D. It is updated\n     *       when D is updated.\n     *     xbdi.get( is a working space vector. For I\u003d1,2,...,N, the element xbdi.get((I) is\n     *       set to -1.0, 0.0, or 1.0, the value being nonzero if and only if the\n     *       I-th variable has become fixed at a bound, the bound being SL(I) or\n     *       SU(I) in the case xbdi.get((I)\u003d-1.0 or xbdi.get((I)\u003d1.0, respectively. This\n     *       information is accumulated during the construction of XNEW.\n     *     The arrays S, HS and HRED are also used for working space. They hold the\n     *       current search direction, and the changes in the gradient of Q along S\n     *       and the reduced D, respectively, where the reduced D is the same as D,\n     *       except that the components of the fixed variables are zero.\n     *     DSQ will be set to the square of the length of XNEW-XOPT.\n     *     CRVMIN is set to zero if D reaches the trust region boundary. Otherwise\n     *       it is set to the least curvature of H that occurs in the conjugate\n     *       gradient searches that are not restricted by any constraints. The\n     *       value CRVMIN\u003d-1.0D0 is set, however, if all of these searches are\n     *       constrained.\n     * @param xpt\n     * @param xopt\n     * @param gopt\n     * @param hq\n     * @param pq\n     * @param sl\n     * @param su\n     * @param delta\n     * @param xnew\n     * @param d__\n     * @param gnew\n     * @param xbdi\n     * @param s\n     * @param hs\n     * @param hred\n     ",
      "child_ranges": [
        "(line 2510,col 9)-(line 2510,col 49)",
        "(line 2511,col 9)-(line 2511,col 52)",
        "(line 2513,col 9)-(line 2513,col 32)",
        "(line 2514,col 9)-(line 2514,col 35)",
        "(line 2517,col 9)-(line 2517,col 38)",
        "(line 2520,col 9)-(line 2520,col 15)",
        "(line 2521,col 9)-(line 2521,col 18)",
        "(line 2522,col 9)-(line 2522,col 15)",
        "(line 2523,col 9)-(line 2523,col 64)",
        "(line 2524,col 9)-(line 2524,col 31)",
        "(line 2525,col 9)-(line 2525,col 30)",
        "(line 2526,col 9)-(line 2526,col 17)",
        "(line 2527,col 9)-(line 2527,col 77)",
        "(line 2528,col 9)-(line 2528,col 18)",
        "(line 2529,col 9)-(line 2530,col 67)",
        "(line 2531,col 9)-(line 2531,col 23)",
        "(line 2532,col 9)-(line 2532,col 62)",
        "(line 2533,col 9)-(line 2533,col 24)",
        "(line 2546,col 9)-(line 2546,col 18)",
        "(line 2547,col 9)-(line 2547,col 17)",
        "(line 2548,col 9)-(line 2564,col 9)",
        "(line 2565,col 9)-(line 2565,col 30)",
        "(line 2566,col 9)-(line 2566,col 20)",
        "(line 2567,col 9)-(line 2567,col 27)",
        "(line 2575,col 9)-(line 2575,col 23)",
        "(line 2576,col 9)-(line 2967,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BOBYQAOptimizer.update(org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranMatrix, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranMatrix, org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray, double, double, int)",
      "begin_line": 2988,
      "end_line": 3082,
      "comment": "\n     *     The arrays BMAT and ZMAT are updated, as required by the new position\n     *     of the interpolation point that has the index KNEW. The vector VLAG has\n     *     N+NPT components, set on entry to the first NPT and last N components\n     *     of the product Hw in equation (4.11) of the Powell (2006) paper on\n     *     NEWUOA. Further, BETA is set on entry to the value of the parameter\n     *     with that name, and DENOM is set to the denominator of the updating\n     *     formula. Elements of ZMAT may be treated as zero if their moduli are\n     *     at most ZTEST. The first NDIM elements of W are used for working space.\n     * @param bmat\n     * @param zmat\n     * @param vlag\n     * @param beta\n     * @param denom\n     * @param knew\n     ",
      "child_ranges": [
        "(line 2998,col 9)-(line 2998,col 49)",
        "(line 2999,col 9)-(line 2999,col 52)",
        "(line 3000,col 9)-(line 3000,col 37)",
        "(line 3003,col 9)-(line 3003,col 60)",
        "(line 3007,col 9)-(line 3007,col 32)",
        "(line 3010,col 9)-(line 3010,col 15)",
        "(line 3011,col 9)-(line 3011,col 25)",
        "(line 3012,col 9)-(line 3012,col 42)",
        "(line 3016,col 9)-(line 3016,col 21)",
        "(line 3017,col 9)-(line 3022,col 9)",
        "(line 3023,col 9)-(line 3023,col 23)",
        "(line 3027,col 9)-(line 3045,col 9)",
        "(line 3050,col 9)-(line 3052,col 9)",
        "(line 3053,col 9)-(line 3053,col 36)",
        "(line 3054,col 9)-(line 3054,col 34)",
        "(line 3055,col 9)-(line 3055,col 55)",
        "(line 3059,col 9)-(line 3059,col 32)",
        "(line 3060,col 9)-(line 3060,col 46)",
        "(line 3061,col 9)-(line 3061,col 27)",
        "(line 3062,col 9)-(line 3065,col 9)",
        "(line 3069,col 9)-(line 3081,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BOBYQAOptimizer.setup()",
      "begin_line": 3088,
      "end_line": 3142,
      "comment": "\n     * Performs validity checks and adapt the {@link #lowerBound} and\n     * {@link #upperBound} array if no constraints were provided.\n     ",
      "child_ranges": [
        "(line 3091,col 9)-(line 3091,col 40)",
        "(line 3092,col 9)-(line 3092,col 42)",
        "(line 3095,col 9)-(line 3097,col 9)",
        "(line 3099,col 9)-(line 3099,col 95)",
        "(line 3100,col 9)-(line 3106,col 9)",
        "(line 3109,col 9)-(line 3113,col 9)",
        "(line 3115,col 9)-(line 3119,col 9)",
        "(line 3121,col 9)-(line 3128,col 9)",
        "(line 3131,col 9)-(line 3131,col 48)",
        "(line 3133,col 9)-(line 3133,col 62)",
        "(line 3134,col 9)-(line 3134,col 50)",
        "(line 3135,col 9)-(line 3138,col 9)",
        "(line 3139,col 9)-(line 3141,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FortranArray",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.ArrayRealVector"
      ],
      "begin_line": 3150,
      "end_line": 3167,
      "comment": "\n     * 1-based indexing vector\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray.FortranArray(int)",
      "begin_line": 3151,
      "end_line": 3153,
      "comment": "",
      "child_ranges": [
        "(line 3152,col 13)-(line 3152,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray.FortranArray(org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 3154,
      "end_line": 3156,
      "comment": "",
      "child_ranges": [
        "(line 3155,col 13)-(line 3155,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray.getEntry(int)",
      "begin_line": 3159,
      "end_line": 3161,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 3160,col 13)-(line 3160,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranArray.setEntry(int, double)",
      "begin_line": 3164,
      "end_line": 3166,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 3165,col 13)-(line 3165,col 45)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FortranMatrix",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.linear.Array2DRowRealMatrix"
      ],
      "begin_line": 3172,
      "end_line": 3185,
      "comment": "\n     * 1-based indexing matrix\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranMatrix.FortranMatrix(int, int)",
      "begin_line": 3173,
      "end_line": 3175,
      "comment": "",
      "child_ranges": [
        "(line 3174,col 13)-(line 3174,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranMatrix.getEntry(int, int)",
      "begin_line": 3177,
      "end_line": 3179,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 3178,col 13)-(line 3178,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BOBYQAOptimizer.FortranMatrix.setEntry(int, int, double)",
      "begin_line": 3182,
      "end_line": 3184,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 3183,col 13)-(line 3183,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BOBYQAOptimizer.fillNewArray(int, double)",
      "begin_line": 3195,
      "end_line": 3200,
      "comment": "\n     * Creates a new array.\n     *\n     * @param n Dimension of the returned array.\n     * @param value Value for each element.\n     * @return an array containing {@code n} elements set to the given\n     * {@code value}.\n     ",
      "child_ranges": [
        "(line 3197,col 9)-(line 3197,col 36)",
        "(line 3198,col 9)-(line 3198,col 31)",
        "(line 3199,col 9)-(line 3199,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BOBYQAOptimizer.f2jai(int)",
      "begin_line": 3205,
      "end_line": 3207,
      "comment": " function will be removed when all loops are converted to 0-base.",
      "child_ranges": [
        "(line 3206,col 9)-(line 3206,col 21)"
      ]
    }
  ]
}