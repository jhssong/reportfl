{
  "filepath": "/tmp/Math-44b/src/main/java/org/apache/commons/math/optimization/direct/BOBYQAOptimizer.java",
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
      "end_line": 2509,
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
      "type": "field",
      "varNames": [
        "bMatrix"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": "\n     * Last \u003cem\u003en\u003c/em\u003e columns of matrix H (where \u003cem\u003en\u003c/em\u003e is the dimension\n     * of the problem).\n     * XXX \"bmat\" in the original code.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "zMatrix"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": "\n     * Factorization of the leading \u003cem\u003enpt\u003c/em\u003e square submatrix of H, this\n     * factorization being Z Z\u003csup\u003eT\u003c/sup\u003e, which provides both the correct\n     * rank and positive semi-definiteness.\n     * XXX \"zmat\" in the original code.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "interpolationPoints"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": "\n     * Coordinates of the interpolation points relative to {@link #originShift}.\n     * XXX \"xpt\" in the original code.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "originShift"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": "\n     * Shift of origin that should reduce the contributions from rounding\n     * errors to values of the model and Lagrange functions.\n     * XXX \"xbase\" in the original code.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fAtInterpolationPoints"
      ],
      "begin_line": 144,
      "end_line": 144,
      "comment": "\n     * Values of the objective function at the interpolation points.\n     * XXX \"fval\" in the original code.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "trustRegionCenterOffset"
      ],
      "begin_line": 149,
      "end_line": 149,
      "comment": "\n     * Displacement from {@link #originShift} of the trust region center.\n     * XXX \"xopt\" in the original code.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "gradientAtTrustRegionCenter"
      ],
      "begin_line": 155,
      "end_line": 155,
      "comment": "\n     * Gradient of the quadratic model at {@link #originShift} +\n     * {@link #trustRegionCenterOffset}.\n     * XXX \"gopt\" in the original code.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "lowerDifference"
      ],
      "begin_line": 166,
      "end_line": 166,
      "comment": "\n     * Differences {@link #lowerBound} - {@link #originShift}.\n     * All the components of every {@link #trustRegionCenterOffset} are going\n     * to satisfy the bounds\u003cbr/\u003e\n     * {@link #lowerBound}\u003csub\u003ei\u003c/sub\u003e \u0026le;\n     * {@link #trustRegionCenterOffset}\u003csub\u003ei\u003c/sub\u003e,\u003cbr/\u003e\n     * with appropriate equalities when {@link #trustRegionCenterOffset} is\n     * on a constraint boundary.\n     * XXX \"sl\" in the original code.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "upperDifference"
      ],
      "begin_line": 177,
      "end_line": 177,
      "comment": "\n     * Differences {@link #upperBound} - {@link #originShift}\n     * All the components of every {@link #trustRegionCenterOffset} are going\n     * to satisfy the bounds\u003cbr/\u003e\n     *  {@link #trustRegionCenterOffset}\u003csub\u003ei\u003c/sub\u003e \u0026le;\n     *  {@link #upperBound}\u003csub\u003ei\u003c/sub\u003e,\u003cbr/\u003e\n     * with appropriate equalities when {@link #trustRegionCenterOffset} is\n     * on a constraint boundary.\n     * XXX \"su\" in the original code.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "modelSecondDerivativesParameters"
      ],
      "begin_line": 182,
      "end_line": 182,
      "comment": " \n     * Parameters of the implicit second derivatives of the quadratic model.\n     * XXX \"pq\" in the original code.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "newPoint"
      ],
      "begin_line": 193,
      "end_line": 193,
      "comment": "\n     * Point chosen by function {@link #trsbox(double,ArrayRealVector,\n     * ArrayRealVector, ArrayRealVector,ArrayRealVector,ArrayRealVector) trsbox}\n     * or {@link #altmov(int,double) altmov}.\n     * Usually {@link #originShift} + {@link #newPoint} is the vector of\n     * variables for the next evaluation of the objective function.\n     * It also satisfies the constraints indicated in {@link #lowerDifference}\n     * and {@link #upperDifference}.\n     * XXX \"xnew\" in the original code.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "alternativeNewPoint"
      ],
      "begin_line": 201,
      "end_line": 201,
      "comment": "\n     * Alternative to {@link #newPoint}, chosen by\n     * {@link #altmov(int,double) altmov}.\n     * It may replace {@link #newPoint} in order to increase the denominator\n     * in the {@link #update() updating procedure}.\n     * XXX \"xalt\" in the original code.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "trialStepPoint"
      ],
      "begin_line": 207,
      "end_line": 207,
      "comment": "\n     * Trial step from {@link #trustRegionCenterOffset} which is usually\n     * {@link #newPoint} - {@link #trustRegionCenterOffset}.\n     * XXX \"d__\" in the original code.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "lagrangeValuesAtNewPoint"
      ],
      "begin_line": 212,
      "end_line": 212,
      "comment": "\n     * Values of the Lagrange functions at a new point.\n     * XXX \"vlag\" in the original code.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "modelSecondDerivativesValues"
      ],
      "begin_line": 217,
      "end_line": 217,
      "comment": "\n     * Explicit second derivatives of the quadratic model.\n     * XXX \"hq\" in the original code.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.BOBYQAOptimizer.BOBYQAOptimizer(int)",
      "begin_line": 225,
      "end_line": 227,
      "comment": "\n     * @param numberOfInterpolationPoints Number of interpolation conditions.\n     * For a problem of dimension {@code n}, its value must be in the interval\n     * {@code [n+2, (n+1)(n+2)/2]}.\n     * Choices that exceed {@code 2n+1} are not recommended.\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.BOBYQAOptimizer.BOBYQAOptimizer(int, double[], double[])",
      "begin_line": 237,
      "end_line": 245,
      "comment": "\n     * @param numberOfInterpolationPoints Number of interpolation conditions.\n     * For a problem of dimension {@code n}, its value must be in the interval\n     * {@code [n+2, (n+1)(n+2)/2]}.\n     * Choices that exceed {@code 2n+1} are not recommended.\n     * @param lowerBound Lower bounds (constraints) of the objective variables.\n     * @param upperBound Upperer bounds (constraints) of the objective variables.\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 244,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.BOBYQAOptimizer.BOBYQAOptimizer(int, double[], double[], double, double)",
      "begin_line": 257,
      "end_line": 267,
      "comment": "\n     * @param numberOfInterpolationPoints Number of interpolation conditions.\n     * For a problem of dimension {@code n}, its value must be in the interval\n     * {@code [n+2, (n+1)(n+2)/2]}.\n     * Choices that exceed {@code 2n+1} are not recommended.\n     * @param lowerBound Lower bounds (constraints) of the objective variables.\n     * @param upperBound Upperer bounds (constraints) of the objective variables.\n     * @param initialTrustRegionRadius Initial trust region radius.\n     * @param stoppingTrustRegionRadius Stopping trust region radius.\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 84)",
        "(line 263,col 9)-(line 263,col 84)",
        "(line 264,col 9)-(line 264,col 71)",
        "(line 265,col 9)-(line 265,col 65)",
        "(line 266,col 9)-(line 266,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BOBYQAOptimizer.doOptimize()",
      "begin_line": 270,
      "end_line": 282,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 16)",
        "(line 275,col 9)-(line 275,col 58)",
        "(line 276,col 9)-(line 276,col 59)",
        "(line 278,col 9)-(line 278,col 38)",
        "(line 280,col 9)-(line 281,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqa()",
      "begin_line": 316,
      "end_line": 363,
      "comment": "\n     *     This subroutine seeks the least value of a function of many variables,\n     *     by applying a trust region method that forms quadratic models by\n     *     interpolation. There is usually some freedom in the interpolation\n     *     conditions, which is taken up by minimizing the Frobenius norm of\n     *     the change to the second derivative of the model, beginning with the\n     *     zero matrix. The values of the variables are constrained by upper and\n     *     lower bounds. The arguments of the subroutine are as follows.\n     *\n     *     N must be set to the number of variables and must be at least two.\n     *     NPT is the number of interpolation conditions. Its value must be in\n     *       the interval [N+2,(N+1)(N+2)/2]. Choices that exceed 2*N+1 are not\n     *       recommended.\n     *     Initial values of the variables must be set in X(1),X(2),...,X(N). They\n     *       will be changed to the values that give the least calculated F.\n     *     For I\u003d1,2,...,N, XL(I) and XU(I) must provide the lower and upper\n     *       bounds, respectively, on X(I). The construction of quadratic models\n     *       requires XL(I) to be strictly less than XU(I) for each I. Further,\n     *       the contribution to a model from changes to the I-th variable is\n     *       damaged severely by rounding errors if XU(I)-XL(I) is too small.\n     *     RHOBEG and RHOEND must be set to the initial and final values of a trust\n     *       region radius, so both must be positive with RHOEND no greater than\n     *       RHOBEG. Typically, RHOBEG should be about one tenth of the greatest\n     *       expected change to a variable, while RHOEND should indicate the\n     *       accuracy that is required in the final values of the variables. An\n     *       error return occurs if any of the differences XU(I)-XL(I), I\u003d1,...,N,\n     *       is less than 2*RHOBEG.\n     *     MAXFUN must be set to an upper bound on the number of calls of CALFUN.\n     *     The array W will be used for working space. Its length must be at least\n     *       (NPT+5)*(NPT+N)+3*N*(N+5)/2.\n     * @return\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 22)",
        "(line 319,col 9)-(line 319,col 49)",
        "(line 328,col 9)-(line 358,col 9)",
        "(line 362,col 9)-(line 362,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BOBYQAOptimizer.bobyqb()",
      "begin_line": 402,
      "end_line": 1246,
      "comment": "\n     *     The arguments N, NPT, X, XL, XU, RHOBEG, RHOEND, IPRINT and MAXFUN\n     *       are identical to the corresponding arguments in SUBROUTINE BOBYQA.\n     *     XBASE holds a shift of origin that should reduce the contributions\n     *       from rounding errors to values of the model and Lagrange functions.\n     *     XPT is a two-dimensional array that holds the coordinates of the\n     *       interpolation points relative to XBASE.\n     *     FVAL holds the values of F at the interpolation points.\n     *     XOPT is set to the displacement from XBASE of the trust region centre.\n     *     GOPT holds the gradient of the quadratic model at XBASE+XOPT.\n     *     HQ holds the explicit second derivatives of the quadratic model.\n     *     PQ contains the parameters of the implicit second derivatives of the\n     *       quadratic model.\n     *     BMAT holds the last N columns of H.\n     *     ZMAT holds the factorization of the leading NPT by NPT submatrix of H,\n     *       this factorization being ZMAT times ZMAT^T, which provides both the\n     *       correct rank and positive semi-definiteness.\n     *     NDIM is the first dimension of BMAT and has the value NPT+N.\n     *     SL and SU hold the differences XL-XBASE and XU-XBASE, respectively.\n     *       All the components of every XOPT are going to satisfy the bounds\n     *       SL(I) .LEQ. XOPT(I) .LEQ. SU(I), with appropriate equalities when\n     *       XOPT is on a constraint boundary.\n     *     XNEW is chosen by SUBROUTINE TRSBOX or ALTMOV. Usually XBASE+XNEW is the\n     *       vector of variables for the next call of CALFUN. XNEW also satisfies\n     *       the SL and SU constraints in the way that has just been mentioned.\n     *     XALT is an alternative to XNEW, chosen by ALTMOV, that may replace XNEW\n     *       in order to increase the denominator in the updating of UPDATE.\n     *     D is reserved for a trial step from XOPT, which is usually XNEW-XOPT.\n     *     VLAG contains the values of the Lagrange functions at a new point X.\n     *       They are part of a product that requires VLAG to be of length NDIM.\n     *     W is a one-dimensional array that is used for working space. Its length\n     *       must be at least 3*NDIM \u003d 3*(NPT+N).\n     *\n     * @return\n     ",
      "child_ranges": [
        "(line 403,col 9)-(line 403,col 22)",
        "(line 405,col 9)-(line 405,col 49)",
        "(line 406,col 9)-(line 406,col 52)",
        "(line 407,col 9)-(line 407,col 29)",
        "(line 408,col 9)-(line 408,col 34)",
        "(line 409,col 9)-(line 409,col 34)",
        "(line 411,col 9)-(line 411,col 61)",
        "(line 412,col 9)-(line 412,col 63)",
        "(line 413,col 9)-(line 413,col 63)",
        "(line 415,col 9)-(line 415,col 35)",
        "(line 416,col 9)-(line 416,col 34)",
        "(line 417,col 9)-(line 417,col 32)",
        "(line 418,col 9)-(line 418,col 35)",
        "(line 432,col 9)-(line 432,col 53)",
        "(line 434,col 9)-(line 434,col 17)",
        "(line 435,col 9)-(line 435,col 29)",
        "(line 436,col 9)-(line 441,col 9)",
        "(line 442,col 9)-(line 442,col 58)",
        "(line 443,col 9)-(line 443,col 28)",
        "(line 447,col 9)-(line 447,col 23)",
        "(line 448,col 9)-(line 448,col 22)",
        "(line 449,col 9)-(line 449,col 21)",
        "(line 450,col 9)-(line 450,col 37)",
        "(line 451,col 9)-(line 451,col 46)",
        "(line 452,col 9)-(line 452,col 27)",
        "(line 453,col 9)-(line 453,col 28)",
        "(line 454,col 9)-(line 454,col 28)",
        "(line 455,col 9)-(line 455,col 28)",
        "(line 456,col 9)-(line 456,col 24)",
        "(line 457,col 9)-(line 457,col 27)",
        "(line 458,col 9)-(line 458,col 28)",
        "(line 459,col 9)-(line 459,col 28)",
        "(line 460,col 9)-(line 460,col 28)",
        "(line 461,col 9)-(line 461,col 28)",
        "(line 462,col 9)-(line 462,col 29)",
        "(line 463,col 9)-(line 463,col 29)",
        "(line 464,col 9)-(line 464,col 29)",
        "(line 469,col 9)-(line 469,col 23)",
        "(line 470,col 9)-(line 1245,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BOBYQAOptimizer.altmov(int, double)",
      "begin_line": 1283,
      "end_line": 1586,
      "comment": "\n     *     The arguments N, NPT, XPT, XOPT, BMAT, ZMAT, NDIM, SL and SU all have\n     *       the same meanings as the corresponding arguments of BOBYQB.\n     *     KOPT is the index of the optimal interpolation point.\n     *     KNEW is the index of the interpolation point that is going to be moved.\n     *     ADELT is the current trust region bound.\n     *     XNEW will be set to a suitable new position for the interpolation point\n     *       XPT(KNEW,.). Specifically, it satisfies the SL, SU and trust region\n     *       bounds and it should provide a large denominator in the next call of\n     *       UPDATE. The step XNEW-XOPT from XOPT is restricted to moves along the\n     *       straight lines through XOPT and another interpolation point.\n     *     XALT also provides a large value of the modulus of the KNEW-th Lagrange\n     *       function subject to the constraints that have been mentioned, its main\n     *       difference from XNEW being that XALT-XOPT is a constrained version of\n     *       the Cauchy step within the trust region. An exception is that XALT is\n     *       not calculated if all components of GLAG (see below) are zero.\n     *     ALPHA will be set to the KNEW-th diagonal element of the H matrix.\n     *     CAUCHY will be set to the square of the KNEW-th Lagrange function at\n     *       the step XALT-XOPT from XOPT for the vector XALT that is returned,\n     *       except that CAUCHY is set to zero if XALT is not calculated.\n     *     GLAG is a working space vector of length N for the gradient of the\n     *       KNEW-th Lagrange function at XOPT.\n     *     HCOL is a working space vector of length NPT for the second derivative\n     *       coefficients of the KNEW-th Lagrange function.\n     *     W is a working space vector of length 2N that is going to hold the\n     *       constrained Cauchy step from XOPT of the Lagrange function, followed\n     *       by the downhill version of XALT when the uphill step is calculated.\n     *\n     *     Set the first NPT components of W to the leading elements of the\n     *     KNEW-th column of the H matrix.\n     * @param knew\n     * @param adelt\n     ",
      "child_ranges": [
        "(line 1287,col 9)-(line 1287,col 22)",
        "(line 1289,col 9)-(line 1289,col 49)",
        "(line 1290,col 9)-(line 1290,col 52)",
        "(line 1292,col 9)-(line 1292,col 60)",
        "(line 1293,col 9)-(line 1293,col 62)",
        "(line 1295,col 9)-(line 1295,col 61)",
        "(line 1296,col 9)-(line 1296,col 61)",
        "(line 1298,col 9)-(line 1300,col 9)",
        "(line 1301,col 9)-(line 1306,col 9)",
        "(line 1307,col 9)-(line 1307,col 49)",
        "(line 1308,col 9)-(line 1308,col 39)",
        "(line 1312,col 9)-(line 1314,col 9)",
        "(line 1315,col 9)-(line 1324,col 9)",
        "(line 1332,col 9)-(line 1332,col 29)",
        "(line 1333,col 9)-(line 1333,col 33)",
        "(line 1334,col 9)-(line 1334,col 21)",
        "(line 1335,col 9)-(line 1335,col 23)",
        "(line 1336,col 9)-(line 1336,col 26)",
        "(line 1337,col 9)-(line 1440,col 9)",
        "(line 1444,col 9)-(line 1448,col 9)",
        "(line 1449,col 9)-(line 1451,col 9)",
        "(line 1452,col 9)-(line 1454,col 9)",
        "(line 1460,col 9)-(line 1460,col 44)",
        "(line 1461,col 9)-(line 1461,col 22)",
        "(line 1462,col 9)-(line 1462,col 35)",
        "(line 1463,col 9)-(line 1463,col 28)",
        "(line 1464,col 9)-(line 1577,col 9)",
        "(line 1578,col 9)-(line 1583,col 9)",
        "(line 1585,col 9)-(line 1585,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BOBYQAOptimizer.prelim()",
      "begin_line": 1608,
      "end_line": 1778,
      "comment": "\n     *     SUBROUTINE PRELIM sets the elements of XBASE, XPT, FVAL, GOPT, HQ, PQ,\n     *     BMAT and ZMAT for the first iteration, and it maintains the values of\n     *     NF and KOPT. The vector X is also changed by PRELIM.\n     *\n     *     The arguments N, NPT, X, XL, XU, RHOBEG, IPRINT and MAXFUN are the\n     *       same as the corresponding arguments in SUBROUTINE BOBYQA.\n     *     The arguments XBASE, XPT, FVAL, HQ, PQ, BMAT, ZMAT, NDIM, SL and SU\n     *       are the same as the corresponding arguments in BOBYQB, the elements\n     *       of SL and SU being set in BOBYQA.\n     *     GOPT is usually the gradient of the quadratic model at XOPT+XBASE, but\n     *       it is set by PRELIM to the gradient of the quadratic model at XBASE.\n     *       If XOPT is nonzero, BOBYQB will change it to its usual value later.\n     *     NF is maintaned as the number of calls of CALFUN so far.\n     *     KOPT will be such that the least calculated value of F so far is at\n     *       the point XPT(KOPT,.)+XBASE in the space of the variables.\n     *\n     ",
      "child_ranges": [
        "(line 1609,col 9)-(line 1609,col 22)",
        "(line 1611,col 9)-(line 1611,col 49)",
        "(line 1612,col 9)-(line 1612,col 52)",
        "(line 1613,col 9)-(line 1613,col 51)",
        "(line 1615,col 9)-(line 1615,col 81)",
        "(line 1616,col 9)-(line 1616,col 40)",
        "(line 1617,col 9)-(line 1617,col 29)",
        "(line 1622,col 9)-(line 1630,col 9)",
        "(line 1631,col 9)-(line 1633,col 9)",
        "(line 1634,col 9)-(line 1639,col 9)",
        "(line 1645,col 9)-(line 1645,col 20)",
        "(line 1646,col 9)-(line 1646,col 20)",
        "(line 1647,col 9)-(line 1647,col 33)",
        "(line 1648,col 9)-(line 1777,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BOBYQAOptimizer.trsbox(double, org.apache.commons.math.linear.ArrayRealVector, org.apache.commons.math.linear.ArrayRealVector, org.apache.commons.math.linear.ArrayRealVector, org.apache.commons.math.linear.ArrayRealVector, org.apache.commons.math.linear.ArrayRealVector)",
      "begin_line": 1827,
      "end_line": 2301,
      "comment": "\n     *     A version of the truncated conjugate gradient is applied. If a line\n     *     search is restricted by a constraint, then the procedure is restarted,\n     *     the values of the variables that are at their bounds being fixed. If\n     *     the trust region boundary is reached, then further changes may be made\n     *     to D, each one being in the two dimensional space that is spanned\n     *     by the current D and the gradient of Q at XOPT+D, staying on the trust\n     *     region boundary. Termination occurs when the reduction in Q seems to\n     *     be close to the greatest reduction that can be achieved.\n     *     The arguments N, NPT, XPT, XOPT, GOPT, HQ, PQ, SL and SU have the same\n     *       meanings as the corresponding arguments of BOBYQB.\n     *     DELTA is the trust region radius for the present calculation, which\n     *       seeks a small value of the quadratic model within distance DELTA of\n     *       XOPT subject to the bounds on the variables.\n     *     XNEW will be set to a new vector of variables that is approximately\n     *       the one that minimizes the quadratic model within the trust region\n     *       subject to the SL and SU constraints on the variables. It satisfies\n     *       as equations the bounds that become active during the calculation.\n     *     D is the calculated trial step from XOPT, generated iteratively from an\n     *       initial value of zero. Thus XNEW is XOPT+D after the final iteration.\n     *     GNEW holds the gradient of the quadratic model at XOPT+D. It is updated\n     *       when D is updated.\n     *     xbdi.get( is a working space vector. For I\u003d1,2,...,N, the element xbdi.get((I) is\n     *       set to -1.0, 0.0, or 1.0, the value being nonzero if and only if the\n     *       I-th variable has become fixed at a bound, the bound being SL(I) or\n     *       SU(I) in the case xbdi.get((I)\u003d-1.0 or xbdi.get((I)\u003d1.0, respectively. This\n     *       information is accumulated during the construction of XNEW.\n     *     The arrays S, HS and HRED are also used for working space. They hold the\n     *       current search direction, and the changes in the gradient of Q along S\n     *       and the reduced D, respectively, where the reduced D is the same as D,\n     *       except that the components of the fixed variables are zero.\n     *     DSQ will be set to the square of the length of XNEW-XOPT.\n     *     CRVMIN is set to zero if D reaches the trust region boundary. Otherwise\n     *       it is set to the least curvature of H that occurs in the conjugate\n     *       gradient searches that are not restricted by any constraints. The\n     *       value CRVMIN\u003d-1.0D0 is set, however, if all of these searches are\n     *       constrained.\n     * @param delta\n     * @param gnew\n     * @param xbdi\n     * @param s\n     * @param hs\n     * @param hred\n     ",
      "child_ranges": [
        "(line 1835,col 9)-(line 1835,col 22)",
        "(line 1837,col 9)-(line 1837,col 49)",
        "(line 1838,col 9)-(line 1838,col 52)",
        "(line 1840,col 9)-(line 1840,col 32)",
        "(line 1841,col 9)-(line 1841,col 35)",
        "(line 1844,col 9)-(line 1844,col 18)",
        "(line 1845,col 9)-(line 1845,col 15)",
        "(line 1846,col 9)-(line 1846,col 64)",
        "(line 1847,col 9)-(line 1847,col 22)",
        "(line 1848,col 9)-(line 1848,col 21)",
        "(line 1849,col 9)-(line 1849,col 30)",
        "(line 1850,col 9)-(line 1850,col 17)",
        "(line 1851,col 9)-(line 1851,col 77)",
        "(line 1852,col 9)-(line 1852,col 18)",
        "(line 1853,col 9)-(line 1854,col 67)",
        "(line 1855,col 9)-(line 1855,col 23)",
        "(line 1856,col 9)-(line 1856,col 62)",
        "(line 1857,col 9)-(line 1857,col 24)",
        "(line 1870,col 9)-(line 1870,col 18)",
        "(line 1871,col 9)-(line 1871,col 17)",
        "(line 1872,col 9)-(line 1888,col 9)",
        "(line 1889,col 9)-(line 1889,col 30)",
        "(line 1890,col 9)-(line 1890,col 20)",
        "(line 1891,col 9)-(line 1891,col 27)",
        "(line 1899,col 9)-(line 1899,col 23)",
        "(line 1900,col 9)-(line 2300,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BOBYQAOptimizer.update(double, double, int)",
      "begin_line": 2318,
      "end_line": 2397,
      "comment": "\n     *     The arrays BMAT and ZMAT are updated, as required by the new position\n     *     of the interpolation point that has the index KNEW. The vector VLAG has\n     *     N+NPT components, set on entry to the first NPT and last N components\n     *     of the product Hw in equation (4.11) of the Powell (2006) paper on\n     *     NEWUOA. Further, BETA is set on entry to the value of the parameter\n     *     with that name, and DENOM is set to the denominator of the updating\n     *     formula. Elements of ZMAT may be treated as zero if their moduli are\n     *     at most ZTEST. The first NDIM elements of W are used for working space.\n     * @param beta\n     * @param denom\n     * @param knew\n     ",
      "child_ranges": [
        "(line 2323,col 9)-(line 2323,col 22)",
        "(line 2325,col 9)-(line 2325,col 49)",
        "(line 2326,col 9)-(line 2326,col 52)",
        "(line 2327,col 9)-(line 2327,col 37)",
        "(line 2330,col 9)-(line 2330,col 66)",
        "(line 2332,col 9)-(line 2332,col 28)",
        "(line 2333,col 9)-(line 2338,col 9)",
        "(line 2339,col 9)-(line 2339,col 23)",
        "(line 2343,col 9)-(line 2360,col 9)",
        "(line 2365,col 9)-(line 2367,col 9)",
        "(line 2368,col 9)-(line 2368,col 49)",
        "(line 2369,col 9)-(line 2369,col 67)",
        "(line 2370,col 9)-(line 2370,col 95)",
        "(line 2374,col 9)-(line 2374,col 50)",
        "(line 2375,col 9)-(line 2375,col 42)",
        "(line 2376,col 9)-(line 2376,col 64)",
        "(line 2377,col 9)-(line 2380,col 9)",
        "(line 2384,col 9)-(line 2396,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BOBYQAOptimizer.setup()",
      "begin_line": 2403,
      "end_line": 2477,
      "comment": "\n     * Performs validity checks and adapt the {@link #lowerBound} and\n     * {@link #upperBound} array if no constraints were provided.\n     ",
      "child_ranges": [
        "(line 2404,col 9)-(line 2404,col 22)",
        "(line 2406,col 9)-(line 2406,col 40)",
        "(line 2407,col 9)-(line 2407,col 42)",
        "(line 2410,col 9)-(line 2412,col 9)",
        "(line 2414,col 9)-(line 2414,col 95)",
        "(line 2415,col 9)-(line 2421,col 9)",
        "(line 2424,col 9)-(line 2428,col 9)",
        "(line 2430,col 9)-(line 2434,col 9)",
        "(line 2436,col 8)-(line 2443,col 9)",
        "(line 2446,col 9)-(line 2446,col 48)",
        "(line 2448,col 9)-(line 2448,col 62)",
        "(line 2449,col 9)-(line 2449,col 50)",
        "(line 2450,col 8)-(line 2453,col 9)",
        "(line 2454,col 9)-(line 2456,col 9)",
        "(line 2459,col 9)-(line 2460,col 54)",
        "(line 2461,col 9)-(line 2462,col 88)",
        "(line 2463,col 9)-(line 2464,col 66)",
        "(line 2465,col 9)-(line 2465,col 53)",
        "(line 2466,col 9)-(line 2466,col 82)",
        "(line 2467,col 9)-(line 2467,col 65)",
        "(line 2468,col 9)-(line 2468,col 69)",
        "(line 2469,col 9)-(line 2469,col 57)",
        "(line 2470,col 9)-(line 2470,col 57)",
        "(line 2471,col 9)-(line 2471,col 92)",
        "(line 2472,col 9)-(line 2472,col 50)",
        "(line 2473,col 9)-(line 2473,col 61)",
        "(line 2474,col 9)-(line 2474,col 56)",
        "(line 2475,col 9)-(line 2475,col 96)",
        "(line 2476,col 9)-(line 2476,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BOBYQAOptimizer.fillNewArray(int, double)",
      "begin_line": 2487,
      "end_line": 2492,
      "comment": "\n     * Creates a new array.\n     *\n     * @param n Dimension of the returned array.\n     * @param value Value for each element.\n     * @return an array containing {@code n} elements set to the given\n     * {@code value}.\n     ",
      "child_ranges": [
        "(line 2489,col 9)-(line 2489,col 36)",
        "(line 2490,col 9)-(line 2490,col 31)",
        "(line 2491,col 9)-(line 2491,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BOBYQAOptimizer.caller(int)",
      "begin_line": 2495,
      "end_line": 2500,
      "comment": " XXX utility for figuring out call sequence.",
      "child_ranges": [
        "(line 2496,col 9)-(line 2496,col 44)",
        "(line 2497,col 9)-(line 2497,col 63)",
        "(line 2498,col 9)-(line 2498,col 48)",
        "(line 2499,col 9)-(line 2499,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BOBYQAOptimizer.printState(int)",
      "begin_line": 2502,
      "end_line": 2504,
      "comment": " XXX utility for figuring out call sequence.",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.BOBYQAOptimizer.printMethod()",
      "begin_line": 2506,
      "end_line": 2508,
      "comment": " XXX utility for figuring out call sequence.",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "PathIsExploredException",
      "is_interface": false,
      "parent_types": [
        "java.lang.RuntimeException"
      ],
      "begin_line": 2515,
      "end_line": 2522,
      "comment": "\n * Marker for code paths that are not explored with the current unit tests.\n * If the path becomes explored, it should just be removed from the code.\n "
    },
    {
      "type": "field",
      "varNames": [
        "PATH_IS_EXPLORED"
      ],
      "begin_line": 2516,
      "end_line": 2517,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.PathIsExploredException.PathIsExploredException()",
      "begin_line": 2519,
      "end_line": 2521,
      "comment": "",
      "child_ranges": [
        "(line 2520,col 9)-(line 2520,col 32)"
      ]
    }
  ]
}