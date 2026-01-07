{
  "filepath": "/tmp/Math-90b/src/test/org/apache/commons/math/optimization/general/MinpackTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MinpackTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 95,
      "end_line": 1560,
      "comment": "\n * \u003cp\u003eSome of the unit tests are re-implementations of the MINPACK \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file17\"\u003efile17\u003c/a\u003e and \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file22\"\u003efile22\u003c/a\u003e test files. \n * The redistribution policy for MINPACK is available \u003ca\n * href\u003d\"http://www.netlib.org/minpack/disclaimer\"\u003ehere\u003c/a\u003e, for\n * convenience, it is reproduced below.\u003c/p\u003e\n\n * \u003ctable border\u003d\"0\" width\u003d\"80%\" cellpadding\u003d\"10\" align\u003d\"center\" bgcolor\u003d\"#E0E0E0\"\u003e\n * \u003ctr\u003e\u003ctd\u003e\n *    Minpack Copyright Notice (1999) University of Chicago.\n *    All rights reserved\n * \u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003e\n * Redistribution and use in source and binary forms, with or without\n * modification, are permitted provided that the following conditions\n * are met:\n * \u003col\u003e\n *  \u003cli\u003eRedistributions of source code must retain the above copyright\n *      notice, this list of conditions and the following disclaimer.\u003c/li\u003e\n * \u003cli\u003eRedistributions in binary form must reproduce the above\n *     copyright notice, this list of conditions and the following\n *     disclaimer in the documentation and/or other materials provided\n *     with the distribution.\u003c/li\u003e\n * \u003cli\u003eThe end-user documentation included with the redistribution, if any,\n *     must include the following acknowledgment:\n *     \u003ccode\u003eThis product includes software developed by the University of\n *           Chicago, as Operator of Argonne National Laboratory.\u003c/code\u003e\n *     Alternately, this acknowledgment may appear in the software itself,\n *     if and wherever such third-party acknowledgments normally appear.\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eWARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED \"AS IS\"\n *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE\n *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND\n *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR\n *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES\n *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE\n *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY\n *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR\n *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF\n *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)\n *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION\n *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL\n *     BE CORRECTED.\u003c/strong\u003e\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eLIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT\n *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF\n *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,\n *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF\n *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF\n *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER\n *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT\n *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,\n *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE\n *     POSSIBILITY OF SUCH LOSS OR DAMAGES.\u003c/strong\u003e\u003c/li\u003e\n * \u003col\u003e\u003c/td\u003e\u003c/tr\u003e\n * \u003c/table\u003e\n\n * @author Argonne National Laboratory. MINPACK project. March 1980 (original fortran minpack tests)\n * @author Burton S. Garbow (original fortran minpack tests)\n * @author Kenneth E. Hillstrom (original fortran minpack tests)\n * @author Jorge J. More (original fortran minpack tests)\n * @author Luc Maisonobe (non-minpack tests and minpack tests Java translation)\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackTest(java.lang.String)",
      "begin_line": 97,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 98,col 5)-(line 98,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.testMinpackLinearFullRank()",
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
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.testMinpackLinearRank1()",
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
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.testMinpackLinearRank1ZeroColsAndRows()",
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
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.testMinpackRosenbrok()",
      "begin_line": 120,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 121,col 5)-(line 122,col 64)",
        "(line 123,col 5)-(line 124,col 69)",
        "(line 125,col 5)-(line 126,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.testMinpackHelicalValley()",
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
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.testMinpackPowellSingular()",
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
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.testMinpackFreudensteinRoth()",
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
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.testMinpackBard()",
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
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.testMinpackKowalikOsborne()",
      "begin_line": 189,
      "end_line": 217,
      "comment": "",
      "child_ranges": [
        "(line 190,col 5)-(line 198,col 54)",
        "(line 199,col 5)-(line 207,col 54)",
        "(line 208,col 5)-(line 216,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.testMinpackMeyer()",
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
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.testMinpackWatson()",
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
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.testMinpackBox3Dimensional()",
      "begin_line": 321,
      "end_line": 324,
      "comment": "",
      "child_ranges": [
        "(line 322,col 5)-(line 323,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.testMinpackJennrichSampson()",
      "begin_line": 326,
      "end_line": 332,
      "comment": "",
      "child_ranges": [
        "(line 327,col 5)-(line 331,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.testMinpackBrownDennis()",
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
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.testMinpackChebyquad()",
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
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.testMinpackBrownAlmostLinear()",
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
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.testMinpackOsborne1()",
      "begin_line": 464,
      "end_line": 472,
      "comment": "",
      "child_ranges": [
        "(line 465,col 7)-(line 471,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.testMinpackOsborne2()",
      "begin_line": 474,
      "end_line": 489,
      "comment": "",
      "child_ranges": [
        "(line 476,col 5)-(line 488,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.minpackTest(org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction, boolean)",
      "begin_line": 491,
      "end_line": 511,
      "comment": "",
      "child_ranges": [
        "(line 492,col 7)-(line 492,col 80)",
        "(line 493,col 7)-(line 493,col 62)",
        "(line 494,col 7)-(line 494,col 71)",
        "(line 495,col 7)-(line 495,col 70)",
        "(line 496,col 7)-(line 496,col 53)",
        "(line 498,col 7)-(line 510,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MinpackFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction"
      ],
      "begin_line": 513,
      "end_line": 621,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 516,
      "end_line": 516,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 517,
      "end_line": 517,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "m"
      ],
      "begin_line": 518,
      "end_line": 518,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "startParams"
      ],
      "begin_line": 519,
      "end_line": 519,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "theoreticalMinCost"
      ],
      "begin_line": 520,
      "end_line": 520,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "theoreticalMinParams"
      ],
      "begin_line": 521,
      "end_line": 521,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "costAccuracy"
      ],
      "begin_line": 522,
      "end_line": 522,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "paramsAccuracy"
      ],
      "begin_line": 523,
      "end_line": 523,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.MinpackFunction(int, double[], double, double[])",
      "begin_line": 525,
      "end_line": 534,
      "comment": "",
      "child_ranges": [
        "(line 527,col 11)-(line 527,col 21)",
        "(line 528,col 11)-(line 528,col 38)",
        "(line 529,col 11)-(line 529,col 58)",
        "(line 530,col 11)-(line 530,col 57)",
        "(line 531,col 11)-(line 531,col 59)",
        "(line 532,col 11)-(line 532,col 45)",
        "(line 533,col 11)-(line 533,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.buildArray(int, double)",
      "begin_line": 536,
      "end_line": 540,
      "comment": "",
      "child_ranges": [
        "(line 537,col 11)-(line 537,col 41)",
        "(line 538,col 11)-(line 538,col 32)",
        "(line 539,col 11)-(line 539,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.getTarget()",
      "begin_line": 542,
      "end_line": 544,
      "comment": "",
      "child_ranges": [
        "(line 543,col 11)-(line 543,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.getWeight()",
      "begin_line": 546,
      "end_line": 548,
      "comment": "",
      "child_ranges": [
        "(line 547,col 11)-(line 547,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.getStartPoint()",
      "begin_line": 550,
      "end_line": 552,
      "comment": "",
      "child_ranges": [
        "(line 551,col 11)-(line 551,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.setCostAccuracy(double)",
      "begin_line": 554,
      "end_line": 556,
      "comment": "",
      "child_ranges": [
        "(line 555,col 11)-(line 555,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.setParamsAccuracy(double)",
      "begin_line": 558,
      "end_line": 560,
      "comment": "",
      "child_ranges": [
        "(line 559,col 11)-(line 559,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.getN()",
      "begin_line": 562,
      "end_line": 564,
      "comment": "",
      "child_ranges": [
        "(line 563,col 11)-(line 563,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.checkTheoreticalMinCost(double)",
      "begin_line": 566,
      "end_line": 569,
      "comment": "",
      "child_ranges": [
        "(line 567,col 11)-(line 567,col 71)",
        "(line 568,col 11)-(line 568,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.checkTheoreticalMinParams(org.apache.commons.math.optimization.VectorialPointValuePair)",
      "begin_line": 571,
      "end_line": 583,
      "comment": "",
      "child_ranges": [
        "(line 572,col 11)-(line 572,col 50)",
        "(line 573,col 11)-(line 581,col 11)",
        "(line 582,col 11)-(line 582,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.partialDerivative(int)",
      "begin_line": 585,
      "end_line": 597,
      "comment": "",
      "child_ranges": [
        "(line 586,col 11)-(line 596,col 12)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 587,
      "end_line": 587,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.Anonymous-8c5dd9ac-fd5e-401c-9ee8-f3a12cdd0289.value(double[])",
      "begin_line": 588,
      "end_line": 595,
      "comment": "",
      "child_ranges": [
        "(line 589,col 19)-(line 589,col 49)",
        "(line 590,col 19)-(line 590,col 58)",
        "(line 591,col 19)-(line 593,col 19)",
        "(line 594,col 19)-(line 594,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.gradient(int)",
      "begin_line": 599,
      "end_line": 606,
      "comment": "",
      "child_ranges": [
        "(line 600,col 11)-(line 605,col 12)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 601,
      "end_line": 601,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.Anonymous-8e8aadc6-fa4e-4454-908c-4c37198b0892.value(double[])",
      "begin_line": 602,
      "end_line": 604,
      "comment": "",
      "child_ranges": [
        "(line 603,col 19)-(line 603,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.jacobian()",
      "begin_line": 608,
      "end_line": 615,
      "comment": "",
      "child_ranges": [
        "(line 609,col 11)-(line 614,col 12)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 610,
      "end_line": 610,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.Anonymous-aa3c351a-1c9e-45d5-a581-0e278c596312.value(double[])",
      "begin_line": 611,
      "end_line": 613,
      "comment": "",
      "child_ranges": [
        "(line 612,col 19)-(line 612,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.jacobian(double[])",
      "begin_line": 617,
      "end_line": 617,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.value(double[])",
      "begin_line": 619,
      "end_line": 619,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "LinearFullRankFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 623,
      "end_line": 662,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 625,
      "end_line": 625,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.LinearFullRankFunction.LinearFullRankFunction(int, int, double, double, double)",
      "begin_line": 627,
      "end_line": 632,
      "comment": "",
      "child_ranges": [
        "(line 630,col 7)-(line 631,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.LinearFullRankFunction.jacobian(double[])",
      "begin_line": 634,
      "end_line": 645,
      "comment": "",
      "child_ranges": [
        "(line 636,col 7)-(line 636,col 25)",
        "(line 637,col 7)-(line 637,col 44)",
        "(line 638,col 7)-(line 643,col 7)",
        "(line 644,col 7)-(line 644,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.LinearFullRankFunction.value(double[])",
      "begin_line": 647,
      "end_line": 660,
      "comment": "",
      "child_ranges": [
        "(line 649,col 7)-(line 649,col 21)",
        "(line 650,col 7)-(line 652,col 7)",
        "(line 653,col 7)-(line 653,col 34)",
        "(line 654,col 7)-(line 654,col 33)",
        "(line 655,col 7)-(line 657,col 7)",
        "(line 658,col 7)-(line 658,col 31)",
        "(line 659,col 7)-(line 659,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LinearRank1Function",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 664,
      "end_line": 699,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 666,
      "end_line": 666,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.LinearRank1Function.LinearRank1Function(int, int, double, double, double)",
      "begin_line": 668,
      "end_line": 672,
      "comment": "",
      "child_ranges": [
        "(line 671,col 7)-(line 671,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.LinearRank1Function.jacobian(double[])",
      "begin_line": 674,
      "end_line": 684,
      "comment": "",
      "child_ranges": [
        "(line 676,col 7)-(line 676,col 44)",
        "(line 677,col 7)-(line 682,col 7)",
        "(line 683,col 7)-(line 683,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.LinearRank1Function.value(double[])",
      "begin_line": 686,
      "end_line": 697,
      "comment": "",
      "child_ranges": [
        "(line 688,col 7)-(line 688,col 33)",
        "(line 689,col 7)-(line 689,col 21)",
        "(line 690,col 7)-(line 692,col 7)",
        "(line 693,col 7)-(line 695,col 7)",
        "(line 696,col 7)-(line 696,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LinearRank1ZeroColsAndRowsFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 701,
      "end_line": 745,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 703,
      "end_line": 703,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.LinearRank1ZeroColsAndRowsFunction.LinearRank1ZeroColsAndRowsFunction(int, int, double)",
      "begin_line": 705,
      "end_line": 709,
      "comment": "",
      "child_ranges": [
        "(line 706,col 7)-(line 708,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.LinearRank1ZeroColsAndRowsFunction.jacobian(double[])",
      "begin_line": 711,
      "end_line": 729,
      "comment": "",
      "child_ranges": [
        "(line 713,col 7)-(line 713,col 44)",
        "(line 714,col 7)-(line 727,col 7)",
        "(line 728,col 7)-(line 728,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.LinearRank1ZeroColsAndRowsFunction.value(double[])",
      "begin_line": 731,
      "end_line": 743,
      "comment": "",
      "child_ranges": [
        "(line 733,col 7)-(line 733,col 33)",
        "(line 734,col 7)-(line 734,col 21)",
        "(line 735,col 7)-(line 737,col 7)",
        "(line 738,col 7)-(line 740,col 7)",
        "(line 741,col 7)-(line 741,col 20)",
        "(line 742,col 7)-(line 742,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RosenbrockFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 747,
      "end_line": 768,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 749,
      "end_line": 749,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.RosenbrockFunction.RosenbrockFunction(double[], double)",
      "begin_line": 751,
      "end_line": 753,
      "comment": "",
      "child_ranges": [
        "(line 752,col 7)-(line 752,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.RosenbrockFunction.jacobian(double[])",
      "begin_line": 755,
      "end_line": 759,
      "comment": "",
      "child_ranges": [
        "(line 757,col 7)-(line 757,col 31)",
        "(line 758,col 7)-(line 758,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.RosenbrockFunction.value(double[])",
      "begin_line": 761,
      "end_line": 766,
      "comment": "",
      "child_ranges": [
        "(line 763,col 7)-(line 763,col 31)",
        "(line 764,col 7)-(line 764,col 31)",
        "(line 765,col 7)-(line 765,col 58)"
      ]
    },
    {
      "type": "class_interface",
      "name": "HelicalValleyFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 770,
      "end_line": 817,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 772,
      "end_line": 772,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.HelicalValleyFunction.HelicalValleyFunction(double[], double)",
      "begin_line": 774,
      "end_line": 777,
      "comment": "",
      "child_ranges": [
        "(line 776,col 7)-(line 776,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.HelicalValleyFunction.jacobian(double[])",
      "begin_line": 779,
      "end_line": 791,
      "comment": "",
      "child_ranges": [
        "(line 781,col 7)-(line 781,col 31)",
        "(line 782,col 7)-(line 782,col 31)",
        "(line 783,col 7)-(line 783,col 43)",
        "(line 784,col 7)-(line 784,col 38)",
        "(line 785,col 7)-(line 785,col 41)",
        "(line 786,col 7)-(line 790,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.HelicalValleyFunction.value(double[])",
      "begin_line": 793,
      "end_line": 813,
      "comment": "",
      "child_ranges": [
        "(line 795,col 7)-(line 795,col 31)",
        "(line 796,col 7)-(line 796,col 31)",
        "(line 797,col 7)-(line 797,col 31)",
        "(line 798,col 7)-(line 798,col 18)",
        "(line 799,col 7)-(line 806,col 7)",
        "(line 807,col 7)-(line 807,col 49)",
        "(line 808,col 7)-(line 812,col 8)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "twoPi"
      ],
      "begin_line": 815,
      "end_line": 815,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "PowellSingularFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 819,
      "end_line": 859,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 821,
      "end_line": 821,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.PowellSingularFunction.PowellSingularFunction(double[], double)",
      "begin_line": 823,
      "end_line": 826,
      "comment": "",
      "child_ranges": [
        "(line 825,col 7)-(line 825,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.PowellSingularFunction.jacobian(double[])",
      "begin_line": 828,
      "end_line": 840,
      "comment": "",
      "child_ranges": [
        "(line 830,col 7)-(line 830,col 31)",
        "(line 831,col 7)-(line 831,col 31)",
        "(line 832,col 7)-(line 832,col 31)",
        "(line 833,col 7)-(line 833,col 31)",
        "(line 834,col 7)-(line 839,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.PowellSingularFunction.value(double[])",
      "begin_line": 842,
      "end_line": 854,
      "comment": "",
      "child_ranges": [
        "(line 844,col 7)-(line 844,col 31)",
        "(line 845,col 7)-(line 845,col 31)",
        "(line 846,col 7)-(line 846,col 31)",
        "(line 847,col 7)-(line 847,col 31)",
        "(line 848,col 7)-(line 853,col 8)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "sqrt5"
      ],
      "begin_line": 856,
      "end_line": 856,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sqrt10"
      ],
      "begin_line": 857,
      "end_line": 857,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "FreudensteinRothFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 861,
      "end_line": 892,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 863,
      "end_line": 863,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.FreudensteinRothFunction.FreudensteinRothFunction(double[], double, double, double[])",
      "begin_line": 865,
      "end_line": 871,
      "comment": "",
      "child_ranges": [
        "(line 869,col 7)-(line 870,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.FreudensteinRothFunction.jacobian(double[])",
      "begin_line": 873,
      "end_line": 880,
      "comment": "",
      "child_ranges": [
        "(line 875,col 7)-(line 875,col 31)",
        "(line 876,col 7)-(line 879,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.FreudensteinRothFunction.value(double[])",
      "begin_line": 882,
      "end_line": 890,
      "comment": "",
      "child_ranges": [
        "(line 884,col 7)-(line 884,col 31)",
        "(line 885,col 7)-(line 885,col 31)",
        "(line 886,col 7)-(line 889,col 8)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BardFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 894,
      "end_line": 943,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 896,
      "end_line": 896,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.BardFunction.BardFunction(double, double, double, double[])",
      "begin_line": 898,
      "end_line": 904,
      "comment": "",
      "child_ranges": [
        "(line 902,col 7)-(line 903,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.BardFunction.jacobian(double[])",
      "begin_line": 906,
      "end_line": 920,
      "comment": "",
      "child_ranges": [
        "(line 908,col 7)-(line 908,col 33)",
        "(line 909,col 7)-(line 909,col 33)",
        "(line 910,col 7)-(line 910,col 44)",
        "(line 911,col 7)-(line 918,col 7)",
        "(line 919,col 7)-(line 919,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.BardFunction.value(double[])",
      "begin_line": 922,
      "end_line": 935,
      "comment": "",
      "child_ranges": [
        "(line 924,col 7)-(line 924,col 33)",
        "(line 925,col 7)-(line 925,col 33)",
        "(line 926,col 7)-(line 926,col 33)",
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
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 945,
      "end_line": 1001,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 947,
      "end_line": 947,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.KowalikOsborneFunction.KowalikOsborneFunction(double[], double, double, double[])",
      "begin_line": 949,
      "end_line": 959,
      "comment": "",
      "child_ranges": [
        "(line 953,col 7)-(line 954,col 34)",
        "(line 955,col 7)-(line 958,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.KowalikOsborneFunction.jacobian(double[])",
      "begin_line": 961,
      "end_line": 977,
      "comment": "",
      "child_ranges": [
        "(line 963,col 7)-(line 963,col 33)",
        "(line 964,col 7)-(line 964,col 33)",
        "(line 965,col 7)-(line 965,col 33)",
        "(line 966,col 7)-(line 966,col 33)",
        "(line 967,col 7)-(line 967,col 44)",
        "(line 968,col 7)-(line 975,col 7)",
        "(line 976,col 7)-(line 976,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.KowalikOsborneFunction.value(double[])",
      "begin_line": 979,
      "end_line": 990,
      "comment": "",
      "child_ranges": [
        "(line 981,col 7)-(line 981,col 31)",
        "(line 982,col 7)-(line 982,col 31)",
        "(line 983,col 7)-(line 983,col 31)",
        "(line 984,col 7)-(line 984,col 31)",
        "(line 985,col 7)-(line 985,col 33)",
        "(line 986,col 7)-(line 988,col 7)",
        "(line 989,col 7)-(line 989,col 15)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "v"
      ],
      "begin_line": 992,
      "end_line": 994,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 996,
      "end_line": 999,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "MeyerFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1003,
      "end_line": 1054,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1005,
      "end_line": 1005,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MeyerFunction.MeyerFunction(double[], double, double, double[])",
      "begin_line": 1007,
      "end_line": 1017,
      "comment": "",
      "child_ranges": [
        "(line 1011,col 7)-(line 1012,col 34)",
        "(line 1013,col 7)-(line 1016,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MeyerFunction.jacobian(double[])",
      "begin_line": 1019,
      "end_line": 1033,
      "comment": "",
      "child_ranges": [
        "(line 1021,col 7)-(line 1021,col 33)",
        "(line 1022,col 7)-(line 1022,col 33)",
        "(line 1023,col 7)-(line 1023,col 33)",
        "(line 1024,col 7)-(line 1024,col 44)",
        "(line 1025,col 7)-(line 1031,col 7)",
        "(line 1032,col 7)-(line 1032,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MeyerFunction.value(double[])",
      "begin_line": 1035,
      "end_line": 1045,
      "comment": "",
      "child_ranges": [
        "(line 1037,col 7)-(line 1037,col 31)",
        "(line 1038,col 7)-(line 1038,col 31)",
        "(line 1039,col 7)-(line 1039,col 31)",
        "(line 1040,col 7)-(line 1040,col 33)",
        "(line 1041,col 7)-(line 1043,col 7)",
        "(line 1044,col 6)-(line 1044,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 1047,
      "end_line": 1052,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "WatsonFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1056,
      "end_line": 1130,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1058,
      "end_line": 1058,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.WatsonFunction.WatsonFunction(int, double, double, double, double[])",
      "begin_line": 1060,
      "end_line": 1066,
      "comment": "",
      "child_ranges": [
        "(line 1064,col 7)-(line 1065,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.WatsonFunction.jacobian(double[])",
      "begin_line": 1068,
      "end_line": 1099,
      "comment": "",
      "child_ranges": [
        "(line 1071,col 7)-(line 1071,col 44)",
        "(line 1073,col 7)-(line 1088,col 7)",
        "(line 1090,col 7)-(line 1090,col 41)",
        "(line 1091,col 7)-(line 1091,col 29)",
        "(line 1093,col 7)-(line 1093,col 40)",
        "(line 1094,col 7)-(line 1094,col 44)",
        "(line 1095,col 7)-(line 1095,col 28)",
        "(line 1097,col 7)-(line 1097,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.WatsonFunction.value(double[])",
      "begin_line": 1101,
      "end_line": 1128,
      "comment": "",
      "child_ranges": [
        "(line 1103,col 6)-(line 1103,col 32)",
        "(line 1104,col 6)-(line 1119,col 6)",
        "(line 1121,col 6)-(line 1121,col 30)",
        "(line 1122,col 6)-(line 1122,col 30)",
        "(line 1123,col 6)-(line 1123,col 19)",
        "(line 1124,col 6)-(line 1124,col 33)",
        "(line 1126,col 6)-(line 1126,col 14)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Box3DimensionalFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1132,
      "end_line": 1172,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1134,
      "end_line": 1134,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.Box3DimensionalFunction.Box3DimensionalFunction(int, double[], double)",
      "begin_line": 1136,
      "end_line": 1140,
      "comment": "",
      "child_ranges": [
        "(line 1138,col 7)-(line 1139,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.Box3DimensionalFunction.jacobian(double[])",
      "begin_line": 1142,
      "end_line": 1156,
      "comment": "",
      "child_ranges": [
        "(line 1144,col 7)-(line 1144,col 33)",
        "(line 1145,col 7)-(line 1145,col 33)",
        "(line 1146,col 7)-(line 1146,col 44)",
        "(line 1147,col 7)-(line 1154,col 7)",
        "(line 1155,col 7)-(line 1155,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.Box3DimensionalFunction.value(double[])",
      "begin_line": 1158,
      "end_line": 1170,
      "comment": "",
      "child_ranges": [
        "(line 1160,col 7)-(line 1160,col 31)",
        "(line 1161,col 7)-(line 1161,col 31)",
        "(line 1162,col 7)-(line 1162,col 31)",
        "(line 1163,col 7)-(line 1163,col 33)",
        "(line 1164,col 7)-(line 1168,col 7)",
        "(line 1169,col 7)-(line 1169,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "JennrichSampsonFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1174,
      "end_line": 1210,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1176,
      "end_line": 1176,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.JennrichSampsonFunction.JennrichSampsonFunction(int, double[], double, double, double[])",
      "begin_line": 1178,
      "end_line": 1184,
      "comment": "",
      "child_ranges": [
        "(line 1182,col 7)-(line 1183,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.JennrichSampsonFunction.jacobian(double[])",
      "begin_line": 1186,
      "end_line": 1196,
      "comment": "",
      "child_ranges": [
        "(line 1188,col 7)-(line 1188,col 33)",
        "(line 1189,col 7)-(line 1189,col 33)",
        "(line 1190,col 7)-(line 1190,col 44)",
        "(line 1191,col 7)-(line 1194,col 7)",
        "(line 1195,col 7)-(line 1195,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.JennrichSampsonFunction.value(double[])",
      "begin_line": 1198,
      "end_line": 1208,
      "comment": "",
      "child_ranges": [
        "(line 1200,col 7)-(line 1200,col 31)",
        "(line 1201,col 7)-(line 1201,col 31)",
        "(line 1202,col 7)-(line 1202,col 33)",
        "(line 1203,col 7)-(line 1206,col 7)",
        "(line 1207,col 7)-(line 1207,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BrownDennisFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1212,
      "end_line": 1259,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1214,
      "end_line": 1214,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.BrownDennisFunction.BrownDennisFunction(int, double[], double, double, double[])",
      "begin_line": 1216,
      "end_line": 1222,
      "comment": "",
      "child_ranges": [
        "(line 1220,col 7)-(line 1221,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.BrownDennisFunction.jacobian(double[])",
      "begin_line": 1224,
      "end_line": 1241,
      "comment": "",
      "child_ranges": [
        "(line 1226,col 7)-(line 1226,col 33)",
        "(line 1227,col 7)-(line 1227,col 33)",
        "(line 1228,col 7)-(line 1228,col 33)",
        "(line 1229,col 7)-(line 1229,col 33)",
        "(line 1230,col 7)-(line 1230,col 44)",
        "(line 1231,col 7)-(line 1239,col 7)",
        "(line 1240,col 7)-(line 1240,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.BrownDennisFunction.value(double[])",
      "begin_line": 1243,
      "end_line": 1257,
      "comment": "",
      "child_ranges": [
        "(line 1245,col 7)-(line 1245,col 31)",
        "(line 1246,col 7)-(line 1246,col 31)",
        "(line 1247,col 7)-(line 1247,col 31)",
        "(line 1248,col 7)-(line 1248,col 31)",
        "(line 1249,col 7)-(line 1249,col 33)",
        "(line 1250,col 7)-(line 1255,col 7)",
        "(line 1256,col 7)-(line 1256,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ChebyquadFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1261,
      "end_line": 1343,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1263,
      "end_line": 1263,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.ChebyquadFunction.buildChebyquadArray(int, double)",
      "begin_line": 1265,
      "end_line": 1272,
      "comment": "",
      "child_ranges": [
        "(line 1266,col 7)-(line 1266,col 37)",
        "(line 1267,col 7)-(line 1267,col 36)",
        "(line 1268,col 7)-(line 1270,col 7)",
        "(line 1271,col 7)-(line 1271,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.ChebyquadFunction.ChebyquadFunction(int, int, double, double, double, double[])",
      "begin_line": 1274,
      "end_line": 1280,
      "comment": "",
      "child_ranges": [
        "(line 1278,col 7)-(line 1279,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.ChebyquadFunction.jacobian(double[])",
      "begin_line": 1282,
      "end_line": 1310,
      "comment": "",
      "child_ranges": [
        "(line 1285,col 7)-(line 1285,col 44)",
        "(line 1286,col 7)-(line 1288,col 7)",
        "(line 1290,col 7)-(line 1290,col 26)",
        "(line 1291,col 7)-(line 1306,col 7)",
        "(line 1308,col 7)-(line 1308,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.ChebyquadFunction.value(double[])",
      "begin_line": 1312,
      "end_line": 1341,
      "comment": "",
      "child_ranges": [
        "(line 1315,col 7)-(line 1315,col 33)",
        "(line 1317,col 7)-(line 1327,col 7)",
        "(line 1329,col 7)-(line 1329,col 26)",
        "(line 1330,col 7)-(line 1330,col 26)",
        "(line 1331,col 7)-(line 1337,col 7)",
        "(line 1339,col 7)-(line 1339,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BrownAlmostLinearFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1345,
      "end_line": 1407,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1347,
      "end_line": 1347,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.BrownAlmostLinearFunction.BrownAlmostLinearFunction(int, double, double, double, double[])",
      "begin_line": 1349,
      "end_line": 1355,
      "comment": "",
      "child_ranges": [
        "(line 1353,col 7)-(line 1354,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.BrownAlmostLinearFunction.jacobian(double[])",
      "begin_line": 1357,
      "end_line": 1389,
      "comment": "",
      "child_ranges": [
        "(line 1359,col 7)-(line 1359,col 44)",
        "(line 1360,col 7)-(line 1362,col 7)",
        "(line 1364,col 7)-(line 1364,col 22)",
        "(line 1365,col 7)-(line 1371,col 7)",
        "(line 1373,col 7)-(line 1385,col 7)",
        "(line 1387,col 7)-(line 1387,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.BrownAlmostLinearFunction.value(double[])",
      "begin_line": 1391,
      "end_line": 1405,
      "comment": "",
      "child_ranges": [
        "(line 1393,col 7)-(line 1393,col 33)",
        "(line 1394,col 7)-(line 1394,col 29)",
        "(line 1395,col 7)-(line 1395,col 22)",
        "(line 1396,col 7)-(line 1399,col 7)",
        "(line 1400,col 7)-(line 1402,col 7)",
        "(line 1403,col 7)-(line 1403,col 26)",
        "(line 1404,col 7)-(line 1404,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Osborne1Function",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1409,
      "end_line": 1462,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1411,
      "end_line": 1411,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.Osborne1Function.Osborne1Function(double[], double, double, double[])",
      "begin_line": 1413,
      "end_line": 1419,
      "comment": "",
      "child_ranges": [
        "(line 1417,col 7)-(line 1418,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.Osborne1Function.jacobian(double[])",
      "begin_line": 1421,
      "end_line": 1437,
      "comment": "",
      "child_ranges": [
        "(line 1423,col 7)-(line 1423,col 33)",
        "(line 1424,col 7)-(line 1424,col 33)",
        "(line 1425,col 7)-(line 1425,col 33)",
        "(line 1426,col 7)-(line 1426,col 33)",
        "(line 1427,col 7)-(line 1427,col 44)",
        "(line 1428,col 7)-(line 1435,col 7)",
        "(line 1436,col 7)-(line 1436,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.Osborne1Function.value(double[])",
      "begin_line": 1439,
      "end_line": 1454,
      "comment": "",
      "child_ranges": [
        "(line 1441,col 7)-(line 1441,col 31)",
        "(line 1442,col 7)-(line 1442,col 31)",
        "(line 1443,col 7)-(line 1443,col 31)",
        "(line 1444,col 7)-(line 1444,col 31)",
        "(line 1445,col 7)-(line 1445,col 31)",
        "(line 1446,col 7)-(line 1446,col 33)",
        "(line 1447,col 7)-(line 1452,col 7)",
        "(line 1453,col 7)-(line 1453,col 15)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 1456,
      "end_line": 1460,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Osborne2Function",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1464,
      "end_line": 1554,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1466,
      "end_line": 1466,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.Osborne2Function.Osborne2Function(double[], double, double, double[])",
      "begin_line": 1468,
      "end_line": 1474,
      "comment": "",
      "child_ranges": [
        "(line 1472,col 7)-(line 1473,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.Osborne2Function.jacobian(double[])",
      "begin_line": 1476,
      "end_line": 1511,
      "comment": "",
      "child_ranges": [
        "(line 1478,col 7)-(line 1478,col 34)",
        "(line 1479,col 7)-(line 1479,col 34)",
        "(line 1480,col 7)-(line 1480,col 34)",
        "(line 1481,col 7)-(line 1481,col 34)",
        "(line 1482,col 7)-(line 1482,col 34)",
        "(line 1483,col 7)-(line 1483,col 34)",
        "(line 1484,col 7)-(line 1484,col 34)",
        "(line 1485,col 7)-(line 1485,col 34)",
        "(line 1486,col 7)-(line 1486,col 34)",
        "(line 1487,col 7)-(line 1487,col 34)",
        "(line 1488,col 7)-(line 1488,col 35)",
        "(line 1489,col 7)-(line 1489,col 44)",
        "(line 1490,col 7)-(line 1509,col 7)",
        "(line 1510,col 7)-(line 1510,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.Osborne2Function.value(double[])",
      "begin_line": 1513,
      "end_line": 1536,
      "comment": "",
      "child_ranges": [
        "(line 1515,col 7)-(line 1515,col 32)",
        "(line 1516,col 7)-(line 1516,col 32)",
        "(line 1517,col 7)-(line 1517,col 32)",
        "(line 1518,col 7)-(line 1518,col 32)",
        "(line 1519,col 7)-(line 1519,col 32)",
        "(line 1520,col 7)-(line 1520,col 32)",
        "(line 1521,col 7)-(line 1521,col 32)",
        "(line 1522,col 7)-(line 1522,col 32)",
        "(line 1523,col 7)-(line 1523,col 32)",
        "(line 1524,col 7)-(line 1524,col 32)",
        "(line 1525,col 7)-(line 1525,col 33)",
        "(line 1526,col 7)-(line 1526,col 33)",
        "(line 1527,col 7)-(line 1534,col 7)",
        "(line 1535,col 7)-(line 1535,col 15)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 1538,
      "end_line": 1552,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.suite()",
      "begin_line": 1556,
      "end_line": 1558,
      "comment": "",
      "child_ranges": [
        "(line 1557,col 5)-(line 1557,col 44)"
      ]
    }
  ]
}