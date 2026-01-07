{
  "filepath": "/tmp/Math-103b/src/test/org/apache/commons/math/estimation/LevenbergMarquardtEstimatorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LevenbergMarquardtEstimatorTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 95,
      "end_line": 690,
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
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testCircleFitting()",
      "begin_line": 449,
      "end_line": 465,
      "comment": "",
      "child_ranges": [
        "(line 450,col 5)-(line 450,col 47)",
        "(line 451,col 5)-(line 451,col 34)",
        "(line 452,col 5)-(line 452,col 34)",
        "(line 453,col 5)-(line 453,col 34)",
        "(line 454,col 5)-(line 454,col 34)",
        "(line 455,col 5)-(line 455,col 34)",
        "(line 456,col 5)-(line 456,col 78)",
        "(line 457,col 5)-(line 457,col 31)",
        "(line 458,col 5)-(line 458,col 52)",
        "(line 459,col 5)-(line 459,col 56)",
        "(line 460,col 5)-(line 460,col 42)",
        "(line 461,col 5)-(line 461,col 79)",
        "(line 462,col 5)-(line 462,col 65)",
        "(line 463,col 5)-(line 463,col 65)",
        "(line 464,col 5)-(line 464,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testCircleFittingBadInit()",
      "begin_line": 467,
      "end_line": 511,
      "comment": "",
      "child_ranges": [
        "(line 468,col 5)-(line 468,col 41)",
        "(line 469,col 5)-(line 499,col 6)",
        "(line 500,col 5)-(line 502,col 5)",
        "(line 503,col 5)-(line 503,col 78)",
        "(line 504,col 5)-(line 504,col 31)",
        "(line 505,col 5)-(line 505,col 52)",
        "(line 506,col 5)-(line 506,col 56)",
        "(line 507,col 5)-(line 507,col 74)",
        "(line 508,col 5)-(line 508,col 68)",
        "(line 509,col 5)-(line 509,col 68)",
        "(line 510,col 5)-(line 510,col 68)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LinearProblem",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.EstimationProblem"
      ],
      "begin_line": 513,
      "end_line": 541,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.LinearProblem.LinearProblem(org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.LinearMeasurement[])",
      "begin_line": 515,
      "end_line": 517,
      "comment": "",
      "child_ranges": [
        "(line 516,col 7)-(line 516,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.LinearProblem.getMeasurements()",
      "begin_line": 519,
      "end_line": 521,
      "comment": "",
      "child_ranges": [
        "(line 520,col 7)-(line 520,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.LinearProblem.getUnboundParameters()",
      "begin_line": 523,
      "end_line": 525,
      "comment": "",
      "child_ranges": [
        "(line 524,col 7)-(line 524,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.LinearProblem.getAllParameters()",
      "begin_line": 527,
      "end_line": 537,
      "comment": "",
      "child_ranges": [
        "(line 528,col 7)-(line 528,col 34)",
        "(line 529,col 7)-(line 534,col 7)",
        "(line 535,col 7)-(line 535,col 29)",
        "(line 536,col 7)-(line 536,col 84)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "measurements"
      ],
      "begin_line": 539,
      "end_line": 539,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "LinearMeasurement",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.WeightedMeasurement"
      ],
      "begin_line": 543,
      "end_line": 577,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.LinearMeasurement.LinearMeasurement(double[], org.apache.commons.math.estimation.EstimatedParameter[], double)",
      "begin_line": 545,
      "end_line": 550,
      "comment": "",
      "child_ranges": [
        "(line 547,col 7)-(line 547,col 27)",
        "(line 548,col 7)-(line 548,col 29)",
        "(line 549,col 7)-(line 549,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.LinearMeasurement.getTheoreticalValue()",
      "begin_line": 552,
      "end_line": 558,
      "comment": "",
      "child_ranges": [
        "(line 553,col 7)-(line 553,col 19)",
        "(line 554,col 7)-(line 556,col 7)",
        "(line 557,col 7)-(line 557,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.LinearMeasurement.getPartial(org.apache.commons.math.estimation.EstimatedParameter)",
      "begin_line": 560,
      "end_line": 567,
      "comment": "",
      "child_ranges": [
        "(line 561,col 7)-(line 565,col 7)",
        "(line 566,col 7)-(line 566,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.LinearMeasurement.getParameters()",
      "begin_line": 569,
      "end_line": 571,
      "comment": "",
      "child_ranges": [
        "(line 570,col 7)-(line 570,col 24)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "factors"
      ],
      "begin_line": 573,
      "end_line": 573,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parameters"
      ],
      "begin_line": 574,
      "end_line": 574,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 575,
      "end_line": 575,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Circle",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.EstimationProblem"
      ],
      "begin_line": 579,
      "end_line": 684,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.Circle(double, double)",
      "begin_line": 581,
      "end_line": 585,
      "comment": "",
      "child_ranges": [
        "(line 582,col 7)-(line 582,col 49)",
        "(line 583,col 7)-(line 583,col 49)",
        "(line 584,col 7)-(line 584,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.addPoint(double, double)",
      "begin_line": 587,
      "end_line": 589,
      "comment": "",
      "child_ranges": [
        "(line 588,col 7)-(line 588,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.getM()",
      "begin_line": 591,
      "end_line": 593,
      "comment": "",
      "child_ranges": [
        "(line 592,col 7)-(line 592,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.getMeasurements()",
      "begin_line": 595,
      "end_line": 597,
      "comment": "",
      "child_ranges": [
        "(line 596,col 7)-(line 596,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.getAllParameters()",
      "begin_line": 599,
      "end_line": 601,
      "comment": "",
      "child_ranges": [
        "(line 600,col 7)-(line 600,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.getUnboundParameters()",
      "begin_line": 603,
      "end_line": 605,
      "comment": "",
      "child_ranges": [
        "(line 604,col 7)-(line 604,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.getPartialRadiusX()",
      "begin_line": 607,
      "end_line": 613,
      "comment": "",
      "child_ranges": [
        "(line 608,col 7)-(line 608,col 22)",
        "(line 609,col 7)-(line 611,col 7)",
        "(line 612,col 7)-(line 612,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.getPartialRadiusY()",
      "begin_line": 615,
      "end_line": 621,
      "comment": "",
      "child_ranges": [
        "(line 616,col 7)-(line 616,col 22)",
        "(line 617,col 7)-(line 619,col 7)",
        "(line 620,col 7)-(line 620,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.getRadius()",
      "begin_line": 623,
      "end_line": 629,
      "comment": "",
      "child_ranges": [
        "(line 624,col 7)-(line 624,col 19)",
        "(line 625,col 7)-(line 627,col 7)",
        "(line 628,col 7)-(line 628,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.getX()",
      "begin_line": 631,
      "end_line": 633,
      "comment": "",
      "child_ranges": [
        "(line 632,col 7)-(line 632,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.getY()",
      "begin_line": 635,
      "end_line": 637,
      "comment": "",
      "child_ranges": [
        "(line 636,col 7)-(line 636,col 30)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PointModel",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.WeightedMeasurement"
      ],
      "begin_line": 639,
      "end_line": 678,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.PointModel.PointModel(double, double)",
      "begin_line": 641,
      "end_line": 645,
      "comment": "",
      "child_ranges": [
        "(line 642,col 9)-(line 642,col 24)",
        "(line 643,col 9)-(line 643,col 21)",
        "(line 644,col 9)-(line 644,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.PointModel.getPartial(org.apache.commons.math.estimation.EstimatedParameter)",
      "begin_line": 647,
      "end_line": 654,
      "comment": "",
      "child_ranges": [
        "(line 648,col 9)-(line 652,col 9)",
        "(line 653,col 9)-(line 653,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.PointModel.getCenterDistance()",
      "begin_line": 656,
      "end_line": 660,
      "comment": "",
      "child_ranges": [
        "(line 657,col 9)-(line 657,col 42)",
        "(line 658,col 9)-(line 658,col 42)",
        "(line 659,col 9)-(line 659,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.PointModel.getPartialDiX()",
      "begin_line": 662,
      "end_line": 664,
      "comment": "",
      "child_ranges": [
        "(line 663,col 9)-(line 663,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.PointModel.getPartialDiY()",
      "begin_line": 666,
      "end_line": 668,
      "comment": "",
      "child_ranges": [
        "(line 667,col 9)-(line 667,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.PointModel.getTheoreticalValue()",
      "begin_line": 670,
      "end_line": 672,
      "comment": "",
      "child_ranges": [
        "(line 671,col 9)-(line 671,col 49)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "px"
      ],
      "begin_line": 674,
      "end_line": 674,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "py"
      ],
      "begin_line": 675,
      "end_line": 675,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 676,
      "end_line": 676,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cx"
      ],
      "begin_line": 680,
      "end_line": 680,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cy"
      ],
      "begin_line": 681,
      "end_line": 681,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "points"
      ],
      "begin_line": 682,
      "end_line": 682,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.suite()",
      "begin_line": 686,
      "end_line": 688,
      "comment": "",
      "child_ranges": [
        "(line 687,col 5)-(line 687,col 64)"
      ]
    }
  ]
}