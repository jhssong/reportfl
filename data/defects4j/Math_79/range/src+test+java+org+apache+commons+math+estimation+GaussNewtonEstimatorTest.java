{
  "filepath": "/tmp/Math-79b/src/test/java/org/apache/commons/math/estimation/GaussNewtonEstimatorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GaussNewtonEstimatorTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 89,
      "end_line": 738,
      "comment": "\n * \u003cp\u003eSome of the unit tests are re-implementations of the MINPACK \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file17\"\u003efile17\u003c/a\u003e and \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file22\"\u003efile22\u003c/a\u003e test files.\n * The redistribution policy for MINPACK is available \u003ca\n * href\u003d\"http://www.netlib.org/minpack/disclaimer\"\u003ehere\u003c/a\u003e, for\n * convenience, it is reproduced below.\u003c/p\u003e\n\n * \u003ctable border\u003d\"0\" width\u003d\"80%\" cellpadding\u003d\"10\" align\u003d\"center\" bgcolor\u003d\"#E0E0E0\"\u003e\n * \u003ctr\u003e\u003ctd\u003e\n *    Minpack Copyright Notice (1999) University of Chicago.\n *    All rights reserved\n * \u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003e\n * Redistribution and use in source and binary forms, with or without\n * modification, are permitted provided that the following conditions\n * are met:\n * \u003col\u003e\n *  \u003cli\u003eRedistributions of source code must retain the above copyright\n *      notice, this list of conditions and the following disclaimer.\u003c/li\u003e\n * \u003cli\u003eRedistributions in binary form must reproduce the above\n *     copyright notice, this list of conditions and the following\n *     disclaimer in the documentation and/or other materials provided\n *     with the distribution.\u003c/li\u003e\n * \u003cli\u003eThe end-user documentation included with the redistribution, if any,\n *     must include the following acknowledgment:\n *     \u003ccode\u003eThis product includes software developed by the University of\n *           Chicago, as Operator of Argonne National Laboratory.\u003c/code\u003e\n *     Alternately, this acknowledgment may appear in the software itself,\n *     if and wherever such third-party acknowledgments normally appear.\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eWARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED \"AS IS\"\n *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE\n *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND\n *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR\n *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES\n *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE\n *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY\n *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR\n *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF\n *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)\n *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION\n *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL\n *     BE CORRECTED.\u003c/strong\u003e\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eLIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT\n *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF\n *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,\n *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF\n *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF\n *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER\n *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT\n *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,\n *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE\n *     POSSIBILITY OF SUCH LOSS OR DAMAGES.\u003c/strong\u003e\u003c/li\u003e\n * \u003col\u003e\u003c/td\u003e\u003c/tr\u003e\n * \u003c/table\u003e\n\n * @author Argonne National Laboratory. MINPACK project. March 1980 (original fortran minpack tests)\n * @author Burton S. Garbow (original fortran minpack tests)\n * @author Kenneth E. Hillstrom (original fortran minpack tests)\n * @author Jorge J. More (original fortran minpack tests)\n * @author Luc Maisonobe (non-minpack tests and minpack tests Java translation)\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.GaussNewtonEstimatorTest(java.lang.String)",
      "begin_line": 93,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 94,col 5)-(line 94,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.testTrivial()",
      "begin_line": 97,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 98,col 5)-(line 104,col 9)",
        "(line 105,col 5)-(line 105,col 83)",
        "(line 106,col 5)-(line 106,col 32)",
        "(line 107,col 5)-(line 107,col 56)",
        "(line 108,col 5)-(line 110,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.testQRColumnsPermutation()",
      "begin_line": 113,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 115,col 5)-(line 117,col 6)",
        "(line 118,col 5)-(line 128,col 7)",
        "(line 130,col 5)-(line 130,col 83)",
        "(line 131,col 5)-(line 131,col 32)",
        "(line 132,col 5)-(line 132,col 56)",
        "(line 133,col 5)-(line 133,col 51)",
        "(line 134,col 5)-(line 134,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.testNoDependency()",
      "begin_line": 138,
      "end_line": 161,
      "comment": "",
      "child_ranges": [
        "(line 139,col 5)-(line 146,col 6)",
        "(line 147,col 5)-(line 154,col 7)",
        "(line 155,col 3)-(line 155,col 81)",
        "(line 156,col 3)-(line 156,col 30)",
        "(line 157,col 3)-(line 157,col 54)",
        "(line 158,col 3)-(line 160,col 3)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.testOneSet()",
      "begin_line": 163,
      "end_line": 189,
      "comment": "",
      "child_ranges": [
        "(line 165,col 5)-(line 169,col 6)",
        "(line 170,col 5)-(line 180,col 7)",
        "(line 182,col 5)-(line 182,col 83)",
        "(line 183,col 5)-(line 183,col 32)",
        "(line 184,col 5)-(line 184,col 56)",
        "(line 185,col 5)-(line 185,col 51)",
        "(line 186,col 5)-(line 186,col 51)",
        "(line 187,col 5)-(line 187,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.testTwoSets()",
      "begin_line": 191,
      "end_line": 238,
      "comment": "",
      "child_ranges": [
        "(line 192,col 5)-(line 199,col 6)",
        "(line 201,col 5)-(line 201,col 28)",
        "(line 202,col 5)-(line 226,col 7)",
        "(line 228,col 5)-(line 228,col 83)",
        "(line 229,col 5)-(line 229,col 32)",
        "(line 230,col 5)-(line 230,col 56)",
        "(line 231,col 5)-(line 231,col 52)",
        "(line 232,col 5)-(line 232,col 52)",
        "(line 233,col 5)-(line 233,col 52)",
        "(line 234,col 5)-(line 234,col 52)",
        "(line 235,col 5)-(line 235,col 62)",
        "(line 236,col 5)-(line 236,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.testNonInversible()",
      "begin_line": 240,
      "end_line": 269,
      "comment": "",
      "child_ranges": [
        "(line 242,col 5)-(line 246,col 6)",
        "(line 247,col 5)-(line 257,col 6)",
        "(line 258,col 5)-(line 258,col 49)",
        "(line 260,col 5)-(line 260,col 83)",
        "(line 261,col 5)-(line 268,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.testIllConditioned()",
      "begin_line": 271,
      "end_line": 323,
      "comment": "",
      "child_ranges": [
        "(line 272,col 5)-(line 277,col 6)",
        "(line 279,col 5)-(line 292,col 7)",
        "(line 293,col 5)-(line 293,col 84)",
        "(line 294,col 5)-(line 294,col 34)",
        "(line 295,col 5)-(line 295,col 58)",
        "(line 296,col 5)-(line 296,col 51)",
        "(line 297,col 5)-(line 297,col 51)",
        "(line 298,col 5)-(line 298,col 51)",
        "(line 299,col 5)-(line 299,col 51)",
        "(line 301,col 5)-(line 314,col 7)",
        "(line 315,col 5)-(line 315,col 84)",
        "(line 316,col 5)-(line 316,col 34)",
        "(line 317,col 5)-(line 317,col 58)",
        "(line 318,col 5)-(line 318,col 52)",
        "(line 319,col 5)-(line 319,col 52)",
        "(line 320,col 5)-(line 320,col 52)",
        "(line 321,col 5)-(line 321,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.testMoreEstimatedParametersSimple()",
      "begin_line": 325,
      "end_line": 355,
      "comment": "",
      "child_ranges": [
        "(line 327,col 5)-(line 332,col 7)",
        "(line 333,col 5)-(line 343,col 7)",
        "(line 345,col 5)-(line 345,col 83)",
        "(line 346,col 5)-(line 353,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.testMoreEstimatedParametersUnsorted()",
      "begin_line": 357,
      "end_line": 394,
      "comment": "",
      "child_ranges": [
        "(line 358,col 5)-(line 365,col 6)",
        "(line 366,col 5)-(line 382,col 7)",
        "(line 384,col 5)-(line 384,col 83)",
        "(line 385,col 5)-(line 392,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.testRedundantEquations()",
      "begin_line": 396,
      "end_line": 422,
      "comment": "",
      "child_ranges": [
        "(line 397,col 5)-(line 400,col 6)",
        "(line 401,col 5)-(line 411,col 7)",
        "(line 413,col 5)-(line 413,col 83)",
        "(line 414,col 5)-(line 414,col 32)",
        "(line 415,col 5)-(line 415,col 56)",
        "(line 416,col 5)-(line 416,col 58)",
        "(line 417,col 5)-(line 420,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.testInconsistentEquations()",
      "begin_line": 424,
      "end_line": 445,
      "comment": "",
      "child_ranges": [
        "(line 425,col 5)-(line 428,col 6)",
        "(line 429,col 5)-(line 439,col 7)",
        "(line 441,col 5)-(line 441,col 83)",
        "(line 442,col 5)-(line 442,col 32)",
        "(line 443,col 5)-(line 443,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.testBoundParameters()",
      "begin_line": 447,
      "end_line": 483,
      "comment": "",
      "child_ranges": [
        "(line 448,col 7)-(line 452,col 8)",
        "(line 453,col 7)-(line 463,col 9)",
        "(line 465,col 7)-(line 465,col 85)",
        "(line 466,col 7)-(line 466,col 34)",
        "(line 467,col 7)-(line 467,col 54)",
        "(line 468,col 7)-(line 468,col 65)",
        "(line 469,col 7)-(line 469,col 25)",
        "(line 470,col 7)-(line 473,col 7)",
        "(line 474,col 7)-(line 474,col 60)",
        "(line 475,col 7)-(line 475,col 60)",
        "(line 476,col 7)-(line 476,col 60)",
        "(line 477,col 7)-(line 477,col 60)",
        "(line 479,col 7)-(line 479,col 65)",
        "(line 480,col 7)-(line 480,col 43)",
        "(line 481,col 7)-(line 481,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.testMaxIterations()",
      "begin_line": 485,
      "end_line": 501,
      "comment": "",
      "child_ranges": [
        "(line 486,col 7)-(line 486,col 49)",
        "(line 487,col 7)-(line 487,col 36)",
        "(line 488,col 7)-(line 488,col 36)",
        "(line 489,col 7)-(line 489,col 36)",
        "(line 490,col 7)-(line 490,col 36)",
        "(line 491,col 7)-(line 491,col 36)",
        "(line 492,col 7)-(line 500,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.testCircleFitting()",
      "begin_line": 503,
      "end_line": 517,
      "comment": "",
      "child_ranges": [
        "(line 504,col 7)-(line 504,col 49)",
        "(line 505,col 7)-(line 505,col 36)",
        "(line 506,col 7)-(line 506,col 36)",
        "(line 507,col 7)-(line 507,col 36)",
        "(line 508,col 7)-(line 508,col 36)",
        "(line 509,col 7)-(line 509,col 36)",
        "(line 510,col 7)-(line 510,col 87)",
        "(line 511,col 7)-(line 511,col 33)",
        "(line 512,col 7)-(line 512,col 44)",
        "(line 513,col 7)-(line 513,col 81)",
        "(line 514,col 7)-(line 514,col 67)",
        "(line 515,col 7)-(line 515,col 67)",
        "(line 516,col 7)-(line 516,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.testCircleFittingBadInit()",
      "begin_line": 519,
      "end_line": 564,
      "comment": "",
      "child_ranges": [
        "(line 520,col 5)-(line 520,col 41)",
        "(line 521,col 5)-(line 551,col 6)",
        "(line 552,col 5)-(line 554,col 5)",
        "(line 555,col 5)-(line 555,col 83)",
        "(line 556,col 5)-(line 563,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LinearProblem",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.SimpleEstimationProblem"
      ],
      "begin_line": 566,
      "end_line": 582,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearProblem.LinearProblem(org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement[])",
      "begin_line": 568,
      "end_line": 580,
      "comment": "",
      "child_ranges": [
        "(line 569,col 7)-(line 569,col 74)",
        "(line 570,col 7)-(line 576,col 7)",
        "(line 577,col 7)-(line 579,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LinearMeasurement",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.WeightedMeasurement"
      ],
      "begin_line": 584,
      "end_line": 621,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement.LinearMeasurement(double[], org.apache.commons.math.estimation.EstimatedParameter[], double)",
      "begin_line": 586,
      "end_line": 592,
      "comment": "",
      "child_ranges": [
        "(line 588,col 7)-(line 588,col 33)",
        "(line 589,col 7)-(line 589,col 29)",
        "(line 590,col 7)-(line 590,col 35)",
        "(line 591,col 7)-(line 591,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement.getTheoreticalValue()",
      "begin_line": 594,
      "end_line": 601,
      "comment": "",
      "child_ranges": [
        "(line 596,col 7)-(line 596,col 19)",
        "(line 597,col 7)-(line 599,col 7)",
        "(line 600,col 7)-(line 600,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement.getPartial(org.apache.commons.math.estimation.EstimatedParameter)",
      "begin_line": 603,
      "end_line": 611,
      "comment": "",
      "child_ranges": [
        "(line 605,col 7)-(line 609,col 7)",
        "(line 610,col 7)-(line 610,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement.getParameters()",
      "begin_line": 613,
      "end_line": 615,
      "comment": "",
      "child_ranges": [
        "(line 614,col 7)-(line 614,col 24)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "factors"
      ],
      "begin_line": 617,
      "end_line": 617,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parameters"
      ],
      "begin_line": 618,
      "end_line": 618,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 619,
      "end_line": 619,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Circle",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.EstimationProblem"
      ],
      "begin_line": 623,
      "end_line": 732,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.Circle(double, double)",
      "begin_line": 625,
      "end_line": 629,
      "comment": "",
      "child_ranges": [
        "(line 626,col 7)-(line 626,col 49)",
        "(line 627,col 7)-(line 627,col 73)",
        "(line 628,col 7)-(line 628,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.addPoint(double, double)",
      "begin_line": 631,
      "end_line": 633,
      "comment": "",
      "child_ranges": [
        "(line 632,col 7)-(line 632,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.getM()",
      "begin_line": 635,
      "end_line": 637,
      "comment": "",
      "child_ranges": [
        "(line 636,col 7)-(line 636,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.getMeasurements()",
      "begin_line": 639,
      "end_line": 641,
      "comment": "",
      "child_ranges": [
        "(line 640,col 7)-(line 640,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.getAllParameters()",
      "begin_line": 643,
      "end_line": 645,
      "comment": "",
      "child_ranges": [
        "(line 644,col 7)-(line 644,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.getUnboundParameters()",
      "begin_line": 647,
      "end_line": 649,
      "comment": "",
      "child_ranges": [
        "(line 648,col 7)-(line 648,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.getPartialRadiusX()",
      "begin_line": 651,
      "end_line": 657,
      "comment": "",
      "child_ranges": [
        "(line 652,col 7)-(line 652,col 22)",
        "(line 653,col 7)-(line 655,col 7)",
        "(line 656,col 7)-(line 656,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.getPartialRadiusY()",
      "begin_line": 659,
      "end_line": 665,
      "comment": "",
      "child_ranges": [
        "(line 660,col 7)-(line 660,col 22)",
        "(line 661,col 7)-(line 663,col 7)",
        "(line 664,col 7)-(line 664,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.getRadius()",
      "begin_line": 667,
      "end_line": 673,
      "comment": "",
      "child_ranges": [
        "(line 668,col 7)-(line 668,col 19)",
        "(line 669,col 7)-(line 671,col 7)",
        "(line 672,col 7)-(line 672,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.getX()",
      "begin_line": 675,
      "end_line": 677,
      "comment": "",
      "child_ranges": [
        "(line 676,col 7)-(line 676,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.getY()",
      "begin_line": 679,
      "end_line": 681,
      "comment": "",
      "child_ranges": [
        "(line 680,col 7)-(line 680,col 30)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PointModel",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.WeightedMeasurement"
      ],
      "begin_line": 683,
      "end_line": 726,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.PointModel.PointModel(org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle, double, double)",
      "begin_line": 685,
      "end_line": 690,
      "comment": "",
      "child_ranges": [
        "(line 686,col 9)-(line 686,col 24)",
        "(line 687,col 9)-(line 687,col 21)",
        "(line 688,col 9)-(line 688,col 21)",
        "(line 689,col 9)-(line 689,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.PointModel.getPartial(org.apache.commons.math.estimation.EstimatedParameter)",
      "begin_line": 692,
      "end_line": 700,
      "comment": "",
      "child_ranges": [
        "(line 694,col 9)-(line 698,col 9)",
        "(line 699,col 9)-(line 699,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.PointModel.getCenterDistance()",
      "begin_line": 702,
      "end_line": 706,
      "comment": "",
      "child_ranges": [
        "(line 703,col 9)-(line 703,col 49)",
        "(line 704,col 9)-(line 704,col 49)",
        "(line 705,col 9)-(line 705,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.PointModel.getPartialDiX()",
      "begin_line": 708,
      "end_line": 710,
      "comment": "",
      "child_ranges": [
        "(line 709,col 9)-(line 709,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.PointModel.getPartialDiY()",
      "begin_line": 712,
      "end_line": 714,
      "comment": "",
      "child_ranges": [
        "(line 713,col 9)-(line 713,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.PointModel.getTheoreticalValue()",
      "begin_line": 716,
      "end_line": 719,
      "comment": "",
      "child_ranges": [
        "(line 718,col 9)-(line 718,col 56)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "px"
      ],
      "begin_line": 721,
      "end_line": 721,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "py"
      ],
      "begin_line": 722,
      "end_line": 722,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "circle"
      ],
      "begin_line": 723,
      "end_line": 723,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 724,
      "end_line": 724,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cx"
      ],
      "begin_line": 728,
      "end_line": 728,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cy"
      ],
      "begin_line": 729,
      "end_line": 729,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "points"
      ],
      "begin_line": 730,
      "end_line": 730,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.suite()",
      "begin_line": 734,
      "end_line": 736,
      "comment": "",
      "child_ranges": [
        "(line 735,col 5)-(line 735,col 57)"
      ]
    }
  ]
}