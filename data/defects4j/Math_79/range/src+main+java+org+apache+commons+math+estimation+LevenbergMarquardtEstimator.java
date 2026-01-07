{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/estimation/LevenbergMarquardtEstimator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LevenbergMarquardtEstimator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.AbstractEstimator",
        "java.io.Serializable"
      ],
      "begin_line": 103,
      "end_line": 894,
      "comment": "\n * This class solves a least squares problem.\n *\n * \u003cp\u003eThis implementation \u003cem\u003eshould\u003c/em\u003e work even for over-determined systems\n * (i.e. systems having more variables than equations). Over-determined systems\n * are solved by ignoring the variables which have the smallest impact according\n * to their jacobian column norm. Only the rank of the matrix and some loop bounds\n * are changed to implement this.\u003c/p\u003e\n *\n * \u003cp\u003eThe resolution engine is a simple translation of the MINPACK \u003ca\n * href\u003d\"http://www.netlib.org/minpack/lmder.f\"\u003elmder\u003c/a\u003e routine with minor\n * changes. The changes include the over-determined resolution and the Q.R.\n * decomposition which has been rewritten following the algorithm described in the\n * P. Lascaux and R. Theodor book \u003ci\u003eAnalyse num\u0026eacute;rique matricielle\n * appliqu\u0026eacute;e \u0026agrave; l\u0027art de l\u0027ing\u0026eacute;nieur\u003c/i\u003e, Masson 1986.\u003c/p\u003e\n * \u003cp\u003eThe authors of the original fortran version are:\n * \u003cul\u003e\n * \u003cli\u003eArgonne National Laboratory. MINPACK project. March 1980\u003c/li\u003e\n * \u003cli\u003eBurton S. Garbow\u003c/li\u003e\n * \u003cli\u003eKenneth E. Hillstrom\u003c/li\u003e\n * \u003cli\u003eJorge J. More\u003c/li\u003e\n * \u003c/ul\u003e\n * The redistribution policy for MINPACK is available \u003ca\n * href\u003d\"http://www.netlib.org/minpack/disclaimer\"\u003ehere\u003c/a\u003e, for convenience, it\n * is reproduced below.\u003c/p\u003e\n *\n * \u003ctable border\u003d\"0\" width\u003d\"80%\" cellpadding\u003d\"10\" align\u003d\"center\" bgcolor\u003d\"#E0E0E0\"\u003e\n * \u003ctr\u003e\u003ctd\u003e\n *    Minpack Copyright Notice (1999) University of Chicago.\n *    All rights reserved\n * \u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003e\n * Redistribution and use in source and binary forms, with or without\n * modification, are permitted provided that the following conditions\n * are met:\n * \u003col\u003e\n *  \u003cli\u003eRedistributions of source code must retain the above copyright\n *      notice, this list of conditions and the following disclaimer.\u003c/li\u003e\n * \u003cli\u003eRedistributions in binary form must reproduce the above\n *     copyright notice, this list of conditions and the following\n *     disclaimer in the documentation and/or other materials provided\n *     with the distribution.\u003c/li\u003e\n * \u003cli\u003eThe end-user documentation included with the redistribution, if any,\n *     must include the following acknowledgment:\n *     \u003ccode\u003eThis product includes software developed by the University of\n *           Chicago, as Operator of Argonne National Laboratory.\u003c/code\u003e\n *     Alternately, this acknowledgment may appear in the software itself,\n *     if and wherever such third-party acknowledgments normally appear.\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eWARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED \"AS IS\"\n *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE\n *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND\n *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR\n *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES\n *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE\n *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY\n *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR\n *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF\n *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)\n *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION\n *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL\n *     BE CORRECTED.\u003c/strong\u003e\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eLIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT\n *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF\n *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,\n *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF\n *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF\n *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER\n *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT\n *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,\n *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE\n *     POSSIBILITY OF SUCH LOSS OR DAMAGES.\u003c/strong\u003e\u003c/li\u003e\n * \u003col\u003e\u003c/td\u003e\u003c/tr\u003e\n * \u003c/table\u003e\n\n * @version $Revision$ $Date$\n * @since 1.2\n * @deprecated as of 2.0, everything in package org.apache.commons.math.estimation has\n * been deprecated and replaced by package org.apache.commons.math.optimization.general\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": " Serializable version identifier "
    },
    {
      "type": "field",
      "varNames": [
        "solvedCols"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": " Number of solved variables. "
    },
    {
      "type": "field",
      "varNames": [
        "diagR"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": " Diagonal elements of the R matrix in the Q.R. decomposition. "
    },
    {
      "type": "field",
      "varNames": [
        "jacNorm"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": " Norms of the columns of the jacobian matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "beta"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": " Coefficients of the Householder transforms vectors. "
    },
    {
      "type": "field",
      "varNames": [
        "permutation"
      ],
      "begin_line": 122,
      "end_line": 122,
      "comment": " Columns permutation array. "
    },
    {
      "type": "field",
      "varNames": [
        "rank"
      ],
      "begin_line": 125,
      "end_line": 125,
      "comment": " Rank of the jacobian matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "lmPar"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": " Levenberg-Marquardt parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "lmDir"
      ],
      "begin_line": 131,
      "end_line": 131,
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
      "begin_line": 137,
      "end_line": 137,
      "comment": " Desired relative error in the sum of squares. "
    },
    {
      "type": "field",
      "varNames": [
        "parRelativeTolerance"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": "  Desired relative error in the approximate solution parameters. "
    },
    {
      "type": "field",
      "varNames": [
        "orthoTolerance"
      ],
      "begin_line": 144,
      "end_line": 144,
      "comment": " Desired max cosine on the orthogonality between the function vector\n     * and the columns of the jacobian. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimator.LevenbergMarquardtEstimator()",
      "begin_line": 158,
      "end_line": 169,
      "comment": "\n   * Build an estimator for least squares problems.\n   * \u003cp\u003eThe default values for the algorithm settings are:\n   *   \u003cul\u003e\n   *    \u003cli\u003e{@link #setInitialStepBoundFactor initial step bound factor}: 100.0\u003c/li\u003e\n   *    \u003cli\u003e{@link #setMaxCostEval maximal cost evaluations}: 1000\u003c/li\u003e\n   *    \u003cli\u003e{@link #setCostRelativeTolerance cost relative tolerance}: 1.0e-10\u003c/li\u003e\n   *    \u003cli\u003e{@link #setParRelativeTolerance parameters relative tolerance}: 1.0e-10\u003c/li\u003e\n   *    \u003cli\u003e{@link #setOrthoTolerance orthogonality tolerance}: 1.0e-10\u003c/li\u003e\n   *   \u003c/ul\u003e\n   * \u003c/p\u003e\n   ",
      "child_ranges": [
        "(line 161,col 5)-(line 161,col 25)",
        "(line 164,col 5)-(line 164,col 37)",
        "(line 165,col 5)-(line 165,col 38)",
        "(line 166,col 5)-(line 166,col 37)",
        "(line 167,col 5)-(line 167,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimator.setInitialStepBoundFactor(double)",
      "begin_line": 180,
      "end_line": 182,
      "comment": "\n   * Set the positive input variable used in determining the initial step bound.\n   * This bound is set to the product of initialStepBoundFactor and the euclidean norm of diag*x if nonzero,\n   * or else to initialStepBoundFactor itself. In most cases factor should lie\n   * in the interval (0.1, 100.0). 100.0 is a generally recommended value\n   *\n   * @param initialStepBoundFactor initial step bound factor\n   * @see #estimate\n   ",
      "child_ranges": [
        "(line 181,col 5)-(line 181,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimator.setCostRelativeTolerance(double)",
      "begin_line": 190,
      "end_line": 192,
      "comment": "\n   * Set the desired relative error in the sum of squares.\n   *\n   * @param costRelativeTolerance desired relative error in the sum of squares\n   * @see #estimate\n   ",
      "child_ranges": [
        "(line 191,col 5)-(line 191,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimator.setParRelativeTolerance(double)",
      "begin_line": 201,
      "end_line": 203,
      "comment": "\n   * Set the desired relative error in the approximate solution parameters.\n   *\n   * @param parRelativeTolerance desired relative error\n   * in the approximate solution parameters\n   * @see #estimate\n   ",
      "child_ranges": [
        "(line 202,col 5)-(line 202,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimator.setOrthoTolerance(double)",
      "begin_line": 212,
      "end_line": 214,
      "comment": "\n   * Set the desired max cosine on the orthogonality.\n   *\n   * @param orthoTolerance desired max cosine on the orthogonality\n   * between the function vector and the columns of the jacobian\n   * @see #estimate\n   ",
      "child_ranges": [
        "(line 213,col 5)-(line 213,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimator.estimate(org.apache.commons.math.estimation.EstimationProblem)",
      "begin_line": 244,
      "end_line": 470,
      "comment": "\n   * Solve an estimation problem using the Levenberg-Marquardt algorithm.\n   * \u003cp\u003eThe algorithm used is a modified Levenberg-Marquardt one, based\n   * on the MINPACK \u003ca href\u003d\"http://www.netlib.org/minpack/lmder.f\"\u003elmder\u003c/a\u003e\n   * routine. The algorithm settings must have been set up before this method\n   * is called with the {@link #setInitialStepBoundFactor},\n   * {@link #setMaxCostEval}, {@link #setCostRelativeTolerance},\n   * {@link #setParRelativeTolerance} and {@link #setOrthoTolerance} methods.\n   * If these methods have not been called, the default values set up by the\n   * {@link #LevenbergMarquardtEstimator() constructor} will be used.\u003c/p\u003e\n   * \u003cp\u003eThe authors of the original fortran function are:\u003c/p\u003e\n   * \u003cul\u003e\n   *   \u003cli\u003eArgonne National Laboratory. MINPACK project. March 1980\u003c/li\u003e\n   *   \u003cli\u003eBurton  S. Garbow\u003c/li\u003e\n   *   \u003cli\u003eKenneth E. Hillstrom\u003c/li\u003e\n   *   \u003cli\u003eJorge   J. More\u003c/li\u003e\n   *   \u003c/ul\u003e\n   * \u003cp\u003eLuc Maisonobe did the Java translation.\u003c/p\u003e\n   *\n   * @param problem estimation problem to solve\n   * @exception EstimationException if convergence cannot be\n   * reached with the specified algorithm settings or if there are more variables\n   * than equations\n   * @see #setInitialStepBoundFactor\n   * @see #setCostRelativeTolerance\n   * @see #setParRelativeTolerance\n   * @see #setOrthoTolerance\n   ",
      "child_ranges": [
        "(line 248,col 5)-(line 248,col 32)",
        "(line 251,col 5)-(line 251,col 39)",
        "(line 252,col 5)-(line 252,col 35)",
        "(line 253,col 5)-(line 253,col 35)",
        "(line 254,col 5)-(line 254,col 35)",
        "(line 255,col 5)-(line 255,col 32)",
        "(line 256,col 5)-(line 256,col 35)",
        "(line 259,col 5)-(line 259,col 25)",
        "(line 260,col 5)-(line 260,col 23)",
        "(line 261,col 5)-(line 261,col 40)",
        "(line 262,col 5)-(line 262,col 40)",
        "(line 263,col 5)-(line 263,col 40)",
        "(line 264,col 5)-(line 264,col 40)",
        "(line 265,col 5)-(line 265,col 40)",
        "(line 266,col 5)-(line 266,col 40)",
        "(line 269,col 5)-(line 269,col 29)",
        "(line 272,col 5)-(line 272,col 14)",
        "(line 273,col 5)-(line 273,col 34)",
        "(line 274,col 5)-(line 468,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimator.determineLMParameter(double[], double, double[], double[], double[], double[])",
      "begin_line": 494,
      "end_line": 647,
      "comment": "\n   * Determine the Levenberg-Marquardt parameter.\n   * \u003cp\u003eThis implementation is a translation in Java of the MINPACK\n   * \u003ca href\u003d\"http://www.netlib.org/minpack/lmpar.f\"\u003elmpar\u003c/a\u003e\n   * routine.\u003c/p\u003e\n   * \u003cp\u003eThis method sets the lmPar and lmDir attributes.\u003c/p\u003e\n   * \u003cp\u003eThe authors of the original fortran function are:\u003c/p\u003e\n   * \u003cul\u003e\n   *   \u003cli\u003eArgonne National Laboratory. MINPACK project. March 1980\u003c/li\u003e\n   *   \u003cli\u003eBurton  S. Garbow\u003c/li\u003e\n   *   \u003cli\u003eKenneth E. Hillstrom\u003c/li\u003e\n   *   \u003cli\u003eJorge   J. More\u003c/li\u003e\n   * \u003c/ul\u003e\n   * \u003cp\u003eLuc Maisonobe did the Java translation.\u003c/p\u003e\n   *\n   * @param qy array containing qTy\n   * @param delta upper bound on the euclidean norm of diagR * lmDir\n   * @param diag diagonal matrix\n   * @param work1 work array\n   * @param work2 work array\n   * @param work3 work array\n   ",
      "child_ranges": [
        "(line 499,col 5)-(line 501,col 5)",
        "(line 502,col 5)-(line 504,col 5)",
        "(line 505,col 5)-(line 514,col 5)",
        "(line 518,col 5)-(line 518,col 22)",
        "(line 519,col 5)-(line 524,col 5)",
        "(line 525,col 5)-(line 525,col 31)",
        "(line 526,col 5)-(line 526,col 31)",
        "(line 527,col 5)-(line 530,col 5)",
        "(line 535,col 5)-(line 535,col 16)",
        "(line 536,col 5)-(line 536,col 20)",
        "(line 537,col 5)-(line 556,col 5)",
        "(line 559,col 5)-(line 559,col 13)",
        "(line 560,col 5)-(line 570,col 5)",
        "(line 571,col 5)-(line 571,col 35)",
        "(line 572,col 5)-(line 572,col 32)",
        "(line 573,col 5)-(line 576,col 5)",
        "(line 580,col 5)-(line 580,col 50)",
        "(line 581,col 5)-(line 583,col 5)",
        "(line 585,col 5)-(line 646,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimator.determineLMDirection(double[], double[], double[], double[])",
      "begin_line": 669,
      "end_line": 772,
      "comment": "\n   * Solve a*x \u003d b and d*x \u003d 0 in the least squares sense.\n   * \u003cp\u003eThis implementation is a translation in Java of the MINPACK\n   * \u003ca href\u003d\"http://www.netlib.org/minpack/qrsolv.f\"\u003eqrsolv\u003c/a\u003e\n   * routine.\u003c/p\u003e\n   * \u003cp\u003eThis method sets the lmDir and lmDiag attributes.\u003c/p\u003e\n   * \u003cp\u003eThe authors of the original fortran function are:\u003c/p\u003e\n   * \u003cul\u003e\n   *   \u003cli\u003eArgonne National Laboratory. MINPACK project. March 1980\u003c/li\u003e\n   *   \u003cli\u003eBurton  S. Garbow\u003c/li\u003e\n   *   \u003cli\u003eKenneth E. Hillstrom\u003c/li\u003e\n   *   \u003cli\u003eJorge   J. More\u003c/li\u003e\n   * \u003c/ul\u003e\n   * \u003cp\u003eLuc Maisonobe did the Java translation.\u003c/p\u003e\n   *\n   * @param qy array containing qTy\n   * @param diag diagonal matrix\n   * @param lmDiag diagonal elements associated with lmDir\n   * @param work work array\n   ",
      "child_ranges": [
        "(line 674,col 5)-(line 681,col 5)",
        "(line 684,col 5)-(line 743,col 5)",
        "(line 747,col 5)-(line 747,col 27)",
        "(line 748,col 5)-(line 755,col 5)",
        "(line 756,col 5)-(line 765,col 5)",
        "(line 768,col 5)-(line 770,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimator.qrDecomposition()",
      "begin_line": 796,
      "end_line": 868,
      "comment": "\n   * Decompose a matrix A as A.P \u003d Q.R using Householder transforms.\n   * \u003cp\u003eAs suggested in the P. Lascaux and R. Theodor book\n   * \u003ci\u003eAnalyse num\u0026eacute;rique matricielle appliqu\u0026eacute;e \u0026agrave;\n   * l\u0027art de l\u0027ing\u0026eacute;nieur\u003c/i\u003e (Masson, 1986), instead of representing\n   * the Householder transforms with u\u003csub\u003ek\u003c/sub\u003e unit vectors such that:\n   * \u003cpre\u003e\n   * H\u003csub\u003ek\u003c/sub\u003e \u003d I - 2u\u003csub\u003ek\u003c/sub\u003e.u\u003csub\u003ek\u003c/sub\u003e\u003csup\u003et\u003c/sup\u003e\n   * \u003c/pre\u003e\n   * we use \u003csub\u003ek\u003c/sub\u003e non-unit vectors such that:\n   * \u003cpre\u003e\n   * H\u003csub\u003ek\u003c/sub\u003e \u003d I - beta\u003csub\u003ek\u003c/sub\u003ev\u003csub\u003ek\u003c/sub\u003e.v\u003csub\u003ek\u003c/sub\u003e\u003csup\u003et\u003c/sup\u003e\n   * \u003c/pre\u003e\n   * where v\u003csub\u003ek\u003c/sub\u003e \u003d a\u003csub\u003ek\u003c/sub\u003e - alpha\u003csub\u003ek\u003c/sub\u003e e\u003csub\u003ek\u003c/sub\u003e.\n   * The beta\u003csub\u003ek\u003c/sub\u003e coefficients are provided upon exit as recomputing\n   * them from the v\u003csub\u003ek\u003c/sub\u003e vectors would be costly.\u003c/p\u003e\n   * \u003cp\u003eThis decomposition handles rank deficient cases since the tranformations\n   * are performed in non-increasing columns norms order thanks to columns\n   * pivoting. The diagonal elements of the R matrix are therefore also in\n   * non-increasing absolute values order.\u003c/p\u003e\n   * @exception EstimationException if the decomposition cannot be performed\n   ",
      "child_ranges": [
        "(line 799,col 5)-(line 807,col 5)",
        "(line 810,col 5)-(line 864,col 5)",
        "(line 866,col 5)-(line 866,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimator.qTy(double[])",
      "begin_line": 875,
      "end_line": 892,
      "comment": "\n   * Compute the product Qt.y for some Q.R. decomposition.\n   *\n   * @param y vector to multiply (will be overwritten with the result)\n   ",
      "child_ranges": [
        "(line 876,col 5)-(line 891,col 5)"
      ]
    }
  ]
}