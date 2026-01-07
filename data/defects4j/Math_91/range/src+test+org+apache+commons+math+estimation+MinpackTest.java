{
  "filepath": "/tmp/Math-91b/src/test/org/apache/commons/math/estimation/MinpackTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MinpackTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 92,
      "end_line": 1518,
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
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 102,col 5)-(line 103,col 74)",
        "(line 104,col 5)-(line 105,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackLinearRank1()",
      "begin_line": 108,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 110,col 5)-(line 111,col 83)",
        "(line 112,col 5)-(line 113,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackLinearRank1ZeroColsAndRows()",
      "begin_line": 116,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 118,col 5)-(line 118,col 75)",
        "(line 119,col 5)-(line 119,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackRosenbrok()",
      "begin_line": 122,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 124,col 5)-(line 125,col 64)",
        "(line 126,col 5)-(line 127,col 69)",
        "(line 128,col 5)-(line 129,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackHelicalValley()",
      "begin_line": 132,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 134,col 5)-(line 135,col 56)",
        "(line 136,col 5)-(line 137,col 67)",
        "(line 138,col 5)-(line 139,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackPowellSingular()",
      "begin_line": 142,
      "end_line": 150,
      "comment": "",
      "child_ranges": [
        "(line 144,col 5)-(line 145,col 69)",
        "(line 146,col 5)-(line 147,col 68)",
        "(line 148,col 5)-(line 149,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackFreudensteinRoth()",
      "begin_line": 152,
      "end_line": 172,
      "comment": "",
      "child_ranges": [
        "(line 154,col 5)-(line 159,col 56)",
        "(line 160,col 5)-(line 165,col 56)",
        "(line 166,col 5)-(line 171,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackBard()",
      "begin_line": 174,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 176,col 5)-(line 181,col 44)",
        "(line 182,col 5)-(line 187,col 44)",
        "(line 188,col 5)-(line 193,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackKowalikOsborne()",
      "begin_line": 196,
      "end_line": 225,
      "comment": "",
      "child_ranges": [
        "(line 198,col 5)-(line 206,col 54)",
        "(line 207,col 5)-(line 215,col 54)",
        "(line 216,col 5)-(line 224,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackMeyer()",
      "begin_line": 227,
      "end_line": 243,
      "comment": "",
      "child_ranges": [
        "(line 229,col 5)-(line 235,col 45)",
        "(line 236,col 5)-(line 242,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackWatson()",
      "begin_line": 245,
      "end_line": 329,
      "comment": "",
      "child_ranges": [
        "(line 248,col 5)-(line 254,col 46)",
        "(line 255,col 5)-(line 261,col 46)",
        "(line 262,col 5)-(line 268,col 46)",
        "(line 270,col 5)-(line 278,col 46)",
        "(line 279,col 5)-(line 287,col 46)",
        "(line 288,col 5)-(line 296,col 46)",
        "(line 298,col 5)-(line 307,col 46)",
        "(line 308,col 5)-(line 317,col 46)",
        "(line 318,col 5)-(line 327,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackBox3Dimensional()",
      "begin_line": 331,
      "end_line": 335,
      "comment": "",
      "child_ranges": [
        "(line 333,col 5)-(line 334,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackJennrichSampson()",
      "begin_line": 337,
      "end_line": 344,
      "comment": "",
      "child_ranges": [
        "(line 339,col 5)-(line 343,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackBrownDennis()",
      "begin_line": 346,
      "end_line": 369,
      "comment": "",
      "child_ranges": [
        "(line 348,col 5)-(line 354,col 51)",
        "(line 355,col 5)-(line 361,col 50)",
        "(line 362,col 5)-(line 368,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackChebyquad()",
      "begin_line": 371,
      "end_line": 408,
      "comment": "",
      "child_ranges": [
        "(line 373,col 5)-(line 375,col 68)",
        "(line 376,col 5)-(line 378,col 80)",
        "(line 379,col 5)-(line 381,col 80)",
        "(line 382,col 5)-(line 389,col 49)",
        "(line 390,col 5)-(line 398,col 49)",
        "(line 399,col 5)-(line 407,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackBrownAlmostLinear()",
      "begin_line": 410,
      "end_line": 477,
      "comment": "",
      "child_ranges": [
        "(line 412,col 5)-(line 420,col 57)",
        "(line 421,col 5)-(line 429,col 57)",
        "(line 430,col 5)-(line 435,col 57)",
        "(line 436,col 5)-(line 454,col 57)",
        "(line 455,col 5)-(line 476,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackOsborne1()",
      "begin_line": 479,
      "end_line": 488,
      "comment": "",
      "child_ranges": [
        "(line 481,col 7)-(line 487,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackOsborne2()",
      "begin_line": 490,
      "end_line": 506,
      "comment": "",
      "child_ranges": [
        "(line 493,col 5)-(line 505,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.minpackTest(org.apache.commons.math.estimation.MinpackTest.MinpackFunction, boolean)",
      "begin_line": 508,
      "end_line": 523,
      "comment": "",
      "child_ranges": [
        "(line 509,col 5)-(line 509,col 78)",
        "(line 510,col 5)-(line 510,col 58)",
        "(line 511,col 5)-(line 511,col 69)",
        "(line 512,col 5)-(line 512,col 68)",
        "(line 513,col 5)-(line 513,col 51)",
        "(line 514,col 5)-(line 514,col 79)",
        "(line 515,col 5)-(line 520,col 5)",
        "(line 521,col 5)-(line 521,col 77)",
        "(line 522,col 5)-(line 522,col 53)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MinpackFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.EstimationProblem"
      ],
      "begin_line": 525,
      "end_line": 648,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.MinpackFunction(int, double[], double, double, double[])",
      "begin_line": 527,
      "end_line": 543,
      "comment": "",
      "child_ranges": [
        "(line 532,col 7)-(line 532,col 17)",
        "(line 533,col 7)-(line 533,col 34)",
        "(line 534,col 7)-(line 534,col 45)",
        "(line 535,col 7)-(line 537,col 7)",
        "(line 538,col 7)-(line 538,col 55)",
        "(line 539,col 7)-(line 539,col 53)",
        "(line 540,col 7)-(line 540,col 55)",
        "(line 541,col 7)-(line 541,col 41)",
        "(line 542,col 7)-(line 542,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.buildArray(int, double)",
      "begin_line": 545,
      "end_line": 549,
      "comment": "",
      "child_ranges": [
        "(line 546,col 7)-(line 546,col 37)",
        "(line 547,col 7)-(line 547,col 28)",
        "(line 548,col 7)-(line 548,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.setCostAccuracy(double)",
      "begin_line": 551,
      "end_line": 553,
      "comment": "",
      "child_ranges": [
        "(line 552,col 7)-(line 552,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.setParamsAccuracy(double)",
      "begin_line": 555,
      "end_line": 557,
      "comment": "",
      "child_ranges": [
        "(line 556,col 7)-(line 556,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.getN()",
      "begin_line": 559,
      "end_line": 561,
      "comment": "",
      "child_ranges": [
        "(line 560,col 7)-(line 560,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.checkTheoreticalStartCost(double)",
      "begin_line": 563,
      "end_line": 566,
      "comment": "",
      "child_ranges": [
        "(line 564,col 7)-(line 564,col 69)",
        "(line 565,col 7)-(line 565,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.checkTheoreticalMinCost(double)",
      "begin_line": 568,
      "end_line": 571,
      "comment": "",
      "child_ranges": [
        "(line 569,col 7)-(line 569,col 67)",
        "(line 570,col 6)-(line 570,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.checkTheoreticalMinParams()",
      "begin_line": 573,
      "end_line": 584,
      "comment": "",
      "child_ranges": [
        "(line 574,col 7)-(line 582,col 7)",
        "(line 583,col 7)-(line 583,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.getMeasurements()",
      "begin_line": 586,
      "end_line": 592,
      "comment": "",
      "child_ranges": [
        "(line 587,col 7)-(line 587,col 70)",
        "(line 588,col 7)-(line 590,col 7)",
        "(line 591,col 7)-(line 591,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.getUnboundParameters()",
      "begin_line": 594,
      "end_line": 596,
      "comment": "",
      "child_ranges": [
        "(line 595,col 7)-(line 595,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.getAllParameters()",
      "begin_line": 598,
      "end_line": 600,
      "comment": "",
      "child_ranges": [
        "(line 599,col 7)-(line 599,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.getJacobian()",
      "begin_line": 602,
      "end_line": 602,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.getResiduals()",
      "begin_line": 604,
      "end_line": 604,
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
      "begin_line": 606,
      "end_line": 637,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.MinpackMeasurement.MinpackMeasurement(int)",
      "begin_line": 608,
      "end_line": 611,
      "comment": "",
      "child_ranges": [
        "(line 609,col 9)-(line 609,col 24)",
        "(line 610,col 9)-(line 610,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.MinpackMeasurement.getTheoreticalValue()",
      "begin_line": 613,
      "end_line": 619,
      "comment": "",
      "child_ranges": [
        "(line 618,col 9)-(line 618,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.MinpackMeasurement.getPartial(org.apache.commons.math.estimation.EstimatedParameter)",
      "begin_line": 621,
      "end_line": 632,
      "comment": "",
      "child_ranges": [
        "(line 626,col 9)-(line 630,col 9)",
        "(line 631,col 9)-(line 631,col 17)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "index"
      ],
      "begin_line": 634,
      "end_line": 634,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 635,
      "end_line": 635,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 639,
      "end_line": 639,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "m"
      ],
      "begin_line": 640,
      "end_line": 640,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parameters"
      ],
      "begin_line": 641,
      "end_line": 641,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "theoreticalStartCost"
      ],
      "begin_line": 642,
      "end_line": 642,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "theoreticalMinCost"
      ],
      "begin_line": 643,
      "end_line": 643,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "theoreticalMinParams"
      ],
      "begin_line": 644,
      "end_line": 644,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "costAccuracy"
      ],
      "begin_line": 645,
      "end_line": 645,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "paramsAccuracy"
      ],
      "begin_line": 646,
      "end_line": 646,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "LinearFullRankFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 650,
      "end_line": 685,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.LinearFullRankFunction.LinearFullRankFunction(int, int, double, double, double)",
      "begin_line": 652,
      "end_line": 657,
      "comment": "",
      "child_ranges": [
        "(line 655,col 7)-(line 656,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.LinearFullRankFunction.getJacobian()",
      "begin_line": 659,
      "end_line": 669,
      "comment": "",
      "child_ranges": [
        "(line 660,col 7)-(line 660,col 25)",
        "(line 661,col 7)-(line 661,col 44)",
        "(line 662,col 7)-(line 667,col 7)",
        "(line 668,col 7)-(line 668,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.LinearFullRankFunction.getResiduals()",
      "begin_line": 671,
      "end_line": 683,
      "comment": "",
      "child_ranges": [
        "(line 672,col 7)-(line 672,col 21)",
        "(line 673,col 7)-(line 675,col 7)",
        "(line 676,col 7)-(line 676,col 34)",
        "(line 677,col 7)-(line 677,col 33)",
        "(line 678,col 7)-(line 680,col 7)",
        "(line 681,col 7)-(line 681,col 31)",
        "(line 682,col 7)-(line 682,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LinearRank1Function",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 687,
      "end_line": 718,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.LinearRank1Function.LinearRank1Function(int, int, double, double, double)",
      "begin_line": 689,
      "end_line": 693,
      "comment": "",
      "child_ranges": [
        "(line 692,col 7)-(line 692,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.LinearRank1Function.getJacobian()",
      "begin_line": 695,
      "end_line": 704,
      "comment": "",
      "child_ranges": [
        "(line 696,col 7)-(line 696,col 44)",
        "(line 697,col 7)-(line 702,col 7)",
        "(line 703,col 7)-(line 703,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.LinearRank1Function.getResiduals()",
      "begin_line": 706,
      "end_line": 716,
      "comment": "",
      "child_ranges": [
        "(line 707,col 7)-(line 707,col 33)",
        "(line 708,col 7)-(line 708,col 21)",
        "(line 709,col 7)-(line 711,col 7)",
        "(line 712,col 7)-(line 714,col 7)",
        "(line 715,col 7)-(line 715,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LinearRank1ZeroColsAndRowsFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 720,
      "end_line": 761,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.LinearRank1ZeroColsAndRowsFunction.LinearRank1ZeroColsAndRowsFunction(int, int, double)",
      "begin_line": 722,
      "end_line": 727,
      "comment": "",
      "child_ranges": [
        "(line 723,col 7)-(line 726,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.LinearRank1ZeroColsAndRowsFunction.getJacobian()",
      "begin_line": 729,
      "end_line": 746,
      "comment": "",
      "child_ranges": [
        "(line 730,col 7)-(line 730,col 44)",
        "(line 731,col 7)-(line 744,col 7)",
        "(line 745,col 7)-(line 745,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.LinearRank1ZeroColsAndRowsFunction.getResiduals()",
      "begin_line": 748,
      "end_line": 759,
      "comment": "",
      "child_ranges": [
        "(line 749,col 7)-(line 749,col 33)",
        "(line 750,col 7)-(line 750,col 21)",
        "(line 751,col 7)-(line 753,col 7)",
        "(line 754,col 7)-(line 756,col 7)",
        "(line 757,col 7)-(line 757,col 20)",
        "(line 758,col 7)-(line 758,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RosenbrockFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 763,
      "end_line": 780,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.RosenbrockFunction.RosenbrockFunction(double[], double)",
      "begin_line": 765,
      "end_line": 767,
      "comment": "",
      "child_ranges": [
        "(line 766,col 7)-(line 766,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.RosenbrockFunction.getJacobian()",
      "begin_line": 769,
      "end_line": 772,
      "comment": "",
      "child_ranges": [
        "(line 770,col 7)-(line 770,col 46)",
        "(line 771,col 7)-(line 771,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.RosenbrockFunction.getResiduals()",
      "begin_line": 774,
      "end_line": 778,
      "comment": "",
      "child_ranges": [
        "(line 775,col 7)-(line 775,col 46)",
        "(line 776,col 7)-(line 776,col 46)",
        "(line 777,col 7)-(line 777,col 58)"
      ]
    },
    {
      "type": "class_interface",
      "name": "HelicalValleyFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 782,
      "end_line": 826,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.HelicalValleyFunction.HelicalValleyFunction(double[], double)",
      "begin_line": 784,
      "end_line": 788,
      "comment": "",
      "child_ranges": [
        "(line 786,col 7)-(line 787,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.HelicalValleyFunction.getJacobian()",
      "begin_line": 790,
      "end_line": 801,
      "comment": "",
      "child_ranges": [
        "(line 791,col 7)-(line 791,col 46)",
        "(line 792,col 7)-(line 792,col 46)",
        "(line 793,col 7)-(line 793,col 43)",
        "(line 794,col 7)-(line 794,col 38)",
        "(line 795,col 7)-(line 795,col 41)",
        "(line 796,col 7)-(line 800,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.HelicalValleyFunction.getResiduals()",
      "begin_line": 803,
      "end_line": 822,
      "comment": "",
      "child_ranges": [
        "(line 804,col 7)-(line 804,col 46)",
        "(line 805,col 7)-(line 805,col 46)",
        "(line 806,col 7)-(line 806,col 46)",
        "(line 807,col 7)-(line 807,col 18)",
        "(line 808,col 7)-(line 815,col 7)",
        "(line 816,col 7)-(line 816,col 49)",
        "(line 817,col 7)-(line 821,col 8)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "twoPi"
      ],
      "begin_line": 824,
      "end_line": 824,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "PowellSingularFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 828,
      "end_line": 864,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.PowellSingularFunction.PowellSingularFunction(double[], double)",
      "begin_line": 830,
      "end_line": 833,
      "comment": "",
      "child_ranges": [
        "(line 832,col 7)-(line 832,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.PowellSingularFunction.getJacobian()",
      "begin_line": 835,
      "end_line": 846,
      "comment": "",
      "child_ranges": [
        "(line 836,col 7)-(line 836,col 46)",
        "(line 837,col 7)-(line 837,col 46)",
        "(line 838,col 7)-(line 838,col 46)",
        "(line 839,col 7)-(line 839,col 46)",
        "(line 840,col 7)-(line 845,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.PowellSingularFunction.getResiduals()",
      "begin_line": 848,
      "end_line": 859,
      "comment": "",
      "child_ranges": [
        "(line 849,col 7)-(line 849,col 46)",
        "(line 850,col 7)-(line 850,col 46)",
        "(line 851,col 7)-(line 851,col 46)",
        "(line 852,col 7)-(line 852,col 46)",
        "(line 853,col 7)-(line 858,col 8)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "sqrt5"
      ],
      "begin_line": 861,
      "end_line": 861,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sqrt10"
      ],
      "begin_line": 862,
      "end_line": 862,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "FreudensteinRothFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 866,
      "end_line": 893,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.FreudensteinRothFunction.FreudensteinRothFunction(double[], double, double, double[])",
      "begin_line": 868,
      "end_line": 874,
      "comment": "",
      "child_ranges": [
        "(line 872,col 7)-(line 873,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.FreudensteinRothFunction.getJacobian()",
      "begin_line": 876,
      "end_line": 882,
      "comment": "",
      "child_ranges": [
        "(line 877,col 7)-(line 877,col 46)",
        "(line 878,col 7)-(line 881,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.FreudensteinRothFunction.getResiduals()",
      "begin_line": 884,
      "end_line": 891,
      "comment": "",
      "child_ranges": [
        "(line 885,col 7)-(line 885,col 46)",
        "(line 886,col 7)-(line 886,col 46)",
        "(line 887,col 7)-(line 890,col 8)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BardFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 895,
      "end_line": 940,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.BardFunction.BardFunction(double, double, double, double[])",
      "begin_line": 897,
      "end_line": 903,
      "comment": "",
      "child_ranges": [
        "(line 901,col 7)-(line 902,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.BardFunction.getJacobian()",
      "begin_line": 905,
      "end_line": 918,
      "comment": "",
      "child_ranges": [
        "(line 906,col 7)-(line 906,col 48)",
        "(line 907,col 7)-(line 907,col 48)",
        "(line 908,col 7)-(line 908,col 44)",
        "(line 909,col 7)-(line 916,col 7)",
        "(line 917,col 7)-(line 917,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.BardFunction.getResiduals()",
      "begin_line": 920,
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
      "end_line": 994,
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
      "end_line": 971,
      "comment": "",
      "child_ranges": [
        "(line 957,col 7)-(line 957,col 48)",
        "(line 958,col 7)-(line 958,col 48)",
        "(line 959,col 7)-(line 959,col 48)",
        "(line 960,col 7)-(line 960,col 48)",
        "(line 961,col 7)-(line 961,col 44)",
        "(line 962,col 7)-(line 969,col 7)",
        "(line 970,col 7)-(line 970,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.KowalikOsborneFunction.getResiduals()",
      "begin_line": 973,
      "end_line": 983,
      "comment": "",
      "child_ranges": [
        "(line 974,col 7)-(line 974,col 46)",
        "(line 975,col 7)-(line 975,col 46)",
        "(line 976,col 7)-(line 976,col 46)",
        "(line 977,col 7)-(line 977,col 46)",
        "(line 978,col 7)-(line 978,col 33)",
        "(line 979,col 7)-(line 981,col 7)",
        "(line 982,col 7)-(line 982,col 15)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "v"
      ],
      "begin_line": 985,
      "end_line": 987,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 989,
      "end_line": 992,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "MeyerFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 996,
      "end_line": 1043,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MeyerFunction.MeyerFunction(double[], double, double, double[])",
      "begin_line": 998,
      "end_line": 1008,
      "comment": "",
      "child_ranges": [
        "(line 1002,col 7)-(line 1003,col 54)",
        "(line 1004,col 7)-(line 1007,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MeyerFunction.getJacobian()",
      "begin_line": 1010,
      "end_line": 1023,
      "comment": "",
      "child_ranges": [
        "(line 1011,col 7)-(line 1011,col 48)",
        "(line 1012,col 7)-(line 1012,col 48)",
        "(line 1013,col 7)-(line 1013,col 48)",
        "(line 1014,col 7)-(line 1014,col 44)",
        "(line 1015,col 7)-(line 1021,col 7)",
        "(line 1022,col 7)-(line 1022,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MeyerFunction.getResiduals()",
      "begin_line": 1025,
      "end_line": 1034,
      "comment": "",
      "child_ranges": [
        "(line 1026,col 7)-(line 1026,col 46)",
        "(line 1027,col 7)-(line 1027,col 46)",
        "(line 1028,col 7)-(line 1028,col 46)",
        "(line 1029,col 7)-(line 1029,col 33)",
        "(line 1030,col 7)-(line 1032,col 7)",
        "(line 1033,col 6)-(line 1033,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 1036,
      "end_line": 1041,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "WatsonFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1045,
      "end_line": 1115,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.WatsonFunction.WatsonFunction(int, double, double, double, double[])",
      "begin_line": 1047,
      "end_line": 1053,
      "comment": "",
      "child_ranges": [
        "(line 1051,col 7)-(line 1052,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.WatsonFunction.getJacobian()",
      "begin_line": 1055,
      "end_line": 1085,
      "comment": "",
      "child_ranges": [
        "(line 1057,col 7)-(line 1057,col 44)",
        "(line 1059,col 7)-(line 1074,col 7)",
        "(line 1076,col 7)-(line 1076,col 41)",
        "(line 1077,col 7)-(line 1077,col 29)",
        "(line 1079,col 7)-(line 1079,col 40)",
        "(line 1080,col 7)-(line 1080,col 59)",
        "(line 1081,col 7)-(line 1081,col 28)",
        "(line 1083,col 7)-(line 1083,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.WatsonFunction.getResiduals()",
      "begin_line": 1087,
      "end_line": 1113,
      "comment": "",
      "child_ranges": [
        "(line 1088,col 6)-(line 1088,col 32)",
        "(line 1089,col 6)-(line 1104,col 6)",
        "(line 1106,col 6)-(line 1106,col 45)",
        "(line 1107,col 6)-(line 1107,col 45)",
        "(line 1108,col 6)-(line 1108,col 19)",
        "(line 1109,col 6)-(line 1109,col 33)",
        "(line 1111,col 6)-(line 1111,col 14)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Box3DimensionalFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1117,
      "end_line": 1153,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.Box3DimensionalFunction.Box3DimensionalFunction(int, double[], double)",
      "begin_line": 1119,
      "end_line": 1123,
      "comment": "",
      "child_ranges": [
        "(line 1121,col 7)-(line 1122,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.Box3DimensionalFunction.getJacobian()",
      "begin_line": 1125,
      "end_line": 1138,
      "comment": "",
      "child_ranges": [
        "(line 1126,col 7)-(line 1126,col 48)",
        "(line 1127,col 7)-(line 1127,col 48)",
        "(line 1128,col 7)-(line 1128,col 44)",
        "(line 1129,col 7)-(line 1136,col 7)",
        "(line 1137,col 7)-(line 1137,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.Box3DimensionalFunction.getResiduals()",
      "begin_line": 1140,
      "end_line": 1151,
      "comment": "",
      "child_ranges": [
        "(line 1141,col 7)-(line 1141,col 46)",
        "(line 1142,col 7)-(line 1142,col 46)",
        "(line 1143,col 7)-(line 1143,col 46)",
        "(line 1144,col 7)-(line 1144,col 33)",
        "(line 1145,col 7)-(line 1149,col 7)",
        "(line 1150,col 7)-(line 1150,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "JennrichSampsonFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1155,
      "end_line": 1187,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.JennrichSampsonFunction.JennrichSampsonFunction(int, double[], double, double, double[])",
      "begin_line": 1157,
      "end_line": 1163,
      "comment": "",
      "child_ranges": [
        "(line 1161,col 7)-(line 1162,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.JennrichSampsonFunction.getJacobian()",
      "begin_line": 1165,
      "end_line": 1174,
      "comment": "",
      "child_ranges": [
        "(line 1166,col 7)-(line 1166,col 48)",
        "(line 1167,col 7)-(line 1167,col 48)",
        "(line 1168,col 7)-(line 1168,col 44)",
        "(line 1169,col 7)-(line 1172,col 7)",
        "(line 1173,col 7)-(line 1173,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.JennrichSampsonFunction.getResiduals()",
      "begin_line": 1176,
      "end_line": 1185,
      "comment": "",
      "child_ranges": [
        "(line 1177,col 7)-(line 1177,col 46)",
        "(line 1178,col 7)-(line 1178,col 46)",
        "(line 1179,col 7)-(line 1179,col 33)",
        "(line 1180,col 7)-(line 1183,col 7)",
        "(line 1184,col 7)-(line 1184,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BrownDennisFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1189,
      "end_line": 1232,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.BrownDennisFunction.BrownDennisFunction(int, double[], double, double, double[])",
      "begin_line": 1191,
      "end_line": 1197,
      "comment": "",
      "child_ranges": [
        "(line 1195,col 7)-(line 1196,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.BrownDennisFunction.getJacobian()",
      "begin_line": 1199,
      "end_line": 1215,
      "comment": "",
      "child_ranges": [
        "(line 1200,col 7)-(line 1200,col 48)",
        "(line 1201,col 7)-(line 1201,col 48)",
        "(line 1202,col 7)-(line 1202,col 48)",
        "(line 1203,col 7)-(line 1203,col 48)",
        "(line 1204,col 7)-(line 1204,col 44)",
        "(line 1205,col 7)-(line 1213,col 7)",
        "(line 1214,col 7)-(line 1214,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.BrownDennisFunction.getResiduals()",
      "begin_line": 1217,
      "end_line": 1230,
      "comment": "",
      "child_ranges": [
        "(line 1218,col 7)-(line 1218,col 46)",
        "(line 1219,col 7)-(line 1219,col 46)",
        "(line 1220,col 7)-(line 1220,col 46)",
        "(line 1221,col 7)-(line 1221,col 46)",
        "(line 1222,col 7)-(line 1222,col 33)",
        "(line 1223,col 7)-(line 1228,col 7)",
        "(line 1229,col 7)-(line 1229,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ChebyquadFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1234,
      "end_line": 1312,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.ChebyquadFunction.buildChebyquadArray(int, double)",
      "begin_line": 1236,
      "end_line": 1243,
      "comment": "",
      "child_ranges": [
        "(line 1237,col 7)-(line 1237,col 37)",
        "(line 1238,col 7)-(line 1238,col 36)",
        "(line 1239,col 7)-(line 1241,col 7)",
        "(line 1242,col 7)-(line 1242,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.ChebyquadFunction.ChebyquadFunction(int, int, double, double, double, double[])",
      "begin_line": 1245,
      "end_line": 1251,
      "comment": "",
      "child_ranges": [
        "(line 1249,col 7)-(line 1250,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.ChebyquadFunction.getJacobian()",
      "begin_line": 1253,
      "end_line": 1280,
      "comment": "",
      "child_ranges": [
        "(line 1255,col 7)-(line 1255,col 44)",
        "(line 1256,col 7)-(line 1258,col 7)",
        "(line 1260,col 7)-(line 1260,col 26)",
        "(line 1261,col 7)-(line 1276,col 7)",
        "(line 1278,col 7)-(line 1278,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.ChebyquadFunction.getResiduals()",
      "begin_line": 1282,
      "end_line": 1310,
      "comment": "",
      "child_ranges": [
        "(line 1284,col 7)-(line 1284,col 33)",
        "(line 1286,col 7)-(line 1296,col 7)",
        "(line 1298,col 7)-(line 1298,col 26)",
        "(line 1299,col 7)-(line 1299,col 26)",
        "(line 1300,col 7)-(line 1306,col 7)",
        "(line 1308,col 7)-(line 1308,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BrownAlmostLinearFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1314,
      "end_line": 1373,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.BrownAlmostLinearFunction.BrownAlmostLinearFunction(int, double, double, double, double[])",
      "begin_line": 1316,
      "end_line": 1322,
      "comment": "",
      "child_ranges": [
        "(line 1320,col 7)-(line 1321,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.BrownAlmostLinearFunction.getJacobian()",
      "begin_line": 1324,
      "end_line": 1356,
      "comment": "",
      "child_ranges": [
        "(line 1325,col 7)-(line 1325,col 44)",
        "(line 1326,col 7)-(line 1328,col 7)",
        "(line 1330,col 7)-(line 1330,col 22)",
        "(line 1331,col 7)-(line 1337,col 7)",
        "(line 1339,col 7)-(line 1352,col 7)",
        "(line 1354,col 7)-(line 1354,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.BrownAlmostLinearFunction.getResiduals()",
      "begin_line": 1358,
      "end_line": 1371,
      "comment": "",
      "child_ranges": [
        "(line 1359,col 7)-(line 1359,col 33)",
        "(line 1360,col 7)-(line 1360,col 29)",
        "(line 1361,col 7)-(line 1361,col 22)",
        "(line 1362,col 7)-(line 1365,col 7)",
        "(line 1366,col 7)-(line 1368,col 7)",
        "(line 1369,col 7)-(line 1369,col 26)",
        "(line 1370,col 7)-(line 1370,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Osborne1Function",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1375,
      "end_line": 1424,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.Osborne1Function.Osborne1Function(double[], double, double, double[])",
      "begin_line": 1377,
      "end_line": 1383,
      "comment": "",
      "child_ranges": [
        "(line 1381,col 7)-(line 1382,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.Osborne1Function.getJacobian()",
      "begin_line": 1385,
      "end_line": 1400,
      "comment": "",
      "child_ranges": [
        "(line 1386,col 7)-(line 1386,col 48)",
        "(line 1387,col 7)-(line 1387,col 48)",
        "(line 1388,col 7)-(line 1388,col 48)",
        "(line 1389,col 7)-(line 1389,col 48)",
        "(line 1390,col 7)-(line 1390,col 44)",
        "(line 1391,col 7)-(line 1398,col 7)",
        "(line 1399,col 7)-(line 1399,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.Osborne1Function.getResiduals()",
      "begin_line": 1402,
      "end_line": 1416,
      "comment": "",
      "child_ranges": [
        "(line 1403,col 7)-(line 1403,col 46)",
        "(line 1404,col 7)-(line 1404,col 46)",
        "(line 1405,col 7)-(line 1405,col 46)",
        "(line 1406,col 7)-(line 1406,col 46)",
        "(line 1407,col 7)-(line 1407,col 46)",
        "(line 1408,col 7)-(line 1408,col 33)",
        "(line 1409,col 7)-(line 1414,col 7)",
        "(line 1415,col 7)-(line 1415,col 15)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 1418,
      "end_line": 1422,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Osborne2Function",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1426,
      "end_line": 1512,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.Osborne2Function.Osborne2Function(double[], double, double, double[])",
      "begin_line": 1428,
      "end_line": 1434,
      "comment": "",
      "child_ranges": [
        "(line 1432,col 7)-(line 1433,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.Osborne2Function.getJacobian()",
      "begin_line": 1436,
      "end_line": 1470,
      "comment": "",
      "child_ranges": [
        "(line 1437,col 7)-(line 1437,col 49)",
        "(line 1438,col 7)-(line 1438,col 49)",
        "(line 1439,col 7)-(line 1439,col 49)",
        "(line 1440,col 7)-(line 1440,col 49)",
        "(line 1441,col 7)-(line 1441,col 49)",
        "(line 1442,col 7)-(line 1442,col 49)",
        "(line 1443,col 7)-(line 1443,col 49)",
        "(line 1444,col 7)-(line 1444,col 49)",
        "(line 1445,col 7)-(line 1445,col 49)",
        "(line 1446,col 7)-(line 1446,col 49)",
        "(line 1447,col 7)-(line 1447,col 50)",
        "(line 1448,col 7)-(line 1448,col 44)",
        "(line 1449,col 7)-(line 1468,col 7)",
        "(line 1469,col 7)-(line 1469,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.Osborne2Function.getResiduals()",
      "begin_line": 1472,
      "end_line": 1494,
      "comment": "",
      "child_ranges": [
        "(line 1473,col 7)-(line 1473,col 47)",
        "(line 1474,col 7)-(line 1474,col 47)",
        "(line 1475,col 7)-(line 1475,col 47)",
        "(line 1476,col 7)-(line 1476,col 47)",
        "(line 1477,col 7)-(line 1477,col 47)",
        "(line 1478,col 7)-(line 1478,col 47)",
        "(line 1479,col 7)-(line 1479,col 47)",
        "(line 1480,col 7)-(line 1480,col 47)",
        "(line 1481,col 7)-(line 1481,col 47)",
        "(line 1482,col 7)-(line 1482,col 47)",
        "(line 1483,col 7)-(line 1483,col 48)",
        "(line 1484,col 7)-(line 1484,col 33)",
        "(line 1485,col 7)-(line 1492,col 7)",
        "(line 1493,col 7)-(line 1493,col 15)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 1496,
      "end_line": 1510,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.suite()",
      "begin_line": 1514,
      "end_line": 1516,
      "comment": "",
      "child_ranges": [
        "(line 1515,col 5)-(line 1515,col 44)"
      ]
    }
  ]
}