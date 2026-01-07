{
  "filepath": "/tmp/Math-70b/src/test/java/org/apache/commons/math/estimation/MinpackTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MinpackTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 92,
      "end_line": 1537,
      "comment": "\n * \u003cp\u003eSome of the unit tests are re-implementations of the MINPACK \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file17\"\u003efile17\u003c/a\u003e and \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file22\"\u003efile22\u003c/a\u003e test files.\n * The redistribution policy for MINPACK is available \u003ca\n * href\u003d\"http://www.netlib.org/minpack/disclaimer\"\u003ehere\u003c/a\u003e, for\n * convenience, it is reproduced below.\u003c/p\u003e\n\n * \u003ctable border\u003d\"0\" width\u003d\"80%\" cellpadding\u003d\"10\" align\u003d\"center\" bgcolor\u003d\"#E0E0E0\"\u003e\n * \u003ctr\u003e\u003ctd\u003e\n *    Minpack Copyright Notice (1999) University of Chicago.\n *    All rights reserved\n * \u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003e\n * Redistribution and use in source and binary forms, with or without\n * modification, are permitted provided that the following conditions\n * are met:\n * \u003col\u003e\n *  \u003cli\u003eRedistributions of source code must retain the above copyright\n *      notice, this list of conditions and the following disclaimer.\u003c/li\u003e\n * \u003cli\u003eRedistributions in binary form must reproduce the above\n *     copyright notice, this list of conditions and the following\n *     disclaimer in the documentation and/or other materials provided\n *     with the distribution.\u003c/li\u003e\n * \u003cli\u003eThe end-user documentation included with the redistribution, if any,\n *     must include the following acknowledgment:\n *     \u003ccode\u003eThis product includes software developed by the University of\n *           Chicago, as Operator of Argonne National Laboratory.\u003c/code\u003e\n *     Alternately, this acknowledgment may appear in the software itself,\n *     if and wherever such third-party acknowledgments normally appear.\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eWARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED \"AS IS\"\n *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE\n *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND\n *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR\n *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES\n *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE\n *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY\n *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR\n *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF\n *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)\n *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION\n *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL\n *     BE CORRECTED.\u003c/strong\u003e\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eLIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT\n *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF\n *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,\n *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF\n *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF\n *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER\n *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT\n *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,\n *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE\n *     POSSIBILITY OF SUCH LOSS OR DAMAGES.\u003c/strong\u003e\u003c/li\u003e\n * \u003col\u003e\u003c/td\u003e\u003c/tr\u003e\n * \u003c/table\u003e\n\n * @author Argonne National Laboratory. MINPACK project. March 1980 (original fortran minpack tests)\n * @author Burton S. Garbow (original fortran minpack tests)\n * @author Kenneth E. Hillstrom (original fortran minpack tests)\n * @author Jorge J. More (original fortran minpack tests)\n * @author Luc Maisonobe (non-minpack tests and minpack tests Java translation)\n "
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
      "end_line": 634,
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
      "end_line": 623,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.MinpackMeasurement.MinpackMeasurement(org.apache.commons.math.estimation.MinpackTest.MinpackFunction, int)",
      "begin_line": 590,
      "end_line": 594,
      "comment": "",
      "child_ranges": [
        "(line 591,col 9)-(line 591,col 24)",
        "(line 592,col 9)-(line 592,col 27)",
        "(line 593,col 9)-(line 593,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.MinpackMeasurement.getTheoreticalValue()",
      "begin_line": 596,
      "end_line": 603,
      "comment": "",
      "child_ranges": [
        "(line 602,col 9)-(line 602,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.MinpackMeasurement.getPartial(org.apache.commons.math.estimation.EstimatedParameter)",
      "begin_line": 605,
      "end_line": 617,
      "comment": "",
      "child_ranges": [
        "(line 611,col 9)-(line 615,col 9)",
        "(line 616,col 9)-(line 616,col 17)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "index"
      ],
      "begin_line": 619,
      "end_line": 619,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "f"
      ],
      "begin_line": 620,
      "end_line": 620,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 621,
      "end_line": 621,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 625,
      "end_line": 625,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "m"
      ],
      "begin_line": 626,
      "end_line": 626,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parameters"
      ],
      "begin_line": 627,
      "end_line": 627,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "theoreticalStartCost"
      ],
      "begin_line": 628,
      "end_line": 628,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "theoreticalMinCost"
      ],
      "begin_line": 629,
      "end_line": 629,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "theoreticalMinParams"
      ],
      "begin_line": 630,
      "end_line": 630,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "costAccuracy"
      ],
      "begin_line": 631,
      "end_line": 631,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "paramsAccuracy"
      ],
      "begin_line": 632,
      "end_line": 632,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "LinearFullRankFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 636,
      "end_line": 673,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.LinearFullRankFunction.LinearFullRankFunction(int, int, double, double, double)",
      "begin_line": 638,
      "end_line": 643,
      "comment": "",
      "child_ranges": [
        "(line 641,col 7)-(line 642,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.LinearFullRankFunction.getJacobian()",
      "begin_line": 645,
      "end_line": 656,
      "comment": "",
      "child_ranges": [
        "(line 647,col 7)-(line 647,col 25)",
        "(line 648,col 7)-(line 648,col 44)",
        "(line 649,col 7)-(line 654,col 7)",
        "(line 655,col 7)-(line 655,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.LinearFullRankFunction.getResiduals()",
      "begin_line": 658,
      "end_line": 671,
      "comment": "",
      "child_ranges": [
        "(line 660,col 7)-(line 660,col 21)",
        "(line 661,col 7)-(line 663,col 7)",
        "(line 664,col 7)-(line 664,col 34)",
        "(line 665,col 7)-(line 665,col 33)",
        "(line 666,col 7)-(line 668,col 7)",
        "(line 669,col 7)-(line 669,col 31)",
        "(line 670,col 7)-(line 670,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LinearRank1Function",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 675,
      "end_line": 708,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.LinearRank1Function.LinearRank1Function(int, int, double, double, double)",
      "begin_line": 677,
      "end_line": 681,
      "comment": "",
      "child_ranges": [
        "(line 680,col 7)-(line 680,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.LinearRank1Function.getJacobian()",
      "begin_line": 683,
      "end_line": 693,
      "comment": "",
      "child_ranges": [
        "(line 685,col 7)-(line 685,col 44)",
        "(line 686,col 7)-(line 691,col 7)",
        "(line 692,col 7)-(line 692,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.LinearRank1Function.getResiduals()",
      "begin_line": 695,
      "end_line": 706,
      "comment": "",
      "child_ranges": [
        "(line 697,col 7)-(line 697,col 33)",
        "(line 698,col 7)-(line 698,col 21)",
        "(line 699,col 7)-(line 701,col 7)",
        "(line 702,col 7)-(line 704,col 7)",
        "(line 705,col 7)-(line 705,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LinearRank1ZeroColsAndRowsFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 710,
      "end_line": 753,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.LinearRank1ZeroColsAndRowsFunction.LinearRank1ZeroColsAndRowsFunction(int, int, double)",
      "begin_line": 712,
      "end_line": 717,
      "comment": "",
      "child_ranges": [
        "(line 713,col 7)-(line 716,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.LinearRank1ZeroColsAndRowsFunction.getJacobian()",
      "begin_line": 719,
      "end_line": 737,
      "comment": "",
      "child_ranges": [
        "(line 721,col 7)-(line 721,col 44)",
        "(line 722,col 7)-(line 735,col 7)",
        "(line 736,col 7)-(line 736,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.LinearRank1ZeroColsAndRowsFunction.getResiduals()",
      "begin_line": 739,
      "end_line": 751,
      "comment": "",
      "child_ranges": [
        "(line 741,col 7)-(line 741,col 33)",
        "(line 742,col 7)-(line 742,col 21)",
        "(line 743,col 7)-(line 745,col 7)",
        "(line 746,col 7)-(line 748,col 7)",
        "(line 749,col 7)-(line 749,col 20)",
        "(line 750,col 7)-(line 750,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RosenbrockFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 755,
      "end_line": 774,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.RosenbrockFunction.RosenbrockFunction(double[], double)",
      "begin_line": 757,
      "end_line": 759,
      "comment": "",
      "child_ranges": [
        "(line 758,col 7)-(line 758,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.RosenbrockFunction.getJacobian()",
      "begin_line": 761,
      "end_line": 765,
      "comment": "",
      "child_ranges": [
        "(line 763,col 7)-(line 763,col 46)",
        "(line 764,col 7)-(line 764,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.RosenbrockFunction.getResiduals()",
      "begin_line": 767,
      "end_line": 772,
      "comment": "",
      "child_ranges": [
        "(line 769,col 7)-(line 769,col 46)",
        "(line 770,col 7)-(line 770,col 46)",
        "(line 771,col 7)-(line 771,col 58)"
      ]
    },
    {
      "type": "class_interface",
      "name": "HelicalValleyFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 776,
      "end_line": 822,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.HelicalValleyFunction.HelicalValleyFunction(double[], double)",
      "begin_line": 778,
      "end_line": 782,
      "comment": "",
      "child_ranges": [
        "(line 780,col 7)-(line 781,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.HelicalValleyFunction.getJacobian()",
      "begin_line": 784,
      "end_line": 796,
      "comment": "",
      "child_ranges": [
        "(line 786,col 7)-(line 786,col 46)",
        "(line 787,col 7)-(line 787,col 46)",
        "(line 788,col 7)-(line 788,col 43)",
        "(line 789,col 7)-(line 789,col 38)",
        "(line 790,col 7)-(line 790,col 41)",
        "(line 791,col 7)-(line 795,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.HelicalValleyFunction.getResiduals()",
      "begin_line": 798,
      "end_line": 818,
      "comment": "",
      "child_ranges": [
        "(line 800,col 7)-(line 800,col 46)",
        "(line 801,col 7)-(line 801,col 46)",
        "(line 802,col 7)-(line 802,col 46)",
        "(line 803,col 7)-(line 803,col 18)",
        "(line 804,col 7)-(line 811,col 7)",
        "(line 812,col 7)-(line 812,col 49)",
        "(line 813,col 7)-(line 817,col 8)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "twoPi"
      ],
      "begin_line": 820,
      "end_line": 820,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "PowellSingularFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 824,
      "end_line": 862,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.PowellSingularFunction.PowellSingularFunction(double[], double)",
      "begin_line": 826,
      "end_line": 829,
      "comment": "",
      "child_ranges": [
        "(line 828,col 7)-(line 828,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.PowellSingularFunction.getJacobian()",
      "begin_line": 831,
      "end_line": 843,
      "comment": "",
      "child_ranges": [
        "(line 833,col 7)-(line 833,col 46)",
        "(line 834,col 7)-(line 834,col 46)",
        "(line 835,col 7)-(line 835,col 46)",
        "(line 836,col 7)-(line 836,col 46)",
        "(line 837,col 7)-(line 842,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.PowellSingularFunction.getResiduals()",
      "begin_line": 845,
      "end_line": 857,
      "comment": "",
      "child_ranges": [
        "(line 847,col 7)-(line 847,col 46)",
        "(line 848,col 7)-(line 848,col 46)",
        "(line 849,col 7)-(line 849,col 46)",
        "(line 850,col 7)-(line 850,col 46)",
        "(line 851,col 7)-(line 856,col 8)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "sqrt5"
      ],
      "begin_line": 859,
      "end_line": 859,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sqrt10"
      ],
      "begin_line": 860,
      "end_line": 860,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "FreudensteinRothFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 864,
      "end_line": 893,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.FreudensteinRothFunction.FreudensteinRothFunction(double[], double, double, double[])",
      "begin_line": 866,
      "end_line": 872,
      "comment": "",
      "child_ranges": [
        "(line 870,col 7)-(line 871,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.FreudensteinRothFunction.getJacobian()",
      "begin_line": 874,
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
      "end_line": 942,
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
      "end_line": 919,
      "comment": "",
      "child_ranges": [
        "(line 907,col 7)-(line 907,col 48)",
        "(line 908,col 7)-(line 908,col 48)",
        "(line 909,col 7)-(line 909,col 44)",
        "(line 910,col 7)-(line 917,col 7)",
        "(line 918,col 7)-(line 918,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.BardFunction.getResiduals()",
      "begin_line": 921,
      "end_line": 934,
      "comment": "",
      "child_ranges": [
        "(line 923,col 7)-(line 923,col 48)",
        "(line 924,col 7)-(line 924,col 48)",
        "(line 925,col 7)-(line 925,col 48)",
        "(line 926,col 7)-(line 926,col 33)",
        "(line 927,col 7)-(line 932,col 7)",
        "(line 933,col 7)-(line 933,col 15)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 936,
      "end_line": 940,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "KowalikOsborneFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 944,
      "end_line": 998,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.KowalikOsborneFunction.KowalikOsborneFunction(double[], double, double, double[])",
      "begin_line": 946,
      "end_line": 956,
      "comment": "",
      "child_ranges": [
        "(line 950,col 7)-(line 951,col 54)",
        "(line 952,col 7)-(line 955,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.KowalikOsborneFunction.getJacobian()",
      "begin_line": 958,
      "end_line": 974,
      "comment": "",
      "child_ranges": [
        "(line 960,col 7)-(line 960,col 48)",
        "(line 961,col 7)-(line 961,col 48)",
        "(line 962,col 7)-(line 962,col 48)",
        "(line 963,col 7)-(line 963,col 48)",
        "(line 964,col 7)-(line 964,col 44)",
        "(line 965,col 7)-(line 972,col 7)",
        "(line 973,col 7)-(line 973,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.KowalikOsborneFunction.getResiduals()",
      "begin_line": 976,
      "end_line": 987,
      "comment": "",
      "child_ranges": [
        "(line 978,col 7)-(line 978,col 46)",
        "(line 979,col 7)-(line 979,col 46)",
        "(line 980,col 7)-(line 980,col 46)",
        "(line 981,col 7)-(line 981,col 46)",
        "(line 982,col 7)-(line 982,col 33)",
        "(line 983,col 7)-(line 985,col 7)",
        "(line 986,col 7)-(line 986,col 15)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "v"
      ],
      "begin_line": 989,
      "end_line": 991,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 993,
      "end_line": 996,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "MeyerFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1000,
      "end_line": 1049,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MeyerFunction.MeyerFunction(double[], double, double, double[])",
      "begin_line": 1002,
      "end_line": 1012,
      "comment": "",
      "child_ranges": [
        "(line 1006,col 7)-(line 1007,col 54)",
        "(line 1008,col 7)-(line 1011,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MeyerFunction.getJacobian()",
      "begin_line": 1014,
      "end_line": 1028,
      "comment": "",
      "child_ranges": [
        "(line 1016,col 7)-(line 1016,col 48)",
        "(line 1017,col 7)-(line 1017,col 48)",
        "(line 1018,col 7)-(line 1018,col 48)",
        "(line 1019,col 7)-(line 1019,col 44)",
        "(line 1020,col 7)-(line 1026,col 7)",
        "(line 1027,col 7)-(line 1027,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MeyerFunction.getResiduals()",
      "begin_line": 1030,
      "end_line": 1040,
      "comment": "",
      "child_ranges": [
        "(line 1032,col 7)-(line 1032,col 46)",
        "(line 1033,col 7)-(line 1033,col 46)",
        "(line 1034,col 7)-(line 1034,col 46)",
        "(line 1035,col 7)-(line 1035,col 33)",
        "(line 1036,col 7)-(line 1038,col 7)",
        "(line 1039,col 6)-(line 1039,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 1042,
      "end_line": 1047,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "WatsonFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1051,
      "end_line": 1123,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.WatsonFunction.WatsonFunction(int, double, double, double, double[])",
      "begin_line": 1053,
      "end_line": 1059,
      "comment": "",
      "child_ranges": [
        "(line 1057,col 7)-(line 1058,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.WatsonFunction.getJacobian()",
      "begin_line": 1061,
      "end_line": 1092,
      "comment": "",
      "child_ranges": [
        "(line 1064,col 7)-(line 1064,col 44)",
        "(line 1066,col 7)-(line 1081,col 7)",
        "(line 1083,col 7)-(line 1083,col 41)",
        "(line 1084,col 7)-(line 1084,col 29)",
        "(line 1086,col 7)-(line 1086,col 40)",
        "(line 1087,col 7)-(line 1087,col 59)",
        "(line 1088,col 7)-(line 1088,col 28)",
        "(line 1090,col 7)-(line 1090,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.WatsonFunction.getResiduals()",
      "begin_line": 1094,
      "end_line": 1121,
      "comment": "",
      "child_ranges": [
        "(line 1096,col 6)-(line 1096,col 32)",
        "(line 1097,col 6)-(line 1112,col 6)",
        "(line 1114,col 6)-(line 1114,col 45)",
        "(line 1115,col 6)-(line 1115,col 45)",
        "(line 1116,col 6)-(line 1116,col 19)",
        "(line 1117,col 6)-(line 1117,col 33)",
        "(line 1119,col 6)-(line 1119,col 14)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Box3DimensionalFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1125,
      "end_line": 1163,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.Box3DimensionalFunction.Box3DimensionalFunction(int, double[], double)",
      "begin_line": 1127,
      "end_line": 1131,
      "comment": "",
      "child_ranges": [
        "(line 1129,col 7)-(line 1130,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.Box3DimensionalFunction.getJacobian()",
      "begin_line": 1133,
      "end_line": 1147,
      "comment": "",
      "child_ranges": [
        "(line 1135,col 7)-(line 1135,col 48)",
        "(line 1136,col 7)-(line 1136,col 48)",
        "(line 1137,col 7)-(line 1137,col 44)",
        "(line 1138,col 7)-(line 1145,col 7)",
        "(line 1146,col 7)-(line 1146,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.Box3DimensionalFunction.getResiduals()",
      "begin_line": 1149,
      "end_line": 1161,
      "comment": "",
      "child_ranges": [
        "(line 1151,col 7)-(line 1151,col 46)",
        "(line 1152,col 7)-(line 1152,col 46)",
        "(line 1153,col 7)-(line 1153,col 46)",
        "(line 1154,col 7)-(line 1154,col 33)",
        "(line 1155,col 7)-(line 1159,col 7)",
        "(line 1160,col 7)-(line 1160,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "JennrichSampsonFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1165,
      "end_line": 1199,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.JennrichSampsonFunction.JennrichSampsonFunction(int, double[], double, double, double[])",
      "begin_line": 1167,
      "end_line": 1173,
      "comment": "",
      "child_ranges": [
        "(line 1171,col 7)-(line 1172,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.JennrichSampsonFunction.getJacobian()",
      "begin_line": 1175,
      "end_line": 1185,
      "comment": "",
      "child_ranges": [
        "(line 1177,col 7)-(line 1177,col 48)",
        "(line 1178,col 7)-(line 1178,col 48)",
        "(line 1179,col 7)-(line 1179,col 44)",
        "(line 1180,col 7)-(line 1183,col 7)",
        "(line 1184,col 7)-(line 1184,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.JennrichSampsonFunction.getResiduals()",
      "begin_line": 1187,
      "end_line": 1197,
      "comment": "",
      "child_ranges": [
        "(line 1189,col 7)-(line 1189,col 46)",
        "(line 1190,col 7)-(line 1190,col 46)",
        "(line 1191,col 7)-(line 1191,col 33)",
        "(line 1192,col 7)-(line 1195,col 7)",
        "(line 1196,col 7)-(line 1196,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BrownDennisFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1201,
      "end_line": 1247,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.BrownDennisFunction.BrownDennisFunction(int, double[], double, double, double[])",
      "begin_line": 1203,
      "end_line": 1210,
      "comment": "",
      "child_ranges": [
        "(line 1207,col 7)-(line 1208,col 54)",
        "(line 1209,col 7)-(line 1209,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.BrownDennisFunction.getJacobian()",
      "begin_line": 1212,
      "end_line": 1229,
      "comment": "",
      "child_ranges": [
        "(line 1214,col 7)-(line 1214,col 48)",
        "(line 1215,col 7)-(line 1215,col 48)",
        "(line 1216,col 7)-(line 1216,col 48)",
        "(line 1217,col 7)-(line 1217,col 48)",
        "(line 1218,col 7)-(line 1218,col 44)",
        "(line 1219,col 7)-(line 1227,col 7)",
        "(line 1228,col 7)-(line 1228,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.BrownDennisFunction.getResiduals()",
      "begin_line": 1231,
      "end_line": 1245,
      "comment": "",
      "child_ranges": [
        "(line 1233,col 7)-(line 1233,col 46)",
        "(line 1234,col 7)-(line 1234,col 46)",
        "(line 1235,col 7)-(line 1235,col 46)",
        "(line 1236,col 7)-(line 1236,col 46)",
        "(line 1237,col 7)-(line 1237,col 33)",
        "(line 1238,col 7)-(line 1243,col 7)",
        "(line 1244,col 7)-(line 1244,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ChebyquadFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1249,
      "end_line": 1329,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.ChebyquadFunction.buildChebyquadArray(int, double)",
      "begin_line": 1251,
      "end_line": 1258,
      "comment": "",
      "child_ranges": [
        "(line 1252,col 7)-(line 1252,col 37)",
        "(line 1253,col 7)-(line 1253,col 36)",
        "(line 1254,col 7)-(line 1256,col 7)",
        "(line 1257,col 7)-(line 1257,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.ChebyquadFunction.ChebyquadFunction(int, int, double, double, double, double[])",
      "begin_line": 1260,
      "end_line": 1266,
      "comment": "",
      "child_ranges": [
        "(line 1264,col 7)-(line 1265,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.ChebyquadFunction.getJacobian()",
      "begin_line": 1268,
      "end_line": 1296,
      "comment": "",
      "child_ranges": [
        "(line 1271,col 7)-(line 1271,col 44)",
        "(line 1272,col 7)-(line 1274,col 7)",
        "(line 1276,col 7)-(line 1276,col 26)",
        "(line 1277,col 7)-(line 1292,col 7)",
        "(line 1294,col 7)-(line 1294,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.ChebyquadFunction.getResiduals()",
      "begin_line": 1298,
      "end_line": 1327,
      "comment": "",
      "child_ranges": [
        "(line 1301,col 7)-(line 1301,col 33)",
        "(line 1303,col 7)-(line 1313,col 7)",
        "(line 1315,col 7)-(line 1315,col 26)",
        "(line 1316,col 7)-(line 1316,col 26)",
        "(line 1317,col 7)-(line 1323,col 7)",
        "(line 1325,col 7)-(line 1325,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BrownAlmostLinearFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1331,
      "end_line": 1392,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.BrownAlmostLinearFunction.BrownAlmostLinearFunction(int, double, double, double, double[])",
      "begin_line": 1333,
      "end_line": 1339,
      "comment": "",
      "child_ranges": [
        "(line 1337,col 7)-(line 1338,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.BrownAlmostLinearFunction.getJacobian()",
      "begin_line": 1341,
      "end_line": 1374,
      "comment": "",
      "child_ranges": [
        "(line 1343,col 7)-(line 1343,col 44)",
        "(line 1344,col 7)-(line 1346,col 7)",
        "(line 1348,col 7)-(line 1348,col 22)",
        "(line 1349,col 7)-(line 1355,col 7)",
        "(line 1357,col 7)-(line 1370,col 7)",
        "(line 1372,col 7)-(line 1372,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.BrownAlmostLinearFunction.getResiduals()",
      "begin_line": 1376,
      "end_line": 1390,
      "comment": "",
      "child_ranges": [
        "(line 1378,col 7)-(line 1378,col 33)",
        "(line 1379,col 7)-(line 1379,col 29)",
        "(line 1380,col 7)-(line 1380,col 22)",
        "(line 1381,col 7)-(line 1384,col 7)",
        "(line 1385,col 7)-(line 1387,col 7)",
        "(line 1388,col 7)-(line 1388,col 26)",
        "(line 1389,col 7)-(line 1389,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Osborne1Function",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1394,
      "end_line": 1445,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.Osborne1Function.Osborne1Function(double[], double, double, double[])",
      "begin_line": 1396,
      "end_line": 1402,
      "comment": "",
      "child_ranges": [
        "(line 1400,col 7)-(line 1401,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.Osborne1Function.getJacobian()",
      "begin_line": 1404,
      "end_line": 1420,
      "comment": "",
      "child_ranges": [
        "(line 1406,col 7)-(line 1406,col 48)",
        "(line 1407,col 7)-(line 1407,col 48)",
        "(line 1408,col 7)-(line 1408,col 48)",
        "(line 1409,col 7)-(line 1409,col 48)",
        "(line 1410,col 7)-(line 1410,col 44)",
        "(line 1411,col 7)-(line 1418,col 7)",
        "(line 1419,col 7)-(line 1419,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.Osborne1Function.getResiduals()",
      "begin_line": 1422,
      "end_line": 1437,
      "comment": "",
      "child_ranges": [
        "(line 1424,col 7)-(line 1424,col 46)",
        "(line 1425,col 7)-(line 1425,col 46)",
        "(line 1426,col 7)-(line 1426,col 46)",
        "(line 1427,col 7)-(line 1427,col 46)",
        "(line 1428,col 7)-(line 1428,col 46)",
        "(line 1429,col 7)-(line 1429,col 33)",
        "(line 1430,col 7)-(line 1435,col 7)",
        "(line 1436,col 7)-(line 1436,col 15)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 1439,
      "end_line": 1443,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Osborne2Function",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1447,
      "end_line": 1535,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.Osborne2Function.Osborne2Function(double[], double, double, double[])",
      "begin_line": 1449,
      "end_line": 1455,
      "comment": "",
      "child_ranges": [
        "(line 1453,col 7)-(line 1454,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.Osborne2Function.getJacobian()",
      "begin_line": 1457,
      "end_line": 1492,
      "comment": "",
      "child_ranges": [
        "(line 1459,col 7)-(line 1459,col 49)",
        "(line 1460,col 7)-(line 1460,col 49)",
        "(line 1461,col 7)-(line 1461,col 49)",
        "(line 1462,col 7)-(line 1462,col 49)",
        "(line 1463,col 7)-(line 1463,col 49)",
        "(line 1464,col 7)-(line 1464,col 49)",
        "(line 1465,col 7)-(line 1465,col 49)",
        "(line 1466,col 7)-(line 1466,col 49)",
        "(line 1467,col 7)-(line 1467,col 49)",
        "(line 1468,col 7)-(line 1468,col 49)",
        "(line 1469,col 7)-(line 1469,col 50)",
        "(line 1470,col 7)-(line 1470,col 44)",
        "(line 1471,col 7)-(line 1490,col 7)",
        "(line 1491,col 7)-(line 1491,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.Osborne2Function.getResiduals()",
      "begin_line": 1494,
      "end_line": 1517,
      "comment": "",
      "child_ranges": [
        "(line 1496,col 7)-(line 1496,col 47)",
        "(line 1497,col 7)-(line 1497,col 47)",
        "(line 1498,col 7)-(line 1498,col 47)",
        "(line 1499,col 7)-(line 1499,col 47)",
        "(line 1500,col 7)-(line 1500,col 47)",
        "(line 1501,col 7)-(line 1501,col 47)",
        "(line 1502,col 7)-(line 1502,col 47)",
        "(line 1503,col 7)-(line 1503,col 47)",
        "(line 1504,col 7)-(line 1504,col 47)",
        "(line 1505,col 7)-(line 1505,col 47)",
        "(line 1506,col 7)-(line 1506,col 48)",
        "(line 1507,col 7)-(line 1507,col 33)",
        "(line 1508,col 7)-(line 1515,col 7)",
        "(line 1516,col 7)-(line 1516,col 15)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 1519,
      "end_line": 1533,
      "comment": ""
    }
  ]
}