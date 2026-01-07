{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/optim/nonlinear/vector/jacobian/LevenbergMarquardtOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LevenbergMarquardtOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer"
      ],
      "begin_line": 113,
      "end_line": 957,
      "comment": "\n * This class solves a least-squares problem using the Levenberg-Marquardt\n * algorithm.\n * \u003cbr/\u003e\n * Constraints are not supported: the call to\n * {@link #optimize(OptimizationData[]) optimize} will throw\n * {@link MathUnsupportedOperationException} if bounds are passed to it.\n *\n * \u003cp\u003eThis implementation \u003cem\u003eshould\u003c/em\u003e work even for over-determined systems\n * (i.e. systems having more point than equations). Over-determined systems\n * are solved by ignoring the point which have the smallest impact according\n * to their jacobian column norm. Only the rank of the matrix and some loop bounds\n * are changed to implement this.\u003c/p\u003e\n *\n * \u003cp\u003eThe resolution engine is a simple translation of the MINPACK \u003ca\n * href\u003d\"http://www.netlib.org/minpack/lmder.f\"\u003elmder\u003c/a\u003e routine with minor\n * changes. The changes include the over-determined resolution, the use of\n * inherited convergence checker and the Q.R. decomposition which has been\n * rewritten following the algorithm described in the\n * P. Lascaux and R. Theodor book \u003ci\u003eAnalyse num\u0026eacute;rique matricielle\n * appliqu\u0026eacute;e \u0026agrave; l\u0027art de l\u0027ing\u0026eacute;nieur\u003c/i\u003e, Masson 1986.\u003c/p\u003e\n * \u003cp\u003eThe authors of the original fortran version are:\n * \u003cul\u003e\n * \u003cli\u003eArgonne National Laboratory. MINPACK project. March 1980\u003c/li\u003e\n * \u003cli\u003eBurton S. Garbow\u003c/li\u003e\n * \u003cli\u003eKenneth E. Hillstrom\u003c/li\u003e\n * \u003cli\u003eJorge J. More\u003c/li\u003e\n * \u003c/ul\u003e\n * The redistribution policy for MINPACK is available \u003ca\n * href\u003d\"http://www.netlib.org/minpack/disclaimer\"\u003ehere\u003c/a\u003e, for convenience, it\n * is reproduced below.\u003c/p\u003e\n *\n * \u003ctable border\u003d\"0\" width\u003d\"80%\" cellpadding\u003d\"10\" align\u003d\"center\" bgcolor\u003d\"#E0E0E0\"\u003e\n * \u003ctr\u003e\u003ctd\u003e\n *    Minpack Copyright Notice (1999) University of Chicago.\n *    All rights reserved\n * \u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003e\n * Redistribution and use in source and binary forms, with or without\n * modification, are permitted provided that the following conditions\n * are met:\n * \u003col\u003e\n *  \u003cli\u003eRedistributions of source code must retain the above copyright\n *      notice, this list of conditions and the following disclaimer.\u003c/li\u003e\n * \u003cli\u003eRedistributions in binary form must reproduce the above\n *     copyright notice, this list of conditions and the following\n *     disclaimer in the documentation and/or other materials provided\n *     with the distribution.\u003c/li\u003e\n * \u003cli\u003eThe end-user documentation included with the redistribution, if any,\n *     must include the following acknowledgment:\n *     \u003ccode\u003eThis product includes software developed by the University of\n *           Chicago, as Operator of Argonne National Laboratory.\u003c/code\u003e\n *     Alternately, this acknowledgment may appear in the software itself,\n *     if and wherever such third-party acknowledgments normally appear.\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eWARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED \"AS IS\"\n *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE\n *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND\n *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR\n *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES\n *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE\n *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY\n *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR\n *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF\n *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)\n *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION\n *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL\n *     BE CORRECTED.\u003c/strong\u003e\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eLIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT\n *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF\n *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,\n *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF\n *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF\n *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER\n *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT\n *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,\n *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE\n *     POSSIBILITY OF SUCH LOSS OR DAMAGES.\u003c/strong\u003e\u003c/li\u003e\n * \u003col\u003e\u003c/td\u003e\u003c/tr\u003e\n * \u003c/table\u003e\n *\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "TWO_EPS"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": " Twice the \"epsilon machine\". "
    },
    {
      "type": "field",
      "varNames": [
        "solvedCols"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": " Number of solved point. "
    },
    {
      "type": "field",
      "varNames": [
        "diagR"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": " Diagonal elements of the R matrix in the Q.R. decomposition. "
    },
    {
      "type": "field",
      "varNames": [
        "jacNorm"
      ],
      "begin_line": 122,
      "end_line": 122,
      "comment": " Norms of the columns of the jacobian matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "beta"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": " Coefficients of the Householder transforms vectors. "
    },
    {
      "type": "field",
      "varNames": [
        "permutation"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": " Columns permutation array. "
    },
    {
      "type": "field",
      "varNames": [
        "rank"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": " Rank of the jacobian matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "lmPar"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": " Levenberg-Marquardt parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "lmDir"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": " Parameters evolution direction associated with lmPar. "
    },
    {
      "type": "field",
      "varNames": [
        "initialStepBoundFactor"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": " Positive input variable used in determining the initial step bound. "
    },
    {
      "type": "field",
      "varNames": [
        "costRelativeTolerance"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": " Desired relative error in the sum of squares. "
    },
    {
      "type": "field",
      "varNames": [
        "parRelativeTolerance"
      ],
      "begin_line": 138,
      "end_line": 138,
      "comment": "  Desired relative error in the approximate solution parameters. "
    },
    {
      "type": "field",
      "varNames": [
        "orthoTolerance"
      ],
      "begin_line": 141,
      "end_line": 141,
      "comment": " Desired max cosine on the orthogonality between the function vector\n     * and the columns of the jacobian. "
    },
    {
      "type": "field",
      "varNames": [
        "qrRankingThreshold"
      ],
      "begin_line": 143,
      "end_line": 143,
      "comment": " Threshold for QR ranking. "
    },
    {
      "type": "field",
      "varNames": [
        "weightedResidual"
      ],
      "begin_line": 145,
      "end_line": 145,
      "comment": " Weighted residuals. "
    },
    {
      "type": "field",
      "varNames": [
        "weightedJacobian"
      ],
      "begin_line": 147,
      "end_line": 147,
      "comment": " Weighted Jacobian. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.LevenbergMarquardtOptimizer()",
      "begin_line": 163,
      "end_line": 165,
      "comment": "\n     * Build an optimizer for least squares problems with default values\n     * for all the tuning parameters (see the {@link\n     * #LevenbergMarquardtOptimizer(double,double,double,double,double)\n     * other contructor}.\n     * The default values for the algorithm settings are:\n     * \u003cul\u003e\n     *  \u003cli\u003eInitial step bound factor: 100\u003c/li\u003e\n     *  \u003cli\u003eCost relative tolerance: 1e-10\u003c/li\u003e\n     *  \u003cli\u003eParameters relative tolerance: 1e-10\u003c/li\u003e\n     *  \u003cli\u003eOrthogonality tolerance: 1e-10\u003c/li\u003e\n     *  \u003cli\u003eQR ranking threshold: {@link Precision#SAFE_MIN}\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 59)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.LevenbergMarquardtOptimizer(org.apache.commons.math3.optim.ConvergenceChecker\u003corg.apache.commons.math3.optim.PointVectorValuePair\u003e)",
      "begin_line": 182,
      "end_line": 184,
      "comment": "\n     * Constructor that allows the specification of a custom convergence\n     * checker.\n     * Note that all the usual convergence checks will be \u003cem\u003edisabled\u003c/em\u003e.\n     * The default values for the algorithm settings are:\n     * \u003cul\u003e\n     *  \u003cli\u003eInitial step bound factor: 100\u003c/li\u003e\n     *  \u003cli\u003eCost relative tolerance: 1e-10\u003c/li\u003e\n     *  \u003cli\u003eParameters relative tolerance: 1e-10\u003c/li\u003e\n     *  \u003cli\u003eOrthogonality tolerance: 1e-10\u003c/li\u003e\n     *  \u003cli\u003eQR ranking threshold: {@link Precision#SAFE_MIN}\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param checker Convergence checker.\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 68)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.LevenbergMarquardtOptimizer(double, org.apache.commons.math3.optim.ConvergenceChecker\u003corg.apache.commons.math3.optim.PointVectorValuePair\u003e, double, double, double, double)",
      "begin_line": 208,
      "end_line": 220,
      "comment": "\n     * Constructor that allows the specification of a custom convergence\n     * checker, in addition to the standard ones.\n     *\n     * @param initialStepBoundFactor Positive input variable used in\n     * determining the initial step bound. This bound is set to the\n     * product of initialStepBoundFactor and the euclidean norm of\n     * {@code diag * x} if non-zero, or else to {@code initialStepBoundFactor}\n     * itself. In most cases factor should lie in the interval\n     * {@code (0.1, 100.0)}. {@code 100} is a generally recommended value.\n     * @param checker Convergence checker.\n     * @param costRelativeTolerance Desired relative error in the sum of\n     * squares.\n     * @param parRelativeTolerance Desired relative error in the approximate\n     * solution parameters.\n     * @param orthoTolerance Desired max cosine on the orthogonality between\n     * the function vector and the columns of the Jacobian.\n     * @param threshold Desired threshold for QR ranking. If the squared norm\n     * of a column vector is smaller or equal to this threshold during QR\n     * decomposition, it is considered to be a zero vector and hence the rank\n     * of the matrix is reduced.\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 23)",
        "(line 215,col 9)-(line 215,col 61)",
        "(line 216,col 9)-(line 216,col 59)",
        "(line 217,col 9)-(line 217,col 57)",
        "(line 218,col 9)-(line 218,col 45)",
        "(line 219,col 9)-(line 219,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.LevenbergMarquardtOptimizer(double, double, double)",
      "begin_line": 240,
      "end_line": 246,
      "comment": "\n     * Build an optimizer for least squares problems with default values\n     * for some of the tuning parameters (see the {@link\n     * #LevenbergMarquardtOptimizer(double,double,double,double,double)\n     * other contructor}.\n     * The default values for the algorithm settings are:\n     * \u003cul\u003e\n     *  \u003cli\u003eInitial step bound factor}: 100\u003c/li\u003e\n     *  \u003cli\u003eQR ranking threshold}: {@link Precision#SAFE_MIN}\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param costRelativeTolerance Desired relative error in the sum of\n     * squares.\n     * @param parRelativeTolerance Desired relative error in the approximate\n     * solution parameters.\n     * @param orthoTolerance Desired max cosine on the orthogonality between\n     * the function vector and the columns of the Jacobian.\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 245,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.LevenbergMarquardtOptimizer(double, double, double, double, double)",
      "begin_line": 271,
      "end_line": 282,
      "comment": "\n     * The arguments control the behaviour of the default convergence checking\n     * procedure.\n     * Additional criteria can defined through the setting of a {@link\n     * ConvergenceChecker}.\n     *\n     * @param initialStepBoundFactor Positive input variable used in\n     * determining the initial step bound. This bound is set to the\n     * product of initialStepBoundFactor and the euclidean norm of\n     * {@code diag * x} if non-zero, or else to {@code initialStepBoundFactor}\n     * itself. In most cases factor should lie in the interval\n     * {@code (0.1, 100.0)}. {@code 100} is a generally recommended value.\n     * @param costRelativeTolerance Desired relative error in the sum of\n     * squares.\n     * @param parRelativeTolerance Desired relative error in the approximate\n     * solution parameters.\n     * @param orthoTolerance Desired max cosine on the orthogonality between\n     * the function vector and the columns of the Jacobian.\n     * @param threshold Desired threshold for QR ranking. If the squared norm\n     * of a column vector is smaller or equal to this threshold during QR\n     * decomposition, it is considered to be a zero vector and hence the rank\n     * of the matrix is reduced.\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 20)",
        "(line 277,col 9)-(line 277,col 61)",
        "(line 278,col 9)-(line 278,col 59)",
        "(line 279,col 9)-(line 279,col 57)",
        "(line 280,col 9)-(line 280,col 45)",
        "(line 281,col 9)-(line 281,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.doOptimize()",
      "begin_line": 285,
      "end_line": 534,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 26)",
        "(line 289,col 9)-(line 289,col 42)",
        "(line 290,col 9)-(line 290,col 54)",
        "(line 291,col 9)-(line 291,col 43)",
        "(line 294,col 9)-(line 294,col 43)",
        "(line 295,col 9)-(line 295,col 37)",
        "(line 296,col 9)-(line 296,col 37)",
        "(line 297,col 9)-(line 297,col 37)",
        "(line 298,col 9)-(line 298,col 34)",
        "(line 299,col 9)-(line 299,col 37)",
        "(line 302,col 9)-(line 302,col 29)",
        "(line 303,col 9)-(line 303,col 29)",
        "(line 304,col 9)-(line 304,col 42)",
        "(line 305,col 9)-(line 305,col 42)",
        "(line 306,col 9)-(line 306,col 42)",
        "(line 307,col 9)-(line 307,col 42)",
        "(line 308,col 9)-(line 308,col 42)",
        "(line 309,col 9)-(line 309,col 42)",
        "(line 310,col 9)-(line 310,col 42)",
        "(line 311,col 9)-(line 311,col 42)",
        "(line 313,col 9)-(line 313,col 66)",
        "(line 316,col 9)-(line 316,col 72)",
        "(line 317,col 9)-(line 317,col 71)",
        "(line 318,col 9)-(line 318,col 96)",
        "(line 319,col 9)-(line 319,col 59)",
        "(line 322,col 9)-(line 322,col 18)",
        "(line 323,col 9)-(line 323,col 38)",
        "(line 324,col 9)-(line 324,col 89)",
        "(line 325,col 9)-(line 533,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMParameter(double[], double, double[], double[], double[], double[])",
      "begin_line": 558,
      "end_line": 705,
      "comment": "\n     * Determine the Levenberg-Marquardt parameter.\n     * \u003cp\u003eThis implementation is a translation in Java of the MINPACK\n     * \u003ca href\u003d\"http://www.netlib.org/minpack/lmpar.f\"\u003elmpar\u003c/a\u003e\n     * routine.\u003c/p\u003e\n     * \u003cp\u003eThis method sets the lmPar and lmDir attributes.\u003c/p\u003e\n     * \u003cp\u003eThe authors of the original fortran function are:\u003c/p\u003e\n     * \u003cul\u003e\n     *   \u003cli\u003eArgonne National Laboratory. MINPACK project. March 1980\u003c/li\u003e\n     *   \u003cli\u003eBurton  S. Garbow\u003c/li\u003e\n     *   \u003cli\u003eKenneth E. Hillstrom\u003c/li\u003e\n     *   \u003cli\u003eJorge   J. More\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003cp\u003eLuc Maisonobe did the Java translation.\u003c/p\u003e\n     *\n     * @param qy array containing qTy\n     * @param delta upper bound on the euclidean norm of diagR * lmDir\n     * @param diag diagonal matrix\n     * @param work1 work array\n     * @param work2 work array\n     * @param work3 work array\n     ",
      "child_ranges": [
        "(line 560,col 9)-(line 560,col 50)",
        "(line 564,col 9)-(line 566,col 9)",
        "(line 567,col 9)-(line 569,col 9)",
        "(line 570,col 9)-(line 577,col 9)",
        "(line 581,col 9)-(line 581,col 26)",
        "(line 582,col 9)-(line 587,col 9)",
        "(line 588,col 9)-(line 588,col 39)",
        "(line 589,col 9)-(line 589,col 35)",
        "(line 590,col 9)-(line 593,col 9)",
        "(line 598,col 9)-(line 598,col 20)",
        "(line 599,col 9)-(line 599,col 24)",
        "(line 600,col 9)-(line 617,col 9)",
        "(line 620,col 9)-(line 620,col 17)",
        "(line 621,col 9)-(line 629,col 9)",
        "(line 630,col 9)-(line 630,col 43)",
        "(line 631,col 9)-(line 631,col 36)",
        "(line 632,col 9)-(line 634,col 9)",
        "(line 638,col 9)-(line 638,col 62)",
        "(line 639,col 9)-(line 641,col 9)",
        "(line 643,col 9)-(line 704,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection(double[], double[], double[], double[])",
      "begin_line": 727,
      "end_line": 826,
      "comment": "\n     * Solve a*x \u003d b and d*x \u003d 0 in the least squares sense.\n     * \u003cp\u003eThis implementation is a translation in Java of the MINPACK\n     * \u003ca href\u003d\"http://www.netlib.org/minpack/qrsolv.f\"\u003eqrsolv\u003c/a\u003e\n     * routine.\u003c/p\u003e\n     * \u003cp\u003eThis method sets the lmDir and lmDiag attributes.\u003c/p\u003e\n     * \u003cp\u003eThe authors of the original fortran function are:\u003c/p\u003e\n     * \u003cul\u003e\n     *   \u003cli\u003eArgonne National Laboratory. MINPACK project. March 1980\u003c/li\u003e\n     *   \u003cli\u003eBurton  S. Garbow\u003c/li\u003e\n     *   \u003cli\u003eKenneth E. Hillstrom\u003c/li\u003e\n     *   \u003cli\u003eJorge   J. More\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003cp\u003eLuc Maisonobe did the Java translation.\u003c/p\u003e\n     *\n     * @param qy array containing qTy\n     * @param diag diagonal matrix\n     * @param lmDiag diagonal elements associated with lmDir\n     * @param work work array\n     ",
      "child_ranges": [
        "(line 732,col 9)-(line 739,col 9)",
        "(line 742,col 9)-(line 798,col 9)",
        "(line 802,col 9)-(line 802,col 31)",
        "(line 803,col 9)-(line 810,col 9)",
        "(line 811,col 9)-(line 820,col 9)",
        "(line 823,col 9)-(line 825,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.qrDecomposition(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 852,
      "end_line": 923,
      "comment": "\n     * Decompose a matrix A as A.P \u003d Q.R using Householder transforms.\n     * \u003cp\u003eAs suggested in the P. Lascaux and R. Theodor book\n     * \u003ci\u003eAnalyse num\u0026eacute;rique matricielle appliqu\u0026eacute;e \u0026agrave;\n     * l\u0027art de l\u0027ing\u0026eacute;nieur\u003c/i\u003e (Masson, 1986), instead of representing\n     * the Householder transforms with u\u003csub\u003ek\u003c/sub\u003e unit vectors such that:\n     * \u003cpre\u003e\n     * H\u003csub\u003ek\u003c/sub\u003e \u003d I - 2u\u003csub\u003ek\u003c/sub\u003e.u\u003csub\u003ek\u003c/sub\u003e\u003csup\u003et\u003c/sup\u003e\n     * \u003c/pre\u003e\n     * we use \u003csub\u003ek\u003c/sub\u003e non-unit vectors such that:\n     * \u003cpre\u003e\n     * H\u003csub\u003ek\u003c/sub\u003e \u003d I - beta\u003csub\u003ek\u003c/sub\u003ev\u003csub\u003ek\u003c/sub\u003e.v\u003csub\u003ek\u003c/sub\u003e\u003csup\u003et\u003c/sup\u003e\n     * \u003c/pre\u003e\n     * where v\u003csub\u003ek\u003c/sub\u003e \u003d a\u003csub\u003ek\u003c/sub\u003e - alpha\u003csub\u003ek\u003c/sub\u003e e\u003csub\u003ek\u003c/sub\u003e.\n     * The beta\u003csub\u003ek\u003c/sub\u003e coefficients are provided upon exit as recomputing\n     * them from the v\u003csub\u003ek\u003c/sub\u003e vectors would be costly.\u003c/p\u003e\n     * \u003cp\u003eThis decomposition handles rank deficient cases since the tranformations\n     * are performed in non-increasing columns norms order thanks to columns\n     * pivoting. The diagonal elements of the R matrix are therefore also in\n     * non-increasing absolute values order.\u003c/p\u003e\n     *\n     * @param jacobian Weighted Jacobian matrix at the current point.\n     * @exception ConvergenceException if the decomposition cannot be performed\n     ",
      "child_ranges": [
        "(line 855,col 9)-(line 855,col 65)",
        "(line 857,col 9)-(line 857,col 47)",
        "(line 858,col 9)-(line 858,col 50)",
        "(line 861,col 9)-(line 869,col 9)",
        "(line 872,col 9)-(line 921,col 9)",
        "(line 922,col 9)-(line 922,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.qTy(double[])",
      "begin_line": 930,
      "end_line": 945,
      "comment": "\n     * Compute the product Qt.y for some Q.R. decomposition.\n     *\n     * @param y vector to multiply (will be overwritten with the result)\n     ",
      "child_ranges": [
        "(line 931,col 9)-(line 931,col 47)",
        "(line 932,col 9)-(line 932,col 50)",
        "(line 934,col 9)-(line 944,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.checkParameters()",
      "begin_line": 951,
      "end_line": 956,
      "comment": "\n     * @throws MathUnsupportedOperationException if bounds were passed to the\n     * {@link #optimize(OptimizationData[]) optimize} method.\n     ",
      "child_ranges": [
        "(line 952,col 9)-(line 955,col 9)"
      ]
    }
  ]
}