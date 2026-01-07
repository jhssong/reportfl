{
  "filepath": "/tmp/Math-70b/src/test/java/org/apache/commons/math/estimation/GaussNewtonEstimatorTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GaussNewtonEstimatorTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 87,
      "end_line": 732,
      "comment": "\n * \u003cp\u003eSome of the unit tests are re-implementations of the MINPACK \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file17\"\u003efile17\u003c/a\u003e and \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file22\"\u003efile22\u003c/a\u003e test files.\n * The redistribution policy for MINPACK is available \u003ca\n * href\u003d\"http://www.netlib.org/minpack/disclaimer\"\u003ehere\u003c/a\u003e, for\n * convenience, it is reproduced below.\u003c/p\u003e\n\n * \u003ctable border\u003d\"0\" width\u003d\"80%\" cellpadding\u003d\"10\" align\u003d\"center\" bgcolor\u003d\"#E0E0E0\"\u003e\n * \u003ctr\u003e\u003ctd\u003e\n *    Minpack Copyright Notice (1999) University of Chicago.\n *    All rights reserved\n * \u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003e\n * Redistribution and use in source and binary forms, with or without\n * modification, are permitted provided that the following conditions\n * are met:\n * \u003col\u003e\n *  \u003cli\u003eRedistributions of source code must retain the above copyright\n *      notice, this list of conditions and the following disclaimer.\u003c/li\u003e\n * \u003cli\u003eRedistributions in binary form must reproduce the above\n *     copyright notice, this list of conditions and the following\n *     disclaimer in the documentation and/or other materials provided\n *     with the distribution.\u003c/li\u003e\n * \u003cli\u003eThe end-user documentation included with the redistribution, if any,\n *     must include the following acknowledgment:\n *     \u003ccode\u003eThis product includes software developed by the University of\n *           Chicago, as Operator of Argonne National Laboratory.\u003c/code\u003e\n *     Alternately, this acknowledgment may appear in the software itself,\n *     if and wherever such third-party acknowledgments normally appear.\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eWARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED \"AS IS\"\n *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE\n *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND\n *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR\n *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES\n *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE\n *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY\n *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR\n *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF\n *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)\n *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION\n *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL\n *     BE CORRECTED.\u003c/strong\u003e\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eLIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT\n *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF\n *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,\n *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF\n *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF\n *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER\n *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT\n *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,\n *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE\n *     POSSIBILITY OF SUCH LOSS OR DAMAGES.\u003c/strong\u003e\u003c/li\u003e\n * \u003col\u003e\u003c/td\u003e\u003c/tr\u003e\n * \u003c/table\u003e\n\n * @author Argonne National Laboratory. MINPACK project. March 1980 (original fortran minpack tests)\n * @author Burton S. Garbow (original fortran minpack tests)\n * @author Kenneth E. Hillstrom (original fortran minpack tests)\n * @author Jorge J. More (original fortran minpack tests)\n * @author Luc Maisonobe (non-minpack tests and minpack tests Java translation)\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.GaussNewtonEstimatorTest(java.lang.String)",
      "begin_line": 91,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 92,col 5)-(line 92,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.testTrivial()",
      "begin_line": 95,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 96,col 5)-(line 102,col 9)",
        "(line 103,col 5)-(line 103,col 83)",
        "(line 104,col 5)-(line 104,col 32)",
        "(line 105,col 5)-(line 105,col 56)",
        "(line 106,col 5)-(line 108,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.testQRColumnsPermutation()",
      "begin_line": 111,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 113,col 5)-(line 115,col 6)",
        "(line 116,col 5)-(line 126,col 7)",
        "(line 128,col 5)-(line 128,col 83)",
        "(line 129,col 5)-(line 129,col 32)",
        "(line 130,col 5)-(line 130,col 56)",
        "(line 131,col 5)-(line 131,col 51)",
        "(line 132,col 5)-(line 132,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.testNoDependency()",
      "begin_line": 136,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 137,col 5)-(line 144,col 6)",
        "(line 145,col 5)-(line 152,col 7)",
        "(line 153,col 3)-(line 153,col 81)",
        "(line 154,col 3)-(line 154,col 30)",
        "(line 155,col 3)-(line 155,col 54)",
        "(line 156,col 3)-(line 158,col 3)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.testOneSet()",
      "begin_line": 161,
      "end_line": 187,
      "comment": "",
      "child_ranges": [
        "(line 163,col 5)-(line 167,col 6)",
        "(line 168,col 5)-(line 178,col 7)",
        "(line 180,col 5)-(line 180,col 83)",
        "(line 181,col 5)-(line 181,col 32)",
        "(line 182,col 5)-(line 182,col 56)",
        "(line 183,col 5)-(line 183,col 51)",
        "(line 184,col 5)-(line 184,col 51)",
        "(line 185,col 5)-(line 185,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.testTwoSets()",
      "begin_line": 189,
      "end_line": 236,
      "comment": "",
      "child_ranges": [
        "(line 190,col 5)-(line 197,col 6)",
        "(line 199,col 5)-(line 199,col 28)",
        "(line 200,col 5)-(line 224,col 7)",
        "(line 226,col 5)-(line 226,col 83)",
        "(line 227,col 5)-(line 227,col 32)",
        "(line 228,col 5)-(line 228,col 56)",
        "(line 229,col 5)-(line 229,col 52)",
        "(line 230,col 5)-(line 230,col 52)",
        "(line 231,col 5)-(line 231,col 52)",
        "(line 232,col 5)-(line 232,col 52)",
        "(line 233,col 5)-(line 233,col 62)",
        "(line 234,col 5)-(line 234,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.testNonInversible()",
      "begin_line": 238,
      "end_line": 267,
      "comment": "",
      "child_ranges": [
        "(line 240,col 5)-(line 244,col 6)",
        "(line 245,col 5)-(line 255,col 6)",
        "(line 256,col 5)-(line 256,col 49)",
        "(line 258,col 5)-(line 258,col 83)",
        "(line 259,col 5)-(line 266,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.testIllConditioned()",
      "begin_line": 269,
      "end_line": 321,
      "comment": "",
      "child_ranges": [
        "(line 270,col 5)-(line 275,col 6)",
        "(line 277,col 5)-(line 290,col 7)",
        "(line 291,col 5)-(line 291,col 84)",
        "(line 292,col 5)-(line 292,col 34)",
        "(line 293,col 5)-(line 293,col 58)",
        "(line 294,col 5)-(line 294,col 51)",
        "(line 295,col 5)-(line 295,col 51)",
        "(line 296,col 5)-(line 296,col 51)",
        "(line 297,col 5)-(line 297,col 51)",
        "(line 299,col 5)-(line 312,col 7)",
        "(line 313,col 5)-(line 313,col 84)",
        "(line 314,col 5)-(line 314,col 34)",
        "(line 315,col 5)-(line 315,col 58)",
        "(line 316,col 5)-(line 316,col 52)",
        "(line 317,col 5)-(line 317,col 52)",
        "(line 318,col 5)-(line 318,col 52)",
        "(line 319,col 5)-(line 319,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.testMoreEstimatedParametersSimple()",
      "begin_line": 323,
      "end_line": 353,
      "comment": "",
      "child_ranges": [
        "(line 325,col 5)-(line 330,col 7)",
        "(line 331,col 5)-(line 341,col 7)",
        "(line 343,col 5)-(line 343,col 83)",
        "(line 344,col 5)-(line 351,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.testMoreEstimatedParametersUnsorted()",
      "begin_line": 355,
      "end_line": 392,
      "comment": "",
      "child_ranges": [
        "(line 356,col 5)-(line 363,col 6)",
        "(line 364,col 5)-(line 380,col 7)",
        "(line 382,col 5)-(line 382,col 83)",
        "(line 383,col 5)-(line 390,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.testRedundantEquations()",
      "begin_line": 394,
      "end_line": 420,
      "comment": "",
      "child_ranges": [
        "(line 395,col 5)-(line 398,col 6)",
        "(line 399,col 5)-(line 409,col 7)",
        "(line 411,col 5)-(line 411,col 83)",
        "(line 412,col 5)-(line 412,col 32)",
        "(line 413,col 5)-(line 413,col 56)",
        "(line 414,col 5)-(line 414,col 58)",
        "(line 415,col 5)-(line 418,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.testInconsistentEquations()",
      "begin_line": 422,
      "end_line": 443,
      "comment": "",
      "child_ranges": [
        "(line 423,col 5)-(line 426,col 6)",
        "(line 427,col 5)-(line 437,col 7)",
        "(line 439,col 5)-(line 439,col 83)",
        "(line 440,col 5)-(line 440,col 32)",
        "(line 441,col 5)-(line 441,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.testBoundParameters()",
      "begin_line": 445,
      "end_line": 481,
      "comment": "",
      "child_ranges": [
        "(line 446,col 7)-(line 450,col 8)",
        "(line 451,col 7)-(line 461,col 9)",
        "(line 463,col 7)-(line 463,col 85)",
        "(line 464,col 7)-(line 464,col 34)",
        "(line 465,col 7)-(line 465,col 54)",
        "(line 466,col 7)-(line 466,col 65)",
        "(line 467,col 7)-(line 467,col 25)",
        "(line 468,col 7)-(line 471,col 7)",
        "(line 472,col 7)-(line 472,col 60)",
        "(line 473,col 7)-(line 473,col 60)",
        "(line 474,col 7)-(line 474,col 60)",
        "(line 475,col 7)-(line 475,col 60)",
        "(line 477,col 7)-(line 477,col 65)",
        "(line 478,col 7)-(line 478,col 43)",
        "(line 479,col 7)-(line 479,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.testMaxIterations()",
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
        "(line 490,col 7)-(line 498,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.testCircleFitting()",
      "begin_line": 501,
      "end_line": 515,
      "comment": "",
      "child_ranges": [
        "(line 502,col 7)-(line 502,col 49)",
        "(line 503,col 7)-(line 503,col 36)",
        "(line 504,col 7)-(line 504,col 36)",
        "(line 505,col 7)-(line 505,col 36)",
        "(line 506,col 7)-(line 506,col 36)",
        "(line 507,col 7)-(line 507,col 36)",
        "(line 508,col 7)-(line 508,col 87)",
        "(line 509,col 7)-(line 509,col 33)",
        "(line 510,col 7)-(line 510,col 44)",
        "(line 511,col 7)-(line 511,col 81)",
        "(line 512,col 7)-(line 512,col 67)",
        "(line 513,col 7)-(line 513,col 67)",
        "(line 514,col 7)-(line 514,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.testCircleFittingBadInit()",
      "begin_line": 517,
      "end_line": 562,
      "comment": "",
      "child_ranges": [
        "(line 518,col 5)-(line 518,col 41)",
        "(line 519,col 5)-(line 549,col 6)",
        "(line 550,col 5)-(line 552,col 5)",
        "(line 553,col 5)-(line 553,col 83)",
        "(line 554,col 5)-(line 561,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LinearProblem",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.SimpleEstimationProblem"
      ],
      "begin_line": 564,
      "end_line": 580,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearProblem.LinearProblem(org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement[])",
      "begin_line": 566,
      "end_line": 578,
      "comment": "",
      "child_ranges": [
        "(line 567,col 7)-(line 567,col 74)",
        "(line 568,col 7)-(line 574,col 7)",
        "(line 575,col 7)-(line 577,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LinearMeasurement",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.WeightedMeasurement"
      ],
      "begin_line": 582,
      "end_line": 619,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement.LinearMeasurement(double[], org.apache.commons.math.estimation.EstimatedParameter[], double)",
      "begin_line": 584,
      "end_line": 590,
      "comment": "",
      "child_ranges": [
        "(line 586,col 7)-(line 586,col 33)",
        "(line 587,col 7)-(line 587,col 29)",
        "(line 588,col 7)-(line 588,col 35)",
        "(line 589,col 7)-(line 589,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement.getTheoreticalValue()",
      "begin_line": 592,
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
      "end_line": 609,
      "comment": "",
      "child_ranges": [
        "(line 603,col 7)-(line 607,col 7)",
        "(line 608,col 7)-(line 608,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.LinearMeasurement.getParameters()",
      "begin_line": 611,
      "end_line": 613,
      "comment": "",
      "child_ranges": [
        "(line 612,col 7)-(line 612,col 24)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "factors"
      ],
      "begin_line": 615,
      "end_line": 615,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parameters"
      ],
      "begin_line": 616,
      "end_line": 616,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 617,
      "end_line": 617,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Circle",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.EstimationProblem"
      ],
      "begin_line": 621,
      "end_line": 730,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.Circle(double, double)",
      "begin_line": 623,
      "end_line": 627,
      "comment": "",
      "child_ranges": [
        "(line 624,col 7)-(line 624,col 49)",
        "(line 625,col 7)-(line 625,col 73)",
        "(line 626,col 7)-(line 626,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.addPoint(double, double)",
      "begin_line": 629,
      "end_line": 631,
      "comment": "",
      "child_ranges": [
        "(line 630,col 7)-(line 630,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.getM()",
      "begin_line": 633,
      "end_line": 635,
      "comment": "",
      "child_ranges": [
        "(line 634,col 7)-(line 634,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.getMeasurements()",
      "begin_line": 637,
      "end_line": 639,
      "comment": "",
      "child_ranges": [
        "(line 638,col 7)-(line 638,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.getAllParameters()",
      "begin_line": 641,
      "end_line": 643,
      "comment": "",
      "child_ranges": [
        "(line 642,col 7)-(line 642,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.getUnboundParameters()",
      "begin_line": 645,
      "end_line": 647,
      "comment": "",
      "child_ranges": [
        "(line 646,col 7)-(line 646,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.getPartialRadiusX()",
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
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.getPartialRadiusY()",
      "begin_line": 657,
      "end_line": 663,
      "comment": "",
      "child_ranges": [
        "(line 658,col 7)-(line 658,col 22)",
        "(line 659,col 7)-(line 661,col 7)",
        "(line 662,col 7)-(line 662,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.getRadius()",
      "begin_line": 665,
      "end_line": 671,
      "comment": "",
      "child_ranges": [
        "(line 666,col 7)-(line 666,col 19)",
        "(line 667,col 7)-(line 669,col 7)",
        "(line 670,col 7)-(line 670,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.getX()",
      "begin_line": 673,
      "end_line": 675,
      "comment": "",
      "child_ranges": [
        "(line 674,col 7)-(line 674,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.getY()",
      "begin_line": 677,
      "end_line": 679,
      "comment": "",
      "child_ranges": [
        "(line 678,col 7)-(line 678,col 30)"
      ]
    },
    {
      "type": "class_interface",
      "name": "PointModel",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.WeightedMeasurement"
      ],
      "begin_line": 681,
      "end_line": 724,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.PointModel.PointModel(org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle, double, double)",
      "begin_line": 683,
      "end_line": 688,
      "comment": "",
      "child_ranges": [
        "(line 684,col 9)-(line 684,col 24)",
        "(line 685,col 9)-(line 685,col 21)",
        "(line 686,col 9)-(line 686,col 21)",
        "(line 687,col 9)-(line 687,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.PointModel.getPartial(org.apache.commons.math.estimation.EstimatedParameter)",
      "begin_line": 690,
      "end_line": 698,
      "comment": "",
      "child_ranges": [
        "(line 692,col 9)-(line 696,col 9)",
        "(line 697,col 9)-(line 697,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.PointModel.getCenterDistance()",
      "begin_line": 700,
      "end_line": 704,
      "comment": "",
      "child_ranges": [
        "(line 701,col 9)-(line 701,col 49)",
        "(line 702,col 9)-(line 702,col 49)",
        "(line 703,col 9)-(line 703,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.PointModel.getPartialDiX()",
      "begin_line": 706,
      "end_line": 708,
      "comment": "",
      "child_ranges": [
        "(line 707,col 9)-(line 707,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.PointModel.getPartialDiY()",
      "begin_line": 710,
      "end_line": 712,
      "comment": "",
      "child_ranges": [
        "(line 711,col 9)-(line 711,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.GaussNewtonEstimatorTest.Circle.PointModel.getTheoreticalValue()",
      "begin_line": 714,
      "end_line": 717,
      "comment": "",
      "child_ranges": [
        "(line 716,col 9)-(line 716,col 56)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "px"
      ],
      "begin_line": 719,
      "end_line": 719,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "py"
      ],
      "begin_line": 720,
      "end_line": 720,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "circle"
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
    }
  ]
}