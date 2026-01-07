{
  "filepath": "/tmp/Math-2b/src/main/java/org/apache/commons/math3/fitting/leastsquares/LevenbergMarquardtOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LevenbergMarquardtOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizer\u003corg.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizer\u003e"
      ],
      "begin_line": 108,
      "end_line": 990,
      "comment": "\n * This class solves a least-squares problem using the Levenberg-Marquardt\n * algorithm.\n *\n * \u003cp\u003eThis implementation \u003cem\u003eshould\u003c/em\u003e work even for over-determined systems\n * (i.e. systems having more point than equations). Over-determined systems\n * are solved by ignoring the point which have the smallest impact according\n * to their jacobian column norm. Only the rank of the matrix and some loop bounds\n * are changed to implement this.\u003c/p\u003e\n *\n * \u003cp\u003eThe resolution engine is a simple translation of the MINPACK \u003ca\n * href\u003d\"http://www.netlib.org/minpack/lmder.f\"\u003elmder\u003c/a\u003e routine with minor\n * changes. The changes include the over-determined resolution, the use of\n * inherited convergence checker and the Q.R. decomposition which has been\n * rewritten following the algorithm described in the\n * P. Lascaux and R. Theodor book \u003ci\u003eAnalyse num\u0026eacute;rique matricielle\n * appliqu\u0026eacute;e \u0026agrave; l\u0027art de l\u0027ing\u0026eacute;nieur\u003c/i\u003e, Masson 1986.\u003c/p\u003e\n * \u003cp\u003eThe authors of the original fortran version are:\n * \u003cul\u003e\n * \u003cli\u003eArgonne National Laboratory. MINPACK project. March 1980\u003c/li\u003e\n * \u003cli\u003eBurton S. Garbow\u003c/li\u003e\n * \u003cli\u003eKenneth E. Hillstrom\u003c/li\u003e\n * \u003cli\u003eJorge J. More\u003c/li\u003e\n * \u003c/ul\u003e\n * The redistribution policy for MINPACK is available \u003ca\n * href\u003d\"http://www.netlib.org/minpack/disclaimer\"\u003ehere\u003c/a\u003e, for convenience, it\n * is reproduced below.\u003c/p\u003e\n *\n * \u003ctable border\u003d\"0\" width\u003d\"80%\" cellpadding\u003d\"10\" align\u003d\"center\" bgcolor\u003d\"#E0E0E0\"\u003e\n * \u003ctr\u003e\u003ctd\u003e\n *    Minpack Copyright Notice (1999) University of Chicago.\n *    All rights reserved\n * \u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003e\n * Redistribution and use in source and binary forms, with or without\n * modification, are permitted provided that the following conditions\n * are met:\n * \u003col\u003e\n *  \u003cli\u003eRedistributions of source code must retain the above copyright\n *      notice, this list of conditions and the following disclaimer.\u003c/li\u003e\n * \u003cli\u003eRedistributions in binary form must reproduce the above\n *     copyright notice, this list of conditions and the following\n *     disclaimer in the documentation and/or other materials provided\n *     with the distribution.\u003c/li\u003e\n * \u003cli\u003eThe end-user documentation included with the redistribution, if any,\n *     must include the following acknowledgment:\n *     \u003ccode\u003eThis product includes software developed by the University of\n *           Chicago, as Operator of Argonne National Laboratory.\u003c/code\u003e\n *     Alternately, this acknowledgment may appear in the software itself,\n *     if and wherever such third-party acknowledgments normally appear.\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eWARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED \"AS IS\"\n *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE\n *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND\n *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR\n *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES\n *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE\n *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY\n *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR\n *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF\n *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)\n *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION\n *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL\n *     BE CORRECTED.\u003c/strong\u003e\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eLIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT\n *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF\n *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,\n *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF\n *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF\n *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER\n *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT\n *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,\n *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE\n *     POSSIBILITY OF SUCH LOSS OR DAMAGES.\u003c/strong\u003e\u003c/li\u003e\n * \u003col\u003e\u003c/td\u003e\u003c/tr\u003e\n * \u003c/table\u003e\n *\n * @version $Id$\n * @since 2.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "TWO_EPS"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": " Twice the \"epsilon machine\". "
    },
    {
      "type": "field",
      "varNames": [
        "initialStepBoundFactor"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": " Positive input variable used in determining the initial step bound. "
    },
    {
      "type": "field",
      "varNames": [
        "costRelativeTolerance"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": " Desired relative error in the sum of squares. "
    },
    {
      "type": "field",
      "varNames": [
        "parRelativeTolerance"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": "  Desired relative error in the approximate solution parameters. "
    },
    {
      "type": "field",
      "varNames": [
        "orthoTolerance"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": " Desired max cosine on the orthogonality between the function vector\n     * and the columns of the jacobian. "
    },
    {
      "type": "field",
      "varNames": [
        "qrRankingThreshold"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": " Threshold for QR ranking. "
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
      "begin_line": 125,
      "end_line": 125,
      "comment": " Parameters evolution direction associated with lmPar. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizer.create()",
      "begin_line": 143,
      "end_line": 145,
      "comment": "\n     * Creates a bare-bones instance.\n     * Several calls to {@code withXxx} methods are necessary to obtain\n     * an object with all necessary fields set to sensible values.\n     * \u003cbr/\u003e\n     * The default values for the algorithm settings are:\n     * \u003cul\u003e\n     *  \u003cli\u003eInitial step bound factor: 100\u003c/li\u003e\n     *  \u003cli\u003eCost relative tolerance: 1e-10\u003c/li\u003e\n     *  \u003cli\u003eParameters relative tolerance: 1e-10\u003c/li\u003e\n     *  \u003cli\u003eOrthogonality tolerance: 1e-10\u003c/li\u003e\n     *  \u003cli\u003eQR ranking threshold: {@link Precision#SAFE_MIN}\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @return an instance of this class.\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizer.withInitialStepBoundFactor(double)",
      "begin_line": 157,
      "end_line": 160,
      "comment": "\n     * @param initialStepBoundFactor Positive input variable used in\n     * determining the initial step bound. This bound is set to the\n     * product of initialStepBoundFactor and the euclidean norm of\n     * {@code diag * x} if non-zero, or else to {@code initialStepBoundFactor}\n     * itself. In most cases factor should lie in the interval\n     * {@code (0.1, 100.0)}. {@code 100} is a generally recommended value.\n     * of the matrix is reduced.\n     * @return this instance.\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 61)",
        "(line 159,col 9)-(line 159,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizer.withCostRelativeTolerance(double)",
      "begin_line": 166,
      "end_line": 169,
      "comment": "\n     * @param costRelativeTolerance Desired relative error in the sum of squares.\n     * @return this instance.\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 59)",
        "(line 168,col 9)-(line 168,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizer.withParameterRelativeTolerance(double)",
      "begin_line": 176,
      "end_line": 179,
      "comment": "\n     * @param parameterRelativeTolerance Desired relative error in the approximate solution\n     * parameters.\n     * @return this instance.\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 63)",
        "(line 178,col 9)-(line 178,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizer.withOrthoTolerance(double)",
      "begin_line": 186,
      "end_line": 189,
      "comment": "\n     * @param orthoTolerance Desired max cosine on the orthogonality between\n     * the function vector and the columns of the Jacobian.\n     * @return this instance.\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 45)",
        "(line 188,col 9)-(line 188,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizer.withRankingThreshold(double)",
      "begin_line": 198,
      "end_line": 201,
      "comment": "\n     * @param rankingThreshold Desired threshold for QR ranking.\n     * If the squared norm of a column vector is smaller or equal to this\n     * threshold during QR decomposition, it is considered to be a zero vector\n     * and hence the rank of the matrix is reduced.\n     * @return this instance.\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 51)",
        "(line 200,col 9)-(line 200,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizer.getInitialStepBoundFactor()",
      "begin_line": 209,
      "end_line": 211,
      "comment": "\n     * Gets the value of a tuning parameter.\n     * @see #withInitialStepBoundFactor(double)\n     *\n     * @return the parameter\u0027s value.\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizer.getCostRelativeTolerance()",
      "begin_line": 219,
      "end_line": 221,
      "comment": "\n     * Gets the value of a tuning parameter.\n     * @see #withCostRelativeTolerance(double)\n     *\n     * @return the parameter\u0027s value.\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizer.getParameterRelativeTolerance()",
      "begin_line": 229,
      "end_line": 231,
      "comment": "\n     * Gets the value of a tuning parameter.\n     * @see #withParameterRelativeTolerance(double)\n     *\n     * @return the parameter\u0027s value.\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizer.getOrthoTolerance()",
      "begin_line": 239,
      "end_line": 241,
      "comment": "\n     * Gets the value of a tuning parameter.\n     * @see #withOrthoTolerance(double)\n     *\n     * @return the parameter\u0027s value.\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizer.getRankingThreshold()",
      "begin_line": 249,
      "end_line": 251,
      "comment": "\n     * Gets the value of a tuning parameter.\n     * @see #withRankingThreshold(double)\n     *\n     * @return the parameter\u0027s value.\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizer.doOptimize()",
      "begin_line": 254,
      "end_line": 501,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 42)",
        "(line 257,col 9)-(line 257,col 49)",
        "(line 258,col 9)-(line 258,col 43)",
        "(line 261,col 9)-(line 261,col 53)",
        "(line 262,col 9)-(line 262,col 31)",
        "(line 263,col 9)-(line 263,col 18)",
        "(line 266,col 9)-(line 266,col 29)",
        "(line 267,col 9)-(line 267,col 29)",
        "(line 268,col 9)-(line 268,col 42)",
        "(line 269,col 9)-(line 269,col 42)",
        "(line 270,col 9)-(line 270,col 42)",
        "(line 271,col 9)-(line 271,col 42)",
        "(line 272,col 9)-(line 272,col 42)",
        "(line 273,col 9)-(line 273,col 42)",
        "(line 274,col 9)-(line 274,col 42)",
        "(line 275,col 9)-(line 275,col 42)",
        "(line 277,col 9)-(line 277,col 66)",
        "(line 280,col 9)-(line 280,col 72)",
        "(line 281,col 9)-(line 281,col 71)",
        "(line 282,col 9)-(line 282,col 96)",
        "(line 283,col 9)-(line 283,col 59)",
        "(line 286,col 9)-(line 286,col 38)",
        "(line 287,col 9)-(line 287,col 89)",
        "(line 288,col 9)-(line 500,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "InternalData",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 509,
      "end_line": 544,
      "comment": "\n     * Holds internal data.\n     * This structure was created so that all optimizer fields can be \"final\".\n     * Code should be further refactored in order to not pass around arguments\n     * that will modified in-place (cf. \"work\" arrays).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "weightedJacobian"
      ],
      "begin_line": 511,
      "end_line": 511,
      "comment": " Weighted Jacobian. "
    },
    {
      "type": "field",
      "varNames": [
        "permutation"
      ],
      "begin_line": 513,
      "end_line": 513,
      "comment": " Columns permutation array. "
    },
    {
      "type": "field",
      "varNames": [
        "rank"
      ],
      "begin_line": 515,
      "end_line": 515,
      "comment": " Rank of the Jacobian matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "diagR"
      ],
      "begin_line": 517,
      "end_line": 517,
      "comment": " Diagonal elements of the R matrix in the QR decomposition. "
    },
    {
      "type": "field",
      "varNames": [
        "jacNorm"
      ],
      "begin_line": 519,
      "end_line": 519,
      "comment": " Norms of the columns of the jacobian matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "beta"
      ],
      "begin_line": 521,
      "end_line": 521,
      "comment": " Coefficients of the Householder transforms vectors. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizer.InternalData.InternalData(double[][], int[], int, double[], double[], double[])",
      "begin_line": 531,
      "end_line": 543,
      "comment": "\n         * @param weightedJacobian Weighted Jacobian.\n         * @param permutation Columns permutation array.\n         * @param rank Rank of the Jacobian matrix.\n         * @param diagR Diagonal elements of the R matrix in the QR decomposition.\n         * @param jacNorm Norms of the columns of the jacobian matrix.\n         * @param beta Coefficients of the Householder transforms vectors.\n         ",
      "child_ranges": [
        "(line 537,col 13)-(line 537,col 53)",
        "(line 538,col 13)-(line 538,col 43)",
        "(line 539,col 13)-(line 539,col 29)",
        "(line 540,col 13)-(line 540,col 31)",
        "(line 541,col 13)-(line 541,col 35)",
        "(line 542,col 13)-(line 542,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizer.determineLMParameter(double[], double, double[], org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizer.InternalData, int, double[], double[], double[])",
      "begin_line": 571,
      "end_line": 727,
      "comment": "\n     * Determines the Levenberg-Marquardt parameter.\n     *\n     * \u003cp\u003eThis implementation is a translation in Java of the MINPACK\n     * \u003ca href\u003d\"http://www.netlib.org/minpack/lmpar.f\"\u003elmpar\u003c/a\u003e\n     * routine.\u003c/p\u003e\n     * \u003cp\u003eThis method sets the lmPar and lmDir attributes.\u003c/p\u003e\n     * \u003cp\u003eThe authors of the original fortran function are:\u003c/p\u003e\n     * \u003cul\u003e\n     *   \u003cli\u003eArgonne National Laboratory. MINPACK project. March 1980\u003c/li\u003e\n     *   \u003cli\u003eBurton  S. Garbow\u003c/li\u003e\n     *   \u003cli\u003eKenneth E. Hillstrom\u003c/li\u003e\n     *   \u003cli\u003eJorge   J. More\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003cp\u003eLuc Maisonobe did the Java translation.\u003c/p\u003e\n     *\n     * @param qy Array containing qTy.\n     * @param delta Upper bound on the euclidean norm of diagR * lmDir.\n     * @param diag Diagonal matrix.\n     * @param internalData Data (modified in-place in this method).\n     * @param solvedCols Number of solved point.\n     * @param work1 work array\n     * @param work2 work array\n     * @param work3 work array\n     ",
      "child_ranges": [
        "(line 574,col 9)-(line 574,col 74)",
        "(line 575,col 9)-(line 575,col 59)",
        "(line 576,col 9)-(line 576,col 43)",
        "(line 577,col 9)-(line 577,col 50)",
        "(line 579,col 9)-(line 579,col 50)",
        "(line 583,col 9)-(line 585,col 9)",
        "(line 586,col 9)-(line 588,col 9)",
        "(line 589,col 9)-(line 596,col 9)",
        "(line 600,col 9)-(line 600,col 26)",
        "(line 601,col 9)-(line 606,col 9)",
        "(line 607,col 9)-(line 607,col 39)",
        "(line 608,col 9)-(line 608,col 35)",
        "(line 609,col 9)-(line 612,col 9)",
        "(line 617,col 9)-(line 617,col 20)",
        "(line 618,col 9)-(line 618,col 24)",
        "(line 619,col 9)-(line 636,col 9)",
        "(line 639,col 9)-(line 639,col 17)",
        "(line 640,col 9)-(line 648,col 9)",
        "(line 649,col 9)-(line 649,col 43)",
        "(line 650,col 9)-(line 650,col 36)",
        "(line 651,col 9)-(line 653,col 9)",
        "(line 657,col 9)-(line 657,col 62)",
        "(line 658,col 9)-(line 660,col 9)",
        "(line 662,col 9)-(line 724,col 9)",
        "(line 726,col 9)-(line 726,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizer.determineLMDirection(double[], double[], double[], org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizer.InternalData, int, double[])",
      "begin_line": 751,
      "end_line": 856,
      "comment": "\n     * Solve a*x \u003d b and d*x \u003d 0 in the least squares sense.\n     * \u003cp\u003eThis implementation is a translation in Java of the MINPACK\n     * \u003ca href\u003d\"http://www.netlib.org/minpack/qrsolv.f\"\u003eqrsolv\u003c/a\u003e\n     * routine.\u003c/p\u003e\n     * \u003cp\u003eThis method sets the lmDir and lmDiag attributes.\u003c/p\u003e\n     * \u003cp\u003eThe authors of the original fortran function are:\u003c/p\u003e\n     * \u003cul\u003e\n     *   \u003cli\u003eArgonne National Laboratory. MINPACK project. March 1980\u003c/li\u003e\n     *   \u003cli\u003eBurton  S. Garbow\u003c/li\u003e\n     *   \u003cli\u003eKenneth E. Hillstrom\u003c/li\u003e\n     *   \u003cli\u003eJorge   J. More\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003cp\u003eLuc Maisonobe did the Java translation.\u003c/p\u003e\n     *\n     * @param qy array containing qTy\n     * @param diag diagonal matrix\n     * @param lmDiag diagonal elements associated with lmDir\n     * @param internalData Data (modified in-place in this method).\n     * @param solvedCols Number of sloved point.\n     * @param work work array\n     ",
      "child_ranges": [
        "(line 756,col 9)-(line 756,col 59)",
        "(line 757,col 9)-(line 757,col 74)",
        "(line 758,col 9)-(line 758,col 50)",
        "(line 762,col 9)-(line 769,col 9)",
        "(line 772,col 9)-(line 828,col 9)",
        "(line 832,col 9)-(line 832,col 31)",
        "(line 833,col 9)-(line 840,col 9)",
        "(line 841,col 9)-(line 850,col 9)",
        "(line 853,col 9)-(line 855,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizer.qrDecomposition(org.apache.commons.math3.linear.RealMatrix, int)",
      "begin_line": 884,
      "end_line": 961,
      "comment": "\n     * Decompose a matrix A as A.P \u003d Q.R using Householder transforms.\n     * \u003cp\u003eAs suggested in the P. Lascaux and R. Theodor book\n     * \u003ci\u003eAnalyse num\u0026eacute;rique matricielle appliqu\u0026eacute;e \u0026agrave;\n     * l\u0027art de l\u0027ing\u0026eacute;nieur\u003c/i\u003e (Masson, 1986), instead of representing\n     * the Householder transforms with u\u003csub\u003ek\u003c/sub\u003e unit vectors such that:\n     * \u003cpre\u003e\n     * H\u003csub\u003ek\u003c/sub\u003e \u003d I - 2u\u003csub\u003ek\u003c/sub\u003e.u\u003csub\u003ek\u003c/sub\u003e\u003csup\u003et\u003c/sup\u003e\n     * \u003c/pre\u003e\n     * we use \u003csub\u003ek\u003c/sub\u003e non-unit vectors such that:\n     * \u003cpre\u003e\n     * H\u003csub\u003ek\u003c/sub\u003e \u003d I - beta\u003csub\u003ek\u003c/sub\u003ev\u003csub\u003ek\u003c/sub\u003e.v\u003csub\u003ek\u003c/sub\u003e\u003csup\u003et\u003c/sup\u003e\n     * \u003c/pre\u003e\n     * where v\u003csub\u003ek\u003c/sub\u003e \u003d a\u003csub\u003ek\u003c/sub\u003e - alpha\u003csub\u003ek\u003c/sub\u003e e\u003csub\u003ek\u003c/sub\u003e.\n     * The beta\u003csub\u003ek\u003c/sub\u003e coefficients are provided upon exit as recomputing\n     * them from the v\u003csub\u003ek\u003c/sub\u003e vectors would be costly.\u003c/p\u003e\n     * \u003cp\u003eThis decomposition handles rank deficient cases since the tranformations\n     * are performed in non-increasing columns norms order thanks to columns\n     * pivoting. The diagonal elements of the R matrix are therefore also in\n     * non-increasing absolute values order.\u003c/p\u003e\n     *\n     * @param jacobian Weighted Jacobian matrix at the current point.\n     * @param solvedCols Number of solved point.\n     * @return data used in other methods of this class.\n     * @throws ConvergenceException if the decomposition cannot be performed.\n     ",
      "child_ranges": [
        "(line 888,col 9)-(line 888,col 82)",
        "(line 890,col 9)-(line 890,col 47)",
        "(line 891,col 9)-(line 891,col 50)",
        "(line 893,col 9)-(line 893,col 46)",
        "(line 894,col 9)-(line 894,col 46)",
        "(line 895,col 9)-(line 895,col 48)",
        "(line 896,col 9)-(line 896,col 45)",
        "(line 899,col 9)-(line 907,col 9)",
        "(line 910,col 9)-(line 958,col 9)",
        "(line 960,col 9)-(line 960,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizer.qTy(double[], org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizer.InternalData)",
      "begin_line": 969,
      "end_line": 989,
      "comment": "\n     * Compute the product Qt.y for some Q.R. decomposition.\n     *\n     * @param y vector to multiply (will be overwritten with the result)\n     * @param internalData Data.\n     ",
      "child_ranges": [
        "(line 971,col 9)-(line 971,col 74)",
        "(line 972,col 9)-(line 972,col 59)",
        "(line 973,col 9)-(line 973,col 48)",
        "(line 975,col 9)-(line 975,col 47)",
        "(line 976,col 9)-(line 976,col 50)",
        "(line 978,col 9)-(line 988,col 9)"
      ]
    }
  ]
}