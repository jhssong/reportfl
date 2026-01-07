{
  "filepath": "/tmp/Math-63b/src/test/java/org/apache/commons/math/optimization/general/MinpackTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MinpackTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 94,
      "end_line": 1531,
      "comment": "\n * \u003cp\u003eSome of the unit tests are re-implementations of the MINPACK \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file17\"\u003efile17\u003c/a\u003e and \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file22\"\u003efile22\u003c/a\u003e test files.\n * The redistribution policy for MINPACK is available \u003ca\n * href\u003d\"http://www.netlib.org/minpack/disclaimer\"\u003ehere\u003c/a\u003e, for\n * convenience, it is reproduced below.\u003c/p\u003e\n\n * \u003ctable border\u003d\"0\" width\u003d\"80%\" cellpadding\u003d\"10\" align\u003d\"center\" bgcolor\u003d\"#E0E0E0\"\u003e\n * \u003ctr\u003e\u003ctd\u003e\n *    Minpack Copyright Notice (1999) University of Chicago.\n *    All rights reserved\n * \u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003e\n * Redistribution and use in source and binary forms, with or without\n * modification, are permitted provided that the following conditions\n * are met:\n * \u003col\u003e\n *  \u003cli\u003eRedistributions of source code must retain the above copyright\n *      notice, this list of conditions and the following disclaimer.\u003c/li\u003e\n * \u003cli\u003eRedistributions in binary form must reproduce the above\n *     copyright notice, this list of conditions and the following\n *     disclaimer in the documentation and/or other materials provided\n *     with the distribution.\u003c/li\u003e\n * \u003cli\u003eThe end-user documentation included with the redistribution, if any,\n *     must include the following acknowledgment:\n *     \u003ccode\u003eThis product includes software developed by the University of\n *           Chicago, as Operator of Argonne National Laboratory.\u003c/code\u003e\n *     Alternately, this acknowledgment may appear in the software itself,\n *     if and wherever such third-party acknowledgments normally appear.\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eWARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED \"AS IS\"\n *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE\n *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND\n *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR\n *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES\n *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE\n *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY\n *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR\n *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF\n *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)\n *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION\n *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL\n *     BE CORRECTED.\u003c/strong\u003e\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eLIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT\n *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF\n *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,\n *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF\n *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF\n *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER\n *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT\n *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,\n *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE\n *     POSSIBILITY OF SUCH LOSS OR DAMAGES.\u003c/strong\u003e\u003c/li\u003e\n * \u003col\u003e\u003c/td\u003e\u003c/tr\u003e\n * \u003c/table\u003e\n\n * @author Argonne National Laboratory. MINPACK project. March 1980 (original fortran minpack tests)\n * @author Burton S. Garbow (original fortran minpack tests)\n * @author Kenneth E. Hillstrom (original fortran minpack tests)\n * @author Jorge J. More (original fortran minpack tests)\n * @author Luc Maisonobe (non-minpack tests and minpack tests Java translation)\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackTest(java.lang.String)",
      "begin_line": 96,
      "end_line": 98,
      "comment": "",
      "child_ranges": [
        "(line 97,col 5)-(line 97,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.testMinpackLinearFullRank()",
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
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.testMinpackLinearRank1()",
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
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.testMinpackLinearRank1ZeroColsAndRows()",
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
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.testMinpackRosenbrok()",
      "begin_line": 119,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 120,col 5)-(line 121,col 68)",
        "(line 122,col 5)-(line 123,col 73)",
        "(line 124,col 5)-(line 125,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.testMinpackHelicalValley()",
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
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.testMinpackPowellSingular()",
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
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.testMinpackFreudensteinRoth()",
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
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.testMinpackBard()",
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
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.testMinpackKowalikOsborne()",
      "begin_line": 188,
      "end_line": 216,
      "comment": "",
      "child_ranges": [
        "(line 189,col 5)-(line 197,col 54)",
        "(line 198,col 5)-(line 206,col 54)",
        "(line 207,col 5)-(line 215,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.testMinpackMeyer()",
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
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.testMinpackWatson()",
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
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.testMinpackBox3Dimensional()",
      "begin_line": 320,
      "end_line": 323,
      "comment": "",
      "child_ranges": [
        "(line 321,col 5)-(line 322,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.testMinpackJennrichSampson()",
      "begin_line": 325,
      "end_line": 332,
      "comment": "",
      "child_ranges": [
        "(line 326,col 5)-(line 331,col 55)"
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
        "(line 493,col 7)-(line 493,col 63)",
        "(line 494,col 7)-(line 494,col 75)",
        "(line 495,col 7)-(line 495,col 74)",
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
      "end_line": 595,
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
        "(line 568,col 11)-(line 568,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.checkTheoreticalMinParams(org.apache.commons.math.optimization.VectorialPointValuePair)",
      "begin_line": 571,
      "end_line": 580,
      "comment": "",
      "child_ranges": [
        "(line 572,col 11)-(line 572,col 50)",
        "(line 573,col 11)-(line 579,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.jacobian()",
      "begin_line": 582,
      "end_line": 589,
      "comment": "",
      "child_ranges": [
        "(line 583,col 11)-(line 588,col 12)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 584,
      "end_line": 584,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.Anonymous-8aa9ca3a-0217-40d6-8872-43ccd0d17db1.value(double[])",
      "begin_line": 585,
      "end_line": 587,
      "comment": "",
      "child_ranges": [
        "(line 586,col 19)-(line 586,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.jacobian(double[])",
      "begin_line": 591,
      "end_line": 591,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.value(double[])",
      "begin_line": 593,
      "end_line": 593,
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
      "begin_line": 597,
      "end_line": 636,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 599,
      "end_line": 599,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.LinearFullRankFunction.LinearFullRankFunction(int, int, double, double, double)",
      "begin_line": 601,
      "end_line": 606,
      "comment": "",
      "child_ranges": [
        "(line 604,col 7)-(line 605,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.LinearFullRankFunction.jacobian(double[])",
      "begin_line": 608,
      "end_line": 619,
      "comment": "",
      "child_ranges": [
        "(line 610,col 7)-(line 610,col 25)",
        "(line 611,col 7)-(line 611,col 44)",
        "(line 612,col 7)-(line 617,col 7)",
        "(line 618,col 7)-(line 618,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.LinearFullRankFunction.value(double[])",
      "begin_line": 621,
      "end_line": 634,
      "comment": "",
      "child_ranges": [
        "(line 623,col 7)-(line 623,col 21)",
        "(line 624,col 7)-(line 626,col 7)",
        "(line 627,col 7)-(line 627,col 34)",
        "(line 628,col 7)-(line 628,col 33)",
        "(line 629,col 7)-(line 631,col 7)",
        "(line 632,col 7)-(line 632,col 31)",
        "(line 633,col 7)-(line 633,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LinearRank1Function",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 638,
      "end_line": 673,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 640,
      "end_line": 640,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.LinearRank1Function.LinearRank1Function(int, int, double, double, double)",
      "begin_line": 642,
      "end_line": 646,
      "comment": "",
      "child_ranges": [
        "(line 645,col 7)-(line 645,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.LinearRank1Function.jacobian(double[])",
      "begin_line": 648,
      "end_line": 658,
      "comment": "",
      "child_ranges": [
        "(line 650,col 7)-(line 650,col 44)",
        "(line 651,col 7)-(line 656,col 7)",
        "(line 657,col 7)-(line 657,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.LinearRank1Function.value(double[])",
      "begin_line": 660,
      "end_line": 671,
      "comment": "",
      "child_ranges": [
        "(line 662,col 7)-(line 662,col 33)",
        "(line 663,col 7)-(line 663,col 21)",
        "(line 664,col 7)-(line 666,col 7)",
        "(line 667,col 7)-(line 669,col 7)",
        "(line 670,col 7)-(line 670,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LinearRank1ZeroColsAndRowsFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 675,
      "end_line": 719,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 677,
      "end_line": 677,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.LinearRank1ZeroColsAndRowsFunction.LinearRank1ZeroColsAndRowsFunction(int, int, double)",
      "begin_line": 679,
      "end_line": 683,
      "comment": "",
      "child_ranges": [
        "(line 680,col 7)-(line 682,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.LinearRank1ZeroColsAndRowsFunction.jacobian(double[])",
      "begin_line": 685,
      "end_line": 703,
      "comment": "",
      "child_ranges": [
        "(line 687,col 7)-(line 687,col 44)",
        "(line 688,col 7)-(line 701,col 7)",
        "(line 702,col 7)-(line 702,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.LinearRank1ZeroColsAndRowsFunction.value(double[])",
      "begin_line": 705,
      "end_line": 717,
      "comment": "",
      "child_ranges": [
        "(line 707,col 7)-(line 707,col 33)",
        "(line 708,col 7)-(line 708,col 21)",
        "(line 709,col 7)-(line 711,col 7)",
        "(line 712,col 7)-(line 714,col 7)",
        "(line 715,col 7)-(line 715,col 20)",
        "(line 716,col 7)-(line 716,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RosenbrockFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 721,
      "end_line": 742,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 723,
      "end_line": 723,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.RosenbrockFunction.RosenbrockFunction(double[], double)",
      "begin_line": 725,
      "end_line": 727,
      "comment": "",
      "child_ranges": [
        "(line 726,col 7)-(line 726,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.RosenbrockFunction.jacobian(double[])",
      "begin_line": 729,
      "end_line": 733,
      "comment": "",
      "child_ranges": [
        "(line 731,col 7)-(line 731,col 31)",
        "(line 732,col 7)-(line 732,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.RosenbrockFunction.value(double[])",
      "begin_line": 735,
      "end_line": 740,
      "comment": "",
      "child_ranges": [
        "(line 737,col 7)-(line 737,col 31)",
        "(line 738,col 7)-(line 738,col 31)",
        "(line 739,col 7)-(line 739,col 58)"
      ]
    },
    {
      "type": "class_interface",
      "name": "HelicalValleyFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 744,
      "end_line": 791,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 746,
      "end_line": 746,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.HelicalValleyFunction.HelicalValleyFunction(double[], double)",
      "begin_line": 748,
      "end_line": 751,
      "comment": "",
      "child_ranges": [
        "(line 750,col 7)-(line 750,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.HelicalValleyFunction.jacobian(double[])",
      "begin_line": 753,
      "end_line": 765,
      "comment": "",
      "child_ranges": [
        "(line 755,col 7)-(line 755,col 31)",
        "(line 756,col 7)-(line 756,col 31)",
        "(line 757,col 7)-(line 757,col 43)",
        "(line 758,col 7)-(line 758,col 38)",
        "(line 759,col 7)-(line 759,col 45)",
        "(line 760,col 7)-(line 764,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.HelicalValleyFunction.value(double[])",
      "begin_line": 767,
      "end_line": 787,
      "comment": "",
      "child_ranges": [
        "(line 769,col 7)-(line 769,col 31)",
        "(line 770,col 7)-(line 770,col 31)",
        "(line 771,col 7)-(line 771,col 31)",
        "(line 772,col 7)-(line 772,col 18)",
        "(line 773,col 7)-(line 780,col 7)",
        "(line 781,col 7)-(line 781,col 53)",
        "(line 782,col 7)-(line 786,col 8)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "twoPi"
      ],
      "begin_line": 789,
      "end_line": 789,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "PowellSingularFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 793,
      "end_line": 833,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 795,
      "end_line": 795,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.PowellSingularFunction.PowellSingularFunction(double[], double)",
      "begin_line": 797,
      "end_line": 800,
      "comment": "",
      "child_ranges": [
        "(line 799,col 7)-(line 799,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.PowellSingularFunction.jacobian(double[])",
      "begin_line": 802,
      "end_line": 814,
      "comment": "",
      "child_ranges": [
        "(line 804,col 7)-(line 804,col 31)",
        "(line 805,col 7)-(line 805,col 31)",
        "(line 806,col 7)-(line 806,col 31)",
        "(line 807,col 7)-(line 807,col 31)",
        "(line 808,col 7)-(line 813,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.PowellSingularFunction.value(double[])",
      "begin_line": 816,
      "end_line": 828,
      "comment": "",
      "child_ranges": [
        "(line 818,col 7)-(line 818,col 31)",
        "(line 819,col 7)-(line 819,col 31)",
        "(line 820,col 7)-(line 820,col 31)",
        "(line 821,col 7)-(line 821,col 31)",
        "(line 822,col 7)-(line 827,col 8)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "sqrt5"
      ],
      "begin_line": 830,
      "end_line": 830,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sqrt10"
      ],
      "begin_line": 831,
      "end_line": 831,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "FreudensteinRothFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 835,
      "end_line": 866,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 837,
      "end_line": 837,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.FreudensteinRothFunction.FreudensteinRothFunction(double[], double, double, double[])",
      "begin_line": 839,
      "end_line": 845,
      "comment": "",
      "child_ranges": [
        "(line 843,col 7)-(line 844,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.FreudensteinRothFunction.jacobian(double[])",
      "begin_line": 847,
      "end_line": 854,
      "comment": "",
      "child_ranges": [
        "(line 849,col 7)-(line 849,col 31)",
        "(line 850,col 7)-(line 853,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.FreudensteinRothFunction.value(double[])",
      "begin_line": 856,
      "end_line": 864,
      "comment": "",
      "child_ranges": [
        "(line 858,col 7)-(line 858,col 31)",
        "(line 859,col 7)-(line 859,col 31)",
        "(line 860,col 7)-(line 863,col 8)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BardFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 868,
      "end_line": 917,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 870,
      "end_line": 870,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.BardFunction.BardFunction(double, double, double, double[])",
      "begin_line": 872,
      "end_line": 878,
      "comment": "",
      "child_ranges": [
        "(line 876,col 7)-(line 877,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.BardFunction.jacobian(double[])",
      "begin_line": 880,
      "end_line": 894,
      "comment": "",
      "child_ranges": [
        "(line 882,col 7)-(line 882,col 33)",
        "(line 883,col 7)-(line 883,col 33)",
        "(line 884,col 7)-(line 884,col 44)",
        "(line 885,col 7)-(line 892,col 7)",
        "(line 893,col 7)-(line 893,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.BardFunction.value(double[])",
      "begin_line": 896,
      "end_line": 909,
      "comment": "",
      "child_ranges": [
        "(line 898,col 7)-(line 898,col 33)",
        "(line 899,col 7)-(line 899,col 33)",
        "(line 900,col 7)-(line 900,col 33)",
        "(line 901,col 7)-(line 901,col 33)",
        "(line 902,col 7)-(line 907,col 7)",
        "(line 908,col 7)-(line 908,col 15)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 911,
      "end_line": 915,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "KowalikOsborneFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 919,
      "end_line": 975,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 921,
      "end_line": 921,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.KowalikOsborneFunction.KowalikOsborneFunction(double[], double, double, double[])",
      "begin_line": 923,
      "end_line": 933,
      "comment": "",
      "child_ranges": [
        "(line 927,col 7)-(line 928,col 34)",
        "(line 929,col 7)-(line 932,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.KowalikOsborneFunction.jacobian(double[])",
      "begin_line": 935,
      "end_line": 951,
      "comment": "",
      "child_ranges": [
        "(line 937,col 7)-(line 937,col 33)",
        "(line 938,col 7)-(line 938,col 33)",
        "(line 939,col 7)-(line 939,col 33)",
        "(line 940,col 7)-(line 940,col 33)",
        "(line 941,col 7)-(line 941,col 44)",
        "(line 942,col 7)-(line 949,col 7)",
        "(line 950,col 7)-(line 950,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.KowalikOsborneFunction.value(double[])",
      "begin_line": 953,
      "end_line": 964,
      "comment": "",
      "child_ranges": [
        "(line 955,col 7)-(line 955,col 31)",
        "(line 956,col 7)-(line 956,col 31)",
        "(line 957,col 7)-(line 957,col 31)",
        "(line 958,col 7)-(line 958,col 31)",
        "(line 959,col 7)-(line 959,col 33)",
        "(line 960,col 7)-(line 962,col 7)",
        "(line 963,col 7)-(line 963,col 15)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "v"
      ],
      "begin_line": 966,
      "end_line": 968,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 970,
      "end_line": 973,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "MeyerFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 977,
      "end_line": 1028,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 979,
      "end_line": 979,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MeyerFunction.MeyerFunction(double[], double, double, double[])",
      "begin_line": 981,
      "end_line": 991,
      "comment": "",
      "child_ranges": [
        "(line 985,col 7)-(line 986,col 34)",
        "(line 987,col 7)-(line 990,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MeyerFunction.jacobian(double[])",
      "begin_line": 993,
      "end_line": 1007,
      "comment": "",
      "child_ranges": [
        "(line 995,col 7)-(line 995,col 33)",
        "(line 996,col 7)-(line 996,col 33)",
        "(line 997,col 7)-(line 997,col 33)",
        "(line 998,col 7)-(line 998,col 44)",
        "(line 999,col 7)-(line 1005,col 7)",
        "(line 1006,col 7)-(line 1006,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MeyerFunction.value(double[])",
      "begin_line": 1009,
      "end_line": 1019,
      "comment": "",
      "child_ranges": [
        "(line 1011,col 7)-(line 1011,col 31)",
        "(line 1012,col 7)-(line 1012,col 31)",
        "(line 1013,col 7)-(line 1013,col 31)",
        "(line 1014,col 7)-(line 1014,col 33)",
        "(line 1015,col 7)-(line 1017,col 7)",
        "(line 1018,col 6)-(line 1018,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 1021,
      "end_line": 1026,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "WatsonFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1030,
      "end_line": 1104,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1032,
      "end_line": 1032,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.WatsonFunction.WatsonFunction(int, double, double, double, double[])",
      "begin_line": 1034,
      "end_line": 1040,
      "comment": "",
      "child_ranges": [
        "(line 1038,col 7)-(line 1039,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.WatsonFunction.jacobian(double[])",
      "begin_line": 1042,
      "end_line": 1073,
      "comment": "",
      "child_ranges": [
        "(line 1045,col 7)-(line 1045,col 44)",
        "(line 1047,col 7)-(line 1062,col 7)",
        "(line 1064,col 7)-(line 1064,col 41)",
        "(line 1065,col 7)-(line 1065,col 29)",
        "(line 1067,col 7)-(line 1067,col 40)",
        "(line 1068,col 7)-(line 1068,col 44)",
        "(line 1069,col 7)-(line 1069,col 28)",
        "(line 1071,col 7)-(line 1071,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.WatsonFunction.value(double[])",
      "begin_line": 1075,
      "end_line": 1102,
      "comment": "",
      "child_ranges": [
        "(line 1077,col 6)-(line 1077,col 32)",
        "(line 1078,col 6)-(line 1093,col 6)",
        "(line 1095,col 6)-(line 1095,col 30)",
        "(line 1096,col 6)-(line 1096,col 30)",
        "(line 1097,col 6)-(line 1097,col 19)",
        "(line 1098,col 6)-(line 1098,col 33)",
        "(line 1100,col 6)-(line 1100,col 14)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Box3DimensionalFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1106,
      "end_line": 1146,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1108,
      "end_line": 1108,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.Box3DimensionalFunction.Box3DimensionalFunction(int, double[], double)",
      "begin_line": 1110,
      "end_line": 1114,
      "comment": "",
      "child_ranges": [
        "(line 1112,col 7)-(line 1113,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.Box3DimensionalFunction.jacobian(double[])",
      "begin_line": 1116,
      "end_line": 1130,
      "comment": "",
      "child_ranges": [
        "(line 1118,col 7)-(line 1118,col 33)",
        "(line 1119,col 7)-(line 1119,col 33)",
        "(line 1120,col 7)-(line 1120,col 44)",
        "(line 1121,col 7)-(line 1128,col 7)",
        "(line 1129,col 7)-(line 1129,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.Box3DimensionalFunction.value(double[])",
      "begin_line": 1132,
      "end_line": 1144,
      "comment": "",
      "child_ranges": [
        "(line 1134,col 7)-(line 1134,col 31)",
        "(line 1135,col 7)-(line 1135,col 31)",
        "(line 1136,col 7)-(line 1136,col 31)",
        "(line 1137,col 7)-(line 1137,col 33)",
        "(line 1138,col 7)-(line 1142,col 7)",
        "(line 1143,col 7)-(line 1143,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "JennrichSampsonFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1148,
      "end_line": 1184,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1150,
      "end_line": 1150,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.JennrichSampsonFunction.JennrichSampsonFunction(int, double[], double, double, double[])",
      "begin_line": 1152,
      "end_line": 1158,
      "comment": "",
      "child_ranges": [
        "(line 1156,col 7)-(line 1157,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.JennrichSampsonFunction.jacobian(double[])",
      "begin_line": 1160,
      "end_line": 1170,
      "comment": "",
      "child_ranges": [
        "(line 1162,col 7)-(line 1162,col 33)",
        "(line 1163,col 7)-(line 1163,col 33)",
        "(line 1164,col 7)-(line 1164,col 44)",
        "(line 1165,col 7)-(line 1168,col 7)",
        "(line 1169,col 7)-(line 1169,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.JennrichSampsonFunction.value(double[])",
      "begin_line": 1172,
      "end_line": 1182,
      "comment": "",
      "child_ranges": [
        "(line 1174,col 7)-(line 1174,col 31)",
        "(line 1175,col 7)-(line 1175,col 31)",
        "(line 1176,col 7)-(line 1176,col 33)",
        "(line 1177,col 7)-(line 1180,col 7)",
        "(line 1181,col 7)-(line 1181,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BrownDennisFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1186,
      "end_line": 1234,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1188,
      "end_line": 1188,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.BrownDennisFunction.BrownDennisFunction(int, double[], double, double, double[])",
      "begin_line": 1190,
      "end_line": 1197,
      "comment": "",
      "child_ranges": [
        "(line 1194,col 7)-(line 1195,col 34)",
        "(line 1196,col 7)-(line 1196,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.BrownDennisFunction.jacobian(double[])",
      "begin_line": 1199,
      "end_line": 1216,
      "comment": "",
      "child_ranges": [
        "(line 1201,col 7)-(line 1201,col 33)",
        "(line 1202,col 7)-(line 1202,col 33)",
        "(line 1203,col 7)-(line 1203,col 33)",
        "(line 1204,col 7)-(line 1204,col 33)",
        "(line 1205,col 7)-(line 1205,col 44)",
        "(line 1206,col 7)-(line 1214,col 7)",
        "(line 1215,col 7)-(line 1215,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.BrownDennisFunction.value(double[])",
      "begin_line": 1218,
      "end_line": 1232,
      "comment": "",
      "child_ranges": [
        "(line 1220,col 7)-(line 1220,col 31)",
        "(line 1221,col 7)-(line 1221,col 31)",
        "(line 1222,col 7)-(line 1222,col 31)",
        "(line 1223,col 7)-(line 1223,col 31)",
        "(line 1224,col 7)-(line 1224,col 33)",
        "(line 1225,col 7)-(line 1230,col 7)",
        "(line 1231,col 7)-(line 1231,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ChebyquadFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1236,
      "end_line": 1318,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1238,
      "end_line": 1238,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.ChebyquadFunction.buildChebyquadArray(int, double)",
      "begin_line": 1240,
      "end_line": 1247,
      "comment": "",
      "child_ranges": [
        "(line 1241,col 7)-(line 1241,col 37)",
        "(line 1242,col 7)-(line 1242,col 36)",
        "(line 1243,col 7)-(line 1245,col 7)",
        "(line 1246,col 7)-(line 1246,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.ChebyquadFunction.ChebyquadFunction(int, int, double, double, double, double[])",
      "begin_line": 1249,
      "end_line": 1255,
      "comment": "",
      "child_ranges": [
        "(line 1253,col 7)-(line 1254,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.ChebyquadFunction.jacobian(double[])",
      "begin_line": 1257,
      "end_line": 1285,
      "comment": "",
      "child_ranges": [
        "(line 1260,col 7)-(line 1260,col 44)",
        "(line 1261,col 7)-(line 1263,col 7)",
        "(line 1265,col 7)-(line 1265,col 26)",
        "(line 1266,col 7)-(line 1281,col 7)",
        "(line 1283,col 7)-(line 1283,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.ChebyquadFunction.value(double[])",
      "begin_line": 1287,
      "end_line": 1316,
      "comment": "",
      "child_ranges": [
        "(line 1290,col 7)-(line 1290,col 33)",
        "(line 1292,col 7)-(line 1302,col 7)",
        "(line 1304,col 7)-(line 1304,col 26)",
        "(line 1305,col 7)-(line 1305,col 26)",
        "(line 1306,col 7)-(line 1312,col 7)",
        "(line 1314,col 7)-(line 1314,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BrownAlmostLinearFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1320,
      "end_line": 1382,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1322,
      "end_line": 1322,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.BrownAlmostLinearFunction.BrownAlmostLinearFunction(int, double, double, double, double[])",
      "begin_line": 1324,
      "end_line": 1330,
      "comment": "",
      "child_ranges": [
        "(line 1328,col 7)-(line 1329,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.BrownAlmostLinearFunction.jacobian(double[])",
      "begin_line": 1332,
      "end_line": 1364,
      "comment": "",
      "child_ranges": [
        "(line 1334,col 7)-(line 1334,col 44)",
        "(line 1335,col 7)-(line 1337,col 7)",
        "(line 1339,col 7)-(line 1339,col 22)",
        "(line 1340,col 7)-(line 1346,col 7)",
        "(line 1348,col 7)-(line 1360,col 7)",
        "(line 1362,col 7)-(line 1362,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.BrownAlmostLinearFunction.value(double[])",
      "begin_line": 1366,
      "end_line": 1380,
      "comment": "",
      "child_ranges": [
        "(line 1368,col 7)-(line 1368,col 33)",
        "(line 1369,col 7)-(line 1369,col 29)",
        "(line 1370,col 7)-(line 1370,col 22)",
        "(line 1371,col 7)-(line 1374,col 7)",
        "(line 1375,col 7)-(line 1377,col 7)",
        "(line 1378,col 7)-(line 1378,col 26)",
        "(line 1379,col 7)-(line 1379,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Osborne1Function",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1384,
      "end_line": 1437,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1386,
      "end_line": 1386,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.Osborne1Function.Osborne1Function(double[], double, double, double[])",
      "begin_line": 1388,
      "end_line": 1394,
      "comment": "",
      "child_ranges": [
        "(line 1392,col 7)-(line 1393,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.Osborne1Function.jacobian(double[])",
      "begin_line": 1396,
      "end_line": 1412,
      "comment": "",
      "child_ranges": [
        "(line 1398,col 7)-(line 1398,col 33)",
        "(line 1399,col 7)-(line 1399,col 33)",
        "(line 1400,col 7)-(line 1400,col 33)",
        "(line 1401,col 7)-(line 1401,col 33)",
        "(line 1402,col 7)-(line 1402,col 44)",
        "(line 1403,col 7)-(line 1410,col 7)",
        "(line 1411,col 7)-(line 1411,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.Osborne1Function.value(double[])",
      "begin_line": 1414,
      "end_line": 1429,
      "comment": "",
      "child_ranges": [
        "(line 1416,col 7)-(line 1416,col 31)",
        "(line 1417,col 7)-(line 1417,col 31)",
        "(line 1418,col 7)-(line 1418,col 31)",
        "(line 1419,col 7)-(line 1419,col 31)",
        "(line 1420,col 7)-(line 1420,col 31)",
        "(line 1421,col 7)-(line 1421,col 33)",
        "(line 1422,col 7)-(line 1427,col 7)",
        "(line 1428,col 7)-(line 1428,col 15)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 1431,
      "end_line": 1435,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Osborne2Function",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1439,
      "end_line": 1529,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1441,
      "end_line": 1441,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.Osborne2Function.Osborne2Function(double[], double, double, double[])",
      "begin_line": 1443,
      "end_line": 1449,
      "comment": "",
      "child_ranges": [
        "(line 1447,col 7)-(line 1448,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.Osborne2Function.jacobian(double[])",
      "begin_line": 1451,
      "end_line": 1486,
      "comment": "",
      "child_ranges": [
        "(line 1453,col 7)-(line 1453,col 34)",
        "(line 1454,col 7)-(line 1454,col 34)",
        "(line 1455,col 7)-(line 1455,col 34)",
        "(line 1456,col 7)-(line 1456,col 34)",
        "(line 1457,col 7)-(line 1457,col 34)",
        "(line 1458,col 7)-(line 1458,col 34)",
        "(line 1459,col 7)-(line 1459,col 34)",
        "(line 1460,col 7)-(line 1460,col 34)",
        "(line 1461,col 7)-(line 1461,col 34)",
        "(line 1462,col 7)-(line 1462,col 34)",
        "(line 1463,col 7)-(line 1463,col 35)",
        "(line 1464,col 7)-(line 1464,col 44)",
        "(line 1465,col 7)-(line 1484,col 7)",
        "(line 1485,col 7)-(line 1485,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.Osborne2Function.value(double[])",
      "begin_line": 1488,
      "end_line": 1511,
      "comment": "",
      "child_ranges": [
        "(line 1490,col 7)-(line 1490,col 32)",
        "(line 1491,col 7)-(line 1491,col 32)",
        "(line 1492,col 7)-(line 1492,col 32)",
        "(line 1493,col 7)-(line 1493,col 32)",
        "(line 1494,col 7)-(line 1494,col 32)",
        "(line 1495,col 7)-(line 1495,col 32)",
        "(line 1496,col 7)-(line 1496,col 32)",
        "(line 1497,col 7)-(line 1497,col 32)",
        "(line 1498,col 7)-(line 1498,col 32)",
        "(line 1499,col 7)-(line 1499,col 32)",
        "(line 1500,col 7)-(line 1500,col 33)",
        "(line 1501,col 7)-(line 1501,col 33)",
        "(line 1502,col 7)-(line 1509,col 7)",
        "(line 1510,col 7)-(line 1510,col 15)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 1513,
      "end_line": 1527,
      "comment": ""
    }
  ]
}