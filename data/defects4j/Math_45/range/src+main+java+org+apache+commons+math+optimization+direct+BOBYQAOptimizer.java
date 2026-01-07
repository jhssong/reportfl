{
  "filepath": "/tmp/Math-45b/src/main/java/org/apache/commons/math/optimization/direct/BOBYQAOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BOBYQAOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.direct.BaseAbstractScalarOptimizer\u003corg.apache.commons.math.analysis.MultivariateRealFunction\u003e",
        "org.apache.commons.math.optimization.MultivariateRealOptimizer"
      ],
      "begin_line": 54,
      "end_line": 2528,
      "comment": "\n * Powell\u0027s BOBYQA algorithm. This implementation is translated and\n * adapted from the Fortran version available\n * \u003ca href\u003d\"http://plato.asu.edu/ftp/other_software/bobyqa.zip\"\u003ehere\u003c/a\u003e.\n * See \u003ca href\u003d\"http://www.optimization-online.org/DB_HTML/2010/05/2616.html\"\u003e\n * this paper\u003c/a\u003e for an introduction.\n * \u003cbr/\u003e\n * BOBYQA is particularly well suited for high dimensional problems\n * where derivatives are not available. In most cases it outperforms the\n * {@link PowellOptimizer} significantly. Stochastic algorithms like\n * {@link CMAESOptimizer} succeed more often than BOBYQA, but are more\n * expensive. BOBYQA could also be considered as a replacement of any\n * derivative-based optimizer when the derivatives are approximated by\n * finite differences.\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ONE"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TWO"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TEN"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SIXTEEN"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TWO_HUNDRED_FIFTY"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MINUS_ONE"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "HALF"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ONE_OVER_FOUR"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ONE_OVER_EIGHT"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ONE_OVER_TEN"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ONE_OVER_A_THOUSAND"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MINIMUM_PROBLEM_DIMENSION"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " Minimum dimension of the problem: {@value} "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INITIAL_RADIUS"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " Default value for {@link #initialTrustRegionRadius}: {@value} . "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_STOPPING_RADIUS"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " Default value for {@link #stoppingTrustRegionRadius}: {@value} . "
    },
    {
      "type": "field",
      "varNames": [
        "numberOfInterpolationPoints"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": "\n     * numberOfInterpolationPoints XXX\n     "
    },
    {
      "type": "field",
      "varNames": [
        "initialTrustRegionRadius"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": "\n     * initialTrustRegionRadius XXX\n     "
    },
    {
      "type": "field",
      "varNames": [
        "stoppingTrustRegionRadius"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": "\n     * stoppingTrustRegionRadius XXX\n     "
    },
    {
      "type": "field",
      "varNames": [
        "lowerBound"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": "\n     * Lower bounds of the objective variables.\n     * {@code null} means no bounds.\n     * XXX Should probably be passed to the \"optimize\" method (overload not existing yet).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "upperBound"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": "\n     * Upper bounds of the objective variables.\n     * {@code null} means no bounds.\n     * XXX Should probably be passed to the \"optimize\" method (overload not existing yet).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "isMinimize"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " Goal type (minimize or maximize). "
    },
    {
      "type": "field",
      "varNames": [
        "currentBest"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": "\n     * Current best values for the variables to be optimized.\n     * The vector will be changed in-place to contain the values of the least\n     * calculated objective function values.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "boundDifference"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": " Differences between the upper and lower bounds. "
    },
    {
      "type": "field",
      "varNames": [
        "trustRegionCenterInterpolationPointIndex"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": "\n     * Index of the interpolation point at the trust region center.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.BOBYQAOptimizer.BOBYQAOptimizer(int)",
      "begin_line": 123,
      "end_line": 125,
      "comment": "\n     * @param numberOfInterpolationPoints Number of interpolation conditions.\n     * For a problem of dimension {@code n}, its value must be in the interval\n     * {@code [n+2, (n+1)(n+2)/2]}.\n     * Choices that exceed {@code 2n+1} are not recommended.\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.BOBYQAOptimizer.BOBYQAOptimizer(int, double[], double[])",
      "begin_line": 135,
      "end_line": 143,
      "comment": "\n     * @param numberOfInterpolationPoints Number of interpolation conditions.\n     * For a problem of dimension {@code n}, its value must be in the interval\n     * {@code [n+2, (n+1)(n+2)/2]}.\n     * Choices that exceed {@code 2n+1} are not recommended.\n     * @param lowerBound Lower bounds (constraints) of the objective variables.\n     * @param upperBound Upperer bounds (constraints) of the objective variables.\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 142,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.BOBYQAOptimizer.BOBYQAOptimizer(int, double[], double[], double, double)",
      "begin_line": 155,
      "end_line": 165,
      "comment": "\n     * @param numberOfInterpolationPoints Number of interpolation conditions.\n     * For a problem of dimension {@code n}, its value must be in the interval\n     * {@code [n+2, (n+1)(n+2)/2]}.\n     * Choices that exceed {@code 2n+1} are not recommended.\n     * @param lowerBound Lower bounds (constraints) of the objective variables.\n     * @param upperBound Upperer bounds (constraints) of the objective variables.\n     * @param initialTrustRegionRadius Initial trust region radius.\n     * @param stoppingTrustRegionRadius Stopping trust region radius.\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 83)",
        "(line 161,col 9)-(line 161,col 83)",
        "(line 162,col 9)-(line 162,col 71)",
        "(line 163,col 9)-(line 163,col 65)",
        "(line 164,col 9)-(line 164,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BOBYQAOptimizer.doOptimize()",
      "begin_line": 168,
      "end_line": 180,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 16)",
        "(line 173,col 9)-(line 173,col 58)",
        "(line 174,col 9)-(line 174,col 59)",
        "(line 176,col 9)-(line 176,col 38)",
        "(line 178,col 9)-(line 179,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqa()",
      "begin_line": 214,
      "end_line": 300,
      "comment": "\n     *     This subroutine seeks the least value of a function of many variables,\n     *     by applying a trust region method that forms quadratic models by\n     *     interpolation. There is usually some freedom in the interpolation\n     *     conditions, which is taken up by minimizing the Frobenius norm of\n     *     the change to the second derivative of the model, beginning with the\n     *     zero matrix. The values of the variables are constrained by upper and\n     *     lower bounds. The arguments of the subroutine are as follows.\n     *\n     *     N must be set to the number of variables and must be at least two.\n     *     NPT is the number of interpolation conditions. Its value must be in\n     *       the interval [N+2,(N+1)(N+2)/2]. Choices that exceed 2*N+1 are not\n     *       recommended.\n     *     Initial values of the variables must be set in X(1),X(2),...,X(N). They\n     *       will be changed to the values that give the least calculated F.\n     *     For I\u003d1,2,...,N, XL(I) and XU(I) must provide the lower and upper\n     *       bounds, respectively, on X(I). The construction of quadratic models\n     *       requires XL(I) to be strictly less than XU(I) for each I. Further,\n     *       the contribution to a model from changes to the I-th variable is\n     *       damaged severely by rounding errors if XU(I)-XL(I) is too small.\n     *     RHOBEG and RHOEND must be set to the initial and final values of a trust\n     *       region radius, so both must be positive with RHOEND no greater than\n     *       RHOBEG. Typically, RHOBEG should be about one tenth of the greatest\n     *       expected change to a variable, while RHOEND should indicate the\n     *       accuracy that is required in the final values of the variables. An\n     *       error return occurs if any of the differences XU(I)-XL(I), I\u003d1,...,N,\n     *       is less than 2*RHOBEG.\n     *     MAXFUN must be set to an upper bound on the number of calls of CALFUN.\n     *     The array W will be used for working space. Its length must be at least\n     *       (NPT+5)*(NPT+N)+3*N*(N+5)/2.\n     * @return\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 49)",
        "(line 218,col 9)-(line 218,col 52)",
        "(line 220,col 9)-(line 220,col 29)",
        "(line 221,col 9)-(line 221,col 33)",
        "(line 228,col 9)-(line 228,col 61)",
        "(line 229,col 9)-(line 229,col 74)",
        "(line 230,col 9)-(line 230,col 62)",
        "(line 231,col 9)-(line 231,col 60)",
        "(line 232,col 9)-(line 232,col 60)",
        "(line 233,col 9)-(line 233,col 67)",
        "(line 234,col 9)-(line 234,col 60)",
        "(line 235,col 9)-(line 235,col 76)",
        "(line 236,col 9)-(line 236,col 84)",
        "(line 237,col 9)-(line 237,col 58)",
        "(line 238,col 9)-(line 238,col 58)",
        "(line 239,col 9)-(line 239,col 60)",
        "(line 240,col 9)-(line 240,col 60)",
        "(line 241,col 9)-(line 241,col 59)",
        "(line 242,col 9)-(line 242,col 63)",
        "(line 251,col 9)-(line 281,col 9)",
        "(line 285,col 9)-(line 299,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqb(org.apache.commons.math.linear.ArrayRealVector, org.apache.commons.math.linear.Array2DRowRealMatrix, org.apache.commons.math.linear.ArrayRealVector, org.apache.commons.math.linear.ArrayRealVector, org.apache.commons.math.linear.ArrayRealVector, org.apache.commons.math.linear.ArrayRealVector, org.apache.commons.math.linear.ArrayRealVector, org.apache.commons.math.linear.Array2DRowRealMatrix, org.apache.commons.math.linear.Array2DRowRealMatrix, org.apache.commons.math.linear.ArrayRealVector, org.apache.commons.math.linear.ArrayRealVector, org.apache.commons.math.linear.ArrayRealVector, org.apache.commons.math.linear.ArrayRealVector, org.apache.commons.math.linear.ArrayRealVector, org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 354,
      "end_line": 1239,
      "comment": "\n     *     The arguments N, NPT, X, XL, XU, RHOBEG, RHOEND, IPRINT and MAXFUN\n     *       are identical to the corresponding arguments in SUBROUTINE BOBYQA.\n     *     XBASE holds a shift of origin that should reduce the contributions\n     *       from rounding errors to values of the model and Lagrange functions.\n     *     XPT is a two-dimensional array that holds the coordinates of the\n     *       interpolation points relative to XBASE.\n     *     FVAL holds the values of F at the interpolation points.\n     *     XOPT is set to the displacement from XBASE of the trust region centre.\n     *     GOPT holds the gradient of the quadratic model at XBASE+XOPT.\n     *     HQ holds the explicit second derivatives of the quadratic model.\n     *     PQ contains the parameters of the implicit second derivatives of the\n     *       quadratic model.\n     *     BMAT holds the last N columns of H.\n     *     ZMAT holds the factorization of the leading NPT by NPT submatrix of H,\n     *       this factorization being ZMAT times ZMAT^T, which provides both the\n     *       correct rank and positive semi-definiteness.\n     *     NDIM is the first dimension of BMAT and has the value NPT+N.\n     *     SL and SU hold the differences XL-XBASE and XU-XBASE, respectively.\n     *       All the components of every XOPT are going to satisfy the bounds\n     *       SL(I) .LEQ. XOPT(I) .LEQ. SU(I), with appropriate equalities when\n     *       XOPT is on a constraint boundary.\n     *     XNEW is chosen by SUBROUTINE TRSBOX or ALTMOV. Usually XBASE+XNEW is the\n     *       vector of variables for the next call of CALFUN. XNEW also satisfies\n     *       the SL and SU constraints in the way that has just been mentioned.\n     *     XALT is an alternative to XNEW, chosen by ALTMOV, that may replace XNEW\n     *       in order to increase the denominator in the updating of UPDATE.\n     *     D is reserved for a trial step from XOPT, which is usually XNEW-XOPT.\n     *     VLAG contains the values of the Lagrange functions at a new point X.\n     *       They are part of a product that requires VLAG to be of length NDIM.\n     *     W is a one-dimensional array that is used for working space. Its length\n     *       must be at least 3*NDIM \u003d 3*(NPT+N).\n     *\n     * @param xbase\n     * @param xpt\n     * @param fval\n     * @param xopt\n     * @param gopt\n     * @param hq\n     * @param pq\n     * @param bmat\n     * @param zmat\n     * @param sl\n     * @param su\n     * @param xnew\n     * @param xalt\n     * @param d__\n     * @param vlag\n     * @return\n     ",
      "child_ranges": [
        "(line 373,col 9)-(line 373,col 49)",
        "(line 374,col 9)-(line 374,col 52)",
        "(line 375,col 9)-(line 375,col 29)",
        "(line 376,col 9)-(line 376,col 34)",
        "(line 377,col 9)-(line 377,col 34)",
        "(line 379,col 9)-(line 379,col 61)",
        "(line 380,col 9)-(line 380,col 63)",
        "(line 381,col 9)-(line 381,col 63)",
        "(line 383,col 9)-(line 383,col 35)",
        "(line 384,col 9)-(line 384,col 34)",
        "(line 385,col 9)-(line 385,col 32)",
        "(line 386,col 9)-(line 386,col 35)",
        "(line 389,col 9)-(line 389,col 38)",
        "(line 392,col 9)-(line 392,col 21)",
        "(line 393,col 9)-(line 393,col 23)",
        "(line 394,col 9)-(line 394,col 18)",
        "(line 395,col 9)-(line 395,col 71)",
        "(line 396,col 9)-(line 396,col 21)",
        "(line 397,col 9)-(line 397,col 44)",
        "(line 398,col 9)-(line 398,col 20)",
        "(line 399,col 9)-(line 399,col 17)",
        "(line 400,col 9)-(line 400,col 98)",
        "(line 401,col 9)-(line 401,col 18)",
        "(line 402,col 9)-(line 402,col 80)",
        "(line 403,col 9)-(line 403,col 18)",
        "(line 404,col 9)-(line 404,col 58)",
        "(line 405,col 9)-(line 405,col 18)",
        "(line 406,col 9)-(line 406,col 29)",
        "(line 407,col 9)-(line 407,col 46)",
        "(line 408,col 9)-(line 408,col 22)",
        "(line 409,col 9)-(line 409,col 22)",
        "(line 410,col 9)-(line 410,col 26)",
        "(line 411,col 9)-(line 411,col 19)",
        "(line 425,col 9)-(line 425,col 53)",
        "(line 427,col 9)-(line 429,col 30)",
        "(line 430,col 9)-(line 430,col 29)",
        "(line 431,col 9)-(line 436,col 9)",
        "(line 437,col 9)-(line 437,col 33)",
        "(line 438,col 9)-(line 438,col 18)",
        "(line 442,col 9)-(line 442,col 39)",
        "(line 443,col 9)-(line 443,col 20)",
        "(line 444,col 9)-(line 444,col 19)",
        "(line 445,col 9)-(line 445,col 21)",
        "(line 446,col 9)-(line 446,col 21)",
        "(line 447,col 9)-(line 447,col 18)",
        "(line 448,col 9)-(line 448,col 33)",
        "(line 453,col 9)-(line 453,col 23)",
        "(line 454,col 9)-(line 1238,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BOBYQAOptimizer.altmov(org.apache.commons.math.linear.Array2DRowRealMatrix, org.apache.commons.math.linear.ArrayRealVector, org.apache.commons.math.linear.Array2DRowRealMatrix, org.apache.commons.math.linear.Array2DRowRealMatrix, org.apache.commons.math.linear.ArrayRealVector, org.apache.commons.math.linear.ArrayRealVector, int, double, org.apache.commons.math.linear.ArrayRealVector, org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 1284,
      "end_line": 1601,
      "comment": "\n     *     The arguments N, NPT, XPT, XOPT, BMAT, ZMAT, NDIM, SL and SU all have\n     *       the same meanings as the corresponding arguments of BOBYQB.\n     *     KOPT is the index of the optimal interpolation point.\n     *     KNEW is the index of the interpolation point that is going to be moved.\n     *     ADELT is the current trust region bound.\n     *     XNEW will be set to a suitable new position for the interpolation point\n     *       XPT(KNEW,.). Specifically, it satisfies the SL, SU and trust region\n     *       bounds and it should provide a large denominator in the next call of\n     *       UPDATE. The step XNEW-XOPT from XOPT is restricted to moves along the\n     *       straight lines through XOPT and another interpolation point.\n     *     XALT also provides a large value of the modulus of the KNEW-th Lagrange\n     *       function subject to the constraints that have been mentioned, its main\n     *       difference from XNEW being that XALT-XOPT is a constrained version of\n     *       the Cauchy step within the trust region. An exception is that XALT is\n     *       not calculated if all components of GLAG (see below) are zero.\n     *     ALPHA will be set to the KNEW-th diagonal element of the H matrix.\n     *     CAUCHY will be set to the square of the KNEW-th Lagrange function at\n     *       the step XALT-XOPT from XOPT for the vector XALT that is returned,\n     *       except that CAUCHY is set to zero if XALT is not calculated.\n     *     GLAG is a working space vector of length N for the gradient of the\n     *       KNEW-th Lagrange function at XOPT.\n     *     HCOL is a working space vector of length NPT for the second derivative\n     *       coefficients of the KNEW-th Lagrange function.\n     *     W is a working space vector of length 2N that is going to hold the\n     *       constrained Cauchy step from XOPT of the Lagrange function, followed\n     *       by the downhill version of XALT when the uphill step is calculated.\n     *\n     *     Set the first NPT components of W to the leading elements of the\n     *     KNEW-th column of the H matrix.\n     * @param xpt\n     * @param xopt\n     * @param bmat\n     * @param zmat\n     * @param sl\n     * @param su\n     * @param knew\n     * @param adelt\n     * @param xnew\n     * @param xalt\n     ",
      "child_ranges": [
        "(line 1298,col 9)-(line 1298,col 49)",
        "(line 1299,col 9)-(line 1299,col 52)",
        "(line 1301,col 9)-(line 1301,col 60)",
        "(line 1302,col 9)-(line 1302,col 62)",
        "(line 1304,col 9)-(line 1304,col 61)",
        "(line 1305,col 9)-(line 1305,col 61)",
        "(line 1307,col 9)-(line 1309,col 9)",
        "(line 1310,col 9)-(line 1315,col 9)",
        "(line 1316,col 9)-(line 1316,col 49)",
        "(line 1317,col 9)-(line 1317,col 39)",
        "(line 1321,col 9)-(line 1323,col 9)",
        "(line 1324,col 9)-(line 1333,col 9)",
        "(line 1341,col 9)-(line 1341,col 29)",
        "(line 1342,col 9)-(line 1342,col 33)",
        "(line 1343,col 9)-(line 1343,col 21)",
        "(line 1344,col 9)-(line 1344,col 23)",
        "(line 1345,col 9)-(line 1345,col 26)",
        "(line 1346,col 9)-(line 1449,col 9)",
        "(line 1453,col 9)-(line 1457,col 9)",
        "(line 1458,col 9)-(line 1460,col 9)",
        "(line 1461,col 9)-(line 1463,col 9)",
        "(line 1469,col 9)-(line 1469,col 44)",
        "(line 1470,col 9)-(line 1470,col 22)",
        "(line 1471,col 9)-(line 1471,col 35)",
        "(line 1472,col 9)-(line 1472,col 28)",
        "(line 1473,col 9)-(line 1592,col 9)",
        "(line 1593,col 9)-(line 1598,col 9)",
        "(line 1600,col 9)-(line 1600,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BOBYQAOptimizer.prelim(org.apache.commons.math.linear.ArrayRealVector, org.apache.commons.math.linear.ArrayRealVector, org.apache.commons.math.linear.Array2DRowRealMatrix, org.apache.commons.math.linear.ArrayRealVector, org.apache.commons.math.linear.ArrayRealVector, org.apache.commons.math.linear.ArrayRealVector, org.apache.commons.math.linear.ArrayRealVector, org.apache.commons.math.linear.Array2DRowRealMatrix, org.apache.commons.math.linear.Array2DRowRealMatrix, org.apache.commons.math.linear.ArrayRealVector, org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 1634,
      "end_line": 1816,
      "comment": "\n     *     SUBROUTINE PRELIM sets the elements of XBASE, XPT, FVAL, GOPT, HQ, PQ,\n     *     BMAT and ZMAT for the first iteration, and it maintains the values of\n     *     NF and KOPT. The vector X is also changed by PRELIM.\n     *\n     *     The arguments N, NPT, X, XL, XU, RHOBEG, IPRINT and MAXFUN are the\n     *       same as the corresponding arguments in SUBROUTINE BOBYQA.\n     *     The arguments XBASE, XPT, FVAL, HQ, PQ, BMAT, ZMAT, NDIM, SL and SU\n     *       are the same as the corresponding arguments in BOBYQB, the elements\n     *       of SL and SU being set in BOBYQA.\n     *     GOPT is usually the gradient of the quadratic model at XOPT+XBASE, but\n     *       it is set by PRELIM to the gradient of the quadratic model at XBASE.\n     *       If XOPT is nonzero, BOBYQB will change it to its usual value later.\n     *     NF is maintaned as the number of calls of CALFUN so far.\n     *     KOPT will be such that the least calculated value of F so far is at\n     *       the point XPT(KOPT,.)+XBASE in the space of the variables.\n     *\n     * @param currentBest\n     * @param xbase\n     * @param xpt\n     * @param fval\n     * @param gopt\n     * @param hq\n     * @param pq\n     * @param bmat\n     * @param zmat\n     * @param sl\n     * @param su\n     ",
      "child_ranges": [
        "(line 1649,col 9)-(line 1649,col 49)",
        "(line 1650,col 9)-(line 1650,col 52)",
        "(line 1651,col 9)-(line 1651,col 48)",
        "(line 1653,col 9)-(line 1653,col 81)",
        "(line 1654,col 9)-(line 1654,col 40)",
        "(line 1655,col 9)-(line 1655,col 29)",
        "(line 1660,col 9)-(line 1668,col 9)",
        "(line 1669,col 9)-(line 1671,col 9)",
        "(line 1672,col 9)-(line 1677,col 9)",
        "(line 1683,col 9)-(line 1683,col 20)",
        "(line 1684,col 9)-(line 1684,col 20)",
        "(line 1685,col 9)-(line 1685,col 33)",
        "(line 1686,col 9)-(line 1815,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BOBYQAOptimizer.trsbox(org.apache.commons.math.linear.Array2DRowRealMatrix, org.apache.commons.math.linear.ArrayRealVector, org.apache.commons.math.linear.ArrayRealVector, org.apache.commons.math.linear.ArrayRealVector, org.apache.commons.math.linear.ArrayRealVector, org.apache.commons.math.linear.ArrayRealVector, org.apache.commons.math.linear.ArrayRealVector, double, org.apache.commons.math.linear.ArrayRealVector, org.apache.commons.math.linear.ArrayRealVector, org.apache.commons.math.linear.ArrayRealVector, org.apache.commons.math.linear.ArrayRealVector, org.apache.commons.math.linear.ArrayRealVector, org.apache.commons.math.linear.ArrayRealVector, org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 1874,
      "end_line": 2350,
      "comment": "\n     *     A version of the truncated conjugate gradient is applied. If a line\n     *     search is restricted by a constraint, then the procedure is restarted,\n     *     the values of the variables that are at their bounds being fixed. If\n     *     the trust region boundary is reached, then further changes may be made\n     *     to D, each one being in the two dimensional space that is spanned\n     *     by the current D and the gradient of Q at XOPT+D, staying on the trust\n     *     region boundary. Termination occurs when the reduction in Q seems to\n     *     be close to the greatest reduction that can be achieved.\n     *     The arguments N, NPT, XPT, XOPT, GOPT, HQ, PQ, SL and SU have the same\n     *       meanings as the corresponding arguments of BOBYQB.\n     *     DELTA is the trust region radius for the present calculation, which\n     *       seeks a small value of the quadratic model within distance DELTA of\n     *       XOPT subject to the bounds on the variables.\n     *     XNEW will be set to a new vector of variables that is approximately\n     *       the one that minimizes the quadratic model within the trust region\n     *       subject to the SL and SU constraints on the variables. It satisfies\n     *       as equations the bounds that become active during the calculation.\n     *     D is the calculated trial step from XOPT, generated iteratively from an\n     *       initial value of zero. Thus XNEW is XOPT+D after the final iteration.\n     *     GNEW holds the gradient of the quadratic model at XOPT+D. It is updated\n     *       when D is updated.\n     *     xbdi.get( is a working space vector. For I\u003d1,2,...,N, the element xbdi.get((I) is\n     *       set to -1.0, 0.0, or 1.0, the value being nonzero if and only if the\n     *       I-th variable has become fixed at a bound, the bound being SL(I) or\n     *       SU(I) in the case xbdi.get((I)\u003d-1.0 or xbdi.get((I)\u003d1.0, respectively. This\n     *       information is accumulated during the construction of XNEW.\n     *     The arrays S, HS and HRED are also used for working space. They hold the\n     *       current search direction, and the changes in the gradient of Q along S\n     *       and the reduced D, respectively, where the reduced D is the same as D,\n     *       except that the components of the fixed variables are zero.\n     *     DSQ will be set to the square of the length of XNEW-XOPT.\n     *     CRVMIN is set to zero if D reaches the trust region boundary. Otherwise\n     *       it is set to the least curvature of H that occurs in the conjugate\n     *       gradient searches that are not restricted by any constraints. The\n     *       value CRVMIN\u003d-1.0D0 is set, however, if all of these searches are\n     *       constrained.\n     * @param xpt\n     * @param xopt\n     * @param gopt\n     * @param hq\n     * @param pq\n     * @param sl\n     * @param su\n     * @param delta\n     * @param xnew\n     * @param d__\n     * @param gnew\n     * @param xbdi\n     * @param s\n     * @param hs\n     * @param hred\n     ",
      "child_ranges": [
        "(line 1893,col 9)-(line 1893,col 49)",
        "(line 1894,col 9)-(line 1894,col 52)",
        "(line 1896,col 9)-(line 1896,col 32)",
        "(line 1897,col 9)-(line 1897,col 35)",
        "(line 1900,col 9)-(line 1900,col 15)",
        "(line 1901,col 9)-(line 1901,col 18)",
        "(line 1902,col 9)-(line 1902,col 15)",
        "(line 1903,col 9)-(line 1903,col 64)",
        "(line 1904,col 9)-(line 1904,col 22)",
        "(line 1905,col 9)-(line 1905,col 21)",
        "(line 1906,col 9)-(line 1906,col 30)",
        "(line 1907,col 9)-(line 1907,col 17)",
        "(line 1908,col 9)-(line 1908,col 77)",
        "(line 1909,col 9)-(line 1909,col 18)",
        "(line 1910,col 9)-(line 1911,col 67)",
        "(line 1912,col 9)-(line 1912,col 23)",
        "(line 1913,col 9)-(line 1913,col 62)",
        "(line 1914,col 9)-(line 1914,col 24)",
        "(line 1927,col 9)-(line 1927,col 18)",
        "(line 1928,col 9)-(line 1928,col 17)",
        "(line 1929,col 9)-(line 1945,col 9)",
        "(line 1946,col 9)-(line 1946,col 30)",
        "(line 1947,col 9)-(line 1947,col 20)",
        "(line 1948,col 9)-(line 1948,col 27)",
        "(line 1956,col 9)-(line 1956,col 23)",
        "(line 1957,col 9)-(line 2349,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BOBYQAOptimizer.update(org.apache.commons.math.linear.Array2DRowRealMatrix, org.apache.commons.math.linear.Array2DRowRealMatrix, org.apache.commons.math.linear.ArrayRealVector, double, double, int)",
      "begin_line": 2370,
      "end_line": 2452,
      "comment": "\n     *     The arrays BMAT and ZMAT are updated, as required by the new position\n     *     of the interpolation point that has the index KNEW. The vector VLAG has\n     *     N+NPT components, set on entry to the first NPT and last N components\n     *     of the product Hw in equation (4.11) of the Powell (2006) paper on\n     *     NEWUOA. Further, BETA is set on entry to the value of the parameter\n     *     with that name, and DENOM is set to the denominator of the updating\n     *     formula. Elements of ZMAT may be treated as zero if their moduli are\n     *     at most ZTEST. The first NDIM elements of W are used for working space.\n     * @param bmat\n     * @param zmat\n     * @param vlag\n     * @param beta\n     * @param denom\n     * @param knew\n     ",
      "child_ranges": [
        "(line 2380,col 9)-(line 2380,col 49)",
        "(line 2381,col 9)-(line 2381,col 52)",
        "(line 2382,col 9)-(line 2382,col 37)",
        "(line 2385,col 9)-(line 2385,col 66)",
        "(line 2387,col 9)-(line 2387,col 28)",
        "(line 2388,col 9)-(line 2393,col 9)",
        "(line 2394,col 9)-(line 2394,col 23)",
        "(line 2398,col 9)-(line 2415,col 9)",
        "(line 2420,col 9)-(line 2422,col 9)",
        "(line 2423,col 9)-(line 2423,col 49)",
        "(line 2424,col 9)-(line 2424,col 47)",
        "(line 2425,col 9)-(line 2425,col 55)",
        "(line 2429,col 9)-(line 2429,col 50)",
        "(line 2430,col 9)-(line 2430,col 42)",
        "(line 2431,col 9)-(line 2431,col 61)",
        "(line 2432,col 9)-(line 2435,col 9)",
        "(line 2439,col 9)-(line 2451,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BOBYQAOptimizer.setup()",
      "begin_line": 2458,
      "end_line": 2512,
      "comment": "\n     * Performs validity checks and adapt the {@link #lowerBound} and\n     * {@link #upperBound} array if no constraints were provided.\n     ",
      "child_ranges": [
        "(line 2461,col 9)-(line 2461,col 40)",
        "(line 2462,col 9)-(line 2462,col 42)",
        "(line 2465,col 9)-(line 2467,col 9)",
        "(line 2469,col 9)-(line 2469,col 95)",
        "(line 2470,col 9)-(line 2476,col 9)",
        "(line 2479,col 9)-(line 2483,col 9)",
        "(line 2485,col 9)-(line 2489,col 9)",
        "(line 2491,col 8)-(line 2498,col 9)",
        "(line 2501,col 9)-(line 2501,col 48)",
        "(line 2503,col 9)-(line 2503,col 62)",
        "(line 2504,col 9)-(line 2504,col 50)",
        "(line 2505,col 8)-(line 2508,col 9)",
        "(line 2509,col 9)-(line 2511,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BOBYQAOptimizer.fillNewArray(int, double)",
      "begin_line": 2522,
      "end_line": 2527,
      "comment": "\n     * Creates a new array.\n     *\n     * @param n Dimension of the returned array.\n     * @param value Value for each element.\n     * @return an array containing {@code n} elements set to the given\n     * {@code value}.\n     ",
      "child_ranges": [
        "(line 2524,col 9)-(line 2524,col 36)",
        "(line 2525,col 9)-(line 2525,col 31)",
        "(line 2526,col 9)-(line 2526,col 18)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PathIsExploredException",
      "is_interface": false,
      "parent_types": [
        "java.lang.RuntimeException"
      ],
      "begin_line": 2534,
      "end_line": 2541,
      "comment": "\n * Marker for code paths that are not explored with the current unit tests.\n * If the path becomes explored, it should just be removed from the code.\n "
    },
    {
      "type": "field",
      "varNames": [
        "PATH_IS_EXPLORED"
      ],
      "begin_line": 2535,
      "end_line": 2536,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.PathIsExploredException.PathIsExploredException()",
      "begin_line": 2538,
      "end_line": 2540,
      "comment": "",
      "child_ranges": [
        "(line 2539,col 9)-(line 2539,col 32)"
      ]
    }
  ]
}