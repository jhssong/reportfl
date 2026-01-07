{
  "filepath": "/tmp/Math-63b/src/main/java/org/apache/commons/math/optimization/general/LevenbergMarquardtOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LevenbergMarquardtOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer"
      ],
      "begin_line": 108,
      "end_line": 872,
      "comment": "\n * This class solves a least squares problem using the Levenberg-Marquardt algorithm.\n *\n * \u003cp\u003eThis implementation \u003cem\u003eshould\u003c/em\u003e work even for over-determined systems\n * (i.e. systems having more point than equations). Over-determined systems\n * are solved by ignoring the point which have the smallest impact according\n * to their jacobian column norm. Only the rank of the matrix and some loop bounds\n * are changed to implement this.\u003c/p\u003e\n *\n * \u003cp\u003eThe resolution engine is a simple translation of the MINPACK \u003ca\n * href\u003d\"http://www.netlib.org/minpack/lmder.f\"\u003elmder\u003c/a\u003e routine with minor\n * changes. The changes include the over-determined resolution, the use of\n * inherited convergence checker and the Q.R. decomposition which has been\n * rewritten following the algorithm described in the\n * P. Lascaux and R. Theodor book \u003ci\u003eAnalyse num\u0026eacute;rique matricielle\n * appliqu\u0026eacute;e \u0026agrave; l\u0027art de l\u0027ing\u0026eacute;nieur\u003c/i\u003e, Masson 1986.\u003c/p\u003e\n * \u003cp\u003eThe authors of the original fortran version are:\n * \u003cul\u003e\n * \u003cli\u003eArgonne National Laboratory. MINPACK project. March 1980\u003c/li\u003e\n * \u003cli\u003eBurton S. Garbow\u003c/li\u003e\n * \u003cli\u003eKenneth E. Hillstrom\u003c/li\u003e\n * \u003cli\u003eJorge J. More\u003c/li\u003e\n * \u003c/ul\u003e\n * The redistribution policy for MINPACK is available \u003ca\n * href\u003d\"http://www.netlib.org/minpack/disclaimer\"\u003ehere\u003c/a\u003e, for convenience, it\n * is reproduced below.\u003c/p\u003e\n *\n * \u003ctable border\u003d\"0\" width\u003d\"80%\" cellpadding\u003d\"10\" align\u003d\"center\" bgcolor\u003d\"#E0E0E0\"\u003e\n * \u003ctr\u003e\u003ctd\u003e\n *    Minpack Copyright Notice (1999) University of Chicago.\n *    All rights reserved\n * \u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003e\n * Redistribution and use in source and binary forms, with or without\n * modification, are permitted provided that the following conditions\n * are met:\n * \u003col\u003e\n *  \u003cli\u003eRedistributions of source code must retain the above copyright\n *      notice, this list of conditions and the following disclaimer.\u003c/li\u003e\n * \u003cli\u003eRedistributions in binary form must reproduce the above\n *     copyright notice, this list of conditions and the following\n *     disclaimer in the documentation and/or other materials provided\n *     with the distribution.\u003c/li\u003e\n * \u003cli\u003eThe end-user documentation included with the redistribution, if any,\n *     must include the following acknowledgment:\n *     \u003ccode\u003eThis product includes software developed by the University of\n *           Chicago, as Operator of Argonne National Laboratory.\u003c/code\u003e\n *     Alternately, this acknowledgment may appear in the software itself,\n *     if and wherever such third-party acknowledgments normally appear.\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eWARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED \"AS IS\"\n *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE\n *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND\n *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR\n *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES\n *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE\n *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY\n *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR\n *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF\n *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)\n *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION\n *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL\n *     BE CORRECTED.\u003c/strong\u003e\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eLIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT\n *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF\n *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,\n *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF\n *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF\n *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER\n *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT\n *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,\n *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE\n *     POSSIBILITY OF SUCH LOSS OR DAMAGES.\u003c/strong\u003e\u003c/li\u003e\n * \u003col\u003e\u003c/td\u003e\u003c/tr\u003e\n * \u003c/table\u003e\n * @version $Revision$ $Date$\n * @since 2.0\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "solvedCols"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": " Number of solved point. "
    },
    {
      "type": "field",
      "varNames": [
        "diagR"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": " Diagonal elements of the R matrix in the Q.R. decomposition. "
    },
    {
      "type": "field",
      "varNames": [
        "jacNorm"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": " Norms of the columns of the jacobian matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "beta"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": " Coefficients of the Householder transforms vectors. "
    },
    {
      "type": "field",
      "varNames": [
        "permutation"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": " Columns permutation array. "
    },
    {
      "type": "field",
      "varNames": [
        "rank"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": " Rank of the jacobian matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "lmPar"
      ],
      "begin_line": 129,
      "end_line": 129,
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
      "begin_line": 135,
      "end_line": 135,
      "comment": " Positive input variable used in determining the initial step bound. "
    },
    {
      "type": "field",
      "varNames": [
        "costRelativeTolerance"
      ],
      "begin_line": 138,
      "end_line": 138,
      "comment": " Desired relative error in the sum of squares. "
    },
    {
      "type": "field",
      "varNames": [
        "parRelativeTolerance"
      ],
      "begin_line": 141,
      "end_line": 141,
      "comment": "  Desired relative error in the approximate solution parameters. "
    },
    {
      "type": "field",
      "varNames": [
        "orthoTolerance"
      ],
      "begin_line": 145,
      "end_line": 145,
      "comment": " Desired max cosine on the orthogonality between the function vector\n     * and the columns of the jacobian. "
    },
    {
      "type": "field",
      "varNames": [
        "qrRankingThreshold"
      ],
      "begin_line": 148,
      "end_line": 148,
      "comment": " Threshold for QR ranking. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.LevenbergMarquardtOptimizer()",
      "begin_line": 167,
      "end_line": 175,
      "comment": "\n     * Build an optimizer for least squares problems.\n     * \u003cp\u003eThe default values for the algorithm settings are:\n     *   \u003cul\u003e\n     *    \u003cli\u003e{@link #setConvergenceChecker(ConvergenceChecker) vectorial convergence checker}: null\u003c/li\u003e\n     *    \u003cli\u003e{@link #setInitialStepBoundFactor(double) initial step bound factor}: 100.0\u003c/li\u003e\n     *    \u003cli\u003e{@link #setCostRelativeTolerance(double) cost relative tolerance}: 1.0e-10\u003c/li\u003e\n     *    \u003cli\u003e{@link #setParRelativeTolerance(double) parameters relative tolerance}: 1.0e-10\u003c/li\u003e\n     *    \u003cli\u003e{@link #setOrthoTolerance(double) orthogonality tolerance}: 1.0e-10\u003c/li\u003e\n     *    \u003cli\u003e{@link #setQRRankingThreshold(double) QR ranking threshold}: {@link MathUtils#SAFE_MIN}\u003c/li\u003e\n     *   \u003c/ul\u003e\n     * \u003c/p\u003e\n     * \u003cp\u003eThese default values may be overridden after construction. If the {@link\n     * #setConvergenceChecker vectorial convergence checker} is set to a non-null value, it\n     * will be used instead of the {@link #setCostRelativeTolerance cost relative tolerance}\n     * and {@link #setParRelativeTolerance parameters relative tolerance} settings.\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 36)",
        "(line 170,col 9)-(line 170,col 41)",
        "(line 171,col 9)-(line 171,col 42)",
        "(line 172,col 9)-(line 172,col 41)",
        "(line 173,col 9)-(line 173,col 35)",
        "(line 174,col 9)-(line 174,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.setInitialStepBoundFactor(double)",
      "begin_line": 186,
      "end_line": 188,
      "comment": "\n     * Set the positive input variable used in determining the initial step bound.\n     * This bound is set to the product of initialStepBoundFactor and the euclidean\n     * norm of diag*x if nonzero, or else to initialStepBoundFactor itself. In most\n     * cases factor should lie in the interval (0.1, 100.0). 100.0 is a generally\n     * recommended value.\n     *\n     * @param initialStepBoundFactor initial step bound factor\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.setCostRelativeTolerance(double)",
      "begin_line": 196,
      "end_line": 198,
      "comment": "\n     * Set the desired relative error in the sum of squares.\n     * \u003cp\u003eThis setting is used only if the {@link #setConvergenceChecker vectorial\n     * convergence checker} is set to null.\u003c/p\u003e\n     * @param costRelativeTolerance desired relative error in the sum of squares\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.setParRelativeTolerance(double)",
      "begin_line": 207,
      "end_line": 209,
      "comment": "\n     * Set the desired relative error in the approximate solution parameters.\n     * \u003cp\u003eThis setting is used only if the {@link #setConvergenceChecker vectorial\n     * convergence checker} is set to null.\u003c/p\u003e\n     * @param parRelativeTolerance desired relative error\n     * in the approximate solution parameters\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.setOrthoTolerance(double)",
      "begin_line": 218,
      "end_line": 220,
      "comment": "\n     * Set the desired max cosine on the orthogonality.\n     * \u003cp\u003eThis setting is always used, regardless of the {@link #setConvergenceChecker\n     * vectorial convergence checker} being null or non-null.\u003c/p\u003e\n     * @param orthoTolerance desired max cosine on the orthogonality\n     * between the function vector and the columns of the jacobian\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.setQRRankingThreshold(double)",
      "begin_line": 231,
      "end_line": 233,
      "comment": "\n     * Set the desired threshold for QR ranking.\n     * \u003cp\u003e\n     * If the squared norm of a column vector is smaller or equal to this threshold\n     * during QR decomposition, it is considered to be a zero vector and hence the\n     * rank of the matrix is reduced.\n     * \u003c/p\u003e\n     * @param threshold threshold for QR ranking\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.doOptimize()",
      "begin_line": 236,
      "end_line": 471,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 47)",
        "(line 241,col 9)-(line 241,col 39)",
        "(line 242,col 9)-(line 242,col 39)",
        "(line 243,col 9)-(line 243,col 39)",
        "(line 244,col 9)-(line 244,col 36)",
        "(line 245,col 9)-(line 245,col 39)",
        "(line 248,col 9)-(line 248,col 29)",
        "(line 249,col 9)-(line 249,col 29)",
        "(line 250,col 9)-(line 250,col 44)",
        "(line 251,col 9)-(line 251,col 44)",
        "(line 252,col 9)-(line 252,col 44)",
        "(line 253,col 9)-(line 253,col 44)",
        "(line 254,col 9)-(line 254,col 44)",
        "(line 255,col 9)-(line 255,col 44)",
        "(line 256,col 9)-(line 256,col 44)",
        "(line 257,col 9)-(line 257,col 44)",
        "(line 260,col 9)-(line 260,col 33)",
        "(line 263,col 9)-(line 263,col 18)",
        "(line 264,col 9)-(line 264,col 38)",
        "(line 265,col 9)-(line 265,col 88)",
        "(line 266,col 9)-(line 266,col 21)",
        "(line 267,col 9)-(line 267,col 92)",
        "(line 268,col 9)-(line 470,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter(double[], double, double[], double[], double[], double[])",
      "begin_line": 495,
      "end_line": 642,
      "comment": "\n     * Determine the Levenberg-Marquardt parameter.\n     * \u003cp\u003eThis implementation is a translation in Java of the MINPACK\n     * \u003ca href\u003d\"http://www.netlib.org/minpack/lmpar.f\"\u003elmpar\u003c/a\u003e\n     * routine.\u003c/p\u003e\n     * \u003cp\u003eThis method sets the lmPar and lmDir attributes.\u003c/p\u003e\n     * \u003cp\u003eThe authors of the original fortran function are:\u003c/p\u003e\n     * \u003cul\u003e\n     *   \u003cli\u003eArgonne National Laboratory. MINPACK project. March 1980\u003c/li\u003e\n     *   \u003cli\u003eBurton  S. Garbow\u003c/li\u003e\n     *   \u003cli\u003eKenneth E. Hillstrom\u003c/li\u003e\n     *   \u003cli\u003eJorge   J. More\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003cp\u003eLuc Maisonobe did the Java translation.\u003c/p\u003e\n     *\n     * @param qy array containing qTy\n     * @param delta upper bound on the euclidean norm of diagR * lmDir\n     * @param diag diagonal matrix\n     * @param work1 work array\n     * @param work2 work array\n     * @param work3 work array\n     ",
      "child_ranges": [
        "(line 500,col 9)-(line 502,col 9)",
        "(line 503,col 9)-(line 505,col 9)",
        "(line 506,col 9)-(line 513,col 9)",
        "(line 517,col 9)-(line 517,col 26)",
        "(line 518,col 9)-(line 523,col 9)",
        "(line 524,col 9)-(line 524,col 39)",
        "(line 525,col 9)-(line 525,col 35)",
        "(line 526,col 9)-(line 529,col 9)",
        "(line 534,col 9)-(line 534,col 20)",
        "(line 535,col 9)-(line 535,col 24)",
        "(line 536,col 9)-(line 553,col 9)",
        "(line 556,col 9)-(line 556,col 17)",
        "(line 557,col 9)-(line 565,col 9)",
        "(line 566,col 9)-(line 566,col 43)",
        "(line 567,col 9)-(line 567,col 36)",
        "(line 568,col 9)-(line 571,col 9)",
        "(line 575,col 9)-(line 575,col 62)",
        "(line 576,col 9)-(line 578,col 9)",
        "(line 580,col 9)-(line 641,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection(double[], double[], double[], double[])",
      "begin_line": 664,
      "end_line": 763,
      "comment": "\n     * Solve a*x \u003d b and d*x \u003d 0 in the least squares sense.\n     * \u003cp\u003eThis implementation is a translation in Java of the MINPACK\n     * \u003ca href\u003d\"http://www.netlib.org/minpack/qrsolv.f\"\u003eqrsolv\u003c/a\u003e\n     * routine.\u003c/p\u003e\n     * \u003cp\u003eThis method sets the lmDir and lmDiag attributes.\u003c/p\u003e\n     * \u003cp\u003eThe authors of the original fortran function are:\u003c/p\u003e\n     * \u003cul\u003e\n     *   \u003cli\u003eArgonne National Laboratory. MINPACK project. March 1980\u003c/li\u003e\n     *   \u003cli\u003eBurton  S. Garbow\u003c/li\u003e\n     *   \u003cli\u003eKenneth E. Hillstrom\u003c/li\u003e\n     *   \u003cli\u003eJorge   J. More\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003cp\u003eLuc Maisonobe did the Java translation.\u003c/p\u003e\n     *\n     * @param qy array containing qTy\n     * @param diag diagonal matrix\n     * @param lmDiag diagonal elements associated with lmDir\n     * @param work work array\n     ",
      "child_ranges": [
        "(line 669,col 9)-(line 676,col 9)",
        "(line 679,col 9)-(line 735,col 9)",
        "(line 739,col 9)-(line 739,col 31)",
        "(line 740,col 9)-(line 747,col 9)",
        "(line 748,col 9)-(line 757,col 9)",
        "(line 760,col 9)-(line 762,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.qrDecomposition()",
      "begin_line": 787,
      "end_line": 852,
      "comment": "\n     * Decompose a matrix A as A.P \u003d Q.R using Householder transforms.\n     * \u003cp\u003eAs suggested in the P. Lascaux and R. Theodor book\n     * \u003ci\u003eAnalyse num\u0026eacute;rique matricielle appliqu\u0026eacute;e \u0026agrave;\n     * l\u0027art de l\u0027ing\u0026eacute;nieur\u003c/i\u003e (Masson, 1986), instead of representing\n     * the Householder transforms with u\u003csub\u003ek\u003c/sub\u003e unit vectors such that:\n     * \u003cpre\u003e\n     * H\u003csub\u003ek\u003c/sub\u003e \u003d I - 2u\u003csub\u003ek\u003c/sub\u003e.u\u003csub\u003ek\u003c/sub\u003e\u003csup\u003et\u003c/sup\u003e\n     * \u003c/pre\u003e\n     * we use \u003csub\u003ek\u003c/sub\u003e non-unit vectors such that:\n     * \u003cpre\u003e\n     * H\u003csub\u003ek\u003c/sub\u003e \u003d I - beta\u003csub\u003ek\u003c/sub\u003ev\u003csub\u003ek\u003c/sub\u003e.v\u003csub\u003ek\u003c/sub\u003e\u003csup\u003et\u003c/sup\u003e\n     * \u003c/pre\u003e\n     * where v\u003csub\u003ek\u003c/sub\u003e \u003d a\u003csub\u003ek\u003c/sub\u003e - alpha\u003csub\u003ek\u003c/sub\u003e e\u003csub\u003ek\u003c/sub\u003e.\n     * The beta\u003csub\u003ek\u003c/sub\u003e coefficients are provided upon exit as recomputing\n     * them from the v\u003csub\u003ek\u003c/sub\u003e vectors would be costly.\u003c/p\u003e\n     * \u003cp\u003eThis decomposition handles rank deficient cases since the tranformations\n     * are performed in non-increasing columns norms order thanks to columns\n     * pivoting. The diagonal elements of the R matrix are therefore also in\n     * non-increasing absolute values order.\u003c/p\u003e\n     * @exception ConvergenceException if the decomposition cannot be performed\n     ",
      "child_ranges": [
        "(line 790,col 9)-(line 798,col 9)",
        "(line 801,col 9)-(line 850,col 9)",
        "(line 851,col 9)-(line 851,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.qTy(double[])",
      "begin_line": 859,
      "end_line": 871,
      "comment": "\n     * Compute the product Qt.y for some Q.R. decomposition.\n     *\n     * @param y vector to multiply (will be overwritten with the result)\n     ",
      "child_ranges": [
        "(line 860,col 9)-(line 870,col 9)"
      ]
    }
  ]
}