{
  "filepath": "/tmp/Math-104b/src/test/org/apache/commons/math/estimation/MinpackTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MinpackTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 92,
      "end_line": 1517,
      "comment": "\n * \u003cp\u003eSome of the unit tests are re-implementations of the MINPACK \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file17\"\u003efile17\u003c/a\u003e and \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file22\"\u003efile22\u003c/a\u003e test files. \n * The redistribution policy for MINPACK is available \u003ca\n * href\u003d\"http://www.netlib.org/minpack/disclaimer\"\u003ehere\u003c/a\u003e, for\n * convenience, it is reproduced below.\u003c/p\u003e\n\n * \u003ctable border\u003d\"0\" width\u003d\"80%\" cellpadding\u003d\"10\" align\u003d\"center\" bgcolor\u003d\"#E0E0E0\"\u003e\n * \u003ctr\u003e\u003ctd\u003e\n *    Minpack Copyright Notice (1999) University of Chicago.\n *    All rights reserved\n * \u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003e\n * Redistribution and use in source and binary forms, with or without\n * modification, are permitted provided that the following conditions\n * are met:\n * \u003col\u003e\n *  \u003cli\u003eRedistributions of source code must retain the above copyright\n *      notice, this list of conditions and the following disclaimer.\u003c/li\u003e\n * \u003cli\u003eRedistributions in binary form must reproduce the above\n *     copyright notice, this list of conditions and the following\n *     disclaimer in the documentation and/or other materials provided\n *     with the distribution.\u003c/li\u003e\n * \u003cli\u003eThe end-user documentation included with the redistribution, if any,\n *     must include the following acknowledgment:\n *     \u003ccode\u003eThis product includes software developed by the University of\n *           Chicago, as Operator of Argonne National Laboratory.\u003c/code\u003e\n *     Alternately, this acknowledgment may appear in the software itself,\n *     if and wherever such third-party acknowledgments normally appear.\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eWARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED \"AS IS\"\n *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE\n *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND\n *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR\n *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES\n *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE\n *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY\n *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR\n *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF\n *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)\n *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION\n *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL\n *     BE CORRECTED.\u003c/strong\u003e\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eLIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT\n *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF\n *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,\n *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF\n *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF\n *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER\n *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT\n *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,\n *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE\n *     POSSIBILITY OF SUCH LOSS OR DAMAGES.\u003c/strong\u003e\u003c/li\u003e\n * \u003col\u003e\u003c/td\u003e\u003c/tr\u003e\n * \u003c/table\u003e\n\n * @author Argonne National Laboratory. MINPACK project. March 1980 (original fortran minpack tests)\n * @author Burton S. Garbow (original fortran minpack tests)\n * @author Kenneth E. Hillstrom (original fortran minpack tests)\n * @author Jorge J. More (original fortran minpack tests)\n * @author Luc Maisonobe (non-minpack tests and minpack tests Java translation)\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackTest(java.lang.String)",
      "begin_line": 95,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 96,col 5)-(line 96,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackLinearFullRank()",
      "begin_line": 99,
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
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 109,col 5)-(line 110,col 83)",
        "(line 111,col 5)-(line 112,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackLinearRank1ZeroColsAndRows()",
      "begin_line": 115,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 117,col 5)-(line 117,col 75)",
        "(line 118,col 5)-(line 118,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackRosenbrok()",
      "begin_line": 121,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 123,col 5)-(line 124,col 64)",
        "(line 125,col 5)-(line 126,col 69)",
        "(line 127,col 5)-(line 128,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackHelicalValley()",
      "begin_line": 131,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 133,col 5)-(line 134,col 56)",
        "(line 135,col 5)-(line 136,col 67)",
        "(line 137,col 5)-(line 138,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackPowellSingular()",
      "begin_line": 141,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 143,col 5)-(line 144,col 69)",
        "(line 145,col 5)-(line 146,col 68)",
        "(line 147,col 5)-(line 148,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackFreudensteinRoth()",
      "begin_line": 151,
      "end_line": 171,
      "comment": "",
      "child_ranges": [
        "(line 153,col 5)-(line 158,col 56)",
        "(line 159,col 5)-(line 164,col 56)",
        "(line 165,col 5)-(line 170,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackBard()",
      "begin_line": 173,
      "end_line": 193,
      "comment": "",
      "child_ranges": [
        "(line 175,col 5)-(line 180,col 44)",
        "(line 181,col 5)-(line 186,col 44)",
        "(line 187,col 5)-(line 192,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackKowalikOsborne()",
      "begin_line": 195,
      "end_line": 224,
      "comment": "",
      "child_ranges": [
        "(line 197,col 5)-(line 205,col 54)",
        "(line 206,col 5)-(line 214,col 54)",
        "(line 215,col 5)-(line 223,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackMeyer()",
      "begin_line": 226,
      "end_line": 242,
      "comment": "",
      "child_ranges": [
        "(line 228,col 5)-(line 234,col 45)",
        "(line 235,col 5)-(line 241,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackWatson()",
      "begin_line": 244,
      "end_line": 328,
      "comment": "",
      "child_ranges": [
        "(line 247,col 5)-(line 253,col 46)",
        "(line 254,col 5)-(line 260,col 46)",
        "(line 261,col 5)-(line 267,col 46)",
        "(line 269,col 5)-(line 277,col 46)",
        "(line 278,col 5)-(line 286,col 46)",
        "(line 287,col 5)-(line 295,col 46)",
        "(line 297,col 5)-(line 306,col 46)",
        "(line 307,col 5)-(line 316,col 46)",
        "(line 317,col 5)-(line 326,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackBox3Dimensional()",
      "begin_line": 330,
      "end_line": 334,
      "comment": "",
      "child_ranges": [
        "(line 332,col 5)-(line 333,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackJennrichSampson()",
      "begin_line": 336,
      "end_line": 343,
      "comment": "",
      "child_ranges": [
        "(line 338,col 5)-(line 342,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackBrownDennis()",
      "begin_line": 345,
      "end_line": 368,
      "comment": "",
      "child_ranges": [
        "(line 347,col 5)-(line 353,col 51)",
        "(line 354,col 5)-(line 360,col 50)",
        "(line 361,col 5)-(line 367,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackChebyquad()",
      "begin_line": 370,
      "end_line": 407,
      "comment": "",
      "child_ranges": [
        "(line 372,col 5)-(line 374,col 68)",
        "(line 375,col 5)-(line 377,col 80)",
        "(line 378,col 5)-(line 380,col 80)",
        "(line 381,col 5)-(line 388,col 49)",
        "(line 389,col 5)-(line 397,col 49)",
        "(line 398,col 5)-(line 406,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackBrownAlmostLinear()",
      "begin_line": 409,
      "end_line": 476,
      "comment": "",
      "child_ranges": [
        "(line 411,col 5)-(line 419,col 57)",
        "(line 420,col 5)-(line 428,col 57)",
        "(line 429,col 5)-(line 434,col 57)",
        "(line 435,col 5)-(line 453,col 57)",
        "(line 454,col 5)-(line 475,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackOsborne1()",
      "begin_line": 478,
      "end_line": 487,
      "comment": "",
      "child_ranges": [
        "(line 480,col 7)-(line 486,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackOsborne2()",
      "begin_line": 489,
      "end_line": 505,
      "comment": "",
      "child_ranges": [
        "(line 492,col 5)-(line 504,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.minpackTest(org.apache.commons.math.estimation.MinpackTest.MinpackFunction, boolean)",
      "begin_line": 507,
      "end_line": 522,
      "comment": "",
      "child_ranges": [
        "(line 508,col 5)-(line 508,col 78)",
        "(line 509,col 5)-(line 509,col 58)",
        "(line 510,col 5)-(line 510,col 69)",
        "(line 511,col 5)-(line 511,col 68)",
        "(line 512,col 5)-(line 512,col 51)",
        "(line 513,col 5)-(line 513,col 79)",
        "(line 514,col 5)-(line 519,col 5)",
        "(line 520,col 5)-(line 520,col 77)",
        "(line 521,col 5)-(line 521,col 53)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MinpackFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.EstimationProblem"
      ],
      "begin_line": 524,
      "end_line": 647,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.MinpackFunction(int, double[], double, double, double[])",
      "begin_line": 526,
      "end_line": 542,
      "comment": "",
      "child_ranges": [
        "(line 531,col 7)-(line 531,col 17)",
        "(line 532,col 7)-(line 532,col 34)",
        "(line 533,col 7)-(line 533,col 45)",
        "(line 534,col 7)-(line 536,col 7)",
        "(line 537,col 7)-(line 537,col 55)",
        "(line 538,col 7)-(line 538,col 53)",
        "(line 539,col 7)-(line 539,col 55)",
        "(line 540,col 7)-(line 540,col 41)",
        "(line 541,col 7)-(line 541,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.buildArray(int, double)",
      "begin_line": 544,
      "end_line": 548,
      "comment": "",
      "child_ranges": [
        "(line 545,col 7)-(line 545,col 37)",
        "(line 546,col 7)-(line 546,col 28)",
        "(line 547,col 7)-(line 547,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.setCostAccuracy(double)",
      "begin_line": 550,
      "end_line": 552,
      "comment": "",
      "child_ranges": [
        "(line 551,col 7)-(line 551,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.setParamsAccuracy(double)",
      "begin_line": 554,
      "end_line": 556,
      "comment": "",
      "child_ranges": [
        "(line 555,col 7)-(line 555,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.getN()",
      "begin_line": 558,
      "end_line": 560,
      "comment": "",
      "child_ranges": [
        "(line 559,col 7)-(line 559,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.checkTheoreticalStartCost(double)",
      "begin_line": 562,
      "end_line": 565,
      "comment": "",
      "child_ranges": [
        "(line 563,col 7)-(line 563,col 69)",
        "(line 564,col 7)-(line 564,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.checkTheoreticalMinCost(double)",
      "begin_line": 567,
      "end_line": 570,
      "comment": "",
      "child_ranges": [
        "(line 568,col 7)-(line 568,col 67)",
        "(line 569,col 6)-(line 569,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.checkTheoreticalMinParams()",
      "begin_line": 572,
      "end_line": 583,
      "comment": "",
      "child_ranges": [
        "(line 573,col 7)-(line 581,col 7)",
        "(line 582,col 7)-(line 582,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.getMeasurements()",
      "begin_line": 585,
      "end_line": 591,
      "comment": "",
      "child_ranges": [
        "(line 586,col 7)-(line 586,col 70)",
        "(line 587,col 7)-(line 589,col 7)",
        "(line 590,col 7)-(line 590,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.getUnboundParameters()",
      "begin_line": 593,
      "end_line": 595,
      "comment": "",
      "child_ranges": [
        "(line 594,col 7)-(line 594,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.getAllParameters()",
      "begin_line": 597,
      "end_line": 599,
      "comment": "",
      "child_ranges": [
        "(line 598,col 7)-(line 598,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.getJacobian()",
      "begin_line": 601,
      "end_line": 601,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.getResiduals()",
      "begin_line": 603,
      "end_line": 603,
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
      "begin_line": 605,
      "end_line": 636,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.MinpackMeasurement.MinpackMeasurement(int)",
      "begin_line": 607,
      "end_line": 610,
      "comment": "",
      "child_ranges": [
        "(line 608,col 9)-(line 608,col 24)",
        "(line 609,col 9)-(line 609,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.MinpackMeasurement.getTheoreticalValue()",
      "begin_line": 612,
      "end_line": 618,
      "comment": "",
      "child_ranges": [
        "(line 617,col 9)-(line 617,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.MinpackMeasurement.getPartial(org.apache.commons.math.estimation.EstimatedParameter)",
      "begin_line": 620,
      "end_line": 631,
      "comment": "",
      "child_ranges": [
        "(line 625,col 9)-(line 629,col 9)",
        "(line 630,col 9)-(line 630,col 17)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "index"
      ],
      "begin_line": 633,
      "end_line": 633,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 634,
      "end_line": 634,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 638,
      "end_line": 638,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "m"
      ],
      "begin_line": 639,
      "end_line": 639,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parameters"
      ],
      "begin_line": 640,
      "end_line": 640,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "theoreticalStartCost"
      ],
      "begin_line": 641,
      "end_line": 641,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "theoreticalMinCost"
      ],
      "begin_line": 642,
      "end_line": 642,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "theoreticalMinParams"
      ],
      "begin_line": 643,
      "end_line": 643,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "costAccuracy"
      ],
      "begin_line": 644,
      "end_line": 644,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "paramsAccuracy"
      ],
      "begin_line": 645,
      "end_line": 645,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "LinearFullRankFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 649,
      "end_line": 684,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.LinearFullRankFunction.LinearFullRankFunction(int, int, double, double, double)",
      "begin_line": 651,
      "end_line": 656,
      "comment": "",
      "child_ranges": [
        "(line 654,col 7)-(line 655,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.LinearFullRankFunction.getJacobian()",
      "begin_line": 658,
      "end_line": 668,
      "comment": "",
      "child_ranges": [
        "(line 659,col 7)-(line 659,col 25)",
        "(line 660,col 7)-(line 660,col 44)",
        "(line 661,col 7)-(line 666,col 7)",
        "(line 667,col 7)-(line 667,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.LinearFullRankFunction.getResiduals()",
      "begin_line": 670,
      "end_line": 682,
      "comment": "",
      "child_ranges": [
        "(line 671,col 7)-(line 671,col 21)",
        "(line 672,col 7)-(line 674,col 7)",
        "(line 675,col 7)-(line 675,col 34)",
        "(line 676,col 7)-(line 676,col 33)",
        "(line 677,col 7)-(line 679,col 7)",
        "(line 680,col 7)-(line 680,col 31)",
        "(line 681,col 7)-(line 681,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LinearRank1Function",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 686,
      "end_line": 717,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.LinearRank1Function.LinearRank1Function(int, int, double, double, double)",
      "begin_line": 688,
      "end_line": 692,
      "comment": "",
      "child_ranges": [
        "(line 691,col 7)-(line 691,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.LinearRank1Function.getJacobian()",
      "begin_line": 694,
      "end_line": 703,
      "comment": "",
      "child_ranges": [
        "(line 695,col 7)-(line 695,col 44)",
        "(line 696,col 7)-(line 701,col 7)",
        "(line 702,col 7)-(line 702,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.LinearRank1Function.getResiduals()",
      "begin_line": 705,
      "end_line": 715,
      "comment": "",
      "child_ranges": [
        "(line 706,col 7)-(line 706,col 33)",
        "(line 707,col 7)-(line 707,col 21)",
        "(line 708,col 7)-(line 710,col 7)",
        "(line 711,col 7)-(line 713,col 7)",
        "(line 714,col 7)-(line 714,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LinearRank1ZeroColsAndRowsFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 719,
      "end_line": 760,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.LinearRank1ZeroColsAndRowsFunction.LinearRank1ZeroColsAndRowsFunction(int, int, double)",
      "begin_line": 721,
      "end_line": 726,
      "comment": "",
      "child_ranges": [
        "(line 722,col 7)-(line 725,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.LinearRank1ZeroColsAndRowsFunction.getJacobian()",
      "begin_line": 728,
      "end_line": 745,
      "comment": "",
      "child_ranges": [
        "(line 729,col 7)-(line 729,col 44)",
        "(line 730,col 7)-(line 743,col 7)",
        "(line 744,col 7)-(line 744,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.LinearRank1ZeroColsAndRowsFunction.getResiduals()",
      "begin_line": 747,
      "end_line": 758,
      "comment": "",
      "child_ranges": [
        "(line 748,col 7)-(line 748,col 33)",
        "(line 749,col 7)-(line 749,col 21)",
        "(line 750,col 7)-(line 752,col 7)",
        "(line 753,col 7)-(line 755,col 7)",
        "(line 756,col 7)-(line 756,col 20)",
        "(line 757,col 7)-(line 757,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RosenbrockFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 762,
      "end_line": 779,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.RosenbrockFunction.RosenbrockFunction(double[], double)",
      "begin_line": 764,
      "end_line": 766,
      "comment": "",
      "child_ranges": [
        "(line 765,col 7)-(line 765,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.RosenbrockFunction.getJacobian()",
      "begin_line": 768,
      "end_line": 771,
      "comment": "",
      "child_ranges": [
        "(line 769,col 7)-(line 769,col 46)",
        "(line 770,col 7)-(line 770,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.RosenbrockFunction.getResiduals()",
      "begin_line": 773,
      "end_line": 777,
      "comment": "",
      "child_ranges": [
        "(line 774,col 7)-(line 774,col 46)",
        "(line 775,col 7)-(line 775,col 46)",
        "(line 776,col 7)-(line 776,col 58)"
      ]
    },
    {
      "type": "class_interface",
      "name": "HelicalValleyFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 781,
      "end_line": 825,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.HelicalValleyFunction.HelicalValleyFunction(double[], double)",
      "begin_line": 783,
      "end_line": 787,
      "comment": "",
      "child_ranges": [
        "(line 785,col 7)-(line 786,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.HelicalValleyFunction.getJacobian()",
      "begin_line": 789,
      "end_line": 800,
      "comment": "",
      "child_ranges": [
        "(line 790,col 7)-(line 790,col 46)",
        "(line 791,col 7)-(line 791,col 46)",
        "(line 792,col 7)-(line 792,col 43)",
        "(line 793,col 7)-(line 793,col 38)",
        "(line 794,col 7)-(line 794,col 41)",
        "(line 795,col 7)-(line 799,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.HelicalValleyFunction.getResiduals()",
      "begin_line": 802,
      "end_line": 821,
      "comment": "",
      "child_ranges": [
        "(line 803,col 7)-(line 803,col 46)",
        "(line 804,col 7)-(line 804,col 46)",
        "(line 805,col 7)-(line 805,col 46)",
        "(line 806,col 7)-(line 806,col 18)",
        "(line 807,col 7)-(line 814,col 7)",
        "(line 815,col 7)-(line 815,col 49)",
        "(line 816,col 7)-(line 820,col 8)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "twoPi"
      ],
      "begin_line": 823,
      "end_line": 823,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "PowellSingularFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 827,
      "end_line": 863,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.PowellSingularFunction.PowellSingularFunction(double[], double)",
      "begin_line": 829,
      "end_line": 832,
      "comment": "",
      "child_ranges": [
        "(line 831,col 7)-(line 831,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.PowellSingularFunction.getJacobian()",
      "begin_line": 834,
      "end_line": 845,
      "comment": "",
      "child_ranges": [
        "(line 835,col 7)-(line 835,col 46)",
        "(line 836,col 7)-(line 836,col 46)",
        "(line 837,col 7)-(line 837,col 46)",
        "(line 838,col 7)-(line 838,col 46)",
        "(line 839,col 7)-(line 844,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.PowellSingularFunction.getResiduals()",
      "begin_line": 847,
      "end_line": 858,
      "comment": "",
      "child_ranges": [
        "(line 848,col 7)-(line 848,col 46)",
        "(line 849,col 7)-(line 849,col 46)",
        "(line 850,col 7)-(line 850,col 46)",
        "(line 851,col 7)-(line 851,col 46)",
        "(line 852,col 7)-(line 857,col 8)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "sqrt5"
      ],
      "begin_line": 860,
      "end_line": 860,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sqrt10"
      ],
      "begin_line": 861,
      "end_line": 861,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "FreudensteinRothFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 865,
      "end_line": 892,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.FreudensteinRothFunction.FreudensteinRothFunction(double[], double, double, double[])",
      "begin_line": 867,
      "end_line": 873,
      "comment": "",
      "child_ranges": [
        "(line 871,col 7)-(line 872,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.FreudensteinRothFunction.getJacobian()",
      "begin_line": 875,
      "end_line": 881,
      "comment": "",
      "child_ranges": [
        "(line 876,col 7)-(line 876,col 46)",
        "(line 877,col 7)-(line 880,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.FreudensteinRothFunction.getResiduals()",
      "begin_line": 883,
      "end_line": 890,
      "comment": "",
      "child_ranges": [
        "(line 884,col 7)-(line 884,col 46)",
        "(line 885,col 7)-(line 885,col 46)",
        "(line 886,col 7)-(line 889,col 8)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BardFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 894,
      "end_line": 939,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.BardFunction.BardFunction(double, double, double, double[])",
      "begin_line": 896,
      "end_line": 902,
      "comment": "",
      "child_ranges": [
        "(line 900,col 7)-(line 901,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.BardFunction.getJacobian()",
      "begin_line": 904,
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
      "end_line": 931,
      "comment": "",
      "child_ranges": [
        "(line 920,col 7)-(line 920,col 48)",
        "(line 921,col 7)-(line 921,col 48)",
        "(line 922,col 7)-(line 922,col 48)",
        "(line 923,col 7)-(line 923,col 33)",
        "(line 924,col 7)-(line 929,col 7)",
        "(line 930,col 7)-(line 930,col 15)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 933,
      "end_line": 937,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "KowalikOsborneFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 941,
      "end_line": 993,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.KowalikOsborneFunction.KowalikOsborneFunction(double[], double, double, double[])",
      "begin_line": 943,
      "end_line": 953,
      "comment": "",
      "child_ranges": [
        "(line 947,col 7)-(line 948,col 54)",
        "(line 949,col 7)-(line 952,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.KowalikOsborneFunction.getJacobian()",
      "begin_line": 955,
      "end_line": 970,
      "comment": "",
      "child_ranges": [
        "(line 956,col 7)-(line 956,col 48)",
        "(line 957,col 7)-(line 957,col 48)",
        "(line 958,col 7)-(line 958,col 48)",
        "(line 959,col 7)-(line 959,col 48)",
        "(line 960,col 7)-(line 960,col 44)",
        "(line 961,col 7)-(line 968,col 7)",
        "(line 969,col 7)-(line 969,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.KowalikOsborneFunction.getResiduals()",
      "begin_line": 972,
      "end_line": 982,
      "comment": "",
      "child_ranges": [
        "(line 973,col 7)-(line 973,col 46)",
        "(line 974,col 7)-(line 974,col 46)",
        "(line 975,col 7)-(line 975,col 46)",
        "(line 976,col 7)-(line 976,col 46)",
        "(line 977,col 7)-(line 977,col 33)",
        "(line 978,col 7)-(line 980,col 7)",
        "(line 981,col 7)-(line 981,col 15)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "v"
      ],
      "begin_line": 984,
      "end_line": 986,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 988,
      "end_line": 991,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "MeyerFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 995,
      "end_line": 1042,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MeyerFunction.MeyerFunction(double[], double, double, double[])",
      "begin_line": 997,
      "end_line": 1007,
      "comment": "",
      "child_ranges": [
        "(line 1001,col 7)-(line 1002,col 54)",
        "(line 1003,col 7)-(line 1006,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MeyerFunction.getJacobian()",
      "begin_line": 1009,
      "end_line": 1022,
      "comment": "",
      "child_ranges": [
        "(line 1010,col 7)-(line 1010,col 48)",
        "(line 1011,col 7)-(line 1011,col 48)",
        "(line 1012,col 7)-(line 1012,col 48)",
        "(line 1013,col 7)-(line 1013,col 44)",
        "(line 1014,col 7)-(line 1020,col 7)",
        "(line 1021,col 7)-(line 1021,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MeyerFunction.getResiduals()",
      "begin_line": 1024,
      "end_line": 1033,
      "comment": "",
      "child_ranges": [
        "(line 1025,col 7)-(line 1025,col 46)",
        "(line 1026,col 7)-(line 1026,col 46)",
        "(line 1027,col 7)-(line 1027,col 46)",
        "(line 1028,col 7)-(line 1028,col 33)",
        "(line 1029,col 7)-(line 1031,col 7)",
        "(line 1032,col 6)-(line 1032,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 1035,
      "end_line": 1040,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "WatsonFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1044,
      "end_line": 1114,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.WatsonFunction.WatsonFunction(int, double, double, double, double[])",
      "begin_line": 1046,
      "end_line": 1052,
      "comment": "",
      "child_ranges": [
        "(line 1050,col 7)-(line 1051,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.WatsonFunction.getJacobian()",
      "begin_line": 1054,
      "end_line": 1084,
      "comment": "",
      "child_ranges": [
        "(line 1056,col 7)-(line 1056,col 44)",
        "(line 1058,col 7)-(line 1073,col 7)",
        "(line 1075,col 7)-(line 1075,col 41)",
        "(line 1076,col 7)-(line 1076,col 29)",
        "(line 1078,col 7)-(line 1078,col 40)",
        "(line 1079,col 7)-(line 1079,col 59)",
        "(line 1080,col 7)-(line 1080,col 28)",
        "(line 1082,col 7)-(line 1082,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.WatsonFunction.getResiduals()",
      "begin_line": 1086,
      "end_line": 1112,
      "comment": "",
      "child_ranges": [
        "(line 1087,col 6)-(line 1087,col 32)",
        "(line 1088,col 6)-(line 1103,col 6)",
        "(line 1105,col 6)-(line 1105,col 45)",
        "(line 1106,col 6)-(line 1106,col 45)",
        "(line 1107,col 6)-(line 1107,col 19)",
        "(line 1108,col 6)-(line 1108,col 33)",
        "(line 1110,col 6)-(line 1110,col 14)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Box3DimensionalFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1116,
      "end_line": 1152,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.Box3DimensionalFunction.Box3DimensionalFunction(int, double[], double)",
      "begin_line": 1118,
      "end_line": 1122,
      "comment": "",
      "child_ranges": [
        "(line 1120,col 7)-(line 1121,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.Box3DimensionalFunction.getJacobian()",
      "begin_line": 1124,
      "end_line": 1137,
      "comment": "",
      "child_ranges": [
        "(line 1125,col 7)-(line 1125,col 48)",
        "(line 1126,col 7)-(line 1126,col 48)",
        "(line 1127,col 7)-(line 1127,col 44)",
        "(line 1128,col 7)-(line 1135,col 7)",
        "(line 1136,col 7)-(line 1136,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.Box3DimensionalFunction.getResiduals()",
      "begin_line": 1139,
      "end_line": 1150,
      "comment": "",
      "child_ranges": [
        "(line 1140,col 7)-(line 1140,col 46)",
        "(line 1141,col 7)-(line 1141,col 46)",
        "(line 1142,col 7)-(line 1142,col 46)",
        "(line 1143,col 7)-(line 1143,col 33)",
        "(line 1144,col 7)-(line 1148,col 7)",
        "(line 1149,col 7)-(line 1149,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "JennrichSampsonFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1154,
      "end_line": 1186,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.JennrichSampsonFunction.JennrichSampsonFunction(int, double[], double, double, double[])",
      "begin_line": 1156,
      "end_line": 1162,
      "comment": "",
      "child_ranges": [
        "(line 1160,col 7)-(line 1161,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.JennrichSampsonFunction.getJacobian()",
      "begin_line": 1164,
      "end_line": 1173,
      "comment": "",
      "child_ranges": [
        "(line 1165,col 7)-(line 1165,col 48)",
        "(line 1166,col 7)-(line 1166,col 48)",
        "(line 1167,col 7)-(line 1167,col 44)",
        "(line 1168,col 7)-(line 1171,col 7)",
        "(line 1172,col 7)-(line 1172,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.JennrichSampsonFunction.getResiduals()",
      "begin_line": 1175,
      "end_line": 1184,
      "comment": "",
      "child_ranges": [
        "(line 1176,col 7)-(line 1176,col 46)",
        "(line 1177,col 7)-(line 1177,col 46)",
        "(line 1178,col 7)-(line 1178,col 33)",
        "(line 1179,col 7)-(line 1182,col 7)",
        "(line 1183,col 7)-(line 1183,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BrownDennisFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1188,
      "end_line": 1231,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.BrownDennisFunction.BrownDennisFunction(int, double[], double, double, double[])",
      "begin_line": 1190,
      "end_line": 1196,
      "comment": "",
      "child_ranges": [
        "(line 1194,col 7)-(line 1195,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.BrownDennisFunction.getJacobian()",
      "begin_line": 1198,
      "end_line": 1214,
      "comment": "",
      "child_ranges": [
        "(line 1199,col 7)-(line 1199,col 48)",
        "(line 1200,col 7)-(line 1200,col 48)",
        "(line 1201,col 7)-(line 1201,col 48)",
        "(line 1202,col 7)-(line 1202,col 48)",
        "(line 1203,col 7)-(line 1203,col 44)",
        "(line 1204,col 7)-(line 1212,col 7)",
        "(line 1213,col 7)-(line 1213,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.BrownDennisFunction.getResiduals()",
      "begin_line": 1216,
      "end_line": 1229,
      "comment": "",
      "child_ranges": [
        "(line 1217,col 7)-(line 1217,col 46)",
        "(line 1218,col 7)-(line 1218,col 46)",
        "(line 1219,col 7)-(line 1219,col 46)",
        "(line 1220,col 7)-(line 1220,col 46)",
        "(line 1221,col 7)-(line 1221,col 33)",
        "(line 1222,col 7)-(line 1227,col 7)",
        "(line 1228,col 7)-(line 1228,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ChebyquadFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1233,
      "end_line": 1311,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.ChebyquadFunction.buildChebyquadArray(int, double)",
      "begin_line": 1235,
      "end_line": 1242,
      "comment": "",
      "child_ranges": [
        "(line 1236,col 7)-(line 1236,col 37)",
        "(line 1237,col 7)-(line 1237,col 36)",
        "(line 1238,col 7)-(line 1240,col 7)",
        "(line 1241,col 7)-(line 1241,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.ChebyquadFunction.ChebyquadFunction(int, int, double, double, double, double[])",
      "begin_line": 1244,
      "end_line": 1250,
      "comment": "",
      "child_ranges": [
        "(line 1248,col 7)-(line 1249,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.ChebyquadFunction.getJacobian()",
      "begin_line": 1252,
      "end_line": 1279,
      "comment": "",
      "child_ranges": [
        "(line 1254,col 7)-(line 1254,col 44)",
        "(line 1255,col 7)-(line 1257,col 7)",
        "(line 1259,col 7)-(line 1259,col 26)",
        "(line 1260,col 7)-(line 1275,col 7)",
        "(line 1277,col 7)-(line 1277,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.ChebyquadFunction.getResiduals()",
      "begin_line": 1281,
      "end_line": 1309,
      "comment": "",
      "child_ranges": [
        "(line 1283,col 7)-(line 1283,col 33)",
        "(line 1285,col 7)-(line 1295,col 7)",
        "(line 1297,col 7)-(line 1297,col 26)",
        "(line 1298,col 7)-(line 1298,col 26)",
        "(line 1299,col 7)-(line 1305,col 7)",
        "(line 1307,col 7)-(line 1307,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BrownAlmostLinearFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1313,
      "end_line": 1372,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.BrownAlmostLinearFunction.BrownAlmostLinearFunction(int, double, double, double, double[])",
      "begin_line": 1315,
      "end_line": 1321,
      "comment": "",
      "child_ranges": [
        "(line 1319,col 7)-(line 1320,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.BrownAlmostLinearFunction.getJacobian()",
      "begin_line": 1323,
      "end_line": 1355,
      "comment": "",
      "child_ranges": [
        "(line 1324,col 7)-(line 1324,col 44)",
        "(line 1325,col 7)-(line 1327,col 7)",
        "(line 1329,col 7)-(line 1329,col 22)",
        "(line 1330,col 7)-(line 1336,col 7)",
        "(line 1338,col 7)-(line 1351,col 7)",
        "(line 1353,col 7)-(line 1353,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.BrownAlmostLinearFunction.getResiduals()",
      "begin_line": 1357,
      "end_line": 1370,
      "comment": "",
      "child_ranges": [
        "(line 1358,col 7)-(line 1358,col 33)",
        "(line 1359,col 7)-(line 1359,col 29)",
        "(line 1360,col 7)-(line 1360,col 22)",
        "(line 1361,col 7)-(line 1364,col 7)",
        "(line 1365,col 7)-(line 1367,col 7)",
        "(line 1368,col 7)-(line 1368,col 26)",
        "(line 1369,col 7)-(line 1369,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Osborne1Function",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1374,
      "end_line": 1423,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.Osborne1Function.Osborne1Function(double[], double, double, double[])",
      "begin_line": 1376,
      "end_line": 1382,
      "comment": "",
      "child_ranges": [
        "(line 1380,col 7)-(line 1381,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.Osborne1Function.getJacobian()",
      "begin_line": 1384,
      "end_line": 1399,
      "comment": "",
      "child_ranges": [
        "(line 1385,col 7)-(line 1385,col 48)",
        "(line 1386,col 7)-(line 1386,col 48)",
        "(line 1387,col 7)-(line 1387,col 48)",
        "(line 1388,col 7)-(line 1388,col 48)",
        "(line 1389,col 7)-(line 1389,col 44)",
        "(line 1390,col 7)-(line 1397,col 7)",
        "(line 1398,col 7)-(line 1398,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.Osborne1Function.getResiduals()",
      "begin_line": 1401,
      "end_line": 1415,
      "comment": "",
      "child_ranges": [
        "(line 1402,col 7)-(line 1402,col 46)",
        "(line 1403,col 7)-(line 1403,col 46)",
        "(line 1404,col 7)-(line 1404,col 46)",
        "(line 1405,col 7)-(line 1405,col 46)",
        "(line 1406,col 7)-(line 1406,col 46)",
        "(line 1407,col 7)-(line 1407,col 33)",
        "(line 1408,col 7)-(line 1413,col 7)",
        "(line 1414,col 7)-(line 1414,col 15)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 1417,
      "end_line": 1421,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Osborne2Function",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1425,
      "end_line": 1511,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.Osborne2Function.Osborne2Function(double[], double, double, double[])",
      "begin_line": 1427,
      "end_line": 1433,
      "comment": "",
      "child_ranges": [
        "(line 1431,col 7)-(line 1432,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.Osborne2Function.getJacobian()",
      "begin_line": 1435,
      "end_line": 1469,
      "comment": "",
      "child_ranges": [
        "(line 1436,col 7)-(line 1436,col 49)",
        "(line 1437,col 7)-(line 1437,col 49)",
        "(line 1438,col 7)-(line 1438,col 49)",
        "(line 1439,col 7)-(line 1439,col 49)",
        "(line 1440,col 7)-(line 1440,col 49)",
        "(line 1441,col 7)-(line 1441,col 49)",
        "(line 1442,col 7)-(line 1442,col 49)",
        "(line 1443,col 7)-(line 1443,col 49)",
        "(line 1444,col 7)-(line 1444,col 49)",
        "(line 1445,col 7)-(line 1445,col 49)",
        "(line 1446,col 7)-(line 1446,col 50)",
        "(line 1447,col 7)-(line 1447,col 44)",
        "(line 1448,col 7)-(line 1467,col 7)",
        "(line 1468,col 7)-(line 1468,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.Osborne2Function.getResiduals()",
      "begin_line": 1471,
      "end_line": 1493,
      "comment": "",
      "child_ranges": [
        "(line 1472,col 7)-(line 1472,col 47)",
        "(line 1473,col 7)-(line 1473,col 47)",
        "(line 1474,col 7)-(line 1474,col 47)",
        "(line 1475,col 7)-(line 1475,col 47)",
        "(line 1476,col 7)-(line 1476,col 47)",
        "(line 1477,col 7)-(line 1477,col 47)",
        "(line 1478,col 7)-(line 1478,col 47)",
        "(line 1479,col 7)-(line 1479,col 47)",
        "(line 1480,col 7)-(line 1480,col 47)",
        "(line 1481,col 7)-(line 1481,col 47)",
        "(line 1482,col 7)-(line 1482,col 48)",
        "(line 1483,col 7)-(line 1483,col 33)",
        "(line 1484,col 7)-(line 1491,col 7)",
        "(line 1492,col 7)-(line 1492,col 15)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 1495,
      "end_line": 1509,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.suite()",
      "begin_line": 1513,
      "end_line": 1515,
      "comment": "",
      "child_ranges": [
        "(line 1514,col 5)-(line 1514,col 44)"
      ]
    }
  ]
}