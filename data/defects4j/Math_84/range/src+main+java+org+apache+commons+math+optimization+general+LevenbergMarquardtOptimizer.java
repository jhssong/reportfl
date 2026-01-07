{
  "filepath": "/tmp/Math-84b/src/main/java/org/apache/commons/math/optimization/general/LevenbergMarquardtOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LevenbergMarquardtOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.AbstractLeastSquaresOptimizer"
      ],
      "begin_line": 102,
      "end_line": 838,
      "comment": " \n * This class solves a least squares problem using the Levenberg-Marquardt algorithm.\n *\n * \u003cp\u003eThis implementation \u003cem\u003eshould\u003c/em\u003e work even for over-determined systems\n * (i.e. systems having more point than equations). Over-determined systems\n * are solved by ignoring the point which have the smallest impact according\n * to their jacobian column norm. Only the rank of the matrix and some loop bounds\n * are changed to implement this.\u003c/p\u003e\n *\n * \u003cp\u003eThe resolution engine is a simple translation of the MINPACK \u003ca\n * href\u003d\"http://www.netlib.org/minpack/lmder.f\"\u003elmder\u003c/a\u003e routine with minor\n * changes. The changes include the over-determined resolution and the Q.R.\n * decomposition which has been rewritten following the algorithm described in the\n * P. Lascaux and R. Theodor book \u003ci\u003eAnalyse num\u0026eacute;rique matricielle\n * appliqu\u0026eacute;e \u0026agrave; l\u0027art de l\u0027ing\u0026eacute;nieur\u003c/i\u003e, Masson 1986. The\n * redistribution policy for MINPACK is available \u003ca\n * href\u003d\"http://www.netlib.org/minpack/disclaimer\"\u003ehere\u003c/a\u003e, for convenience, it\n * is reproduced below.\u003c/p\u003e\n *\n * \u003ctable border\u003d\"0\" width\u003d\"80%\" cellpadding\u003d\"10\" align\u003d\"center\" bgcolor\u003d\"#E0E0E0\"\u003e\n * \u003ctr\u003e\u003ctd\u003e\n *    Minpack Copyright Notice (1999) University of Chicago.\n *    All rights reserved\n * \u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003e\n * Redistribution and use in source and binary forms, with or without\n * modification, are permitted provided that the following conditions\n * are met:\n * \u003col\u003e\n *  \u003cli\u003eRedistributions of source code must retain the above copyright\n *      notice, this list of conditions and the following disclaimer.\u003c/li\u003e\n * \u003cli\u003eRedistributions in binary form must reproduce the above\n *     copyright notice, this list of conditions and the following\n *     disclaimer in the documentation and/or other materials provided\n *     with the distribution.\u003c/li\u003e\n * \u003cli\u003eThe end-user documentation included with the redistribution, if any,\n *     must include the following acknowledgment:\n *     \u003ccode\u003eThis product includes software developed by the University of\n *           Chicago, as Operator of Argonne National Laboratory.\u003c/code\u003e\n *     Alternately, this acknowledgment may appear in the software itself,\n *     if and wherever such third-party acknowledgments normally appear.\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eWARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED \"AS IS\"\n *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE\n *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND\n *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR\n *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES\n *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE\n *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY\n *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR\n *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF\n *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)\n *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION\n *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL\n *     BE CORRECTED.\u003c/strong\u003e\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eLIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT\n *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF\n *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,\n *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF\n *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF\n *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER\n *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT\n *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,\n *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE\n *     POSSIBILITY OF SUCH LOSS OR DAMAGES.\u003c/strong\u003e\u003c/li\u003e\n * \u003col\u003e\u003c/td\u003e\u003c/tr\u003e\n * \u003c/table\u003e\n\n * @author Argonne National Laboratory. MINPACK project. March 1980 (original fortran)\n * @author Burton S. Garbow (original fortran)\n * @author Kenneth E. Hillstrom (original fortran)\n * @author Jorge J. More (original fortran)\n\n * @version $Revision$ $Date$\n * @since 2.0\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "solvedCols"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": " Number of solved point. "
    },
    {
      "type": "field",
      "varNames": [
        "diagR"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": " Diagonal elements of the R matrix in the Q.R. decomposition. "
    },
    {
      "type": "field",
      "varNames": [
        "jacNorm"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": " Norms of the columns of the jacobian matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "beta"
      ],
      "begin_line": 114,
      "end_line": 114,
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
      "begin_line": 120,
      "end_line": 120,
      "comment": " Rank of the jacobian matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "lmPar"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": " Levenberg-Marquardt parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "lmDir"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": " Parameters evolution direction associated with lmPar. "
    },
    {
      "type": "field",
      "varNames": [
        "initialStepBoundFactor"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": " Positive input variable used in determining the initial step bound. "
    },
    {
      "type": "field",
      "varNames": [
        "costRelativeTolerance"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": " Desired relative error in the sum of squares. "
    },
    {
      "type": "field",
      "varNames": [
        "parRelativeTolerance"
      ],
      "begin_line": 135,
      "end_line": 135,
      "comment": "  Desired relative error in the approximate solution parameters. "
    },
    {
      "type": "field",
      "varNames": [
        "orthoTolerance"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": " Desired max cosine on the orthogonality between the function vector\n     * and the columns of the jacobian. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.LevenbergMarquardtOptimizer()",
      "begin_line": 153,
      "end_line": 164,
      "comment": " \n     * Build an optimizer for least squares problems.\n     * \u003cp\u003eThe default values for the algorithm settings are:\n     *   \u003cul\u003e\n     *    \u003cli\u003e{@link #setInitialStepBoundFactor initial step bound factor}: 100.0\u003c/li\u003e\n     *    \u003cli\u003e{@link #setMaxIterations maximal iterations}: 1000\u003c/li\u003e\n     *    \u003cli\u003e{@link #setCostRelativeTolerance cost relative tolerance}: 1.0e-10\u003c/li\u003e\n     *    \u003cli\u003e{@link #setParRelativeTolerance parameters relative tolerance}: 1.0e-10\u003c/li\u003e\n     *    \u003cli\u003e{@link #setOrthoTolerance orthogonality tolerance}: 1.0e-10\u003c/li\u003e\n     *   \u003c/ul\u003e\n     * \u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 31)",
        "(line 159,col 9)-(line 159,col 41)",
        "(line 160,col 9)-(line 160,col 42)",
        "(line 161,col 9)-(line 161,col 41)",
        "(line 162,col 9)-(line 162,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.setInitialStepBoundFactor(double)",
      "begin_line": 175,
      "end_line": 177,
      "comment": " \n     * Set the positive input variable used in determining the initial step bound.\n     * This bound is set to the product of initialStepBoundFactor and the euclidean\n     * norm of diag*x if nonzero, or else to initialStepBoundFactor itself. In most\n     * cases factor should lie in the interval (0.1, 100.0). 100.0 is a generally\n     * recommended value.\n     *\n     * @param initialStepBoundFactor initial step bound factor\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.setCostRelativeTolerance(double)",
      "begin_line": 184,
      "end_line": 186,
      "comment": " \n     * Set the desired relative error in the sum of squares.\n     * \n     * @param costRelativeTolerance desired relative error in the sum of squares\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.setParRelativeTolerance(double)",
      "begin_line": 194,
      "end_line": 196,
      "comment": " \n     * Set the desired relative error in the approximate solution parameters.\n     * \n     * @param parRelativeTolerance desired relative error\n     * in the approximate solution parameters\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.setOrthoTolerance(double)",
      "begin_line": 204,
      "end_line": 206,
      "comment": " \n     * Set the desired max cosine on the orthogonality.\n     * \n     * @param orthoTolerance desired max cosine on the orthogonality\n     * between the function vector and the columns of the jacobian\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.doOptimize()",
      "begin_line": 209,
      "end_line": 431,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 43)",
        "(line 215,col 9)-(line 215,col 39)",
        "(line 216,col 9)-(line 216,col 39)",
        "(line 217,col 9)-(line 217,col 39)",
        "(line 218,col 9)-(line 218,col 36)",
        "(line 219,col 9)-(line 219,col 39)",
        "(line 222,col 9)-(line 222,col 40)",
        "(line 223,col 9)-(line 223,col 44)",
        "(line 224,col 9)-(line 224,col 44)",
        "(line 225,col 9)-(line 225,col 44)",
        "(line 226,col 9)-(line 226,col 44)",
        "(line 227,col 9)-(line 227,col 44)",
        "(line 228,col 9)-(line 228,col 44)",
        "(line 231,col 9)-(line 231,col 33)",
        "(line 234,col 9)-(line 234,col 18)",
        "(line 235,col 9)-(line 235,col 38)",
        "(line 236,col 9)-(line 429,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMParameter(double[], double, double[], double[], double[], double[])",
      "begin_line": 455,
      "end_line": 601,
      "comment": " \n     * Determine the Levenberg-Marquardt parameter.\n     * \u003cp\u003eThis implementation is a translation in Java of the MINPACK\n     * \u003ca href\u003d\"http://www.netlib.org/minpack/lmpar.f\"\u003elmpar\u003c/a\u003e\n     * routine.\u003c/p\u003e\n     * \u003cp\u003eThis method sets the lmPar and lmDir attributes.\u003c/p\u003e\n     * \u003cp\u003eThe authors of the original fortran function are:\u003c/p\u003e\n     * \u003cul\u003e\n     *   \u003cli\u003eArgonne National Laboratory. MINPACK project. March 1980\u003c/li\u003e\n     *   \u003cli\u003eBurton  S. Garbow\u003c/li\u003e\n     *   \u003cli\u003eKenneth E. Hillstrom\u003c/li\u003e\n     *   \u003cli\u003eJorge   J. More\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003cp\u003eLuc Maisonobe did the Java translation.\u003c/p\u003e\n     * \n     * @param qy array containing qTy\n     * @param delta upper bound on the euclidean norm of diagR * lmDir\n     * @param diag diagonal matrix\n     * @param work1 work array\n     * @param work2 work array\n     * @param work3 work array\n     ",
      "child_ranges": [
        "(line 460,col 9)-(line 462,col 9)",
        "(line 463,col 9)-(line 465,col 9)",
        "(line 466,col 9)-(line 473,col 9)",
        "(line 477,col 9)-(line 477,col 26)",
        "(line 478,col 9)-(line 483,col 9)",
        "(line 484,col 9)-(line 484,col 35)",
        "(line 485,col 9)-(line 485,col 35)",
        "(line 486,col 9)-(line 489,col 9)",
        "(line 494,col 9)-(line 494,col 30)",
        "(line 495,col 9)-(line 512,col 9)",
        "(line 515,col 9)-(line 515,col 17)",
        "(line 516,col 9)-(line 524,col 9)",
        "(line 525,col 9)-(line 525,col 39)",
        "(line 526,col 9)-(line 526,col 36)",
        "(line 527,col 9)-(line 530,col 9)",
        "(line 534,col 9)-(line 534,col 54)",
        "(line 535,col 9)-(line 537,col 9)",
        "(line 539,col 9)-(line 600,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.determineLMDirection(double[], double[], double[], double[])",
      "begin_line": 623,
      "end_line": 724,
      "comment": " \n     * Solve a*x \u003d b and d*x \u003d 0 in the least squares sense.\n     * \u003cp\u003eThis implementation is a translation in Java of the MINPACK\n     * \u003ca href\u003d\"http://www.netlib.org/minpack/qrsolv.f\"\u003eqrsolv\u003c/a\u003e\n     * routine.\u003c/p\u003e\n     * \u003cp\u003eThis method sets the lmDir and lmDiag attributes.\u003c/p\u003e\n     * \u003cp\u003eThe authors of the original fortran function are:\u003c/p\u003e\n     * \u003cul\u003e\n     *   \u003cli\u003eArgonne National Laboratory. MINPACK project. March 1980\u003c/li\u003e\n     *   \u003cli\u003eBurton  S. Garbow\u003c/li\u003e\n     *   \u003cli\u003eKenneth E. Hillstrom\u003c/li\u003e\n     *   \u003cli\u003eJorge   J. More\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003cp\u003eLuc Maisonobe did the Java translation.\u003c/p\u003e\n     * \n     * @param qy array containing qTy\n     * @param diag diagonal matrix\n     * @param lmDiag diagonal elements associated with lmDir\n     * @param work work array\n     ",
      "child_ranges": [
        "(line 628,col 9)-(line 635,col 9)",
        "(line 638,col 9)-(line 695,col 9)",
        "(line 699,col 9)-(line 699,col 31)",
        "(line 700,col 9)-(line 707,col 9)",
        "(line 708,col 9)-(line 717,col 9)",
        "(line 720,col 9)-(line 722,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.qrDecomposition()",
      "begin_line": 748,
      "end_line": 817,
      "comment": " \n     * Decompose a matrix A as A.P \u003d Q.R using Householder transforms.\n     * \u003cp\u003eAs suggested in the P. Lascaux and R. Theodor book\n     * \u003ci\u003eAnalyse num\u0026eacute;rique matricielle appliqu\u0026eacute;e \u0026agrave;\n     * l\u0027art de l\u0027ing\u0026eacute;nieur\u003c/i\u003e (Masson, 1986), instead of representing\n     * the Householder transforms with u\u003csub\u003ek\u003c/sub\u003e unit vectors such that:\n     * \u003cpre\u003e\n     * H\u003csub\u003ek\u003c/sub\u003e \u003d I - 2u\u003csub\u003ek\u003c/sub\u003e.u\u003csub\u003ek\u003c/sub\u003e\u003csup\u003et\u003c/sup\u003e\n     * \u003c/pre\u003e\n     * we use \u003csub\u003ek\u003c/sub\u003e non-unit vectors such that:\n     * \u003cpre\u003e\n     * H\u003csub\u003ek\u003c/sub\u003e \u003d I - beta\u003csub\u003ek\u003c/sub\u003ev\u003csub\u003ek\u003c/sub\u003e.v\u003csub\u003ek\u003c/sub\u003e\u003csup\u003et\u003c/sup\u003e\n     * \u003c/pre\u003e\n     * where v\u003csub\u003ek\u003c/sub\u003e \u003d a\u003csub\u003ek\u003c/sub\u003e - alpha\u003csub\u003ek\u003c/sub\u003e e\u003csub\u003ek\u003c/sub\u003e.\n     * The beta\u003csub\u003ek\u003c/sub\u003e coefficients are provided upon exit as recomputing\n     * them from the v\u003csub\u003ek\u003c/sub\u003e vectors would be costly.\u003c/p\u003e\n     * \u003cp\u003eThis decomposition handles rank deficient cases since the tranformations\n     * are performed in non-increasing columns norms order thanks to columns\n     * pivoting. The diagonal elements of the R matrix are therefore also in\n     * non-increasing absolute values order.\u003c/p\u003e\n     * @exception OptimizationException if the decomposition cannot be performed\n     ",
      "child_ranges": [
        "(line 751,col 9)-(line 759,col 9)",
        "(line 762,col 9)-(line 813,col 9)",
        "(line 815,col 9)-(line 815,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer.qTy(double[])",
      "begin_line": 824,
      "end_line": 836,
      "comment": " \n     * Compute the product Qt.y for some Q.R. decomposition.\n     * \n     * @param y vector to multiply (will be overwritten with the result)\n     ",
      "child_ranges": [
        "(line 825,col 9)-(line 835,col 9)"
      ]
    }
  ]
}