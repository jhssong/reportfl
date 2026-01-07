{
  "filepath": "/tmp/Math-79b/src/test/java/org/apache/commons/math/estimation/LevenbergMarquardtEstimatorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LevenbergMarquardtEstimatorTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 89,
      "end_line": 842,
      "comment": "\n * \u003cp\u003eSome of the unit tests are re-implementations of the MINPACK \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file17\"\u003efile17\u003c/a\u003e and \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file22\"\u003efile22\u003c/a\u003e test files.\n * The redistribution policy for MINPACK is available \u003ca\n * href\u003d\"http://www.netlib.org/minpack/disclaimer\"\u003ehere\u003c/a\u003e, for\n * convenience, it is reproduced below.\u003c/p\u003e\n\n * \u003ctable border\u003d\"0\" width\u003d\"80%\" cellpadding\u003d\"10\" align\u003d\"center\" bgcolor\u003d\"#E0E0E0\"\u003e\n * \u003ctr\u003e\u003ctd\u003e\n *    Minpack Copyright Notice (1999) University of Chicago.\n *    All rights reserved\n * \u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003e\n * Redistribution and use in source and binary forms, with or without\n * modification, are permitted provided that the following conditions\n * are met:\n * \u003col\u003e\n *  \u003cli\u003eRedistributions of source code must retain the above copyright\n *      notice, this list of conditions and the following disclaimer.\u003c/li\u003e\n * \u003cli\u003eRedistributions in binary form must reproduce the above\n *     copyright notice, this list of conditions and the following\n *     disclaimer in the documentation and/or other materials provided\n *     with the distribution.\u003c/li\u003e\n * \u003cli\u003eThe end-user documentation included with the redistribution, if any,\n *     must include the following acknowledgment:\n *     \u003ccode\u003eThis product includes software developed by the University of\n *           Chicago, as Operator of Argonne National Laboratory.\u003c/code\u003e\n *     Alternately, this acknowledgment may appear in the software itself,\n *     if and wherever such third-party acknowledgments normally appear.\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eWARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED \"AS IS\"\n *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE\n *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND\n *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR\n *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES\n *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE\n *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY\n *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR\n *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF\n *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)\n *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION\n *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL\n *     BE CORRECTED.\u003c/strong\u003e\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eLIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT\n *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF\n *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,\n *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF\n *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF\n *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER\n *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT\n *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,\n *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE\n *     POSSIBILITY OF SUCH LOSS OR DAMAGES.\u003c/strong\u003e\u003c/li\u003e\n * \u003col\u003e\u003c/td\u003e\u003c/tr\u003e\n * \u003c/table\u003e\n\n * @author Argonne National Laboratory. MINPACK project. March 1980 (original fortran minpack tests)\n * @author Burton S. Garbow (original fortran minpack tests)\n * @author Kenneth E. Hillstrom (original fortran minpack tests)\n * @author Jorge J. More (original fortran minpack tests)\n * @author Luc Maisonobe (non-minpack tests and minpack tests Java translation)\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.LevenbergMarquardtEstimatorTest(java.lang.String)",
      "begin_line": 93,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 94,col 5)-(line 94,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testTrivial()",
      "begin_line": 97,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 98,col 5)-(line 104,col 9)",
        "(line 105,col 5)-(line 105,col 78)",
        "(line 106,col 5)-(line 106,col 32)",
        "(line 107,col 5)-(line 107,col 56)",
        "(line 108,col 5)-(line 115,col 5)",
        "(line 116,col 5)-(line 118,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testQRColumnsPermutation()",
      "begin_line": 121,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 123,col 5)-(line 125,col 6)",
        "(line 126,col 5)-(line 136,col 7)",
        "(line 138,col 5)-(line 138,col 78)",
        "(line 139,col 5)-(line 139,col 32)",
        "(line 140,col 5)-(line 140,col 56)",
        "(line 141,col 5)-(line 141,col 51)",
        "(line 142,col 5)-(line 142,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testNoDependency()",
      "begin_line": 146,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 147,col 5)-(line 154,col 6)",
        "(line 155,col 5)-(line 162,col 7)",
        "(line 163,col 3)-(line 163,col 76)",
        "(line 164,col 3)-(line 164,col 30)",
        "(line 165,col 3)-(line 165,col 54)",
        "(line 166,col 3)-(line 168,col 3)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testOneSet()",
      "begin_line": 171,
      "end_line": 197,
      "comment": "",
      "child_ranges": [
        "(line 173,col 5)-(line 177,col 6)",
        "(line 178,col 5)-(line 188,col 7)",
        "(line 190,col 5)-(line 190,col 78)",
        "(line 191,col 5)-(line 191,col 32)",
        "(line 192,col 5)-(line 192,col 56)",
        "(line 193,col 5)-(line 193,col 51)",
        "(line 194,col 5)-(line 194,col 51)",
        "(line 195,col 5)-(line 195,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testTwoSets()",
      "begin_line": 199,
      "end_line": 246,
      "comment": "",
      "child_ranges": [
        "(line 200,col 5)-(line 207,col 6)",
        "(line 209,col 5)-(line 209,col 28)",
        "(line 210,col 5)-(line 234,col 7)",
        "(line 236,col 5)-(line 236,col 78)",
        "(line 237,col 5)-(line 237,col 32)",
        "(line 238,col 5)-(line 238,col 56)",
        "(line 239,col 5)-(line 239,col 52)",
        "(line 240,col 5)-(line 240,col 52)",
        "(line 241,col 5)-(line 241,col 52)",
        "(line 242,col 5)-(line 242,col 52)",
        "(line 243,col 5)-(line 243,col 62)",
        "(line 244,col 5)-(line 244,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testNonInversible()",
      "begin_line": 248,
      "end_line": 293,
      "comment": "",
      "child_ranges": [
        "(line 250,col 5)-(line 254,col 6)",
        "(line 255,col 5)-(line 265,col 6)",
        "(line 266,col 5)-(line 266,col 49)",
        "(line 268,col 5)-(line 268,col 78)",
        "(line 269,col 5)-(line 269,col 51)",
        "(line 270,col 5)-(line 270,col 32)",
        "(line 271,col 5)-(line 271,col 56)",
        "(line 272,col 5)-(line 272,col 70)",
        "(line 273,col 5)-(line 280,col 5)",
        "(line 281,col 4)-(line 283,col 66)",
        "(line 284,col 5)-(line 285,col 66)",
        "(line 286,col 5)-(line 288,col 66)",
        "(line 289,col 5)-(line 289,col 34)",
        "(line 290,col 5)-(line 290,col 34)",
        "(line 291,col 5)-(line 291,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testIllConditioned()",
      "begin_line": 295,
      "end_line": 347,
      "comment": "",
      "child_ranges": [
        "(line 296,col 5)-(line 301,col 6)",
        "(line 303,col 5)-(line 316,col 7)",
        "(line 317,col 5)-(line 317,col 79)",
        "(line 318,col 5)-(line 318,col 34)",
        "(line 319,col 5)-(line 319,col 58)",
        "(line 320,col 5)-(line 320,col 51)",
        "(line 321,col 5)-(line 321,col 51)",
        "(line 322,col 5)-(line 322,col 51)",
        "(line 323,col 5)-(line 323,col 51)",
        "(line 325,col 5)-(line 338,col 7)",
        "(line 339,col 5)-(line 339,col 79)",
        "(line 340,col 5)-(line 340,col 34)",
        "(line 341,col 5)-(line 341,col 58)",
        "(line 342,col 5)-(line 342,col 52)",
        "(line 343,col 5)-(line 343,col 52)",
        "(line 344,col 5)-(line 344,col 52)",
        "(line 345,col 5)-(line 345,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testMoreEstimatedParametersSimple()",
      "begin_line": 349,
      "end_line": 373,
      "comment": "",
      "child_ranges": [
        "(line 351,col 5)-(line 356,col 7)",
        "(line 357,col 5)-(line 367,col 7)",
        "(line 369,col 5)-(line 369,col 78)",
        "(line 370,col 5)-(line 370,col 32)",
        "(line 371,col 5)-(line 371,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testMoreEstimatedParametersUnsorted()",
      "begin_line": 375,
      "end_line": 410,
      "comment": "",
      "child_ranges": [
        "(line 376,col 5)-(line 383,col 6)",
        "(line 384,col 5)-(line 400,col 7)",
        "(line 402,col 5)-(line 402,col 78)",
        "(line 403,col 5)-(line 403,col 32)",
        "(line 404,col 5)-(line 404,col 56)",
        "(line 405,col 5)-(line 405,col 51)",
        "(line 406,col 5)-(line 406,col 51)",
        "(line 407,col 5)-(line 407,col 51)",
        "(line 408,col 5)-(line 408,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testRedundantEquations()",
      "begin_line": 412,
      "end_line": 435,
      "comment": "",
      "child_ranges": [
        "(line 413,col 5)-(line 416,col 6)",
        "(line 417,col 5)-(line 427,col 7)",
        "(line 429,col 5)-(line 429,col 78)",
        "(line 430,col 5)-(line 430,col 32)",
        "(line 431,col 5)-(line 431,col 56)",
        "(line 432,col 5)-(line 432,col 51)",
        "(line 433,col 5)-(line 433,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testInconsistentEquations()",
      "begin_line": 437,
      "end_line": 458,
      "comment": "",
      "child_ranges": [
        "(line 438,col 5)-(line 441,col 6)",
        "(line 442,col 5)-(line 452,col 7)",
        "(line 454,col 5)-(line 454,col 78)",
        "(line 455,col 5)-(line 455,col 32)",
        "(line 456,col 5)-(line 456,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testControlParameters()",
      "begin_line": 460,
      "end_line": 472,
      "comment": "",
      "child_ranges": [
        "(line 461,col 7)-(line 461,col 49)",
        "(line 462,col 7)-(line 462,col 36)",
        "(line 463,col 7)-(line 463,col 36)",
        "(line 464,col 7)-(line 464,col 36)",
        "(line 465,col 7)-(line 465,col 36)",
        "(line 466,col 7)-(line 466,col 36)",
        "(line 467,col 7)-(line 467,col 71)",
        "(line 468,col 7)-(line 468,col 70)",
        "(line 469,col 7)-(line 469,col 70)",
        "(line 470,col 7)-(line 470,col 33)",
        "(line 471,col 7)-(line 471,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.checkEstimate(org.apache.commons.math.estimation.EstimationProblem, double, int, double, double, double, boolean)",
      "begin_line": 474,
      "end_line": 492,
      "comment": "",
      "child_ranges": [
        "(line 478,col 7)-(line 491,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testCircleFitting()",
      "begin_line": 494,
      "end_line": 537,
      "comment": "",
      "child_ranges": [
        "(line 495,col 7)-(line 495,col 49)",
        "(line 496,col 7)-(line 496,col 36)",
        "(line 497,col 7)-(line 497,col 36)",
        "(line 498,col 7)-(line 498,col 36)",
        "(line 499,col 7)-(line 499,col 36)",
        "(line 500,col 7)-(line 500,col 36)",
        "(line 501,col 7)-(line 501,col 80)",
        "(line 502,col 7)-(line 502,col 33)",
        "(line 503,col 7)-(line 503,col 54)",
        "(line 504,col 7)-(line 504,col 58)",
        "(line 505,col 7)-(line 505,col 44)",
        "(line 506,col 7)-(line 506,col 81)",
        "(line 507,col 7)-(line 507,col 67)",
        "(line 508,col 7)-(line 508,col 67)",
        "(line 509,col 7)-(line 509,col 67)",
        "(line 510,col 7)-(line 510,col 56)",
        "(line 511,col 7)-(line 511,col 44)",
        "(line 512,col 7)-(line 512,col 44)",
        "(line 513,col 7)-(line 513,col 50)",
        "(line 514,col 7)-(line 514,col 44)",
        "(line 515,col 7)-(line 515,col 64)",
        "(line 516,col 7)-(line 516,col 44)",
        "(line 517,col 7)-(line 517,col 44)",
        "(line 520,col 7)-(line 520,col 32)",
        "(line 521,col 7)-(line 521,col 32)",
        "(line 522,col 7)-(line 522,col 37)",
        "(line 523,col 7)-(line 525,col 7)",
        "(line 526,col 7)-(line 526,col 52)",
        "(line 527,col 7)-(line 527,col 33)",
        "(line 528,col 7)-(line 528,col 45)",
        "(line 529,col 7)-(line 529,col 44)",
        "(line 530,col 7)-(line 530,col 47)",
        "(line 531,col 7)-(line 531,col 50)",
        "(line 532,col 7)-(line 532,col 44)",
        "(line 533,col 7)-(line 533,col 55)",
        "(line 534,col 7)-(line 534,col 44)",
        "(line 535,col 7)-(line 535,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testCircleFittingBadInit()",
      "begin_line": 539,
      "end_line": 583,
      "comment": "",
      "child_ranges": [
        "(line 540,col 5)-(line 540,col 41)",
        "(line 541,col 5)-(line 571,col 6)",
        "(line 572,col 5)-(line 574,col 5)",
        "(line 575,col 5)-(line 575,col 78)",
        "(line 576,col 5)-(line 576,col 31)",
        "(line 577,col 5)-(line 577,col 52)",
        "(line 578,col 5)-(line 578,col 56)",
        "(line 579,col 5)-(line 579,col 74)",
        "(line 580,col 5)-(line 580,col 68)",
        "(line 581,col 5)-(line 581,col 68)",
        "(line 582,col 5)-(line 582,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testMath199()",
      "begin_line": 585,
      "end_line": 599,
      "comment": "",
      "child_ranges": [
        "(line 586,col 7)-(line 597,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LinearProblem",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.EstimationProblem"
      ],
      "begin_line": 601,
      "end_line": 628,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.LinearProblem.LinearProblem(org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.LinearMeasurement[])",
      "begin_line": 603,
      "end_line": 605,
      "comment": "",
      "child_ranges": [
        "(line 604,col 7)-(line 604,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.LinearProblem.getMeasurements()",
      "begin_line": 607,
      "end_line": 609,
      "comment": "",
      "child_ranges": [
        "(line 608,col 7)-(line 608,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.LinearProblem.getUnboundParameters()",
      "begin_line": 611,
      "end_line": 613,
      "comment": "",
      "child_ranges": [
        "(line 612,col 7)-(line 612,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.LinearProblem.getAllParameters()",
      "begin_line": 615,
      "end_line": 624,
      "comment": "",
      "child_ranges": [
        "(line 616,col 7)-(line 616,col 74)",
        "(line 617,col 7)-(line 622,col 7)",
        "(line 623,col 7)-(line 623,col 61)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "measurements"
      ],
      "begin_line": 626,
      "end_line": 626,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "LinearMeasurement",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.WeightedMeasurement"
      ],
      "begin_line": 630,
      "end_line": 666,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.LinearMeasurement.LinearMeasurement(double[], org.apache.commons.math.estimation.EstimatedParameter[], double)",
      "begin_line": 632,
      "end_line": 637,
      "comment": "",
      "child_ranges": [
        "(line 634,col 7)-(line 634,col 27)",
        "(line 635,col 7)-(line 635,col 29)",
        "(line 636,col 7)-(line 636,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.LinearMeasurement.getTheoreticalValue()",
      "begin_line": 639,
      "end_line": 646,
      "comment": "",
      "child_ranges": [
        "(line 641,col 7)-(line 641,col 19)",
        "(line 642,col 7)-(line 644,col 7)",
        "(line 645,col 7)-(line 645,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.LinearMeasurement.getPartial(org.apache.commons.math.estimation.EstimatedParameter)",
      "begin_line": 648,
      "end_line": 656,
      "comment": "",
      "child_ranges": [
        "(line 650,col 7)-(line 654,col 7)",
        "(line 655,col 7)-(line 655,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.LinearMeasurement.getParameters()",
      "begin_line": 658,
      "end_line": 660,
      "comment": "",
      "child_ranges": [
        "(line 659,col 7)-(line 659,col 24)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "factors"
      ],
      "begin_line": 662,
      "end_line": 662,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parameters"
      ],
      "begin_line": 663,
      "end_line": 663,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 664,
      "end_line": 664,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Circle",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.EstimationProblem"
      ],
      "begin_line": 668,
      "end_line": 777,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.Circle(double, double)",
      "begin_line": 670,
      "end_line": 674,
      "comment": "",
      "child_ranges": [
        "(line 671,col 7)-(line 671,col 49)",
        "(line 672,col 7)-(line 672,col 49)",
        "(line 673,col 7)-(line 673,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.addPoint(double, double)",
      "begin_line": 676,
      "end_line": 678,
      "comment": "",
      "child_ranges": [
        "(line 677,col 7)-(line 677,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.getM()",
      "begin_line": 680,
      "end_line": 682,
      "comment": "",
      "child_ranges": [
        "(line 681,col 7)-(line 681,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.getMeasurements()",
      "begin_line": 684,
      "end_line": 686,
      "comment": "",
      "child_ranges": [
        "(line 685,col 7)-(line 685,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.getAllParameters()",
      "begin_line": 688,
      "end_line": 690,
      "comment": "",
      "child_ranges": [
        "(line 689,col 7)-(line 689,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.getUnboundParameters()",
      "begin_line": 692,
      "end_line": 694,
      "comment": "",
      "child_ranges": [
        "(line 693,col 7)-(line 693,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.getPartialRadiusX()",
      "begin_line": 696,
      "end_line": 702,
      "comment": "",
      "child_ranges": [
        "(line 697,col 7)-(line 697,col 22)",
        "(line 698,col 7)-(line 700,col 7)",
        "(line 701,col 7)-(line 701,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.getPartialRadiusY()",
      "begin_line": 704,
      "end_line": 710,
      "comment": "",
      "child_ranges": [
        "(line 705,col 7)-(line 705,col 22)",
        "(line 706,col 7)-(line 708,col 7)",
        "(line 709,col 7)-(line 709,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.getRadius()",
      "begin_line": 712,
      "end_line": 718,
      "comment": "",
      "child_ranges": [
        "(line 713,col 7)-(line 713,col 19)",
        "(line 714,col 7)-(line 716,col 7)",
        "(line 717,col 7)-(line 717,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.getX()",
      "begin_line": 720,
      "end_line": 722,
      "comment": "",
      "child_ranges": [
        "(line 721,col 7)-(line 721,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.getY()",
      "begin_line": 724,
      "end_line": 726,
      "comment": "",
      "child_ranges": [
        "(line 725,col 7)-(line 725,col 30)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PointModel",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.WeightedMeasurement"
      ],
      "begin_line": 728,
      "end_line": 771,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.PointModel.PointModel(org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle, double, double)",
      "begin_line": 730,
      "end_line": 735,
      "comment": "",
      "child_ranges": [
        "(line 731,col 9)-(line 731,col 24)",
        "(line 732,col 9)-(line 732,col 21)",
        "(line 733,col 9)-(line 733,col 21)",
        "(line 734,col 9)-(line 734,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.PointModel.getPartial(org.apache.commons.math.estimation.EstimatedParameter)",
      "begin_line": 737,
      "end_line": 745,
      "comment": "",
      "child_ranges": [
        "(line 739,col 9)-(line 743,col 9)",
        "(line 744,col 9)-(line 744,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.PointModel.getCenterDistance()",
      "begin_line": 747,
      "end_line": 751,
      "comment": "",
      "child_ranges": [
        "(line 748,col 9)-(line 748,col 49)",
        "(line 749,col 9)-(line 749,col 49)",
        "(line 750,col 9)-(line 750,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.PointModel.getPartialDiX()",
      "begin_line": 753,
      "end_line": 755,
      "comment": "",
      "child_ranges": [
        "(line 754,col 9)-(line 754,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.PointModel.getPartialDiY()",
      "begin_line": 757,
      "end_line": 759,
      "comment": "",
      "child_ranges": [
        "(line 758,col 9)-(line 758,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.PointModel.getTheoreticalValue()",
      "begin_line": 761,
      "end_line": 764,
      "comment": "",
      "child_ranges": [
        "(line 763,col 9)-(line 763,col 56)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "px"
      ],
      "begin_line": 766,
      "end_line": 766,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "py"
      ],
      "begin_line": 767,
      "end_line": 767,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "circle"
      ],
      "begin_line": 768,
      "end_line": 768,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 769,
      "end_line": 769,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cx"
      ],
      "begin_line": 773,
      "end_line": 773,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cy"
      ],
      "begin_line": 774,
      "end_line": 774,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "points"
      ],
      "begin_line": 775,
      "end_line": 775,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "QuadraticProblem",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.SimpleEstimationProblem"
      ],
      "begin_line": 779,
      "end_line": 836,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 781,
      "end_line": 781,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 782,
      "end_line": 782,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "c"
      ],
      "begin_line": 783,
      "end_line": 783,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.QuadraticProblem.QuadraticProblem()",
      "begin_line": 785,
      "end_line": 792,
      "comment": "",
      "child_ranges": [
        "(line 786,col 11)-(line 786,col 47)",
        "(line 787,col 11)-(line 787,col 47)",
        "(line 788,col 11)-(line 788,col 47)",
        "(line 789,col 11)-(line 789,col 26)",
        "(line 790,col 11)-(line 790,col 26)",
        "(line 791,col 11)-(line 791,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.QuadraticProblem.addPoint(double, double, double)",
      "begin_line": 794,
      "end_line": 796,
      "comment": "",
      "child_ranges": [
        "(line 795,col 11)-(line 795,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.QuadraticProblem.theoreticalValue(double)",
      "begin_line": 798,
      "end_line": 800,
      "comment": "",
      "child_ranges": [
        "(line 799,col 11)-(line 799,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.QuadraticProblem.partial(double, org.apache.commons.math.estimation.EstimatedParameter)",
      "begin_line": 802,
      "end_line": 810,
      "comment": "",
      "child_ranges": [
        "(line 803,col 11)-(line 809,col 11)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LocalMeasurement",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.WeightedMeasurement"
      ],
      "begin_line": 812,
      "end_line": 835,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 814,
      "end_line": 814,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "x"
      ],
      "begin_line": 815,
      "end_line": 815,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pb"
      ],
      "begin_line": 816,
      "end_line": 816,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.QuadraticProblem.LocalMeasurement.LocalMeasurement(org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.QuadraticProblem, double, double, double)",
      "begin_line": 819,
      "end_line": 823,
      "comment": " constructor",
      "child_ranges": [
        "(line 820,col 15)-(line 820,col 26)",
        "(line 821,col 15)-(line 821,col 25)",
        "(line 822,col 15)-(line 822,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.QuadraticProblem.LocalMeasurement.getTheoreticalValue()",
      "begin_line": 825,
      "end_line": 828,
      "comment": "",
      "child_ranges": [
        "(line 827,col 15)-(line 827,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.QuadraticProblem.LocalMeasurement.getPartial(org.apache.commons.math.estimation.EstimatedParameter)",
      "begin_line": 830,
      "end_line": 833,
      "comment": "",
      "child_ranges": [
        "(line 832,col 15)-(line 832,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.suite()",
      "begin_line": 838,
      "end_line": 840,
      "comment": "",
      "child_ranges": [
        "(line 839,col 5)-(line 839,col 64)"
      ]
    }
  ]
}