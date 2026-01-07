{
  "filepath": "/tmp/Math-93b/src/test/org/apache/commons/math/estimation/LevenbergMarquardtEstimatorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LevenbergMarquardtEstimatorTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 89,
      "end_line": 843,
      "comment": "\n * \u003cp\u003eSome of the unit tests are re-implementations of the MINPACK \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file17\"\u003efile17\u003c/a\u003e and \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file22\"\u003efile22\u003c/a\u003e test files. \n * The redistribution policy for MINPACK is available \u003ca\n * href\u003d\"http://www.netlib.org/minpack/disclaimer\"\u003ehere\u003c/a\u003e, for\n * convenience, it is reproduced below.\u003c/p\u003e\n\n * \u003ctable border\u003d\"0\" width\u003d\"80%\" cellpadding\u003d\"10\" align\u003d\"center\" bgcolor\u003d\"#E0E0E0\"\u003e\n * \u003ctr\u003e\u003ctd\u003e\n *    Minpack Copyright Notice (1999) University of Chicago.\n *    All rights reserved\n * \u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003e\n * Redistribution and use in source and binary forms, with or without\n * modification, are permitted provided that the following conditions\n * are met:\n * \u003col\u003e\n *  \u003cli\u003eRedistributions of source code must retain the above copyright\n *      notice, this list of conditions and the following disclaimer.\u003c/li\u003e\n * \u003cli\u003eRedistributions in binary form must reproduce the above\n *     copyright notice, this list of conditions and the following\n *     disclaimer in the documentation and/or other materials provided\n *     with the distribution.\u003c/li\u003e\n * \u003cli\u003eThe end-user documentation included with the redistribution, if any,\n *     must include the following acknowledgment:\n *     \u003ccode\u003eThis product includes software developed by the University of\n *           Chicago, as Operator of Argonne National Laboratory.\u003c/code\u003e\n *     Alternately, this acknowledgment may appear in the software itself,\n *     if and wherever such third-party acknowledgments normally appear.\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eWARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED \"AS IS\"\n *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE\n *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND\n *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR\n *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES\n *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE\n *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY\n *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR\n *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF\n *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)\n *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION\n *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL\n *     BE CORRECTED.\u003c/strong\u003e\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eLIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT\n *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF\n *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,\n *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF\n *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF\n *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER\n *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT\n *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,\n *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE\n *     POSSIBILITY OF SUCH LOSS OR DAMAGES.\u003c/strong\u003e\u003c/li\u003e\n * \u003col\u003e\u003c/td\u003e\u003c/tr\u003e\n * \u003c/table\u003e\n\n * @author Argonne National Laboratory. MINPACK project. March 1980 (original fortran minpack tests)\n * @author Burton S. Garbow (original fortran minpack tests)\n * @author Kenneth E. Hillstrom (original fortran minpack tests)\n * @author Jorge J. More (original fortran minpack tests)\n * @author Luc Maisonobe (non-minpack tests and minpack tests Java translation)\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.LevenbergMarquardtEstimatorTest(java.lang.String)",
      "begin_line": 92,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 93,col 5)-(line 93,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testTrivial()",
      "begin_line": 96,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 97,col 5)-(line 103,col 9)",
        "(line 104,col 5)-(line 104,col 78)",
        "(line 105,col 5)-(line 105,col 32)",
        "(line 106,col 5)-(line 106,col 56)",
        "(line 107,col 5)-(line 114,col 5)",
        "(line 115,col 5)-(line 117,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testQRColumnsPermutation()",
      "begin_line": 120,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 122,col 5)-(line 124,col 6)",
        "(line 125,col 5)-(line 135,col 7)",
        "(line 137,col 5)-(line 137,col 78)",
        "(line 138,col 5)-(line 138,col 32)",
        "(line 139,col 5)-(line 139,col 56)",
        "(line 140,col 5)-(line 140,col 51)",
        "(line 141,col 5)-(line 141,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testNoDependency()",
      "begin_line": 145,
      "end_line": 168,
      "comment": "",
      "child_ranges": [
        "(line 146,col 5)-(line 153,col 6)",
        "(line 154,col 5)-(line 161,col 7)",
        "(line 162,col 3)-(line 162,col 76)",
        "(line 163,col 3)-(line 163,col 30)",
        "(line 164,col 3)-(line 164,col 54)",
        "(line 165,col 3)-(line 167,col 3)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testOneSet()",
      "begin_line": 170,
      "end_line": 196,
      "comment": "",
      "child_ranges": [
        "(line 172,col 5)-(line 176,col 6)",
        "(line 177,col 5)-(line 187,col 7)",
        "(line 189,col 5)-(line 189,col 78)",
        "(line 190,col 5)-(line 190,col 32)",
        "(line 191,col 5)-(line 191,col 56)",
        "(line 192,col 5)-(line 192,col 51)",
        "(line 193,col 5)-(line 193,col 51)",
        "(line 194,col 5)-(line 194,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testTwoSets()",
      "begin_line": 198,
      "end_line": 245,
      "comment": "",
      "child_ranges": [
        "(line 199,col 5)-(line 206,col 6)",
        "(line 208,col 5)-(line 208,col 28)",
        "(line 209,col 5)-(line 233,col 7)",
        "(line 235,col 5)-(line 235,col 78)",
        "(line 236,col 5)-(line 236,col 32)",
        "(line 237,col 5)-(line 237,col 56)",
        "(line 238,col 5)-(line 238,col 52)",
        "(line 239,col 5)-(line 239,col 52)",
        "(line 240,col 5)-(line 240,col 52)",
        "(line 241,col 5)-(line 241,col 52)",
        "(line 242,col 5)-(line 242,col 62)",
        "(line 243,col 5)-(line 243,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testNonInversible()",
      "begin_line": 247,
      "end_line": 292,
      "comment": "",
      "child_ranges": [
        "(line 249,col 5)-(line 253,col 6)",
        "(line 254,col 5)-(line 264,col 6)",
        "(line 265,col 5)-(line 265,col 49)",
        "(line 267,col 5)-(line 267,col 78)",
        "(line 268,col 5)-(line 268,col 51)",
        "(line 269,col 5)-(line 269,col 32)",
        "(line 270,col 5)-(line 270,col 56)",
        "(line 271,col 5)-(line 271,col 70)",
        "(line 272,col 5)-(line 279,col 5)",
        "(line 280,col 4)-(line 282,col 66)",
        "(line 283,col 5)-(line 284,col 66)",
        "(line 285,col 5)-(line 287,col 66)",
        "(line 288,col 5)-(line 288,col 34)",
        "(line 289,col 5)-(line 289,col 34)",
        "(line 290,col 5)-(line 290,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testIllConditioned()",
      "begin_line": 294,
      "end_line": 346,
      "comment": "",
      "child_ranges": [
        "(line 295,col 5)-(line 300,col 6)",
        "(line 302,col 5)-(line 315,col 7)",
        "(line 316,col 5)-(line 316,col 79)",
        "(line 317,col 5)-(line 317,col 34)",
        "(line 318,col 5)-(line 318,col 58)",
        "(line 319,col 5)-(line 319,col 51)",
        "(line 320,col 5)-(line 320,col 51)",
        "(line 321,col 5)-(line 321,col 51)",
        "(line 322,col 5)-(line 322,col 51)",
        "(line 324,col 5)-(line 337,col 7)",
        "(line 338,col 5)-(line 338,col 79)",
        "(line 339,col 5)-(line 339,col 34)",
        "(line 340,col 5)-(line 340,col 58)",
        "(line 341,col 5)-(line 341,col 52)",
        "(line 342,col 5)-(line 342,col 52)",
        "(line 343,col 5)-(line 343,col 52)",
        "(line 344,col 5)-(line 344,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testMoreEstimatedParametersSimple()",
      "begin_line": 348,
      "end_line": 372,
      "comment": "",
      "child_ranges": [
        "(line 350,col 5)-(line 355,col 7)",
        "(line 356,col 5)-(line 366,col 7)",
        "(line 368,col 5)-(line 368,col 78)",
        "(line 369,col 5)-(line 369,col 32)",
        "(line 370,col 5)-(line 370,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testMoreEstimatedParametersUnsorted()",
      "begin_line": 374,
      "end_line": 409,
      "comment": "",
      "child_ranges": [
        "(line 375,col 5)-(line 382,col 6)",
        "(line 383,col 5)-(line 399,col 7)",
        "(line 401,col 5)-(line 401,col 78)",
        "(line 402,col 5)-(line 402,col 32)",
        "(line 403,col 5)-(line 403,col 56)",
        "(line 404,col 5)-(line 404,col 51)",
        "(line 405,col 5)-(line 405,col 51)",
        "(line 406,col 5)-(line 406,col 51)",
        "(line 407,col 5)-(line 407,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testRedundantEquations()",
      "begin_line": 411,
      "end_line": 434,
      "comment": "",
      "child_ranges": [
        "(line 412,col 5)-(line 415,col 6)",
        "(line 416,col 5)-(line 426,col 7)",
        "(line 428,col 5)-(line 428,col 78)",
        "(line 429,col 5)-(line 429,col 32)",
        "(line 430,col 5)-(line 430,col 56)",
        "(line 431,col 5)-(line 431,col 51)",
        "(line 432,col 5)-(line 432,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testInconsistentEquations()",
      "begin_line": 436,
      "end_line": 457,
      "comment": "",
      "child_ranges": [
        "(line 437,col 5)-(line 440,col 6)",
        "(line 441,col 5)-(line 451,col 7)",
        "(line 453,col 5)-(line 453,col 78)",
        "(line 454,col 5)-(line 454,col 32)",
        "(line 455,col 5)-(line 455,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testControlParameters()",
      "begin_line": 459,
      "end_line": 471,
      "comment": "",
      "child_ranges": [
        "(line 460,col 7)-(line 460,col 49)",
        "(line 461,col 7)-(line 461,col 36)",
        "(line 462,col 7)-(line 462,col 36)",
        "(line 463,col 7)-(line 463,col 36)",
        "(line 464,col 7)-(line 464,col 36)",
        "(line 465,col 7)-(line 465,col 36)",
        "(line 466,col 7)-(line 466,col 71)",
        "(line 467,col 7)-(line 467,col 70)",
        "(line 468,col 7)-(line 468,col 70)",
        "(line 469,col 7)-(line 469,col 33)",
        "(line 470,col 7)-(line 470,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.checkEstimate(org.apache.commons.math.estimation.EstimationProblem, double, int, double, double, double, boolean)",
      "begin_line": 473,
      "end_line": 491,
      "comment": "",
      "child_ranges": [
        "(line 477,col 7)-(line 490,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testCircleFitting()",
      "begin_line": 493,
      "end_line": 536,
      "comment": "",
      "child_ranges": [
        "(line 494,col 7)-(line 494,col 49)",
        "(line 495,col 7)-(line 495,col 36)",
        "(line 496,col 7)-(line 496,col 36)",
        "(line 497,col 7)-(line 497,col 36)",
        "(line 498,col 7)-(line 498,col 36)",
        "(line 499,col 7)-(line 499,col 36)",
        "(line 500,col 7)-(line 500,col 80)",
        "(line 501,col 7)-(line 501,col 33)",
        "(line 502,col 7)-(line 502,col 54)",
        "(line 503,col 7)-(line 503,col 58)",
        "(line 504,col 7)-(line 504,col 44)",
        "(line 505,col 7)-(line 505,col 81)",
        "(line 506,col 7)-(line 506,col 67)",
        "(line 507,col 7)-(line 507,col 67)",
        "(line 508,col 7)-(line 508,col 67)",
        "(line 509,col 7)-(line 509,col 56)",
        "(line 510,col 7)-(line 510,col 44)",
        "(line 511,col 7)-(line 511,col 44)",
        "(line 512,col 7)-(line 512,col 50)",
        "(line 513,col 7)-(line 513,col 44)",
        "(line 514,col 7)-(line 514,col 64)",
        "(line 515,col 7)-(line 515,col 44)",
        "(line 516,col 7)-(line 516,col 44)",
        "(line 519,col 7)-(line 519,col 32)",
        "(line 520,col 7)-(line 520,col 32)",
        "(line 521,col 7)-(line 521,col 37)",
        "(line 522,col 7)-(line 524,col 7)",
        "(line 525,col 7)-(line 525,col 52)",
        "(line 526,col 7)-(line 526,col 33)",
        "(line 527,col 7)-(line 527,col 45)",
        "(line 528,col 7)-(line 528,col 44)",
        "(line 529,col 7)-(line 529,col 47)",
        "(line 530,col 7)-(line 530,col 50)",
        "(line 531,col 7)-(line 531,col 44)",
        "(line 532,col 7)-(line 532,col 55)",
        "(line 533,col 7)-(line 533,col 44)",
        "(line 534,col 7)-(line 534,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testCircleFittingBadInit()",
      "begin_line": 538,
      "end_line": 582,
      "comment": "",
      "child_ranges": [
        "(line 539,col 5)-(line 539,col 41)",
        "(line 540,col 5)-(line 570,col 6)",
        "(line 571,col 5)-(line 573,col 5)",
        "(line 574,col 5)-(line 574,col 78)",
        "(line 575,col 5)-(line 575,col 31)",
        "(line 576,col 5)-(line 576,col 52)",
        "(line 577,col 5)-(line 577,col 56)",
        "(line 578,col 5)-(line 578,col 74)",
        "(line 579,col 5)-(line 579,col 68)",
        "(line 580,col 5)-(line 580,col 68)",
        "(line 581,col 5)-(line 581,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testMath199()",
      "begin_line": 584,
      "end_line": 598,
      "comment": "",
      "child_ranges": [
        "(line 585,col 7)-(line 596,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LinearProblem",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.EstimationProblem"
      ],
      "begin_line": 600,
      "end_line": 627,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.LinearProblem.LinearProblem(org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.LinearMeasurement[])",
      "begin_line": 602,
      "end_line": 604,
      "comment": "",
      "child_ranges": [
        "(line 603,col 7)-(line 603,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.LinearProblem.getMeasurements()",
      "begin_line": 606,
      "end_line": 608,
      "comment": "",
      "child_ranges": [
        "(line 607,col 7)-(line 607,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.LinearProblem.getUnboundParameters()",
      "begin_line": 610,
      "end_line": 612,
      "comment": "",
      "child_ranges": [
        "(line 611,col 7)-(line 611,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.LinearProblem.getAllParameters()",
      "begin_line": 614,
      "end_line": 623,
      "comment": "",
      "child_ranges": [
        "(line 615,col 7)-(line 615,col 74)",
        "(line 616,col 7)-(line 621,col 7)",
        "(line 622,col 7)-(line 622,col 84)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "measurements"
      ],
      "begin_line": 625,
      "end_line": 625,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "LinearMeasurement",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.WeightedMeasurement"
      ],
      "begin_line": 629,
      "end_line": 663,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.LinearMeasurement.LinearMeasurement(double[], org.apache.commons.math.estimation.EstimatedParameter[], double)",
      "begin_line": 631,
      "end_line": 636,
      "comment": "",
      "child_ranges": [
        "(line 633,col 7)-(line 633,col 27)",
        "(line 634,col 7)-(line 634,col 29)",
        "(line 635,col 7)-(line 635,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.LinearMeasurement.getTheoreticalValue()",
      "begin_line": 638,
      "end_line": 644,
      "comment": "",
      "child_ranges": [
        "(line 639,col 7)-(line 639,col 19)",
        "(line 640,col 7)-(line 642,col 7)",
        "(line 643,col 7)-(line 643,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.LinearMeasurement.getPartial(org.apache.commons.math.estimation.EstimatedParameter)",
      "begin_line": 646,
      "end_line": 653,
      "comment": "",
      "child_ranges": [
        "(line 647,col 7)-(line 651,col 7)",
        "(line 652,col 7)-(line 652,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.LinearMeasurement.getParameters()",
      "begin_line": 655,
      "end_line": 657,
      "comment": "",
      "child_ranges": [
        "(line 656,col 7)-(line 656,col 24)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "factors"
      ],
      "begin_line": 659,
      "end_line": 659,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parameters"
      ],
      "begin_line": 660,
      "end_line": 660,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 661,
      "end_line": 661,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Circle",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.EstimationProblem"
      ],
      "begin_line": 665,
      "end_line": 770,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.Circle(double, double)",
      "begin_line": 667,
      "end_line": 671,
      "comment": "",
      "child_ranges": [
        "(line 668,col 7)-(line 668,col 49)",
        "(line 669,col 7)-(line 669,col 49)",
        "(line 670,col 7)-(line 670,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.addPoint(double, double)",
      "begin_line": 673,
      "end_line": 675,
      "comment": "",
      "child_ranges": [
        "(line 674,col 7)-(line 674,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.getM()",
      "begin_line": 677,
      "end_line": 679,
      "comment": "",
      "child_ranges": [
        "(line 678,col 7)-(line 678,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.getMeasurements()",
      "begin_line": 681,
      "end_line": 683,
      "comment": "",
      "child_ranges": [
        "(line 682,col 7)-(line 682,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.getAllParameters()",
      "begin_line": 685,
      "end_line": 687,
      "comment": "",
      "child_ranges": [
        "(line 686,col 7)-(line 686,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.getUnboundParameters()",
      "begin_line": 689,
      "end_line": 691,
      "comment": "",
      "child_ranges": [
        "(line 690,col 7)-(line 690,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.getPartialRadiusX()",
      "begin_line": 693,
      "end_line": 699,
      "comment": "",
      "child_ranges": [
        "(line 694,col 7)-(line 694,col 22)",
        "(line 695,col 7)-(line 697,col 7)",
        "(line 698,col 7)-(line 698,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.getPartialRadiusY()",
      "begin_line": 701,
      "end_line": 707,
      "comment": "",
      "child_ranges": [
        "(line 702,col 7)-(line 702,col 22)",
        "(line 703,col 7)-(line 705,col 7)",
        "(line 706,col 7)-(line 706,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.getRadius()",
      "begin_line": 709,
      "end_line": 715,
      "comment": "",
      "child_ranges": [
        "(line 710,col 7)-(line 710,col 19)",
        "(line 711,col 7)-(line 713,col 7)",
        "(line 714,col 7)-(line 714,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.getX()",
      "begin_line": 717,
      "end_line": 719,
      "comment": "",
      "child_ranges": [
        "(line 718,col 7)-(line 718,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.getY()",
      "begin_line": 721,
      "end_line": 723,
      "comment": "",
      "child_ranges": [
        "(line 722,col 7)-(line 722,col 30)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PointModel",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.WeightedMeasurement"
      ],
      "begin_line": 725,
      "end_line": 764,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.PointModel.PointModel(double, double)",
      "begin_line": 727,
      "end_line": 731,
      "comment": "",
      "child_ranges": [
        "(line 728,col 9)-(line 728,col 24)",
        "(line 729,col 9)-(line 729,col 21)",
        "(line 730,col 9)-(line 730,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.PointModel.getPartial(org.apache.commons.math.estimation.EstimatedParameter)",
      "begin_line": 733,
      "end_line": 740,
      "comment": "",
      "child_ranges": [
        "(line 734,col 9)-(line 738,col 9)",
        "(line 739,col 9)-(line 739,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.PointModel.getCenterDistance()",
      "begin_line": 742,
      "end_line": 746,
      "comment": "",
      "child_ranges": [
        "(line 743,col 9)-(line 743,col 42)",
        "(line 744,col 9)-(line 744,col 42)",
        "(line 745,col 9)-(line 745,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.PointModel.getPartialDiX()",
      "begin_line": 748,
      "end_line": 750,
      "comment": "",
      "child_ranges": [
        "(line 749,col 9)-(line 749,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.PointModel.getPartialDiY()",
      "begin_line": 752,
      "end_line": 754,
      "comment": "",
      "child_ranges": [
        "(line 753,col 9)-(line 753,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.PointModel.getTheoreticalValue()",
      "begin_line": 756,
      "end_line": 758,
      "comment": "",
      "child_ranges": [
        "(line 757,col 9)-(line 757,col 49)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "px"
      ],
      "begin_line": 760,
      "end_line": 760,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "py"
      ],
      "begin_line": 761,
      "end_line": 761,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 762,
      "end_line": 762,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cx"
      ],
      "begin_line": 766,
      "end_line": 766,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cy"
      ],
      "begin_line": 767,
      "end_line": 767,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "points"
      ],
      "begin_line": 768,
      "end_line": 768,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "QuadraticProblem",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.SimpleEstimationProblem"
      ],
      "begin_line": 772,
      "end_line": 837,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 774,
      "end_line": 774,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 775,
      "end_line": 775,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "c"
      ],
      "begin_line": 776,
      "end_line": 776,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.QuadraticProblem.QuadraticProblem()",
      "begin_line": 778,
      "end_line": 785,
      "comment": "",
      "child_ranges": [
        "(line 779,col 11)-(line 779,col 47)",
        "(line 780,col 11)-(line 780,col 47)",
        "(line 781,col 11)-(line 781,col 47)",
        "(line 782,col 11)-(line 782,col 26)",
        "(line 783,col 11)-(line 783,col 26)",
        "(line 784,col 11)-(line 784,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.QuadraticProblem.addPoint(double, double, double)",
      "begin_line": 787,
      "end_line": 789,
      "comment": "",
      "child_ranges": [
        "(line 788,col 11)-(line 788,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.QuadraticProblem.getA()",
      "begin_line": 791,
      "end_line": 793,
      "comment": "",
      "child_ranges": [
        "(line 792,col 11)-(line 792,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.QuadraticProblem.getB()",
      "begin_line": 795,
      "end_line": 797,
      "comment": "",
      "child_ranges": [
        "(line 796,col 11)-(line 796,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.QuadraticProblem.getC()",
      "begin_line": 799,
      "end_line": 801,
      "comment": "",
      "child_ranges": [
        "(line 800,col 11)-(line 800,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.QuadraticProblem.theoreticalValue(double)",
      "begin_line": 803,
      "end_line": 805,
      "comment": "",
      "child_ranges": [
        "(line 804,col 11)-(line 804,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.QuadraticProblem.partial(double, org.apache.commons.math.estimation.EstimatedParameter)",
      "begin_line": 807,
      "end_line": 815,
      "comment": "",
      "child_ranges": [
        "(line 808,col 11)-(line 814,col 11)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LocalMeasurement",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.WeightedMeasurement"
      ],
      "begin_line": 817,
      "end_line": 836,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 819,
      "end_line": 819,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "x"
      ],
      "begin_line": 820,
      "end_line": 820,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.QuadraticProblem.LocalMeasurement.LocalMeasurement(double, double, double)",
      "begin_line": 823,
      "end_line": 826,
      "comment": " constructor",
      "child_ranges": [
        "(line 824,col 15)-(line 824,col 26)",
        "(line 825,col 15)-(line 825,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.QuadraticProblem.LocalMeasurement.getTheoreticalValue()",
      "begin_line": 828,
      "end_line": 830,
      "comment": "",
      "child_ranges": [
        "(line 829,col 15)-(line 829,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.QuadraticProblem.LocalMeasurement.getPartial(org.apache.commons.math.estimation.EstimatedParameter)",
      "begin_line": 832,
      "end_line": 834,
      "comment": "",
      "child_ranges": [
        "(line 833,col 15)-(line 833,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.suite()",
      "begin_line": 839,
      "end_line": 841,
      "comment": "",
      "child_ranges": [
        "(line 840,col 5)-(line 840,col 64)"
      ]
    }
  ]
}