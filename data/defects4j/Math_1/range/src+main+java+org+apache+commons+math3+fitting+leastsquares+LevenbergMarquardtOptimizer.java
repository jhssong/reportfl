{
  "filepath": "/tmp/Math-1b/src/main/java/org/apache/commons/math3/fitting/leastsquares/LevenbergMarquardtOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LevenbergMarquardtOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.fitting.leastsquares.AbstractLeastSquaresOptimizer\u003corg.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizer\u003e"
      ],
      "begin_line": 108,
      "end_line": 1029,
      "comment": "\n * This class solves a least-squares problem using the Levenberg-Marquardt\n * algorithm.\n *\n * \u003cp\u003eThis implementation \u003cem\u003eshould\u003c/em\u003e work even for over-determined systems\n * (i.e. systems having more point than equations). Over-determined systems\n * are solved by ignoring the point which have the smallest impact according\n * to their jacobian column norm. Only the rank of the matrix and some loop bounds\n * are changed to implement this.\u003c/p\u003e\n *\n * \u003cp\u003eThe resolution engine is a simple translation of the MINPACK \u003ca\n * href\u003d\"http://www.netlib.org/minpack/lmder.f\"\u003elmder\u003c/a\u003e routine with minor\n * changes. The changes include the over-determined resolution, the use of\n * inherited convergence checker and the Q.R. decomposition which has been\n * rewritten following the algorithm described in the\n * P. Lascaux and R. Theodor book \u003ci\u003eAnalyse num\u0026eacute;rique matricielle\n * appliqu\u0026eacute;e \u0026agrave; l\u0027art de l\u0027ing\u0026eacute;nieur\u003c/i\u003e, Masson 1986.\u003c/p\u003e\n * \u003cp\u003eThe authors of the original fortran version are:\n * \u003cul\u003e\n * \u003cli\u003eArgonne National Laboratory. MINPACK project. March 1980\u003c/li\u003e\n * \u003cli\u003eBurton S. Garbow\u003c/li\u003e\n * \u003cli\u003eKenneth E. Hillstrom\u003c/li\u003e\n * \u003cli\u003eJorge J. More\u003c/li\u003e\n * \u003c/ul\u003e\n * The redistribution policy for MINPACK is available \u003ca\n * href\u003d\"http://www.netlib.org/minpack/disclaimer\"\u003ehere\u003c/a\u003e, for convenience, it\n * is reproduced below.\u003c/p\u003e\n *\n * \u003ctable border\u003d\"0\" width\u003d\"80%\" cellpadding\u003d\"10\" align\u003d\"center\" bgcolor\u003d\"#E0E0E0\"\u003e\n * \u003ctr\u003e\u003ctd\u003e\n *    Minpack Copyright Notice (1999) University of Chicago.\n *    All rights reserved\n * \u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003e\n * Redistribution and use in source and binary forms, with or without\n * modification, are permitted provided that the following conditions\n * are met:\n * \u003col\u003e\n *  \u003cli\u003eRedistributions of source code must retain the above copyright\n *      notice, this list of conditions and the following disclaimer.\u003c/li\u003e\n * \u003cli\u003eRedistributions in binary form must reproduce the above\n *     copyright notice, this list of conditions and the following\n *     disclaimer in the documentation and/or other materials provided\n *     with the distribution.\u003c/li\u003e\n * \u003cli\u003eThe end-user documentation included with the redistribution, if any,\n *     must include the following acknowledgment:\n *     \u003ccode\u003eThis product includes software developed by the University of\n *           Chicago, as Operator of Argonne National Laboratory.\u003c/code\u003e\n *     Alternately, this acknowledgment may appear in the software itself,\n *     if and wherever such third-party acknowledgments normally appear.\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eWARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED \"AS IS\"\n *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE\n *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND\n *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR\n *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES\n *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE\n *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY\n *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR\n *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF\n *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)\n *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION\n *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL\n *     BE CORRECTED.\u003c/strong\u003e\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eLIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT\n *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF\n *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,\n *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF\n *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF\n *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER\n *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT\n *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,\n *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE\n *     POSSIBILITY OF SUCH LOSS OR DAMAGES.\u003c/strong\u003e\u003c/li\u003e\n * \u003col\u003e\u003c/td\u003e\u003c/tr\u003e\n * \u003c/table\u003e\n *\n * @version $Id$\n * @since 3.3\n "
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
      "comment": " Desired relative error in the approximate solution parameters. "
    },
    {
      "type": "field",
      "varNames": [
        "orthoTolerance"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": "\n     * Desired max cosine on the orthogonality between the function vector\n     * and the columns of the jacobian.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "qrRankingThreshold"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": " Threshold for QR ranking. "
    },
    {
      "type": "field",
      "varNames": [
        "lmPar"
      ],
      "begin_line": 125,
      "end_line": 125,
      "comment": " Levenberg-Marquardt parameter. "
    },
    {
      "type": "field",
      "varNames": [
        "lmDir"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": " Parameters evolution direction associated with lmPar. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizer.LevenbergMarquardtOptimizer()",
      "begin_line": 132,
      "end_line": 132,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizer.LevenbergMarquardtOptimizer(org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizer)",
      "begin_line": 139,
      "end_line": 150,
      "comment": "\n     * Copy constructor.\n     *\n     * @param other object to copy.\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 21)",
        "(line 142,col 9)-(line 142,col 67)",
        "(line 143,col 9)-(line 143,col 65)",
        "(line 144,col 9)-(line 144,col 63)",
        "(line 145,col 9)-(line 145,col 51)",
        "(line 146,col 9)-(line 146,col 59)",
        "(line 148,col 9)-(line 148,col 18)",
        "(line 149,col 9)-(line 149,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizer.create()",
      "begin_line": 168,
      "end_line": 170,
      "comment": "\n     * Creates a bare-bones instance.\n     * Several calls to {@code withXxx} methods are necessary to obtain\n     * an object with all necessary fields set to sensible values.\n     * \u003cbr/\u003e\n     * The default values for the algorithm settings are:\n     * \u003cul\u003e\n     *  \u003cli\u003eInitial step bound factor: 100\u003c/li\u003e\n     *  \u003cli\u003eCost relative tolerance: 1e-10\u003c/li\u003e\n     *  \u003cli\u003eParameters relative tolerance: 1e-10\u003c/li\u003e\n     *  \u003cli\u003eOrthogonality tolerance: 1e-10\u003c/li\u003e\n     *  \u003cli\u003eQR ranking threshold: {@link Precision#SAFE_MIN}\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @return an instance of this class.\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizer.shallowCopy()",
      "begin_line": 173,
      "end_line": 176,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizer.withInitialStepBoundFactor(double)",
      "begin_line": 188,
      "end_line": 191,
      "comment": "\n     * @param newInitialStepBoundFactor Positive input variable used in\n     * determining the initial step bound. This bound is set to the\n     * product of initialStepBoundFactor and the euclidean norm of\n     * {@code diag * x} if non-zero, or else to {@code newInitialStepBoundFactor}\n     * itself. In most cases factor should lie in the interval\n     * {@code (0.1, 100.0)}. {@code 100} is a generally recommended value.\n     * of the matrix is reduced.\n     * @return this instance.\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 64)",
        "(line 190,col 9)-(line 190,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizer.withCostRelativeTolerance(double)",
      "begin_line": 199,
      "end_line": 202,
      "comment": "\n     * Modifies the given parameter.\n     *\n     * @param newCostRelativeTolerance Desired relative error in the sum of squares.\n     * @return this instance.\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 62)",
        "(line 201,col 9)-(line 201,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizer.withParameterRelativeTolerance(double)",
      "begin_line": 211,
      "end_line": 214,
      "comment": "\n     * Modifies the given parameter.\n     *\n     * @param parameterRelativeTolerance Desired relative error in the approximate solution\n     * parameters.\n     * @return this instance.\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 63)",
        "(line 213,col 9)-(line 213,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizer.withOrthoTolerance(double)",
      "begin_line": 223,
      "end_line": 226,
      "comment": "\n     * Modifies the given parameter.\n     *\n     * @param newOrthoTolerance Desired max cosine on the orthogonality between\n     * the function vector and the columns of the Jacobian.\n     * @return this instance.\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 48)",
        "(line 225,col 9)-(line 225,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizer.withRankingThreshold(double)",
      "begin_line": 237,
      "end_line": 240,
      "comment": "\n     * Modifies the given parameter.\n     *\n     * @param rankingThreshold Desired threshold for QR ranking.\n     * If the squared norm of a column vector is smaller or equal to this\n     * threshold during QR decomposition, it is considered to be a zero vector\n     * and hence the rank of the matrix is reduced.\n     * @return this instance.\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 51)",
        "(line 239,col 9)-(line 239,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizer.getInitialStepBoundFactor()",
      "begin_line": 248,
      "end_line": 250,
      "comment": "\n     * Gets the value of a tuning parameter.\n     * @see #withInitialStepBoundFactor(double)\n     *\n     * @return the parameter\u0027s value.\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizer.getCostRelativeTolerance()",
      "begin_line": 258,
      "end_line": 260,
      "comment": "\n     * Gets the value of a tuning parameter.\n     * @see #withCostRelativeTolerance(double)\n     *\n     * @return the parameter\u0027s value.\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizer.getParameterRelativeTolerance()",
      "begin_line": 268,
      "end_line": 270,
      "comment": "\n     * Gets the value of a tuning parameter.\n     * @see #withParameterRelativeTolerance(double)\n     *\n     * @return the parameter\u0027s value.\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizer.getOrthoTolerance()",
      "begin_line": 278,
      "end_line": 280,
      "comment": "\n     * Gets the value of a tuning parameter.\n     * @see #withOrthoTolerance(double)\n     *\n     * @return the parameter\u0027s value.\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizer.getRankingThreshold()",
      "begin_line": 288,
      "end_line": 290,
      "comment": "\n     * Gets the value of a tuning parameter.\n     * @see #withRankingThreshold(double)\n     *\n     * @return the parameter\u0027s value.\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizer.doOptimize()",
      "begin_line": 293,
      "end_line": 540,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 42)",
        "(line 296,col 9)-(line 296,col 49)",
        "(line 297,col 9)-(line 297,col 43)",
        "(line 300,col 9)-(line 300,col 53)",
        "(line 301,col 9)-(line 301,col 31)",
        "(line 302,col 9)-(line 302,col 18)",
        "(line 305,col 9)-(line 305,col 29)",
        "(line 306,col 9)-(line 306,col 29)",
        "(line 307,col 9)-(line 307,col 42)",
        "(line 308,col 9)-(line 308,col 42)",
        "(line 309,col 9)-(line 309,col 42)",
        "(line 310,col 9)-(line 310,col 42)",
        "(line 311,col 9)-(line 311,col 42)",
        "(line 312,col 9)-(line 312,col 42)",
        "(line 313,col 9)-(line 313,col 42)",
        "(line 314,col 9)-(line 314,col 42)",
        "(line 316,col 9)-(line 316,col 66)",
        "(line 319,col 9)-(line 319,col 72)",
        "(line 320,col 9)-(line 320,col 71)",
        "(line 321,col 9)-(line 321,col 96)",
        "(line 322,col 9)-(line 322,col 59)",
        "(line 325,col 9)-(line 325,col 38)",
        "(line 326,col 9)-(line 326,col 89)",
        "(line 327,col 9)-(line 539,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "InternalData",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 548,
      "end_line": 583,
      "comment": "\n     * Holds internal data.\n     * This structure was created so that all optimizer fields can be \"final\".\n     * Code should be further refactored in order to not pass around arguments\n     * that will modified in-place (cf. \"work\" arrays).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "weightedJacobian"
      ],
      "begin_line": 550,
      "end_line": 550,
      "comment": " Weighted Jacobian. "
    },
    {
      "type": "field",
      "varNames": [
        "permutation"
      ],
      "begin_line": 552,
      "end_line": 552,
      "comment": " Columns permutation array. "
    },
    {
      "type": "field",
      "varNames": [
        "rank"
      ],
      "begin_line": 554,
      "end_line": 554,
      "comment": " Rank of the Jacobian matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "diagR"
      ],
      "begin_line": 556,
      "end_line": 556,
      "comment": " Diagonal elements of the R matrix in the QR decomposition. "
    },
    {
      "type": "field",
      "varNames": [
        "jacNorm"
      ],
      "begin_line": 558,
      "end_line": 558,
      "comment": " Norms of the columns of the jacobian matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "beta"
      ],
      "begin_line": 560,
      "end_line": 560,
      "comment": " Coefficients of the Householder transforms vectors. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizer.InternalData.InternalData(double[][], int[], int, double[], double[], double[])",
      "begin_line": 570,
      "end_line": 582,
      "comment": "\n         * @param weightedJacobian Weighted Jacobian.\n         * @param permutation Columns permutation array.\n         * @param rank Rank of the Jacobian matrix.\n         * @param diagR Diagonal elements of the R matrix in the QR decomposition.\n         * @param jacNorm Norms of the columns of the jacobian matrix.\n         * @param beta Coefficients of the Householder transforms vectors.\n         ",
      "child_ranges": [
        "(line 576,col 13)-(line 576,col 53)",
        "(line 577,col 13)-(line 577,col 43)",
        "(line 578,col 13)-(line 578,col 29)",
        "(line 579,col 13)-(line 579,col 31)",
        "(line 580,col 13)-(line 580,col 35)",
        "(line 581,col 13)-(line 581,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizer.determineLMParameter(double[], double, double[], org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizer.InternalData, int, double[], double[], double[])",
      "begin_line": 610,
      "end_line": 766,
      "comment": "\n     * Determines the Levenberg-Marquardt parameter.\n     *\n     * \u003cp\u003eThis implementation is a translation in Java of the MINPACK\n     * \u003ca href\u003d\"http://www.netlib.org/minpack/lmpar.f\"\u003elmpar\u003c/a\u003e\n     * routine.\u003c/p\u003e\n     * \u003cp\u003eThis method sets the lmPar and lmDir attributes.\u003c/p\u003e\n     * \u003cp\u003eThe authors of the original fortran function are:\u003c/p\u003e\n     * \u003cul\u003e\n     *   \u003cli\u003eArgonne National Laboratory. MINPACK project. March 1980\u003c/li\u003e\n     *   \u003cli\u003eBurton  S. Garbow\u003c/li\u003e\n     *   \u003cli\u003eKenneth E. Hillstrom\u003c/li\u003e\n     *   \u003cli\u003eJorge   J. More\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003cp\u003eLuc Maisonobe did the Java translation.\u003c/p\u003e\n     *\n     * @param qy Array containing qTy.\n     * @param delta Upper bound on the euclidean norm of diagR * lmDir.\n     * @param diag Diagonal matrix.\n     * @param internalData Data (modified in-place in this method).\n     * @param solvedCols Number of solved point.\n     * @param work1 work array\n     * @param work2 work array\n     * @param work3 work array\n     ",
      "child_ranges": [
        "(line 613,col 9)-(line 613,col 74)",
        "(line 614,col 9)-(line 614,col 59)",
        "(line 615,col 9)-(line 615,col 43)",
        "(line 616,col 9)-(line 616,col 50)",
        "(line 618,col 9)-(line 618,col 50)",
        "(line 622,col 9)-(line 624,col 9)",
        "(line 625,col 9)-(line 627,col 9)",
        "(line 628,col 9)-(line 635,col 9)",
        "(line 639,col 9)-(line 639,col 26)",
        "(line 640,col 9)-(line 645,col 9)",
        "(line 646,col 9)-(line 646,col 39)",
        "(line 647,col 9)-(line 647,col 35)",
        "(line 648,col 9)-(line 651,col 9)",
        "(line 656,col 9)-(line 656,col 20)",
        "(line 657,col 9)-(line 657,col 24)",
        "(line 658,col 9)-(line 675,col 9)",
        "(line 678,col 9)-(line 678,col 17)",
        "(line 679,col 9)-(line 687,col 9)",
        "(line 688,col 9)-(line 688,col 43)",
        "(line 689,col 9)-(line 689,col 36)",
        "(line 690,col 9)-(line 692,col 9)",
        "(line 696,col 9)-(line 696,col 62)",
        "(line 697,col 9)-(line 699,col 9)",
        "(line 701,col 9)-(line 763,col 9)",
        "(line 765,col 9)-(line 765,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizer.determineLMDirection(double[], double[], double[], org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizer.InternalData, int, double[])",
      "begin_line": 790,
      "end_line": 895,
      "comment": "\n     * Solve a*x \u003d b and d*x \u003d 0 in the least squares sense.\n     * \u003cp\u003eThis implementation is a translation in Java of the MINPACK\n     * \u003ca href\u003d\"http://www.netlib.org/minpack/qrsolv.f\"\u003eqrsolv\u003c/a\u003e\n     * routine.\u003c/p\u003e\n     * \u003cp\u003eThis method sets the lmDir and lmDiag attributes.\u003c/p\u003e\n     * \u003cp\u003eThe authors of the original fortran function are:\u003c/p\u003e\n     * \u003cul\u003e\n     *   \u003cli\u003eArgonne National Laboratory. MINPACK project. March 1980\u003c/li\u003e\n     *   \u003cli\u003eBurton  S. Garbow\u003c/li\u003e\n     *   \u003cli\u003eKenneth E. Hillstrom\u003c/li\u003e\n     *   \u003cli\u003eJorge   J. More\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003cp\u003eLuc Maisonobe did the Java translation.\u003c/p\u003e\n     *\n     * @param qy array containing qTy\n     * @param diag diagonal matrix\n     * @param lmDiag diagonal elements associated with lmDir\n     * @param internalData Data (modified in-place in this method).\n     * @param solvedCols Number of sloved point.\n     * @param work work array\n     ",
      "child_ranges": [
        "(line 795,col 9)-(line 795,col 59)",
        "(line 796,col 9)-(line 796,col 74)",
        "(line 797,col 9)-(line 797,col 50)",
        "(line 801,col 9)-(line 808,col 9)",
        "(line 811,col 9)-(line 867,col 9)",
        "(line 871,col 9)-(line 871,col 31)",
        "(line 872,col 9)-(line 879,col 9)",
        "(line 880,col 9)-(line 889,col 9)",
        "(line 892,col 9)-(line 894,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizer.qrDecomposition(org.apache.commons.math3.linear.RealMatrix, int)",
      "begin_line": 923,
      "end_line": 1000,
      "comment": "\n     * Decompose a matrix A as A.P \u003d Q.R using Householder transforms.\n     * \u003cp\u003eAs suggested in the P. Lascaux and R. Theodor book\n     * \u003ci\u003eAnalyse num\u0026eacute;rique matricielle appliqu\u0026eacute;e \u0026agrave;\n     * l\u0027art de l\u0027ing\u0026eacute;nieur\u003c/i\u003e (Masson, 1986), instead of representing\n     * the Householder transforms with u\u003csub\u003ek\u003c/sub\u003e unit vectors such that:\n     * \u003cpre\u003e\n     * H\u003csub\u003ek\u003c/sub\u003e \u003d I - 2u\u003csub\u003ek\u003c/sub\u003e.u\u003csub\u003ek\u003c/sub\u003e\u003csup\u003et\u003c/sup\u003e\n     * \u003c/pre\u003e\n     * we use \u003csub\u003ek\u003c/sub\u003e non-unit vectors such that:\n     * \u003cpre\u003e\n     * H\u003csub\u003ek\u003c/sub\u003e \u003d I - beta\u003csub\u003ek\u003c/sub\u003ev\u003csub\u003ek\u003c/sub\u003e.v\u003csub\u003ek\u003c/sub\u003e\u003csup\u003et\u003c/sup\u003e\n     * \u003c/pre\u003e\n     * where v\u003csub\u003ek\u003c/sub\u003e \u003d a\u003csub\u003ek\u003c/sub\u003e - alpha\u003csub\u003ek\u003c/sub\u003e e\u003csub\u003ek\u003c/sub\u003e.\n     * The beta\u003csub\u003ek\u003c/sub\u003e coefficients are provided upon exit as recomputing\n     * them from the v\u003csub\u003ek\u003c/sub\u003e vectors would be costly.\u003c/p\u003e\n     * \u003cp\u003eThis decomposition handles rank deficient cases since the tranformations\n     * are performed in non-increasing columns norms order thanks to columns\n     * pivoting. The diagonal elements of the R matrix are therefore also in\n     * non-increasing absolute values order.\u003c/p\u003e\n     *\n     * @param jacobian Weighted Jacobian matrix at the current point.\n     * @param solvedCols Number of solved point.\n     * @return data used in other methods of this class.\n     * @throws ConvergenceException if the decomposition cannot be performed.\n     ",
      "child_ranges": [
        "(line 927,col 9)-(line 927,col 82)",
        "(line 929,col 9)-(line 929,col 47)",
        "(line 930,col 9)-(line 930,col 50)",
        "(line 932,col 9)-(line 932,col 46)",
        "(line 933,col 9)-(line 933,col 46)",
        "(line 934,col 9)-(line 934,col 48)",
        "(line 935,col 9)-(line 935,col 45)",
        "(line 938,col 9)-(line 946,col 9)",
        "(line 949,col 9)-(line 997,col 9)",
        "(line 999,col 9)-(line 999,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizer.qTy(double[], org.apache.commons.math3.fitting.leastsquares.LevenbergMarquardtOptimizer.InternalData)",
      "begin_line": 1008,
      "end_line": 1028,
      "comment": "\n     * Compute the product Qt.y for some Q.R. decomposition.\n     *\n     * @param y vector to multiply (will be overwritten with the result)\n     * @param internalData Data.\n     ",
      "child_ranges": [
        "(line 1010,col 9)-(line 1010,col 74)",
        "(line 1011,col 9)-(line 1011,col 59)",
        "(line 1012,col 9)-(line 1012,col 48)",
        "(line 1014,col 9)-(line 1014,col 47)",
        "(line 1015,col 9)-(line 1015,col 50)",
        "(line 1017,col 9)-(line 1027,col 9)"
      ]
    }
  ]
}