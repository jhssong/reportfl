{
  "filepath": "/tmp/Math-74b/src/test/java/org/apache/commons/math/optimization/general/MinpackTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MinpackTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 93,
      "end_line": 1532,
      "comment": "\n * \u003cp\u003eSome of the unit tests are re-implementations of the MINPACK \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file17\"\u003efile17\u003c/a\u003e and \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file22\"\u003efile22\u003c/a\u003e test files.\n * The redistribution policy for MINPACK is available \u003ca\n * href\u003d\"http://www.netlib.org/minpack/disclaimer\"\u003ehere\u003c/a\u003e, for\n * convenience, it is reproduced below.\u003c/p\u003e\n\n * \u003ctable border\u003d\"0\" width\u003d\"80%\" cellpadding\u003d\"10\" align\u003d\"center\" bgcolor\u003d\"#E0E0E0\"\u003e\n * \u003ctr\u003e\u003ctd\u003e\n *    Minpack Copyright Notice (1999) University of Chicago.\n *    All rights reserved\n * \u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003e\n * Redistribution and use in source and binary forms, with or without\n * modification, are permitted provided that the following conditions\n * are met:\n * \u003col\u003e\n *  \u003cli\u003eRedistributions of source code must retain the above copyright\n *      notice, this list of conditions and the following disclaimer.\u003c/li\u003e\n * \u003cli\u003eRedistributions in binary form must reproduce the above\n *     copyright notice, this list of conditions and the following\n *     disclaimer in the documentation and/or other materials provided\n *     with the distribution.\u003c/li\u003e\n * \u003cli\u003eThe end-user documentation included with the redistribution, if any,\n *     must include the following acknowledgment:\n *     \u003ccode\u003eThis product includes software developed by the University of\n *           Chicago, as Operator of Argonne National Laboratory.\u003c/code\u003e\n *     Alternately, this acknowledgment may appear in the software itself,\n *     if and wherever such third-party acknowledgments normally appear.\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eWARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED \"AS IS\"\n *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE\n *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND\n *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR\n *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES\n *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE\n *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY\n *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR\n *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF\n *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)\n *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION\n *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL\n *     BE CORRECTED.\u003c/strong\u003e\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eLIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT\n *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF\n *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,\n *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF\n *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF\n *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER\n *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT\n *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,\n *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE\n *     POSSIBILITY OF SUCH LOSS OR DAMAGES.\u003c/strong\u003e\u003c/li\u003e\n * \u003col\u003e\u003c/td\u003e\u003c/tr\u003e\n * \u003c/table\u003e\n\n * @author Argonne National Laboratory. MINPACK project. March 1980 (original fortran minpack tests)\n * @author Burton S. Garbow (original fortran minpack tests)\n * @author Kenneth E. Hillstrom (original fortran minpack tests)\n * @author Jorge J. More (original fortran minpack tests)\n * @author Luc Maisonobe (non-minpack tests and minpack tests Java translation)\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackTest(java.lang.String)",
      "begin_line": 95,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 96,col 5)-(line 96,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.testMinpackLinearFullRank()",
      "begin_line": 99,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 100,col 5)-(line 101,col 74)",
        "(line 102,col 5)-(line 103,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.testMinpackLinearRank1()",
      "begin_line": 106,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 107,col 5)-(line 108,col 83)",
        "(line 109,col 5)-(line 110,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.testMinpackLinearRank1ZeroColsAndRows()",
      "begin_line": 113,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 114,col 5)-(line 114,col 75)",
        "(line 115,col 5)-(line 115,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.testMinpackRosenbrok()",
      "begin_line": 118,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 119,col 5)-(line 120,col 64)",
        "(line 121,col 5)-(line 122,col 69)",
        "(line 123,col 5)-(line 124,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.testMinpackHelicalValley()",
      "begin_line": 127,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 128,col 5)-(line 129,col 56)",
        "(line 130,col 5)-(line 131,col 67)",
        "(line 132,col 5)-(line 133,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.testMinpackPowellSingular()",
      "begin_line": 136,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 137,col 5)-(line 138,col 69)",
        "(line 139,col 5)-(line 140,col 68)",
        "(line 141,col 5)-(line 142,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.testMinpackFreudensteinRoth()",
      "begin_line": 145,
      "end_line": 164,
      "comment": "",
      "child_ranges": [
        "(line 146,col 5)-(line 151,col 56)",
        "(line 152,col 5)-(line 157,col 56)",
        "(line 158,col 5)-(line 163,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.testMinpackBard()",
      "begin_line": 166,
      "end_line": 185,
      "comment": "",
      "child_ranges": [
        "(line 167,col 5)-(line 172,col 44)",
        "(line 173,col 5)-(line 178,col 44)",
        "(line 179,col 5)-(line 184,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.testMinpackKowalikOsborne()",
      "begin_line": 187,
      "end_line": 215,
      "comment": "",
      "child_ranges": [
        "(line 188,col 5)-(line 196,col 54)",
        "(line 197,col 5)-(line 205,col 54)",
        "(line 206,col 5)-(line 214,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.testMinpackMeyer()",
      "begin_line": 217,
      "end_line": 232,
      "comment": "",
      "child_ranges": [
        "(line 218,col 5)-(line 224,col 45)",
        "(line 225,col 5)-(line 231,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.testMinpackWatson()",
      "begin_line": 234,
      "end_line": 317,
      "comment": "",
      "child_ranges": [
        "(line 236,col 5)-(line 242,col 46)",
        "(line 243,col 5)-(line 249,col 46)",
        "(line 250,col 5)-(line 256,col 46)",
        "(line 258,col 5)-(line 266,col 46)",
        "(line 267,col 5)-(line 275,col 46)",
        "(line 276,col 5)-(line 284,col 46)",
        "(line 286,col 5)-(line 295,col 46)",
        "(line 296,col 5)-(line 305,col 46)",
        "(line 306,col 5)-(line 315,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.testMinpackBox3Dimensional()",
      "begin_line": 319,
      "end_line": 322,
      "comment": "",
      "child_ranges": [
        "(line 320,col 5)-(line 321,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.testMinpackJennrichSampson()",
      "begin_line": 324,
      "end_line": 330,
      "comment": "",
      "child_ranges": [
        "(line 325,col 5)-(line 329,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.testMinpackBrownDennis()",
      "begin_line": 332,
      "end_line": 354,
      "comment": "",
      "child_ranges": [
        "(line 333,col 5)-(line 339,col 51)",
        "(line 340,col 5)-(line 346,col 50)",
        "(line 347,col 5)-(line 353,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.testMinpackChebyquad()",
      "begin_line": 356,
      "end_line": 392,
      "comment": "",
      "child_ranges": [
        "(line 357,col 5)-(line 359,col 68)",
        "(line 360,col 5)-(line 362,col 80)",
        "(line 363,col 5)-(line 365,col 80)",
        "(line 366,col 5)-(line 373,col 49)",
        "(line 374,col 5)-(line 382,col 49)",
        "(line 383,col 5)-(line 391,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.testMinpackBrownAlmostLinear()",
      "begin_line": 394,
      "end_line": 460,
      "comment": "",
      "child_ranges": [
        "(line 395,col 5)-(line 403,col 57)",
        "(line 404,col 5)-(line 412,col 57)",
        "(line 413,col 5)-(line 418,col 57)",
        "(line 419,col 5)-(line 437,col 57)",
        "(line 438,col 5)-(line 459,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.testMinpackOsborne1()",
      "begin_line": 462,
      "end_line": 470,
      "comment": "",
      "child_ranges": [
        "(line 463,col 7)-(line 469,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.testMinpackOsborne2()",
      "begin_line": 472,
      "end_line": 487,
      "comment": "",
      "child_ranges": [
        "(line 474,col 5)-(line 486,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.minpackTest(org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction, boolean)",
      "begin_line": 489,
      "end_line": 509,
      "comment": "",
      "child_ranges": [
        "(line 490,col 7)-(line 490,col 80)",
        "(line 491,col 7)-(line 491,col 62)",
        "(line 492,col 7)-(line 492,col 71)",
        "(line 493,col 7)-(line 493,col 70)",
        "(line 494,col 7)-(line 494,col 53)",
        "(line 496,col 7)-(line 508,col 7)"
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
      "begin_line": 511,
      "end_line": 596,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 514,
      "end_line": 514,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 515,
      "end_line": 515,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "m"
      ],
      "begin_line": 516,
      "end_line": 516,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "startParams"
      ],
      "begin_line": 517,
      "end_line": 517,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "theoreticalMinCost"
      ],
      "begin_line": 518,
      "end_line": 518,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "theoreticalMinParams"
      ],
      "begin_line": 519,
      "end_line": 519,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "costAccuracy"
      ],
      "begin_line": 520,
      "end_line": 520,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "paramsAccuracy"
      ],
      "begin_line": 521,
      "end_line": 521,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.MinpackFunction(int, double[], double, double[])",
      "begin_line": 523,
      "end_line": 532,
      "comment": "",
      "child_ranges": [
        "(line 525,col 11)-(line 525,col 21)",
        "(line 526,col 11)-(line 526,col 38)",
        "(line 527,col 11)-(line 527,col 58)",
        "(line 528,col 11)-(line 528,col 57)",
        "(line 529,col 11)-(line 529,col 59)",
        "(line 530,col 11)-(line 530,col 45)",
        "(line 531,col 11)-(line 531,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.buildArray(int, double)",
      "begin_line": 534,
      "end_line": 538,
      "comment": "",
      "child_ranges": [
        "(line 535,col 11)-(line 535,col 41)",
        "(line 536,col 11)-(line 536,col 32)",
        "(line 537,col 11)-(line 537,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.getTarget()",
      "begin_line": 540,
      "end_line": 542,
      "comment": "",
      "child_ranges": [
        "(line 541,col 11)-(line 541,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.getWeight()",
      "begin_line": 544,
      "end_line": 546,
      "comment": "",
      "child_ranges": [
        "(line 545,col 11)-(line 545,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.getStartPoint()",
      "begin_line": 548,
      "end_line": 550,
      "comment": "",
      "child_ranges": [
        "(line 549,col 11)-(line 549,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.setCostAccuracy(double)",
      "begin_line": 552,
      "end_line": 554,
      "comment": "",
      "child_ranges": [
        "(line 553,col 11)-(line 553,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.setParamsAccuracy(double)",
      "begin_line": 556,
      "end_line": 558,
      "comment": "",
      "child_ranges": [
        "(line 557,col 11)-(line 557,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.getN()",
      "begin_line": 560,
      "end_line": 562,
      "comment": "",
      "child_ranges": [
        "(line 561,col 11)-(line 561,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.checkTheoreticalMinCost(double)",
      "begin_line": 564,
      "end_line": 567,
      "comment": "",
      "child_ranges": [
        "(line 565,col 11)-(line 565,col 71)",
        "(line 566,col 11)-(line 566,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.checkTheoreticalMinParams(org.apache.commons.math.optimization.VectorialPointValuePair)",
      "begin_line": 569,
      "end_line": 581,
      "comment": "",
      "child_ranges": [
        "(line 570,col 11)-(line 570,col 50)",
        "(line 571,col 11)-(line 579,col 11)",
        "(line 580,col 11)-(line 580,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.jacobian()",
      "begin_line": 583,
      "end_line": 590,
      "comment": "",
      "child_ranges": [
        "(line 584,col 11)-(line 589,col 12)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 585,
      "end_line": 585,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.Anonymous-e62ede13-f620-4821-bc3e-2eabda8c6617.value(double[])",
      "begin_line": 586,
      "end_line": 588,
      "comment": "",
      "child_ranges": [
        "(line 587,col 19)-(line 587,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.jacobian(double[])",
      "begin_line": 592,
      "end_line": 592,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.value(double[])",
      "begin_line": 594,
      "end_line": 594,
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
      "begin_line": 598,
      "end_line": 637,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 600,
      "end_line": 600,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.LinearFullRankFunction.LinearFullRankFunction(int, int, double, double, double)",
      "begin_line": 602,
      "end_line": 607,
      "comment": "",
      "child_ranges": [
        "(line 605,col 7)-(line 606,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.LinearFullRankFunction.jacobian(double[])",
      "begin_line": 609,
      "end_line": 620,
      "comment": "",
      "child_ranges": [
        "(line 611,col 7)-(line 611,col 25)",
        "(line 612,col 7)-(line 612,col 44)",
        "(line 613,col 7)-(line 618,col 7)",
        "(line 619,col 7)-(line 619,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.LinearFullRankFunction.value(double[])",
      "begin_line": 622,
      "end_line": 635,
      "comment": "",
      "child_ranges": [
        "(line 624,col 7)-(line 624,col 21)",
        "(line 625,col 7)-(line 627,col 7)",
        "(line 628,col 7)-(line 628,col 34)",
        "(line 629,col 7)-(line 629,col 33)",
        "(line 630,col 7)-(line 632,col 7)",
        "(line 633,col 7)-(line 633,col 31)",
        "(line 634,col 7)-(line 634,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LinearRank1Function",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 639,
      "end_line": 674,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 641,
      "end_line": 641,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.LinearRank1Function.LinearRank1Function(int, int, double, double, double)",
      "begin_line": 643,
      "end_line": 647,
      "comment": "",
      "child_ranges": [
        "(line 646,col 7)-(line 646,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.LinearRank1Function.jacobian(double[])",
      "begin_line": 649,
      "end_line": 659,
      "comment": "",
      "child_ranges": [
        "(line 651,col 7)-(line 651,col 44)",
        "(line 652,col 7)-(line 657,col 7)",
        "(line 658,col 7)-(line 658,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.LinearRank1Function.value(double[])",
      "begin_line": 661,
      "end_line": 672,
      "comment": "",
      "child_ranges": [
        "(line 663,col 7)-(line 663,col 33)",
        "(line 664,col 7)-(line 664,col 21)",
        "(line 665,col 7)-(line 667,col 7)",
        "(line 668,col 7)-(line 670,col 7)",
        "(line 671,col 7)-(line 671,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LinearRank1ZeroColsAndRowsFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 676,
      "end_line": 720,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 678,
      "end_line": 678,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.LinearRank1ZeroColsAndRowsFunction.LinearRank1ZeroColsAndRowsFunction(int, int, double)",
      "begin_line": 680,
      "end_line": 684,
      "comment": "",
      "child_ranges": [
        "(line 681,col 7)-(line 683,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.LinearRank1ZeroColsAndRowsFunction.jacobian(double[])",
      "begin_line": 686,
      "end_line": 704,
      "comment": "",
      "child_ranges": [
        "(line 688,col 7)-(line 688,col 44)",
        "(line 689,col 7)-(line 702,col 7)",
        "(line 703,col 7)-(line 703,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.LinearRank1ZeroColsAndRowsFunction.value(double[])",
      "begin_line": 706,
      "end_line": 718,
      "comment": "",
      "child_ranges": [
        "(line 708,col 7)-(line 708,col 33)",
        "(line 709,col 7)-(line 709,col 21)",
        "(line 710,col 7)-(line 712,col 7)",
        "(line 713,col 7)-(line 715,col 7)",
        "(line 716,col 7)-(line 716,col 20)",
        "(line 717,col 7)-(line 717,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RosenbrockFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 722,
      "end_line": 743,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 724,
      "end_line": 724,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.RosenbrockFunction.RosenbrockFunction(double[], double)",
      "begin_line": 726,
      "end_line": 728,
      "comment": "",
      "child_ranges": [
        "(line 727,col 7)-(line 727,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.RosenbrockFunction.jacobian(double[])",
      "begin_line": 730,
      "end_line": 734,
      "comment": "",
      "child_ranges": [
        "(line 732,col 7)-(line 732,col 31)",
        "(line 733,col 7)-(line 733,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.RosenbrockFunction.value(double[])",
      "begin_line": 736,
      "end_line": 741,
      "comment": "",
      "child_ranges": [
        "(line 738,col 7)-(line 738,col 31)",
        "(line 739,col 7)-(line 739,col 31)",
        "(line 740,col 7)-(line 740,col 58)"
      ]
    },
    {
      "type": "class_interface",
      "name": "HelicalValleyFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 745,
      "end_line": 792,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 747,
      "end_line": 747,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.HelicalValleyFunction.HelicalValleyFunction(double[], double)",
      "begin_line": 749,
      "end_line": 752,
      "comment": "",
      "child_ranges": [
        "(line 751,col 7)-(line 751,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.HelicalValleyFunction.jacobian(double[])",
      "begin_line": 754,
      "end_line": 766,
      "comment": "",
      "child_ranges": [
        "(line 756,col 7)-(line 756,col 31)",
        "(line 757,col 7)-(line 757,col 31)",
        "(line 758,col 7)-(line 758,col 43)",
        "(line 759,col 7)-(line 759,col 38)",
        "(line 760,col 7)-(line 760,col 41)",
        "(line 761,col 7)-(line 765,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.HelicalValleyFunction.value(double[])",
      "begin_line": 768,
      "end_line": 788,
      "comment": "",
      "child_ranges": [
        "(line 770,col 7)-(line 770,col 31)",
        "(line 771,col 7)-(line 771,col 31)",
        "(line 772,col 7)-(line 772,col 31)",
        "(line 773,col 7)-(line 773,col 18)",
        "(line 774,col 7)-(line 781,col 7)",
        "(line 782,col 7)-(line 782,col 49)",
        "(line 783,col 7)-(line 787,col 8)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "twoPi"
      ],
      "begin_line": 790,
      "end_line": 790,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "PowellSingularFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 794,
      "end_line": 834,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 796,
      "end_line": 796,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.PowellSingularFunction.PowellSingularFunction(double[], double)",
      "begin_line": 798,
      "end_line": 801,
      "comment": "",
      "child_ranges": [
        "(line 800,col 7)-(line 800,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.PowellSingularFunction.jacobian(double[])",
      "begin_line": 803,
      "end_line": 815,
      "comment": "",
      "child_ranges": [
        "(line 805,col 7)-(line 805,col 31)",
        "(line 806,col 7)-(line 806,col 31)",
        "(line 807,col 7)-(line 807,col 31)",
        "(line 808,col 7)-(line 808,col 31)",
        "(line 809,col 7)-(line 814,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.PowellSingularFunction.value(double[])",
      "begin_line": 817,
      "end_line": 829,
      "comment": "",
      "child_ranges": [
        "(line 819,col 7)-(line 819,col 31)",
        "(line 820,col 7)-(line 820,col 31)",
        "(line 821,col 7)-(line 821,col 31)",
        "(line 822,col 7)-(line 822,col 31)",
        "(line 823,col 7)-(line 828,col 8)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "sqrt5"
      ],
      "begin_line": 831,
      "end_line": 831,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sqrt10"
      ],
      "begin_line": 832,
      "end_line": 832,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "FreudensteinRothFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 836,
      "end_line": 867,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 838,
      "end_line": 838,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.FreudensteinRothFunction.FreudensteinRothFunction(double[], double, double, double[])",
      "begin_line": 840,
      "end_line": 846,
      "comment": "",
      "child_ranges": [
        "(line 844,col 7)-(line 845,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.FreudensteinRothFunction.jacobian(double[])",
      "begin_line": 848,
      "end_line": 855,
      "comment": "",
      "child_ranges": [
        "(line 850,col 7)-(line 850,col 31)",
        "(line 851,col 7)-(line 854,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.FreudensteinRothFunction.value(double[])",
      "begin_line": 857,
      "end_line": 865,
      "comment": "",
      "child_ranges": [
        "(line 859,col 7)-(line 859,col 31)",
        "(line 860,col 7)-(line 860,col 31)",
        "(line 861,col 7)-(line 864,col 8)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BardFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 869,
      "end_line": 918,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 871,
      "end_line": 871,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.BardFunction.BardFunction(double, double, double, double[])",
      "begin_line": 873,
      "end_line": 879,
      "comment": "",
      "child_ranges": [
        "(line 877,col 7)-(line 878,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.BardFunction.jacobian(double[])",
      "begin_line": 881,
      "end_line": 895,
      "comment": "",
      "child_ranges": [
        "(line 883,col 7)-(line 883,col 33)",
        "(line 884,col 7)-(line 884,col 33)",
        "(line 885,col 7)-(line 885,col 44)",
        "(line 886,col 7)-(line 893,col 7)",
        "(line 894,col 7)-(line 894,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.BardFunction.value(double[])",
      "begin_line": 897,
      "end_line": 910,
      "comment": "",
      "child_ranges": [
        "(line 899,col 7)-(line 899,col 33)",
        "(line 900,col 7)-(line 900,col 33)",
        "(line 901,col 7)-(line 901,col 33)",
        "(line 902,col 7)-(line 902,col 33)",
        "(line 903,col 7)-(line 908,col 7)",
        "(line 909,col 7)-(line 909,col 15)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 912,
      "end_line": 916,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "KowalikOsborneFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 920,
      "end_line": 976,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 922,
      "end_line": 922,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.KowalikOsborneFunction.KowalikOsborneFunction(double[], double, double, double[])",
      "begin_line": 924,
      "end_line": 934,
      "comment": "",
      "child_ranges": [
        "(line 928,col 7)-(line 929,col 34)",
        "(line 930,col 7)-(line 933,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.KowalikOsborneFunction.jacobian(double[])",
      "begin_line": 936,
      "end_line": 952,
      "comment": "",
      "child_ranges": [
        "(line 938,col 7)-(line 938,col 33)",
        "(line 939,col 7)-(line 939,col 33)",
        "(line 940,col 7)-(line 940,col 33)",
        "(line 941,col 7)-(line 941,col 33)",
        "(line 942,col 7)-(line 942,col 44)",
        "(line 943,col 7)-(line 950,col 7)",
        "(line 951,col 7)-(line 951,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.KowalikOsborneFunction.value(double[])",
      "begin_line": 954,
      "end_line": 965,
      "comment": "",
      "child_ranges": [
        "(line 956,col 7)-(line 956,col 31)",
        "(line 957,col 7)-(line 957,col 31)",
        "(line 958,col 7)-(line 958,col 31)",
        "(line 959,col 7)-(line 959,col 31)",
        "(line 960,col 7)-(line 960,col 33)",
        "(line 961,col 7)-(line 963,col 7)",
        "(line 964,col 7)-(line 964,col 15)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "v"
      ],
      "begin_line": 967,
      "end_line": 969,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 971,
      "end_line": 974,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "MeyerFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 978,
      "end_line": 1029,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 980,
      "end_line": 980,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MeyerFunction.MeyerFunction(double[], double, double, double[])",
      "begin_line": 982,
      "end_line": 992,
      "comment": "",
      "child_ranges": [
        "(line 986,col 7)-(line 987,col 34)",
        "(line 988,col 7)-(line 991,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MeyerFunction.jacobian(double[])",
      "begin_line": 994,
      "end_line": 1008,
      "comment": "",
      "child_ranges": [
        "(line 996,col 7)-(line 996,col 33)",
        "(line 997,col 7)-(line 997,col 33)",
        "(line 998,col 7)-(line 998,col 33)",
        "(line 999,col 7)-(line 999,col 44)",
        "(line 1000,col 7)-(line 1006,col 7)",
        "(line 1007,col 7)-(line 1007,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MeyerFunction.value(double[])",
      "begin_line": 1010,
      "end_line": 1020,
      "comment": "",
      "child_ranges": [
        "(line 1012,col 7)-(line 1012,col 31)",
        "(line 1013,col 7)-(line 1013,col 31)",
        "(line 1014,col 7)-(line 1014,col 31)",
        "(line 1015,col 7)-(line 1015,col 33)",
        "(line 1016,col 7)-(line 1018,col 7)",
        "(line 1019,col 6)-(line 1019,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 1022,
      "end_line": 1027,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "WatsonFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1031,
      "end_line": 1105,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1033,
      "end_line": 1033,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.WatsonFunction.WatsonFunction(int, double, double, double, double[])",
      "begin_line": 1035,
      "end_line": 1041,
      "comment": "",
      "child_ranges": [
        "(line 1039,col 7)-(line 1040,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.WatsonFunction.jacobian(double[])",
      "begin_line": 1043,
      "end_line": 1074,
      "comment": "",
      "child_ranges": [
        "(line 1046,col 7)-(line 1046,col 44)",
        "(line 1048,col 7)-(line 1063,col 7)",
        "(line 1065,col 7)-(line 1065,col 41)",
        "(line 1066,col 7)-(line 1066,col 29)",
        "(line 1068,col 7)-(line 1068,col 40)",
        "(line 1069,col 7)-(line 1069,col 44)",
        "(line 1070,col 7)-(line 1070,col 28)",
        "(line 1072,col 7)-(line 1072,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.WatsonFunction.value(double[])",
      "begin_line": 1076,
      "end_line": 1103,
      "comment": "",
      "child_ranges": [
        "(line 1078,col 6)-(line 1078,col 32)",
        "(line 1079,col 6)-(line 1094,col 6)",
        "(line 1096,col 6)-(line 1096,col 30)",
        "(line 1097,col 6)-(line 1097,col 30)",
        "(line 1098,col 6)-(line 1098,col 19)",
        "(line 1099,col 6)-(line 1099,col 33)",
        "(line 1101,col 6)-(line 1101,col 14)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Box3DimensionalFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1107,
      "end_line": 1147,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1109,
      "end_line": 1109,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.Box3DimensionalFunction.Box3DimensionalFunction(int, double[], double)",
      "begin_line": 1111,
      "end_line": 1115,
      "comment": "",
      "child_ranges": [
        "(line 1113,col 7)-(line 1114,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.Box3DimensionalFunction.jacobian(double[])",
      "begin_line": 1117,
      "end_line": 1131,
      "comment": "",
      "child_ranges": [
        "(line 1119,col 7)-(line 1119,col 33)",
        "(line 1120,col 7)-(line 1120,col 33)",
        "(line 1121,col 7)-(line 1121,col 44)",
        "(line 1122,col 7)-(line 1129,col 7)",
        "(line 1130,col 7)-(line 1130,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.Box3DimensionalFunction.value(double[])",
      "begin_line": 1133,
      "end_line": 1145,
      "comment": "",
      "child_ranges": [
        "(line 1135,col 7)-(line 1135,col 31)",
        "(line 1136,col 7)-(line 1136,col 31)",
        "(line 1137,col 7)-(line 1137,col 31)",
        "(line 1138,col 7)-(line 1138,col 33)",
        "(line 1139,col 7)-(line 1143,col 7)",
        "(line 1144,col 7)-(line 1144,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "JennrichSampsonFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1149,
      "end_line": 1185,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1151,
      "end_line": 1151,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.JennrichSampsonFunction.JennrichSampsonFunction(int, double[], double, double, double[])",
      "begin_line": 1153,
      "end_line": 1159,
      "comment": "",
      "child_ranges": [
        "(line 1157,col 7)-(line 1158,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.JennrichSampsonFunction.jacobian(double[])",
      "begin_line": 1161,
      "end_line": 1171,
      "comment": "",
      "child_ranges": [
        "(line 1163,col 7)-(line 1163,col 33)",
        "(line 1164,col 7)-(line 1164,col 33)",
        "(line 1165,col 7)-(line 1165,col 44)",
        "(line 1166,col 7)-(line 1169,col 7)",
        "(line 1170,col 7)-(line 1170,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.JennrichSampsonFunction.value(double[])",
      "begin_line": 1173,
      "end_line": 1183,
      "comment": "",
      "child_ranges": [
        "(line 1175,col 7)-(line 1175,col 31)",
        "(line 1176,col 7)-(line 1176,col 31)",
        "(line 1177,col 7)-(line 1177,col 33)",
        "(line 1178,col 7)-(line 1181,col 7)",
        "(line 1182,col 7)-(line 1182,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BrownDennisFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1187,
      "end_line": 1235,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1189,
      "end_line": 1189,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.BrownDennisFunction.BrownDennisFunction(int, double[], double, double, double[])",
      "begin_line": 1191,
      "end_line": 1198,
      "comment": "",
      "child_ranges": [
        "(line 1195,col 7)-(line 1196,col 34)",
        "(line 1197,col 7)-(line 1197,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.BrownDennisFunction.jacobian(double[])",
      "begin_line": 1200,
      "end_line": 1217,
      "comment": "",
      "child_ranges": [
        "(line 1202,col 7)-(line 1202,col 33)",
        "(line 1203,col 7)-(line 1203,col 33)",
        "(line 1204,col 7)-(line 1204,col 33)",
        "(line 1205,col 7)-(line 1205,col 33)",
        "(line 1206,col 7)-(line 1206,col 44)",
        "(line 1207,col 7)-(line 1215,col 7)",
        "(line 1216,col 7)-(line 1216,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.BrownDennisFunction.value(double[])",
      "begin_line": 1219,
      "end_line": 1233,
      "comment": "",
      "child_ranges": [
        "(line 1221,col 7)-(line 1221,col 31)",
        "(line 1222,col 7)-(line 1222,col 31)",
        "(line 1223,col 7)-(line 1223,col 31)",
        "(line 1224,col 7)-(line 1224,col 31)",
        "(line 1225,col 7)-(line 1225,col 33)",
        "(line 1226,col 7)-(line 1231,col 7)",
        "(line 1232,col 7)-(line 1232,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ChebyquadFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1237,
      "end_line": 1319,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1239,
      "end_line": 1239,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.ChebyquadFunction.buildChebyquadArray(int, double)",
      "begin_line": 1241,
      "end_line": 1248,
      "comment": "",
      "child_ranges": [
        "(line 1242,col 7)-(line 1242,col 37)",
        "(line 1243,col 7)-(line 1243,col 36)",
        "(line 1244,col 7)-(line 1246,col 7)",
        "(line 1247,col 7)-(line 1247,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.ChebyquadFunction.ChebyquadFunction(int, int, double, double, double, double[])",
      "begin_line": 1250,
      "end_line": 1256,
      "comment": "",
      "child_ranges": [
        "(line 1254,col 7)-(line 1255,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.ChebyquadFunction.jacobian(double[])",
      "begin_line": 1258,
      "end_line": 1286,
      "comment": "",
      "child_ranges": [
        "(line 1261,col 7)-(line 1261,col 44)",
        "(line 1262,col 7)-(line 1264,col 7)",
        "(line 1266,col 7)-(line 1266,col 26)",
        "(line 1267,col 7)-(line 1282,col 7)",
        "(line 1284,col 7)-(line 1284,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.ChebyquadFunction.value(double[])",
      "begin_line": 1288,
      "end_line": 1317,
      "comment": "",
      "child_ranges": [
        "(line 1291,col 7)-(line 1291,col 33)",
        "(line 1293,col 7)-(line 1303,col 7)",
        "(line 1305,col 7)-(line 1305,col 26)",
        "(line 1306,col 7)-(line 1306,col 26)",
        "(line 1307,col 7)-(line 1313,col 7)",
        "(line 1315,col 7)-(line 1315,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BrownAlmostLinearFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1321,
      "end_line": 1383,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1323,
      "end_line": 1323,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.BrownAlmostLinearFunction.BrownAlmostLinearFunction(int, double, double, double, double[])",
      "begin_line": 1325,
      "end_line": 1331,
      "comment": "",
      "child_ranges": [
        "(line 1329,col 7)-(line 1330,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.BrownAlmostLinearFunction.jacobian(double[])",
      "begin_line": 1333,
      "end_line": 1365,
      "comment": "",
      "child_ranges": [
        "(line 1335,col 7)-(line 1335,col 44)",
        "(line 1336,col 7)-(line 1338,col 7)",
        "(line 1340,col 7)-(line 1340,col 22)",
        "(line 1341,col 7)-(line 1347,col 7)",
        "(line 1349,col 7)-(line 1361,col 7)",
        "(line 1363,col 7)-(line 1363,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.BrownAlmostLinearFunction.value(double[])",
      "begin_line": 1367,
      "end_line": 1381,
      "comment": "",
      "child_ranges": [
        "(line 1369,col 7)-(line 1369,col 33)",
        "(line 1370,col 7)-(line 1370,col 29)",
        "(line 1371,col 7)-(line 1371,col 22)",
        "(line 1372,col 7)-(line 1375,col 7)",
        "(line 1376,col 7)-(line 1378,col 7)",
        "(line 1379,col 7)-(line 1379,col 26)",
        "(line 1380,col 7)-(line 1380,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Osborne1Function",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1385,
      "end_line": 1438,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1387,
      "end_line": 1387,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.Osborne1Function.Osborne1Function(double[], double, double, double[])",
      "begin_line": 1389,
      "end_line": 1395,
      "comment": "",
      "child_ranges": [
        "(line 1393,col 7)-(line 1394,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.Osborne1Function.jacobian(double[])",
      "begin_line": 1397,
      "end_line": 1413,
      "comment": "",
      "child_ranges": [
        "(line 1399,col 7)-(line 1399,col 33)",
        "(line 1400,col 7)-(line 1400,col 33)",
        "(line 1401,col 7)-(line 1401,col 33)",
        "(line 1402,col 7)-(line 1402,col 33)",
        "(line 1403,col 7)-(line 1403,col 44)",
        "(line 1404,col 7)-(line 1411,col 7)",
        "(line 1412,col 7)-(line 1412,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.Osborne1Function.value(double[])",
      "begin_line": 1415,
      "end_line": 1430,
      "comment": "",
      "child_ranges": [
        "(line 1417,col 7)-(line 1417,col 31)",
        "(line 1418,col 7)-(line 1418,col 31)",
        "(line 1419,col 7)-(line 1419,col 31)",
        "(line 1420,col 7)-(line 1420,col 31)",
        "(line 1421,col 7)-(line 1421,col 31)",
        "(line 1422,col 7)-(line 1422,col 33)",
        "(line 1423,col 7)-(line 1428,col 7)",
        "(line 1429,col 7)-(line 1429,col 15)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 1432,
      "end_line": 1436,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Osborne2Function",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1440,
      "end_line": 1530,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1442,
      "end_line": 1442,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.Osborne2Function.Osborne2Function(double[], double, double, double[])",
      "begin_line": 1444,
      "end_line": 1450,
      "comment": "",
      "child_ranges": [
        "(line 1448,col 7)-(line 1449,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.Osborne2Function.jacobian(double[])",
      "begin_line": 1452,
      "end_line": 1487,
      "comment": "",
      "child_ranges": [
        "(line 1454,col 7)-(line 1454,col 34)",
        "(line 1455,col 7)-(line 1455,col 34)",
        "(line 1456,col 7)-(line 1456,col 34)",
        "(line 1457,col 7)-(line 1457,col 34)",
        "(line 1458,col 7)-(line 1458,col 34)",
        "(line 1459,col 7)-(line 1459,col 34)",
        "(line 1460,col 7)-(line 1460,col 34)",
        "(line 1461,col 7)-(line 1461,col 34)",
        "(line 1462,col 7)-(line 1462,col 34)",
        "(line 1463,col 7)-(line 1463,col 34)",
        "(line 1464,col 7)-(line 1464,col 35)",
        "(line 1465,col 7)-(line 1465,col 44)",
        "(line 1466,col 7)-(line 1485,col 7)",
        "(line 1486,col 7)-(line 1486,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.Osborne2Function.value(double[])",
      "begin_line": 1489,
      "end_line": 1512,
      "comment": "",
      "child_ranges": [
        "(line 1491,col 7)-(line 1491,col 32)",
        "(line 1492,col 7)-(line 1492,col 32)",
        "(line 1493,col 7)-(line 1493,col 32)",
        "(line 1494,col 7)-(line 1494,col 32)",
        "(line 1495,col 7)-(line 1495,col 32)",
        "(line 1496,col 7)-(line 1496,col 32)",
        "(line 1497,col 7)-(line 1497,col 32)",
        "(line 1498,col 7)-(line 1498,col 32)",
        "(line 1499,col 7)-(line 1499,col 32)",
        "(line 1500,col 7)-(line 1500,col 32)",
        "(line 1501,col 7)-(line 1501,col 33)",
        "(line 1502,col 7)-(line 1502,col 33)",
        "(line 1503,col 7)-(line 1510,col 7)",
        "(line 1511,col 7)-(line 1511,col 15)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 1514,
      "end_line": 1528,
      "comment": ""
    }
  ]
}