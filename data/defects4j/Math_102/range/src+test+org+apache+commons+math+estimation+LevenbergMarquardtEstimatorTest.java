{
  "filepath": "/tmp/Math-102b/src/test/org/apache/commons/math/estimation/LevenbergMarquardtEstimatorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LevenbergMarquardtEstimatorTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 95,
      "end_line": 724,
      "comment": "\n * \u003cp\u003eSome of the unit tests are re-implementations of the MINPACK \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file17\"\u003efile17\u003c/a\u003e and \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file22\"\u003efile22\u003c/a\u003e test files. \n * The redistribution policy for MINPACK is available \u003ca\n * href\u003d\"http://www.netlib.org/minpack/disclaimer\"\u003ehere\u003c/a\u003e, for\n * convenience, it is reproduced below.\u003c/p\u003e\n\n * \u003ctable border\u003d\"0\" width\u003d\"80%\" cellpadding\u003d\"10\" align\u003d\"center\" bgcolor\u003d\"#E0E0E0\"\u003e\n * \u003ctr\u003e\u003ctd\u003e\n *    Minpack Copyright Notice (1999) University of Chicago.\n *    All rights reserved\n * \u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003e\n * Redistribution and use in source and binary forms, with or without\n * modification, are permitted provided that the following conditions\n * are met:\n * \u003col\u003e\n *  \u003cli\u003eRedistributions of source code must retain the above copyright\n *      notice, this list of conditions and the following disclaimer.\u003c/li\u003e\n * \u003cli\u003eRedistributions in binary form must reproduce the above\n *     copyright notice, this list of conditions and the following\n *     disclaimer in the documentation and/or other materials provided\n *     with the distribution.\u003c/li\u003e\n * \u003cli\u003eThe end-user documentation included with the redistribution, if any,\n *     must include the following acknowledgment:\n *     \u003ccode\u003eThis product includes software developed by the University of\n *           Chicago, as Operator of Argonne National Laboratory.\u003c/code\u003e\n *     Alternately, this acknowledgment may appear in the software itself,\n *     if and wherever such third-party acknowledgments normally appear.\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eWARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED \"AS IS\"\n *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE\n *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND\n *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR\n *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES\n *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE\n *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY\n *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR\n *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF\n *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)\n *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION\n *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL\n *     BE CORRECTED.\u003c/strong\u003e\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eLIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT\n *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF\n *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,\n *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF\n *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF\n *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER\n *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT\n *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,\n *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE\n *     POSSIBILITY OF SUCH LOSS OR DAMAGES.\u003c/strong\u003e\u003c/li\u003e\n * \u003col\u003e\u003c/td\u003e\u003c/tr\u003e\n * \u003c/table\u003e\n\n * @author Argonne National Laboratory. MINPACK project. March 1980 (original fortran minpack tests)\n * @author Burton S. Garbow (original fortran minpack tests)\n * @author Kenneth E. Hillstrom (original fortran minpack tests)\n * @author Jorge J. More (original fortran minpack tests)\n * @author Luc Maisonobe (non-minpack tests and minpack tests Java translation)\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.LevenbergMarquardtEstimatorTest(java.lang.String)",
      "begin_line": 98,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 99,col 5)-(line 99,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testTrivial()",
      "begin_line": 102,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 103,col 5)-(line 109,col 9)",
        "(line 110,col 5)-(line 110,col 78)",
        "(line 111,col 5)-(line 111,col 32)",
        "(line 112,col 5)-(line 112,col 56)",
        "(line 113,col 5)-(line 115,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testQRColumnsPermutation()",
      "begin_line": 118,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 120,col 5)-(line 122,col 6)",
        "(line 123,col 5)-(line 133,col 7)",
        "(line 135,col 5)-(line 135,col 78)",
        "(line 136,col 5)-(line 136,col 32)",
        "(line 137,col 5)-(line 137,col 56)",
        "(line 138,col 5)-(line 138,col 51)",
        "(line 139,col 5)-(line 139,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testNoDependency()",
      "begin_line": 143,
      "end_line": 166,
      "comment": "",
      "child_ranges": [
        "(line 144,col 5)-(line 151,col 6)",
        "(line 152,col 5)-(line 159,col 7)",
        "(line 160,col 3)-(line 160,col 76)",
        "(line 161,col 3)-(line 161,col 30)",
        "(line 162,col 3)-(line 162,col 54)",
        "(line 163,col 3)-(line 165,col 3)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testOneSet()",
      "begin_line": 168,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 170,col 5)-(line 174,col 6)",
        "(line 175,col 5)-(line 185,col 7)",
        "(line 187,col 5)-(line 187,col 78)",
        "(line 188,col 5)-(line 188,col 32)",
        "(line 189,col 5)-(line 189,col 56)",
        "(line 190,col 5)-(line 190,col 51)",
        "(line 191,col 5)-(line 191,col 51)",
        "(line 192,col 5)-(line 192,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testTwoSets()",
      "begin_line": 196,
      "end_line": 243,
      "comment": "",
      "child_ranges": [
        "(line 197,col 5)-(line 204,col 6)",
        "(line 206,col 5)-(line 206,col 28)",
        "(line 207,col 5)-(line 231,col 7)",
        "(line 233,col 5)-(line 233,col 78)",
        "(line 234,col 5)-(line 234,col 32)",
        "(line 235,col 5)-(line 235,col 56)",
        "(line 236,col 5)-(line 236,col 52)",
        "(line 237,col 5)-(line 237,col 52)",
        "(line 238,col 5)-(line 238,col 52)",
        "(line 239,col 5)-(line 239,col 52)",
        "(line 240,col 5)-(line 240,col 62)",
        "(line 241,col 5)-(line 241,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testNonInversible()",
      "begin_line": 245,
      "end_line": 282,
      "comment": "",
      "child_ranges": [
        "(line 247,col 5)-(line 251,col 6)",
        "(line 252,col 5)-(line 262,col 6)",
        "(line 263,col 5)-(line 263,col 49)",
        "(line 265,col 5)-(line 265,col 78)",
        "(line 266,col 5)-(line 266,col 51)",
        "(line 267,col 5)-(line 267,col 32)",
        "(line 268,col 5)-(line 268,col 56)",
        "(line 269,col 5)-(line 269,col 70)",
        "(line 270,col 5)-(line 272,col 66)",
        "(line 273,col 5)-(line 274,col 66)",
        "(line 275,col 5)-(line 277,col 66)",
        "(line 278,col 5)-(line 278,col 34)",
        "(line 279,col 5)-(line 279,col 34)",
        "(line 280,col 5)-(line 280,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testIllConditioned()",
      "begin_line": 284,
      "end_line": 336,
      "comment": "",
      "child_ranges": [
        "(line 285,col 5)-(line 290,col 6)",
        "(line 292,col 5)-(line 305,col 7)",
        "(line 306,col 5)-(line 306,col 79)",
        "(line 307,col 5)-(line 307,col 34)",
        "(line 308,col 5)-(line 308,col 58)",
        "(line 309,col 5)-(line 309,col 51)",
        "(line 310,col 5)-(line 310,col 51)",
        "(line 311,col 5)-(line 311,col 51)",
        "(line 312,col 5)-(line 312,col 51)",
        "(line 314,col 5)-(line 327,col 7)",
        "(line 328,col 5)-(line 328,col 79)",
        "(line 329,col 5)-(line 329,col 34)",
        "(line 330,col 5)-(line 330,col 58)",
        "(line 331,col 5)-(line 331,col 52)",
        "(line 332,col 5)-(line 332,col 52)",
        "(line 333,col 5)-(line 333,col 52)",
        "(line 334,col 5)-(line 334,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testMoreEstimatedParametersSimple()",
      "begin_line": 338,
      "end_line": 362,
      "comment": "",
      "child_ranges": [
        "(line 340,col 5)-(line 345,col 7)",
        "(line 346,col 5)-(line 356,col 7)",
        "(line 358,col 5)-(line 358,col 78)",
        "(line 359,col 5)-(line 359,col 32)",
        "(line 360,col 5)-(line 360,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testMoreEstimatedParametersUnsorted()",
      "begin_line": 364,
      "end_line": 399,
      "comment": "",
      "child_ranges": [
        "(line 365,col 5)-(line 372,col 6)",
        "(line 373,col 5)-(line 389,col 7)",
        "(line 391,col 5)-(line 391,col 78)",
        "(line 392,col 5)-(line 392,col 32)",
        "(line 393,col 5)-(line 393,col 56)",
        "(line 394,col 5)-(line 394,col 51)",
        "(line 395,col 5)-(line 395,col 51)",
        "(line 396,col 5)-(line 396,col 51)",
        "(line 397,col 5)-(line 397,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testRedundantEquations()",
      "begin_line": 401,
      "end_line": 424,
      "comment": "",
      "child_ranges": [
        "(line 402,col 5)-(line 405,col 6)",
        "(line 406,col 5)-(line 416,col 7)",
        "(line 418,col 5)-(line 418,col 78)",
        "(line 419,col 5)-(line 419,col 32)",
        "(line 420,col 5)-(line 420,col 56)",
        "(line 421,col 5)-(line 421,col 51)",
        "(line 422,col 5)-(line 422,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testInconsistentEquations()",
      "begin_line": 426,
      "end_line": 447,
      "comment": "",
      "child_ranges": [
        "(line 427,col 5)-(line 430,col 6)",
        "(line 431,col 5)-(line 441,col 7)",
        "(line 443,col 5)-(line 443,col 78)",
        "(line 444,col 5)-(line 444,col 32)",
        "(line 445,col 5)-(line 445,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testControlParameters()",
      "begin_line": 449,
      "end_line": 461,
      "comment": "",
      "child_ranges": [
        "(line 450,col 7)-(line 450,col 49)",
        "(line 451,col 7)-(line 451,col 36)",
        "(line 452,col 7)-(line 452,col 36)",
        "(line 453,col 7)-(line 453,col 36)",
        "(line 454,col 7)-(line 454,col 36)",
        "(line 455,col 7)-(line 455,col 36)",
        "(line 456,col 7)-(line 456,col 71)",
        "(line 457,col 7)-(line 457,col 70)",
        "(line 458,col 7)-(line 458,col 70)",
        "(line 459,col 7)-(line 459,col 33)",
        "(line 460,col 7)-(line 460,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.checkEstimate(org.apache.commons.math.estimation.EstimationProblem, double, int, double, double, double, boolean)",
      "begin_line": 463,
      "end_line": 481,
      "comment": "",
      "child_ranges": [
        "(line 467,col 7)-(line 480,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testCircleFitting()",
      "begin_line": 483,
      "end_line": 499,
      "comment": "",
      "child_ranges": [
        "(line 484,col 7)-(line 484,col 49)",
        "(line 485,col 7)-(line 485,col 36)",
        "(line 486,col 7)-(line 486,col 36)",
        "(line 487,col 7)-(line 487,col 36)",
        "(line 488,col 7)-(line 488,col 36)",
        "(line 489,col 7)-(line 489,col 36)",
        "(line 490,col 7)-(line 490,col 80)",
        "(line 491,col 7)-(line 491,col 33)",
        "(line 492,col 7)-(line 492,col 54)",
        "(line 493,col 7)-(line 493,col 58)",
        "(line 494,col 7)-(line 494,col 44)",
        "(line 495,col 7)-(line 495,col 81)",
        "(line 496,col 7)-(line 496,col 67)",
        "(line 497,col 7)-(line 497,col 67)",
        "(line 498,col 7)-(line 498,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testCircleFittingBadInit()",
      "begin_line": 501,
      "end_line": 545,
      "comment": "",
      "child_ranges": [
        "(line 502,col 5)-(line 502,col 41)",
        "(line 503,col 5)-(line 533,col 6)",
        "(line 534,col 5)-(line 536,col 5)",
        "(line 537,col 5)-(line 537,col 78)",
        "(line 538,col 5)-(line 538,col 31)",
        "(line 539,col 5)-(line 539,col 52)",
        "(line 540,col 5)-(line 540,col 56)",
        "(line 541,col 5)-(line 541,col 74)",
        "(line 542,col 5)-(line 542,col 68)",
        "(line 543,col 5)-(line 543,col 68)",
        "(line 544,col 5)-(line 544,col 68)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LinearProblem",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.EstimationProblem"
      ],
      "begin_line": 547,
      "end_line": 575,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.LinearProblem.LinearProblem(org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.LinearMeasurement[])",
      "begin_line": 549,
      "end_line": 551,
      "comment": "",
      "child_ranges": [
        "(line 550,col 7)-(line 550,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.LinearProblem.getMeasurements()",
      "begin_line": 553,
      "end_line": 555,
      "comment": "",
      "child_ranges": [
        "(line 554,col 7)-(line 554,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.LinearProblem.getUnboundParameters()",
      "begin_line": 557,
      "end_line": 559,
      "comment": "",
      "child_ranges": [
        "(line 558,col 7)-(line 558,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.LinearProblem.getAllParameters()",
      "begin_line": 561,
      "end_line": 571,
      "comment": "",
      "child_ranges": [
        "(line 562,col 7)-(line 562,col 34)",
        "(line 563,col 7)-(line 568,col 7)",
        "(line 569,col 7)-(line 569,col 29)",
        "(line 570,col 7)-(line 570,col 84)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "measurements"
      ],
      "begin_line": 573,
      "end_line": 573,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "LinearMeasurement",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.WeightedMeasurement"
      ],
      "begin_line": 577,
      "end_line": 611,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.LinearMeasurement.LinearMeasurement(double[], org.apache.commons.math.estimation.EstimatedParameter[], double)",
      "begin_line": 579,
      "end_line": 584,
      "comment": "",
      "child_ranges": [
        "(line 581,col 7)-(line 581,col 27)",
        "(line 582,col 7)-(line 582,col 29)",
        "(line 583,col 7)-(line 583,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.LinearMeasurement.getTheoreticalValue()",
      "begin_line": 586,
      "end_line": 592,
      "comment": "",
      "child_ranges": [
        "(line 587,col 7)-(line 587,col 19)",
        "(line 588,col 7)-(line 590,col 7)",
        "(line 591,col 7)-(line 591,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.LinearMeasurement.getPartial(org.apache.commons.math.estimation.EstimatedParameter)",
      "begin_line": 594,
      "end_line": 601,
      "comment": "",
      "child_ranges": [
        "(line 595,col 7)-(line 599,col 7)",
        "(line 600,col 7)-(line 600,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.LinearMeasurement.getParameters()",
      "begin_line": 603,
      "end_line": 605,
      "comment": "",
      "child_ranges": [
        "(line 604,col 7)-(line 604,col 24)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "factors"
      ],
      "begin_line": 607,
      "end_line": 607,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parameters"
      ],
      "begin_line": 608,
      "end_line": 608,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 609,
      "end_line": 609,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Circle",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.EstimationProblem"
      ],
      "begin_line": 613,
      "end_line": 718,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.Circle(double, double)",
      "begin_line": 615,
      "end_line": 619,
      "comment": "",
      "child_ranges": [
        "(line 616,col 7)-(line 616,col 49)",
        "(line 617,col 7)-(line 617,col 49)",
        "(line 618,col 7)-(line 618,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.addPoint(double, double)",
      "begin_line": 621,
      "end_line": 623,
      "comment": "",
      "child_ranges": [
        "(line 622,col 7)-(line 622,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.getM()",
      "begin_line": 625,
      "end_line": 627,
      "comment": "",
      "child_ranges": [
        "(line 626,col 7)-(line 626,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.getMeasurements()",
      "begin_line": 629,
      "end_line": 631,
      "comment": "",
      "child_ranges": [
        "(line 630,col 7)-(line 630,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.getAllParameters()",
      "begin_line": 633,
      "end_line": 635,
      "comment": "",
      "child_ranges": [
        "(line 634,col 7)-(line 634,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.getUnboundParameters()",
      "begin_line": 637,
      "end_line": 639,
      "comment": "",
      "child_ranges": [
        "(line 638,col 7)-(line 638,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.getPartialRadiusX()",
      "begin_line": 641,
      "end_line": 647,
      "comment": "",
      "child_ranges": [
        "(line 642,col 7)-(line 642,col 22)",
        "(line 643,col 7)-(line 645,col 7)",
        "(line 646,col 7)-(line 646,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.getPartialRadiusY()",
      "begin_line": 649,
      "end_line": 655,
      "comment": "",
      "child_ranges": [
        "(line 650,col 7)-(line 650,col 22)",
        "(line 651,col 7)-(line 653,col 7)",
        "(line 654,col 7)-(line 654,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.getRadius()",
      "begin_line": 657,
      "end_line": 663,
      "comment": "",
      "child_ranges": [
        "(line 658,col 7)-(line 658,col 19)",
        "(line 659,col 7)-(line 661,col 7)",
        "(line 662,col 7)-(line 662,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.getX()",
      "begin_line": 665,
      "end_line": 667,
      "comment": "",
      "child_ranges": [
        "(line 666,col 7)-(line 666,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.getY()",
      "begin_line": 669,
      "end_line": 671,
      "comment": "",
      "child_ranges": [
        "(line 670,col 7)-(line 670,col 30)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PointModel",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.WeightedMeasurement"
      ],
      "begin_line": 673,
      "end_line": 712,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.PointModel.PointModel(double, double)",
      "begin_line": 675,
      "end_line": 679,
      "comment": "",
      "child_ranges": [
        "(line 676,col 9)-(line 676,col 24)",
        "(line 677,col 9)-(line 677,col 21)",
        "(line 678,col 9)-(line 678,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.PointModel.getPartial(org.apache.commons.math.estimation.EstimatedParameter)",
      "begin_line": 681,
      "end_line": 688,
      "comment": "",
      "child_ranges": [
        "(line 682,col 9)-(line 686,col 9)",
        "(line 687,col 9)-(line 687,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.PointModel.getCenterDistance()",
      "begin_line": 690,
      "end_line": 694,
      "comment": "",
      "child_ranges": [
        "(line 691,col 9)-(line 691,col 42)",
        "(line 692,col 9)-(line 692,col 42)",
        "(line 693,col 9)-(line 693,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.PointModel.getPartialDiX()",
      "begin_line": 696,
      "end_line": 698,
      "comment": "",
      "child_ranges": [
        "(line 697,col 9)-(line 697,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.PointModel.getPartialDiY()",
      "begin_line": 700,
      "end_line": 702,
      "comment": "",
      "child_ranges": [
        "(line 701,col 9)-(line 701,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.PointModel.getTheoreticalValue()",
      "begin_line": 704,
      "end_line": 706,
      "comment": "",
      "child_ranges": [
        "(line 705,col 9)-(line 705,col 49)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "px"
      ],
      "begin_line": 708,
      "end_line": 708,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "py"
      ],
      "begin_line": 709,
      "end_line": 709,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 710,
      "end_line": 710,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cx"
      ],
      "begin_line": 714,
      "end_line": 714,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cy"
      ],
      "begin_line": 715,
      "end_line": 715,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "points"
      ],
      "begin_line": 716,
      "end_line": 716,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.suite()",
      "begin_line": 720,
      "end_line": 722,
      "comment": "",
      "child_ranges": [
        "(line 721,col 5)-(line 721,col 64)"
      ]
    }
  ]
}