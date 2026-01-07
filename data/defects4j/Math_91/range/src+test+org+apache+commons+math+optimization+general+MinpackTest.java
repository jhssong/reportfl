{
  "filepath": "/tmp/Math-91b/src/test/org/apache/commons/math/optimization/general/MinpackTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MinpackTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 95,
      "end_line": 1542,
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
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 103,col 5)-(line 104,col 74)",
        "(line 105,col 5)-(line 106,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.testMinpackLinearRank1()",
      "begin_line": 109,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 111,col 5)-(line 112,col 83)",
        "(line 113,col 5)-(line 114,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.testMinpackLinearRank1ZeroColsAndRows()",
      "begin_line": 117,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 119,col 5)-(line 119,col 75)",
        "(line 120,col 5)-(line 120,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.testMinpackRosenbrok()",
      "begin_line": 123,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 125,col 5)-(line 126,col 64)",
        "(line 127,col 5)-(line 128,col 69)",
        "(line 129,col 5)-(line 130,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.testMinpackHelicalValley()",
      "begin_line": 133,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 135,col 5)-(line 136,col 56)",
        "(line 137,col 5)-(line 138,col 67)",
        "(line 139,col 5)-(line 140,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.testMinpackPowellSingular()",
      "begin_line": 143,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 145,col 5)-(line 146,col 69)",
        "(line 147,col 5)-(line 148,col 68)",
        "(line 149,col 5)-(line 150,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.testMinpackFreudensteinRoth()",
      "begin_line": 153,
      "end_line": 173,
      "comment": "",
      "child_ranges": [
        "(line 155,col 5)-(line 160,col 56)",
        "(line 161,col 5)-(line 166,col 56)",
        "(line 167,col 5)-(line 172,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.testMinpackBard()",
      "begin_line": 175,
      "end_line": 195,
      "comment": "",
      "child_ranges": [
        "(line 177,col 5)-(line 182,col 44)",
        "(line 183,col 5)-(line 188,col 44)",
        "(line 189,col 5)-(line 194,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.testMinpackKowalikOsborne()",
      "begin_line": 197,
      "end_line": 226,
      "comment": "",
      "child_ranges": [
        "(line 199,col 5)-(line 207,col 54)",
        "(line 208,col 5)-(line 216,col 54)",
        "(line 217,col 5)-(line 225,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.testMinpackMeyer()",
      "begin_line": 228,
      "end_line": 244,
      "comment": "",
      "child_ranges": [
        "(line 230,col 5)-(line 236,col 45)",
        "(line 237,col 5)-(line 243,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.testMinpackWatson()",
      "begin_line": 246,
      "end_line": 330,
      "comment": "",
      "child_ranges": [
        "(line 249,col 5)-(line 255,col 46)",
        "(line 256,col 5)-(line 262,col 46)",
        "(line 263,col 5)-(line 269,col 46)",
        "(line 271,col 5)-(line 279,col 46)",
        "(line 280,col 5)-(line 288,col 46)",
        "(line 289,col 5)-(line 297,col 46)",
        "(line 299,col 5)-(line 308,col 46)",
        "(line 309,col 5)-(line 318,col 46)",
        "(line 319,col 5)-(line 328,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.testMinpackBox3Dimensional()",
      "begin_line": 332,
      "end_line": 336,
      "comment": "",
      "child_ranges": [
        "(line 334,col 5)-(line 335,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.testMinpackJennrichSampson()",
      "begin_line": 338,
      "end_line": 345,
      "comment": "",
      "child_ranges": [
        "(line 340,col 5)-(line 344,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.testMinpackBrownDennis()",
      "begin_line": 347,
      "end_line": 370,
      "comment": "",
      "child_ranges": [
        "(line 349,col 5)-(line 355,col 51)",
        "(line 356,col 5)-(line 362,col 50)",
        "(line 363,col 5)-(line 369,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.testMinpackChebyquad()",
      "begin_line": 372,
      "end_line": 409,
      "comment": "",
      "child_ranges": [
        "(line 374,col 5)-(line 376,col 68)",
        "(line 377,col 5)-(line 379,col 80)",
        "(line 380,col 5)-(line 382,col 80)",
        "(line 383,col 5)-(line 390,col 49)",
        "(line 391,col 5)-(line 399,col 49)",
        "(line 400,col 5)-(line 408,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.testMinpackBrownAlmostLinear()",
      "begin_line": 411,
      "end_line": 478,
      "comment": "",
      "child_ranges": [
        "(line 413,col 5)-(line 421,col 57)",
        "(line 422,col 5)-(line 430,col 57)",
        "(line 431,col 5)-(line 436,col 57)",
        "(line 437,col 5)-(line 455,col 57)",
        "(line 456,col 5)-(line 477,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.testMinpackOsborne1()",
      "begin_line": 480,
      "end_line": 489,
      "comment": "",
      "child_ranges": [
        "(line 482,col 7)-(line 488,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.testMinpackOsborne2()",
      "begin_line": 491,
      "end_line": 507,
      "comment": "",
      "child_ranges": [
        "(line 494,col 5)-(line 506,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.minpackTest(org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction, boolean)",
      "begin_line": 509,
      "end_line": 529,
      "comment": "",
      "child_ranges": [
        "(line 510,col 7)-(line 510,col 80)",
        "(line 511,col 7)-(line 511,col 62)",
        "(line 512,col 7)-(line 512,col 71)",
        "(line 513,col 7)-(line 513,col 70)",
        "(line 514,col 7)-(line 514,col 53)",
        "(line 516,col 7)-(line 528,col 7)"
      ]
    },
    {
      "type": "class_interface",
      "name": "MinpackFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction"
      ],
      "begin_line": 531,
      "end_line": 639,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 534,
      "end_line": 534,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 535,
      "end_line": 535,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "m"
      ],
      "begin_line": 536,
      "end_line": 536,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "startParams"
      ],
      "begin_line": 537,
      "end_line": 537,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "theoreticalMinCost"
      ],
      "begin_line": 538,
      "end_line": 538,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "theoreticalMinParams"
      ],
      "begin_line": 539,
      "end_line": 539,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "costAccuracy"
      ],
      "begin_line": 540,
      "end_line": 540,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "paramsAccuracy"
      ],
      "begin_line": 541,
      "end_line": 541,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.MinpackFunction(int, double[], double, double[])",
      "begin_line": 543,
      "end_line": 552,
      "comment": "",
      "child_ranges": [
        "(line 545,col 11)-(line 545,col 21)",
        "(line 546,col 11)-(line 546,col 38)",
        "(line 547,col 11)-(line 547,col 58)",
        "(line 548,col 11)-(line 548,col 57)",
        "(line 549,col 11)-(line 549,col 59)",
        "(line 550,col 11)-(line 550,col 45)",
        "(line 551,col 11)-(line 551,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.buildArray(int, double)",
      "begin_line": 554,
      "end_line": 558,
      "comment": "",
      "child_ranges": [
        "(line 555,col 11)-(line 555,col 41)",
        "(line 556,col 11)-(line 556,col 32)",
        "(line 557,col 11)-(line 557,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.getTarget()",
      "begin_line": 560,
      "end_line": 562,
      "comment": "",
      "child_ranges": [
        "(line 561,col 11)-(line 561,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.getWeight()",
      "begin_line": 564,
      "end_line": 566,
      "comment": "",
      "child_ranges": [
        "(line 565,col 11)-(line 565,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.getStartPoint()",
      "begin_line": 568,
      "end_line": 570,
      "comment": "",
      "child_ranges": [
        "(line 569,col 11)-(line 569,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.setCostAccuracy(double)",
      "begin_line": 572,
      "end_line": 574,
      "comment": "",
      "child_ranges": [
        "(line 573,col 11)-(line 573,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.setParamsAccuracy(double)",
      "begin_line": 576,
      "end_line": 578,
      "comment": "",
      "child_ranges": [
        "(line 577,col 11)-(line 577,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.getN()",
      "begin_line": 580,
      "end_line": 582,
      "comment": "",
      "child_ranges": [
        "(line 581,col 11)-(line 581,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.checkTheoreticalMinCost(double)",
      "begin_line": 584,
      "end_line": 587,
      "comment": "",
      "child_ranges": [
        "(line 585,col 11)-(line 585,col 71)",
        "(line 586,col 11)-(line 586,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.checkTheoreticalMinParams(org.apache.commons.math.optimization.VectorialPointValuePair)",
      "begin_line": 589,
      "end_line": 601,
      "comment": "",
      "child_ranges": [
        "(line 590,col 11)-(line 590,col 50)",
        "(line 591,col 11)-(line 599,col 11)",
        "(line 600,col 11)-(line 600,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.partialDerivative(int)",
      "begin_line": 603,
      "end_line": 615,
      "comment": "",
      "child_ranges": [
        "(line 604,col 11)-(line 614,col 12)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 605,
      "end_line": 605,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.Anonymous-c298f29c-9bcd-47cb-a1ad-86cb0e24673b.value(double[])",
      "begin_line": 606,
      "end_line": 613,
      "comment": "",
      "child_ranges": [
        "(line 607,col 19)-(line 607,col 49)",
        "(line 608,col 19)-(line 608,col 58)",
        "(line 609,col 19)-(line 611,col 19)",
        "(line 612,col 19)-(line 612,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.gradient(int)",
      "begin_line": 617,
      "end_line": 624,
      "comment": "",
      "child_ranges": [
        "(line 618,col 11)-(line 623,col 12)"
      ]
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
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.Anonymous-7faa3c66-fd60-4e18-ba13-9cee32898776.value(double[])",
      "begin_line": 620,
      "end_line": 622,
      "comment": "",
      "child_ranges": [
        "(line 621,col 19)-(line 621,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.jacobian()",
      "begin_line": 626,
      "end_line": 633,
      "comment": "",
      "child_ranges": [
        "(line 627,col 11)-(line 632,col 12)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 628,
      "end_line": 628,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.Anonymous-29ca6cbf-59a2-4aa5-bfc8-21fc9ad2cb4d.value(double[])",
      "begin_line": 629,
      "end_line": 631,
      "comment": "",
      "child_ranges": [
        "(line 630,col 19)-(line 630,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.jacobian(double[])",
      "begin_line": 635,
      "end_line": 635,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.value(double[])",
      "begin_line": 637,
      "end_line": 637,
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
      "begin_line": 641,
      "end_line": 678,
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
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.LinearFullRankFunction.LinearFullRankFunction(int, int, double, double, double)",
      "begin_line": 645,
      "end_line": 650,
      "comment": "",
      "child_ranges": [
        "(line 648,col 7)-(line 649,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.LinearFullRankFunction.jacobian(double[])",
      "begin_line": 652,
      "end_line": 662,
      "comment": "",
      "child_ranges": [
        "(line 653,col 7)-(line 653,col 25)",
        "(line 654,col 7)-(line 654,col 44)",
        "(line 655,col 7)-(line 660,col 7)",
        "(line 661,col 7)-(line 661,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.LinearFullRankFunction.value(double[])",
      "begin_line": 664,
      "end_line": 676,
      "comment": "",
      "child_ranges": [
        "(line 665,col 7)-(line 665,col 21)",
        "(line 666,col 7)-(line 668,col 7)",
        "(line 669,col 7)-(line 669,col 34)",
        "(line 670,col 7)-(line 670,col 33)",
        "(line 671,col 7)-(line 673,col 7)",
        "(line 674,col 7)-(line 674,col 31)",
        "(line 675,col 7)-(line 675,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LinearRank1Function",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 680,
      "end_line": 713,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 682,
      "end_line": 682,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.LinearRank1Function.LinearRank1Function(int, int, double, double, double)",
      "begin_line": 684,
      "end_line": 688,
      "comment": "",
      "child_ranges": [
        "(line 687,col 7)-(line 687,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.LinearRank1Function.jacobian(double[])",
      "begin_line": 690,
      "end_line": 699,
      "comment": "",
      "child_ranges": [
        "(line 691,col 7)-(line 691,col 44)",
        "(line 692,col 7)-(line 697,col 7)",
        "(line 698,col 7)-(line 698,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.LinearRank1Function.value(double[])",
      "begin_line": 701,
      "end_line": 711,
      "comment": "",
      "child_ranges": [
        "(line 702,col 7)-(line 702,col 33)",
        "(line 703,col 7)-(line 703,col 21)",
        "(line 704,col 7)-(line 706,col 7)",
        "(line 707,col 7)-(line 709,col 7)",
        "(line 710,col 7)-(line 710,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LinearRank1ZeroColsAndRowsFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 715,
      "end_line": 757,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 717,
      "end_line": 717,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.LinearRank1ZeroColsAndRowsFunction.LinearRank1ZeroColsAndRowsFunction(int, int, double)",
      "begin_line": 719,
      "end_line": 723,
      "comment": "",
      "child_ranges": [
        "(line 720,col 7)-(line 722,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.LinearRank1ZeroColsAndRowsFunction.jacobian(double[])",
      "begin_line": 725,
      "end_line": 742,
      "comment": "",
      "child_ranges": [
        "(line 726,col 7)-(line 726,col 44)",
        "(line 727,col 7)-(line 740,col 7)",
        "(line 741,col 7)-(line 741,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.LinearRank1ZeroColsAndRowsFunction.value(double[])",
      "begin_line": 744,
      "end_line": 755,
      "comment": "",
      "child_ranges": [
        "(line 745,col 7)-(line 745,col 33)",
        "(line 746,col 7)-(line 746,col 21)",
        "(line 747,col 7)-(line 749,col 7)",
        "(line 750,col 7)-(line 752,col 7)",
        "(line 753,col 7)-(line 753,col 20)",
        "(line 754,col 7)-(line 754,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RosenbrockFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 759,
      "end_line": 778,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 761,
      "end_line": 761,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.RosenbrockFunction.RosenbrockFunction(double[], double)",
      "begin_line": 763,
      "end_line": 765,
      "comment": "",
      "child_ranges": [
        "(line 764,col 7)-(line 764,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.RosenbrockFunction.jacobian(double[])",
      "begin_line": 767,
      "end_line": 770,
      "comment": "",
      "child_ranges": [
        "(line 768,col 7)-(line 768,col 31)",
        "(line 769,col 7)-(line 769,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.RosenbrockFunction.value(double[])",
      "begin_line": 772,
      "end_line": 776,
      "comment": "",
      "child_ranges": [
        "(line 773,col 7)-(line 773,col 31)",
        "(line 774,col 7)-(line 774,col 31)",
        "(line 775,col 7)-(line 775,col 58)"
      ]
    },
    {
      "type": "class_interface",
      "name": "HelicalValleyFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 780,
      "end_line": 825,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 782,
      "end_line": 782,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.HelicalValleyFunction.HelicalValleyFunction(double[], double)",
      "begin_line": 784,
      "end_line": 787,
      "comment": "",
      "child_ranges": [
        "(line 786,col 7)-(line 786,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.HelicalValleyFunction.jacobian(double[])",
      "begin_line": 789,
      "end_line": 800,
      "comment": "",
      "child_ranges": [
        "(line 790,col 7)-(line 790,col 31)",
        "(line 791,col 7)-(line 791,col 31)",
        "(line 792,col 7)-(line 792,col 43)",
        "(line 793,col 7)-(line 793,col 38)",
        "(line 794,col 7)-(line 794,col 41)",
        "(line 795,col 7)-(line 799,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.HelicalValleyFunction.value(double[])",
      "begin_line": 802,
      "end_line": 821,
      "comment": "",
      "child_ranges": [
        "(line 803,col 7)-(line 803,col 31)",
        "(line 804,col 7)-(line 804,col 31)",
        "(line 805,col 7)-(line 805,col 31)",
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
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 827,
      "end_line": 865,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 829,
      "end_line": 829,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.PowellSingularFunction.PowellSingularFunction(double[], double)",
      "begin_line": 831,
      "end_line": 834,
      "comment": "",
      "child_ranges": [
        "(line 833,col 7)-(line 833,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.PowellSingularFunction.jacobian(double[])",
      "begin_line": 836,
      "end_line": 847,
      "comment": "",
      "child_ranges": [
        "(line 837,col 7)-(line 837,col 31)",
        "(line 838,col 7)-(line 838,col 31)",
        "(line 839,col 7)-(line 839,col 31)",
        "(line 840,col 7)-(line 840,col 31)",
        "(line 841,col 7)-(line 846,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.PowellSingularFunction.value(double[])",
      "begin_line": 849,
      "end_line": 860,
      "comment": "",
      "child_ranges": [
        "(line 850,col 7)-(line 850,col 31)",
        "(line 851,col 7)-(line 851,col 31)",
        "(line 852,col 7)-(line 852,col 31)",
        "(line 853,col 7)-(line 853,col 31)",
        "(line 854,col 7)-(line 859,col 8)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "sqrt5"
      ],
      "begin_line": 862,
      "end_line": 862,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sqrt10"
      ],
      "begin_line": 863,
      "end_line": 863,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "FreudensteinRothFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 867,
      "end_line": 896,
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
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.FreudensteinRothFunction.FreudensteinRothFunction(double[], double, double, double[])",
      "begin_line": 871,
      "end_line": 877,
      "comment": "",
      "child_ranges": [
        "(line 875,col 7)-(line 876,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.FreudensteinRothFunction.jacobian(double[])",
      "begin_line": 879,
      "end_line": 885,
      "comment": "",
      "child_ranges": [
        "(line 880,col 7)-(line 880,col 31)",
        "(line 881,col 7)-(line 884,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.FreudensteinRothFunction.value(double[])",
      "begin_line": 887,
      "end_line": 894,
      "comment": "",
      "child_ranges": [
        "(line 888,col 7)-(line 888,col 31)",
        "(line 889,col 7)-(line 889,col 31)",
        "(line 890,col 7)-(line 893,col 8)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BardFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 898,
      "end_line": 945,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 900,
      "end_line": 900,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.BardFunction.BardFunction(double, double, double, double[])",
      "begin_line": 902,
      "end_line": 908,
      "comment": "",
      "child_ranges": [
        "(line 906,col 7)-(line 907,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.BardFunction.jacobian(double[])",
      "begin_line": 910,
      "end_line": 923,
      "comment": "",
      "child_ranges": [
        "(line 911,col 7)-(line 911,col 33)",
        "(line 912,col 7)-(line 912,col 33)",
        "(line 913,col 7)-(line 913,col 44)",
        "(line 914,col 7)-(line 921,col 7)",
        "(line 922,col 7)-(line 922,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.BardFunction.value(double[])",
      "begin_line": 925,
      "end_line": 937,
      "comment": "",
      "child_ranges": [
        "(line 926,col 7)-(line 926,col 33)",
        "(line 927,col 7)-(line 927,col 33)",
        "(line 928,col 7)-(line 928,col 33)",
        "(line 929,col 7)-(line 929,col 33)",
        "(line 930,col 7)-(line 935,col 7)",
        "(line 936,col 7)-(line 936,col 15)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 939,
      "end_line": 943,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "KowalikOsborneFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 947,
      "end_line": 1001,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 949,
      "end_line": 949,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.KowalikOsborneFunction.KowalikOsborneFunction(double[], double, double, double[])",
      "begin_line": 951,
      "end_line": 961,
      "comment": "",
      "child_ranges": [
        "(line 955,col 7)-(line 956,col 34)",
        "(line 957,col 7)-(line 960,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.KowalikOsborneFunction.jacobian(double[])",
      "begin_line": 963,
      "end_line": 978,
      "comment": "",
      "child_ranges": [
        "(line 964,col 7)-(line 964,col 33)",
        "(line 965,col 7)-(line 965,col 33)",
        "(line 966,col 7)-(line 966,col 33)",
        "(line 967,col 7)-(line 967,col 33)",
        "(line 968,col 7)-(line 968,col 44)",
        "(line 969,col 7)-(line 976,col 7)",
        "(line 977,col 7)-(line 977,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.KowalikOsborneFunction.value(double[])",
      "begin_line": 980,
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
      "end_line": 1052,
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
      "end_line": 1032,
      "comment": "",
      "child_ranges": [
        "(line 1020,col 7)-(line 1020,col 33)",
        "(line 1021,col 7)-(line 1021,col 33)",
        "(line 1022,col 7)-(line 1022,col 33)",
        "(line 1023,col 7)-(line 1023,col 44)",
        "(line 1024,col 7)-(line 1030,col 7)",
        "(line 1031,col 7)-(line 1031,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MeyerFunction.value(double[])",
      "begin_line": 1034,
      "end_line": 1043,
      "comment": "",
      "child_ranges": [
        "(line 1035,col 7)-(line 1035,col 31)",
        "(line 1036,col 7)-(line 1036,col 31)",
        "(line 1037,col 7)-(line 1037,col 31)",
        "(line 1038,col 7)-(line 1038,col 33)",
        "(line 1039,col 7)-(line 1041,col 7)",
        "(line 1042,col 6)-(line 1042,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 1045,
      "end_line": 1050,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "WatsonFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1054,
      "end_line": 1126,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1056,
      "end_line": 1056,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.WatsonFunction.WatsonFunction(int, double, double, double, double[])",
      "begin_line": 1058,
      "end_line": 1064,
      "comment": "",
      "child_ranges": [
        "(line 1062,col 7)-(line 1063,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.WatsonFunction.jacobian(double[])",
      "begin_line": 1066,
      "end_line": 1096,
      "comment": "",
      "child_ranges": [
        "(line 1068,col 7)-(line 1068,col 44)",
        "(line 1070,col 7)-(line 1085,col 7)",
        "(line 1087,col 7)-(line 1087,col 41)",
        "(line 1088,col 7)-(line 1088,col 29)",
        "(line 1090,col 7)-(line 1090,col 40)",
        "(line 1091,col 7)-(line 1091,col 44)",
        "(line 1092,col 7)-(line 1092,col 28)",
        "(line 1094,col 7)-(line 1094,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.WatsonFunction.value(double[])",
      "begin_line": 1098,
      "end_line": 1124,
      "comment": "",
      "child_ranges": [
        "(line 1099,col 6)-(line 1099,col 32)",
        "(line 1100,col 6)-(line 1115,col 6)",
        "(line 1117,col 6)-(line 1117,col 30)",
        "(line 1118,col 6)-(line 1118,col 30)",
        "(line 1119,col 6)-(line 1119,col 19)",
        "(line 1120,col 6)-(line 1120,col 33)",
        "(line 1122,col 6)-(line 1122,col 14)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Box3DimensionalFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1128,
      "end_line": 1166,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1130,
      "end_line": 1130,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.Box3DimensionalFunction.Box3DimensionalFunction(int, double[], double)",
      "begin_line": 1132,
      "end_line": 1136,
      "comment": "",
      "child_ranges": [
        "(line 1134,col 7)-(line 1135,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.Box3DimensionalFunction.jacobian(double[])",
      "begin_line": 1138,
      "end_line": 1151,
      "comment": "",
      "child_ranges": [
        "(line 1139,col 7)-(line 1139,col 33)",
        "(line 1140,col 7)-(line 1140,col 33)",
        "(line 1141,col 7)-(line 1141,col 44)",
        "(line 1142,col 7)-(line 1149,col 7)",
        "(line 1150,col 7)-(line 1150,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.Box3DimensionalFunction.value(double[])",
      "begin_line": 1153,
      "end_line": 1164,
      "comment": "",
      "child_ranges": [
        "(line 1154,col 7)-(line 1154,col 31)",
        "(line 1155,col 7)-(line 1155,col 31)",
        "(line 1156,col 7)-(line 1156,col 31)",
        "(line 1157,col 7)-(line 1157,col 33)",
        "(line 1158,col 7)-(line 1162,col 7)",
        "(line 1163,col 7)-(line 1163,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "JennrichSampsonFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1168,
      "end_line": 1202,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1170,
      "end_line": 1170,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.JennrichSampsonFunction.JennrichSampsonFunction(int, double[], double, double, double[])",
      "begin_line": 1172,
      "end_line": 1178,
      "comment": "",
      "child_ranges": [
        "(line 1176,col 7)-(line 1177,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.JennrichSampsonFunction.jacobian(double[])",
      "begin_line": 1180,
      "end_line": 1189,
      "comment": "",
      "child_ranges": [
        "(line 1181,col 7)-(line 1181,col 33)",
        "(line 1182,col 7)-(line 1182,col 33)",
        "(line 1183,col 7)-(line 1183,col 44)",
        "(line 1184,col 7)-(line 1187,col 7)",
        "(line 1188,col 7)-(line 1188,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.JennrichSampsonFunction.value(double[])",
      "begin_line": 1191,
      "end_line": 1200,
      "comment": "",
      "child_ranges": [
        "(line 1192,col 7)-(line 1192,col 31)",
        "(line 1193,col 7)-(line 1193,col 31)",
        "(line 1194,col 7)-(line 1194,col 33)",
        "(line 1195,col 7)-(line 1198,col 7)",
        "(line 1199,col 7)-(line 1199,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BrownDennisFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1204,
      "end_line": 1249,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1206,
      "end_line": 1206,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.BrownDennisFunction.BrownDennisFunction(int, double[], double, double, double[])",
      "begin_line": 1208,
      "end_line": 1214,
      "comment": "",
      "child_ranges": [
        "(line 1212,col 7)-(line 1213,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.BrownDennisFunction.jacobian(double[])",
      "begin_line": 1216,
      "end_line": 1232,
      "comment": "",
      "child_ranges": [
        "(line 1217,col 7)-(line 1217,col 33)",
        "(line 1218,col 7)-(line 1218,col 33)",
        "(line 1219,col 7)-(line 1219,col 33)",
        "(line 1220,col 7)-(line 1220,col 33)",
        "(line 1221,col 7)-(line 1221,col 44)",
        "(line 1222,col 7)-(line 1230,col 7)",
        "(line 1231,col 7)-(line 1231,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.BrownDennisFunction.value(double[])",
      "begin_line": 1234,
      "end_line": 1247,
      "comment": "",
      "child_ranges": [
        "(line 1235,col 7)-(line 1235,col 31)",
        "(line 1236,col 7)-(line 1236,col 31)",
        "(line 1237,col 7)-(line 1237,col 31)",
        "(line 1238,col 7)-(line 1238,col 31)",
        "(line 1239,col 7)-(line 1239,col 33)",
        "(line 1240,col 7)-(line 1245,col 7)",
        "(line 1246,col 7)-(line 1246,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ChebyquadFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1251,
      "end_line": 1331,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1253,
      "end_line": 1253,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.ChebyquadFunction.buildChebyquadArray(int, double)",
      "begin_line": 1255,
      "end_line": 1262,
      "comment": "",
      "child_ranges": [
        "(line 1256,col 7)-(line 1256,col 37)",
        "(line 1257,col 7)-(line 1257,col 36)",
        "(line 1258,col 7)-(line 1260,col 7)",
        "(line 1261,col 7)-(line 1261,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.ChebyquadFunction.ChebyquadFunction(int, int, double, double, double, double[])",
      "begin_line": 1264,
      "end_line": 1270,
      "comment": "",
      "child_ranges": [
        "(line 1268,col 7)-(line 1269,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.ChebyquadFunction.jacobian(double[])",
      "begin_line": 1272,
      "end_line": 1299,
      "comment": "",
      "child_ranges": [
        "(line 1274,col 7)-(line 1274,col 44)",
        "(line 1275,col 7)-(line 1277,col 7)",
        "(line 1279,col 7)-(line 1279,col 26)",
        "(line 1280,col 7)-(line 1295,col 7)",
        "(line 1297,col 7)-(line 1297,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.ChebyquadFunction.value(double[])",
      "begin_line": 1301,
      "end_line": 1329,
      "comment": "",
      "child_ranges": [
        "(line 1303,col 7)-(line 1303,col 33)",
        "(line 1305,col 7)-(line 1315,col 7)",
        "(line 1317,col 7)-(line 1317,col 26)",
        "(line 1318,col 7)-(line 1318,col 26)",
        "(line 1319,col 7)-(line 1325,col 7)",
        "(line 1327,col 7)-(line 1327,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BrownAlmostLinearFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1333,
      "end_line": 1393,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1335,
      "end_line": 1335,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.BrownAlmostLinearFunction.BrownAlmostLinearFunction(int, double, double, double, double[])",
      "begin_line": 1337,
      "end_line": 1343,
      "comment": "",
      "child_ranges": [
        "(line 1341,col 7)-(line 1342,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.BrownAlmostLinearFunction.jacobian(double[])",
      "begin_line": 1345,
      "end_line": 1376,
      "comment": "",
      "child_ranges": [
        "(line 1346,col 7)-(line 1346,col 44)",
        "(line 1347,col 7)-(line 1349,col 7)",
        "(line 1351,col 7)-(line 1351,col 22)",
        "(line 1352,col 7)-(line 1358,col 7)",
        "(line 1360,col 7)-(line 1372,col 7)",
        "(line 1374,col 7)-(line 1374,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.BrownAlmostLinearFunction.value(double[])",
      "begin_line": 1378,
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
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1395,
      "end_line": 1446,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1397,
      "end_line": 1397,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.Osborne1Function.Osborne1Function(double[], double, double, double[])",
      "begin_line": 1399,
      "end_line": 1405,
      "comment": "",
      "child_ranges": [
        "(line 1403,col 7)-(line 1404,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.Osborne1Function.jacobian(double[])",
      "begin_line": 1407,
      "end_line": 1422,
      "comment": "",
      "child_ranges": [
        "(line 1408,col 7)-(line 1408,col 33)",
        "(line 1409,col 7)-(line 1409,col 33)",
        "(line 1410,col 7)-(line 1410,col 33)",
        "(line 1411,col 7)-(line 1411,col 33)",
        "(line 1412,col 7)-(line 1412,col 44)",
        "(line 1413,col 7)-(line 1420,col 7)",
        "(line 1421,col 7)-(line 1421,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.Osborne1Function.value(double[])",
      "begin_line": 1424,
      "end_line": 1438,
      "comment": "",
      "child_ranges": [
        "(line 1425,col 7)-(line 1425,col 31)",
        "(line 1426,col 7)-(line 1426,col 31)",
        "(line 1427,col 7)-(line 1427,col 31)",
        "(line 1428,col 7)-(line 1428,col 31)",
        "(line 1429,col 7)-(line 1429,col 31)",
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
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1448,
      "end_line": 1536,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1450,
      "end_line": 1450,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.Osborne2Function.Osborne2Function(double[], double, double, double[])",
      "begin_line": 1452,
      "end_line": 1458,
      "comment": "",
      "child_ranges": [
        "(line 1456,col 7)-(line 1457,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.Osborne2Function.jacobian(double[])",
      "begin_line": 1460,
      "end_line": 1494,
      "comment": "",
      "child_ranges": [
        "(line 1461,col 7)-(line 1461,col 34)",
        "(line 1462,col 7)-(line 1462,col 34)",
        "(line 1463,col 7)-(line 1463,col 34)",
        "(line 1464,col 7)-(line 1464,col 34)",
        "(line 1465,col 7)-(line 1465,col 34)",
        "(line 1466,col 7)-(line 1466,col 34)",
        "(line 1467,col 7)-(line 1467,col 34)",
        "(line 1468,col 7)-(line 1468,col 34)",
        "(line 1469,col 7)-(line 1469,col 34)",
        "(line 1470,col 7)-(line 1470,col 34)",
        "(line 1471,col 7)-(line 1471,col 35)",
        "(line 1472,col 7)-(line 1472,col 44)",
        "(line 1473,col 7)-(line 1492,col 7)",
        "(line 1493,col 7)-(line 1493,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.Osborne2Function.value(double[])",
      "begin_line": 1496,
      "end_line": 1518,
      "comment": "",
      "child_ranges": [
        "(line 1497,col 7)-(line 1497,col 32)",
        "(line 1498,col 7)-(line 1498,col 32)",
        "(line 1499,col 7)-(line 1499,col 32)",
        "(line 1500,col 7)-(line 1500,col 32)",
        "(line 1501,col 7)-(line 1501,col 32)",
        "(line 1502,col 7)-(line 1502,col 32)",
        "(line 1503,col 7)-(line 1503,col 32)",
        "(line 1504,col 7)-(line 1504,col 32)",
        "(line 1505,col 7)-(line 1505,col 32)",
        "(line 1506,col 7)-(line 1506,col 32)",
        "(line 1507,col 7)-(line 1507,col 33)",
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
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.suite()",
      "begin_line": 1538,
      "end_line": 1540,
      "comment": "",
      "child_ranges": [
        "(line 1539,col 5)-(line 1539,col 44)"
      ]
    }
  ]
}