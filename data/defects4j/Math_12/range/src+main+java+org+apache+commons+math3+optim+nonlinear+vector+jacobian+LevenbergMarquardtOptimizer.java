{
  "filepath": "/tmp/Math-12b/src/main/java/org/apache/commons/math3/optim/nonlinear/vector/jacobian/LevenbergMarquardtOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LevenbergMarquardtOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizer"
      ],
      "begin_line": 107,
      "end_line": 939,
      "comment": "\n * This class solves a least-squares problem using the Levenberg-Marquardt algorithm.\n *\n * \u003cp\u003eThis implementation \u003cem\u003eshould\u003c/em\u003e work even for over-determined systems\n * (i.e. systems having more point than equations). Over-determined systems\n * are solved by ignoring the point which have the smallest impact according\n * to their jacobian column norm. Only the rank of the matrix and some loop bounds\n * are changed to implement this.\u003c/p\u003e\n *\n * \u003cp\u003eThe resolution engine is a simple translation of the MINPACK \u003ca\n * href\u003d\"http://www.netlib.org/minpack/lmder.f\"\u003elmder\u003c/a\u003e routine with minor\n * changes. The changes include the over-determined resolution, the use of\n * inherited convergence checker and the Q.R. decomposition which has been\n * rewritten following the algorithm described in the\n * P. Lascaux and R. Theodor book \u003ci\u003eAnalyse num\u0026eacute;rique matricielle\n * appliqu\u0026eacute;e \u0026agrave; l\u0027art de l\u0027ing\u0026eacute;nieur\u003c/i\u003e, Masson 1986.\u003c/p\u003e\n * \u003cp\u003eThe authors of the original fortran version are:\n * \u003cul\u003e\n * \u003cli\u003eArgonne National Laboratory. MINPACK project. March 1980\u003c/li\u003e\n * \u003cli\u003eBurton S. Garbow\u003c/li\u003e\n * \u003cli\u003eKenneth E. Hillstrom\u003c/li\u003e\n * \u003cli\u003eJorge J. More\u003c/li\u003e\n * \u003c/ul\u003e\n * The redistribution policy for MINPACK is available \u003ca\n * href\u003d\"http://www.netlib.org/minpack/disclaimer\"\u003ehere\u003c/a\u003e, for convenience, it\n * is reproduced below.\u003c/p\u003e\n *\n * \u003ctable border\u003d\"0\" width\u003d\"80%\" cellpadding\u003d\"10\" align\u003d\"center\" bgcolor\u003d\"#E0E0E0\"\u003e\n * \u003ctr\u003e\u003ctd\u003e\n *    Minpack Copyright Notice (1999) University of Chicago.\n *    All rights reserved\n * \u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003e\n * Redistribution and use in source and binary forms, with or without\n * modification, are permitted provided that the following conditions\n * are met:\n * \u003col\u003e\n *  \u003cli\u003eRedistributions of source code must retain the above copyright\n *      notice, this list of conditions and the following disclaimer.\u003c/li\u003e\n * \u003cli\u003eRedistributions in binary form must reproduce the above\n *     copyright notice, this list of conditions and the following\n *     disclaimer in the documentation and/or other materials provided\n *     with the distribution.\u003c/li\u003e\n * \u003cli\u003eThe end-user documentation included with the redistribution, if any,\n *     must include the following acknowledgment:\n *     \u003ccode\u003eThis product includes software developed by the University of\n *           Chicago, as Operator of Argonne National Laboratory.\u003c/code\u003e\n *     Alternately, this acknowledgment may appear in the software itself,\n *     if and wherever such third-party acknowledgments normally appear.\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eWARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED \"AS IS\"\n *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE\n *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND\n *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR\n *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES\n *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE\n *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY\n *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR\n *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF\n *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)\n *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION\n *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL\n *     BE CORRECTED.\u003c/strong\u003e\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eLIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT\n *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF\n *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,\n *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF\n *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF\n *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER\n *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT\n *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,\n *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE\n *     POSSIBILITY OF SUCH LOSS OR DAMAGES.\u003c/strong\u003e\u003c/li\u003e\n * \u003col\u003e\u003c/td\u003e\u003c/tr\u003e\n * \u003c/table\u003e\n *\n * @version $Id: LevenbergMarquardtOptimizer.java 1416643 2012-12-03 19:37:14Z tn $\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "solvedCols"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": " Number of solved point. "
    },
    {
      "type": "field",
      "varNames": [
        "diagR"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": " Diagonal elements of the R matrix in the Q.R. decomposition. "
    },
    {
      "type": "field",
      "varNames": [
        "jacNorm"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": " Norms of the columns of the jacobian matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "beta"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": " Coefficients of the Householder transforms vectors. "
    },
    {
      "type": "field",
      "varNames": [
        "permutation"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": " Columns permutation array. "
    },
    {
      "type": "field",
      "varNames": [
        "rank"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": " Rank of the jacobian matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "lmPar"
      ],
      "begin_line": 122,
      "end_line": 122,
      "comment": " Levenberg-Marquardt parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "lmDir"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": " Parameters evolution direction associated with lmPar. "
    },
    {
      "type": "field",
      "varNames": [
        "initialStepBoundFactor"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": " Positive input variable used in determining the initial step bound. "
    },
    {
      "type": "field",
      "varNames": [
        "costRelativeTolerance"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": " Desired relative error in the sum of squares. "
    },
    {
      "type": "field",
      "varNames": [
        "parRelativeTolerance"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": "  Desired relative error in the approximate solution parameters. "
    },
    {
      "type": "field",
      "varNames": [
        "orthoTolerance"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": " Desired max cosine on the orthogonality between the function vector\n     * and the columns of the jacobian. "
    },
    {
      "type": "field",
      "varNames": [
        "qrRankingThreshold"
      ],
      "begin_line": 135,
      "end_line": 135,
      "comment": " Threshold for QR ranking. "
    },
    {
      "type": "field",
      "varNames": [
        "weightedResidual"
      ],
      "begin_line": 137,
      "end_line": 137,
      "comment": " Weighted residuals. "
    },
    {
      "type": "field",
      "varNames": [
        "weightedJacobian"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": " Weighted Jacobian. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.LevenbergMarquardtOptimizer()",
      "begin_line": 155,
      "end_line": 157,
      "comment": "\n     * Build an optimizer for least squares problems with default values\n     * for all the tuning parameters (see the {@link\n     * #LevenbergMarquardtOptimizer(double,double,double,double,double)\n     * other contructor}.\n     * The default values for the algorithm settings are:\n     * \u003cul\u003e\n     *  \u003cli\u003eInitial step bound factor: 100\u003c/li\u003e\n     *  \u003cli\u003eCost relative tolerance: 1e-10\u003c/li\u003e\n     *  \u003cli\u003eParameters relative tolerance: 1e-10\u003c/li\u003e\n     *  \u003cli\u003eOrthogonality tolerance: 1e-10\u003c/li\u003e\n     *  \u003cli\u003eQR ranking threshold: {@link Precision#SAFE_MIN}\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 59)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.LevenbergMarquardtOptimizer(org.apache.commons.math3.optim.ConvergenceChecker\u003corg.apache.commons.math3.optim.PointVectorValuePair\u003e)",
      "begin_line": 174,
      "end_line": 176,
      "comment": "\n     * Constructor that allows the specification of a custom convergence\n     * checker.\n     * Note that all the usual convergence checks will be \u003cem\u003edisabled\u003c/em\u003e.\n     * The default values for the algorithm settings are:\n     * \u003cul\u003e\n     *  \u003cli\u003eInitial step bound factor: 100\u003c/li\u003e\n     *  \u003cli\u003eCost relative tolerance: 1e-10\u003c/li\u003e\n     *  \u003cli\u003eParameters relative tolerance: 1e-10\u003c/li\u003e\n     *  \u003cli\u003eOrthogonality tolerance: 1e-10\u003c/li\u003e\n     *  \u003cli\u003eQR ranking threshold: {@link Precision#SAFE_MIN}\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param checker Convergence checker.\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 68)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.LevenbergMarquardtOptimizer(double, org.apache.commons.math3.optim.ConvergenceChecker\u003corg.apache.commons.math3.optim.PointVectorValuePair\u003e, double, double, double, double)",
      "begin_line": 200,
      "end_line": 212,
      "comment": "\n     * Constructor that allows the specification of a custom convergence\n     * checker, in addition to the standard ones.\n     *\n     * @param initialStepBoundFactor Positive input variable used in\n     * determining the initial step bound. This bound is set to the\n     * product of initialStepBoundFactor and the euclidean norm of\n     * {@code diag * x} if non-zero, or else to {@code initialStepBoundFactor}\n     * itself. In most cases factor should lie in the interval\n     * {@code (0.1, 100.0)}. {@code 100} is a generally recommended value.\n     * @param checker Convergence checker.\n     * @param costRelativeTolerance Desired relative error in the sum of\n     * squares.\n     * @param parRelativeTolerance Desired relative error in the approximate\n     * solution parameters.\n     * @param orthoTolerance Desired max cosine on the orthogonality between\n     * the function vector and the columns of the Jacobian.\n     * @param threshold Desired threshold for QR ranking. If the squared norm\n     * of a column vector is smaller or equal to this threshold during QR\n     * decomposition, it is considered to be a zero vector and hence the rank\n     * of the matrix is reduced.\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 23)",
        "(line 207,col 9)-(line 207,col 61)",
        "(line 208,col 9)-(line 208,col 59)",
        "(line 209,col 9)-(line 209,col 57)",
        "(line 210,col 9)-(line 210,col 45)",
        "(line 211,col 9)-(line 211,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.LevenbergMarquardtOptimizer(double, double, double)",
      "begin_line": 232,
      "end_line": 238,
      "comment": "\n     * Build an optimizer for least squares problems with default values\n     * for some of the tuning parameters (see the {@link\n     * #LevenbergMarquardtOptimizer(double,double,double,double,double)\n     * other contructor}.\n     * The default values for the algorithm settings are:\n     * \u003cul\u003e\n     *  \u003cli\u003eInitial step bound factor}: 100\u003c/li\u003e\n     *  \u003cli\u003eQR ranking threshold}: {@link Precision#SAFE_MIN}\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param costRelativeTolerance Desired relative error in the sum of\n     * squares.\n     * @param parRelativeTolerance Desired relative error in the approximate\n     * solution parameters.\n     * @param orthoTolerance Desired max cosine on the orthogonality between\n     * the function vector and the columns of the Jacobian.\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 237,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.LevenbergMarquardtOptimizer(double, double, double, double, double)",
      "begin_line": 263,
      "end_line": 274,
      "comment": "\n     * The arguments control the behaviour of the default convergence checking\n     * procedure.\n     * Additional criteria can defined through the setting of a {@link\n     * ConvergenceChecker}.\n     *\n     * @param initialStepBoundFactor Positive input variable used in\n     * determining the initial step bound. This bound is set to the\n     * product of initialStepBoundFactor and the euclidean norm of\n     * {@code diag * x} if non-zero, or else to {@code initialStepBoundFactor}\n     * itself. In most cases factor should lie in the interval\n     * {@code (0.1, 100.0)}. {@code 100} is a generally recommended value.\n     * @param costRelativeTolerance Desired relative error in the sum of\n     * squares.\n     * @param parRelativeTolerance Desired relative error in the approximate\n     * solution parameters.\n     * @param orthoTolerance Desired max cosine on the orthogonality between\n     * the function vector and the columns of the Jacobian.\n     * @param threshold Desired threshold for QR ranking. If the squared norm\n     * of a column vector is smaller or equal to this threshold during QR\n     * decomposition, it is considered to be a zero vector and hence the rank\n     * of the matrix is reduced.\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 20)",
        "(line 269,col 9)-(line 269,col 61)",
        "(line 270,col 9)-(line 270,col 59)",
        "(line 271,col 9)-(line 271,col 57)",
        "(line 272,col 9)-(line 272,col 45)",
        "(line 273,col 9)-(line 273,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.doOptimize()",
      "begin_line": 277,
      "end_line": 526,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 42)",
        "(line 280,col 9)-(line 280,col 54)",
        "(line 281,col 9)-(line 281,col 43)",
        "(line 284,col 9)-(line 284,col 43)",
        "(line 285,col 9)-(line 285,col 37)",
        "(line 286,col 9)-(line 286,col 37)",
        "(line 287,col 9)-(line 287,col 37)",
        "(line 288,col 9)-(line 288,col 34)",
        "(line 289,col 9)-(line 289,col 37)",
        "(line 292,col 9)-(line 292,col 29)",
        "(line 293,col 9)-(line 293,col 29)",
        "(line 294,col 9)-(line 294,col 42)",
        "(line 295,col 9)-(line 295,col 42)",
        "(line 296,col 9)-(line 296,col 42)",
        "(line 297,col 9)-(line 297,col 42)",
        "(line 298,col 9)-(line 298,col 42)",
        "(line 299,col 9)-(line 299,col 42)",
        "(line 300,col 9)-(line 300,col 42)",
        "(line 301,col 9)-(line 301,col 42)",
        "(line 303,col 9)-(line 303,col 66)",
        "(line 306,col 9)-(line 306,col 72)",
        "(line 307,col 9)-(line 307,col 71)",
        "(line 308,col 9)-(line 308,col 96)",
        "(line 309,col 9)-(line 309,col 59)",
        "(line 312,col 9)-(line 312,col 18)",
        "(line 313,col 9)-(line 313,col 38)",
        "(line 314,col 9)-(line 314,col 21)",
        "(line 315,col 9)-(line 315,col 89)",
        "(line 316,col 9)-(line 525,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMParameter(double[], double, double[], double[], double[], double[])",
      "begin_line": 550,
      "end_line": 698,
      "comment": "\n     * Determine the Levenberg-Marquardt parameter.\n     * \u003cp\u003eThis implementation is a translation in Java of the MINPACK\n     * \u003ca href\u003d\"http://www.netlib.org/minpack/lmpar.f\"\u003elmpar\u003c/a\u003e\n     * routine.\u003c/p\u003e\n     * \u003cp\u003eThis method sets the lmPar and lmDir attributes.\u003c/p\u003e\n     * \u003cp\u003eThe authors of the original fortran function are:\u003c/p\u003e\n     * \u003cul\u003e\n     *   \u003cli\u003eArgonne National Laboratory. MINPACK project. March 1980\u003c/li\u003e\n     *   \u003cli\u003eBurton  S. Garbow\u003c/li\u003e\n     *   \u003cli\u003eKenneth E. Hillstrom\u003c/li\u003e\n     *   \u003cli\u003eJorge   J. More\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003cp\u003eLuc Maisonobe did the Java translation.\u003c/p\u003e\n     *\n     * @param qy array containing qTy\n     * @param delta upper bound on the euclidean norm of diagR * lmDir\n     * @param diag diagonal matrix\n     * @param work1 work array\n     * @param work2 work array\n     * @param work3 work array\n     ",
      "child_ranges": [
        "(line 552,col 9)-(line 552,col 50)",
        "(line 556,col 9)-(line 558,col 9)",
        "(line 559,col 9)-(line 561,col 9)",
        "(line 562,col 9)-(line 569,col 9)",
        "(line 573,col 9)-(line 573,col 26)",
        "(line 574,col 9)-(line 579,col 9)",
        "(line 580,col 9)-(line 580,col 39)",
        "(line 581,col 9)-(line 581,col 35)",
        "(line 582,col 9)-(line 585,col 9)",
        "(line 590,col 9)-(line 590,col 20)",
        "(line 591,col 9)-(line 591,col 24)",
        "(line 592,col 9)-(line 609,col 9)",
        "(line 612,col 9)-(line 612,col 17)",
        "(line 613,col 9)-(line 621,col 9)",
        "(line 622,col 9)-(line 622,col 43)",
        "(line 623,col 9)-(line 623,col 36)",
        "(line 624,col 9)-(line 627,col 9)",
        "(line 631,col 9)-(line 631,col 62)",
        "(line 632,col 9)-(line 634,col 9)",
        "(line 636,col 9)-(line 697,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.determineLMDirection(double[], double[], double[], double[])",
      "begin_line": 720,
      "end_line": 819,
      "comment": "\n     * Solve a*x \u003d b and d*x \u003d 0 in the least squares sense.\n     * \u003cp\u003eThis implementation is a translation in Java of the MINPACK\n     * \u003ca href\u003d\"http://www.netlib.org/minpack/qrsolv.f\"\u003eqrsolv\u003c/a\u003e\n     * routine.\u003c/p\u003e\n     * \u003cp\u003eThis method sets the lmDir and lmDiag attributes.\u003c/p\u003e\n     * \u003cp\u003eThe authors of the original fortran function are:\u003c/p\u003e\n     * \u003cul\u003e\n     *   \u003cli\u003eArgonne National Laboratory. MINPACK project. March 1980\u003c/li\u003e\n     *   \u003cli\u003eBurton  S. Garbow\u003c/li\u003e\n     *   \u003cli\u003eKenneth E. Hillstrom\u003c/li\u003e\n     *   \u003cli\u003eJorge   J. More\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003cp\u003eLuc Maisonobe did the Java translation.\u003c/p\u003e\n     *\n     * @param qy array containing qTy\n     * @param diag diagonal matrix\n     * @param lmDiag diagonal elements associated with lmDir\n     * @param work work array\n     ",
      "child_ranges": [
        "(line 725,col 9)-(line 732,col 9)",
        "(line 735,col 9)-(line 791,col 9)",
        "(line 795,col 9)-(line 795,col 31)",
        "(line 796,col 9)-(line 803,col 9)",
        "(line 804,col 9)-(line 813,col 9)",
        "(line 816,col 9)-(line 818,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.qrDecomposition(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 845,
      "end_line": 916,
      "comment": "\n     * Decompose a matrix A as A.P \u003d Q.R using Householder transforms.\n     * \u003cp\u003eAs suggested in the P. Lascaux and R. Theodor book\n     * \u003ci\u003eAnalyse num\u0026eacute;rique matricielle appliqu\u0026eacute;e \u0026agrave;\n     * l\u0027art de l\u0027ing\u0026eacute;nieur\u003c/i\u003e (Masson, 1986), instead of representing\n     * the Householder transforms with u\u003csub\u003ek\u003c/sub\u003e unit vectors such that:\n     * \u003cpre\u003e\n     * H\u003csub\u003ek\u003c/sub\u003e \u003d I - 2u\u003csub\u003ek\u003c/sub\u003e.u\u003csub\u003ek\u003c/sub\u003e\u003csup\u003et\u003c/sup\u003e\n     * \u003c/pre\u003e\n     * we use \u003csub\u003ek\u003c/sub\u003e non-unit vectors such that:\n     * \u003cpre\u003e\n     * H\u003csub\u003ek\u003c/sub\u003e \u003d I - beta\u003csub\u003ek\u003c/sub\u003ev\u003csub\u003ek\u003c/sub\u003e.v\u003csub\u003ek\u003c/sub\u003e\u003csup\u003et\u003c/sup\u003e\n     * \u003c/pre\u003e\n     * where v\u003csub\u003ek\u003c/sub\u003e \u003d a\u003csub\u003ek\u003c/sub\u003e - alpha\u003csub\u003ek\u003c/sub\u003e e\u003csub\u003ek\u003c/sub\u003e.\n     * The beta\u003csub\u003ek\u003c/sub\u003e coefficients are provided upon exit as recomputing\n     * them from the v\u003csub\u003ek\u003c/sub\u003e vectors would be costly.\u003c/p\u003e\n     * \u003cp\u003eThis decomposition handles rank deficient cases since the tranformations\n     * are performed in non-increasing columns norms order thanks to columns\n     * pivoting. The diagonal elements of the R matrix are therefore also in\n     * non-increasing absolute values order.\u003c/p\u003e\n     *\n     * @param jacobian Weighted Jacobian matrix at the current point.\n     * @exception ConvergenceException if the decomposition cannot be performed\n     ",
      "child_ranges": [
        "(line 848,col 9)-(line 848,col 65)",
        "(line 850,col 9)-(line 850,col 47)",
        "(line 851,col 9)-(line 851,col 50)",
        "(line 854,col 9)-(line 862,col 9)",
        "(line 865,col 9)-(line 914,col 9)",
        "(line 915,col 9)-(line 915,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer.qTy(double[])",
      "begin_line": 923,
      "end_line": 938,
      "comment": "\n     * Compute the product Qt.y for some Q.R. decomposition.\n     *\n     * @param y vector to multiply (will be overwritten with the result)\n     ",
      "child_ranges": [
        "(line 924,col 9)-(line 924,col 47)",
        "(line 925,col 9)-(line 925,col 50)",
        "(line 927,col 9)-(line 937,col 9)"
      ]
    }
  ]
}