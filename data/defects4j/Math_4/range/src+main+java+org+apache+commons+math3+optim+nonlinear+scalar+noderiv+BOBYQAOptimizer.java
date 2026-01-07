{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optim/nonlinear/scalar/noderiv/BOBYQAOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BOBYQAOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer"
      ],
      "begin_line": 49,
      "end_line": 2459,
      "comment": "\n * Powell\u0027s BOBYQA algorithm. This implementation is translated and\n * adapted from the Fortran version available\n * \u003ca href\u003d\"http://plato.asu.edu/ftp/other_software/bobyqa.zip\"\u003ehere\u003c/a\u003e.\n * See \u003ca href\u003d\"http://www.optimization-online.org/DB_HTML/2010/05/2616.html\"\u003e\n * this paper\u003c/a\u003e for an introduction.\n * \u003cbr/\u003e\n * BOBYQA is particularly well suited for high dimensional problems\n * where derivatives are not available. In most cases it outperforms the\n * {@link PowellOptimizer} significantly. Stochastic algorithms like\n * {@link CMAESOptimizer} succeed more often than BOBYQA, but are more\n * expensive. BOBYQA could also be considered as a replacement of any\n * derivative-based optimizer when the derivatives are approximated by\n * finite differences.\n *\n * @version $Id$\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "MINIMUM_PROBLEM_DIMENSION"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Minimum dimension of the problem: {@value} "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_INITIAL_RADIUS"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Default value for {@link #initialTrustRegionRadius}: {@value} . "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_STOPPING_RADIUS"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Default value for {@link #stoppingTrustRegionRadius}: {@value} . "
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
        "numberOfInterpolationPoints"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": "\n     * numberOfInterpolationPoints XXX\n     "
    },
    {
      "type": "field",
      "varNames": [
        "initialTrustRegionRadius"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": "\n     * initialTrustRegionRadius XXX\n     "
    },
    {
      "type": "field",
      "varNames": [
        "stoppingTrustRegionRadius"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": "\n     * stoppingTrustRegionRadius XXX\n     "
    },
    {
      "type": "field",
      "varNames": [
        "isMinimize"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " Goal type (minimize or maximize). "
    },
    {
      "type": "field",
      "varNames": [
        "currentBest"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": "\n     * Current best values for the variables to be optimized.\n     * The vector will be changed in-place to contain the values of the least\n     * calculated objective function values.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "boundDifference"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " Differences between the upper and lower bounds. "
    },
    {
      "type": "field",
      "varNames": [
        "trustRegionCenterInterpolationPointIndex"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": "\n     * Index of the interpolation point at the trust region center.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "bMatrix"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": "\n     * Last \u003cem\u003en\u003c/em\u003e columns of matrix H (where \u003cem\u003en\u003c/em\u003e is the dimension\n     * of the problem).\n     * XXX \"bmat\" in the original code.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "zMatrix"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": "\n     * Factorization of the leading \u003cem\u003enpt\u003c/em\u003e square submatrix of H, this\n     * factorization being Z Z\u003csup\u003eT\u003c/sup\u003e, which provides both the correct\n     * rank and positive semi-definiteness.\n     * XXX \"zmat\" in the original code.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "interpolationPoints"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": "\n     * Coordinates of the interpolation points relative to {@link #originShift}.\n     * XXX \"xpt\" in the original code.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "originShift"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": "\n     * Shift of origin that should reduce the contributions from rounding\n     * errors to values of the model and Lagrange functions.\n     * XXX \"xbase\" in the original code.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fAtInterpolationPoints"
      ],
      "begin_line": 125,
      "end_line": 125,
      "comment": "\n     * Values of the objective function at the interpolation points.\n     * XXX \"fval\" in the original code.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "trustRegionCenterOffset"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": "\n     * Displacement from {@link #originShift} of the trust region center.\n     * XXX \"xopt\" in the original code.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "gradientAtTrustRegionCenter"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": "\n     * Gradient of the quadratic model at {@link #originShift} +\n     * {@link #trustRegionCenterOffset}.\n     * XXX \"gopt\" in the original code.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "lowerDifference"
      ],
      "begin_line": 147,
      "end_line": 147,
      "comment": "\n     * Differences {@link #getLowerBound()} - {@link #originShift}.\n     * All the components of every {@link #trustRegionCenterOffset} are going\n     * to satisfy the bounds\u003cbr/\u003e\n     * {@link #getLowerBound() lowerBound}\u003csub\u003ei\u003c/sub\u003e \u0026le;\n     * {@link #trustRegionCenterOffset}\u003csub\u003ei\u003c/sub\u003e,\u003cbr/\u003e\n     * with appropriate equalities when {@link #trustRegionCenterOffset} is\n     * on a constraint boundary.\n     * XXX \"sl\" in the original code.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "upperDifference"
      ],
      "begin_line": 158,
      "end_line": 158,
      "comment": "\n     * Differences {@link #getUpperBound()} - {@link #originShift}\n     * All the components of every {@link #trustRegionCenterOffset} are going\n     * to satisfy the bounds\u003cbr/\u003e\n     *  {@link #trustRegionCenterOffset}\u003csub\u003ei\u003c/sub\u003e \u0026le;\n     *  {@link #getUpperBound() upperBound}\u003csub\u003ei\u003c/sub\u003e,\u003cbr/\u003e\n     * with appropriate equalities when {@link #trustRegionCenterOffset} is\n     * on a constraint boundary.\n     * XXX \"su\" in the original code.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "modelSecondDerivativesParameters"
      ],
      "begin_line": 163,
      "end_line": 163,
      "comment": "\n     * Parameters of the implicit second derivatives of the quadratic model.\n     * XXX \"pq\" in the original code.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "newPoint"
      ],
      "begin_line": 174,
      "end_line": 174,
      "comment": "\n     * Point chosen by function {@link #trsbox(double,ArrayRealVector,\n     * ArrayRealVector, ArrayRealVector,ArrayRealVector,ArrayRealVector) trsbox}\n     * or {@link #altmov(int,double) altmov}.\n     * Usually {@link #originShift} + {@link #newPoint} is the vector of\n     * variables for the next evaluation of the objective function.\n     * It also satisfies the constraints indicated in {@link #lowerDifference}\n     * and {@link #upperDifference}.\n     * XXX \"xnew\" in the original code.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "alternativeNewPoint"
      ],
      "begin_line": 182,
      "end_line": 182,
      "comment": "\n     * Alternative to {@link #newPoint}, chosen by\n     * {@link #altmov(int,double) altmov}.\n     * It may replace {@link #newPoint} in order to increase the denominator\n     * in the {@link #update(double, double, int) updating procedure}.\n     * XXX \"xalt\" in the original code.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "trialStepPoint"
      ],
      "begin_line": 188,
      "end_line": 188,
      "comment": "\n     * Trial step from {@link #trustRegionCenterOffset} which is usually\n     * {@link #newPoint} - {@link #trustRegionCenterOffset}.\n     * XXX \"d__\" in the original code.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "lagrangeValuesAtNewPoint"
      ],
      "begin_line": 193,
      "end_line": 193,
      "comment": "\n     * Values of the Lagrange functions at a new point.\n     * XXX \"vlag\" in the original code.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "modelSecondDerivativesValues"
      ],
      "begin_line": 198,
      "end_line": 198,
      "comment": "\n     * Explicit second derivatives of the quadratic model.\n     * XXX \"hq\" in the original code.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.BOBYQAOptimizer.BOBYQAOptimizer(int)",
      "begin_line": 206,
      "end_line": 210,
      "comment": "\n     * @param numberOfInterpolationPoints Number of interpolation conditions.\n     * For a problem of dimension {@code n}, its value must be in the interval\n     * {@code [n+2, (n+1)(n+2)/2]}.\n     * Choices that exceed {@code 2n+1} are not recommended.\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 209,col 38)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.BOBYQAOptimizer.BOBYQAOptimizer(int, double, double)",
      "begin_line": 220,
      "end_line": 227,
      "comment": "\n     * @param numberOfInterpolationPoints Number of interpolation conditions.\n     * For a problem of dimension {@code n}, its value must be in the interval\n     * {@code [n+2, (n+1)(n+2)/2]}.\n     * Choices that exceed {@code 2n+1} are not recommended.\n     * @param initialTrustRegionRadius Initial trust region radius.\n     * @param stoppingTrustRegionRadius Stopping trust region radius.\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 20)",
        "(line 224,col 9)-(line 224,col 71)",
        "(line 225,col 9)-(line 225,col 65)",
        "(line 226,col 9)-(line 226,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.BOBYQAOptimizer.doOptimize()",
      "begin_line": 230,
      "end_line": 245,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 52)",
        "(line 233,col 9)-(line 233,col 52)",
        "(line 236,col 9)-(line 236,col 38)",
        "(line 238,col 9)-(line 238,col 58)",
        "(line 239,col 9)-(line 239,col 59)",
        "(line 241,col 9)-(line 241,col 60)",
        "(line 243,col 9)-(line 244,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.BOBYQAOptimizer.bobyqa(double[], double[])",
      "begin_line": 282,
      "end_line": 330,
      "comment": "\n     *     This subroutine seeks the least value of a function of many variables,\n     *     by applying a trust region method that forms quadratic models by\n     *     interpolation. There is usually some freedom in the interpolation\n     *     conditions, which is taken up by minimizing the Frobenius norm of\n     *     the change to the second derivative of the model, beginning with the\n     *     zero matrix. The values of the variables are constrained by upper and\n     *     lower bounds. The arguments of the subroutine are as follows.\n     *\n     *     N must be set to the number of variables and must be at least two.\n     *     NPT is the number of interpolation conditions. Its value must be in\n     *       the interval [N+2,(N+1)(N+2)/2]. Choices that exceed 2*N+1 are not\n     *       recommended.\n     *     Initial values of the variables must be set in X(1),X(2),...,X(N). They\n     *       will be changed to the values that give the least calculated F.\n     *     For I\u003d1,2,...,N, XL(I) and XU(I) must provide the lower and upper\n     *       bounds, respectively, on X(I). The construction of quadratic models\n     *       requires XL(I) to be strictly less than XU(I) for each I. Further,\n     *       the contribution to a model from changes to the I-th variable is\n     *       damaged severely by rounding errors if XU(I)-XL(I) is too small.\n     *     RHOBEG and RHOEND must be set to the initial and final values of a trust\n     *       region radius, so both must be positive with RHOEND no greater than\n     *       RHOBEG. Typically, RHOBEG should be about one tenth of the greatest\n     *       expected change to a variable, while RHOEND should indicate the\n     *       accuracy that is required in the final values of the variables. An\n     *       error return occurs if any of the differences XU(I)-XL(I), I\u003d1,...,N,\n     *       is less than 2*RHOBEG.\n     *     MAXFUN must be set to an upper bound on the number of calls of CALFUN.\n     *     The array W will be used for working space. Its length must be at least\n     *       (NPT+5)*(NPT+N)+3*N*(N+5)/2.\n     *\n     * @param lowerBound Lower bounds.\n     * @param upperBound Upper bounds.\n     * @return the value of the objective at the optimum.\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 22)",
        "(line 286,col 9)-(line 286,col 49)",
        "(line 295,col 9)-(line 325,col 9)",
        "(line 329,col 9)-(line 329,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.BOBYQAOptimizer.bobyqb(double[], double[])",
      "begin_line": 371,
      "end_line": 1216,
      "comment": "\n     *     The arguments N, NPT, X, XL, XU, RHOBEG, RHOEND, IPRINT and MAXFUN\n     *       are identical to the corresponding arguments in SUBROUTINE BOBYQA.\n     *     XBASE holds a shift of origin that should reduce the contributions\n     *       from rounding errors to values of the model and Lagrange functions.\n     *     XPT is a two-dimensional array that holds the coordinates of the\n     *       interpolation points relative to XBASE.\n     *     FVAL holds the values of F at the interpolation points.\n     *     XOPT is set to the displacement from XBASE of the trust region centre.\n     *     GOPT holds the gradient of the quadratic model at XBASE+XOPT.\n     *     HQ holds the explicit second derivatives of the quadratic model.\n     *     PQ contains the parameters of the implicit second derivatives of the\n     *       quadratic model.\n     *     BMAT holds the last N columns of H.\n     *     ZMAT holds the factorization of the leading NPT by NPT submatrix of H,\n     *       this factorization being ZMAT times ZMAT^T, which provides both the\n     *       correct rank and positive semi-definiteness.\n     *     NDIM is the first dimension of BMAT and has the value NPT+N.\n     *     SL and SU hold the differences XL-XBASE and XU-XBASE, respectively.\n     *       All the components of every XOPT are going to satisfy the bounds\n     *       SL(I) .LEQ. XOPT(I) .LEQ. SU(I), with appropriate equalities when\n     *       XOPT is on a constraint boundary.\n     *     XNEW is chosen by SUBROUTINE TRSBOX or ALTMOV. Usually XBASE+XNEW is the\n     *       vector of variables for the next call of CALFUN. XNEW also satisfies\n     *       the SL and SU constraints in the way that has just been mentioned.\n     *     XALT is an alternative to XNEW, chosen by ALTMOV, that may replace XNEW\n     *       in order to increase the denominator in the updating of UPDATE.\n     *     D is reserved for a trial step from XOPT, which is usually XNEW-XOPT.\n     *     VLAG contains the values of the Lagrange functions at a new point X.\n     *       They are part of a product that requires VLAG to be of length NDIM.\n     *     W is a one-dimensional array that is used for working space. Its length\n     *       must be at least 3*NDIM \u003d 3*(NPT+N).\n     *\n     * @param lowerBound Lower bounds.\n     * @param upperBound Upper bounds.\n     * @return the value of the objective at the optimum.\n     ",
      "child_ranges": [
        "(line 373,col 9)-(line 373,col 22)",
        "(line 375,col 9)-(line 375,col 49)",
        "(line 376,col 9)-(line 376,col 52)",
        "(line 377,col 9)-(line 377,col 29)",
        "(line 378,col 9)-(line 378,col 34)",
        "(line 379,col 9)-(line 379,col 34)",
        "(line 381,col 9)-(line 381,col 61)",
        "(line 382,col 9)-(line 382,col 63)",
        "(line 383,col 9)-(line 383,col 63)",
        "(line 385,col 9)-(line 385,col 35)",
        "(line 386,col 9)-(line 386,col 34)",
        "(line 387,col 9)-(line 387,col 32)",
        "(line 388,col 9)-(line 388,col 35)",
        "(line 402,col 9)-(line 402,col 53)",
        "(line 404,col 9)-(line 404,col 39)",
        "(line 405,col 9)-(line 405,col 29)",
        "(line 406,col 9)-(line 411,col 9)",
        "(line 412,col 9)-(line 412,col 58)",
        "(line 413,col 9)-(line 413,col 28)",
        "(line 417,col 9)-(line 417,col 23)",
        "(line 418,col 9)-(line 418,col 22)",
        "(line 419,col 9)-(line 419,col 21)",
        "(line 420,col 9)-(line 420,col 37)",
        "(line 421,col 9)-(line 421,col 46)",
        "(line 422,col 9)-(line 422,col 27)",
        "(line 423,col 9)-(line 423,col 28)",
        "(line 424,col 9)-(line 424,col 28)",
        "(line 425,col 9)-(line 425,col 28)",
        "(line 426,col 9)-(line 426,col 24)",
        "(line 427,col 9)-(line 427,col 27)",
        "(line 428,col 9)-(line 428,col 28)",
        "(line 429,col 9)-(line 429,col 28)",
        "(line 430,col 9)-(line 430,col 28)",
        "(line 431,col 9)-(line 431,col 28)",
        "(line 432,col 9)-(line 432,col 29)",
        "(line 433,col 9)-(line 433,col 29)",
        "(line 434,col 9)-(line 434,col 29)",
        "(line 439,col 9)-(line 439,col 23)",
        "(line 440,col 9)-(line 1215,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.BOBYQAOptimizer.altmov(int, double)",
      "begin_line": 1253,
      "end_line": 1553,
      "comment": "\n     *     The arguments N, NPT, XPT, XOPT, BMAT, ZMAT, NDIM, SL and SU all have\n     *       the same meanings as the corresponding arguments of BOBYQB.\n     *     KOPT is the index of the optimal interpolation point.\n     *     KNEW is the index of the interpolation point that is going to be moved.\n     *     ADELT is the current trust region bound.\n     *     XNEW will be set to a suitable new position for the interpolation point\n     *       XPT(KNEW,.). Specifically, it satisfies the SL, SU and trust region\n     *       bounds and it should provide a large denominator in the next call of\n     *       UPDATE. The step XNEW-XOPT from XOPT is restricted to moves along the\n     *       straight lines through XOPT and another interpolation point.\n     *     XALT also provides a large value of the modulus of the KNEW-th Lagrange\n     *       function subject to the constraints that have been mentioned, its main\n     *       difference from XNEW being that XALT-XOPT is a constrained version of\n     *       the Cauchy step within the trust region. An exception is that XALT is\n     *       not calculated if all components of GLAG (see below) are zero.\n     *     ALPHA will be set to the KNEW-th diagonal element of the H matrix.\n     *     CAUCHY will be set to the square of the KNEW-th Lagrange function at\n     *       the step XALT-XOPT from XOPT for the vector XALT that is returned,\n     *       except that CAUCHY is set to zero if XALT is not calculated.\n     *     GLAG is a working space vector of length N for the gradient of the\n     *       KNEW-th Lagrange function at XOPT.\n     *     HCOL is a working space vector of length NPT for the second derivative\n     *       coefficients of the KNEW-th Lagrange function.\n     *     W is a working space vector of length 2N that is going to hold the\n     *       constrained Cauchy step from XOPT of the Lagrange function, followed\n     *       by the downhill version of XALT when the uphill step is calculated.\n     *\n     *     Set the first NPT components of W to the leading elements of the\n     *     KNEW-th column of the H matrix.\n     * @param knew\n     * @param adelt\n     ",
      "child_ranges": [
        "(line 1257,col 9)-(line 1257,col 22)",
        "(line 1259,col 9)-(line 1259,col 49)",
        "(line 1260,col 9)-(line 1260,col 52)",
        "(line 1262,col 9)-(line 1262,col 60)",
        "(line 1263,col 9)-(line 1263,col 62)",
        "(line 1265,col 9)-(line 1265,col 61)",
        "(line 1266,col 9)-(line 1266,col 61)",
        "(line 1268,col 9)-(line 1270,col 9)",
        "(line 1271,col 9)-(line 1276,col 9)",
        "(line 1277,col 9)-(line 1277,col 49)",
        "(line 1278,col 9)-(line 1278,col 39)",
        "(line 1282,col 9)-(line 1284,col 9)",
        "(line 1285,col 9)-(line 1294,col 9)",
        "(line 1302,col 9)-(line 1302,col 29)",
        "(line 1303,col 9)-(line 1303,col 33)",
        "(line 1304,col 9)-(line 1304,col 21)",
        "(line 1305,col 9)-(line 1305,col 23)",
        "(line 1306,col 9)-(line 1306,col 26)",
        "(line 1307,col 9)-(line 1408,col 9)",
        "(line 1412,col 9)-(line 1416,col 9)",
        "(line 1417,col 9)-(line 1419,col 9)",
        "(line 1420,col 9)-(line 1422,col 9)",
        "(line 1428,col 9)-(line 1428,col 44)",
        "(line 1429,col 9)-(line 1429,col 22)",
        "(line 1430,col 9)-(line 1430,col 35)",
        "(line 1431,col 9)-(line 1431,col 28)",
        "(line 1432,col 9)-(line 1544,col 9)",
        "(line 1545,col 9)-(line 1550,col 9)",
        "(line 1552,col 9)-(line 1552,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.BOBYQAOptimizer.prelim(double[], double[])",
      "begin_line": 1577,
      "end_line": 1748,
      "comment": "\n     *     SUBROUTINE PRELIM sets the elements of XBASE, XPT, FVAL, GOPT, HQ, PQ,\n     *     BMAT and ZMAT for the first iteration, and it maintains the values of\n     *     NF and KOPT. The vector X is also changed by PRELIM.\n     *\n     *     The arguments N, NPT, X, XL, XU, RHOBEG, IPRINT and MAXFUN are the\n     *       same as the corresponding arguments in SUBROUTINE BOBYQA.\n     *     The arguments XBASE, XPT, FVAL, HQ, PQ, BMAT, ZMAT, NDIM, SL and SU\n     *       are the same as the corresponding arguments in BOBYQB, the elements\n     *       of SL and SU being set in BOBYQA.\n     *     GOPT is usually the gradient of the quadratic model at XOPT+XBASE, but\n     *       it is set by PRELIM to the gradient of the quadratic model at XBASE.\n     *       If XOPT is nonzero, BOBYQB will change it to its usual value later.\n     *     NF is maintaned as the number of calls of CALFUN so far.\n     *     KOPT will be such that the least calculated value of F so far is at\n     *       the point XPT(KOPT,.)+XBASE in the space of the variables.\n     *\n     * @param lowerBound Lower bounds.\n     * @param upperBound Upper bounds.\n     ",
      "child_ranges": [
        "(line 1579,col 9)-(line 1579,col 22)",
        "(line 1581,col 9)-(line 1581,col 49)",
        "(line 1582,col 9)-(line 1582,col 52)",
        "(line 1583,col 9)-(line 1583,col 51)",
        "(line 1585,col 9)-(line 1585,col 81)",
        "(line 1586,col 9)-(line 1586,col 40)",
        "(line 1587,col 9)-(line 1587,col 29)",
        "(line 1592,col 9)-(line 1600,col 9)",
        "(line 1601,col 9)-(line 1603,col 9)",
        "(line 1604,col 9)-(line 1609,col 9)",
        "(line 1615,col 9)-(line 1615,col 20)",
        "(line 1616,col 9)-(line 1616,col 20)",
        "(line 1617,col 9)-(line 1617,col 33)",
        "(line 1618,col 9)-(line 1747,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.BOBYQAOptimizer.trsbox(double, org.apache.commons.math3.linear.ArrayRealVector, org.apache.commons.math3.linear.ArrayRealVector, org.apache.commons.math3.linear.ArrayRealVector, org.apache.commons.math3.linear.ArrayRealVector, org.apache.commons.math3.linear.ArrayRealVector)",
      "begin_line": 1797,
      "end_line": 2270,
      "comment": "\n     *     A version of the truncated conjugate gradient is applied. If a line\n     *     search is restricted by a constraint, then the procedure is restarted,\n     *     the values of the variables that are at their bounds being fixed. If\n     *     the trust region boundary is reached, then further changes may be made\n     *     to D, each one being in the two dimensional space that is spanned\n     *     by the current D and the gradient of Q at XOPT+D, staying on the trust\n     *     region boundary. Termination occurs when the reduction in Q seems to\n     *     be close to the greatest reduction that can be achieved.\n     *     The arguments N, NPT, XPT, XOPT, GOPT, HQ, PQ, SL and SU have the same\n     *       meanings as the corresponding arguments of BOBYQB.\n     *     DELTA is the trust region radius for the present calculation, which\n     *       seeks a small value of the quadratic model within distance DELTA of\n     *       XOPT subject to the bounds on the variables.\n     *     XNEW will be set to a new vector of variables that is approximately\n     *       the one that minimizes the quadratic model within the trust region\n     *       subject to the SL and SU constraints on the variables. It satisfies\n     *       as equations the bounds that become active during the calculation.\n     *     D is the calculated trial step from XOPT, generated iteratively from an\n     *       initial value of zero. Thus XNEW is XOPT+D after the final iteration.\n     *     GNEW holds the gradient of the quadratic model at XOPT+D. It is updated\n     *       when D is updated.\n     *     xbdi.get( is a working space vector. For I\u003d1,2,...,N, the element xbdi.get((I) is\n     *       set to -1.0, 0.0, or 1.0, the value being nonzero if and only if the\n     *       I-th variable has become fixed at a bound, the bound being SL(I) or\n     *       SU(I) in the case xbdi.get((I)\u003d-1.0 or xbdi.get((I)\u003d1.0, respectively. This\n     *       information is accumulated during the construction of XNEW.\n     *     The arrays S, HS and HRED are also used for working space. They hold the\n     *       current search direction, and the changes in the gradient of Q along S\n     *       and the reduced D, respectively, where the reduced D is the same as D,\n     *       except that the components of the fixed variables are zero.\n     *     DSQ will be set to the square of the length of XNEW-XOPT.\n     *     CRVMIN is set to zero if D reaches the trust region boundary. Otherwise\n     *       it is set to the least curvature of H that occurs in the conjugate\n     *       gradient searches that are not restricted by any constraints. The\n     *       value CRVMIN\u003d-1.0D0 is set, however, if all of these searches are\n     *       constrained.\n     * @param delta\n     * @param gnew\n     * @param xbdi\n     * @param s\n     * @param hs\n     * @param hred\n     ",
      "child_ranges": [
        "(line 1805,col 9)-(line 1805,col 22)",
        "(line 1807,col 9)-(line 1807,col 49)",
        "(line 1808,col 9)-(line 1808,col 52)",
        "(line 1810,col 9)-(line 1810,col 32)",
        "(line 1811,col 9)-(line 1811,col 35)",
        "(line 1814,col 9)-(line 1814,col 18)",
        "(line 1815,col 9)-(line 1815,col 15)",
        "(line 1816,col 9)-(line 1816,col 64)",
        "(line 1817,col 9)-(line 1817,col 22)",
        "(line 1818,col 9)-(line 1818,col 21)",
        "(line 1819,col 9)-(line 1819,col 30)",
        "(line 1820,col 9)-(line 1820,col 17)",
        "(line 1821,col 9)-(line 1821,col 77)",
        "(line 1822,col 9)-(line 1822,col 18)",
        "(line 1823,col 9)-(line 1824,col 67)",
        "(line 1825,col 9)-(line 1825,col 23)",
        "(line 1826,col 9)-(line 1826,col 62)",
        "(line 1827,col 9)-(line 1827,col 24)",
        "(line 1840,col 9)-(line 1840,col 18)",
        "(line 1841,col 9)-(line 1841,col 17)",
        "(line 1842,col 9)-(line 1857,col 9)",
        "(line 1858,col 9)-(line 1858,col 30)",
        "(line 1859,col 9)-(line 1859,col 20)",
        "(line 1860,col 9)-(line 1860,col 27)",
        "(line 1868,col 9)-(line 1868,col 23)",
        "(line 1869,col 9)-(line 2269,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.BOBYQAOptimizer.update(double, double, int)",
      "begin_line": 2287,
      "end_line": 2366,
      "comment": "\n     *     The arrays BMAT and ZMAT are updated, as required by the new position\n     *     of the interpolation point that has the index KNEW. The vector VLAG has\n     *     N+NPT components, set on entry to the first NPT and last N components\n     *     of the product Hw in equation (4.11) of the Powell (2006) paper on\n     *     NEWUOA. Further, BETA is set on entry to the value of the parameter\n     *     with that name, and DENOM is set to the denominator of the updating\n     *     formula. Elements of ZMAT may be treated as zero if their moduli are\n     *     at most ZTEST. The first NDIM elements of W are used for working space.\n     * @param beta\n     * @param denom\n     * @param knew\n     ",
      "child_ranges": [
        "(line 2292,col 9)-(line 2292,col 22)",
        "(line 2294,col 9)-(line 2294,col 49)",
        "(line 2295,col 9)-(line 2295,col 52)",
        "(line 2296,col 9)-(line 2296,col 37)",
        "(line 2299,col 9)-(line 2299,col 66)",
        "(line 2301,col 9)-(line 2301,col 28)",
        "(line 2302,col 9)-(line 2307,col 9)",
        "(line 2308,col 9)-(line 2308,col 23)",
        "(line 2312,col 9)-(line 2329,col 9)",
        "(line 2334,col 9)-(line 2336,col 9)",
        "(line 2337,col 9)-(line 2337,col 49)",
        "(line 2338,col 9)-(line 2338,col 67)",
        "(line 2339,col 9)-(line 2339,col 95)",
        "(line 2343,col 9)-(line 2343,col 50)",
        "(line 2344,col 9)-(line 2344,col 42)",
        "(line 2345,col 9)-(line 2345,col 64)",
        "(line 2346,col 9)-(line 2349,col 9)",
        "(line 2353,col 9)-(line 2365,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.BOBYQAOptimizer.setup(double[], double[])",
      "begin_line": 2374,
      "end_line": 2427,
      "comment": "\n     * Performs validity checks.\n     *\n     * @param lowerBound Lower bounds (constraints) of the objective variables.\n     * @param upperBound Upperer bounds (constraints) of the objective variables.\n     ",
      "child_ranges": [
        "(line 2376,col 9)-(line 2376,col 22)",
        "(line 2378,col 9)-(line 2378,col 40)",
        "(line 2379,col 9)-(line 2379,col 42)",
        "(line 2382,col 9)-(line 2384,col 9)",
        "(line 2386,col 9)-(line 2386,col 95)",
        "(line 2387,col 9)-(line 2393,col 9)",
        "(line 2396,col 9)-(line 2396,col 48)",
        "(line 2398,col 9)-(line 2398,col 62)",
        "(line 2399,col 9)-(line 2399,col 50)",
        "(line 2400,col 9)-(line 2403,col 9)",
        "(line 2404,col 9)-(line 2406,col 9)",
        "(line 2409,col 9)-(line 2410,col 54)",
        "(line 2411,col 9)-(line 2412,col 88)",
        "(line 2413,col 9)-(line 2414,col 66)",
        "(line 2415,col 9)-(line 2415,col 53)",
        "(line 2416,col 9)-(line 2416,col 82)",
        "(line 2417,col 9)-(line 2417,col 65)",
        "(line 2418,col 9)-(line 2418,col 69)",
        "(line 2419,col 9)-(line 2419,col 57)",
        "(line 2420,col 9)-(line 2420,col 57)",
        "(line 2421,col 9)-(line 2421,col 92)",
        "(line 2422,col 9)-(line 2422,col 50)",
        "(line 2423,col 9)-(line 2423,col 61)",
        "(line 2424,col 9)-(line 2424,col 56)",
        "(line 2425,col 9)-(line 2425,col 96)",
        "(line 2426,col 9)-(line 2426,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.BOBYQAOptimizer.caller(int)",
      "begin_line": 2430,
      "end_line": 2435,
      "comment": " XXX utility for figuring out call sequence.",
      "child_ranges": [
        "(line 2431,col 9)-(line 2431,col 44)",
        "(line 2432,col 9)-(line 2432,col 63)",
        "(line 2433,col 9)-(line 2433,col 48)",
        "(line 2434,col 9)-(line 2434,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.BOBYQAOptimizer.printState(int)",
      "begin_line": 2437,
      "end_line": 2439,
      "comment": " XXX utility for figuring out call sequence.",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.BOBYQAOptimizer.printMethod()",
      "begin_line": 2441,
      "end_line": 2443,
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
      "begin_line": 2449,
      "end_line": 2458,
      "comment": "\n     * Marker for code paths that are not explored with the current unit tests.\n     * If the path becomes explored, it should just be removed from the code.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 2450,
      "end_line": 2450,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "PATH_IS_EXPLORED"
      ],
      "begin_line": 2452,
      "end_line": 2453,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.BOBYQAOptimizer.PathIsExploredException.PathIsExploredException()",
      "begin_line": 2455,
      "end_line": 2457,
      "comment": "",
      "child_ranges": [
        "(line 2456,col 13)-(line 2456,col 70)"
      ]
    }
  ]
}