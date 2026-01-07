{
  "filepath": "/tmp/Math-100b/src/test/org/apache/commons/math/estimation/GaussNewtonEstimatorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GaussNewtonEstimatorTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 94,
      "end_line": 736,
      "comment": "\n * \u003cp\u003eSome of the unit tests are re-implementations of the MINPACK \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file17\"\u003efile17\u003c/a\u003e and \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file22\"\u003efile22\u003c/a\u003e test files. \n * The redistribution policy for MINPACK is available \u003ca\n * href\u003d\"http://www.netlib.org/minpack/disclaimer\"\u003ehere\u003c/a\u003e, for\n * convenience, it is reproduced below.\u003c/p\u003e\n\n * \u003ctable border\u003d\"0\" width\u003d\"80%\" cellpadding\u003d\"10\" align\u003d\"center\" bgcolor\u003d\"#E0E0E0\"\u003e\n * \u003ctr\u003e\u003ctd\u003e\n *    Minpack Copyright Notice (1999) University of Chicago.\n *    All rights reserved\n * \u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003e\n * Redistribution and use in source and binary forms, with or without\n * modification, are permitted provided that the following conditions\n * are met:\n * \u003col\u003e\n *  \u003cli\u003eRedistributions of source code must retain the above copyright\n *      notice, this list of conditions and the following disclaimer.\u003c/li\u003e\n * \u003cli\u003eRedistributions in binary form must reproduce the above\n *     copyright notice, this list of conditions and the following\n *     disclaimer in the documentation and/or other materials provided\n *     with the distribution.\u003c/li\u003e\n * \u003cli\u003eThe end-user documentation included with the redistribution, if any,\n *     must include the following acknowledgment:\n *     \u003ccode\u003eThis product includes software developed by the University of\n *           Chicago, as Operator of Argonne National Laboratory.\u003c/code\u003e\n *     Alternately, this acknowledgment may appear in the software itself,\n *     if and wherever such third-party acknowledgments normally appear.\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eWARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED \"AS IS\"\n *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE\n *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND\n *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR\n *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES\n *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE\n *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY\n *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR\n *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF\n *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)\n *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION\n *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL\n *     BE CORRECTED.\u003c/strong\u003e\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eLIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT\n *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF\n *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,\n *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF\n *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF\n *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER\n *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT\n *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,\n *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE\n *     POSSIBILITY OF SUCH LOSS OR DAMAGES.\u003c/strong\u003e\u003c/li\u003e\n * \u003col\u003e\u003c/td\u003e\u003c/tr\u003e\n * \u003c/table\u003e\n\n * @author Argonne National Laboratory. MINPACK project. March 1980 (original fortran minpack tests)\n * @author Burton S. Garbow (original fortran minpack tests)\n * @author Kenneth E. Hillstrom (original fortran minpack tests)\n * @author Jorge J. More (original fortran minpack tests)\n * @author Luc Maisonobe (non-minpack tests and minpack tests Java translation)\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.GaussNewtonEstimatorTest(java.lang.String)",
      "begin_line": 97,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 98,col 5)-(line 98,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.testTrivial()",
      "begin_line": 101,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 102,col 5)-(line 108,col 9)",
        "(line 109,col 5)-(line 109,col 83)",
        "(line 110,col 5)-(line 110,col 32)",
        "(line 111,col 5)-(line 111,col 56)",
        "(line 112,col 5)-(line 114,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.testQRColumnsPermutation()",
      "begin_line": 117,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 119,col 5)-(line 121,col 6)",
        "(line 122,col 5)-(line 132,col 7)",
        "(line 134,col 5)-(line 134,col 83)",
        "(line 135,col 5)-(line 135,col 32)",
        "(line 136,col 5)-(line 136,col 56)",
        "(line 137,col 5)-(line 137,col 51)",
        "(line 138,col 5)-(line 138,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.testNoDependency()",
      "begin_line": 142,
      "end_line": 165,
      "comment": "",
      "child_ranges": [
        "(line 143,col 5)-(line 150,col 6)",
        "(line 151,col 5)-(line 158,col 7)",
        "(line 159,col 3)-(line 159,col 81)",
        "(line 160,col 3)-(line 160,col 30)",
        "(line 161,col 3)-(line 161,col 54)",
        "(line 162,col 3)-(line 164,col 3)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.testOneSet()",
      "begin_line": 167,
      "end_line": 193,
      "comment": "",
      "child_ranges": [
        "(line 169,col 5)-(line 173,col 6)",
        "(line 174,col 5)-(line 184,col 7)",
        "(line 186,col 5)-(line 186,col 83)",
        "(line 187,col 5)-(line 187,col 32)",
        "(line 188,col 5)-(line 188,col 56)",
        "(line 189,col 5)-(line 189,col 51)",
        "(line 190,col 5)-(line 190,col 51)",
        "(line 191,col 5)-(line 191,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.testTwoSets()",
      "begin_line": 195,
      "end_line": 242,
      "comment": "",
      "child_ranges": [
        "(line 196,col 5)-(line 203,col 6)",
        "(line 205,col 5)-(line 205,col 28)",
        "(line 206,col 5)-(line 230,col 7)",
        "(line 232,col 5)-(line 232,col 83)",
        "(line 233,col 5)-(line 233,col 32)",
        "(line 234,col 5)-(line 234,col 56)",
        "(line 235,col 5)-(line 235,col 52)",
        "(line 236,col 5)-(line 236,col 52)",
        "(line 237,col 5)-(line 237,col 52)",
        "(line 238,col 5)-(line 238,col 52)",
        "(line 239,col 5)-(line 239,col 62)",
        "(line 240,col 5)-(line 240,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.testNonInversible()",
      "begin_line": 244,
      "end_line": 273,
      "comment": "",
      "child_ranges": [
        "(line 246,col 5)-(line 250,col 6)",
        "(line 251,col 5)-(line 261,col 6)",
        "(line 262,col 5)-(line 262,col 49)",
        "(line 264,col 5)-(line 264,col 83)",
        "(line 265,col 5)-(line 272,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.testIllConditioned()",
      "begin_line": 275,
      "end_line": 327,
      "comment": "",
      "child_ranges": [
        "(line 276,col 5)-(line 281,col 6)",
        "(line 283,col 5)-(line 296,col 7)",
        "(line 297,col 5)-(line 297,col 84)",
        "(line 298,col 5)-(line 298,col 34)",
        "(line 299,col 5)-(line 299,col 58)",
        "(line 300,col 5)-(line 300,col 51)",
        "(line 301,col 5)-(line 301,col 51)",
        "(line 302,col 5)-(line 302,col 51)",
        "(line 303,col 5)-(line 303,col 51)",
        "(line 305,col 5)-(line 318,col 7)",
        "(line 319,col 5)-(line 319,col 84)",
        "(line 320,col 5)-(line 320,col 34)",
        "(line 321,col 5)-(line 321,col 58)",
        "(line 322,col 5)-(line 322,col 52)",
        "(line 323,col 5)-(line 323,col 52)",
        "(line 324,col 5)-(line 324,col 52)",
        "(line 325,col 5)-(line 325,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.testMoreEstimatedParametersSimple()",
      "begin_line": 329,
      "end_line": 359,
      "comment": "",
      "child_ranges": [
        "(line 331,col 5)-(line 336,col 7)",
        "(line 337,col 5)-(line 347,col 7)",
        "(line 349,col 5)-(line 349,col 83)",
        "(line 350,col 5)-(line 357,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.testMoreEstimatedParametersUnsorted()",
      "begin_line": 361,
      "end_line": 398,
      "comment": "",
      "child_ranges": [
        "(line 362,col 5)-(line 369,col 6)",
        "(line 370,col 5)-(line 386,col 7)",
        "(line 388,col 5)-(line 388,col 83)",
        "(line 389,col 5)-(line 396,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.testRedundantEquations()",
      "begin_line": 400,
      "end_line": 426,
      "comment": "",
      "child_ranges": [
        "(line 401,col 5)-(line 404,col 6)",
        "(line 405,col 5)-(line 415,col 7)",
        "(line 417,col 5)-(line 417,col 83)",
        "(line 418,col 5)-(line 418,col 32)",
        "(line 419,col 5)-(line 419,col 56)",
        "(line 420,col 5)-(line 420,col 58)",
        "(line 421,col 5)-(line 424,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.testInconsistentEquations()",
      "begin_line": 428,
      "end_line": 449,
      "comment": "",
      "child_ranges": [
        "(line 429,col 5)-(line 432,col 6)",
        "(line 433,col 5)-(line 443,col 7)",
        "(line 445,col 5)-(line 445,col 83)",
        "(line 446,col 5)-(line 446,col 32)",
        "(line 447,col 5)-(line 447,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.testBoundParameters()",
      "begin_line": 451,
      "end_line": 487,
      "comment": "",
      "child_ranges": [
        "(line 452,col 7)-(line 456,col 8)",
        "(line 457,col 7)-(line 467,col 9)",
        "(line 469,col 7)-(line 469,col 85)",
        "(line 470,col 7)-(line 470,col 34)",
        "(line 471,col 7)-(line 471,col 54)",
        "(line 472,col 7)-(line 472,col 65)",
        "(line 473,col 7)-(line 473,col 25)",
        "(line 474,col 7)-(line 477,col 7)",
        "(line 478,col 7)-(line 478,col 60)",
        "(line 479,col 7)-(line 479,col 60)",
        "(line 480,col 7)-(line 480,col 60)",
        "(line 481,col 7)-(line 481,col 60)",
        "(line 483,col 7)-(line 483,col 65)",
        "(line 484,col 7)-(line 484,col 43)",
        "(line 485,col 7)-(line 485,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.testMaxIterations()",
      "begin_line": 489,
      "end_line": 505,
      "comment": "",
      "child_ranges": [
        "(line 490,col 7)-(line 490,col 49)",
        "(line 491,col 7)-(line 491,col 36)",
        "(line 492,col 7)-(line 492,col 36)",
        "(line 493,col 7)-(line 493,col 36)",
        "(line 494,col 7)-(line 494,col 36)",
        "(line 495,col 7)-(line 495,col 36)",
        "(line 496,col 7)-(line 504,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.testCircleFitting()",
      "begin_line": 507,
      "end_line": 521,
      "comment": "",
      "child_ranges": [
        "(line 508,col 7)-(line 508,col 49)",
        "(line 509,col 7)-(line 509,col 36)",
        "(line 510,col 7)-(line 510,col 36)",
        "(line 511,col 7)-(line 511,col 36)",
        "(line 512,col 7)-(line 512,col 36)",
        "(line 513,col 7)-(line 513,col 36)",
        "(line 514,col 7)-(line 514,col 87)",
        "(line 515,col 7)-(line 515,col 33)",
        "(line 516,col 7)-(line 516,col 44)",
        "(line 517,col 7)-(line 517,col 81)",
        "(line 518,col 7)-(line 518,col 67)",
        "(line 519,col 7)-(line 519,col 67)",
        "(line 520,col 7)-(line 520,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.testCircleFittingBadInit()",
      "begin_line": 523,
      "end_line": 568,
      "comment": "",
      "child_ranges": [
        "(line 524,col 5)-(line 524,col 41)",
        "(line 525,col 5)-(line 555,col 6)",
        "(line 556,col 5)-(line 558,col 5)",
        "(line 559,col 5)-(line 559,col 83)",
        "(line 560,col 5)-(line 567,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LinearProblem",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.SimpleEstimationProblem"
      ],
      "begin_line": 570,
      "end_line": 586,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearProblem.LinearProblem(org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement[])",
      "begin_line": 572,
      "end_line": 584,
      "comment": "",
      "child_ranges": [
        "(line 573,col 7)-(line 573,col 34)",
        "(line 574,col 7)-(line 580,col 7)",
        "(line 581,col 7)-(line 583,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LinearMeasurement",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.WeightedMeasurement"
      ],
      "begin_line": 588,
      "end_line": 623,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement.LinearMeasurement(double[], org.apache.commons.math.estimation.EstimatedParameter[], double)",
      "begin_line": 590,
      "end_line": 596,
      "comment": "",
      "child_ranges": [
        "(line 592,col 7)-(line 592,col 33)",
        "(line 593,col 7)-(line 593,col 29)",
        "(line 594,col 7)-(line 594,col 35)",
        "(line 595,col 7)-(line 595,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement.getTheoreticalValue()",
      "begin_line": 598,
      "end_line": 604,
      "comment": "",
      "child_ranges": [
        "(line 599,col 7)-(line 599,col 19)",
        "(line 600,col 7)-(line 602,col 7)",
        "(line 603,col 7)-(line 603,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement.getPartial(org.apache.commons.math.estimation.EstimatedParameter)",
      "begin_line": 606,
      "end_line": 613,
      "comment": "",
      "child_ranges": [
        "(line 607,col 7)-(line 611,col 7)",
        "(line 612,col 7)-(line 612,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement.getParameters()",
      "begin_line": 615,
      "end_line": 617,
      "comment": "",
      "child_ranges": [
        "(line 616,col 7)-(line 616,col 24)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "factors"
      ],
      "begin_line": 619,
      "end_line": 619,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parameters"
      ],
      "begin_line": 620,
      "end_line": 620,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 621,
      "end_line": 621,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Circle",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.EstimationProblem"
      ],
      "begin_line": 625,
      "end_line": 730,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.Circle(double, double)",
      "begin_line": 627,
      "end_line": 631,
      "comment": "",
      "child_ranges": [
        "(line 628,col 7)-(line 628,col 49)",
        "(line 629,col 7)-(line 629,col 73)",
        "(line 630,col 7)-(line 630,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.addPoint(double, double)",
      "begin_line": 633,
      "end_line": 635,
      "comment": "",
      "child_ranges": [
        "(line 634,col 7)-(line 634,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.getM()",
      "begin_line": 637,
      "end_line": 639,
      "comment": "",
      "child_ranges": [
        "(line 638,col 7)-(line 638,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.getMeasurements()",
      "begin_line": 641,
      "end_line": 643,
      "comment": "",
      "child_ranges": [
        "(line 642,col 7)-(line 642,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.getAllParameters()",
      "begin_line": 645,
      "end_line": 647,
      "comment": "",
      "child_ranges": [
        "(line 646,col 7)-(line 646,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.getUnboundParameters()",
      "begin_line": 649,
      "end_line": 651,
      "comment": "",
      "child_ranges": [
        "(line 650,col 7)-(line 650,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.getPartialRadiusX()",
      "begin_line": 653,
      "end_line": 659,
      "comment": "",
      "child_ranges": [
        "(line 654,col 7)-(line 654,col 22)",
        "(line 655,col 7)-(line 657,col 7)",
        "(line 658,col 7)-(line 658,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.getPartialRadiusY()",
      "begin_line": 661,
      "end_line": 667,
      "comment": "",
      "child_ranges": [
        "(line 662,col 7)-(line 662,col 22)",
        "(line 663,col 7)-(line 665,col 7)",
        "(line 666,col 7)-(line 666,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.getRadius()",
      "begin_line": 669,
      "end_line": 675,
      "comment": "",
      "child_ranges": [
        "(line 670,col 7)-(line 670,col 19)",
        "(line 671,col 7)-(line 673,col 7)",
        "(line 674,col 7)-(line 674,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.getX()",
      "begin_line": 677,
      "end_line": 679,
      "comment": "",
      "child_ranges": [
        "(line 678,col 7)-(line 678,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.getY()",
      "begin_line": 681,
      "end_line": 683,
      "comment": "",
      "child_ranges": [
        "(line 682,col 7)-(line 682,col 30)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PointModel",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.WeightedMeasurement"
      ],
      "begin_line": 685,
      "end_line": 724,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.PointModel.PointModel(double, double)",
      "begin_line": 687,
      "end_line": 691,
      "comment": "",
      "child_ranges": [
        "(line 688,col 9)-(line 688,col 24)",
        "(line 689,col 9)-(line 689,col 21)",
        "(line 690,col 9)-(line 690,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.PointModel.getPartial(org.apache.commons.math.estimation.EstimatedParameter)",
      "begin_line": 693,
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
        "(line 703,col 9)-(line 703,col 42)",
        "(line 704,col 9)-(line 704,col 42)",
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
        "(line 709,col 9)-(line 709,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.PointModel.getPartialDiY()",
      "begin_line": 712,
      "end_line": 714,
      "comment": "",
      "child_ranges": [
        "(line 713,col 9)-(line 713,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.PointModel.getTheoreticalValue()",
      "begin_line": 716,
      "end_line": 718,
      "comment": "",
      "child_ranges": [
        "(line 717,col 9)-(line 717,col 49)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "px"
      ],
      "begin_line": 720,
      "end_line": 720,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "py"
      ],
      "begin_line": 721,
      "end_line": 721,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 722,
      "end_line": 722,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cx"
      ],
      "begin_line": 726,
      "end_line": 726,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cy"
      ],
      "begin_line": 727,
      "end_line": 727,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "points"
      ],
      "begin_line": 728,
      "end_line": 728,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.suite()",
      "begin_line": 732,
      "end_line": 734,
      "comment": "",
      "child_ranges": [
        "(line 733,col 5)-(line 733,col 57)"
      ]
    }
  ]
}