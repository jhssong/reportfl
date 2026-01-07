{
  "filepath": "/tmp/Math-101b/src/test/org/apache/commons/math/estimation/LevenbergMarquardtEstimatorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LevenbergMarquardtEstimatorTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 95,
      "end_line": 767,
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
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 103,col 5)-(line 109,col 9)",
        "(line 110,col 5)-(line 110,col 78)",
        "(line 111,col 5)-(line 111,col 32)",
        "(line 112,col 5)-(line 112,col 56)",
        "(line 113,col 5)-(line 120,col 5)",
        "(line 121,col 5)-(line 123,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testQRColumnsPermutation()",
      "begin_line": 126,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 128,col 5)-(line 130,col 6)",
        "(line 131,col 5)-(line 141,col 7)",
        "(line 143,col 5)-(line 143,col 78)",
        "(line 144,col 5)-(line 144,col 32)",
        "(line 145,col 5)-(line 145,col 56)",
        "(line 146,col 5)-(line 146,col 51)",
        "(line 147,col 5)-(line 147,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testNoDependency()",
      "begin_line": 151,
      "end_line": 174,
      "comment": "",
      "child_ranges": [
        "(line 152,col 5)-(line 159,col 6)",
        "(line 160,col 5)-(line 167,col 7)",
        "(line 168,col 3)-(line 168,col 76)",
        "(line 169,col 3)-(line 169,col 30)",
        "(line 170,col 3)-(line 170,col 54)",
        "(line 171,col 3)-(line 173,col 3)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testOneSet()",
      "begin_line": 176,
      "end_line": 202,
      "comment": "",
      "child_ranges": [
        "(line 178,col 5)-(line 182,col 6)",
        "(line 183,col 5)-(line 193,col 7)",
        "(line 195,col 5)-(line 195,col 78)",
        "(line 196,col 5)-(line 196,col 32)",
        "(line 197,col 5)-(line 197,col 56)",
        "(line 198,col 5)-(line 198,col 51)",
        "(line 199,col 5)-(line 199,col 51)",
        "(line 200,col 5)-(line 200,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testTwoSets()",
      "begin_line": 204,
      "end_line": 251,
      "comment": "",
      "child_ranges": [
        "(line 205,col 5)-(line 212,col 6)",
        "(line 214,col 5)-(line 214,col 28)",
        "(line 215,col 5)-(line 239,col 7)",
        "(line 241,col 5)-(line 241,col 78)",
        "(line 242,col 5)-(line 242,col 32)",
        "(line 243,col 5)-(line 243,col 56)",
        "(line 244,col 5)-(line 244,col 52)",
        "(line 245,col 5)-(line 245,col 52)",
        "(line 246,col 5)-(line 246,col 52)",
        "(line 247,col 5)-(line 247,col 52)",
        "(line 248,col 5)-(line 248,col 62)",
        "(line 249,col 5)-(line 249,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testNonInversible()",
      "begin_line": 253,
      "end_line": 298,
      "comment": "",
      "child_ranges": [
        "(line 255,col 5)-(line 259,col 6)",
        "(line 260,col 5)-(line 270,col 6)",
        "(line 271,col 5)-(line 271,col 49)",
        "(line 273,col 5)-(line 273,col 78)",
        "(line 274,col 5)-(line 274,col 51)",
        "(line 275,col 5)-(line 275,col 32)",
        "(line 276,col 5)-(line 276,col 56)",
        "(line 277,col 5)-(line 277,col 70)",
        "(line 278,col 5)-(line 285,col 5)",
        "(line 286,col 4)-(line 288,col 66)",
        "(line 289,col 5)-(line 290,col 66)",
        "(line 291,col 5)-(line 293,col 66)",
        "(line 294,col 5)-(line 294,col 34)",
        "(line 295,col 5)-(line 295,col 34)",
        "(line 296,col 5)-(line 296,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testIllConditioned()",
      "begin_line": 300,
      "end_line": 352,
      "comment": "",
      "child_ranges": [
        "(line 301,col 5)-(line 306,col 6)",
        "(line 308,col 5)-(line 321,col 7)",
        "(line 322,col 5)-(line 322,col 79)",
        "(line 323,col 5)-(line 323,col 34)",
        "(line 324,col 5)-(line 324,col 58)",
        "(line 325,col 5)-(line 325,col 51)",
        "(line 326,col 5)-(line 326,col 51)",
        "(line 327,col 5)-(line 327,col 51)",
        "(line 328,col 5)-(line 328,col 51)",
        "(line 330,col 5)-(line 343,col 7)",
        "(line 344,col 5)-(line 344,col 79)",
        "(line 345,col 5)-(line 345,col 34)",
        "(line 346,col 5)-(line 346,col 58)",
        "(line 347,col 5)-(line 347,col 52)",
        "(line 348,col 5)-(line 348,col 52)",
        "(line 349,col 5)-(line 349,col 52)",
        "(line 350,col 5)-(line 350,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testMoreEstimatedParametersSimple()",
      "begin_line": 354,
      "end_line": 378,
      "comment": "",
      "child_ranges": [
        "(line 356,col 5)-(line 361,col 7)",
        "(line 362,col 5)-(line 372,col 7)",
        "(line 374,col 5)-(line 374,col 78)",
        "(line 375,col 5)-(line 375,col 32)",
        "(line 376,col 5)-(line 376,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testMoreEstimatedParametersUnsorted()",
      "begin_line": 380,
      "end_line": 415,
      "comment": "",
      "child_ranges": [
        "(line 381,col 5)-(line 388,col 6)",
        "(line 389,col 5)-(line 405,col 7)",
        "(line 407,col 5)-(line 407,col 78)",
        "(line 408,col 5)-(line 408,col 32)",
        "(line 409,col 5)-(line 409,col 56)",
        "(line 410,col 5)-(line 410,col 51)",
        "(line 411,col 5)-(line 411,col 51)",
        "(line 412,col 5)-(line 412,col 51)",
        "(line 413,col 5)-(line 413,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testRedundantEquations()",
      "begin_line": 417,
      "end_line": 440,
      "comment": "",
      "child_ranges": [
        "(line 418,col 5)-(line 421,col 6)",
        "(line 422,col 5)-(line 432,col 7)",
        "(line 434,col 5)-(line 434,col 78)",
        "(line 435,col 5)-(line 435,col 32)",
        "(line 436,col 5)-(line 436,col 56)",
        "(line 437,col 5)-(line 437,col 51)",
        "(line 438,col 5)-(line 438,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testInconsistentEquations()",
      "begin_line": 442,
      "end_line": 463,
      "comment": "",
      "child_ranges": [
        "(line 443,col 5)-(line 446,col 6)",
        "(line 447,col 5)-(line 457,col 7)",
        "(line 459,col 5)-(line 459,col 78)",
        "(line 460,col 5)-(line 460,col 32)",
        "(line 461,col 5)-(line 461,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testControlParameters()",
      "begin_line": 465,
      "end_line": 477,
      "comment": "",
      "child_ranges": [
        "(line 466,col 7)-(line 466,col 49)",
        "(line 467,col 7)-(line 467,col 36)",
        "(line 468,col 7)-(line 468,col 36)",
        "(line 469,col 7)-(line 469,col 36)",
        "(line 470,col 7)-(line 470,col 36)",
        "(line 471,col 7)-(line 471,col 36)",
        "(line 472,col 7)-(line 472,col 71)",
        "(line 473,col 7)-(line 473,col 70)",
        "(line 474,col 7)-(line 474,col 70)",
        "(line 475,col 7)-(line 475,col 33)",
        "(line 476,col 7)-(line 476,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.checkEstimate(org.apache.commons.math.estimation.EstimationProblem, double, int, double, double, double, boolean)",
      "begin_line": 479,
      "end_line": 497,
      "comment": "",
      "child_ranges": [
        "(line 483,col 7)-(line 496,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testCircleFitting()",
      "begin_line": 499,
      "end_line": 542,
      "comment": "",
      "child_ranges": [
        "(line 500,col 7)-(line 500,col 49)",
        "(line 501,col 7)-(line 501,col 36)",
        "(line 502,col 7)-(line 502,col 36)",
        "(line 503,col 7)-(line 503,col 36)",
        "(line 504,col 7)-(line 504,col 36)",
        "(line 505,col 7)-(line 505,col 36)",
        "(line 506,col 7)-(line 506,col 80)",
        "(line 507,col 7)-(line 507,col 33)",
        "(line 508,col 7)-(line 508,col 54)",
        "(line 509,col 7)-(line 509,col 58)",
        "(line 510,col 7)-(line 510,col 44)",
        "(line 511,col 7)-(line 511,col 81)",
        "(line 512,col 7)-(line 512,col 67)",
        "(line 513,col 7)-(line 513,col 67)",
        "(line 514,col 7)-(line 514,col 67)",
        "(line 515,col 7)-(line 515,col 56)",
        "(line 516,col 7)-(line 516,col 44)",
        "(line 517,col 7)-(line 517,col 44)",
        "(line 518,col 7)-(line 518,col 50)",
        "(line 519,col 7)-(line 519,col 44)",
        "(line 520,col 7)-(line 520,col 64)",
        "(line 521,col 7)-(line 521,col 44)",
        "(line 522,col 7)-(line 522,col 44)",
        "(line 525,col 7)-(line 525,col 32)",
        "(line 526,col 7)-(line 526,col 32)",
        "(line 527,col 7)-(line 527,col 37)",
        "(line 528,col 7)-(line 530,col 7)",
        "(line 531,col 7)-(line 531,col 52)",
        "(line 532,col 7)-(line 532,col 33)",
        "(line 533,col 7)-(line 533,col 45)",
        "(line 534,col 7)-(line 534,col 44)",
        "(line 535,col 7)-(line 535,col 47)",
        "(line 536,col 7)-(line 536,col 50)",
        "(line 537,col 7)-(line 537,col 44)",
        "(line 538,col 7)-(line 538,col 55)",
        "(line 539,col 7)-(line 539,col 44)",
        "(line 540,col 7)-(line 540,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.testCircleFittingBadInit()",
      "begin_line": 544,
      "end_line": 588,
      "comment": "",
      "child_ranges": [
        "(line 545,col 5)-(line 545,col 41)",
        "(line 546,col 5)-(line 576,col 6)",
        "(line 577,col 5)-(line 579,col 5)",
        "(line 580,col 5)-(line 580,col 78)",
        "(line 581,col 5)-(line 581,col 31)",
        "(line 582,col 5)-(line 582,col 52)",
        "(line 583,col 5)-(line 583,col 56)",
        "(line 584,col 5)-(line 584,col 74)",
        "(line 585,col 5)-(line 585,col 68)",
        "(line 586,col 5)-(line 586,col 68)",
        "(line 587,col 5)-(line 587,col 68)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LinearProblem",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.EstimationProblem"
      ],
      "begin_line": 590,
      "end_line": 618,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.LinearProblem.LinearProblem(org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.LinearMeasurement[])",
      "begin_line": 592,
      "end_line": 594,
      "comment": "",
      "child_ranges": [
        "(line 593,col 7)-(line 593,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.LinearProblem.getMeasurements()",
      "begin_line": 596,
      "end_line": 598,
      "comment": "",
      "child_ranges": [
        "(line 597,col 7)-(line 597,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.LinearProblem.getUnboundParameters()",
      "begin_line": 600,
      "end_line": 602,
      "comment": "",
      "child_ranges": [
        "(line 601,col 7)-(line 601,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.LinearProblem.getAllParameters()",
      "begin_line": 604,
      "end_line": 614,
      "comment": "",
      "child_ranges": [
        "(line 605,col 7)-(line 605,col 34)",
        "(line 606,col 7)-(line 611,col 7)",
        "(line 612,col 7)-(line 612,col 29)",
        "(line 613,col 7)-(line 613,col 84)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "measurements"
      ],
      "begin_line": 616,
      "end_line": 616,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "LinearMeasurement",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.WeightedMeasurement"
      ],
      "begin_line": 620,
      "end_line": 654,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.LinearMeasurement.LinearMeasurement(double[], org.apache.commons.math.estimation.EstimatedParameter[], double)",
      "begin_line": 622,
      "end_line": 627,
      "comment": "",
      "child_ranges": [
        "(line 624,col 7)-(line 624,col 27)",
        "(line 625,col 7)-(line 625,col 29)",
        "(line 626,col 7)-(line 626,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.LinearMeasurement.getTheoreticalValue()",
      "begin_line": 629,
      "end_line": 635,
      "comment": "",
      "child_ranges": [
        "(line 630,col 7)-(line 630,col 19)",
        "(line 631,col 7)-(line 633,col 7)",
        "(line 634,col 7)-(line 634,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.LinearMeasurement.getPartial(org.apache.commons.math.estimation.EstimatedParameter)",
      "begin_line": 637,
      "end_line": 644,
      "comment": "",
      "child_ranges": [
        "(line 638,col 7)-(line 642,col 7)",
        "(line 643,col 7)-(line 643,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.LinearMeasurement.getParameters()",
      "begin_line": 646,
      "end_line": 648,
      "comment": "",
      "child_ranges": [
        "(line 647,col 7)-(line 647,col 24)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "factors"
      ],
      "begin_line": 650,
      "end_line": 650,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parameters"
      ],
      "begin_line": 651,
      "end_line": 651,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 652,
      "end_line": 652,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Circle",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.EstimationProblem"
      ],
      "begin_line": 656,
      "end_line": 761,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.Circle(double, double)",
      "begin_line": 658,
      "end_line": 662,
      "comment": "",
      "child_ranges": [
        "(line 659,col 7)-(line 659,col 49)",
        "(line 660,col 7)-(line 660,col 49)",
        "(line 661,col 7)-(line 661,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.addPoint(double, double)",
      "begin_line": 664,
      "end_line": 666,
      "comment": "",
      "child_ranges": [
        "(line 665,col 7)-(line 665,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.getM()",
      "begin_line": 668,
      "end_line": 670,
      "comment": "",
      "child_ranges": [
        "(line 669,col 7)-(line 669,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.getMeasurements()",
      "begin_line": 672,
      "end_line": 674,
      "comment": "",
      "child_ranges": [
        "(line 673,col 7)-(line 673,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.getAllParameters()",
      "begin_line": 676,
      "end_line": 678,
      "comment": "",
      "child_ranges": [
        "(line 677,col 7)-(line 677,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.getUnboundParameters()",
      "begin_line": 680,
      "end_line": 682,
      "comment": "",
      "child_ranges": [
        "(line 681,col 7)-(line 681,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.getPartialRadiusX()",
      "begin_line": 684,
      "end_line": 690,
      "comment": "",
      "child_ranges": [
        "(line 685,col 7)-(line 685,col 22)",
        "(line 686,col 7)-(line 688,col 7)",
        "(line 689,col 7)-(line 689,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.getPartialRadiusY()",
      "begin_line": 692,
      "end_line": 698,
      "comment": "",
      "child_ranges": [
        "(line 693,col 7)-(line 693,col 22)",
        "(line 694,col 7)-(line 696,col 7)",
        "(line 697,col 7)-(line 697,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.getRadius()",
      "begin_line": 700,
      "end_line": 706,
      "comment": "",
      "child_ranges": [
        "(line 701,col 7)-(line 701,col 19)",
        "(line 702,col 7)-(line 704,col 7)",
        "(line 705,col 7)-(line 705,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.getX()",
      "begin_line": 708,
      "end_line": 710,
      "comment": "",
      "child_ranges": [
        "(line 709,col 7)-(line 709,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.getY()",
      "begin_line": 712,
      "end_line": 714,
      "comment": "",
      "child_ranges": [
        "(line 713,col 7)-(line 713,col 30)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PointModel",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.WeightedMeasurement"
      ],
      "begin_line": 716,
      "end_line": 755,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.PointModel.PointModel(double, double)",
      "begin_line": 718,
      "end_line": 722,
      "comment": "",
      "child_ranges": [
        "(line 719,col 9)-(line 719,col 24)",
        "(line 720,col 9)-(line 720,col 21)",
        "(line 721,col 9)-(line 721,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.PointModel.getPartial(org.apache.commons.math.estimation.EstimatedParameter)",
      "begin_line": 724,
      "end_line": 731,
      "comment": "",
      "child_ranges": [
        "(line 725,col 9)-(line 729,col 9)",
        "(line 730,col 9)-(line 730,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.PointModel.getCenterDistance()",
      "begin_line": 733,
      "end_line": 737,
      "comment": "",
      "child_ranges": [
        "(line 734,col 9)-(line 734,col 42)",
        "(line 735,col 9)-(line 735,col 42)",
        "(line 736,col 9)-(line 736,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.PointModel.getPartialDiX()",
      "begin_line": 739,
      "end_line": 741,
      "comment": "",
      "child_ranges": [
        "(line 740,col 9)-(line 740,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.PointModel.getPartialDiY()",
      "begin_line": 743,
      "end_line": 745,
      "comment": "",
      "child_ranges": [
        "(line 744,col 9)-(line 744,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.Circle.PointModel.getTheoreticalValue()",
      "begin_line": 747,
      "end_line": 749,
      "comment": "",
      "child_ranges": [
        "(line 748,col 9)-(line 748,col 49)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "px"
      ],
      "begin_line": 751,
      "end_line": 751,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "py"
      ],
      "begin_line": 752,
      "end_line": 752,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 753,
      "end_line": 753,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cx"
      ],
      "begin_line": 757,
      "end_line": 757,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cy"
      ],
      "begin_line": 758,
      "end_line": 758,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "points"
      ],
      "begin_line": 759,
      "end_line": 759,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest.suite()",
      "begin_line": 763,
      "end_line": 765,
      "comment": "",
      "child_ranges": [
        "(line 764,col 5)-(line 764,col 64)"
      ]
    }
  ]
}