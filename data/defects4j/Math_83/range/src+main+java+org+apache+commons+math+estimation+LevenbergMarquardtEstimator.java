{
  "filepath": "/tmp/Math-83b/src/main/java/org/apache/commons/math/estimation/LevenbergMarquardtEstimator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LevenbergMarquardtEstimator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.AbstractEstimator",
        "java.io.Serializable"
      ],
      "begin_line": 101,
      "end_line": 875,
      "comment": " \n * This class solves a least squares problem.\n *\n * \u003cp\u003eThis implementation \u003cem\u003eshould\u003c/em\u003e work even for over-determined systems\n * (i.e. systems having more variables than equations). Over-determined systems\n * are solved by ignoring the variables which have the smallest impact according\n * to their jacobian column norm. Only the rank of the matrix and some loop bounds\n * are changed to implement this.\u003c/p\u003e\n *\n * \u003cp\u003eThe resolution engine is a simple translation of the MINPACK \u003ca\n * href\u003d\"http://www.netlib.org/minpack/lmder.f\"\u003elmder\u003c/a\u003e routine with minor\n * changes. The changes include the over-determined resolution and the Q.R.\n * decomposition which has been rewritten following the algorithm described in the\n * P. Lascaux and R. Theodor book \u003ci\u003eAnalyse num\u0026eacute;rique matricielle\n * appliqu\u0026eacute;e \u0026agrave; l\u0027art de l\u0027ing\u0026eacute;nieur\u003c/i\u003e, Masson 1986. The\n * redistribution policy for MINPACK is available \u003ca\n * href\u003d\"http://www.netlib.org/minpack/disclaimer\"\u003ehere\u003c/a\u003e, for convenience, it\n * is reproduced below.\u003c/p\u003e\n *\n * \u003ctable border\u003d\"0\" width\u003d\"80%\" cellpadding\u003d\"10\" align\u003d\"center\" bgcolor\u003d\"#E0E0E0\"\u003e\n * \u003ctr\u003e\u003ctd\u003e\n *    Minpack Copyright Notice (1999) University of Chicago.\n *    All rights reserved\n * \u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003e\n * Redistribution and use in source and binary forms, with or without\n * modification, are permitted provided that the following conditions\n * are met:\n * \u003col\u003e\n *  \u003cli\u003eRedistributions of source code must retain the above copyright\n *      notice, this list of conditions and the following disclaimer.\u003c/li\u003e\n * \u003cli\u003eRedistributions in binary form must reproduce the above\n *     copyright notice, this list of conditions and the following\n *     disclaimer in the documentation and/or other materials provided\n *     with the distribution.\u003c/li\u003e\n * \u003cli\u003eThe end-user documentation included with the redistribution, if any,\n *     must include the following acknowledgment:\n *     \u003ccode\u003eThis product includes software developed by the University of\n *           Chicago, as Operator of Argonne National Laboratory.\u003c/code\u003e\n *     Alternately, this acknowledgment may appear in the software itself,\n *     if and wherever such third-party acknowledgments normally appear.\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eWARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED \"AS IS\"\n *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE\n *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND\n *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR\n *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES\n *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE\n *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY\n *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR\n *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF\n *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)\n *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION\n *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL\n *     BE CORRECTED.\u003c/strong\u003e\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eLIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT\n *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF\n *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,\n *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF\n *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF\n *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER\n *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT\n *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,\n *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE\n *     POSSIBILITY OF SUCH LOSS OR DAMAGES.\u003c/strong\u003e\u003c/li\u003e\n * \u003col\u003e\u003c/td\u003e\u003c/tr\u003e\n * \u003c/table\u003e\n\n * @author Argonne National Laboratory. MINPACK project. March 1980 (original fortran)\n * @author Burton S. Garbow (original fortran)\n * @author Kenneth E. Hillstrom (original fortran)\n * @author Jorge J. More (original fortran)\n\n * @version $Revision$ $Date$\n * @since 1.2\n * @deprecated as of 2.0, everything in package org.apache.commons.math.estimation has\n * been deprecated and replaced by package org.apache.commons.math.optimization.general\n *\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimator.LevenbergMarquardtEstimator()",
      "begin_line": 116,
      "end_line": 127,
      "comment": " \n   * Build an estimator for least squares problems.\n   * \u003cp\u003eThe default values for the algorithm settings are:\n   *   \u003cul\u003e\n   *    \u003cli\u003e{@link #setInitialStepBoundFactor initial step bound factor}: 100.0\u003c/li\u003e\n   *    \u003cli\u003e{@link #setMaxCostEval maximal cost evaluations}: 1000\u003c/li\u003e\n   *    \u003cli\u003e{@link #setCostRelativeTolerance cost relative tolerance}: 1.0e-10\u003c/li\u003e\n   *    \u003cli\u003e{@link #setParRelativeTolerance parameters relative tolerance}: 1.0e-10\u003c/li\u003e\n   *    \u003cli\u003e{@link #setOrthoTolerance orthogonality tolerance}: 1.0e-10\u003c/li\u003e\n   *   \u003c/ul\u003e\n   * \u003c/p\u003e\n   ",
      "child_ranges": [
        "(line 119,col 5)-(line 119,col 25)",
        "(line 122,col 5)-(line 122,col 37)",
        "(line 123,col 5)-(line 123,col 38)",
        "(line 124,col 5)-(line 124,col 37)",
        "(line 125,col 5)-(line 125,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimator.setInitialStepBoundFactor(double)",
      "begin_line": 138,
      "end_line": 140,
      "comment": " \n   * Set the positive input variable used in determining the initial step bound.\n   * This bound is set to the product of initialStepBoundFactor and the euclidean norm of diag*x if nonzero,\n   * or else to initialStepBoundFactor itself. In most cases factor should lie\n   * in the interval (0.1, 100.0). 100.0 is a generally recommended value\n   * \n   * @param initialStepBoundFactor initial step bound factor\n   * @see #estimate\n   ",
      "child_ranges": [
        "(line 139,col 5)-(line 139,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimator.setCostRelativeTolerance(double)",
      "begin_line": 148,
      "end_line": 150,
      "comment": " \n   * Set the desired relative error in the sum of squares.\n   * \n   * @param costRelativeTolerance desired relative error in the sum of squares\n   * @see #estimate\n   ",
      "child_ranges": [
        "(line 149,col 5)-(line 149,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimator.setParRelativeTolerance(double)",
      "begin_line": 159,
      "end_line": 161,
      "comment": " \n   * Set the desired relative error in the approximate solution parameters.\n   * \n   * @param parRelativeTolerance desired relative error\n   * in the approximate solution parameters\n   * @see #estimate\n   ",
      "child_ranges": [
        "(line 160,col 5)-(line 160,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimator.setOrthoTolerance(double)",
      "begin_line": 170,
      "end_line": 172,
      "comment": " \n   * Set the desired max cosine on the orthogonality.\n   * \n   * @param orthoTolerance desired max cosine on the orthogonality\n   * between the function vector and the columns of the jacobian\n   * @see #estimate\n   ",
      "child_ranges": [
        "(line 171,col 5)-(line 171,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimator.estimate(org.apache.commons.math.estimation.EstimationProblem)",
      "begin_line": 202,
      "end_line": 423,
      "comment": " \n   * Solve an estimation problem using the Levenberg-Marquardt algorithm.\n   * \u003cp\u003eThe algorithm used is a modified Levenberg-Marquardt one, based\n   * on the MINPACK \u003ca href\u003d\"http://www.netlib.org/minpack/lmder.f\"\u003elmder\u003c/a\u003e\n   * routine. The algorithm settings must have been set up before this method\n   * is called with the {@link #setInitialStepBoundFactor},\n   * {@link #setMaxCostEval}, {@link #setCostRelativeTolerance},\n   * {@link #setParRelativeTolerance} and {@link #setOrthoTolerance} methods.\n   * If these methods have not been called, the default values set up by the\n   * {@link #LevenbergMarquardtEstimator() constructor} will be used.\u003c/p\u003e\n   * \u003cp\u003eThe authors of the original fortran function are:\u003c/p\u003e\n   * \u003cul\u003e\n   *   \u003cli\u003eArgonne National Laboratory. MINPACK project. March 1980\u003c/li\u003e\n   *   \u003cli\u003eBurton  S. Garbow\u003c/li\u003e\n   *   \u003cli\u003eKenneth E. Hillstrom\u003c/li\u003e\n   *   \u003cli\u003eJorge   J. More\u003c/li\u003e\n   *   \u003c/ul\u003e\n   * \u003cp\u003eLuc Maisonobe did the Java translation.\u003c/p\u003e\n   * \n   * @param problem estimation problem to solve\n   * @exception EstimationException if convergence cannot be\n   * reached with the specified algorithm settings or if there are more variables\n   * than equations\n   * @see #setInitialStepBoundFactor\n   * @see #setCostRelativeTolerance\n   * @see #setParRelativeTolerance\n   * @see #setOrthoTolerance\n   ",
      "child_ranges": [
        "(line 206,col 5)-(line 206,col 32)",
        "(line 209,col 5)-(line 209,col 39)",
        "(line 210,col 5)-(line 210,col 35)",
        "(line 211,col 5)-(line 211,col 35)",
        "(line 212,col 5)-(line 212,col 35)",
        "(line 213,col 5)-(line 213,col 32)",
        "(line 214,col 5)-(line 214,col 35)",
        "(line 217,col 5)-(line 217,col 36)",
        "(line 218,col 5)-(line 218,col 40)",
        "(line 219,col 5)-(line 219,col 40)",
        "(line 220,col 5)-(line 220,col 40)",
        "(line 221,col 5)-(line 221,col 40)",
        "(line 222,col 5)-(line 222,col 40)",
        "(line 223,col 5)-(line 223,col 40)",
        "(line 226,col 5)-(line 226,col 29)",
        "(line 229,col 5)-(line 229,col 14)",
        "(line 230,col 5)-(line 230,col 34)",
        "(line 231,col 5)-(line 421,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimator.determineLMParameter(double[], double, double[], double[], double[], double[])",
      "begin_line": 447,
      "end_line": 593,
      "comment": " \n   * Determine the Levenberg-Marquardt parameter.\n   * \u003cp\u003eThis implementation is a translation in Java of the MINPACK\n   * \u003ca href\u003d\"http://www.netlib.org/minpack/lmpar.f\"\u003elmpar\u003c/a\u003e\n   * routine.\u003c/p\u003e\n   * \u003cp\u003eThis method sets the lmPar and lmDir attributes.\u003c/p\u003e\n   * \u003cp\u003eThe authors of the original fortran function are:\u003c/p\u003e\n   * \u003cul\u003e\n   *   \u003cli\u003eArgonne National Laboratory. MINPACK project. March 1980\u003c/li\u003e\n   *   \u003cli\u003eBurton  S. Garbow\u003c/li\u003e\n   *   \u003cli\u003eKenneth E. Hillstrom\u003c/li\u003e\n   *   \u003cli\u003eJorge   J. More\u003c/li\u003e\n   * \u003c/ul\u003e\n   * \u003cp\u003eLuc Maisonobe did the Java translation.\u003c/p\u003e\n   * \n   * @param qy array containing qTy\n   * @param delta upper bound on the euclidean norm of diagR * lmDir\n   * @param diag diagonal matrix\n   * @param work1 work array\n   * @param work2 work array\n   * @param work3 work array\n   ",
      "child_ranges": [
        "(line 452,col 5)-(line 454,col 5)",
        "(line 455,col 5)-(line 457,col 5)",
        "(line 458,col 5)-(line 465,col 5)",
        "(line 469,col 5)-(line 469,col 22)",
        "(line 470,col 5)-(line 475,col 5)",
        "(line 476,col 5)-(line 476,col 31)",
        "(line 477,col 5)-(line 477,col 31)",
        "(line 478,col 5)-(line 481,col 5)",
        "(line 486,col 5)-(line 486,col 26)",
        "(line 487,col 5)-(line 504,col 5)",
        "(line 507,col 5)-(line 507,col 13)",
        "(line 508,col 5)-(line 516,col 5)",
        "(line 517,col 5)-(line 517,col 35)",
        "(line 518,col 5)-(line 518,col 32)",
        "(line 519,col 5)-(line 522,col 5)",
        "(line 526,col 5)-(line 526,col 50)",
        "(line 527,col 5)-(line 529,col 5)",
        "(line 531,col 5)-(line 592,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimator.determineLMDirection(double[], double[], double[], double[])",
      "begin_line": 615,
      "end_line": 717,
      "comment": " \n   * Solve a*x \u003d b and d*x \u003d 0 in the least squares sense.\n   * \u003cp\u003eThis implementation is a translation in Java of the MINPACK\n   * \u003ca href\u003d\"http://www.netlib.org/minpack/qrsolv.f\"\u003eqrsolv\u003c/a\u003e\n   * routine.\u003c/p\u003e\n   * \u003cp\u003eThis method sets the lmDir and lmDiag attributes.\u003c/p\u003e\n   * \u003cp\u003eThe authors of the original fortran function are:\u003c/p\u003e\n   * \u003cul\u003e\n   *   \u003cli\u003eArgonne National Laboratory. MINPACK project. March 1980\u003c/li\u003e\n   *   \u003cli\u003eBurton  S. Garbow\u003c/li\u003e\n   *   \u003cli\u003eKenneth E. Hillstrom\u003c/li\u003e\n   *   \u003cli\u003eJorge   J. More\u003c/li\u003e\n   * \u003c/ul\u003e\n   * \u003cp\u003eLuc Maisonobe did the Java translation.\u003c/p\u003e\n   * \n   * @param qy array containing qTy\n   * @param diag diagonal matrix\n   * @param lmDiag diagonal elements associated with lmDir\n   * @param work work array\n   ",
      "child_ranges": [
        "(line 620,col 5)-(line 627,col 5)",
        "(line 630,col 5)-(line 688,col 5)",
        "(line 692,col 5)-(line 692,col 27)",
        "(line 693,col 5)-(line 700,col 5)",
        "(line 701,col 5)-(line 710,col 5)",
        "(line 713,col 5)-(line 715,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimator.qrDecomposition()",
      "begin_line": 741,
      "end_line": 813,
      "comment": " \n   * Decompose a matrix A as A.P \u003d Q.R using Householder transforms.\n   * \u003cp\u003eAs suggested in the P. Lascaux and R. Theodor book\n   * \u003ci\u003eAnalyse num\u0026eacute;rique matricielle appliqu\u0026eacute;e \u0026agrave;\n   * l\u0027art de l\u0027ing\u0026eacute;nieur\u003c/i\u003e (Masson, 1986), instead of representing\n   * the Householder transforms with u\u003csub\u003ek\u003c/sub\u003e unit vectors such that:\n   * \u003cpre\u003e\n   * H\u003csub\u003ek\u003c/sub\u003e \u003d I - 2u\u003csub\u003ek\u003c/sub\u003e.u\u003csub\u003ek\u003c/sub\u003e\u003csup\u003et\u003c/sup\u003e\n   * \u003c/pre\u003e\n   * we use \u003csub\u003ek\u003c/sub\u003e non-unit vectors such that:\n   * \u003cpre\u003e\n   * H\u003csub\u003ek\u003c/sub\u003e \u003d I - beta\u003csub\u003ek\u003c/sub\u003ev\u003csub\u003ek\u003c/sub\u003e.v\u003csub\u003ek\u003c/sub\u003e\u003csup\u003et\u003c/sup\u003e\n   * \u003c/pre\u003e\n   * where v\u003csub\u003ek\u003c/sub\u003e \u003d a\u003csub\u003ek\u003c/sub\u003e - alpha\u003csub\u003ek\u003c/sub\u003e e\u003csub\u003ek\u003c/sub\u003e.\n   * The beta\u003csub\u003ek\u003c/sub\u003e coefficients are provided upon exit as recomputing\n   * them from the v\u003csub\u003ek\u003c/sub\u003e vectors would be costly.\u003c/p\u003e\n   * \u003cp\u003eThis decomposition handles rank deficient cases since the tranformations\n   * are performed in non-increasing columns norms order thanks to columns\n   * pivoting. The diagonal elements of the R matrix are therefore also in\n   * non-increasing absolute values order.\u003c/p\u003e\n   * @exception EstimationException if the decomposition cannot be performed\n   ",
      "child_ranges": [
        "(line 744,col 5)-(line 752,col 5)",
        "(line 755,col 5)-(line 809,col 5)",
        "(line 811,col 5)-(line 811,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimator.qTy(double[])",
      "begin_line": 820,
      "end_line": 833,
      "comment": " \n   * Compute the product Qt.y for some Q.R. decomposition.\n   * \n   * @param y vector to multiply (will be overwritten with the result)\n   ",
      "child_ranges": [
        "(line 821,col 5)-(line 832,col 5)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "solvedCols"
      ],
      "begin_line": 836,
      "end_line": 836,
      "comment": " Number of solved variables. "
    },
    {
      "type": "field",
      "varNames": [
        "diagR"
      ],
      "begin_line": 839,
      "end_line": 839,
      "comment": " Diagonal elements of the R matrix in the Q.R. decomposition. "
    },
    {
      "type": "field",
      "varNames": [
        "jacNorm"
      ],
      "begin_line": 842,
      "end_line": 842,
      "comment": " Norms of the columns of the jacobian matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "beta"
      ],
      "begin_line": 845,
      "end_line": 845,
      "comment": " Coefficients of the Householder transforms vectors. "
    },
    {
      "type": "field",
      "varNames": [
        "permutation"
      ],
      "begin_line": 848,
      "end_line": 848,
      "comment": " Columns permutation array. "
    },
    {
      "type": "field",
      "varNames": [
        "rank"
      ],
      "begin_line": 851,
      "end_line": 851,
      "comment": " Rank of the jacobian matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "lmPar"
      ],
      "begin_line": 854,
      "end_line": 854,
      "comment": " Levenberg-Marquardt parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "lmDir"
      ],
      "begin_line": 857,
      "end_line": 857,
      "comment": " Parameters evolution direction associated with lmPar. "
    },
    {
      "type": "field",
      "varNames": [
        "initialStepBoundFactor"
      ],
      "begin_line": 860,
      "end_line": 860,
      "comment": " Positive input variable used in determining the initial step bound. "
    },
    {
      "type": "field",
      "varNames": [
        "costRelativeTolerance"
      ],
      "begin_line": 863,
      "end_line": 863,
      "comment": " Desired relative error in the sum of squares. "
    },
    {
      "type": "field",
      "varNames": [
        "parRelativeTolerance"
      ],
      "begin_line": 866,
      "end_line": 866,
      "comment": "  Desired relative error in the approximate solution parameters. "
    },
    {
      "type": "field",
      "varNames": [
        "orthoTolerance"
      ],
      "begin_line": 870,
      "end_line": 870,
      "comment": " Desired max cosine on the orthogonality between the function vector\n   * and the columns of the jacobian. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 873,
      "end_line": 873,
      "comment": " Serializable version identifier "
    }
  ]
}