{
  "filepath": "/tmp/Math-70b/src/test/java/org/apache/commons/math/estimation/LevenbergMarquardtEstimatorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LevenbergMarquardtEstimatorTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 87,
      "end_line": 836,
      "comment": "\n * \u003cp\u003eSome of the unit tests are re-implementations of the MINPACK \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file17\"\u003efile17\u003c/a\u003e and \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file22\"\u003efile22\u003c/a\u003e test files.\n * The redistribution policy for MINPACK is available \u003ca\n * href\u003d\"http://www.netlib.org/minpack/disclaimer\"\u003ehere\u003c/a\u003e, for\n * convenience, it is reproduced below.\u003c/p\u003e\n\n * \u003ctable border\u003d\"0\" width\u003d\"80%\" cellpadding\u003d\"10\" align\u003d\"center\" bgcolor\u003d\"#E0E0E0\"\u003e\n * \u003ctr\u003e\u003ctd\u003e\n *    Minpack Copyright Notice (1999) University of Chicago.\n *    All rights reserved\n * \u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003e\n * Redistribution and use in source and binary forms, with or without\n * modification, are permitted provided that the following conditions\n * are met:\n * \u003col\u003e\n *  \u003cli\u003eRedistributions of source code must retain the above copyright\n *      notice, this list of conditions and the following disclaimer.\u003c/li\u003e\n * \u003cli\u003eRedistributions in binary form must reproduce the above\n *     copyright notice, this list of conditions and the following\n *     disclaimer in the documentation and/or other materials provided\n *     with the distribution.\u003c/li\u003e\n * \u003cli\u003eThe end-user documentation included with the redistribution, if any,\n *     must include the following acknowledgment:\n *     \u003ccode\u003eThis product includes software developed by the University of\n *           Chicago, as Operator of Argonne National Laboratory.\u003c/code\u003e\n *     Alternately, this acknowledgment may appear in the software itself,\n *     if and wherever such third-party acknowledgments normally appear.\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eWARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED \"AS IS\"\n *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE\n *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND\n *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR\n *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES\n *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE\n *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY\n *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR\n *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF\n *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)\n *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION\n *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL\n *     BE CORRECTED.\u003c/strong\u003e\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eLIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT\n *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF\n *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,\n *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF\n *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF\n *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER\n *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT\n *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,\n *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE\n *     POSSIBILITY OF SUCH LOSS OR DAMAGES.\u003c/strong\u003e\u003c/li\u003e\n * \u003col\u003e\u003c/td\u003e\u003c/tr\u003e\n * \u003c/table\u003e\n\n * @author Argonne National Laboratory. MINPACK project. March 1980 (original fortran minpack tests)\n * @author Burton S. Garbow (original fortran minpack tests)\n * @author Kenneth E. Hillstrom (original fortran minpack tests)\n * @author Jorge J. More (original fortran minpack tests)\n * @author Luc Maisonobe (non-minpack tests and minpack tests Java translation)\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.LevenbergMarquardtEstimatorTest(java.lang.String)",
      "begin_line": 91,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 92,col 5)-(line 92,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testTrivial()",
      "begin_line": 95,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 96,col 5)-(line 102,col 9)",
        "(line 103,col 5)-(line 103,col 78)",
        "(line 104,col 5)-(line 104,col 32)",
        "(line 105,col 5)-(line 105,col 56)",
        "(line 106,col 5)-(line 113,col 5)",
        "(line 114,col 5)-(line 116,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testQRColumnsPermutation()",
      "begin_line": 119,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 121,col 5)-(line 123,col 6)",
        "(line 124,col 5)-(line 134,col 7)",
        "(line 136,col 5)-(line 136,col 78)",
        "(line 137,col 5)-(line 137,col 32)",
        "(line 138,col 5)-(line 138,col 56)",
        "(line 139,col 5)-(line 139,col 51)",
        "(line 140,col 5)-(line 140,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testNoDependency()",
      "begin_line": 144,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 145,col 5)-(line 152,col 6)",
        "(line 153,col 5)-(line 160,col 7)",
        "(line 161,col 3)-(line 161,col 76)",
        "(line 162,col 3)-(line 162,col 30)",
        "(line 163,col 3)-(line 163,col 54)",
        "(line 164,col 3)-(line 166,col 3)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testOneSet()",
      "begin_line": 169,
      "end_line": 195,
      "comment": "",
      "child_ranges": [
        "(line 171,col 5)-(line 175,col 6)",
        "(line 176,col 5)-(line 186,col 7)",
        "(line 188,col 5)-(line 188,col 78)",
        "(line 189,col 5)-(line 189,col 32)",
        "(line 190,col 5)-(line 190,col 56)",
        "(line 191,col 5)-(line 191,col 51)",
        "(line 192,col 5)-(line 192,col 51)",
        "(line 193,col 5)-(line 193,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testTwoSets()",
      "begin_line": 197,
      "end_line": 244,
      "comment": "",
      "child_ranges": [
        "(line 198,col 5)-(line 205,col 6)",
        "(line 207,col 5)-(line 207,col 28)",
        "(line 208,col 5)-(line 232,col 7)",
        "(line 234,col 5)-(line 234,col 78)",
        "(line 235,col 5)-(line 235,col 32)",
        "(line 236,col 5)-(line 236,col 56)",
        "(line 237,col 5)-(line 237,col 52)",
        "(line 238,col 5)-(line 238,col 52)",
        "(line 239,col 5)-(line 239,col 52)",
        "(line 240,col 5)-(line 240,col 52)",
        "(line 241,col 5)-(line 241,col 62)",
        "(line 242,col 5)-(line 242,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testNonInversible()",
      "begin_line": 246,
      "end_line": 291,
      "comment": "",
      "child_ranges": [
        "(line 248,col 5)-(line 252,col 6)",
        "(line 253,col 5)-(line 263,col 6)",
        "(line 264,col 5)-(line 264,col 49)",
        "(line 266,col 5)-(line 266,col 78)",
        "(line 267,col 5)-(line 267,col 51)",
        "(line 268,col 5)-(line 268,col 32)",
        "(line 269,col 5)-(line 269,col 56)",
        "(line 270,col 5)-(line 270,col 70)",
        "(line 271,col 5)-(line 278,col 5)",
        "(line 279,col 4)-(line 281,col 66)",
        "(line 282,col 5)-(line 283,col 66)",
        "(line 284,col 5)-(line 286,col 66)",
        "(line 287,col 5)-(line 287,col 34)",
        "(line 288,col 5)-(line 288,col 34)",
        "(line 289,col 5)-(line 289,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testIllConditioned()",
      "begin_line": 293,
      "end_line": 345,
      "comment": "",
      "child_ranges": [
        "(line 294,col 5)-(line 299,col 6)",
        "(line 301,col 5)-(line 314,col 7)",
        "(line 315,col 5)-(line 315,col 79)",
        "(line 316,col 5)-(line 316,col 34)",
        "(line 317,col 5)-(line 317,col 58)",
        "(line 318,col 5)-(line 318,col 51)",
        "(line 319,col 5)-(line 319,col 51)",
        "(line 320,col 5)-(line 320,col 51)",
        "(line 321,col 5)-(line 321,col 51)",
        "(line 323,col 5)-(line 336,col 7)",
        "(line 337,col 5)-(line 337,col 79)",
        "(line 338,col 5)-(line 338,col 34)",
        "(line 339,col 5)-(line 339,col 58)",
        "(line 340,col 5)-(line 340,col 52)",
        "(line 341,col 5)-(line 341,col 52)",
        "(line 342,col 5)-(line 342,col 52)",
        "(line 343,col 5)-(line 343,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testMoreEstimatedParametersSimple()",
      "begin_line": 347,
      "end_line": 371,
      "comment": "",
      "child_ranges": [
        "(line 349,col 5)-(line 354,col 7)",
        "(line 355,col 5)-(line 365,col 7)",
        "(line 367,col 5)-(line 367,col 78)",
        "(line 368,col 5)-(line 368,col 32)",
        "(line 369,col 5)-(line 369,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testMoreEstimatedParametersUnsorted()",
      "begin_line": 373,
      "end_line": 408,
      "comment": "",
      "child_ranges": [
        "(line 374,col 5)-(line 381,col 6)",
        "(line 382,col 5)-(line 398,col 7)",
        "(line 400,col 5)-(line 400,col 78)",
        "(line 401,col 5)-(line 401,col 32)",
        "(line 402,col 5)-(line 402,col 56)",
        "(line 403,col 5)-(line 403,col 51)",
        "(line 404,col 5)-(line 404,col 51)",
        "(line 405,col 5)-(line 405,col 51)",
        "(line 406,col 5)-(line 406,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testRedundantEquations()",
      "begin_line": 410,
      "end_line": 433,
      "comment": "",
      "child_ranges": [
        "(line 411,col 5)-(line 414,col 6)",
        "(line 415,col 5)-(line 425,col 7)",
        "(line 427,col 5)-(line 427,col 78)",
        "(line 428,col 5)-(line 428,col 32)",
        "(line 429,col 5)-(line 429,col 56)",
        "(line 430,col 5)-(line 430,col 51)",
        "(line 431,col 5)-(line 431,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testInconsistentEquations()",
      "begin_line": 435,
      "end_line": 456,
      "comment": "",
      "child_ranges": [
        "(line 436,col 5)-(line 439,col 6)",
        "(line 440,col 5)-(line 450,col 7)",
        "(line 452,col 5)-(line 452,col 78)",
        "(line 453,col 5)-(line 453,col 32)",
        "(line 454,col 5)-(line 454,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testControlParameters()",
      "begin_line": 458,
      "end_line": 470,
      "comment": "",
      "child_ranges": [
        "(line 459,col 7)-(line 459,col 49)",
        "(line 460,col 7)-(line 460,col 36)",
        "(line 461,col 7)-(line 461,col 36)",
        "(line 462,col 7)-(line 462,col 36)",
        "(line 463,col 7)-(line 463,col 36)",
        "(line 464,col 7)-(line 464,col 36)",
        "(line 465,col 7)-(line 465,col 71)",
        "(line 466,col 7)-(line 466,col 70)",
        "(line 467,col 7)-(line 467,col 70)",
        "(line 468,col 7)-(line 468,col 33)",
        "(line 469,col 7)-(line 469,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.checkEstimate(org.apache.commons.math.estimation.EstimationProblem, double, int, double, double, double, boolean)",
      "begin_line": 472,
      "end_line": 490,
      "comment": "",
      "child_ranges": [
        "(line 476,col 7)-(line 489,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testCircleFitting()",
      "begin_line": 492,
      "end_line": 535,
      "comment": "",
      "child_ranges": [
        "(line 493,col 7)-(line 493,col 49)",
        "(line 494,col 7)-(line 494,col 36)",
        "(line 495,col 7)-(line 495,col 36)",
        "(line 496,col 7)-(line 496,col 36)",
        "(line 497,col 7)-(line 497,col 36)",
        "(line 498,col 7)-(line 498,col 36)",
        "(line 499,col 7)-(line 499,col 80)",
        "(line 500,col 7)-(line 500,col 33)",
        "(line 501,col 7)-(line 501,col 54)",
        "(line 502,col 7)-(line 502,col 58)",
        "(line 503,col 7)-(line 503,col 44)",
        "(line 504,col 7)-(line 504,col 81)",
        "(line 505,col 7)-(line 505,col 67)",
        "(line 506,col 7)-(line 506,col 67)",
        "(line 507,col 7)-(line 507,col 67)",
        "(line 508,col 7)-(line 508,col 56)",
        "(line 509,col 7)-(line 509,col 44)",
        "(line 510,col 7)-(line 510,col 44)",
        "(line 511,col 7)-(line 511,col 50)",
        "(line 512,col 7)-(line 512,col 44)",
        "(line 513,col 7)-(line 513,col 64)",
        "(line 514,col 7)-(line 514,col 44)",
        "(line 515,col 7)-(line 515,col 44)",
        "(line 518,col 7)-(line 518,col 32)",
        "(line 519,col 7)-(line 519,col 32)",
        "(line 520,col 7)-(line 520,col 37)",
        "(line 521,col 7)-(line 523,col 7)",
        "(line 524,col 7)-(line 524,col 52)",
        "(line 525,col 7)-(line 525,col 33)",
        "(line 526,col 7)-(line 526,col 45)",
        "(line 527,col 7)-(line 527,col 44)",
        "(line 528,col 7)-(line 528,col 47)",
        "(line 529,col 7)-(line 529,col 50)",
        "(line 530,col 7)-(line 530,col 44)",
        "(line 531,col 7)-(line 531,col 55)",
        "(line 532,col 7)-(line 532,col 44)",
        "(line 533,col 7)-(line 533,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testCircleFittingBadInit()",
      "begin_line": 537,
      "end_line": 581,
      "comment": "",
      "child_ranges": [
        "(line 538,col 5)-(line 538,col 41)",
        "(line 539,col 5)-(line 569,col 6)",
        "(line 570,col 5)-(line 572,col 5)",
        "(line 573,col 5)-(line 573,col 78)",
        "(line 574,col 5)-(line 574,col 31)",
        "(line 575,col 5)-(line 575,col 52)",
        "(line 576,col 5)-(line 576,col 56)",
        "(line 577,col 5)-(line 577,col 74)",
        "(line 578,col 5)-(line 578,col 68)",
        "(line 579,col 5)-(line 579,col 68)",
        "(line 580,col 5)-(line 580,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testMath199()",
      "begin_line": 583,
      "end_line": 597,
      "comment": "",
      "child_ranges": [
        "(line 584,col 7)-(line 595,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LinearProblem",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.EstimationProblem"
      ],
      "begin_line": 599,
      "end_line": 626,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.LinearProblem.LinearProblem(org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.LinearMeasurement[])",
      "begin_line": 601,
      "end_line": 603,
      "comment": "",
      "child_ranges": [
        "(line 602,col 7)-(line 602,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.LinearProblem.getMeasurements()",
      "begin_line": 605,
      "end_line": 607,
      "comment": "",
      "child_ranges": [
        "(line 606,col 7)-(line 606,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.LinearProblem.getUnboundParameters()",
      "begin_line": 609,
      "end_line": 611,
      "comment": "",
      "child_ranges": [
        "(line 610,col 7)-(line 610,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.LinearProblem.getAllParameters()",
      "begin_line": 613,
      "end_line": 622,
      "comment": "",
      "child_ranges": [
        "(line 614,col 7)-(line 614,col 74)",
        "(line 615,col 7)-(line 620,col 7)",
        "(line 621,col 7)-(line 621,col 61)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "measurements"
      ],
      "begin_line": 624,
      "end_line": 624,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "LinearMeasurement",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.WeightedMeasurement"
      ],
      "begin_line": 628,
      "end_line": 664,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.LinearMeasurement.LinearMeasurement(double[], org.apache.commons.math.estimation.EstimatedParameter[], double)",
      "begin_line": 630,
      "end_line": 635,
      "comment": "",
      "child_ranges": [
        "(line 632,col 7)-(line 632,col 27)",
        "(line 633,col 7)-(line 633,col 29)",
        "(line 634,col 7)-(line 634,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.LinearMeasurement.getTheoreticalValue()",
      "begin_line": 637,
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
      "end_line": 654,
      "comment": "",
      "child_ranges": [
        "(line 648,col 7)-(line 652,col 7)",
        "(line 653,col 7)-(line 653,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.LinearMeasurement.getParameters()",
      "begin_line": 656,
      "end_line": 658,
      "comment": "",
      "child_ranges": [
        "(line 657,col 7)-(line 657,col 24)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "factors"
      ],
      "begin_line": 660,
      "end_line": 660,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parameters"
      ],
      "begin_line": 661,
      "end_line": 661,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 662,
      "end_line": 662,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Circle",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.EstimationProblem"
      ],
      "begin_line": 666,
      "end_line": 775,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.Circle(double, double)",
      "begin_line": 668,
      "end_line": 672,
      "comment": "",
      "child_ranges": [
        "(line 669,col 7)-(line 669,col 49)",
        "(line 670,col 7)-(line 670,col 49)",
        "(line 671,col 7)-(line 671,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.addPoint(double, double)",
      "begin_line": 674,
      "end_line": 676,
      "comment": "",
      "child_ranges": [
        "(line 675,col 7)-(line 675,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.getM()",
      "begin_line": 678,
      "end_line": 680,
      "comment": "",
      "child_ranges": [
        "(line 679,col 7)-(line 679,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.getMeasurements()",
      "begin_line": 682,
      "end_line": 684,
      "comment": "",
      "child_ranges": [
        "(line 683,col 7)-(line 683,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.getAllParameters()",
      "begin_line": 686,
      "end_line": 688,
      "comment": "",
      "child_ranges": [
        "(line 687,col 7)-(line 687,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.getUnboundParameters()",
      "begin_line": 690,
      "end_line": 692,
      "comment": "",
      "child_ranges": [
        "(line 691,col 7)-(line 691,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.getPartialRadiusX()",
      "begin_line": 694,
      "end_line": 700,
      "comment": "",
      "child_ranges": [
        "(line 695,col 7)-(line 695,col 22)",
        "(line 696,col 7)-(line 698,col 7)",
        "(line 699,col 7)-(line 699,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.getPartialRadiusY()",
      "begin_line": 702,
      "end_line": 708,
      "comment": "",
      "child_ranges": [
        "(line 703,col 7)-(line 703,col 22)",
        "(line 704,col 7)-(line 706,col 7)",
        "(line 707,col 7)-(line 707,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.getRadius()",
      "begin_line": 710,
      "end_line": 716,
      "comment": "",
      "child_ranges": [
        "(line 711,col 7)-(line 711,col 19)",
        "(line 712,col 7)-(line 714,col 7)",
        "(line 715,col 7)-(line 715,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.getX()",
      "begin_line": 718,
      "end_line": 720,
      "comment": "",
      "child_ranges": [
        "(line 719,col 7)-(line 719,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.getY()",
      "begin_line": 722,
      "end_line": 724,
      "comment": "",
      "child_ranges": [
        "(line 723,col 7)-(line 723,col 30)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PointModel",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.WeightedMeasurement"
      ],
      "begin_line": 726,
      "end_line": 769,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.PointModel.PointModel(org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle, double, double)",
      "begin_line": 728,
      "end_line": 733,
      "comment": "",
      "child_ranges": [
        "(line 729,col 9)-(line 729,col 24)",
        "(line 730,col 9)-(line 730,col 21)",
        "(line 731,col 9)-(line 731,col 21)",
        "(line 732,col 9)-(line 732,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.PointModel.getPartial(org.apache.commons.math.estimation.EstimatedParameter)",
      "begin_line": 735,
      "end_line": 743,
      "comment": "",
      "child_ranges": [
        "(line 737,col 9)-(line 741,col 9)",
        "(line 742,col 9)-(line 742,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.PointModel.getCenterDistance()",
      "begin_line": 745,
      "end_line": 749,
      "comment": "",
      "child_ranges": [
        "(line 746,col 9)-(line 746,col 49)",
        "(line 747,col 9)-(line 747,col 49)",
        "(line 748,col 9)-(line 748,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.PointModel.getPartialDiX()",
      "begin_line": 751,
      "end_line": 753,
      "comment": "",
      "child_ranges": [
        "(line 752,col 9)-(line 752,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.PointModel.getPartialDiY()",
      "begin_line": 755,
      "end_line": 757,
      "comment": "",
      "child_ranges": [
        "(line 756,col 9)-(line 756,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.PointModel.getTheoreticalValue()",
      "begin_line": 759,
      "end_line": 762,
      "comment": "",
      "child_ranges": [
        "(line 761,col 9)-(line 761,col 56)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "px"
      ],
      "begin_line": 764,
      "end_line": 764,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "py"
      ],
      "begin_line": 765,
      "end_line": 765,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "circle"
      ],
      "begin_line": 766,
      "end_line": 766,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 767,
      "end_line": 767,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cx"
      ],
      "begin_line": 771,
      "end_line": 771,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cy"
      ],
      "begin_line": 772,
      "end_line": 772,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "points"
      ],
      "begin_line": 773,
      "end_line": 773,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "QuadraticProblem",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.SimpleEstimationProblem"
      ],
      "begin_line": 777,
      "end_line": 834,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "a"
      ],
      "begin_line": 779,
      "end_line": 779,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "b"
      ],
      "begin_line": 780,
      "end_line": 780,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "c"
      ],
      "begin_line": 781,
      "end_line": 781,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.QuadraticProblem.QuadraticProblem()",
      "begin_line": 783,
      "end_line": 790,
      "comment": "",
      "child_ranges": [
        "(line 784,col 11)-(line 784,col 47)",
        "(line 785,col 11)-(line 785,col 47)",
        "(line 786,col 11)-(line 786,col 47)",
        "(line 787,col 11)-(line 787,col 26)",
        "(line 788,col 11)-(line 788,col 26)",
        "(line 789,col 11)-(line 789,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.QuadraticProblem.addPoint(double, double, double)",
      "begin_line": 792,
      "end_line": 794,
      "comment": "",
      "child_ranges": [
        "(line 793,col 11)-(line 793,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.QuadraticProblem.theoreticalValue(double)",
      "begin_line": 796,
      "end_line": 798,
      "comment": "",
      "child_ranges": [
        "(line 797,col 11)-(line 797,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.QuadraticProblem.partial(double, org.apache.commons.math.estimation.EstimatedParameter)",
      "begin_line": 800,
      "end_line": 808,
      "comment": "",
      "child_ranges": [
        "(line 801,col 11)-(line 807,col 11)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LocalMeasurement",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.WeightedMeasurement"
      ],
      "begin_line": 810,
      "end_line": 833,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 812,
      "end_line": 812,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "x"
      ],
      "begin_line": 813,
      "end_line": 813,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "pb"
      ],
      "begin_line": 814,
      "end_line": 814,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.QuadraticProblem.LocalMeasurement.LocalMeasurement(org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.QuadraticProblem, double, double, double)",
      "begin_line": 817,
      "end_line": 821,
      "comment": " constructor",
      "child_ranges": [
        "(line 818,col 15)-(line 818,col 26)",
        "(line 819,col 15)-(line 819,col 25)",
        "(line 820,col 15)-(line 820,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.QuadraticProblem.LocalMeasurement.getTheoreticalValue()",
      "begin_line": 823,
      "end_line": 826,
      "comment": "",
      "child_ranges": [
        "(line 825,col 15)-(line 825,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.QuadraticProblem.LocalMeasurement.getPartial(org.apache.commons.math.estimation.EstimatedParameter)",
      "begin_line": 828,
      "end_line": 831,
      "comment": "",
      "child_ranges": [
        "(line 830,col 15)-(line 830,col 46)"
      ]
    }
  ]
}