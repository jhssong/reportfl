{
  "filepath": "/tmp/Math-58b/src/test/java/org/apache/commons/math/optimization/general/MinpackTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MinpackTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 94,
      "end_line": 1530,
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
      "end_line": 510,
      "comment": "",
      "child_ranges": [
        "(line 492,col 7)-(line 495,col 63)",
        "(line 497,col 7)-(line 509,col 7)"
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
      "begin_line": 512,
      "end_line": 594,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 515,
      "end_line": 515,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 516,
      "end_line": 516,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "m"
      ],
      "begin_line": 517,
      "end_line": 517,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "startParams"
      ],
      "begin_line": 518,
      "end_line": 518,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "theoreticalMinCost"
      ],
      "begin_line": 519,
      "end_line": 519,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "theoreticalMinParams"
      ],
      "begin_line": 520,
      "end_line": 520,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "costAccuracy"
      ],
      "begin_line": 521,
      "end_line": 521,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "paramsAccuracy"
      ],
      "begin_line": 522,
      "end_line": 522,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.MinpackFunction(int, double[], double, double[])",
      "begin_line": 524,
      "end_line": 533,
      "comment": "",
      "child_ranges": [
        "(line 526,col 11)-(line 526,col 21)",
        "(line 527,col 11)-(line 527,col 38)",
        "(line 528,col 11)-(line 528,col 58)",
        "(line 529,col 11)-(line 529,col 57)",
        "(line 530,col 11)-(line 530,col 59)",
        "(line 531,col 11)-(line 531,col 45)",
        "(line 532,col 11)-(line 532,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.buildArray(int, double)",
      "begin_line": 535,
      "end_line": 539,
      "comment": "",
      "child_ranges": [
        "(line 536,col 11)-(line 536,col 41)",
        "(line 537,col 11)-(line 537,col 32)",
        "(line 538,col 11)-(line 538,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.getTarget()",
      "begin_line": 541,
      "end_line": 543,
      "comment": "",
      "child_ranges": [
        "(line 542,col 11)-(line 542,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.getWeight()",
      "begin_line": 545,
      "end_line": 547,
      "comment": "",
      "child_ranges": [
        "(line 546,col 11)-(line 546,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.getStartPoint()",
      "begin_line": 549,
      "end_line": 551,
      "comment": "",
      "child_ranges": [
        "(line 550,col 11)-(line 550,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.setCostAccuracy(double)",
      "begin_line": 553,
      "end_line": 555,
      "comment": "",
      "child_ranges": [
        "(line 554,col 11)-(line 554,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.setParamsAccuracy(double)",
      "begin_line": 557,
      "end_line": 559,
      "comment": "",
      "child_ranges": [
        "(line 558,col 11)-(line 558,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.getN()",
      "begin_line": 561,
      "end_line": 563,
      "comment": "",
      "child_ranges": [
        "(line 562,col 11)-(line 562,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.checkTheoreticalMinCost(double)",
      "begin_line": 565,
      "end_line": 568,
      "comment": "",
      "child_ranges": [
        "(line 566,col 11)-(line 566,col 71)",
        "(line 567,col 11)-(line 567,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.checkTheoreticalMinParams(org.apache.commons.math.optimization.VectorialPointValuePair)",
      "begin_line": 570,
      "end_line": 579,
      "comment": "",
      "child_ranges": [
        "(line 571,col 11)-(line 571,col 50)",
        "(line 572,col 11)-(line 578,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.jacobian()",
      "begin_line": 581,
      "end_line": 588,
      "comment": "",
      "child_ranges": [
        "(line 582,col 11)-(line 587,col 12)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 583,
      "end_line": 583,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.Anonymous-ced4e1bc-5cfc-44fa-ab95-b968e0adba23.value(double[])",
      "begin_line": 584,
      "end_line": 586,
      "comment": "",
      "child_ranges": [
        "(line 585,col 19)-(line 585,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.jacobian(double[])",
      "begin_line": 590,
      "end_line": 590,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.value(double[])",
      "begin_line": 592,
      "end_line": 592,
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
      "begin_line": 596,
      "end_line": 635,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 598,
      "end_line": 598,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.LinearFullRankFunction.LinearFullRankFunction(int, int, double, double, double)",
      "begin_line": 600,
      "end_line": 605,
      "comment": "",
      "child_ranges": [
        "(line 603,col 7)-(line 604,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.LinearFullRankFunction.jacobian(double[])",
      "begin_line": 607,
      "end_line": 618,
      "comment": "",
      "child_ranges": [
        "(line 609,col 7)-(line 609,col 25)",
        "(line 610,col 7)-(line 610,col 44)",
        "(line 611,col 7)-(line 616,col 7)",
        "(line 617,col 7)-(line 617,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.LinearFullRankFunction.value(double[])",
      "begin_line": 620,
      "end_line": 633,
      "comment": "",
      "child_ranges": [
        "(line 622,col 7)-(line 622,col 21)",
        "(line 623,col 7)-(line 625,col 7)",
        "(line 626,col 7)-(line 626,col 34)",
        "(line 627,col 7)-(line 627,col 33)",
        "(line 628,col 7)-(line 630,col 7)",
        "(line 631,col 7)-(line 631,col 31)",
        "(line 632,col 7)-(line 632,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LinearRank1Function",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 637,
      "end_line": 672,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 639,
      "end_line": 639,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.LinearRank1Function.LinearRank1Function(int, int, double, double, double)",
      "begin_line": 641,
      "end_line": 645,
      "comment": "",
      "child_ranges": [
        "(line 644,col 7)-(line 644,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.LinearRank1Function.jacobian(double[])",
      "begin_line": 647,
      "end_line": 657,
      "comment": "",
      "child_ranges": [
        "(line 649,col 7)-(line 649,col 44)",
        "(line 650,col 7)-(line 655,col 7)",
        "(line 656,col 7)-(line 656,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.LinearRank1Function.value(double[])",
      "begin_line": 659,
      "end_line": 670,
      "comment": "",
      "child_ranges": [
        "(line 661,col 7)-(line 661,col 33)",
        "(line 662,col 7)-(line 662,col 21)",
        "(line 663,col 7)-(line 665,col 7)",
        "(line 666,col 7)-(line 668,col 7)",
        "(line 669,col 7)-(line 669,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LinearRank1ZeroColsAndRowsFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 674,
      "end_line": 718,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 676,
      "end_line": 676,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.LinearRank1ZeroColsAndRowsFunction.LinearRank1ZeroColsAndRowsFunction(int, int, double)",
      "begin_line": 678,
      "end_line": 682,
      "comment": "",
      "child_ranges": [
        "(line 679,col 7)-(line 681,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.LinearRank1ZeroColsAndRowsFunction.jacobian(double[])",
      "begin_line": 684,
      "end_line": 702,
      "comment": "",
      "child_ranges": [
        "(line 686,col 7)-(line 686,col 44)",
        "(line 687,col 7)-(line 700,col 7)",
        "(line 701,col 7)-(line 701,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.LinearRank1ZeroColsAndRowsFunction.value(double[])",
      "begin_line": 704,
      "end_line": 716,
      "comment": "",
      "child_ranges": [
        "(line 706,col 7)-(line 706,col 33)",
        "(line 707,col 7)-(line 707,col 21)",
        "(line 708,col 7)-(line 710,col 7)",
        "(line 711,col 7)-(line 713,col 7)",
        "(line 714,col 7)-(line 714,col 20)",
        "(line 715,col 7)-(line 715,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RosenbrockFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 720,
      "end_line": 741,
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
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.RosenbrockFunction.RosenbrockFunction(double[], double)",
      "begin_line": 724,
      "end_line": 726,
      "comment": "",
      "child_ranges": [
        "(line 725,col 7)-(line 725,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.RosenbrockFunction.jacobian(double[])",
      "begin_line": 728,
      "end_line": 732,
      "comment": "",
      "child_ranges": [
        "(line 730,col 7)-(line 730,col 31)",
        "(line 731,col 7)-(line 731,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.RosenbrockFunction.value(double[])",
      "begin_line": 734,
      "end_line": 739,
      "comment": "",
      "child_ranges": [
        "(line 736,col 7)-(line 736,col 31)",
        "(line 737,col 7)-(line 737,col 31)",
        "(line 738,col 7)-(line 738,col 58)"
      ]
    },
    {
      "type": "class_interface",
      "name": "HelicalValleyFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 743,
      "end_line": 790,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 745,
      "end_line": 745,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.HelicalValleyFunction.HelicalValleyFunction(double[], double)",
      "begin_line": 747,
      "end_line": 750,
      "comment": "",
      "child_ranges": [
        "(line 749,col 7)-(line 749,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.HelicalValleyFunction.jacobian(double[])",
      "begin_line": 752,
      "end_line": 764,
      "comment": "",
      "child_ranges": [
        "(line 754,col 7)-(line 754,col 31)",
        "(line 755,col 7)-(line 755,col 31)",
        "(line 756,col 7)-(line 756,col 43)",
        "(line 757,col 7)-(line 757,col 38)",
        "(line 758,col 7)-(line 758,col 45)",
        "(line 759,col 7)-(line 763,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.HelicalValleyFunction.value(double[])",
      "begin_line": 766,
      "end_line": 786,
      "comment": "",
      "child_ranges": [
        "(line 768,col 7)-(line 768,col 31)",
        "(line 769,col 7)-(line 769,col 31)",
        "(line 770,col 7)-(line 770,col 31)",
        "(line 771,col 7)-(line 771,col 18)",
        "(line 772,col 7)-(line 779,col 7)",
        "(line 780,col 7)-(line 780,col 53)",
        "(line 781,col 7)-(line 785,col 8)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "twoPi"
      ],
      "begin_line": 788,
      "end_line": 788,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "PowellSingularFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 792,
      "end_line": 832,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 794,
      "end_line": 794,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.PowellSingularFunction.PowellSingularFunction(double[], double)",
      "begin_line": 796,
      "end_line": 799,
      "comment": "",
      "child_ranges": [
        "(line 798,col 7)-(line 798,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.PowellSingularFunction.jacobian(double[])",
      "begin_line": 801,
      "end_line": 813,
      "comment": "",
      "child_ranges": [
        "(line 803,col 7)-(line 803,col 31)",
        "(line 804,col 7)-(line 804,col 31)",
        "(line 805,col 7)-(line 805,col 31)",
        "(line 806,col 7)-(line 806,col 31)",
        "(line 807,col 7)-(line 812,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.PowellSingularFunction.value(double[])",
      "begin_line": 815,
      "end_line": 827,
      "comment": "",
      "child_ranges": [
        "(line 817,col 7)-(line 817,col 31)",
        "(line 818,col 7)-(line 818,col 31)",
        "(line 819,col 7)-(line 819,col 31)",
        "(line 820,col 7)-(line 820,col 31)",
        "(line 821,col 7)-(line 826,col 8)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "sqrt5"
      ],
      "begin_line": 829,
      "end_line": 829,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sqrt10"
      ],
      "begin_line": 830,
      "end_line": 830,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "FreudensteinRothFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 834,
      "end_line": 865,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 836,
      "end_line": 836,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.FreudensteinRothFunction.FreudensteinRothFunction(double[], double, double, double[])",
      "begin_line": 838,
      "end_line": 844,
      "comment": "",
      "child_ranges": [
        "(line 842,col 7)-(line 843,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.FreudensteinRothFunction.jacobian(double[])",
      "begin_line": 846,
      "end_line": 853,
      "comment": "",
      "child_ranges": [
        "(line 848,col 7)-(line 848,col 31)",
        "(line 849,col 7)-(line 852,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.FreudensteinRothFunction.value(double[])",
      "begin_line": 855,
      "end_line": 863,
      "comment": "",
      "child_ranges": [
        "(line 857,col 7)-(line 857,col 31)",
        "(line 858,col 7)-(line 858,col 31)",
        "(line 859,col 7)-(line 862,col 8)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BardFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 867,
      "end_line": 916,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 869,
      "end_line": 869,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.BardFunction.BardFunction(double, double, double, double[])",
      "begin_line": 871,
      "end_line": 877,
      "comment": "",
      "child_ranges": [
        "(line 875,col 7)-(line 876,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.BardFunction.jacobian(double[])",
      "begin_line": 879,
      "end_line": 893,
      "comment": "",
      "child_ranges": [
        "(line 881,col 7)-(line 881,col 33)",
        "(line 882,col 7)-(line 882,col 33)",
        "(line 883,col 7)-(line 883,col 44)",
        "(line 884,col 7)-(line 891,col 7)",
        "(line 892,col 7)-(line 892,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.BardFunction.value(double[])",
      "begin_line": 895,
      "end_line": 908,
      "comment": "",
      "child_ranges": [
        "(line 897,col 7)-(line 897,col 33)",
        "(line 898,col 7)-(line 898,col 33)",
        "(line 899,col 7)-(line 899,col 33)",
        "(line 900,col 7)-(line 900,col 33)",
        "(line 901,col 7)-(line 906,col 7)",
        "(line 907,col 7)-(line 907,col 15)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 910,
      "end_line": 914,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "KowalikOsborneFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 918,
      "end_line": 974,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 920,
      "end_line": 920,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.KowalikOsborneFunction.KowalikOsborneFunction(double[], double, double, double[])",
      "begin_line": 922,
      "end_line": 932,
      "comment": "",
      "child_ranges": [
        "(line 926,col 7)-(line 927,col 34)",
        "(line 928,col 7)-(line 931,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.KowalikOsborneFunction.jacobian(double[])",
      "begin_line": 934,
      "end_line": 950,
      "comment": "",
      "child_ranges": [
        "(line 936,col 7)-(line 936,col 33)",
        "(line 937,col 7)-(line 937,col 33)",
        "(line 938,col 7)-(line 938,col 33)",
        "(line 939,col 7)-(line 939,col 33)",
        "(line 940,col 7)-(line 940,col 44)",
        "(line 941,col 7)-(line 948,col 7)",
        "(line 949,col 7)-(line 949,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.KowalikOsborneFunction.value(double[])",
      "begin_line": 952,
      "end_line": 963,
      "comment": "",
      "child_ranges": [
        "(line 954,col 7)-(line 954,col 31)",
        "(line 955,col 7)-(line 955,col 31)",
        "(line 956,col 7)-(line 956,col 31)",
        "(line 957,col 7)-(line 957,col 31)",
        "(line 958,col 7)-(line 958,col 33)",
        "(line 959,col 7)-(line 961,col 7)",
        "(line 962,col 7)-(line 962,col 15)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "v"
      ],
      "begin_line": 965,
      "end_line": 967,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 969,
      "end_line": 972,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "MeyerFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 976,
      "end_line": 1027,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 978,
      "end_line": 978,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MeyerFunction.MeyerFunction(double[], double, double, double[])",
      "begin_line": 980,
      "end_line": 990,
      "comment": "",
      "child_ranges": [
        "(line 984,col 7)-(line 985,col 34)",
        "(line 986,col 7)-(line 989,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MeyerFunction.jacobian(double[])",
      "begin_line": 992,
      "end_line": 1006,
      "comment": "",
      "child_ranges": [
        "(line 994,col 7)-(line 994,col 33)",
        "(line 995,col 7)-(line 995,col 33)",
        "(line 996,col 7)-(line 996,col 33)",
        "(line 997,col 7)-(line 997,col 44)",
        "(line 998,col 7)-(line 1004,col 7)",
        "(line 1005,col 7)-(line 1005,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MeyerFunction.value(double[])",
      "begin_line": 1008,
      "end_line": 1018,
      "comment": "",
      "child_ranges": [
        "(line 1010,col 7)-(line 1010,col 31)",
        "(line 1011,col 7)-(line 1011,col 31)",
        "(line 1012,col 7)-(line 1012,col 31)",
        "(line 1013,col 7)-(line 1013,col 33)",
        "(line 1014,col 7)-(line 1016,col 7)",
        "(line 1017,col 6)-(line 1017,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 1020,
      "end_line": 1025,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "WatsonFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1029,
      "end_line": 1103,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1031,
      "end_line": 1031,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.WatsonFunction.WatsonFunction(int, double, double, double, double[])",
      "begin_line": 1033,
      "end_line": 1039,
      "comment": "",
      "child_ranges": [
        "(line 1037,col 7)-(line 1038,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.WatsonFunction.jacobian(double[])",
      "begin_line": 1041,
      "end_line": 1072,
      "comment": "",
      "child_ranges": [
        "(line 1044,col 7)-(line 1044,col 44)",
        "(line 1046,col 7)-(line 1061,col 7)",
        "(line 1063,col 7)-(line 1063,col 41)",
        "(line 1064,col 7)-(line 1064,col 29)",
        "(line 1066,col 7)-(line 1066,col 40)",
        "(line 1067,col 7)-(line 1067,col 44)",
        "(line 1068,col 7)-(line 1068,col 28)",
        "(line 1070,col 7)-(line 1070,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.WatsonFunction.value(double[])",
      "begin_line": 1074,
      "end_line": 1101,
      "comment": "",
      "child_ranges": [
        "(line 1076,col 6)-(line 1076,col 32)",
        "(line 1077,col 6)-(line 1092,col 6)",
        "(line 1094,col 6)-(line 1094,col 30)",
        "(line 1095,col 6)-(line 1095,col 30)",
        "(line 1096,col 6)-(line 1096,col 19)",
        "(line 1097,col 6)-(line 1097,col 33)",
        "(line 1099,col 6)-(line 1099,col 14)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Box3DimensionalFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1105,
      "end_line": 1145,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1107,
      "end_line": 1107,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.Box3DimensionalFunction.Box3DimensionalFunction(int, double[], double)",
      "begin_line": 1109,
      "end_line": 1113,
      "comment": "",
      "child_ranges": [
        "(line 1111,col 7)-(line 1112,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.Box3DimensionalFunction.jacobian(double[])",
      "begin_line": 1115,
      "end_line": 1129,
      "comment": "",
      "child_ranges": [
        "(line 1117,col 7)-(line 1117,col 33)",
        "(line 1118,col 7)-(line 1118,col 33)",
        "(line 1119,col 7)-(line 1119,col 44)",
        "(line 1120,col 7)-(line 1127,col 7)",
        "(line 1128,col 7)-(line 1128,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.Box3DimensionalFunction.value(double[])",
      "begin_line": 1131,
      "end_line": 1143,
      "comment": "",
      "child_ranges": [
        "(line 1133,col 7)-(line 1133,col 31)",
        "(line 1134,col 7)-(line 1134,col 31)",
        "(line 1135,col 7)-(line 1135,col 31)",
        "(line 1136,col 7)-(line 1136,col 33)",
        "(line 1137,col 7)-(line 1141,col 7)",
        "(line 1142,col 7)-(line 1142,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "JennrichSampsonFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1147,
      "end_line": 1183,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1149,
      "end_line": 1149,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.JennrichSampsonFunction.JennrichSampsonFunction(int, double[], double, double, double[])",
      "begin_line": 1151,
      "end_line": 1157,
      "comment": "",
      "child_ranges": [
        "(line 1155,col 7)-(line 1156,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.JennrichSampsonFunction.jacobian(double[])",
      "begin_line": 1159,
      "end_line": 1169,
      "comment": "",
      "child_ranges": [
        "(line 1161,col 7)-(line 1161,col 33)",
        "(line 1162,col 7)-(line 1162,col 33)",
        "(line 1163,col 7)-(line 1163,col 44)",
        "(line 1164,col 7)-(line 1167,col 7)",
        "(line 1168,col 7)-(line 1168,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.JennrichSampsonFunction.value(double[])",
      "begin_line": 1171,
      "end_line": 1181,
      "comment": "",
      "child_ranges": [
        "(line 1173,col 7)-(line 1173,col 31)",
        "(line 1174,col 7)-(line 1174,col 31)",
        "(line 1175,col 7)-(line 1175,col 33)",
        "(line 1176,col 7)-(line 1179,col 7)",
        "(line 1180,col 7)-(line 1180,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BrownDennisFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1185,
      "end_line": 1233,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1187,
      "end_line": 1187,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.BrownDennisFunction.BrownDennisFunction(int, double[], double, double, double[])",
      "begin_line": 1189,
      "end_line": 1196,
      "comment": "",
      "child_ranges": [
        "(line 1193,col 7)-(line 1194,col 34)",
        "(line 1195,col 7)-(line 1195,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.BrownDennisFunction.jacobian(double[])",
      "begin_line": 1198,
      "end_line": 1215,
      "comment": "",
      "child_ranges": [
        "(line 1200,col 7)-(line 1200,col 33)",
        "(line 1201,col 7)-(line 1201,col 33)",
        "(line 1202,col 7)-(line 1202,col 33)",
        "(line 1203,col 7)-(line 1203,col 33)",
        "(line 1204,col 7)-(line 1204,col 44)",
        "(line 1205,col 7)-(line 1213,col 7)",
        "(line 1214,col 7)-(line 1214,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.BrownDennisFunction.value(double[])",
      "begin_line": 1217,
      "end_line": 1231,
      "comment": "",
      "child_ranges": [
        "(line 1219,col 7)-(line 1219,col 31)",
        "(line 1220,col 7)-(line 1220,col 31)",
        "(line 1221,col 7)-(line 1221,col 31)",
        "(line 1222,col 7)-(line 1222,col 31)",
        "(line 1223,col 7)-(line 1223,col 33)",
        "(line 1224,col 7)-(line 1229,col 7)",
        "(line 1230,col 7)-(line 1230,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ChebyquadFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1235,
      "end_line": 1317,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1237,
      "end_line": 1237,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.ChebyquadFunction.buildChebyquadArray(int, double)",
      "begin_line": 1239,
      "end_line": 1246,
      "comment": "",
      "child_ranges": [
        "(line 1240,col 7)-(line 1240,col 37)",
        "(line 1241,col 7)-(line 1241,col 36)",
        "(line 1242,col 7)-(line 1244,col 7)",
        "(line 1245,col 7)-(line 1245,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.ChebyquadFunction.ChebyquadFunction(int, int, double, double, double, double[])",
      "begin_line": 1248,
      "end_line": 1254,
      "comment": "",
      "child_ranges": [
        "(line 1252,col 7)-(line 1253,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.ChebyquadFunction.jacobian(double[])",
      "begin_line": 1256,
      "end_line": 1284,
      "comment": "",
      "child_ranges": [
        "(line 1259,col 7)-(line 1259,col 44)",
        "(line 1260,col 7)-(line 1262,col 7)",
        "(line 1264,col 7)-(line 1264,col 26)",
        "(line 1265,col 7)-(line 1280,col 7)",
        "(line 1282,col 7)-(line 1282,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.ChebyquadFunction.value(double[])",
      "begin_line": 1286,
      "end_line": 1315,
      "comment": "",
      "child_ranges": [
        "(line 1289,col 7)-(line 1289,col 33)",
        "(line 1291,col 7)-(line 1301,col 7)",
        "(line 1303,col 7)-(line 1303,col 26)",
        "(line 1304,col 7)-(line 1304,col 26)",
        "(line 1305,col 7)-(line 1311,col 7)",
        "(line 1313,col 7)-(line 1313,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BrownAlmostLinearFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1319,
      "end_line": 1381,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1321,
      "end_line": 1321,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.BrownAlmostLinearFunction.BrownAlmostLinearFunction(int, double, double, double, double[])",
      "begin_line": 1323,
      "end_line": 1329,
      "comment": "",
      "child_ranges": [
        "(line 1327,col 7)-(line 1328,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.BrownAlmostLinearFunction.jacobian(double[])",
      "begin_line": 1331,
      "end_line": 1363,
      "comment": "",
      "child_ranges": [
        "(line 1333,col 7)-(line 1333,col 44)",
        "(line 1334,col 7)-(line 1336,col 7)",
        "(line 1338,col 7)-(line 1338,col 22)",
        "(line 1339,col 7)-(line 1345,col 7)",
        "(line 1347,col 7)-(line 1359,col 7)",
        "(line 1361,col 7)-(line 1361,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.BrownAlmostLinearFunction.value(double[])",
      "begin_line": 1365,
      "end_line": 1379,
      "comment": "",
      "child_ranges": [
        "(line 1367,col 7)-(line 1367,col 33)",
        "(line 1368,col 7)-(line 1368,col 29)",
        "(line 1369,col 7)-(line 1369,col 22)",
        "(line 1370,col 7)-(line 1373,col 7)",
        "(line 1374,col 7)-(line 1376,col 7)",
        "(line 1377,col 7)-(line 1377,col 26)",
        "(line 1378,col 7)-(line 1378,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Osborne1Function",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1383,
      "end_line": 1436,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1385,
      "end_line": 1385,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.Osborne1Function.Osborne1Function(double[], double, double, double[])",
      "begin_line": 1387,
      "end_line": 1393,
      "comment": "",
      "child_ranges": [
        "(line 1391,col 7)-(line 1392,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.Osborne1Function.jacobian(double[])",
      "begin_line": 1395,
      "end_line": 1411,
      "comment": "",
      "child_ranges": [
        "(line 1397,col 7)-(line 1397,col 33)",
        "(line 1398,col 7)-(line 1398,col 33)",
        "(line 1399,col 7)-(line 1399,col 33)",
        "(line 1400,col 7)-(line 1400,col 33)",
        "(line 1401,col 7)-(line 1401,col 44)",
        "(line 1402,col 7)-(line 1409,col 7)",
        "(line 1410,col 7)-(line 1410,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.Osborne1Function.value(double[])",
      "begin_line": 1413,
      "end_line": 1428,
      "comment": "",
      "child_ranges": [
        "(line 1415,col 7)-(line 1415,col 31)",
        "(line 1416,col 7)-(line 1416,col 31)",
        "(line 1417,col 7)-(line 1417,col 31)",
        "(line 1418,col 7)-(line 1418,col 31)",
        "(line 1419,col 7)-(line 1419,col 31)",
        "(line 1420,col 7)-(line 1420,col 33)",
        "(line 1421,col 7)-(line 1426,col 7)",
        "(line 1427,col 7)-(line 1427,col 15)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 1430,
      "end_line": 1434,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Osborne2Function",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1438,
      "end_line": 1528,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1440,
      "end_line": 1440,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.Osborne2Function.Osborne2Function(double[], double, double, double[])",
      "begin_line": 1442,
      "end_line": 1448,
      "comment": "",
      "child_ranges": [
        "(line 1446,col 7)-(line 1447,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.Osborne2Function.jacobian(double[])",
      "begin_line": 1450,
      "end_line": 1485,
      "comment": "",
      "child_ranges": [
        "(line 1452,col 7)-(line 1452,col 34)",
        "(line 1453,col 7)-(line 1453,col 34)",
        "(line 1454,col 7)-(line 1454,col 34)",
        "(line 1455,col 7)-(line 1455,col 34)",
        "(line 1456,col 7)-(line 1456,col 34)",
        "(line 1457,col 7)-(line 1457,col 34)",
        "(line 1458,col 7)-(line 1458,col 34)",
        "(line 1459,col 7)-(line 1459,col 34)",
        "(line 1460,col 7)-(line 1460,col 34)",
        "(line 1461,col 7)-(line 1461,col 34)",
        "(line 1462,col 7)-(line 1462,col 35)",
        "(line 1463,col 7)-(line 1463,col 44)",
        "(line 1464,col 7)-(line 1483,col 7)",
        "(line 1484,col 7)-(line 1484,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.Osborne2Function.value(double[])",
      "begin_line": 1487,
      "end_line": 1510,
      "comment": "",
      "child_ranges": [
        "(line 1489,col 7)-(line 1489,col 32)",
        "(line 1490,col 7)-(line 1490,col 32)",
        "(line 1491,col 7)-(line 1491,col 32)",
        "(line 1492,col 7)-(line 1492,col 32)",
        "(line 1493,col 7)-(line 1493,col 32)",
        "(line 1494,col 7)-(line 1494,col 32)",
        "(line 1495,col 7)-(line 1495,col 32)",
        "(line 1496,col 7)-(line 1496,col 32)",
        "(line 1497,col 7)-(line 1497,col 32)",
        "(line 1498,col 7)-(line 1498,col 32)",
        "(line 1499,col 7)-(line 1499,col 33)",
        "(line 1500,col 7)-(line 1500,col 33)",
        "(line 1501,col 7)-(line 1508,col 7)",
        "(line 1509,col 7)-(line 1509,col 15)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 1512,
      "end_line": 1526,
      "comment": ""
    }
  ]
}