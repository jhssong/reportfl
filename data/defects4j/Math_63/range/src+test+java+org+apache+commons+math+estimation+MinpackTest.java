{
  "filepath": "/tmp/Math-63b/src/test/java/org/apache/commons/math/estimation/MinpackTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MinpackTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 93,
      "end_line": 1538,
      "comment": "\n * \u003cp\u003eSome of the unit tests are re-implementations of the MINPACK \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file17\"\u003efile17\u003c/a\u003e and \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file22\"\u003efile22\u003c/a\u003e test files.\n * The redistribution policy for MINPACK is available \u003ca\n * href\u003d\"http://www.netlib.org/minpack/disclaimer\"\u003ehere\u003c/a\u003e, for\n * convenience, it is reproduced below.\u003c/p\u003e\n\n * \u003ctable border\u003d\"0\" width\u003d\"80%\" cellpadding\u003d\"10\" align\u003d\"center\" bgcolor\u003d\"#E0E0E0\"\u003e\n * \u003ctr\u003e\u003ctd\u003e\n *    Minpack Copyright Notice (1999) University of Chicago.\n *    All rights reserved\n * \u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003e\n * Redistribution and use in source and binary forms, with or without\n * modification, are permitted provided that the following conditions\n * are met:\n * \u003col\u003e\n *  \u003cli\u003eRedistributions of source code must retain the above copyright\n *      notice, this list of conditions and the following disclaimer.\u003c/li\u003e\n * \u003cli\u003eRedistributions in binary form must reproduce the above\n *     copyright notice, this list of conditions and the following\n *     disclaimer in the documentation and/or other materials provided\n *     with the distribution.\u003c/li\u003e\n * \u003cli\u003eThe end-user documentation included with the redistribution, if any,\n *     must include the following acknowledgment:\n *     \u003ccode\u003eThis product includes software developed by the University of\n *           Chicago, as Operator of Argonne National Laboratory.\u003c/code\u003e\n *     Alternately, this acknowledgment may appear in the software itself,\n *     if and wherever such third-party acknowledgments normally appear.\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eWARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED \"AS IS\"\n *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE\n *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND\n *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR\n *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES\n *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE\n *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY\n *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR\n *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF\n *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)\n *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION\n *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL\n *     BE CORRECTED.\u003c/strong\u003e\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eLIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT\n *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF\n *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,\n *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF\n *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF\n *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER\n *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT\n *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,\n *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE\n *     POSSIBILITY OF SUCH LOSS OR DAMAGES.\u003c/strong\u003e\u003c/li\u003e\n * \u003col\u003e\u003c/td\u003e\u003c/tr\u003e\n * \u003c/table\u003e\n\n * @author Argonne National Laboratory. MINPACK project. March 1980 (original fortran minpack tests)\n * @author Burton S. Garbow (original fortran minpack tests)\n * @author Kenneth E. Hillstrom (original fortran minpack tests)\n * @author Jorge J. More (original fortran minpack tests)\n * @author Luc Maisonobe (non-minpack tests and minpack tests Java translation)\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackTest(java.lang.String)",
      "begin_line": 97,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 98,col 5)-(line 98,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackLinearFullRank()",
      "begin_line": 101,
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
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 116,col 5)-(line 116,col 75)",
        "(line 117,col 5)-(line 117,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackRosenbrok()",
      "begin_line": 120,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 121,col 5)-(line 122,col 68)",
        "(line 123,col 5)-(line 124,col 73)",
        "(line 125,col 5)-(line 126,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackHelicalValley()",
      "begin_line": 129,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 130,col 5)-(line 131,col 56)",
        "(line 132,col 5)-(line 133,col 67)",
        "(line 134,col 5)-(line 135,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackPowellSingular()",
      "begin_line": 138,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 139,col 5)-(line 140,col 69)",
        "(line 141,col 5)-(line 142,col 68)",
        "(line 143,col 5)-(line 144,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackFreudensteinRoth()",
      "begin_line": 147,
      "end_line": 166,
      "comment": "",
      "child_ranges": [
        "(line 148,col 5)-(line 153,col 56)",
        "(line 154,col 5)-(line 159,col 56)",
        "(line 160,col 5)-(line 165,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackBard()",
      "begin_line": 168,
      "end_line": 187,
      "comment": "",
      "child_ranges": [
        "(line 169,col 5)-(line 174,col 44)",
        "(line 175,col 5)-(line 180,col 44)",
        "(line 181,col 5)-(line 186,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackKowalikOsborne()",
      "begin_line": 189,
      "end_line": 217,
      "comment": "",
      "child_ranges": [
        "(line 190,col 5)-(line 198,col 54)",
        "(line 199,col 5)-(line 207,col 54)",
        "(line 208,col 5)-(line 216,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackMeyer()",
      "begin_line": 219,
      "end_line": 234,
      "comment": "",
      "child_ranges": [
        "(line 220,col 5)-(line 226,col 45)",
        "(line 227,col 5)-(line 233,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackWatson()",
      "begin_line": 236,
      "end_line": 319,
      "comment": "",
      "child_ranges": [
        "(line 238,col 5)-(line 244,col 46)",
        "(line 245,col 5)-(line 251,col 46)",
        "(line 252,col 5)-(line 258,col 46)",
        "(line 260,col 5)-(line 268,col 46)",
        "(line 269,col 5)-(line 277,col 46)",
        "(line 278,col 5)-(line 286,col 46)",
        "(line 288,col 5)-(line 297,col 46)",
        "(line 298,col 5)-(line 307,col 46)",
        "(line 308,col 5)-(line 317,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackBox3Dimensional()",
      "begin_line": 321,
      "end_line": 324,
      "comment": "",
      "child_ranges": [
        "(line 322,col 5)-(line 323,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackJennrichSampson()",
      "begin_line": 326,
      "end_line": 332,
      "comment": "",
      "child_ranges": [
        "(line 327,col 5)-(line 331,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackBrownDennis()",
      "begin_line": 334,
      "end_line": 356,
      "comment": "",
      "child_ranges": [
        "(line 335,col 5)-(line 341,col 51)",
        "(line 342,col 5)-(line 348,col 50)",
        "(line 349,col 5)-(line 355,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackChebyquad()",
      "begin_line": 358,
      "end_line": 394,
      "comment": "",
      "child_ranges": [
        "(line 359,col 5)-(line 361,col 68)",
        "(line 362,col 5)-(line 364,col 80)",
        "(line 365,col 5)-(line 367,col 80)",
        "(line 368,col 5)-(line 375,col 49)",
        "(line 376,col 5)-(line 384,col 49)",
        "(line 385,col 5)-(line 393,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackBrownAlmostLinear()",
      "begin_line": 396,
      "end_line": 462,
      "comment": "",
      "child_ranges": [
        "(line 397,col 5)-(line 405,col 57)",
        "(line 406,col 5)-(line 414,col 57)",
        "(line 415,col 5)-(line 420,col 57)",
        "(line 421,col 5)-(line 439,col 57)",
        "(line 440,col 5)-(line 461,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackOsborne1()",
      "begin_line": 464,
      "end_line": 472,
      "comment": "",
      "child_ranges": [
        "(line 465,col 7)-(line 471,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.testMinpackOsborne2()",
      "begin_line": 474,
      "end_line": 489,
      "comment": "",
      "child_ranges": [
        "(line 476,col 5)-(line 488,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.minpackTest(org.apache.commons.math.estimation.MinpackTest.MinpackFunction, boolean)",
      "begin_line": 491,
      "end_line": 506,
      "comment": "",
      "child_ranges": [
        "(line 492,col 5)-(line 492,col 78)",
        "(line 493,col 5)-(line 493,col 58)",
        "(line 494,col 5)-(line 494,col 73)",
        "(line 495,col 5)-(line 495,col 72)",
        "(line 496,col 5)-(line 496,col 51)",
        "(line 497,col 5)-(line 497,col 79)",
        "(line 498,col 5)-(line 503,col 5)",
        "(line 504,col 5)-(line 504,col 77)",
        "(line 505,col 5)-(line 505,col 53)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MinpackFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.EstimationProblem"
      ],
      "begin_line": 508,
      "end_line": 635,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.MinpackFunction(int, double[], double, double, double[])",
      "begin_line": 510,
      "end_line": 526,
      "comment": "",
      "child_ranges": [
        "(line 515,col 7)-(line 515,col 17)",
        "(line 516,col 7)-(line 516,col 34)",
        "(line 517,col 7)-(line 517,col 45)",
        "(line 518,col 7)-(line 520,col 7)",
        "(line 521,col 7)-(line 521,col 55)",
        "(line 522,col 7)-(line 522,col 53)",
        "(line 523,col 7)-(line 523,col 55)",
        "(line 524,col 7)-(line 524,col 41)",
        "(line 525,col 7)-(line 525,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.buildArray(int, double)",
      "begin_line": 528,
      "end_line": 532,
      "comment": "",
      "child_ranges": [
        "(line 529,col 7)-(line 529,col 37)",
        "(line 530,col 7)-(line 530,col 28)",
        "(line 531,col 7)-(line 531,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.setCostAccuracy(double)",
      "begin_line": 534,
      "end_line": 536,
      "comment": "",
      "child_ranges": [
        "(line 535,col 7)-(line 535,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.setParamsAccuracy(double)",
      "begin_line": 538,
      "end_line": 540,
      "comment": "",
      "child_ranges": [
        "(line 539,col 7)-(line 539,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.getN()",
      "begin_line": 542,
      "end_line": 544,
      "comment": "",
      "child_ranges": [
        "(line 543,col 7)-(line 543,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.checkTheoreticalStartCost(double)",
      "begin_line": 546,
      "end_line": 549,
      "comment": "",
      "child_ranges": [
        "(line 547,col 7)-(line 547,col 69)",
        "(line 548,col 7)-(line 548,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.checkTheoreticalMinCost(double)",
      "begin_line": 551,
      "end_line": 554,
      "comment": "",
      "child_ranges": [
        "(line 552,col 7)-(line 552,col 67)",
        "(line 553,col 6)-(line 553,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.checkTheoreticalMinParams()",
      "begin_line": 556,
      "end_line": 567,
      "comment": "",
      "child_ranges": [
        "(line 557,col 7)-(line 565,col 7)",
        "(line 566,col 7)-(line 566,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.getMeasurements()",
      "begin_line": 569,
      "end_line": 575,
      "comment": "",
      "child_ranges": [
        "(line 570,col 7)-(line 570,col 70)",
        "(line 571,col 7)-(line 573,col 7)",
        "(line 574,col 7)-(line 574,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.getUnboundParameters()",
      "begin_line": 577,
      "end_line": 579,
      "comment": "",
      "child_ranges": [
        "(line 578,col 7)-(line 578,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.getAllParameters()",
      "begin_line": 581,
      "end_line": 583,
      "comment": "",
      "child_ranges": [
        "(line 582,col 7)-(line 582,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.getJacobian()",
      "begin_line": 585,
      "end_line": 585,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.getResiduals()",
      "begin_line": 587,
      "end_line": 587,
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
      "begin_line": 589,
      "end_line": 624,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.MinpackMeasurement.MinpackMeasurement(org.apache.commons.math.estimation.MinpackTest.MinpackFunction, int)",
      "begin_line": 591,
      "end_line": 595,
      "comment": "",
      "child_ranges": [
        "(line 592,col 9)-(line 592,col 24)",
        "(line 593,col 9)-(line 593,col 27)",
        "(line 594,col 9)-(line 594,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.MinpackMeasurement.getTheoreticalValue()",
      "begin_line": 597,
      "end_line": 604,
      "comment": "",
      "child_ranges": [
        "(line 603,col 9)-(line 603,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MinpackFunction.MinpackMeasurement.getPartial(org.apache.commons.math.estimation.EstimatedParameter)",
      "begin_line": 606,
      "end_line": 618,
      "comment": "",
      "child_ranges": [
        "(line 612,col 9)-(line 616,col 9)",
        "(line 617,col 9)-(line 617,col 17)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "index"
      ],
      "begin_line": 620,
      "end_line": 620,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "f"
      ],
      "begin_line": 621,
      "end_line": 621,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 622,
      "end_line": 622,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 626,
      "end_line": 626,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "m"
      ],
      "begin_line": 627,
      "end_line": 627,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "parameters"
      ],
      "begin_line": 628,
      "end_line": 628,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "theoreticalStartCost"
      ],
      "begin_line": 629,
      "end_line": 629,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "theoreticalMinCost"
      ],
      "begin_line": 630,
      "end_line": 630,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "theoreticalMinParams"
      ],
      "begin_line": 631,
      "end_line": 631,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "costAccuracy"
      ],
      "begin_line": 632,
      "end_line": 632,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "paramsAccuracy"
      ],
      "begin_line": 633,
      "end_line": 633,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "LinearFullRankFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 637,
      "end_line": 674,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.LinearFullRankFunction.LinearFullRankFunction(int, int, double, double, double)",
      "begin_line": 639,
      "end_line": 644,
      "comment": "",
      "child_ranges": [
        "(line 642,col 7)-(line 643,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.LinearFullRankFunction.getJacobian()",
      "begin_line": 646,
      "end_line": 657,
      "comment": "",
      "child_ranges": [
        "(line 648,col 7)-(line 648,col 25)",
        "(line 649,col 7)-(line 649,col 44)",
        "(line 650,col 7)-(line 655,col 7)",
        "(line 656,col 7)-(line 656,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.LinearFullRankFunction.getResiduals()",
      "begin_line": 659,
      "end_line": 672,
      "comment": "",
      "child_ranges": [
        "(line 661,col 7)-(line 661,col 21)",
        "(line 662,col 7)-(line 664,col 7)",
        "(line 665,col 7)-(line 665,col 34)",
        "(line 666,col 7)-(line 666,col 33)",
        "(line 667,col 7)-(line 669,col 7)",
        "(line 670,col 7)-(line 670,col 31)",
        "(line 671,col 7)-(line 671,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LinearRank1Function",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 676,
      "end_line": 709,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.LinearRank1Function.LinearRank1Function(int, int, double, double, double)",
      "begin_line": 678,
      "end_line": 682,
      "comment": "",
      "child_ranges": [
        "(line 681,col 7)-(line 681,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.LinearRank1Function.getJacobian()",
      "begin_line": 684,
      "end_line": 694,
      "comment": "",
      "child_ranges": [
        "(line 686,col 7)-(line 686,col 44)",
        "(line 687,col 7)-(line 692,col 7)",
        "(line 693,col 7)-(line 693,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.LinearRank1Function.getResiduals()",
      "begin_line": 696,
      "end_line": 707,
      "comment": "",
      "child_ranges": [
        "(line 698,col 7)-(line 698,col 33)",
        "(line 699,col 7)-(line 699,col 21)",
        "(line 700,col 7)-(line 702,col 7)",
        "(line 703,col 7)-(line 705,col 7)",
        "(line 706,col 7)-(line 706,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LinearRank1ZeroColsAndRowsFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 711,
      "end_line": 754,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.LinearRank1ZeroColsAndRowsFunction.LinearRank1ZeroColsAndRowsFunction(int, int, double)",
      "begin_line": 713,
      "end_line": 718,
      "comment": "",
      "child_ranges": [
        "(line 714,col 7)-(line 717,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.LinearRank1ZeroColsAndRowsFunction.getJacobian()",
      "begin_line": 720,
      "end_line": 738,
      "comment": "",
      "child_ranges": [
        "(line 722,col 7)-(line 722,col 44)",
        "(line 723,col 7)-(line 736,col 7)",
        "(line 737,col 7)-(line 737,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.LinearRank1ZeroColsAndRowsFunction.getResiduals()",
      "begin_line": 740,
      "end_line": 752,
      "comment": "",
      "child_ranges": [
        "(line 742,col 7)-(line 742,col 33)",
        "(line 743,col 7)-(line 743,col 21)",
        "(line 744,col 7)-(line 746,col 7)",
        "(line 747,col 7)-(line 749,col 7)",
        "(line 750,col 7)-(line 750,col 20)",
        "(line 751,col 7)-(line 751,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RosenbrockFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 756,
      "end_line": 775,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.RosenbrockFunction.RosenbrockFunction(double[], double)",
      "begin_line": 758,
      "end_line": 760,
      "comment": "",
      "child_ranges": [
        "(line 759,col 7)-(line 759,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.RosenbrockFunction.getJacobian()",
      "begin_line": 762,
      "end_line": 766,
      "comment": "",
      "child_ranges": [
        "(line 764,col 7)-(line 764,col 46)",
        "(line 765,col 7)-(line 765,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.RosenbrockFunction.getResiduals()",
      "begin_line": 768,
      "end_line": 773,
      "comment": "",
      "child_ranges": [
        "(line 770,col 7)-(line 770,col 46)",
        "(line 771,col 7)-(line 771,col 46)",
        "(line 772,col 7)-(line 772,col 58)"
      ]
    },
    {
      "type": "class_interface",
      "name": "HelicalValleyFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 777,
      "end_line": 823,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.HelicalValleyFunction.HelicalValleyFunction(double[], double)",
      "begin_line": 779,
      "end_line": 783,
      "comment": "",
      "child_ranges": [
        "(line 781,col 7)-(line 782,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.HelicalValleyFunction.getJacobian()",
      "begin_line": 785,
      "end_line": 797,
      "comment": "",
      "child_ranges": [
        "(line 787,col 7)-(line 787,col 46)",
        "(line 788,col 7)-(line 788,col 46)",
        "(line 789,col 7)-(line 789,col 43)",
        "(line 790,col 7)-(line 790,col 38)",
        "(line 791,col 7)-(line 791,col 45)",
        "(line 792,col 7)-(line 796,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.HelicalValleyFunction.getResiduals()",
      "begin_line": 799,
      "end_line": 819,
      "comment": "",
      "child_ranges": [
        "(line 801,col 7)-(line 801,col 46)",
        "(line 802,col 7)-(line 802,col 46)",
        "(line 803,col 7)-(line 803,col 46)",
        "(line 804,col 7)-(line 804,col 18)",
        "(line 805,col 7)-(line 812,col 7)",
        "(line 813,col 7)-(line 813,col 53)",
        "(line 814,col 7)-(line 818,col 8)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "twoPi"
      ],
      "begin_line": 821,
      "end_line": 821,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "PowellSingularFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 825,
      "end_line": 863,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.PowellSingularFunction.PowellSingularFunction(double[], double)",
      "begin_line": 827,
      "end_line": 830,
      "comment": "",
      "child_ranges": [
        "(line 829,col 7)-(line 829,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.PowellSingularFunction.getJacobian()",
      "begin_line": 832,
      "end_line": 844,
      "comment": "",
      "child_ranges": [
        "(line 834,col 7)-(line 834,col 46)",
        "(line 835,col 7)-(line 835,col 46)",
        "(line 836,col 7)-(line 836,col 46)",
        "(line 837,col 7)-(line 837,col 46)",
        "(line 838,col 7)-(line 843,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.PowellSingularFunction.getResiduals()",
      "begin_line": 846,
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
      "end_line": 894,
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
      "end_line": 892,
      "comment": "",
      "child_ranges": [
        "(line 886,col 7)-(line 886,col 46)",
        "(line 887,col 7)-(line 887,col 46)",
        "(line 888,col 7)-(line 891,col 8)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BardFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 896,
      "end_line": 943,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.BardFunction.BardFunction(double, double, double, double[])",
      "begin_line": 898,
      "end_line": 904,
      "comment": "",
      "child_ranges": [
        "(line 902,col 7)-(line 903,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.BardFunction.getJacobian()",
      "begin_line": 906,
      "end_line": 920,
      "comment": "",
      "child_ranges": [
        "(line 908,col 7)-(line 908,col 48)",
        "(line 909,col 7)-(line 909,col 48)",
        "(line 910,col 7)-(line 910,col 44)",
        "(line 911,col 7)-(line 918,col 7)",
        "(line 919,col 7)-(line 919,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.BardFunction.getResiduals()",
      "begin_line": 922,
      "end_line": 935,
      "comment": "",
      "child_ranges": [
        "(line 924,col 7)-(line 924,col 48)",
        "(line 925,col 7)-(line 925,col 48)",
        "(line 926,col 7)-(line 926,col 48)",
        "(line 927,col 7)-(line 927,col 33)",
        "(line 928,col 7)-(line 933,col 7)",
        "(line 934,col 7)-(line 934,col 15)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 937,
      "end_line": 941,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "KowalikOsborneFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 945,
      "end_line": 999,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.KowalikOsborneFunction.KowalikOsborneFunction(double[], double, double, double[])",
      "begin_line": 947,
      "end_line": 957,
      "comment": "",
      "child_ranges": [
        "(line 951,col 7)-(line 952,col 54)",
        "(line 953,col 7)-(line 956,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.KowalikOsborneFunction.getJacobian()",
      "begin_line": 959,
      "end_line": 975,
      "comment": "",
      "child_ranges": [
        "(line 961,col 7)-(line 961,col 48)",
        "(line 962,col 7)-(line 962,col 48)",
        "(line 963,col 7)-(line 963,col 48)",
        "(line 964,col 7)-(line 964,col 48)",
        "(line 965,col 7)-(line 965,col 44)",
        "(line 966,col 7)-(line 973,col 7)",
        "(line 974,col 7)-(line 974,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.KowalikOsborneFunction.getResiduals()",
      "begin_line": 977,
      "end_line": 988,
      "comment": "",
      "child_ranges": [
        "(line 979,col 7)-(line 979,col 46)",
        "(line 980,col 7)-(line 980,col 46)",
        "(line 981,col 7)-(line 981,col 46)",
        "(line 982,col 7)-(line 982,col 46)",
        "(line 983,col 7)-(line 983,col 33)",
        "(line 984,col 7)-(line 986,col 7)",
        "(line 987,col 7)-(line 987,col 15)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "v"
      ],
      "begin_line": 990,
      "end_line": 992,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 994,
      "end_line": 997,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "MeyerFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1001,
      "end_line": 1050,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MeyerFunction.MeyerFunction(double[], double, double, double[])",
      "begin_line": 1003,
      "end_line": 1013,
      "comment": "",
      "child_ranges": [
        "(line 1007,col 7)-(line 1008,col 54)",
        "(line 1009,col 7)-(line 1012,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MeyerFunction.getJacobian()",
      "begin_line": 1015,
      "end_line": 1029,
      "comment": "",
      "child_ranges": [
        "(line 1017,col 7)-(line 1017,col 48)",
        "(line 1018,col 7)-(line 1018,col 48)",
        "(line 1019,col 7)-(line 1019,col 48)",
        "(line 1020,col 7)-(line 1020,col 44)",
        "(line 1021,col 7)-(line 1027,col 7)",
        "(line 1028,col 7)-(line 1028,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.MeyerFunction.getResiduals()",
      "begin_line": 1031,
      "end_line": 1041,
      "comment": "",
      "child_ranges": [
        "(line 1033,col 7)-(line 1033,col 46)",
        "(line 1034,col 7)-(line 1034,col 46)",
        "(line 1035,col 7)-(line 1035,col 46)",
        "(line 1036,col 7)-(line 1036,col 33)",
        "(line 1037,col 7)-(line 1039,col 7)",
        "(line 1040,col 6)-(line 1040,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 1043,
      "end_line": 1048,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "WatsonFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1052,
      "end_line": 1124,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.WatsonFunction.WatsonFunction(int, double, double, double, double[])",
      "begin_line": 1054,
      "end_line": 1060,
      "comment": "",
      "child_ranges": [
        "(line 1058,col 7)-(line 1059,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.WatsonFunction.getJacobian()",
      "begin_line": 1062,
      "end_line": 1093,
      "comment": "",
      "child_ranges": [
        "(line 1065,col 7)-(line 1065,col 44)",
        "(line 1067,col 7)-(line 1082,col 7)",
        "(line 1084,col 7)-(line 1084,col 41)",
        "(line 1085,col 7)-(line 1085,col 29)",
        "(line 1087,col 7)-(line 1087,col 40)",
        "(line 1088,col 7)-(line 1088,col 59)",
        "(line 1089,col 7)-(line 1089,col 28)",
        "(line 1091,col 7)-(line 1091,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.WatsonFunction.getResiduals()",
      "begin_line": 1095,
      "end_line": 1122,
      "comment": "",
      "child_ranges": [
        "(line 1097,col 6)-(line 1097,col 32)",
        "(line 1098,col 6)-(line 1113,col 6)",
        "(line 1115,col 6)-(line 1115,col 45)",
        "(line 1116,col 6)-(line 1116,col 45)",
        "(line 1117,col 6)-(line 1117,col 19)",
        "(line 1118,col 6)-(line 1118,col 33)",
        "(line 1120,col 6)-(line 1120,col 14)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Box3DimensionalFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1126,
      "end_line": 1164,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.Box3DimensionalFunction.Box3DimensionalFunction(int, double[], double)",
      "begin_line": 1128,
      "end_line": 1132,
      "comment": "",
      "child_ranges": [
        "(line 1130,col 7)-(line 1131,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.Box3DimensionalFunction.getJacobian()",
      "begin_line": 1134,
      "end_line": 1148,
      "comment": "",
      "child_ranges": [
        "(line 1136,col 7)-(line 1136,col 48)",
        "(line 1137,col 7)-(line 1137,col 48)",
        "(line 1138,col 7)-(line 1138,col 44)",
        "(line 1139,col 7)-(line 1146,col 7)",
        "(line 1147,col 7)-(line 1147,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.Box3DimensionalFunction.getResiduals()",
      "begin_line": 1150,
      "end_line": 1162,
      "comment": "",
      "child_ranges": [
        "(line 1152,col 7)-(line 1152,col 46)",
        "(line 1153,col 7)-(line 1153,col 46)",
        "(line 1154,col 7)-(line 1154,col 46)",
        "(line 1155,col 7)-(line 1155,col 33)",
        "(line 1156,col 7)-(line 1160,col 7)",
        "(line 1161,col 7)-(line 1161,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "JennrichSampsonFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1166,
      "end_line": 1200,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.JennrichSampsonFunction.JennrichSampsonFunction(int, double[], double, double, double[])",
      "begin_line": 1168,
      "end_line": 1174,
      "comment": "",
      "child_ranges": [
        "(line 1172,col 7)-(line 1173,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.JennrichSampsonFunction.getJacobian()",
      "begin_line": 1176,
      "end_line": 1186,
      "comment": "",
      "child_ranges": [
        "(line 1178,col 7)-(line 1178,col 48)",
        "(line 1179,col 7)-(line 1179,col 48)",
        "(line 1180,col 7)-(line 1180,col 44)",
        "(line 1181,col 7)-(line 1184,col 7)",
        "(line 1185,col 7)-(line 1185,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.JennrichSampsonFunction.getResiduals()",
      "begin_line": 1188,
      "end_line": 1198,
      "comment": "",
      "child_ranges": [
        "(line 1190,col 7)-(line 1190,col 46)",
        "(line 1191,col 7)-(line 1191,col 46)",
        "(line 1192,col 7)-(line 1192,col 33)",
        "(line 1193,col 7)-(line 1196,col 7)",
        "(line 1197,col 7)-(line 1197,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BrownDennisFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1202,
      "end_line": 1248,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.BrownDennisFunction.BrownDennisFunction(int, double[], double, double, double[])",
      "begin_line": 1204,
      "end_line": 1211,
      "comment": "",
      "child_ranges": [
        "(line 1208,col 7)-(line 1209,col 54)",
        "(line 1210,col 7)-(line 1210,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.BrownDennisFunction.getJacobian()",
      "begin_line": 1213,
      "end_line": 1230,
      "comment": "",
      "child_ranges": [
        "(line 1215,col 7)-(line 1215,col 48)",
        "(line 1216,col 7)-(line 1216,col 48)",
        "(line 1217,col 7)-(line 1217,col 48)",
        "(line 1218,col 7)-(line 1218,col 48)",
        "(line 1219,col 7)-(line 1219,col 44)",
        "(line 1220,col 7)-(line 1228,col 7)",
        "(line 1229,col 7)-(line 1229,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.BrownDennisFunction.getResiduals()",
      "begin_line": 1232,
      "end_line": 1246,
      "comment": "",
      "child_ranges": [
        "(line 1234,col 7)-(line 1234,col 46)",
        "(line 1235,col 7)-(line 1235,col 46)",
        "(line 1236,col 7)-(line 1236,col 46)",
        "(line 1237,col 7)-(line 1237,col 46)",
        "(line 1238,col 7)-(line 1238,col 33)",
        "(line 1239,col 7)-(line 1244,col 7)",
        "(line 1245,col 7)-(line 1245,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ChebyquadFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1250,
      "end_line": 1330,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.ChebyquadFunction.buildChebyquadArray(int, double)",
      "begin_line": 1252,
      "end_line": 1259,
      "comment": "",
      "child_ranges": [
        "(line 1253,col 7)-(line 1253,col 37)",
        "(line 1254,col 7)-(line 1254,col 36)",
        "(line 1255,col 7)-(line 1257,col 7)",
        "(line 1258,col 7)-(line 1258,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.ChebyquadFunction.ChebyquadFunction(int, int, double, double, double, double[])",
      "begin_line": 1261,
      "end_line": 1267,
      "comment": "",
      "child_ranges": [
        "(line 1265,col 7)-(line 1266,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.ChebyquadFunction.getJacobian()",
      "begin_line": 1269,
      "end_line": 1297,
      "comment": "",
      "child_ranges": [
        "(line 1272,col 7)-(line 1272,col 44)",
        "(line 1273,col 7)-(line 1275,col 7)",
        "(line 1277,col 7)-(line 1277,col 26)",
        "(line 1278,col 7)-(line 1293,col 7)",
        "(line 1295,col 7)-(line 1295,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.ChebyquadFunction.getResiduals()",
      "begin_line": 1299,
      "end_line": 1328,
      "comment": "",
      "child_ranges": [
        "(line 1302,col 7)-(line 1302,col 33)",
        "(line 1304,col 7)-(line 1314,col 7)",
        "(line 1316,col 7)-(line 1316,col 26)",
        "(line 1317,col 7)-(line 1317,col 26)",
        "(line 1318,col 7)-(line 1324,col 7)",
        "(line 1326,col 7)-(line 1326,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BrownAlmostLinearFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1332,
      "end_line": 1393,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.BrownAlmostLinearFunction.BrownAlmostLinearFunction(int, double, double, double, double[])",
      "begin_line": 1334,
      "end_line": 1340,
      "comment": "",
      "child_ranges": [
        "(line 1338,col 7)-(line 1339,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.BrownAlmostLinearFunction.getJacobian()",
      "begin_line": 1342,
      "end_line": 1375,
      "comment": "",
      "child_ranges": [
        "(line 1344,col 7)-(line 1344,col 44)",
        "(line 1345,col 7)-(line 1347,col 7)",
        "(line 1349,col 7)-(line 1349,col 22)",
        "(line 1350,col 7)-(line 1356,col 7)",
        "(line 1358,col 7)-(line 1371,col 7)",
        "(line 1373,col 7)-(line 1373,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.BrownAlmostLinearFunction.getResiduals()",
      "begin_line": 1377,
      "end_line": 1391,
      "comment": "",
      "child_ranges": [
        "(line 1379,col 7)-(line 1379,col 33)",
        "(line 1380,col 7)-(line 1380,col 29)",
        "(line 1381,col 7)-(line 1381,col 22)",
        "(line 1382,col 7)-(line 1385,col 7)",
        "(line 1386,col 7)-(line 1388,col 7)",
        "(line 1389,col 7)-(line 1389,col 26)",
        "(line 1390,col 7)-(line 1390,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Osborne1Function",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1395,
      "end_line": 1446,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.Osborne1Function.Osborne1Function(double[], double, double, double[])",
      "begin_line": 1397,
      "end_line": 1403,
      "comment": "",
      "child_ranges": [
        "(line 1401,col 7)-(line 1402,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.Osborne1Function.getJacobian()",
      "begin_line": 1405,
      "end_line": 1421,
      "comment": "",
      "child_ranges": [
        "(line 1407,col 7)-(line 1407,col 48)",
        "(line 1408,col 7)-(line 1408,col 48)",
        "(line 1409,col 7)-(line 1409,col 48)",
        "(line 1410,col 7)-(line 1410,col 48)",
        "(line 1411,col 7)-(line 1411,col 44)",
        "(line 1412,col 7)-(line 1419,col 7)",
        "(line 1420,col 7)-(line 1420,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.Osborne1Function.getResiduals()",
      "begin_line": 1423,
      "end_line": 1438,
      "comment": "",
      "child_ranges": [
        "(line 1425,col 7)-(line 1425,col 46)",
        "(line 1426,col 7)-(line 1426,col 46)",
        "(line 1427,col 7)-(line 1427,col 46)",
        "(line 1428,col 7)-(line 1428,col 46)",
        "(line 1429,col 7)-(line 1429,col 46)",
        "(line 1430,col 7)-(line 1430,col 33)",
        "(line 1431,col 7)-(line 1436,col 7)",
        "(line 1437,col 7)-(line 1437,col 15)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 1440,
      "end_line": 1444,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Osborne2Function",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.estimation.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1448,
      "end_line": 1536,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.estimation.MinpackTest.Osborne2Function.Osborne2Function(double[], double, double, double[])",
      "begin_line": 1450,
      "end_line": 1456,
      "comment": "",
      "child_ranges": [
        "(line 1454,col 7)-(line 1455,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.Osborne2Function.getJacobian()",
      "begin_line": 1458,
      "end_line": 1493,
      "comment": "",
      "child_ranges": [
        "(line 1460,col 7)-(line 1460,col 49)",
        "(line 1461,col 7)-(line 1461,col 49)",
        "(line 1462,col 7)-(line 1462,col 49)",
        "(line 1463,col 7)-(line 1463,col 49)",
        "(line 1464,col 7)-(line 1464,col 49)",
        "(line 1465,col 7)-(line 1465,col 49)",
        "(line 1466,col 7)-(line 1466,col 49)",
        "(line 1467,col 7)-(line 1467,col 49)",
        "(line 1468,col 7)-(line 1468,col 49)",
        "(line 1469,col 7)-(line 1469,col 49)",
        "(line 1470,col 7)-(line 1470,col 50)",
        "(line 1471,col 7)-(line 1471,col 44)",
        "(line 1472,col 7)-(line 1491,col 7)",
        "(line 1492,col 7)-(line 1492,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.estimation.MinpackTest.Osborne2Function.getResiduals()",
      "begin_line": 1495,
      "end_line": 1518,
      "comment": "",
      "child_ranges": [
        "(line 1497,col 7)-(line 1497,col 47)",
        "(line 1498,col 7)-(line 1498,col 47)",
        "(line 1499,col 7)-(line 1499,col 47)",
        "(line 1500,col 7)-(line 1500,col 47)",
        "(line 1501,col 7)-(line 1501,col 47)",
        "(line 1502,col 7)-(line 1502,col 47)",
        "(line 1503,col 7)-(line 1503,col 47)",
        "(line 1504,col 7)-(line 1504,col 47)",
        "(line 1505,col 7)-(line 1505,col 47)",
        "(line 1506,col 7)-(line 1506,col 47)",
        "(line 1507,col 7)-(line 1507,col 48)",
        "(line 1508,col 7)-(line 1508,col 33)",
        "(line 1509,col 7)-(line 1516,col 7)",
        "(line 1517,col 7)-(line 1517,col 15)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 1520,
      "end_line": 1534,
      "comment": ""
    }
  ]
}