{
  "filepath": "/tmp/Math-76b/src/test/java/org/apache/commons/math/optimization/general/MinpackTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MinpackTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 95,
      "end_line": 1538,
      "comment": "\n * \u003cp\u003eSome of the unit tests are re-implementations of the MINPACK \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file17\"\u003efile17\u003c/a\u003e and \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file22\"\u003efile22\u003c/a\u003e test files.\n * The redistribution policy for MINPACK is available \u003ca\n * href\u003d\"http://www.netlib.org/minpack/disclaimer\"\u003ehere\u003c/a\u003e, for\n * convenience, it is reproduced below.\u003c/p\u003e\n\n * \u003ctable border\u003d\"0\" width\u003d\"80%\" cellpadding\u003d\"10\" align\u003d\"center\" bgcolor\u003d\"#E0E0E0\"\u003e\n * \u003ctr\u003e\u003ctd\u003e\n *    Minpack Copyright Notice (1999) University of Chicago.\n *    All rights reserved\n * \u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003e\n * Redistribution and use in source and binary forms, with or without\n * modification, are permitted provided that the following conditions\n * are met:\n * \u003col\u003e\n *  \u003cli\u003eRedistributions of source code must retain the above copyright\n *      notice, this list of conditions and the following disclaimer.\u003c/li\u003e\n * \u003cli\u003eRedistributions in binary form must reproduce the above\n *     copyright notice, this list of conditions and the following\n *     disclaimer in the documentation and/or other materials provided\n *     with the distribution.\u003c/li\u003e\n * \u003cli\u003eThe end-user documentation included with the redistribution, if any,\n *     must include the following acknowledgment:\n *     \u003ccode\u003eThis product includes software developed by the University of\n *           Chicago, as Operator of Argonne National Laboratory.\u003c/code\u003e\n *     Alternately, this acknowledgment may appear in the software itself,\n *     if and wherever such third-party acknowledgments normally appear.\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eWARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED \"AS IS\"\n *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE\n *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND\n *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR\n *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES\n *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE\n *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY\n *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR\n *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF\n *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)\n *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION\n *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL\n *     BE CORRECTED.\u003c/strong\u003e\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eLIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT\n *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF\n *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,\n *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF\n *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF\n *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER\n *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT\n *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,\n *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE\n *     POSSIBILITY OF SUCH LOSS OR DAMAGES.\u003c/strong\u003e\u003c/li\u003e\n * \u003col\u003e\u003c/td\u003e\u003c/tr\u003e\n * \u003c/table\u003e\n\n * @author Argonne National Laboratory. MINPACK project. March 1980 (original fortran minpack tests)\n * @author Burton S. Garbow (original fortran minpack tests)\n * @author Kenneth E. Hillstrom (original fortran minpack tests)\n * @author Jorge J. More (original fortran minpack tests)\n * @author Luc Maisonobe (non-minpack tests and minpack tests Java translation)\n "
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
        "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction",
        "java.io.Serializable"
      ],
      "begin_line": 513,
      "end_line": 598,
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
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.jacobian()",
      "begin_line": 585,
      "end_line": 592,
      "comment": "",
      "child_ranges": [
        "(line 586,col 11)-(line 591,col 12)"
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
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.Anonymous-565d5a0d-4e52-4c6d-89c9-957192a9d132.value(double[])",
      "begin_line": 588,
      "end_line": 590,
      "comment": "",
      "child_ranges": [
        "(line 589,col 19)-(line 589,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.jacobian(double[])",
      "begin_line": 594,
      "end_line": 594,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.value(double[])",
      "begin_line": 596,
      "end_line": 596,
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
      "begin_line": 600,
      "end_line": 639,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 602,
      "end_line": 602,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.LinearFullRankFunction.LinearFullRankFunction(int, int, double, double, double)",
      "begin_line": 604,
      "end_line": 609,
      "comment": "",
      "child_ranges": [
        "(line 607,col 7)-(line 608,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.LinearFullRankFunction.jacobian(double[])",
      "begin_line": 611,
      "end_line": 622,
      "comment": "",
      "child_ranges": [
        "(line 613,col 7)-(line 613,col 25)",
        "(line 614,col 7)-(line 614,col 44)",
        "(line 615,col 7)-(line 620,col 7)",
        "(line 621,col 7)-(line 621,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.LinearFullRankFunction.value(double[])",
      "begin_line": 624,
      "end_line": 637,
      "comment": "",
      "child_ranges": [
        "(line 626,col 7)-(line 626,col 21)",
        "(line 627,col 7)-(line 629,col 7)",
        "(line 630,col 7)-(line 630,col 34)",
        "(line 631,col 7)-(line 631,col 33)",
        "(line 632,col 7)-(line 634,col 7)",
        "(line 635,col 7)-(line 635,col 31)",
        "(line 636,col 7)-(line 636,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LinearRank1Function",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 641,
      "end_line": 676,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 643,
      "end_line": 643,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.LinearRank1Function.LinearRank1Function(int, int, double, double, double)",
      "begin_line": 645,
      "end_line": 649,
      "comment": "",
      "child_ranges": [
        "(line 648,col 7)-(line 648,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.LinearRank1Function.jacobian(double[])",
      "begin_line": 651,
      "end_line": 661,
      "comment": "",
      "child_ranges": [
        "(line 653,col 7)-(line 653,col 44)",
        "(line 654,col 7)-(line 659,col 7)",
        "(line 660,col 7)-(line 660,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.LinearRank1Function.value(double[])",
      "begin_line": 663,
      "end_line": 674,
      "comment": "",
      "child_ranges": [
        "(line 665,col 7)-(line 665,col 33)",
        "(line 666,col 7)-(line 666,col 21)",
        "(line 667,col 7)-(line 669,col 7)",
        "(line 670,col 7)-(line 672,col 7)",
        "(line 673,col 7)-(line 673,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LinearRank1ZeroColsAndRowsFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 678,
      "end_line": 722,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 680,
      "end_line": 680,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.LinearRank1ZeroColsAndRowsFunction.LinearRank1ZeroColsAndRowsFunction(int, int, double)",
      "begin_line": 682,
      "end_line": 686,
      "comment": "",
      "child_ranges": [
        "(line 683,col 7)-(line 685,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.LinearRank1ZeroColsAndRowsFunction.jacobian(double[])",
      "begin_line": 688,
      "end_line": 706,
      "comment": "",
      "child_ranges": [
        "(line 690,col 7)-(line 690,col 44)",
        "(line 691,col 7)-(line 704,col 7)",
        "(line 705,col 7)-(line 705,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.LinearRank1ZeroColsAndRowsFunction.value(double[])",
      "begin_line": 708,
      "end_line": 720,
      "comment": "",
      "child_ranges": [
        "(line 710,col 7)-(line 710,col 33)",
        "(line 711,col 7)-(line 711,col 21)",
        "(line 712,col 7)-(line 714,col 7)",
        "(line 715,col 7)-(line 717,col 7)",
        "(line 718,col 7)-(line 718,col 20)",
        "(line 719,col 7)-(line 719,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RosenbrockFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 724,
      "end_line": 745,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 726,
      "end_line": 726,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.RosenbrockFunction.RosenbrockFunction(double[], double)",
      "begin_line": 728,
      "end_line": 730,
      "comment": "",
      "child_ranges": [
        "(line 729,col 7)-(line 729,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.RosenbrockFunction.jacobian(double[])",
      "begin_line": 732,
      "end_line": 736,
      "comment": "",
      "child_ranges": [
        "(line 734,col 7)-(line 734,col 31)",
        "(line 735,col 7)-(line 735,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.RosenbrockFunction.value(double[])",
      "begin_line": 738,
      "end_line": 743,
      "comment": "",
      "child_ranges": [
        "(line 740,col 7)-(line 740,col 31)",
        "(line 741,col 7)-(line 741,col 31)",
        "(line 742,col 7)-(line 742,col 58)"
      ]
    },
    {
      "type": "class_interface",
      "name": "HelicalValleyFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 747,
      "end_line": 794,
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
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.HelicalValleyFunction.HelicalValleyFunction(double[], double)",
      "begin_line": 751,
      "end_line": 754,
      "comment": "",
      "child_ranges": [
        "(line 753,col 7)-(line 753,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.HelicalValleyFunction.jacobian(double[])",
      "begin_line": 756,
      "end_line": 768,
      "comment": "",
      "child_ranges": [
        "(line 758,col 7)-(line 758,col 31)",
        "(line 759,col 7)-(line 759,col 31)",
        "(line 760,col 7)-(line 760,col 43)",
        "(line 761,col 7)-(line 761,col 38)",
        "(line 762,col 7)-(line 762,col 41)",
        "(line 763,col 7)-(line 767,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.HelicalValleyFunction.value(double[])",
      "begin_line": 770,
      "end_line": 790,
      "comment": "",
      "child_ranges": [
        "(line 772,col 7)-(line 772,col 31)",
        "(line 773,col 7)-(line 773,col 31)",
        "(line 774,col 7)-(line 774,col 31)",
        "(line 775,col 7)-(line 775,col 18)",
        "(line 776,col 7)-(line 783,col 7)",
        "(line 784,col 7)-(line 784,col 49)",
        "(line 785,col 7)-(line 789,col 8)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "twoPi"
      ],
      "begin_line": 792,
      "end_line": 792,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "PowellSingularFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 796,
      "end_line": 836,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 798,
      "end_line": 798,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.PowellSingularFunction.PowellSingularFunction(double[], double)",
      "begin_line": 800,
      "end_line": 803,
      "comment": "",
      "child_ranges": [
        "(line 802,col 7)-(line 802,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.PowellSingularFunction.jacobian(double[])",
      "begin_line": 805,
      "end_line": 817,
      "comment": "",
      "child_ranges": [
        "(line 807,col 7)-(line 807,col 31)",
        "(line 808,col 7)-(line 808,col 31)",
        "(line 809,col 7)-(line 809,col 31)",
        "(line 810,col 7)-(line 810,col 31)",
        "(line 811,col 7)-(line 816,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.PowellSingularFunction.value(double[])",
      "begin_line": 819,
      "end_line": 831,
      "comment": "",
      "child_ranges": [
        "(line 821,col 7)-(line 821,col 31)",
        "(line 822,col 7)-(line 822,col 31)",
        "(line 823,col 7)-(line 823,col 31)",
        "(line 824,col 7)-(line 824,col 31)",
        "(line 825,col 7)-(line 830,col 8)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "sqrt5"
      ],
      "begin_line": 833,
      "end_line": 833,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sqrt10"
      ],
      "begin_line": 834,
      "end_line": 834,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "FreudensteinRothFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 838,
      "end_line": 869,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 840,
      "end_line": 840,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.FreudensteinRothFunction.FreudensteinRothFunction(double[], double, double, double[])",
      "begin_line": 842,
      "end_line": 848,
      "comment": "",
      "child_ranges": [
        "(line 846,col 7)-(line 847,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.FreudensteinRothFunction.jacobian(double[])",
      "begin_line": 850,
      "end_line": 857,
      "comment": "",
      "child_ranges": [
        "(line 852,col 7)-(line 852,col 31)",
        "(line 853,col 7)-(line 856,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.FreudensteinRothFunction.value(double[])",
      "begin_line": 859,
      "end_line": 867,
      "comment": "",
      "child_ranges": [
        "(line 861,col 7)-(line 861,col 31)",
        "(line 862,col 7)-(line 862,col 31)",
        "(line 863,col 7)-(line 866,col 8)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BardFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 871,
      "end_line": 920,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 873,
      "end_line": 873,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.BardFunction.BardFunction(double, double, double, double[])",
      "begin_line": 875,
      "end_line": 881,
      "comment": "",
      "child_ranges": [
        "(line 879,col 7)-(line 880,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.BardFunction.jacobian(double[])",
      "begin_line": 883,
      "end_line": 897,
      "comment": "",
      "child_ranges": [
        "(line 885,col 7)-(line 885,col 33)",
        "(line 886,col 7)-(line 886,col 33)",
        "(line 887,col 7)-(line 887,col 44)",
        "(line 888,col 7)-(line 895,col 7)",
        "(line 896,col 7)-(line 896,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.BardFunction.value(double[])",
      "begin_line": 899,
      "end_line": 912,
      "comment": "",
      "child_ranges": [
        "(line 901,col 7)-(line 901,col 33)",
        "(line 902,col 7)-(line 902,col 33)",
        "(line 903,col 7)-(line 903,col 33)",
        "(line 904,col 7)-(line 904,col 33)",
        "(line 905,col 7)-(line 910,col 7)",
        "(line 911,col 7)-(line 911,col 15)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 914,
      "end_line": 918,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "KowalikOsborneFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 922,
      "end_line": 978,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 924,
      "end_line": 924,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.KowalikOsborneFunction.KowalikOsborneFunction(double[], double, double, double[])",
      "begin_line": 926,
      "end_line": 936,
      "comment": "",
      "child_ranges": [
        "(line 930,col 7)-(line 931,col 34)",
        "(line 932,col 7)-(line 935,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.KowalikOsborneFunction.jacobian(double[])",
      "begin_line": 938,
      "end_line": 954,
      "comment": "",
      "child_ranges": [
        "(line 940,col 7)-(line 940,col 33)",
        "(line 941,col 7)-(line 941,col 33)",
        "(line 942,col 7)-(line 942,col 33)",
        "(line 943,col 7)-(line 943,col 33)",
        "(line 944,col 7)-(line 944,col 44)",
        "(line 945,col 7)-(line 952,col 7)",
        "(line 953,col 7)-(line 953,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.KowalikOsborneFunction.value(double[])",
      "begin_line": 956,
      "end_line": 967,
      "comment": "",
      "child_ranges": [
        "(line 958,col 7)-(line 958,col 31)",
        "(line 959,col 7)-(line 959,col 31)",
        "(line 960,col 7)-(line 960,col 31)",
        "(line 961,col 7)-(line 961,col 31)",
        "(line 962,col 7)-(line 962,col 33)",
        "(line 963,col 7)-(line 965,col 7)",
        "(line 966,col 7)-(line 966,col 15)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "v"
      ],
      "begin_line": 969,
      "end_line": 971,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 973,
      "end_line": 976,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "MeyerFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 980,
      "end_line": 1031,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 982,
      "end_line": 982,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MeyerFunction.MeyerFunction(double[], double, double, double[])",
      "begin_line": 984,
      "end_line": 994,
      "comment": "",
      "child_ranges": [
        "(line 988,col 7)-(line 989,col 34)",
        "(line 990,col 7)-(line 993,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MeyerFunction.jacobian(double[])",
      "begin_line": 996,
      "end_line": 1010,
      "comment": "",
      "child_ranges": [
        "(line 998,col 7)-(line 998,col 33)",
        "(line 999,col 7)-(line 999,col 33)",
        "(line 1000,col 7)-(line 1000,col 33)",
        "(line 1001,col 7)-(line 1001,col 44)",
        "(line 1002,col 7)-(line 1008,col 7)",
        "(line 1009,col 7)-(line 1009,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MeyerFunction.value(double[])",
      "begin_line": 1012,
      "end_line": 1022,
      "comment": "",
      "child_ranges": [
        "(line 1014,col 7)-(line 1014,col 31)",
        "(line 1015,col 7)-(line 1015,col 31)",
        "(line 1016,col 7)-(line 1016,col 31)",
        "(line 1017,col 7)-(line 1017,col 33)",
        "(line 1018,col 7)-(line 1020,col 7)",
        "(line 1021,col 6)-(line 1021,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 1024,
      "end_line": 1029,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "WatsonFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1033,
      "end_line": 1107,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1035,
      "end_line": 1035,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.WatsonFunction.WatsonFunction(int, double, double, double, double[])",
      "begin_line": 1037,
      "end_line": 1043,
      "comment": "",
      "child_ranges": [
        "(line 1041,col 7)-(line 1042,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.WatsonFunction.jacobian(double[])",
      "begin_line": 1045,
      "end_line": 1076,
      "comment": "",
      "child_ranges": [
        "(line 1048,col 7)-(line 1048,col 44)",
        "(line 1050,col 7)-(line 1065,col 7)",
        "(line 1067,col 7)-(line 1067,col 41)",
        "(line 1068,col 7)-(line 1068,col 29)",
        "(line 1070,col 7)-(line 1070,col 40)",
        "(line 1071,col 7)-(line 1071,col 44)",
        "(line 1072,col 7)-(line 1072,col 28)",
        "(line 1074,col 7)-(line 1074,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.WatsonFunction.value(double[])",
      "begin_line": 1078,
      "end_line": 1105,
      "comment": "",
      "child_ranges": [
        "(line 1080,col 6)-(line 1080,col 32)",
        "(line 1081,col 6)-(line 1096,col 6)",
        "(line 1098,col 6)-(line 1098,col 30)",
        "(line 1099,col 6)-(line 1099,col 30)",
        "(line 1100,col 6)-(line 1100,col 19)",
        "(line 1101,col 6)-(line 1101,col 33)",
        "(line 1103,col 6)-(line 1103,col 14)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Box3DimensionalFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1109,
      "end_line": 1149,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1111,
      "end_line": 1111,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.Box3DimensionalFunction.Box3DimensionalFunction(int, double[], double)",
      "begin_line": 1113,
      "end_line": 1117,
      "comment": "",
      "child_ranges": [
        "(line 1115,col 7)-(line 1116,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.Box3DimensionalFunction.jacobian(double[])",
      "begin_line": 1119,
      "end_line": 1133,
      "comment": "",
      "child_ranges": [
        "(line 1121,col 7)-(line 1121,col 33)",
        "(line 1122,col 7)-(line 1122,col 33)",
        "(line 1123,col 7)-(line 1123,col 44)",
        "(line 1124,col 7)-(line 1131,col 7)",
        "(line 1132,col 7)-(line 1132,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.Box3DimensionalFunction.value(double[])",
      "begin_line": 1135,
      "end_line": 1147,
      "comment": "",
      "child_ranges": [
        "(line 1137,col 7)-(line 1137,col 31)",
        "(line 1138,col 7)-(line 1138,col 31)",
        "(line 1139,col 7)-(line 1139,col 31)",
        "(line 1140,col 7)-(line 1140,col 33)",
        "(line 1141,col 7)-(line 1145,col 7)",
        "(line 1146,col 7)-(line 1146,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "JennrichSampsonFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1151,
      "end_line": 1187,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1153,
      "end_line": 1153,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.JennrichSampsonFunction.JennrichSampsonFunction(int, double[], double, double, double[])",
      "begin_line": 1155,
      "end_line": 1161,
      "comment": "",
      "child_ranges": [
        "(line 1159,col 7)-(line 1160,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.JennrichSampsonFunction.jacobian(double[])",
      "begin_line": 1163,
      "end_line": 1173,
      "comment": "",
      "child_ranges": [
        "(line 1165,col 7)-(line 1165,col 33)",
        "(line 1166,col 7)-(line 1166,col 33)",
        "(line 1167,col 7)-(line 1167,col 44)",
        "(line 1168,col 7)-(line 1171,col 7)",
        "(line 1172,col 7)-(line 1172,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.JennrichSampsonFunction.value(double[])",
      "begin_line": 1175,
      "end_line": 1185,
      "comment": "",
      "child_ranges": [
        "(line 1177,col 7)-(line 1177,col 31)",
        "(line 1178,col 7)-(line 1178,col 31)",
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
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1189,
      "end_line": 1237,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1191,
      "end_line": 1191,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.BrownDennisFunction.BrownDennisFunction(int, double[], double, double, double[])",
      "begin_line": 1193,
      "end_line": 1200,
      "comment": "",
      "child_ranges": [
        "(line 1197,col 7)-(line 1198,col 34)",
        "(line 1199,col 7)-(line 1199,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.BrownDennisFunction.jacobian(double[])",
      "begin_line": 1202,
      "end_line": 1219,
      "comment": "",
      "child_ranges": [
        "(line 1204,col 7)-(line 1204,col 33)",
        "(line 1205,col 7)-(line 1205,col 33)",
        "(line 1206,col 7)-(line 1206,col 33)",
        "(line 1207,col 7)-(line 1207,col 33)",
        "(line 1208,col 7)-(line 1208,col 44)",
        "(line 1209,col 7)-(line 1217,col 7)",
        "(line 1218,col 7)-(line 1218,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.BrownDennisFunction.value(double[])",
      "begin_line": 1221,
      "end_line": 1235,
      "comment": "",
      "child_ranges": [
        "(line 1223,col 7)-(line 1223,col 31)",
        "(line 1224,col 7)-(line 1224,col 31)",
        "(line 1225,col 7)-(line 1225,col 31)",
        "(line 1226,col 7)-(line 1226,col 31)",
        "(line 1227,col 7)-(line 1227,col 33)",
        "(line 1228,col 7)-(line 1233,col 7)",
        "(line 1234,col 7)-(line 1234,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ChebyquadFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1239,
      "end_line": 1321,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1241,
      "end_line": 1241,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.ChebyquadFunction.buildChebyquadArray(int, double)",
      "begin_line": 1243,
      "end_line": 1250,
      "comment": "",
      "child_ranges": [
        "(line 1244,col 7)-(line 1244,col 37)",
        "(line 1245,col 7)-(line 1245,col 36)",
        "(line 1246,col 7)-(line 1248,col 7)",
        "(line 1249,col 7)-(line 1249,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.ChebyquadFunction.ChebyquadFunction(int, int, double, double, double, double[])",
      "begin_line": 1252,
      "end_line": 1258,
      "comment": "",
      "child_ranges": [
        "(line 1256,col 7)-(line 1257,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.ChebyquadFunction.jacobian(double[])",
      "begin_line": 1260,
      "end_line": 1288,
      "comment": "",
      "child_ranges": [
        "(line 1263,col 7)-(line 1263,col 44)",
        "(line 1264,col 7)-(line 1266,col 7)",
        "(line 1268,col 7)-(line 1268,col 26)",
        "(line 1269,col 7)-(line 1284,col 7)",
        "(line 1286,col 7)-(line 1286,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.ChebyquadFunction.value(double[])",
      "begin_line": 1290,
      "end_line": 1319,
      "comment": "",
      "child_ranges": [
        "(line 1293,col 7)-(line 1293,col 33)",
        "(line 1295,col 7)-(line 1305,col 7)",
        "(line 1307,col 7)-(line 1307,col 26)",
        "(line 1308,col 7)-(line 1308,col 26)",
        "(line 1309,col 7)-(line 1315,col 7)",
        "(line 1317,col 7)-(line 1317,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BrownAlmostLinearFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1323,
      "end_line": 1385,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1325,
      "end_line": 1325,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.BrownAlmostLinearFunction.BrownAlmostLinearFunction(int, double, double, double, double[])",
      "begin_line": 1327,
      "end_line": 1333,
      "comment": "",
      "child_ranges": [
        "(line 1331,col 7)-(line 1332,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.BrownAlmostLinearFunction.jacobian(double[])",
      "begin_line": 1335,
      "end_line": 1367,
      "comment": "",
      "child_ranges": [
        "(line 1337,col 7)-(line 1337,col 44)",
        "(line 1338,col 7)-(line 1340,col 7)",
        "(line 1342,col 7)-(line 1342,col 22)",
        "(line 1343,col 7)-(line 1349,col 7)",
        "(line 1351,col 7)-(line 1363,col 7)",
        "(line 1365,col 7)-(line 1365,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.BrownAlmostLinearFunction.value(double[])",
      "begin_line": 1369,
      "end_line": 1383,
      "comment": "",
      "child_ranges": [
        "(line 1371,col 7)-(line 1371,col 33)",
        "(line 1372,col 7)-(line 1372,col 29)",
        "(line 1373,col 7)-(line 1373,col 22)",
        "(line 1374,col 7)-(line 1377,col 7)",
        "(line 1378,col 7)-(line 1380,col 7)",
        "(line 1381,col 7)-(line 1381,col 26)",
        "(line 1382,col 7)-(line 1382,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Osborne1Function",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1387,
      "end_line": 1440,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1389,
      "end_line": 1389,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.Osborne1Function.Osborne1Function(double[], double, double, double[])",
      "begin_line": 1391,
      "end_line": 1397,
      "comment": "",
      "child_ranges": [
        "(line 1395,col 7)-(line 1396,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.Osborne1Function.jacobian(double[])",
      "begin_line": 1399,
      "end_line": 1415,
      "comment": "",
      "child_ranges": [
        "(line 1401,col 7)-(line 1401,col 33)",
        "(line 1402,col 7)-(line 1402,col 33)",
        "(line 1403,col 7)-(line 1403,col 33)",
        "(line 1404,col 7)-(line 1404,col 33)",
        "(line 1405,col 7)-(line 1405,col 44)",
        "(line 1406,col 7)-(line 1413,col 7)",
        "(line 1414,col 7)-(line 1414,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.Osborne1Function.value(double[])",
      "begin_line": 1417,
      "end_line": 1432,
      "comment": "",
      "child_ranges": [
        "(line 1419,col 7)-(line 1419,col 31)",
        "(line 1420,col 7)-(line 1420,col 31)",
        "(line 1421,col 7)-(line 1421,col 31)",
        "(line 1422,col 7)-(line 1422,col 31)",
        "(line 1423,col 7)-(line 1423,col 31)",
        "(line 1424,col 7)-(line 1424,col 33)",
        "(line 1425,col 7)-(line 1430,col 7)",
        "(line 1431,col 7)-(line 1431,col 15)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 1434,
      "end_line": 1438,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Osborne2Function",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1442,
      "end_line": 1532,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1444,
      "end_line": 1444,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.Osborne2Function.Osborne2Function(double[], double, double, double[])",
      "begin_line": 1446,
      "end_line": 1452,
      "comment": "",
      "child_ranges": [
        "(line 1450,col 7)-(line 1451,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.Osborne2Function.jacobian(double[])",
      "begin_line": 1454,
      "end_line": 1489,
      "comment": "",
      "child_ranges": [
        "(line 1456,col 7)-(line 1456,col 34)",
        "(line 1457,col 7)-(line 1457,col 34)",
        "(line 1458,col 7)-(line 1458,col 34)",
        "(line 1459,col 7)-(line 1459,col 34)",
        "(line 1460,col 7)-(line 1460,col 34)",
        "(line 1461,col 7)-(line 1461,col 34)",
        "(line 1462,col 7)-(line 1462,col 34)",
        "(line 1463,col 7)-(line 1463,col 34)",
        "(line 1464,col 7)-(line 1464,col 34)",
        "(line 1465,col 7)-(line 1465,col 34)",
        "(line 1466,col 7)-(line 1466,col 35)",
        "(line 1467,col 7)-(line 1467,col 44)",
        "(line 1468,col 7)-(line 1487,col 7)",
        "(line 1488,col 7)-(line 1488,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.Osborne2Function.value(double[])",
      "begin_line": 1491,
      "end_line": 1514,
      "comment": "",
      "child_ranges": [
        "(line 1493,col 7)-(line 1493,col 32)",
        "(line 1494,col 7)-(line 1494,col 32)",
        "(line 1495,col 7)-(line 1495,col 32)",
        "(line 1496,col 7)-(line 1496,col 32)",
        "(line 1497,col 7)-(line 1497,col 32)",
        "(line 1498,col 7)-(line 1498,col 32)",
        "(line 1499,col 7)-(line 1499,col 32)",
        "(line 1500,col 7)-(line 1500,col 32)",
        "(line 1501,col 7)-(line 1501,col 32)",
        "(line 1502,col 7)-(line 1502,col 32)",
        "(line 1503,col 7)-(line 1503,col 33)",
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
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.suite()",
      "begin_line": 1534,
      "end_line": 1536,
      "comment": "",
      "child_ranges": [
        "(line 1535,col 5)-(line 1535,col 44)"
      ]
    }
  ]
}