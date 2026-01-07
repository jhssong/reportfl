{
  "filepath": "/tmp/Math-95b/src/test/org/apache/commons/math/estimation/GaussNewtonEstimatorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GaussNewtonEstimatorTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 89,
      "end_line": 731,
      "comment": "\n * \u003cp\u003eSome of the unit tests are re-implementations of the MINPACK \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file17\"\u003efile17\u003c/a\u003e and \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file22\"\u003efile22\u003c/a\u003e test files. \n * The redistribution policy for MINPACK is available \u003ca\n * href\u003d\"http://www.netlib.org/minpack/disclaimer\"\u003ehere\u003c/a\u003e, for\n * convenience, it is reproduced below.\u003c/p\u003e\n\n * \u003ctable border\u003d\"0\" width\u003d\"80%\" cellpadding\u003d\"10\" align\u003d\"center\" bgcolor\u003d\"#E0E0E0\"\u003e\n * \u003ctr\u003e\u003ctd\u003e\n *    Minpack Copyright Notice (1999) University of Chicago.\n *    All rights reserved\n * \u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003e\n * Redistribution and use in source and binary forms, with or without\n * modification, are permitted provided that the following conditions\n * are met:\n * \u003col\u003e\n *  \u003cli\u003eRedistributions of source code must retain the above copyright\n *      notice, this list of conditions and the following disclaimer.\u003c/li\u003e\n * \u003cli\u003eRedistributions in binary form must reproduce the above\n *     copyright notice, this list of conditions and the following\n *     disclaimer in the documentation and/or other materials provided\n *     with the distribution.\u003c/li\u003e\n * \u003cli\u003eThe end-user documentation included with the redistribution, if any,\n *     must include the following acknowledgment:\n *     \u003ccode\u003eThis product includes software developed by the University of\n *           Chicago, as Operator of Argonne National Laboratory.\u003c/code\u003e\n *     Alternately, this acknowledgment may appear in the software itself,\n *     if and wherever such third-party acknowledgments normally appear.\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eWARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED \"AS IS\"\n *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE\n *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND\n *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR\n *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES\n *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE\n *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY\n *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR\n *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF\n *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)\n *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION\n *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL\n *     BE CORRECTED.\u003c/strong\u003e\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eLIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT\n *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF\n *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,\n *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF\n *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF\n *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER\n *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT\n *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,\n *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE\n *     POSSIBILITY OF SUCH LOSS OR DAMAGES.\u003c/strong\u003e\u003c/li\u003e\n * \u003col\u003e\u003c/td\u003e\u003c/tr\u003e\n * \u003c/table\u003e\n\n * @author Argonne National Laboratory. MINPACK project. March 1980 (original fortran minpack tests)\n * @author Burton S. Garbow (original fortran minpack tests)\n * @author Kenneth E. Hillstrom (original fortran minpack tests)\n * @author Jorge J. More (original fortran minpack tests)\n * @author Luc Maisonobe (non-minpack tests and minpack tests Java translation)\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.GaussNewtonEstimatorTest(java.lang.String)",
      "begin_line": 92,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 93,col 5)-(line 93,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.testTrivial()",
      "begin_line": 96,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 97,col 5)-(line 103,col 9)",
        "(line 104,col 5)-(line 104,col 83)",
        "(line 105,col 5)-(line 105,col 32)",
        "(line 106,col 5)-(line 106,col 56)",
        "(line 107,col 5)-(line 109,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.testQRColumnsPermutation()",
      "begin_line": 112,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 114,col 5)-(line 116,col 6)",
        "(line 117,col 5)-(line 127,col 7)",
        "(line 129,col 5)-(line 129,col 83)",
        "(line 130,col 5)-(line 130,col 32)",
        "(line 131,col 5)-(line 131,col 56)",
        "(line 132,col 5)-(line 132,col 51)",
        "(line 133,col 5)-(line 133,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.testNoDependency()",
      "begin_line": 137,
      "end_line": 160,
      "comment": "",
      "child_ranges": [
        "(line 138,col 5)-(line 145,col 6)",
        "(line 146,col 5)-(line 153,col 7)",
        "(line 154,col 3)-(line 154,col 81)",
        "(line 155,col 3)-(line 155,col 30)",
        "(line 156,col 3)-(line 156,col 54)",
        "(line 157,col 3)-(line 159,col 3)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.testOneSet()",
      "begin_line": 162,
      "end_line": 188,
      "comment": "",
      "child_ranges": [
        "(line 164,col 5)-(line 168,col 6)",
        "(line 169,col 5)-(line 179,col 7)",
        "(line 181,col 5)-(line 181,col 83)",
        "(line 182,col 5)-(line 182,col 32)",
        "(line 183,col 5)-(line 183,col 56)",
        "(line 184,col 5)-(line 184,col 51)",
        "(line 185,col 5)-(line 185,col 51)",
        "(line 186,col 5)-(line 186,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.testTwoSets()",
      "begin_line": 190,
      "end_line": 237,
      "comment": "",
      "child_ranges": [
        "(line 191,col 5)-(line 198,col 6)",
        "(line 200,col 5)-(line 200,col 28)",
        "(line 201,col 5)-(line 225,col 7)",
        "(line 227,col 5)-(line 227,col 83)",
        "(line 228,col 5)-(line 228,col 32)",
        "(line 229,col 5)-(line 229,col 56)",
        "(line 230,col 5)-(line 230,col 52)",
        "(line 231,col 5)-(line 231,col 52)",
        "(line 232,col 5)-(line 232,col 52)",
        "(line 233,col 5)-(line 233,col 52)",
        "(line 234,col 5)-(line 234,col 62)",
        "(line 235,col 5)-(line 235,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.testNonInversible()",
      "begin_line": 239,
      "end_line": 268,
      "comment": "",
      "child_ranges": [
        "(line 241,col 5)-(line 245,col 6)",
        "(line 246,col 5)-(line 256,col 6)",
        "(line 257,col 5)-(line 257,col 49)",
        "(line 259,col 5)-(line 259,col 83)",
        "(line 260,col 5)-(line 267,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.testIllConditioned()",
      "begin_line": 270,
      "end_line": 322,
      "comment": "",
      "child_ranges": [
        "(line 271,col 5)-(line 276,col 6)",
        "(line 278,col 5)-(line 291,col 7)",
        "(line 292,col 5)-(line 292,col 84)",
        "(line 293,col 5)-(line 293,col 34)",
        "(line 294,col 5)-(line 294,col 58)",
        "(line 295,col 5)-(line 295,col 51)",
        "(line 296,col 5)-(line 296,col 51)",
        "(line 297,col 5)-(line 297,col 51)",
        "(line 298,col 5)-(line 298,col 51)",
        "(line 300,col 5)-(line 313,col 7)",
        "(line 314,col 5)-(line 314,col 84)",
        "(line 315,col 5)-(line 315,col 34)",
        "(line 316,col 5)-(line 316,col 58)",
        "(line 317,col 5)-(line 317,col 52)",
        "(line 318,col 5)-(line 318,col 52)",
        "(line 319,col 5)-(line 319,col 52)",
        "(line 320,col 5)-(line 320,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.testMoreEstimatedParametersSimple()",
      "begin_line": 324,
      "end_line": 354,
      "comment": "",
      "child_ranges": [
        "(line 326,col 5)-(line 331,col 7)",
        "(line 332,col 5)-(line 342,col 7)",
        "(line 344,col 5)-(line 344,col 83)",
        "(line 345,col 5)-(line 352,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.testMoreEstimatedParametersUnsorted()",
      "begin_line": 356,
      "end_line": 393,
      "comment": "",
      "child_ranges": [
        "(line 357,col 5)-(line 364,col 6)",
        "(line 365,col 5)-(line 381,col 7)",
        "(line 383,col 5)-(line 383,col 83)",
        "(line 384,col 5)-(line 391,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.testRedundantEquations()",
      "begin_line": 395,
      "end_line": 421,
      "comment": "",
      "child_ranges": [
        "(line 396,col 5)-(line 399,col 6)",
        "(line 400,col 5)-(line 410,col 7)",
        "(line 412,col 5)-(line 412,col 83)",
        "(line 413,col 5)-(line 413,col 32)",
        "(line 414,col 5)-(line 414,col 56)",
        "(line 415,col 5)-(line 415,col 58)",
        "(line 416,col 5)-(line 419,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.testInconsistentEquations()",
      "begin_line": 423,
      "end_line": 444,
      "comment": "",
      "child_ranges": [
        "(line 424,col 5)-(line 427,col 6)",
        "(line 428,col 5)-(line 438,col 7)",
        "(line 440,col 5)-(line 440,col 83)",
        "(line 441,col 5)-(line 441,col 32)",
        "(line 442,col 5)-(line 442,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.testBoundParameters()",
      "begin_line": 446,
      "end_line": 482,
      "comment": "",
      "child_ranges": [
        "(line 447,col 7)-(line 451,col 8)",
        "(line 452,col 7)-(line 462,col 9)",
        "(line 464,col 7)-(line 464,col 85)",
        "(line 465,col 7)-(line 465,col 34)",
        "(line 466,col 7)-(line 466,col 54)",
        "(line 467,col 7)-(line 467,col 65)",
        "(line 468,col 7)-(line 468,col 25)",
        "(line 469,col 7)-(line 472,col 7)",
        "(line 473,col 7)-(line 473,col 60)",
        "(line 474,col 7)-(line 474,col 60)",
        "(line 475,col 7)-(line 475,col 60)",
        "(line 476,col 7)-(line 476,col 60)",
        "(line 478,col 7)-(line 478,col 65)",
        "(line 479,col 7)-(line 479,col 43)",
        "(line 480,col 7)-(line 480,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.testMaxIterations()",
      "begin_line": 484,
      "end_line": 500,
      "comment": "",
      "child_ranges": [
        "(line 485,col 7)-(line 485,col 49)",
        "(line 486,col 7)-(line 486,col 36)",
        "(line 487,col 7)-(line 487,col 36)",
        "(line 488,col 7)-(line 488,col 36)",
        "(line 489,col 7)-(line 489,col 36)",
        "(line 490,col 7)-(line 490,col 36)",
        "(line 491,col 7)-(line 499,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.testCircleFitting()",
      "begin_line": 502,
      "end_line": 516,
      "comment": "",
      "child_ranges": [
        "(line 503,col 7)-(line 503,col 49)",
        "(line 504,col 7)-(line 504,col 36)",
        "(line 505,col 7)-(line 505,col 36)",
        "(line 506,col 7)-(line 506,col 36)",
        "(line 507,col 7)-(line 507,col 36)",
        "(line 508,col 7)-(line 508,col 36)",
        "(line 509,col 7)-(line 509,col 87)",
        "(line 510,col 7)-(line 510,col 33)",
        "(line 511,col 7)-(line 511,col 44)",
        "(line 512,col 7)-(line 512,col 81)",
        "(line 513,col 7)-(line 513,col 67)",
        "(line 514,col 7)-(line 514,col 67)",
        "(line 515,col 7)-(line 515,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.testCircleFittingBadInit()",
      "begin_line": 518,
      "end_line": 563,
      "comment": "",
      "child_ranges": [
        "(line 519,col 5)-(line 519,col 41)",
        "(line 520,col 5)-(line 550,col 6)",
        "(line 551,col 5)-(line 553,col 5)",
        "(line 554,col 5)-(line 554,col 83)",
        "(line 555,col 5)-(line 562,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LinearProblem",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.SimpleEstimationProblem"
      ],
      "begin_line": 565,
      "end_line": 581,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearProblem.LinearProblem(org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement[])",
      "begin_line": 567,
      "end_line": 579,
      "comment": "",
      "child_ranges": [
        "(line 568,col 7)-(line 568,col 74)",
        "(line 569,col 7)-(line 575,col 7)",
        "(line 576,col 7)-(line 578,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LinearMeasurement",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.WeightedMeasurement"
      ],
      "begin_line": 583,
      "end_line": 618,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement.LinearMeasurement(double[], org.apache.commons.math.estimation.EstimatedParameter[], double)",
      "begin_line": 585,
      "end_line": 591,
      "comment": "",
      "child_ranges": [
        "(line 587,col 7)-(line 587,col 33)",
        "(line 588,col 7)-(line 588,col 29)",
        "(line 589,col 7)-(line 589,col 35)",
        "(line 590,col 7)-(line 590,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement.getTheoreticalValue()",
      "begin_line": 593,
      "end_line": 599,
      "comment": "",
      "child_ranges": [
        "(line 594,col 7)-(line 594,col 19)",
        "(line 595,col 7)-(line 597,col 7)",
        "(line 598,col 7)-(line 598,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement.getPartial(org.apache.commons.math.estimation.EstimatedParameter)",
      "begin_line": 601,
      "end_line": 608,
      "comment": "",
      "child_ranges": [
        "(line 602,col 7)-(line 606,col 7)",
        "(line 607,col 7)-(line 607,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement.getParameters()",
      "begin_line": 610,
      "end_line": 612,
      "comment": "",
      "child_ranges": [
        "(line 611,col 7)-(line 611,col 24)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "factors"
      ],
      "begin_line": 614,
      "end_line": 614,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parameters"
      ],
      "begin_line": 615,
      "end_line": 615,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 616,
      "end_line": 616,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Circle",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.EstimationProblem"
      ],
      "begin_line": 620,
      "end_line": 725,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.Circle(double, double)",
      "begin_line": 622,
      "end_line": 626,
      "comment": "",
      "child_ranges": [
        "(line 623,col 7)-(line 623,col 49)",
        "(line 624,col 7)-(line 624,col 73)",
        "(line 625,col 7)-(line 625,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.addPoint(double, double)",
      "begin_line": 628,
      "end_line": 630,
      "comment": "",
      "child_ranges": [
        "(line 629,col 7)-(line 629,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.getM()",
      "begin_line": 632,
      "end_line": 634,
      "comment": "",
      "child_ranges": [
        "(line 633,col 7)-(line 633,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.getMeasurements()",
      "begin_line": 636,
      "end_line": 638,
      "comment": "",
      "child_ranges": [
        "(line 637,col 7)-(line 637,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.getAllParameters()",
      "begin_line": 640,
      "end_line": 642,
      "comment": "",
      "child_ranges": [
        "(line 641,col 7)-(line 641,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.getUnboundParameters()",
      "begin_line": 644,
      "end_line": 646,
      "comment": "",
      "child_ranges": [
        "(line 645,col 7)-(line 645,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.getPartialRadiusX()",
      "begin_line": 648,
      "end_line": 654,
      "comment": "",
      "child_ranges": [
        "(line 649,col 7)-(line 649,col 22)",
        "(line 650,col 7)-(line 652,col 7)",
        "(line 653,col 7)-(line 653,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.getPartialRadiusY()",
      "begin_line": 656,
      "end_line": 662,
      "comment": "",
      "child_ranges": [
        "(line 657,col 7)-(line 657,col 22)",
        "(line 658,col 7)-(line 660,col 7)",
        "(line 661,col 7)-(line 661,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.getRadius()",
      "begin_line": 664,
      "end_line": 670,
      "comment": "",
      "child_ranges": [
        "(line 665,col 7)-(line 665,col 19)",
        "(line 666,col 7)-(line 668,col 7)",
        "(line 669,col 7)-(line 669,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.getX()",
      "begin_line": 672,
      "end_line": 674,
      "comment": "",
      "child_ranges": [
        "(line 673,col 7)-(line 673,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.getY()",
      "begin_line": 676,
      "end_line": 678,
      "comment": "",
      "child_ranges": [
        "(line 677,col 7)-(line 677,col 30)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PointModel",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.WeightedMeasurement"
      ],
      "begin_line": 680,
      "end_line": 719,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.PointModel.PointModel(double, double)",
      "begin_line": 682,
      "end_line": 686,
      "comment": "",
      "child_ranges": [
        "(line 683,col 9)-(line 683,col 24)",
        "(line 684,col 9)-(line 684,col 21)",
        "(line 685,col 9)-(line 685,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.PointModel.getPartial(org.apache.commons.math.estimation.EstimatedParameter)",
      "begin_line": 688,
      "end_line": 695,
      "comment": "",
      "child_ranges": [
        "(line 689,col 9)-(line 693,col 9)",
        "(line 694,col 9)-(line 694,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.PointModel.getCenterDistance()",
      "begin_line": 697,
      "end_line": 701,
      "comment": "",
      "child_ranges": [
        "(line 698,col 9)-(line 698,col 42)",
        "(line 699,col 9)-(line 699,col 42)",
        "(line 700,col 9)-(line 700,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.PointModel.getPartialDiX()",
      "begin_line": 703,
      "end_line": 705,
      "comment": "",
      "child_ranges": [
        "(line 704,col 9)-(line 704,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.PointModel.getPartialDiY()",
      "begin_line": 707,
      "end_line": 709,
      "comment": "",
      "child_ranges": [
        "(line 708,col 9)-(line 708,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.PointModel.getTheoreticalValue()",
      "begin_line": 711,
      "end_line": 713,
      "comment": "",
      "child_ranges": [
        "(line 712,col 9)-(line 712,col 49)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "px"
      ],
      "begin_line": 715,
      "end_line": 715,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "py"
      ],
      "begin_line": 716,
      "end_line": 716,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 717,
      "end_line": 717,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cx"
      ],
      "begin_line": 721,
      "end_line": 721,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cy"
      ],
      "begin_line": 722,
      "end_line": 722,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "points"
      ],
      "begin_line": 723,
      "end_line": 723,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.suite()",
      "begin_line": 727,
      "end_line": 729,
      "comment": "",
      "child_ranges": [
        "(line 728,col 5)-(line 728,col 57)"
      ]
    }
  ]
}