{
  "filepath": "/tmp/Math-38b/src/main/java/org/apache/commons/math/optimization/general/LevenbergMarquardtOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LevenbergMarquardtOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer"
      ],
      "begin_line": 107,
      "end_line": 907,
      "comment": "\n * This class solves a least squares problem using the Levenberg-Marquardt algorithm.\n *\n * \u003cp\u003eThis implementation \u003cem\u003eshould\u003c/em\u003e work even for over-determined systems\n * (i.e. systems having more point than equations). Over-determined systems\n * are solved by ignoring the point which have the smallest impact according\n * to their jacobian column norm. Only the rank of the matrix and some loop bounds\n * are changed to implement this.\u003c/p\u003e\n *\n * \u003cp\u003eThe resolution engine is a simple translation of the MINPACK \u003ca\n * href\u003d\"http://www.netlib.org/minpack/lmder.f\"\u003elmder\u003c/a\u003e routine with minor\n * changes. The changes include the over-determined resolution, the use of\n * inherited convergence checker and the Q.R. decomposition which has been\n * rewritten following the algorithm described in the\n * P. Lascaux and R. Theodor book \u003ci\u003eAnalyse num\u0026eacute;rique matricielle\n * appliqu\u0026eacute;e \u0026agrave; l\u0027art de l\u0027ing\u0026eacute;nieur\u003c/i\u003e, Masson 1986.\u003c/p\u003e\n * \u003cp\u003eThe authors of the original fortran version are:\n * \u003cul\u003e\n * \u003cli\u003eArgonne National Laboratory. MINPACK project. March 1980\u003c/li\u003e\n * \u003cli\u003eBurton S. Garbow\u003c/li\u003e\n * \u003cli\u003eKenneth E. Hillstrom\u003c/li\u003e\n * \u003cli\u003eJorge J. More\u003c/li\u003e\n * \u003c/ul\u003e\n * The redistribution policy for MINPACK is available \u003ca\n * href\u003d\"http://www.netlib.org/minpack/disclaimer\"\u003ehere\u003c/a\u003e, for convenience, it\n * is reproduced below.\u003c/p\u003e\n *\n * \u003ctable border\u003d\"0\" width\u003d\"80%\" cellpadding\u003d\"10\" align\u003d\"center\" bgcolor\u003d\"#E0E0E0\"\u003e\n * \u003ctr\u003e\u003ctd\u003e\n *    Minpack Copyright Notice (1999) University of Chicago.\n *    All rights reserved\n * \u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003e\n * Redistribution and use in source and binary forms, with or without\n * modification, are permitted provided that the following conditions\n * are met:\n * \u003col\u003e\n *  \u003cli\u003eRedistributions of source code must retain the above copyright\n *      notice, this list of conditions and the following disclaimer.\u003c/li\u003e\n * \u003cli\u003eRedistributions in binary form must reproduce the above\n *     copyright notice, this list of conditions and the following\n *     disclaimer in the documentation and/or other materials provided\n *     with the distribution.\u003c/li\u003e\n * \u003cli\u003eThe end-user documentation included with the redistribution, if any,\n *     must include the following acknowledgment:\n *     \u003ccode\u003eThis product includes software developed by the University of\n *           Chicago, as Operator of Argonne National Laboratory.\u003c/code\u003e\n *     Alternately, this acknowledgment may appear in the software itself,\n *     if and wherever such third-party acknowledgments normally appear.\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eWARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED \"AS IS\"\n *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE\n *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND\n *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR\n *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES\n *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE\n *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY\n *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR\n *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF\n *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)\n *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION\n *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL\n *     BE CORRECTED.\u003c/strong\u003e\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eLIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT\n *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF\n *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,\n *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF\n *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF\n *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER\n *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT\n *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,\n *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE\n *     POSSIBILITY OF SUCH LOSS OR DAMAGES.\u003c/strong\u003e\u003c/li\u003e\n * \u003col\u003e\u003c/td\u003e\u003c/tr\u003e\n * \u003c/table\u003e\n * @version $Id$\n * @since 2.0\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "solvedCols"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": " Number of solved point. "
    },
    {
      "type": "field",
      "varNames": [
        "diagR"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": " Diagonal elements of the R matrix in the Q.R. decomposition. "
    },
    {
      "type": "field",
      "varNames": [
        "jacNorm"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": " Norms of the columns of the jacobian matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "beta"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": " Coefficients of the Householder transforms vectors. "
    },
    {
      "type": "field",
      "varNames": [
        "permutation"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": " Columns permutation array. "
    },
    {
      "type": "field",
      "varNames": [
        "rank"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": " Rank of the jacobian matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "lmPar"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": " Levenberg-Marquardt parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "lmDir"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": " Parameters evolution direction associated with lmPar. "
    },
    {
      "type": "field",
      "varNames": [
        "initialStepBoundFactor"
      ],
      "begin_line": 125,
      "end_line": 125,
      "comment": " Positive input variable used in determining the initial step bound. "
    },
    {
      "type": "field",
      "varNames": [
        "costRelativeTolerance"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": " Desired relative error in the sum of squares. "
    },
    {
      "type": "field",
      "varNames": [
        "parRelativeTolerance"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": "  Desired relative error in the approximate solution parameters. "
    },
    {
      "type": "field",
      "varNames": [
        "orthoTolerance"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": " Desired max cosine on the orthogonality between the function vector\n     * and the columns of the jacobian. "
    },
    {
      "type": "field",
      "varNames": [
        "qrRankingThreshold"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": " Threshold for QR ranking. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.LevenbergMarquardtOptimizer()",
      "begin_line": 150,
      "end_line": 152,
      "comment": "\n     * Build an optimizer for least squares problems with default values\n     * for all the tuning parameters (see the {@link\n     * #LevenbergMarquardtOptimizer(double,double,double,double,double)\n     * other contructor}.\n     * The default values for the algorithm settings are:\n     * \u003cul\u003e\n     *  \u003cli\u003eInitial step bound factor: 100\u003c/li\u003e\n     *  \u003cli\u003eCost relative tolerance: 1e-10\u003c/li\u003e\n     *  \u003cli\u003eParameters relative tolerance: 1e-10\u003c/li\u003e\n     *  \u003cli\u003eOrthogonality tolerance: 1e-10\u003c/li\u003e\n     *  \u003cli\u003eQR ranking threshold: {@link Precision#SAFE_MIN}\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 59)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.LevenbergMarquardtOptimizer(org.apache.commons.math.optimization.ConvergenceChecker\u003corg.apache.commons.math.optimization.VectorialPointValuePair\u003e)",
      "begin_line": 169,
      "end_line": 171,
      "comment": "\n     * Constructor that allows the specification of a custom convergence\n     * checker.\n     * Note that all the usual convergence checks will be \u003cem\u003edisabled\u003c/em\u003e.\n     * The default values for the algorithm settings are:\n     * \u003cul\u003e\n     *  \u003cli\u003eInitial step bound factor: 100\u003c/li\u003e\n     *  \u003cli\u003eCost relative tolerance: 1e-10\u003c/li\u003e\n     *  \u003cli\u003eParameters relative tolerance: 1e-10\u003c/li\u003e\n     *  \u003cli\u003eOrthogonality tolerance: 1e-10\u003c/li\u003e\n     *  \u003cli\u003eQR ranking threshold: {@link Precision#SAFE_MIN}\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param checker Convergence checker.\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 68)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.LevenbergMarquardtOptimizer(double, org.apache.commons.math.optimization.ConvergenceChecker\u003corg.apache.commons.math.optimization.VectorialPointValuePair\u003e, double, double, double, double)",
      "begin_line": 195,
      "end_line": 207,
      "comment": "\n     * Constructor that allows the specification of a custom convergence\n     * checker, in addition to the standard ones.\n     *\n     * @param initialStepBoundFactor Positive input variable used in\n     * determining the initial step bound. This bound is set to the\n     * product of initialStepBoundFactor and the euclidean norm of\n     * {@code diag * x} if non-zero, or else to {@code initialStepBoundFactor}\n     * itself. In most cases factor should lie in the interval\n     * {@code (0.1, 100.0)}. {@code 100} is a generally recommended value.\n     * @param checker Convergence checker.\n     * @param costRelativeTolerance Desired relative error in the sum of\n     * squares.\n     * @param parRelativeTolerance Desired relative error in the approximate\n     * solution parameters.\n     * @param orthoTolerance Desired max cosine on the orthogonality between\n     * the function vector and the columns of the Jacobian.\n     * @param threshold Desired threshold for QR ranking. If the squared norm\n     * of a column vector is smaller or equal to this threshold during QR\n     * decomposition, it is considered to be a zero vector and hence the rank\n     * of the matrix is reduced.\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 23)",
        "(line 202,col 9)-(line 202,col 61)",
        "(line 203,col 9)-(line 203,col 59)",
        "(line 204,col 9)-(line 204,col 57)",
        "(line 205,col 9)-(line 205,col 45)",
        "(line 206,col 9)-(line 206,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.LevenbergMarquardtOptimizer(double, double, double)",
      "begin_line": 227,
      "end_line": 233,
      "comment": "\n     * Build an optimizer for least squares problems with default values\n     * for some of the tuning parameters (see the {@link\n     * #LevenbergMarquardtOptimizer(double,double,double,double,double)\n     * other contructor}.\n     * The default values for the algorithm settings are:\n     * \u003cul\u003e\n     *  \u003cli\u003eInitial step bound factor}: 100\u003c/li\u003e\n     *  \u003cli\u003eQR ranking threshold}: {@link Precision#SAFE_MIN}\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param costRelativeTolerance Desired relative error in the sum of\n     * squares.\n     * @param parRelativeTolerance Desired relative error in the approximate\n     * solution parameters.\n     * @param orthoTolerance Desired max cosine on the orthogonality between\n     * the function vector and the columns of the Jacobian.\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 232,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.LevenbergMarquardtOptimizer(double, double, double, double, double)",
      "begin_line": 258,
      "end_line": 268,
      "comment": "\n     * The arguments control the behaviour of the default convergence checking\n     * procedure.\n     * Additional criteria can defined through the setting of a {@link\n     * ConvergenceChecker}.\n     *\n     * @param initialStepBoundFactor Positive input variable used in\n     * determining the initial step bound. This bound is set to the\n     * product of initialStepBoundFactor and the euclidean norm of\n     * {@code diag * x} if non-zero, or else to {@code initialStepBoundFactor}\n     * itself. In most cases factor should lie in the interval\n     * {@code (0.1, 100.0)}. {@code 100} is a generally recommended value.\n     * @param costRelativeTolerance Desired relative error in the sum of\n     * squares.\n     * @param parRelativeTolerance Desired relative error in the approximate\n     * solution parameters.\n     * @param orthoTolerance Desired max cosine on the orthogonality between\n     * the function vector and the columns of the Jacobian.\n     * @param threshold Desired threshold for QR ranking. If the squared norm\n     * of a column vector is smaller or equal to this threshold during QR\n     * decomposition, it is considered to be a zero vector and hence the rank\n     * of the matrix is reduced.\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 61)",
        "(line 264,col 9)-(line 264,col 59)",
        "(line 265,col 9)-(line 265,col 57)",
        "(line 266,col 9)-(line 266,col 45)",
        "(line 267,col 9)-(line 267,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.doOptimize()",
      "begin_line": 271,
      "end_line": 506,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 47)",
        "(line 275,col 9)-(line 275,col 39)",
        "(line 276,col 9)-(line 276,col 39)",
        "(line 277,col 9)-(line 277,col 39)",
        "(line 278,col 9)-(line 278,col 36)",
        "(line 279,col 9)-(line 279,col 39)",
        "(line 282,col 9)-(line 282,col 29)",
        "(line 283,col 9)-(line 283,col 29)",
        "(line 284,col 9)-(line 284,col 44)",
        "(line 285,col 9)-(line 285,col 44)",
        "(line 286,col 9)-(line 286,col 44)",
        "(line 287,col 9)-(line 287,col 44)",
        "(line 288,col 9)-(line 288,col 44)",
        "(line 289,col 9)-(line 289,col 44)",
        "(line 290,col 9)-(line 290,col 44)",
        "(line 291,col 9)-(line 291,col 44)",
        "(line 294,col 9)-(line 294,col 33)",
        "(line 297,col 9)-(line 297,col 18)",
        "(line 298,col 9)-(line 298,col 38)",
        "(line 299,col 9)-(line 299,col 88)",
        "(line 300,col 9)-(line 300,col 21)",
        "(line 301,col 9)-(line 301,col 92)",
        "(line 302,col 9)-(line 505,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter(double[], double, double[], double[], double[], double[])",
      "begin_line": 530,
      "end_line": 677,
      "comment": "\n     * Determine the Levenberg-Marquardt parameter.\n     * \u003cp\u003eThis implementation is a translation in Java of the MINPACK\n     * \u003ca href\u003d\"http://www.netlib.org/minpack/lmpar.f\"\u003elmpar\u003c/a\u003e\n     * routine.\u003c/p\u003e\n     * \u003cp\u003eThis method sets the lmPar and lmDir attributes.\u003c/p\u003e\n     * \u003cp\u003eThe authors of the original fortran function are:\u003c/p\u003e\n     * \u003cul\u003e\n     *   \u003cli\u003eArgonne National Laboratory. MINPACK project. March 1980\u003c/li\u003e\n     *   \u003cli\u003eBurton  S. Garbow\u003c/li\u003e\n     *   \u003cli\u003eKenneth E. Hillstrom\u003c/li\u003e\n     *   \u003cli\u003eJorge   J. More\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003cp\u003eLuc Maisonobe did the Java translation.\u003c/p\u003e\n     *\n     * @param qy array containing qTy\n     * @param delta upper bound on the euclidean norm of diagR * lmDir\n     * @param diag diagonal matrix\n     * @param work1 work array\n     * @param work2 work array\n     * @param work3 work array\n     ",
      "child_ranges": [
        "(line 535,col 9)-(line 537,col 9)",
        "(line 538,col 9)-(line 540,col 9)",
        "(line 541,col 9)-(line 548,col 9)",
        "(line 552,col 9)-(line 552,col 26)",
        "(line 553,col 9)-(line 558,col 9)",
        "(line 559,col 9)-(line 559,col 39)",
        "(line 560,col 9)-(line 560,col 35)",
        "(line 561,col 9)-(line 564,col 9)",
        "(line 569,col 9)-(line 569,col 20)",
        "(line 570,col 9)-(line 570,col 24)",
        "(line 571,col 9)-(line 588,col 9)",
        "(line 591,col 9)-(line 591,col 17)",
        "(line 592,col 9)-(line 600,col 9)",
        "(line 601,col 9)-(line 601,col 43)",
        "(line 602,col 9)-(line 602,col 36)",
        "(line 603,col 9)-(line 606,col 9)",
        "(line 610,col 9)-(line 610,col 62)",
        "(line 611,col 9)-(line 613,col 9)",
        "(line 615,col 9)-(line 676,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection(double[], double[], double[], double[])",
      "begin_line": 699,
      "end_line": 798,
      "comment": "\n     * Solve a*x \u003d b and d*x \u003d 0 in the least squares sense.\n     * \u003cp\u003eThis implementation is a translation in Java of the MINPACK\n     * \u003ca href\u003d\"http://www.netlib.org/minpack/qrsolv.f\"\u003eqrsolv\u003c/a\u003e\n     * routine.\u003c/p\u003e\n     * \u003cp\u003eThis method sets the lmDir and lmDiag attributes.\u003c/p\u003e\n     * \u003cp\u003eThe authors of the original fortran function are:\u003c/p\u003e\n     * \u003cul\u003e\n     *   \u003cli\u003eArgonne National Laboratory. MINPACK project. March 1980\u003c/li\u003e\n     *   \u003cli\u003eBurton  S. Garbow\u003c/li\u003e\n     *   \u003cli\u003eKenneth E. Hillstrom\u003c/li\u003e\n     *   \u003cli\u003eJorge   J. More\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003cp\u003eLuc Maisonobe did the Java translation.\u003c/p\u003e\n     *\n     * @param qy array containing qTy\n     * @param diag diagonal matrix\n     * @param lmDiag diagonal elements associated with lmDir\n     * @param work work array\n     ",
      "child_ranges": [
        "(line 704,col 9)-(line 711,col 9)",
        "(line 714,col 9)-(line 770,col 9)",
        "(line 774,col 9)-(line 774,col 31)",
        "(line 775,col 9)-(line 782,col 9)",
        "(line 783,col 9)-(line 792,col 9)",
        "(line 795,col 9)-(line 797,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.qrDecomposition()",
      "begin_line": 822,
      "end_line": 887,
      "comment": "\n     * Decompose a matrix A as A.P \u003d Q.R using Householder transforms.\n     * \u003cp\u003eAs suggested in the P. Lascaux and R. Theodor book\n     * \u003ci\u003eAnalyse num\u0026eacute;rique matricielle appliqu\u0026eacute;e \u0026agrave;\n     * l\u0027art de l\u0027ing\u0026eacute;nieur\u003c/i\u003e (Masson, 1986), instead of representing\n     * the Householder transforms with u\u003csub\u003ek\u003c/sub\u003e unit vectors such that:\n     * \u003cpre\u003e\n     * H\u003csub\u003ek\u003c/sub\u003e \u003d I - 2u\u003csub\u003ek\u003c/sub\u003e.u\u003csub\u003ek\u003c/sub\u003e\u003csup\u003et\u003c/sup\u003e\n     * \u003c/pre\u003e\n     * we use \u003csub\u003ek\u003c/sub\u003e non-unit vectors such that:\n     * \u003cpre\u003e\n     * H\u003csub\u003ek\u003c/sub\u003e \u003d I - beta\u003csub\u003ek\u003c/sub\u003ev\u003csub\u003ek\u003c/sub\u003e.v\u003csub\u003ek\u003c/sub\u003e\u003csup\u003et\u003c/sup\u003e\n     * \u003c/pre\u003e\n     * where v\u003csub\u003ek\u003c/sub\u003e \u003d a\u003csub\u003ek\u003c/sub\u003e - alpha\u003csub\u003ek\u003c/sub\u003e e\u003csub\u003ek\u003c/sub\u003e.\n     * The beta\u003csub\u003ek\u003c/sub\u003e coefficients are provided upon exit as recomputing\n     * them from the v\u003csub\u003ek\u003c/sub\u003e vectors would be costly.\u003c/p\u003e\n     * \u003cp\u003eThis decomposition handles rank deficient cases since the tranformations\n     * are performed in non-increasing columns norms order thanks to columns\n     * pivoting. The diagonal elements of the R matrix are therefore also in\n     * non-increasing absolute values order.\u003c/p\u003e\n     * @exception ConvergenceException if the decomposition cannot be performed\n     ",
      "child_ranges": [
        "(line 825,col 9)-(line 833,col 9)",
        "(line 836,col 9)-(line 885,col 9)",
        "(line 886,col 9)-(line 886,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.qTy(double[])",
      "begin_line": 894,
      "end_line": 906,
      "comment": "\n     * Compute the product Qt.y for some Q.R. decomposition.\n     *\n     * @param y vector to multiply (will be overwritten with the result)\n     ",
      "child_ranges": [
        "(line 895,col 9)-(line 905,col 9)"
      ]
    }
  ]
}