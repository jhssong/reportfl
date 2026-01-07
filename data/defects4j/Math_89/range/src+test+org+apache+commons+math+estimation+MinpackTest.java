{
  "filepath": "/tmp/Math-89b/src/test/org/apache/commons/math/estimation/MinpackTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MinpackTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 92,
      "end_line": 1538,
      "comment": "\n * \u003cp\u003eSome of the unit tests are re-implementations of the MINPACK \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file17\"\u003efile17\u003c/a\u003e and \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file22\"\u003efile22\u003c/a\u003e test files. \n * The redistribution policy for MINPACK is available \u003ca\n * href\u003d\"http://www.netlib.org/minpack/disclaimer\"\u003ehere\u003c/a\u003e, for\n * convenience, it is reproduced below.\u003c/p\u003e\n\n * \u003ctable border\u003d\"0\" width\u003d\"80%\" cellpadding\u003d\"10\" align\u003d\"center\" bgcolor\u003d\"#E0E0E0\"\u003e\n * \u003ctr\u003e\u003ctd\u003e\n *    Minpack Copyright Notice (1999) University of Chicago.\n *    All rights reserved\n * \u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003e\n * Redistribution and use in source and binary forms, with or without\n * modification, are permitted provided that the following conditions\n * are met:\n * \u003col\u003e\n *  \u003cli\u003eRedistributions of source code must retain the above copyright\n *      notice, this list of conditions and the following disclaimer.\u003c/li\u003e\n * \u003cli\u003eRedistributions in binary form must reproduce the above\n *     copyright notice, this list of conditions and the following\n *     disclaimer in the documentation and/or other materials provided\n *     with the distribution.\u003c/li\u003e\n * \u003cli\u003eThe end-user documentation included with the redistribution, if any,\n *     must include the following acknowledgment:\n *     \u003ccode\u003eThis product includes software developed by the University of\n *           Chicago, as Operator of Argonne National Laboratory.\u003c/code\u003e\n *     Alternately, this acknowledgment may appear in the software itself,\n *     if and wherever such third-party acknowledgments normally appear.\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eWARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED \"AS IS\"\n *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE\n *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND\n *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR\n *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES\n *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE\n *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY\n *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR\n *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF\n *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)\n *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION\n *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL\n *     BE CORRECTED.\u003c/strong\u003e\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eLIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT\n *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF\n *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,\n *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF\n *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF\n *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER\n *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT\n *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,\n *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE\n *     POSSIBILITY OF SUCH LOSS OR DAMAGES.\u003c/strong\u003e\u003c/li\u003e\n * \u003col\u003e\u003c/td\u003e\u003c/tr\u003e\n * \u003c/table\u003e\n\n * @author Argonne National Laboratory. MINPACK project. March 1980 (original fortran minpack tests)\n * @author Burton S. Garbow (original fortran minpack tests)\n * @author Kenneth E. Hillstrom (original fortran minpack tests)\n * @author Jorge J. More (original fortran minpack tests)\n * @author Luc Maisonobe (non-minpack tests and minpack tests Java translation)\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackTest(java.lang.String)",
      "begin_line": 96,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 97,col 5)-(line 97,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackLinearFullRank()",
      "begin_line": 100,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 101,col 5)-(line 102,col 74)",
        "(line 103,col 5)-(line 104,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackLinearRank1()",
      "begin_line": 107,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 108,col 5)-(line 109,col 83)",
        "(line 110,col 5)-(line 111,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackLinearRank1ZeroColsAndRows()",
      "begin_line": 114,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 115,col 5)-(line 115,col 75)",
        "(line 116,col 5)-(line 116,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackRosenbrok()",
      "begin_line": 119,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 120,col 5)-(line 121,col 64)",
        "(line 122,col 5)-(line 123,col 69)",
        "(line 124,col 5)-(line 125,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackHelicalValley()",
      "begin_line": 128,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 129,col 5)-(line 130,col 56)",
        "(line 131,col 5)-(line 132,col 67)",
        "(line 133,col 5)-(line 134,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackPowellSingular()",
      "begin_line": 137,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 138,col 5)-(line 139,col 69)",
        "(line 140,col 5)-(line 141,col 68)",
        "(line 142,col 5)-(line 143,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackFreudensteinRoth()",
      "begin_line": 146,
      "end_line": 165,
      "comment": "",
      "child_ranges": [
        "(line 147,col 5)-(line 152,col 56)",
        "(line 153,col 5)-(line 158,col 56)",
        "(line 159,col 5)-(line 164,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackBard()",
      "begin_line": 167,
      "end_line": 186,
      "comment": "",
      "child_ranges": [
        "(line 168,col 5)-(line 173,col 44)",
        "(line 174,col 5)-(line 179,col 44)",
        "(line 180,col 5)-(line 185,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackKowalikOsborne()",
      "begin_line": 188,
      "end_line": 216,
      "comment": "",
      "child_ranges": [
        "(line 189,col 5)-(line 197,col 54)",
        "(line 198,col 5)-(line 206,col 54)",
        "(line 207,col 5)-(line 215,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackMeyer()",
      "begin_line": 218,
      "end_line": 233,
      "comment": "",
      "child_ranges": [
        "(line 219,col 5)-(line 225,col 45)",
        "(line 226,col 5)-(line 232,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackWatson()",
      "begin_line": 235,
      "end_line": 318,
      "comment": "",
      "child_ranges": [
        "(line 237,col 5)-(line 243,col 46)",
        "(line 244,col 5)-(line 250,col 46)",
        "(line 251,col 5)-(line 257,col 46)",
        "(line 259,col 5)-(line 267,col 46)",
        "(line 268,col 5)-(line 276,col 46)",
        "(line 277,col 5)-(line 285,col 46)",
        "(line 287,col 5)-(line 296,col 46)",
        "(line 297,col 5)-(line 306,col 46)",
        "(line 307,col 5)-(line 316,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackBox3Dimensional()",
      "begin_line": 320,
      "end_line": 323,
      "comment": "",
      "child_ranges": [
        "(line 321,col 5)-(line 322,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackJennrichSampson()",
      "begin_line": 325,
      "end_line": 331,
      "comment": "",
      "child_ranges": [
        "(line 326,col 5)-(line 330,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackBrownDennis()",
      "begin_line": 333,
      "end_line": 355,
      "comment": "",
      "child_ranges": [
        "(line 334,col 5)-(line 340,col 51)",
        "(line 341,col 5)-(line 347,col 50)",
        "(line 348,col 5)-(line 354,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackChebyquad()",
      "begin_line": 357,
      "end_line": 393,
      "comment": "",
      "child_ranges": [
        "(line 358,col 5)-(line 360,col 68)",
        "(line 361,col 5)-(line 363,col 80)",
        "(line 364,col 5)-(line 366,col 80)",
        "(line 367,col 5)-(line 374,col 49)",
        "(line 375,col 5)-(line 383,col 49)",
        "(line 384,col 5)-(line 392,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackBrownAlmostLinear()",
      "begin_line": 395,
      "end_line": 461,
      "comment": "",
      "child_ranges": [
        "(line 396,col 5)-(line 404,col 57)",
        "(line 405,col 5)-(line 413,col 57)",
        "(line 414,col 5)-(line 419,col 57)",
        "(line 420,col 5)-(line 438,col 57)",
        "(line 439,col 5)-(line 460,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackOsborne1()",
      "begin_line": 463,
      "end_line": 471,
      "comment": "",
      "child_ranges": [
        "(line 464,col 7)-(line 470,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackOsborne2()",
      "begin_line": 473,
      "end_line": 488,
      "comment": "",
      "child_ranges": [
        "(line 475,col 5)-(line 487,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.minpackTest(org.apache.commons.math.estimation.MinpackTest.MinpackFunction, boolean)",
      "begin_line": 490,
      "end_line": 505,
      "comment": "",
      "child_ranges": [
        "(line 491,col 5)-(line 491,col 78)",
        "(line 492,col 5)-(line 492,col 58)",
        "(line 493,col 5)-(line 493,col 69)",
        "(line 494,col 5)-(line 494,col 68)",
        "(line 495,col 5)-(line 495,col 51)",
        "(line 496,col 5)-(line 496,col 79)",
        "(line 497,col 5)-(line 502,col 5)",
        "(line 503,col 5)-(line 503,col 77)",
        "(line 504,col 5)-(line 504,col 53)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MinpackFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.EstimationProblem"
      ],
      "begin_line": 507,
      "end_line": 632,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.MinpackFunction(int, double[], double, double, double[])",
      "begin_line": 509,
      "end_line": 525,
      "comment": "",
      "child_ranges": [
        "(line 514,col 7)-(line 514,col 17)",
        "(line 515,col 7)-(line 515,col 34)",
        "(line 516,col 7)-(line 516,col 45)",
        "(line 517,col 7)-(line 519,col 7)",
        "(line 520,col 7)-(line 520,col 55)",
        "(line 521,col 7)-(line 521,col 53)",
        "(line 522,col 7)-(line 522,col 55)",
        "(line 523,col 7)-(line 523,col 41)",
        "(line 524,col 7)-(line 524,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.buildArray(int, double)",
      "begin_line": 527,
      "end_line": 531,
      "comment": "",
      "child_ranges": [
        "(line 528,col 7)-(line 528,col 37)",
        "(line 529,col 7)-(line 529,col 28)",
        "(line 530,col 7)-(line 530,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.setCostAccuracy(double)",
      "begin_line": 533,
      "end_line": 535,
      "comment": "",
      "child_ranges": [
        "(line 534,col 7)-(line 534,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.setParamsAccuracy(double)",
      "begin_line": 537,
      "end_line": 539,
      "comment": "",
      "child_ranges": [
        "(line 538,col 7)-(line 538,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.getN()",
      "begin_line": 541,
      "end_line": 543,
      "comment": "",
      "child_ranges": [
        "(line 542,col 7)-(line 542,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.checkTheoreticalStartCost(double)",
      "begin_line": 545,
      "end_line": 548,
      "comment": "",
      "child_ranges": [
        "(line 546,col 7)-(line 546,col 69)",
        "(line 547,col 7)-(line 547,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.checkTheoreticalMinCost(double)",
      "begin_line": 550,
      "end_line": 553,
      "comment": "",
      "child_ranges": [
        "(line 551,col 7)-(line 551,col 67)",
        "(line 552,col 6)-(line 552,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.checkTheoreticalMinParams()",
      "begin_line": 555,
      "end_line": 566,
      "comment": "",
      "child_ranges": [
        "(line 556,col 7)-(line 564,col 7)",
        "(line 565,col 7)-(line 565,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.getMeasurements()",
      "begin_line": 568,
      "end_line": 574,
      "comment": "",
      "child_ranges": [
        "(line 569,col 7)-(line 569,col 70)",
        "(line 570,col 7)-(line 572,col 7)",
        "(line 573,col 7)-(line 573,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.getUnboundParameters()",
      "begin_line": 576,
      "end_line": 578,
      "comment": "",
      "child_ranges": [
        "(line 577,col 7)-(line 577,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.getAllParameters()",
      "begin_line": 580,
      "end_line": 582,
      "comment": "",
      "child_ranges": [
        "(line 581,col 7)-(line 581,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.getJacobian()",
      "begin_line": 584,
      "end_line": 584,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.getResiduals()",
      "begin_line": 586,
      "end_line": 586,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "MinpackMeasurement",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.WeightedMeasurement"
      ],
      "begin_line": 588,
      "end_line": 621,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.MinpackMeasurement.MinpackMeasurement(int)",
      "begin_line": 590,
      "end_line": 593,
      "comment": "",
      "child_ranges": [
        "(line 591,col 9)-(line 591,col 24)",
        "(line 592,col 9)-(line 592,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.MinpackMeasurement.getTheoreticalValue()",
      "begin_line": 595,
      "end_line": 602,
      "comment": "",
      "child_ranges": [
        "(line 601,col 9)-(line 601,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.MinpackMeasurement.getPartial(org.apache.commons.math.estimation.EstimatedParameter)",
      "begin_line": 604,
      "end_line": 616,
      "comment": "",
      "child_ranges": [
        "(line 610,col 9)-(line 614,col 9)",
        "(line 615,col 9)-(line 615,col 17)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "index"
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
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 623,
      "end_line": 623,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "m"
      ],
      "begin_line": 624,
      "end_line": 624,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parameters"
      ],
      "begin_line": 625,
      "end_line": 625,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "theoreticalStartCost"
      ],
      "begin_line": 626,
      "end_line": 626,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "theoreticalMinCost"
      ],
      "begin_line": 627,
      "end_line": 627,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "theoreticalMinParams"
      ],
      "begin_line": 628,
      "end_line": 628,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "costAccuracy"
      ],
      "begin_line": 629,
      "end_line": 629,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "paramsAccuracy"
      ],
      "begin_line": 630,
      "end_line": 630,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "LinearFullRankFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 634,
      "end_line": 671,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.LinearFullRankFunction.LinearFullRankFunction(int, int, double, double, double)",
      "begin_line": 636,
      "end_line": 641,
      "comment": "",
      "child_ranges": [
        "(line 639,col 7)-(line 640,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.LinearFullRankFunction.getJacobian()",
      "begin_line": 643,
      "end_line": 654,
      "comment": "",
      "child_ranges": [
        "(line 645,col 7)-(line 645,col 25)",
        "(line 646,col 7)-(line 646,col 44)",
        "(line 647,col 7)-(line 652,col 7)",
        "(line 653,col 7)-(line 653,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.LinearFullRankFunction.getResiduals()",
      "begin_line": 656,
      "end_line": 669,
      "comment": "",
      "child_ranges": [
        "(line 658,col 7)-(line 658,col 21)",
        "(line 659,col 7)-(line 661,col 7)",
        "(line 662,col 7)-(line 662,col 34)",
        "(line 663,col 7)-(line 663,col 33)",
        "(line 664,col 7)-(line 666,col 7)",
        "(line 667,col 7)-(line 667,col 31)",
        "(line 668,col 7)-(line 668,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LinearRank1Function",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 673,
      "end_line": 706,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.LinearRank1Function.LinearRank1Function(int, int, double, double, double)",
      "begin_line": 675,
      "end_line": 679,
      "comment": "",
      "child_ranges": [
        "(line 678,col 7)-(line 678,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.LinearRank1Function.getJacobian()",
      "begin_line": 681,
      "end_line": 691,
      "comment": "",
      "child_ranges": [
        "(line 683,col 7)-(line 683,col 44)",
        "(line 684,col 7)-(line 689,col 7)",
        "(line 690,col 7)-(line 690,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.LinearRank1Function.getResiduals()",
      "begin_line": 693,
      "end_line": 704,
      "comment": "",
      "child_ranges": [
        "(line 695,col 7)-(line 695,col 33)",
        "(line 696,col 7)-(line 696,col 21)",
        "(line 697,col 7)-(line 699,col 7)",
        "(line 700,col 7)-(line 702,col 7)",
        "(line 703,col 7)-(line 703,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LinearRank1ZeroColsAndRowsFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 708,
      "end_line": 751,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.LinearRank1ZeroColsAndRowsFunction.LinearRank1ZeroColsAndRowsFunction(int, int, double)",
      "begin_line": 710,
      "end_line": 715,
      "comment": "",
      "child_ranges": [
        "(line 711,col 7)-(line 714,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.LinearRank1ZeroColsAndRowsFunction.getJacobian()",
      "begin_line": 717,
      "end_line": 735,
      "comment": "",
      "child_ranges": [
        "(line 719,col 7)-(line 719,col 44)",
        "(line 720,col 7)-(line 733,col 7)",
        "(line 734,col 7)-(line 734,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.LinearRank1ZeroColsAndRowsFunction.getResiduals()",
      "begin_line": 737,
      "end_line": 749,
      "comment": "",
      "child_ranges": [
        "(line 739,col 7)-(line 739,col 33)",
        "(line 740,col 7)-(line 740,col 21)",
        "(line 741,col 7)-(line 743,col 7)",
        "(line 744,col 7)-(line 746,col 7)",
        "(line 747,col 7)-(line 747,col 20)",
        "(line 748,col 7)-(line 748,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RosenbrockFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 753,
      "end_line": 772,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.RosenbrockFunction.RosenbrockFunction(double[], double)",
      "begin_line": 755,
      "end_line": 757,
      "comment": "",
      "child_ranges": [
        "(line 756,col 7)-(line 756,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.RosenbrockFunction.getJacobian()",
      "begin_line": 759,
      "end_line": 763,
      "comment": "",
      "child_ranges": [
        "(line 761,col 7)-(line 761,col 46)",
        "(line 762,col 7)-(line 762,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.RosenbrockFunction.getResiduals()",
      "begin_line": 765,
      "end_line": 770,
      "comment": "",
      "child_ranges": [
        "(line 767,col 7)-(line 767,col 46)",
        "(line 768,col 7)-(line 768,col 46)",
        "(line 769,col 7)-(line 769,col 58)"
      ]
    },
    {
      "type": "class_interface",
      "name": "HelicalValleyFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 774,
      "end_line": 820,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.HelicalValleyFunction.HelicalValleyFunction(double[], double)",
      "begin_line": 776,
      "end_line": 780,
      "comment": "",
      "child_ranges": [
        "(line 778,col 7)-(line 779,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.HelicalValleyFunction.getJacobian()",
      "begin_line": 782,
      "end_line": 794,
      "comment": "",
      "child_ranges": [
        "(line 784,col 7)-(line 784,col 46)",
        "(line 785,col 7)-(line 785,col 46)",
        "(line 786,col 7)-(line 786,col 43)",
        "(line 787,col 7)-(line 787,col 38)",
        "(line 788,col 7)-(line 788,col 41)",
        "(line 789,col 7)-(line 793,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.HelicalValleyFunction.getResiduals()",
      "begin_line": 796,
      "end_line": 816,
      "comment": "",
      "child_ranges": [
        "(line 798,col 7)-(line 798,col 46)",
        "(line 799,col 7)-(line 799,col 46)",
        "(line 800,col 7)-(line 800,col 46)",
        "(line 801,col 7)-(line 801,col 18)",
        "(line 802,col 7)-(line 809,col 7)",
        "(line 810,col 7)-(line 810,col 49)",
        "(line 811,col 7)-(line 815,col 8)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "twoPi"
      ],
      "begin_line": 818,
      "end_line": 818,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "PowellSingularFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 822,
      "end_line": 860,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.PowellSingularFunction.PowellSingularFunction(double[], double)",
      "begin_line": 824,
      "end_line": 827,
      "comment": "",
      "child_ranges": [
        "(line 826,col 7)-(line 826,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.PowellSingularFunction.getJacobian()",
      "begin_line": 829,
      "end_line": 841,
      "comment": "",
      "child_ranges": [
        "(line 831,col 7)-(line 831,col 46)",
        "(line 832,col 7)-(line 832,col 46)",
        "(line 833,col 7)-(line 833,col 46)",
        "(line 834,col 7)-(line 834,col 46)",
        "(line 835,col 7)-(line 840,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.PowellSingularFunction.getResiduals()",
      "begin_line": 843,
      "end_line": 855,
      "comment": "",
      "child_ranges": [
        "(line 845,col 7)-(line 845,col 46)",
        "(line 846,col 7)-(line 846,col 46)",
        "(line 847,col 7)-(line 847,col 46)",
        "(line 848,col 7)-(line 848,col 46)",
        "(line 849,col 7)-(line 854,col 8)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "sqrt5"
      ],
      "begin_line": 857,
      "end_line": 857,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sqrt10"
      ],
      "begin_line": 858,
      "end_line": 858,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "FreudensteinRothFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 862,
      "end_line": 891,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.FreudensteinRothFunction.FreudensteinRothFunction(double[], double, double, double[])",
      "begin_line": 864,
      "end_line": 870,
      "comment": "",
      "child_ranges": [
        "(line 868,col 7)-(line 869,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.FreudensteinRothFunction.getJacobian()",
      "begin_line": 872,
      "end_line": 879,
      "comment": "",
      "child_ranges": [
        "(line 874,col 7)-(line 874,col 46)",
        "(line 875,col 7)-(line 878,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.FreudensteinRothFunction.getResiduals()",
      "begin_line": 881,
      "end_line": 889,
      "comment": "",
      "child_ranges": [
        "(line 883,col 7)-(line 883,col 46)",
        "(line 884,col 7)-(line 884,col 46)",
        "(line 885,col 7)-(line 888,col 8)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BardFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 893,
      "end_line": 940,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.BardFunction.BardFunction(double, double, double, double[])",
      "begin_line": 895,
      "end_line": 901,
      "comment": "",
      "child_ranges": [
        "(line 899,col 7)-(line 900,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.BardFunction.getJacobian()",
      "begin_line": 903,
      "end_line": 917,
      "comment": "",
      "child_ranges": [
        "(line 905,col 7)-(line 905,col 48)",
        "(line 906,col 7)-(line 906,col 48)",
        "(line 907,col 7)-(line 907,col 44)",
        "(line 908,col 7)-(line 915,col 7)",
        "(line 916,col 7)-(line 916,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.BardFunction.getResiduals()",
      "begin_line": 919,
      "end_line": 932,
      "comment": "",
      "child_ranges": [
        "(line 921,col 7)-(line 921,col 48)",
        "(line 922,col 7)-(line 922,col 48)",
        "(line 923,col 7)-(line 923,col 48)",
        "(line 924,col 7)-(line 924,col 33)",
        "(line 925,col 7)-(line 930,col 7)",
        "(line 931,col 7)-(line 931,col 15)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 934,
      "end_line": 938,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "KowalikOsborneFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 942,
      "end_line": 996,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.KowalikOsborneFunction.KowalikOsborneFunction(double[], double, double, double[])",
      "begin_line": 944,
      "end_line": 954,
      "comment": "",
      "child_ranges": [
        "(line 948,col 7)-(line 949,col 54)",
        "(line 950,col 7)-(line 953,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.KowalikOsborneFunction.getJacobian()",
      "begin_line": 956,
      "end_line": 972,
      "comment": "",
      "child_ranges": [
        "(line 958,col 7)-(line 958,col 48)",
        "(line 959,col 7)-(line 959,col 48)",
        "(line 960,col 7)-(line 960,col 48)",
        "(line 961,col 7)-(line 961,col 48)",
        "(line 962,col 7)-(line 962,col 44)",
        "(line 963,col 7)-(line 970,col 7)",
        "(line 971,col 7)-(line 971,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.KowalikOsborneFunction.getResiduals()",
      "begin_line": 974,
      "end_line": 985,
      "comment": "",
      "child_ranges": [
        "(line 976,col 7)-(line 976,col 46)",
        "(line 977,col 7)-(line 977,col 46)",
        "(line 978,col 7)-(line 978,col 46)",
        "(line 979,col 7)-(line 979,col 46)",
        "(line 980,col 7)-(line 980,col 33)",
        "(line 981,col 7)-(line 983,col 7)",
        "(line 984,col 7)-(line 984,col 15)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "v"
      ],
      "begin_line": 987,
      "end_line": 989,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 991,
      "end_line": 994,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "MeyerFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 998,
      "end_line": 1047,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MeyerFunction.MeyerFunction(double[], double, double, double[])",
      "begin_line": 1000,
      "end_line": 1010,
      "comment": "",
      "child_ranges": [
        "(line 1004,col 7)-(line 1005,col 54)",
        "(line 1006,col 7)-(line 1009,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MeyerFunction.getJacobian()",
      "begin_line": 1012,
      "end_line": 1026,
      "comment": "",
      "child_ranges": [
        "(line 1014,col 7)-(line 1014,col 48)",
        "(line 1015,col 7)-(line 1015,col 48)",
        "(line 1016,col 7)-(line 1016,col 48)",
        "(line 1017,col 7)-(line 1017,col 44)",
        "(line 1018,col 7)-(line 1024,col 7)",
        "(line 1025,col 7)-(line 1025,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MeyerFunction.getResiduals()",
      "begin_line": 1028,
      "end_line": 1038,
      "comment": "",
      "child_ranges": [
        "(line 1030,col 7)-(line 1030,col 46)",
        "(line 1031,col 7)-(line 1031,col 46)",
        "(line 1032,col 7)-(line 1032,col 46)",
        "(line 1033,col 7)-(line 1033,col 33)",
        "(line 1034,col 7)-(line 1036,col 7)",
        "(line 1037,col 6)-(line 1037,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 1040,
      "end_line": 1045,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "WatsonFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1049,
      "end_line": 1121,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.WatsonFunction.WatsonFunction(int, double, double, double, double[])",
      "begin_line": 1051,
      "end_line": 1057,
      "comment": "",
      "child_ranges": [
        "(line 1055,col 7)-(line 1056,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.WatsonFunction.getJacobian()",
      "begin_line": 1059,
      "end_line": 1090,
      "comment": "",
      "child_ranges": [
        "(line 1062,col 7)-(line 1062,col 44)",
        "(line 1064,col 7)-(line 1079,col 7)",
        "(line 1081,col 7)-(line 1081,col 41)",
        "(line 1082,col 7)-(line 1082,col 29)",
        "(line 1084,col 7)-(line 1084,col 40)",
        "(line 1085,col 7)-(line 1085,col 59)",
        "(line 1086,col 7)-(line 1086,col 28)",
        "(line 1088,col 7)-(line 1088,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.WatsonFunction.getResiduals()",
      "begin_line": 1092,
      "end_line": 1119,
      "comment": "",
      "child_ranges": [
        "(line 1094,col 6)-(line 1094,col 32)",
        "(line 1095,col 6)-(line 1110,col 6)",
        "(line 1112,col 6)-(line 1112,col 45)",
        "(line 1113,col 6)-(line 1113,col 45)",
        "(line 1114,col 6)-(line 1114,col 19)",
        "(line 1115,col 6)-(line 1115,col 33)",
        "(line 1117,col 6)-(line 1117,col 14)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Box3DimensionalFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1123,
      "end_line": 1161,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.Box3DimensionalFunction.Box3DimensionalFunction(int, double[], double)",
      "begin_line": 1125,
      "end_line": 1129,
      "comment": "",
      "child_ranges": [
        "(line 1127,col 7)-(line 1128,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.Box3DimensionalFunction.getJacobian()",
      "begin_line": 1131,
      "end_line": 1145,
      "comment": "",
      "child_ranges": [
        "(line 1133,col 7)-(line 1133,col 48)",
        "(line 1134,col 7)-(line 1134,col 48)",
        "(line 1135,col 7)-(line 1135,col 44)",
        "(line 1136,col 7)-(line 1143,col 7)",
        "(line 1144,col 7)-(line 1144,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.Box3DimensionalFunction.getResiduals()",
      "begin_line": 1147,
      "end_line": 1159,
      "comment": "",
      "child_ranges": [
        "(line 1149,col 7)-(line 1149,col 46)",
        "(line 1150,col 7)-(line 1150,col 46)",
        "(line 1151,col 7)-(line 1151,col 46)",
        "(line 1152,col 7)-(line 1152,col 33)",
        "(line 1153,col 7)-(line 1157,col 7)",
        "(line 1158,col 7)-(line 1158,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "JennrichSampsonFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1163,
      "end_line": 1197,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.JennrichSampsonFunction.JennrichSampsonFunction(int, double[], double, double, double[])",
      "begin_line": 1165,
      "end_line": 1171,
      "comment": "",
      "child_ranges": [
        "(line 1169,col 7)-(line 1170,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.JennrichSampsonFunction.getJacobian()",
      "begin_line": 1173,
      "end_line": 1183,
      "comment": "",
      "child_ranges": [
        "(line 1175,col 7)-(line 1175,col 48)",
        "(line 1176,col 7)-(line 1176,col 48)",
        "(line 1177,col 7)-(line 1177,col 44)",
        "(line 1178,col 7)-(line 1181,col 7)",
        "(line 1182,col 7)-(line 1182,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.JennrichSampsonFunction.getResiduals()",
      "begin_line": 1185,
      "end_line": 1195,
      "comment": "",
      "child_ranges": [
        "(line 1187,col 7)-(line 1187,col 46)",
        "(line 1188,col 7)-(line 1188,col 46)",
        "(line 1189,col 7)-(line 1189,col 33)",
        "(line 1190,col 7)-(line 1193,col 7)",
        "(line 1194,col 7)-(line 1194,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BrownDennisFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1199,
      "end_line": 1244,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.BrownDennisFunction.BrownDennisFunction(int, double[], double, double, double[])",
      "begin_line": 1201,
      "end_line": 1207,
      "comment": "",
      "child_ranges": [
        "(line 1205,col 7)-(line 1206,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.BrownDennisFunction.getJacobian()",
      "begin_line": 1209,
      "end_line": 1226,
      "comment": "",
      "child_ranges": [
        "(line 1211,col 7)-(line 1211,col 48)",
        "(line 1212,col 7)-(line 1212,col 48)",
        "(line 1213,col 7)-(line 1213,col 48)",
        "(line 1214,col 7)-(line 1214,col 48)",
        "(line 1215,col 7)-(line 1215,col 44)",
        "(line 1216,col 7)-(line 1224,col 7)",
        "(line 1225,col 7)-(line 1225,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.BrownDennisFunction.getResiduals()",
      "begin_line": 1228,
      "end_line": 1242,
      "comment": "",
      "child_ranges": [
        "(line 1230,col 7)-(line 1230,col 46)",
        "(line 1231,col 7)-(line 1231,col 46)",
        "(line 1232,col 7)-(line 1232,col 46)",
        "(line 1233,col 7)-(line 1233,col 46)",
        "(line 1234,col 7)-(line 1234,col 33)",
        "(line 1235,col 7)-(line 1240,col 7)",
        "(line 1241,col 7)-(line 1241,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ChebyquadFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1246,
      "end_line": 1326,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.ChebyquadFunction.buildChebyquadArray(int, double)",
      "begin_line": 1248,
      "end_line": 1255,
      "comment": "",
      "child_ranges": [
        "(line 1249,col 7)-(line 1249,col 37)",
        "(line 1250,col 7)-(line 1250,col 36)",
        "(line 1251,col 7)-(line 1253,col 7)",
        "(line 1254,col 7)-(line 1254,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.ChebyquadFunction.ChebyquadFunction(int, int, double, double, double, double[])",
      "begin_line": 1257,
      "end_line": 1263,
      "comment": "",
      "child_ranges": [
        "(line 1261,col 7)-(line 1262,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.ChebyquadFunction.getJacobian()",
      "begin_line": 1265,
      "end_line": 1293,
      "comment": "",
      "child_ranges": [
        "(line 1268,col 7)-(line 1268,col 44)",
        "(line 1269,col 7)-(line 1271,col 7)",
        "(line 1273,col 7)-(line 1273,col 26)",
        "(line 1274,col 7)-(line 1289,col 7)",
        "(line 1291,col 7)-(line 1291,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.ChebyquadFunction.getResiduals()",
      "begin_line": 1295,
      "end_line": 1324,
      "comment": "",
      "child_ranges": [
        "(line 1298,col 7)-(line 1298,col 33)",
        "(line 1300,col 7)-(line 1310,col 7)",
        "(line 1312,col 7)-(line 1312,col 26)",
        "(line 1313,col 7)-(line 1313,col 26)",
        "(line 1314,col 7)-(line 1320,col 7)",
        "(line 1322,col 7)-(line 1322,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BrownAlmostLinearFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1328,
      "end_line": 1389,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.BrownAlmostLinearFunction.BrownAlmostLinearFunction(int, double, double, double, double[])",
      "begin_line": 1330,
      "end_line": 1336,
      "comment": "",
      "child_ranges": [
        "(line 1334,col 7)-(line 1335,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.BrownAlmostLinearFunction.getJacobian()",
      "begin_line": 1338,
      "end_line": 1371,
      "comment": "",
      "child_ranges": [
        "(line 1340,col 7)-(line 1340,col 44)",
        "(line 1341,col 7)-(line 1343,col 7)",
        "(line 1345,col 7)-(line 1345,col 22)",
        "(line 1346,col 7)-(line 1352,col 7)",
        "(line 1354,col 7)-(line 1367,col 7)",
        "(line 1369,col 7)-(line 1369,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.BrownAlmostLinearFunction.getResiduals()",
      "begin_line": 1373,
      "end_line": 1387,
      "comment": "",
      "child_ranges": [
        "(line 1375,col 7)-(line 1375,col 33)",
        "(line 1376,col 7)-(line 1376,col 29)",
        "(line 1377,col 7)-(line 1377,col 22)",
        "(line 1378,col 7)-(line 1381,col 7)",
        "(line 1382,col 7)-(line 1384,col 7)",
        "(line 1385,col 7)-(line 1385,col 26)",
        "(line 1386,col 7)-(line 1386,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Osborne1Function",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1391,
      "end_line": 1442,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.Osborne1Function.Osborne1Function(double[], double, double, double[])",
      "begin_line": 1393,
      "end_line": 1399,
      "comment": "",
      "child_ranges": [
        "(line 1397,col 7)-(line 1398,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.Osborne1Function.getJacobian()",
      "begin_line": 1401,
      "end_line": 1417,
      "comment": "",
      "child_ranges": [
        "(line 1403,col 7)-(line 1403,col 48)",
        "(line 1404,col 7)-(line 1404,col 48)",
        "(line 1405,col 7)-(line 1405,col 48)",
        "(line 1406,col 7)-(line 1406,col 48)",
        "(line 1407,col 7)-(line 1407,col 44)",
        "(line 1408,col 7)-(line 1415,col 7)",
        "(line 1416,col 7)-(line 1416,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.Osborne1Function.getResiduals()",
      "begin_line": 1419,
      "end_line": 1434,
      "comment": "",
      "child_ranges": [
        "(line 1421,col 7)-(line 1421,col 46)",
        "(line 1422,col 7)-(line 1422,col 46)",
        "(line 1423,col 7)-(line 1423,col 46)",
        "(line 1424,col 7)-(line 1424,col 46)",
        "(line 1425,col 7)-(line 1425,col 46)",
        "(line 1426,col 7)-(line 1426,col 33)",
        "(line 1427,col 7)-(line 1432,col 7)",
        "(line 1433,col 7)-(line 1433,col 15)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 1436,
      "end_line": 1440,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Osborne2Function",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1444,
      "end_line": 1532,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.Osborne2Function.Osborne2Function(double[], double, double, double[])",
      "begin_line": 1446,
      "end_line": 1452,
      "comment": "",
      "child_ranges": [
        "(line 1450,col 7)-(line 1451,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.Osborne2Function.getJacobian()",
      "begin_line": 1454,
      "end_line": 1489,
      "comment": "",
      "child_ranges": [
        "(line 1456,col 7)-(line 1456,col 49)",
        "(line 1457,col 7)-(line 1457,col 49)",
        "(line 1458,col 7)-(line 1458,col 49)",
        "(line 1459,col 7)-(line 1459,col 49)",
        "(line 1460,col 7)-(line 1460,col 49)",
        "(line 1461,col 7)-(line 1461,col 49)",
        "(line 1462,col 7)-(line 1462,col 49)",
        "(line 1463,col 7)-(line 1463,col 49)",
        "(line 1464,col 7)-(line 1464,col 49)",
        "(line 1465,col 7)-(line 1465,col 49)",
        "(line 1466,col 7)-(line 1466,col 50)",
        "(line 1467,col 7)-(line 1467,col 44)",
        "(line 1468,col 7)-(line 1487,col 7)",
        "(line 1488,col 7)-(line 1488,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.Osborne2Function.getResiduals()",
      "begin_line": 1491,
      "end_line": 1514,
      "comment": "",
      "child_ranges": [
        "(line 1493,col 7)-(line 1493,col 47)",
        "(line 1494,col 7)-(line 1494,col 47)",
        "(line 1495,col 7)-(line 1495,col 47)",
        "(line 1496,col 7)-(line 1496,col 47)",
        "(line 1497,col 7)-(line 1497,col 47)",
        "(line 1498,col 7)-(line 1498,col 47)",
        "(line 1499,col 7)-(line 1499,col 47)",
        "(line 1500,col 7)-(line 1500,col 47)",
        "(line 1501,col 7)-(line 1501,col 47)",
        "(line 1502,col 7)-(line 1502,col 47)",
        "(line 1503,col 7)-(line 1503,col 48)",
        "(line 1504,col 7)-(line 1504,col 33)",
        "(line 1505,col 7)-(line 1512,col 7)",
        "(line 1513,col 7)-(line 1513,col 15)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 1516,
      "end_line": 1530,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.suite()",
      "begin_line": 1534,
      "end_line": 1536,
      "comment": "",
      "child_ranges": [
        "(line 1535,col 5)-(line 1535,col 44)"
      ]
    }
  ]
}