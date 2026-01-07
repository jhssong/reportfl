{
  "filepath": "/tmp/Math-7b/src/main/java/org/apache/commons/math3/optimization/direct/BOBYQAOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BOBYQAOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer\u003corg.apache.commons.math3.analysis.MultivariateFunction\u003e",
        "org.apache.commons.math3.optimization.MultivariateOptimizer"
      ],
      "begin_line": 54,
      "end_line": 2486,
      "comment": "\n * Powell\u0027s BOBYQA algorithm. This implementation is translated and\n * adapted from the Fortran version available\n * \u003ca href\u003d\"http://plato.asu.edu/ftp/other_software/bobyqa.zip\"\u003ehere\u003c/a\u003e.\n * See \u003ca href\u003d\"http://www.optimization-online.org/DB_HTML/2010/05/2616.html\"\u003e\n * this paper\u003c/a\u003e for an introduction.\n * \u003cbr/\u003e\n * BOBYQA is particularly well suited for high dimensional problems\n * where derivatives are not available. In most cases it outperforms the\n * {@link PowellOptimizer} significantly. Stochastic algorithms like\n * {@link CMAESOptimizer} succeed more often than BOBYQA, but are more\n * expensive. BOBYQA could also be considered as a replacement of any\n * derivative-based optimizer when the derivatives are approximated by\n * finite differences.\n *\n * @version $Id$\n * @deprecated As of 3.1 (to be removed in 4.0).\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "MINIMUM_PROBLEM_DIMENSION"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Minimum dimension of the problem: {@value} "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INITIAL_RADIUS"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Default value for {@link #initialTrustRegionRadius}: {@value} . "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_STOPPING_RADIUS"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " Default value for {@link #stoppingTrustRegionRadius}: {@value} . "
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ONE"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TWO"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TEN"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SIXTEEN"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TWO_HUNDRED_FIFTY"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MINUS_ONE"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "HALF"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ONE_OVER_FOUR"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ONE_OVER_EIGHT"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ONE_OVER_TEN"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ONE_OVER_A_THOUSAND"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": ""
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
        "isMinimize"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " Goal type (minimize or maximize). "
    },
    {
      "type": "field",
      "varNames": [
        "currentBest"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": "\n     * Current best values for the variables to be optimized.\n     * The vector will be changed in-place to contain the values of the least\n     * calculated objective function values.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "boundDifference"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " Differences between the upper and lower bounds. "
    },
    {
      "type": "field",
      "varNames": [
        "trustRegionCenterInterpolationPointIndex"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": "\n     * Index of the interpolation point at the trust region center.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "bMatrix"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": "\n     * Last \u003cem\u003en\u003c/em\u003e columns of matrix H (where \u003cem\u003en\u003c/em\u003e is the dimension\n     * of the problem).\n     * XXX \"bmat\" in the original code.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "zMatrix"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": "\n     * Factorization of the leading \u003cem\u003enpt\u003c/em\u003e square submatrix of H, this\n     * factorization being Z Z\u003csup\u003eT\u003c/sup\u003e, which provides both the correct\n     * rank and positive semi-definiteness.\n     * XXX \"zmat\" in the original code.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "interpolationPoints"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": "\n     * Coordinates of the interpolation points relative to {@link #originShift}.\n     * XXX \"xpt\" in the original code.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "originShift"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": "\n     * Shift of origin that should reduce the contributions from rounding\n     * errors to values of the model and Lagrange functions.\n     * XXX \"xbase\" in the original code.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fAtInterpolationPoints"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": "\n     * Values of the objective function at the interpolation points.\n     * XXX \"fval\" in the original code.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "trustRegionCenterOffset"
      ],
      "begin_line": 137,
      "end_line": 137,
      "comment": "\n     * Displacement from {@link #originShift} of the trust region center.\n     * XXX \"xopt\" in the original code.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "gradientAtTrustRegionCenter"
      ],
      "begin_line": 143,
      "end_line": 143,
      "comment": "\n     * Gradient of the quadratic model at {@link #originShift} +\n     * {@link #trustRegionCenterOffset}.\n     * XXX \"gopt\" in the original code.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "lowerDifference"
      ],
      "begin_line": 154,
      "end_line": 154,
      "comment": "\n     * Differences {@link #getLowerBound()} - {@link #originShift}.\n     * All the components of every {@link #trustRegionCenterOffset} are going\n     * to satisfy the bounds\u003cbr/\u003e\n     * {@link #getLowerBound() lowerBound}\u003csub\u003ei\u003c/sub\u003e \u0026le;\n     * {@link #trustRegionCenterOffset}\u003csub\u003ei\u003c/sub\u003e,\u003cbr/\u003e\n     * with appropriate equalities when {@link #trustRegionCenterOffset} is\n     * on a constraint boundary.\n     * XXX \"sl\" in the original code.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "upperDifference"
      ],
      "begin_line": 165,
      "end_line": 165,
      "comment": "\n     * Differences {@link #getUpperBound()} - {@link #originShift}\n     * All the components of every {@link #trustRegionCenterOffset} are going\n     * to satisfy the bounds\u003cbr/\u003e\n     *  {@link #trustRegionCenterOffset}\u003csub\u003ei\u003c/sub\u003e \u0026le;\n     *  {@link #getUpperBound() upperBound}\u003csub\u003ei\u003c/sub\u003e,\u003cbr/\u003e\n     * with appropriate equalities when {@link #trustRegionCenterOffset} is\n     * on a constraint boundary.\n     * XXX \"su\" in the original code.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "modelSecondDerivativesParameters"
      ],
      "begin_line": 170,
      "end_line": 170,
      "comment": "\n     * Parameters of the implicit second derivatives of the quadratic model.\n     * XXX \"pq\" in the original code.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "newPoint"
      ],
      "begin_line": 181,
      "end_line": 181,
      "comment": "\n     * Point chosen by function {@link #trsbox(double,ArrayRealVector,\n     * ArrayRealVector, ArrayRealVector,ArrayRealVector,ArrayRealVector) trsbox}\n     * or {@link #altmov(int,double) altmov}.\n     * Usually {@link #originShift} + {@link #newPoint} is the vector of\n     * variables for the next evaluation of the objective function.\n     * It also satisfies the constraints indicated in {@link #lowerDifference}\n     * and {@link #upperDifference}.\n     * XXX \"xnew\" in the original code.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "alternativeNewPoint"
      ],
      "begin_line": 189,
      "end_line": 189,
      "comment": "\n     * Alternative to {@link #newPoint}, chosen by\n     * {@link #altmov(int,double) altmov}.\n     * It may replace {@link #newPoint} in order to increase the denominator\n     * in the {@link #update(double, double, int) updating procedure}.\n     * XXX \"xalt\" in the original code.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "trialStepPoint"
      ],
      "begin_line": 195,
      "end_line": 195,
      "comment": "\n     * Trial step from {@link #trustRegionCenterOffset} which is usually\n     * {@link #newPoint} - {@link #trustRegionCenterOffset}.\n     * XXX \"d__\" in the original code.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "lagrangeValuesAtNewPoint"
      ],
      "begin_line": 200,
      "end_line": 200,
      "comment": "\n     * Values of the Lagrange functions at a new point.\n     * XXX \"vlag\" in the original code.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "modelSecondDerivativesValues"
      ],
      "begin_line": 205,
      "end_line": 205,
      "comment": "\n     * Explicit second derivatives of the quadratic model.\n     * XXX \"hq\" in the original code.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.BOBYQAOptimizer(int)",
      "begin_line": 213,
      "end_line": 217,
      "comment": "\n     * @param numberOfInterpolationPoints Number of interpolation conditions.\n     * For a problem of dimension {@code n}, its value must be in the interval\n     * {@code [n+2, (n+1)(n+2)/2]}.\n     * Choices that exceed {@code 2n+1} are not recommended.\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 216,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.BOBYQAOptimizer(int, double, double)",
      "begin_line": 227,
      "end_line": 234,
      "comment": "\n     * @param numberOfInterpolationPoints Number of interpolation conditions.\n     * For a problem of dimension {@code n}, its value must be in the interval\n     * {@code [n+2, (n+1)(n+2)/2]}.\n     * Choices that exceed {@code 2n+1} are not recommended.\n     * @param initialTrustRegionRadius Initial trust region radius.\n     * @param stoppingTrustRegionRadius Stopping trust region radius.\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 20)",
        "(line 231,col 9)-(line 231,col 71)",
        "(line 232,col 9)-(line 232,col 65)",
        "(line 233,col 9)-(line 233,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.doOptimize()",
      "begin_line": 237,
      "end_line": 252,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 52)",
        "(line 240,col 9)-(line 240,col 52)",
        "(line 243,col 9)-(line 243,col 38)",
        "(line 245,col 9)-(line 245,col 58)",
        "(line 246,col 9)-(line 246,col 59)",
        "(line 248,col 9)-(line 248,col 60)",
        "(line 250,col 9)-(line 251,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.bobyqa(double[], double[])",
      "begin_line": 289,
      "end_line": 337,
      "comment": "\n     *     This subroutine seeks the least value of a function of many variables,\n     *     by applying a trust region method that forms quadratic models by\n     *     interpolation. There is usually some freedom in the interpolation\n     *     conditions, which is taken up by minimizing the Frobenius norm of\n     *     the change to the second derivative of the model, beginning with the\n     *     zero matrix. The values of the variables are constrained by upper and\n     *     lower bounds. The arguments of the subroutine are as follows.\n     *\n     *     N must be set to the number of variables and must be at least two.\n     *     NPT is the number of interpolation conditions. Its value must be in\n     *       the interval [N+2,(N+1)(N+2)/2]. Choices that exceed 2*N+1 are not\n     *       recommended.\n     *     Initial values of the variables must be set in X(1),X(2),...,X(N). They\n     *       will be changed to the values that give the least calculated F.\n     *     For I\u003d1,2,...,N, XL(I) and XU(I) must provide the lower and upper\n     *       bounds, respectively, on X(I). The construction of quadratic models\n     *       requires XL(I) to be strictly less than XU(I) for each I. Further,\n     *       the contribution to a model from changes to the I-th variable is\n     *       damaged severely by rounding errors if XU(I)-XL(I) is too small.\n     *     RHOBEG and RHOEND must be set to the initial and final values of a trust\n     *       region radius, so both must be positive with RHOEND no greater than\n     *       RHOBEG. Typically, RHOBEG should be about one tenth of the greatest\n     *       expected change to a variable, while RHOEND should indicate the\n     *       accuracy that is required in the final values of the variables. An\n     *       error return occurs if any of the differences XU(I)-XL(I), I\u003d1,...,N,\n     *       is less than 2*RHOBEG.\n     *     MAXFUN must be set to an upper bound on the number of calls of CALFUN.\n     *     The array W will be used for working space. Its length must be at least\n     *       (NPT+5)*(NPT+N)+3*N*(N+5)/2.\n     *\n     * @param lowerBound Lower bounds.\n     * @param upperBound Upper bounds.\n     * @return the value of the objective at the optimum.\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 22)",
        "(line 293,col 9)-(line 293,col 49)",
        "(line 302,col 9)-(line 332,col 9)",
        "(line 336,col 9)-(line 336,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.bobyqb(double[], double[])",
      "begin_line": 378,
      "end_line": 1223,
      "comment": "\n     *     The arguments N, NPT, X, XL, XU, RHOBEG, RHOEND, IPRINT and MAXFUN\n     *       are identical to the corresponding arguments in SUBROUTINE BOBYQA.\n     *     XBASE holds a shift of origin that should reduce the contributions\n     *       from rounding errors to values of the model and Lagrange functions.\n     *     XPT is a two-dimensional array that holds the coordinates of the\n     *       interpolation points relative to XBASE.\n     *     FVAL holds the values of F at the interpolation points.\n     *     XOPT is set to the displacement from XBASE of the trust region centre.\n     *     GOPT holds the gradient of the quadratic model at XBASE+XOPT.\n     *     HQ holds the explicit second derivatives of the quadratic model.\n     *     PQ contains the parameters of the implicit second derivatives of the\n     *       quadratic model.\n     *     BMAT holds the last N columns of H.\n     *     ZMAT holds the factorization of the leading NPT by NPT submatrix of H,\n     *       this factorization being ZMAT times ZMAT^T, which provides both the\n     *       correct rank and positive semi-definiteness.\n     *     NDIM is the first dimension of BMAT and has the value NPT+N.\n     *     SL and SU hold the differences XL-XBASE and XU-XBASE, respectively.\n     *       All the components of every XOPT are going to satisfy the bounds\n     *       SL(I) .LEQ. XOPT(I) .LEQ. SU(I), with appropriate equalities when\n     *       XOPT is on a constraint boundary.\n     *     XNEW is chosen by SUBROUTINE TRSBOX or ALTMOV. Usually XBASE+XNEW is the\n     *       vector of variables for the next call of CALFUN. XNEW also satisfies\n     *       the SL and SU constraints in the way that has just been mentioned.\n     *     XALT is an alternative to XNEW, chosen by ALTMOV, that may replace XNEW\n     *       in order to increase the denominator in the updating of UPDATE.\n     *     D is reserved for a trial step from XOPT, which is usually XNEW-XOPT.\n     *     VLAG contains the values of the Lagrange functions at a new point X.\n     *       They are part of a product that requires VLAG to be of length NDIM.\n     *     W is a one-dimensional array that is used for working space. Its length\n     *       must be at least 3*NDIM \u003d 3*(NPT+N).\n     *\n     * @param lowerBound Lower bounds.\n     * @param upperBound Upper bounds.\n     * @return the value of the objective at the optimum.\n     ",
      "child_ranges": [
        "(line 380,col 9)-(line 380,col 22)",
        "(line 382,col 9)-(line 382,col 49)",
        "(line 383,col 9)-(line 383,col 52)",
        "(line 384,col 9)-(line 384,col 29)",
        "(line 385,col 9)-(line 385,col 34)",
        "(line 386,col 9)-(line 386,col 34)",
        "(line 388,col 9)-(line 388,col 61)",
        "(line 389,col 9)-(line 389,col 63)",
        "(line 390,col 9)-(line 390,col 63)",
        "(line 392,col 9)-(line 392,col 35)",
        "(line 393,col 9)-(line 393,col 34)",
        "(line 394,col 9)-(line 394,col 32)",
        "(line 395,col 9)-(line 395,col 35)",
        "(line 409,col 9)-(line 409,col 53)",
        "(line 411,col 9)-(line 411,col 39)",
        "(line 412,col 9)-(line 412,col 29)",
        "(line 413,col 9)-(line 418,col 9)",
        "(line 419,col 9)-(line 419,col 58)",
        "(line 420,col 9)-(line 420,col 28)",
        "(line 424,col 9)-(line 424,col 23)",
        "(line 425,col 9)-(line 425,col 22)",
        "(line 426,col 9)-(line 426,col 21)",
        "(line 427,col 9)-(line 427,col 37)",
        "(line 428,col 9)-(line 428,col 46)",
        "(line 429,col 9)-(line 429,col 27)",
        "(line 430,col 9)-(line 430,col 28)",
        "(line 431,col 9)-(line 431,col 28)",
        "(line 432,col 9)-(line 432,col 28)",
        "(line 433,col 9)-(line 433,col 24)",
        "(line 434,col 9)-(line 434,col 27)",
        "(line 435,col 9)-(line 435,col 28)",
        "(line 436,col 9)-(line 436,col 28)",
        "(line 437,col 9)-(line 437,col 28)",
        "(line 438,col 9)-(line 438,col 28)",
        "(line 439,col 9)-(line 439,col 29)",
        "(line 440,col 9)-(line 440,col 29)",
        "(line 441,col 9)-(line 441,col 29)",
        "(line 446,col 9)-(line 446,col 23)",
        "(line 447,col 9)-(line 1222,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.altmov(int, double)",
      "begin_line": 1260,
      "end_line": 1562,
      "comment": "\n     *     The arguments N, NPT, XPT, XOPT, BMAT, ZMAT, NDIM, SL and SU all have\n     *       the same meanings as the corresponding arguments of BOBYQB.\n     *     KOPT is the index of the optimal interpolation point.\n     *     KNEW is the index of the interpolation point that is going to be moved.\n     *     ADELT is the current trust region bound.\n     *     XNEW will be set to a suitable new position for the interpolation point\n     *       XPT(KNEW,.). Specifically, it satisfies the SL, SU and trust region\n     *       bounds and it should provide a large denominator in the next call of\n     *       UPDATE. The step XNEW-XOPT from XOPT is restricted to moves along the\n     *       straight lines through XOPT and another interpolation point.\n     *     XALT also provides a large value of the modulus of the KNEW-th Lagrange\n     *       function subject to the constraints that have been mentioned, its main\n     *       difference from XNEW being that XALT-XOPT is a constrained version of\n     *       the Cauchy step within the trust region. An exception is that XALT is\n     *       not calculated if all components of GLAG (see below) are zero.\n     *     ALPHA will be set to the KNEW-th diagonal element of the H matrix.\n     *     CAUCHY will be set to the square of the KNEW-th Lagrange function at\n     *       the step XALT-XOPT from XOPT for the vector XALT that is returned,\n     *       except that CAUCHY is set to zero if XALT is not calculated.\n     *     GLAG is a working space vector of length N for the gradient of the\n     *       KNEW-th Lagrange function at XOPT.\n     *     HCOL is a working space vector of length NPT for the second derivative\n     *       coefficients of the KNEW-th Lagrange function.\n     *     W is a working space vector of length 2N that is going to hold the\n     *       constrained Cauchy step from XOPT of the Lagrange function, followed\n     *       by the downhill version of XALT when the uphill step is calculated.\n     *\n     *     Set the first NPT components of W to the leading elements of the\n     *     KNEW-th column of the H matrix.\n     * @param knew\n     * @param adelt\n     ",
      "child_ranges": [
        "(line 1264,col 9)-(line 1264,col 22)",
        "(line 1266,col 9)-(line 1266,col 49)",
        "(line 1267,col 9)-(line 1267,col 52)",
        "(line 1269,col 9)-(line 1269,col 60)",
        "(line 1270,col 9)-(line 1270,col 62)",
        "(line 1272,col 9)-(line 1272,col 61)",
        "(line 1273,col 9)-(line 1273,col 61)",
        "(line 1275,col 9)-(line 1277,col 9)",
        "(line 1278,col 9)-(line 1283,col 9)",
        "(line 1284,col 9)-(line 1284,col 49)",
        "(line 1285,col 9)-(line 1285,col 39)",
        "(line 1289,col 9)-(line 1291,col 9)",
        "(line 1292,col 9)-(line 1301,col 9)",
        "(line 1309,col 9)-(line 1309,col 29)",
        "(line 1310,col 9)-(line 1310,col 33)",
        "(line 1311,col 9)-(line 1311,col 21)",
        "(line 1312,col 9)-(line 1312,col 23)",
        "(line 1313,col 9)-(line 1313,col 26)",
        "(line 1314,col 9)-(line 1417,col 9)",
        "(line 1421,col 9)-(line 1425,col 9)",
        "(line 1426,col 9)-(line 1428,col 9)",
        "(line 1429,col 9)-(line 1431,col 9)",
        "(line 1437,col 9)-(line 1437,col 44)",
        "(line 1438,col 9)-(line 1438,col 22)",
        "(line 1439,col 9)-(line 1439,col 35)",
        "(line 1440,col 9)-(line 1440,col 28)",
        "(line 1441,col 9)-(line 1553,col 9)",
        "(line 1554,col 9)-(line 1559,col 9)",
        "(line 1561,col 9)-(line 1561,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.prelim(double[], double[])",
      "begin_line": 1586,
      "end_line": 1759,
      "comment": "\n     *     SUBROUTINE PRELIM sets the elements of XBASE, XPT, FVAL, GOPT, HQ, PQ,\n     *     BMAT and ZMAT for the first iteration, and it maintains the values of\n     *     NF and KOPT. The vector X is also changed by PRELIM.\n     *\n     *     The arguments N, NPT, X, XL, XU, RHOBEG, IPRINT and MAXFUN are the\n     *       same as the corresponding arguments in SUBROUTINE BOBYQA.\n     *     The arguments XBASE, XPT, FVAL, HQ, PQ, BMAT, ZMAT, NDIM, SL and SU\n     *       are the same as the corresponding arguments in BOBYQB, the elements\n     *       of SL and SU being set in BOBYQA.\n     *     GOPT is usually the gradient of the quadratic model at XOPT+XBASE, but\n     *       it is set by PRELIM to the gradient of the quadratic model at XBASE.\n     *       If XOPT is nonzero, BOBYQB will change it to its usual value later.\n     *     NF is maintaned as the number of calls of CALFUN so far.\n     *     KOPT will be such that the least calculated value of F so far is at\n     *       the point XPT(KOPT,.)+XBASE in the space of the variables.\n     *\n     * @param lowerBound Lower bounds.\n     * @param upperBound Upper bounds.\n     ",
      "child_ranges": [
        "(line 1588,col 9)-(line 1588,col 22)",
        "(line 1590,col 9)-(line 1590,col 49)",
        "(line 1591,col 9)-(line 1591,col 52)",
        "(line 1592,col 9)-(line 1592,col 51)",
        "(line 1594,col 9)-(line 1594,col 81)",
        "(line 1595,col 9)-(line 1595,col 40)",
        "(line 1596,col 9)-(line 1596,col 29)",
        "(line 1601,col 9)-(line 1609,col 9)",
        "(line 1610,col 9)-(line 1612,col 9)",
        "(line 1613,col 9)-(line 1618,col 9)",
        "(line 1624,col 9)-(line 1624,col 20)",
        "(line 1625,col 9)-(line 1625,col 20)",
        "(line 1626,col 9)-(line 1626,col 33)",
        "(line 1627,col 9)-(line 1758,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.trsbox(double, org.apache.commons.math3.linear.ArrayRealVector, org.apache.commons.math3.linear.ArrayRealVector, org.apache.commons.math3.linear.ArrayRealVector, org.apache.commons.math3.linear.ArrayRealVector, org.apache.commons.math3.linear.ArrayRealVector)",
      "begin_line": 1808,
      "end_line": 2282,
      "comment": "\n     *     A version of the truncated conjugate gradient is applied. If a line\n     *     search is restricted by a constraint, then the procedure is restarted,\n     *     the values of the variables that are at their bounds being fixed. If\n     *     the trust region boundary is reached, then further changes may be made\n     *     to D, each one being in the two dimensional space that is spanned\n     *     by the current D and the gradient of Q at XOPT+D, staying on the trust\n     *     region boundary. Termination occurs when the reduction in Q seems to\n     *     be close to the greatest reduction that can be achieved.\n     *     The arguments N, NPT, XPT, XOPT, GOPT, HQ, PQ, SL and SU have the same\n     *       meanings as the corresponding arguments of BOBYQB.\n     *     DELTA is the trust region radius for the present calculation, which\n     *       seeks a small value of the quadratic model within distance DELTA of\n     *       XOPT subject to the bounds on the variables.\n     *     XNEW will be set to a new vector of variables that is approximately\n     *       the one that minimizes the quadratic model within the trust region\n     *       subject to the SL and SU constraints on the variables. It satisfies\n     *       as equations the bounds that become active during the calculation.\n     *     D is the calculated trial step from XOPT, generated iteratively from an\n     *       initial value of zero. Thus XNEW is XOPT+D after the final iteration.\n     *     GNEW holds the gradient of the quadratic model at XOPT+D. It is updated\n     *       when D is updated.\n     *     xbdi.get( is a working space vector. For I\u003d1,2,...,N, the element xbdi.get((I) is\n     *       set to -1.0, 0.0, or 1.0, the value being nonzero if and only if the\n     *       I-th variable has become fixed at a bound, the bound being SL(I) or\n     *       SU(I) in the case xbdi.get((I)\u003d-1.0 or xbdi.get((I)\u003d1.0, respectively. This\n     *       information is accumulated during the construction of XNEW.\n     *     The arrays S, HS and HRED are also used for working space. They hold the\n     *       current search direction, and the changes in the gradient of Q along S\n     *       and the reduced D, respectively, where the reduced D is the same as D,\n     *       except that the components of the fixed variables are zero.\n     *     DSQ will be set to the square of the length of XNEW-XOPT.\n     *     CRVMIN is set to zero if D reaches the trust region boundary. Otherwise\n     *       it is set to the least curvature of H that occurs in the conjugate\n     *       gradient searches that are not restricted by any constraints. The\n     *       value CRVMIN\u003d-1.0D0 is set, however, if all of these searches are\n     *       constrained.\n     * @param delta\n     * @param gnew\n     * @param xbdi\n     * @param s\n     * @param hs\n     * @param hred\n     ",
      "child_ranges": [
        "(line 1816,col 9)-(line 1816,col 22)",
        "(line 1818,col 9)-(line 1818,col 49)",
        "(line 1819,col 9)-(line 1819,col 52)",
        "(line 1821,col 9)-(line 1821,col 32)",
        "(line 1822,col 9)-(line 1822,col 35)",
        "(line 1825,col 9)-(line 1825,col 18)",
        "(line 1826,col 9)-(line 1826,col 15)",
        "(line 1827,col 9)-(line 1827,col 64)",
        "(line 1828,col 9)-(line 1828,col 22)",
        "(line 1829,col 9)-(line 1829,col 21)",
        "(line 1830,col 9)-(line 1830,col 30)",
        "(line 1831,col 9)-(line 1831,col 17)",
        "(line 1832,col 9)-(line 1832,col 77)",
        "(line 1833,col 9)-(line 1833,col 18)",
        "(line 1834,col 9)-(line 1835,col 67)",
        "(line 1836,col 9)-(line 1836,col 23)",
        "(line 1837,col 9)-(line 1837,col 62)",
        "(line 1838,col 9)-(line 1838,col 24)",
        "(line 1851,col 9)-(line 1851,col 18)",
        "(line 1852,col 9)-(line 1852,col 17)",
        "(line 1853,col 9)-(line 1869,col 9)",
        "(line 1870,col 9)-(line 1870,col 30)",
        "(line 1871,col 9)-(line 1871,col 20)",
        "(line 1872,col 9)-(line 1872,col 27)",
        "(line 1880,col 9)-(line 1880,col 23)",
        "(line 1881,col 9)-(line 2281,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.update(double, double, int)",
      "begin_line": 2299,
      "end_line": 2378,
      "comment": "\n     *     The arrays BMAT and ZMAT are updated, as required by the new position\n     *     of the interpolation point that has the index KNEW. The vector VLAG has\n     *     N+NPT components, set on entry to the first NPT and last N components\n     *     of the product Hw in equation (4.11) of the Powell (2006) paper on\n     *     NEWUOA. Further, BETA is set on entry to the value of the parameter\n     *     with that name, and DENOM is set to the denominator of the updating\n     *     formula. Elements of ZMAT may be treated as zero if their moduli are\n     *     at most ZTEST. The first NDIM elements of W are used for working space.\n     * @param beta\n     * @param denom\n     * @param knew\n     ",
      "child_ranges": [
        "(line 2304,col 9)-(line 2304,col 22)",
        "(line 2306,col 9)-(line 2306,col 49)",
        "(line 2307,col 9)-(line 2307,col 52)",
        "(line 2308,col 9)-(line 2308,col 37)",
        "(line 2311,col 9)-(line 2311,col 66)",
        "(line 2313,col 9)-(line 2313,col 28)",
        "(line 2314,col 9)-(line 2319,col 9)",
        "(line 2320,col 9)-(line 2320,col 23)",
        "(line 2324,col 9)-(line 2341,col 9)",
        "(line 2346,col 9)-(line 2348,col 9)",
        "(line 2349,col 9)-(line 2349,col 49)",
        "(line 2350,col 9)-(line 2350,col 67)",
        "(line 2351,col 9)-(line 2351,col 95)",
        "(line 2355,col 9)-(line 2355,col 50)",
        "(line 2356,col 9)-(line 2356,col 42)",
        "(line 2357,col 9)-(line 2357,col 64)",
        "(line 2358,col 9)-(line 2361,col 9)",
        "(line 2365,col 9)-(line 2377,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.setup(double[], double[])",
      "begin_line": 2386,
      "end_line": 2439,
      "comment": "\n     * Performs validity checks.\n     *\n     * @param lowerBound Lower bounds (constraints) of the objective variables.\n     * @param upperBound Upperer bounds (constraints) of the objective variables.\n     ",
      "child_ranges": [
        "(line 2388,col 9)-(line 2388,col 22)",
        "(line 2390,col 9)-(line 2390,col 40)",
        "(line 2391,col 9)-(line 2391,col 42)",
        "(line 2394,col 9)-(line 2396,col 9)",
        "(line 2398,col 9)-(line 2398,col 95)",
        "(line 2399,col 9)-(line 2405,col 9)",
        "(line 2408,col 9)-(line 2408,col 48)",
        "(line 2410,col 9)-(line 2410,col 62)",
        "(line 2411,col 9)-(line 2411,col 50)",
        "(line 2412,col 9)-(line 2415,col 9)",
        "(line 2416,col 9)-(line 2418,col 9)",
        "(line 2421,col 9)-(line 2422,col 54)",
        "(line 2423,col 9)-(line 2424,col 88)",
        "(line 2425,col 9)-(line 2426,col 66)",
        "(line 2427,col 9)-(line 2427,col 53)",
        "(line 2428,col 9)-(line 2428,col 82)",
        "(line 2429,col 9)-(line 2429,col 65)",
        "(line 2430,col 9)-(line 2430,col 69)",
        "(line 2431,col 9)-(line 2431,col 57)",
        "(line 2432,col 9)-(line 2432,col 57)",
        "(line 2433,col 9)-(line 2433,col 92)",
        "(line 2434,col 9)-(line 2434,col 50)",
        "(line 2435,col 9)-(line 2435,col 61)",
        "(line 2436,col 9)-(line 2436,col 56)",
        "(line 2437,col 9)-(line 2437,col 96)",
        "(line 2438,col 9)-(line 2438,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.fillNewArray(int, double)",
      "begin_line": 2449,
      "end_line": 2454,
      "comment": "\n     * Creates a new array.\n     *\n     * @param n Dimension of the returned array.\n     * @param value Value for each element.\n     * @return an array containing {@code n} elements set to the given\n     * {@code value}.\n     ",
      "child_ranges": [
        "(line 2451,col 9)-(line 2451,col 36)",
        "(line 2452,col 9)-(line 2452,col 31)",
        "(line 2453,col 9)-(line 2453,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.caller(int)",
      "begin_line": 2457,
      "end_line": 2462,
      "comment": " XXX utility for figuring out call sequence.",
      "child_ranges": [
        "(line 2458,col 9)-(line 2458,col 44)",
        "(line 2459,col 9)-(line 2459,col 63)",
        "(line 2460,col 9)-(line 2460,col 48)",
        "(line 2461,col 9)-(line 2461,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.printState(int)",
      "begin_line": 2464,
      "end_line": 2466,
      "comment": " XXX utility for figuring out call sequence.",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.printMethod()",
      "begin_line": 2468,
      "end_line": 2470,
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
      "begin_line": 2476,
      "end_line": 2485,
      "comment": "\n     * Marker for code paths that are not explored with the current unit tests.\n     * If the path becomes explored, it should just be removed from the code.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 2477,
      "end_line": 2477,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PATH_IS_EXPLORED"
      ],
      "begin_line": 2479,
      "end_line": 2480,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.BOBYQAOptimizer.PathIsExploredException.PathIsExploredException()",
      "begin_line": 2482,
      "end_line": 2484,
      "comment": "",
      "child_ranges": [
        "(line 2483,col 13)-(line 2483,col 70)"
      ]
    }
  ]
}