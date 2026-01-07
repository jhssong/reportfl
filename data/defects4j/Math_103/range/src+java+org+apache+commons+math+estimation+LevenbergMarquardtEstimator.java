{
  "filepath": "/tmp/Math-103b/src/java/org/apache/commons/math/estimation/LevenbergMarquardtEstimator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LevenbergMarquardtEstimator",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable",
        "org.apache.commons.math.estimation.Estimator"
      ],
      "begin_line": 95,
      "end_line": 1000,
      "comment": " \n * This class solves a least squares problem.\n *\n * \u003cp\u003eThis implementation \u003cem\u003eshould\u003c/em\u003e work even for over-determined systems\n * (i.e. systems having more variables than equations). Over-determined systems\n * are solved by ignoring the variables which have the smallest impact according\n * to their jacobian column norm. Only the rank of the matrix and some loop bounds\n * are changed to implement this. This feature has undergone only basic testing\n * for now and should still be considered experimental.\u003c/p\u003e\n *\n * \u003cp\u003eThe resolution engine is a simple translation of the MINPACK \u003ca\n * href\u003d\"http://www.netlib.org/minpack/lmder.f\"\u003elmder\u003c/a\u003e routine with minor\n * changes. The changes include the over-determined resolution and the Q.R.\n * decomposition which has been rewritten following the algorithm described in the\n * P. Lascaux and R. Theodor book \u003ci\u003eAnalyse num\u0026eacute;rique matricielle\n * appliqu\u0026eacute;e \u0026agrave; l\u0027art de l\u0027ing\u0026eacute;nieur\u003c/i\u003e, Masson 1986. The\n * redistribution policy for MINPACK is available \u003ca\n * href\u003d\"http://www.netlib.org/minpack/disclaimer\"\u003ehere\u003c/a\u003e, for convenience, it\n * is reproduced below.\u003c/p\u003e\n *\n * \u003ctable border\u003d\"0\" width\u003d\"80%\" cellpadding\u003d\"10\" align\u003d\"center\" bgcolor\u003d\"#E0E0E0\"\u003e\n * \u003ctr\u003e\u003ctd\u003e\n *    Minpack Copyright Notice (1999) University of Chicago.\n *    All rights reserved\n * \u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003e\n * Redistribution and use in source and binary forms, with or without\n * modification, are permitted provided that the following conditions\n * are met:\n * \u003col\u003e\n *  \u003cli\u003eRedistributions of source code must retain the above copyright\n *      notice, this list of conditions and the following disclaimer.\u003c/li\u003e\n * \u003cli\u003eRedistributions in binary form must reproduce the above\n *     copyright notice, this list of conditions and the following\n *     disclaimer in the documentation and/or other materials provided\n *     with the distribution.\u003c/li\u003e\n * \u003cli\u003eThe end-user documentation included with the redistribution, if any,\n *     must include the following acknowledgment:\n *     \u003ccode\u003eThis product includes software developed by the University of\n *           Chicago, as Operator of Argonne National Laboratory.\u003c/code\u003e\n *     Alternately, this acknowledgment may appear in the software itself,\n *     if and wherever such third-party acknowledgments normally appear.\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eWARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED \"AS IS\"\n *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE\n *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND\n *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR\n *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES\n *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE\n *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY\n *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR\n *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF\n *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)\n *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION\n *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL\n *     BE CORRECTED.\u003c/strong\u003e\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eLIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT\n *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF\n *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,\n *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF\n *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF\n *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER\n *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT\n *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,\n *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE\n *     POSSIBILITY OF SUCH LOSS OR DAMAGES.\u003c/strong\u003e\u003c/li\u003e\n * \u003col\u003e\u003c/td\u003e\u003c/tr\u003e\n * \u003c/table\u003e\n\n * @author Argonne National Laboratory. MINPACK project. March 1980 (original fortran)\n * @author Burton S. Garbow (original fortran)\n * @author Kenneth E. Hillstrom (original fortran)\n * @author Jorge J. More (original fortran)\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimator.LevenbergMarquardtEstimator()",
      "begin_line": 109,
      "end_line": 116,
      "comment": " \n   * Build an estimator for least squares problems.\n   * \u003cp\u003eThe default values for the algorithm settings are:\n   *   \u003cul\u003e\n   *    \u003cli\u003e{@link #setInitialStepBoundFactor initial step bound factor}: 100.0\u003c/li\u003e\n   *    \u003cli\u003e{@link #setMaxCostEval maximal cost evaluations}: 1000\u003c/li\u003e\n   *    \u003cli\u003e{@link #setCostRelativeTolerance cost relative tolerance}: 1.0e-10\u003c/li\u003e\n   *    \u003cli\u003e{@link #setParRelativeTolerance parameters relative tolerance}: 1.0e-10\u003c/li\u003e\n   *    \u003cli\u003e{@link #setOrthoTolerance orthogonality tolerance}: 1.0e-10\u003c/li\u003e\n   *   \u003c/ul\u003e\n   * \u003c/p\u003e\n   ",
      "child_ranges": [
        "(line 111,col 5)-(line 111,col 37)",
        "(line 112,col 5)-(line 112,col 25)",
        "(line 113,col 5)-(line 113,col 38)",
        "(line 114,col 5)-(line 114,col 37)",
        "(line 115,col 5)-(line 115,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimator.setInitialStepBoundFactor(double)",
      "begin_line": 127,
      "end_line": 129,
      "comment": " \n   * Set the positive input variable used in determining the initial step bound.\n   * This bound is set to the product of initialStepBoundFactor and the euclidean norm of diag*x if nonzero,\n   * or else to initialStepBoundFactor itself. In most cases factor should lie\n   * in the interval (0.1, 100.0). 100.0 is a generally recommended value\n   * \n   * @param initialStepBoundFactor initial step bound factor\n   * @see #estimate\n   ",
      "child_ranges": [
        "(line 128,col 5)-(line 128,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimator.setMaxCostEval(int)",
      "begin_line": 137,
      "end_line": 139,
      "comment": " \n   * Set the maximal number of cost evaluations.\n   * \n   * @param maxCostEval maximal number of cost evaluations\n   * @see #estimate\n  ",
      "child_ranges": [
        "(line 138,col 5)-(line 138,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimator.setCostRelativeTolerance(double)",
      "begin_line": 147,
      "end_line": 149,
      "comment": " \n   * Set the desired relative error in the sum of squares.\n   * \n   * @param costRelativeTolerance desired relative error in the sum of squares\n   * @see #estimate\n   ",
      "child_ranges": [
        "(line 148,col 5)-(line 148,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimator.setParRelativeTolerance(double)",
      "begin_line": 158,
      "end_line": 160,
      "comment": " \n   * Set the desired relative error in the approximate solution parameters.\n   * \n   * @param parRelativeTolerance desired relative error\n   * in the approximate solution parameters\n   * @see #estimate\n   ",
      "child_ranges": [
        "(line 159,col 5)-(line 159,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimator.setOrthoTolerance(double)",
      "begin_line": 169,
      "end_line": 171,
      "comment": " \n   * Set the desired max cosine on the orthogonality.\n   * \n   * @param orthoTolerance desired max cosine on the orthogonality\n   * between the function vector and the columns of the jacobian\n   * @see #estimate\n   ",
      "child_ranges": [
        "(line 170,col 5)-(line 170,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimator.getCostEvaluations()",
      "begin_line": 178,
      "end_line": 180,
      "comment": " \n   * Get the number of cost evaluations.\n   * \n   * @return number of cost evaluations\n   * ",
      "child_ranges": [
        "(line 179,col 5)-(line 179,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimator.getJacobianEvaluations()",
      "begin_line": 187,
      "end_line": 189,
      "comment": " \n   * Get the number of jacobian evaluations.\n   * \n   * @return number of jacobian evaluations\n   * ",
      "child_ranges": [
        "(line 188,col 5)-(line 188,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimator.updateJacobian()",
      "begin_line": 194,
      "end_line": 204,
      "comment": " \n   * Update the jacobian matrix.\n   ",
      "child_ranges": [
        "(line 195,col 5)-(line 195,col 26)",
        "(line 196,col 5)-(line 196,col 29)",
        "(line 197,col 5)-(line 203,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimator.updateResidualsAndCost()",
      "begin_line": 209,
      "end_line": 219,
      "comment": " \n   * Update the residuals array and cost function value.\n   ",
      "child_ranges": [
        "(line 210,col 5)-(line 210,col 22)",
        "(line 211,col 5)-(line 211,col 13)",
        "(line 212,col 5)-(line 217,col 5)",
        "(line 218,col 5)-(line 218,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimator.getRMS(org.apache.commons.math.estimation.EstimationProblem)",
      "begin_line": 232,
      "end_line": 240,
      "comment": " \n   * Get the Root Mean Square value.\n   * Get the Root Mean Square value, i.e. the root of the arithmetic\n   * mean of the square of all weighted residuals. This is related to the\n   * criterion that is minimized by the estimator as follows: if\n   * \u003cem\u003ec\u003c/em\u003e if the criterion, and \u003cem\u003en\u003c/em\u003e is the number of\n   * measurements, then the RMS is \u003cem\u003esqrt (c/n)\u003c/em\u003e.\n   * \n   * @param problem estimation problem\n   * @return RMS value\n   ",
      "child_ranges": [
        "(line 233,col 5)-(line 233,col 57)",
        "(line 234,col 5)-(line 234,col 25)",
        "(line 235,col 5)-(line 238,col 5)",
        "(line 239,col 5)-(line 239,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimator.estimate(org.apache.commons.math.estimation.EstimationProblem)",
      "begin_line": 271,
      "end_line": 516,
      "comment": " \n   * Solve an estimation problem using the Levenberg-Marquardt algorithm.\n   * \u003cp\u003eThe algorithm used is a modified Levenberg-Marquardt one, based\n   * on the MINPACK \u003ca href\u003d\"http://www.netlib.org/minpack/lmder.f\"\u003elmder\u003c/a\u003e\n   * routine. The algorithm settings must have been set up before this method\n   * is called with the {@link #setInitialStepBoundFactor},\n   * {@link #setMaxCostEval}, {@link #setCostRelativeTolerance},\n   * {@link #setParRelativeTolerance} and {@link #setOrthoTolerance} methods.\n   * If these methods have not been called, the default values set up by the\n   * {@link #LevenbergMarquardtEstimator() constructor} will be used.\u003c/p\u003e\n   * \u003cp\u003eThe authors of the original fortran function are:\u003c/p\u003e\n   * \u003cul\u003e\n   *   \u003cli\u003eArgonne National Laboratory. MINPACK project. March 1980\u003c/li\u003e\n   *   \u003cli\u003eBurton  S. Garbow\u003c/li\u003e\n   *   \u003cli\u003eKenneth E. Hillstrom\u003c/li\u003e\n   *   \u003cli\u003eJorge   J. More\u003c/li\u003e\n   *   \u003c/ul\u003e\n   * \u003cp\u003eLuc Maisonobe did the Java translation.\u003c/p\u003e\n   * \n   * @param problem estimation problem to solve\n   * @exception EstimationException if convergence cannot be\n   * reached with the specified algorithm settings or if there are more variables\n   * than equations\n   * @see #setInitialStepBoundFactor\n   * @see #setMaxCostEval\n   * @see #setCostRelativeTolerance\n   * @see #setParRelativeTolerance\n   * @see #setOrthoTolerance\n   ",
      "child_ranges": [
        "(line 275,col 5)-(line 275,col 45)",
        "(line 276,col 5)-(line 276,col 50)",
        "(line 279,col 5)-(line 279,col 38)",
        "(line 280,col 5)-(line 280,col 36)",
        "(line 281,col 5)-(line 281,col 39)",
        "(line 282,col 5)-(line 282,col 42)",
        "(line 283,col 5)-(line 283,col 35)",
        "(line 284,col 5)-(line 284,col 35)",
        "(line 285,col 5)-(line 285,col 35)",
        "(line 286,col 5)-(line 286,col 32)",
        "(line 287,col 5)-(line 287,col 35)",
        "(line 288,col 5)-(line 288,col 35)",
        "(line 291,col 5)-(line 291,col 36)",
        "(line 292,col 5)-(line 292,col 40)",
        "(line 293,col 5)-(line 293,col 40)",
        "(line 294,col 5)-(line 294,col 40)",
        "(line 295,col 5)-(line 295,col 40)",
        "(line 296,col 5)-(line 296,col 40)",
        "(line 297,col 5)-(line 297,col 40)",
        "(line 300,col 5)-(line 300,col 29)",
        "(line 303,col 5)-(line 303,col 28)",
        "(line 304,col 5)-(line 304,col 28)",
        "(line 305,col 5)-(line 305,col 28)",
        "(line 306,col 5)-(line 306,col 34)",
        "(line 307,col 5)-(line 509,col 5)",
        "(line 511,col 5)-(line 514,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimator.determineLMParameter(double[], double, double[], double[], double[], double[])",
      "begin_line": 540,
      "end_line": 686,
      "comment": " \n   * Determine the Levenberg-Marquardt parameter.\n   * \u003cp\u003eThis implementation is a translation in Java of the MINPACK\n   * \u003ca href\u003d\"http://www.netlib.org/minpack/lmpar.f\"\u003elmpar\u003c/a\u003e\n   * routine.\u003c/p\u003e\n   * \u003cp\u003eThis method sets the lmPar and lmDir attributes.\u003c/p\u003e\n   * \u003cp\u003eThe authors of the original fortran function are:\u003c/p\u003e\n   * \u003cul\u003e\n   *   \u003cli\u003eArgonne National Laboratory. MINPACK project. March 1980\u003c/li\u003e\n   *   \u003cli\u003eBurton  S. Garbow\u003c/li\u003e\n   *   \u003cli\u003eKenneth E. Hillstrom\u003c/li\u003e\n   *   \u003cli\u003eJorge   J. More\u003c/li\u003e\n   * \u003c/ul\u003e\n   * \u003cp\u003eLuc Maisonobe did the Java translation.\u003c/p\u003e\n   * \n   * @param qy array containing qTy\n   * @param delta upper bound on the euclidean norm of diagR * lmDir\n   * @param diag diagonal matrix\n   * @param work1 work array\n   * @param work2 work array\n   * @param work3 work array\n   ",
      "child_ranges": [
        "(line 545,col 5)-(line 547,col 5)",
        "(line 548,col 5)-(line 550,col 5)",
        "(line 551,col 5)-(line 558,col 5)",
        "(line 562,col 5)-(line 562,col 22)",
        "(line 563,col 5)-(line 568,col 5)",
        "(line 569,col 5)-(line 569,col 31)",
        "(line 570,col 5)-(line 570,col 31)",
        "(line 571,col 5)-(line 574,col 5)",
        "(line 579,col 5)-(line 579,col 26)",
        "(line 580,col 5)-(line 597,col 5)",
        "(line 600,col 5)-(line 600,col 13)",
        "(line 601,col 5)-(line 609,col 5)",
        "(line 610,col 5)-(line 610,col 35)",
        "(line 611,col 5)-(line 611,col 32)",
        "(line 612,col 5)-(line 615,col 5)",
        "(line 619,col 5)-(line 619,col 50)",
        "(line 620,col 5)-(line 622,col 5)",
        "(line 624,col 5)-(line 685,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimator.determineLMDirection(double[], double[], double[], double[])",
      "begin_line": 708,
      "end_line": 810,
      "comment": " \n   * Solve a*x \u003d b and d*x \u003d 0 in the least squares sense.\n   * \u003cp\u003eThis implementation is a translation in Java of the MINPACK\n   * \u003ca href\u003d\"http://www.netlib.org/minpack/qrsolv.f\"\u003eqrsolv\u003c/a\u003e\n   * routine.\u003c/p\u003e\n   * \u003cp\u003eThis method sets the lmDir and lmDiag attributes.\u003c/p\u003e\n   * \u003cp\u003eThe authors of the original fortran function are:\u003c/p\u003e\n   * \u003cul\u003e\n   *   \u003cli\u003eArgonne National Laboratory. MINPACK project. March 1980\u003c/li\u003e\n   *   \u003cli\u003eBurton  S. Garbow\u003c/li\u003e\n   *   \u003cli\u003eKenneth E. Hillstrom\u003c/li\u003e\n   *   \u003cli\u003eJorge   J. More\u003c/li\u003e\n   * \u003c/ul\u003e\n   * \u003cp\u003eLuc Maisonobe did the Java translation.\u003c/p\u003e\n   * \n   * @param qy array containing qTy\n   * @param diag diagonal matrix\n   * @param lmDiag diagonal elements associated with lmDir\n   * @param work work array\n   ",
      "child_ranges": [
        "(line 713,col 5)-(line 720,col 5)",
        "(line 723,col 5)-(line 781,col 5)",
        "(line 785,col 5)-(line 785,col 27)",
        "(line 786,col 5)-(line 793,col 5)",
        "(line 794,col 5)-(line 803,col 5)",
        "(line 806,col 5)-(line 808,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimator.qrDecomposition()",
      "begin_line": 833,
      "end_line": 900,
      "comment": " \n   * Decompose a matrix A as A.P \u003d Q.R using Householder transforms.\n   * \u003cp\u003eAs suggested in the P. Lascaux and R. Theodor book\n   * \u003ci\u003eAnalyse num\u0026eacute;rique matricielle appliqu\u0026eacute;e \u0026agrave;\n   * l\u0027art de l\u0027ing\u0026eacute;nieur\u003c/i\u003e (Masson, 1986), instead of representing\n   * the Householder transforms with u\u003csub\u003ek\u003c/sub\u003e unit vectors such that:\n   * \u003cpre\u003e\n   * H\u003csub\u003ek\u003c/sub\u003e \u003d I - 2u\u003csub\u003ek\u003c/sub\u003e.u\u003csub\u003ek\u003c/sub\u003e\u003csup\u003et\u003c/sup\u003e\n   * \u003c/pre\u003e\n   * we use \u003csub\u003ek\u003c/sub\u003e non-unit vectors such that:\n   * \u003cpre\u003e\n   * H\u003csub\u003ek\u003c/sub\u003e \u003d I - beta\u003csub\u003ek\u003c/sub\u003ev\u003csub\u003ek\u003c/sub\u003e.v\u003csub\u003ek\u003c/sub\u003e\u003csup\u003et\u003c/sup\u003e\n   * \u003c/pre\u003e\n   * where v\u003csub\u003ek\u003c/sub\u003e \u003d a\u003csub\u003ek\u003c/sub\u003e - alpha\u003csub\u003ek\u003c/sub\u003e e\u003csub\u003ek\u003c/sub\u003e.\n   * The beta\u003csub\u003ek\u003c/sub\u003e coefficients are provided upon exit as recomputing\n   * them from the v\u003csub\u003ek\u003c/sub\u003e vectors would be costly.\u003c/p\u003e\n   * \u003cp\u003eThis decomposition handles rank deficient cases since the tranformations\n   * are performed in non-increasing columns norms order thanks to columns\n   * pivoting. The diagonal elements of the R matrix are therefore also in\n   * non-increasing absolute values order.\u003c/p\u003e\n   ",
      "child_ranges": [
        "(line 836,col 5)-(line 844,col 5)",
        "(line 847,col 5)-(line 896,col 5)",
        "(line 898,col 5)-(line 898,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimator.qTy(double[])",
      "begin_line": 907,
      "end_line": 920,
      "comment": " \n   * Compute the product Qt.y for some Q.R. decomposition.\n   * \n   * @param y vector to multiply (will be overwritten with the result)\n   ",
      "child_ranges": [
        "(line 908,col 5)-(line 919,col 5)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "measurements"
      ],
      "begin_line": 923,
      "end_line": 923,
      "comment": " Array of measurements. "
    },
    {
      "type": "field",
      "varNames": [
        "parameters"
      ],
      "begin_line": 926,
      "end_line": 926,
      "comment": " Array of parameters. "
    },
    {
      "type": "field",
      "varNames": [
        "jacobian"
      ],
      "begin_line": 934,
      "end_line": 934,
      "comment": " \n   * Jacobian matrix.\n   * \u003cp\u003eDepending on the computation phase, this matrix is either in\n   * canonical form (just after the calls to updateJacobian) or in\n   * Q.R. decomposed form (after calls to qrDecomposition)\u003c/p\u003e\n   "
    },
    {
      "type": "field",
      "varNames": [
        "cols"
      ],
      "begin_line": 937,
      "end_line": 937,
      "comment": " Number of columns of the jacobian matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "solvedCols"
      ],
      "begin_line": 940,
      "end_line": 940,
      "comment": " Number of solved variables. "
    },
    {
      "type": "field",
      "varNames": [
        "rows"
      ],
      "begin_line": 943,
      "end_line": 943,
      "comment": " Number of rows of the jacobian matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "diagR"
      ],
      "begin_line": 946,
      "end_line": 946,
      "comment": " Diagonal elements of the R matrix in the Q.R. decomposition. "
    },
    {
      "type": "field",
      "varNames": [
        "jacNorm"
      ],
      "begin_line": 949,
      "end_line": 949,
      "comment": " Norms of the columns of the jacobian matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "beta"
      ],
      "begin_line": 952,
      "end_line": 952,
      "comment": " Coefficients of the Householder transforms vectors. "
    },
    {
      "type": "field",
      "varNames": [
        "permutation"
      ],
      "begin_line": 955,
      "end_line": 955,
      "comment": " Columns permutation array. "
    },
    {
      "type": "field",
      "varNames": [
        "rank"
      ],
      "begin_line": 958,
      "end_line": 958,
      "comment": " Rank of the jacobian matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "lmPar"
      ],
      "begin_line": 961,
      "end_line": 961,
      "comment": " Levenberg-Marquardt parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "lmDir"
      ],
      "begin_line": 964,
      "end_line": 964,
      "comment": " Parameters evolution direction associated with lmPar. "
    },
    {
      "type": "field",
      "varNames": [
        "residuals"
      ],
      "begin_line": 971,
      "end_line": 971,
      "comment": " Residuals array.\n   * \u003cp\u003eDepending on the computation phase, this array is either in\n   * canonical form (just after the calls to updateResiduals) or in\n   * premultiplied by Qt form (just after calls to qTy)\u003c/p\u003e\n   "
    },
    {
      "type": "field",
      "varNames": [
        "cost"
      ],
      "begin_line": 974,
      "end_line": 974,
      "comment": " Cost value (square root of the sum of the residuals). "
    },
    {
      "type": "field",
      "varNames": [
        "initialStepBoundFactor"
      ],
      "begin_line": 977,
      "end_line": 977,
      "comment": " Positive input variable used in determining the initial step bound. "
    },
    {
      "type": "field",
      "varNames": [
        "maxCostEval"
      ],
      "begin_line": 980,
      "end_line": 980,
      "comment": " Maximal number of cost evaluations. "
    },
    {
      "type": "field",
      "varNames": [
        "costEvaluations"
      ],
      "begin_line": 983,
      "end_line": 983,
      "comment": " Number of cost evaluations. "
    },
    {
      "type": "field",
      "varNames": [
        "jacobianEvaluations"
      ],
      "begin_line": 986,
      "end_line": 986,
      "comment": " Number of jacobian evaluations. "
    },
    {
      "type": "field",
      "varNames": [
        "costRelativeTolerance"
      ],
      "begin_line": 989,
      "end_line": 989,
      "comment": " Desired relative error in the sum of squares. "
    },
    {
      "type": "field",
      "varNames": [
        "parRelativeTolerance"
      ],
      "begin_line": 992,
      "end_line": 992,
      "comment": "  Desired relative error in the approximate solution parameters. "
    },
    {
      "type": "field",
      "varNames": [
        "orthoTolerance"
      ],
      "begin_line": 996,
      "end_line": 996,
      "comment": " Desired max cosine on the orthogonality between the function vector\n   * and the columns of the jacobian. "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 998,
      "end_line": 998,
      "comment": ""
    }
  ]
}