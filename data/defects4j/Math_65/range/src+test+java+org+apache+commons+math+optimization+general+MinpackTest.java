{
  "filepath": "/tmp/Math-65b/src/test/java/org/apache/commons/math/optimization/general/MinpackTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MinpackTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 93,
      "end_line": 1529,
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
      "end_line": 593,
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
        "(line 566,col 11)-(line 566,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.checkTheoreticalMinParams(org.apache.commons.math.optimization.VectorialPointValuePair)",
      "begin_line": 569,
      "end_line": 578,
      "comment": "",
      "child_ranges": [
        "(line 570,col 11)-(line 570,col 50)",
        "(line 571,col 11)-(line 577,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.jacobian()",
      "begin_line": 580,
      "end_line": 587,
      "comment": "",
      "child_ranges": [
        "(line 581,col 11)-(line 586,col 12)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 582,
      "end_line": 582,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.Anonymous-b76dea8d-72af-49f7-9184-49c8ee8ce3ba.value(double[])",
      "begin_line": 583,
      "end_line": 585,
      "comment": "",
      "child_ranges": [
        "(line 584,col 19)-(line 584,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.jacobian(double[])",
      "begin_line": 589,
      "end_line": 589,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction.value(double[])",
      "begin_line": 591,
      "end_line": 591,
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
      "begin_line": 595,
      "end_line": 634,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 597,
      "end_line": 597,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.LinearFullRankFunction.LinearFullRankFunction(int, int, double, double, double)",
      "begin_line": 599,
      "end_line": 604,
      "comment": "",
      "child_ranges": [
        "(line 602,col 7)-(line 603,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.LinearFullRankFunction.jacobian(double[])",
      "begin_line": 606,
      "end_line": 617,
      "comment": "",
      "child_ranges": [
        "(line 608,col 7)-(line 608,col 25)",
        "(line 609,col 7)-(line 609,col 44)",
        "(line 610,col 7)-(line 615,col 7)",
        "(line 616,col 7)-(line 616,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.LinearFullRankFunction.value(double[])",
      "begin_line": 619,
      "end_line": 632,
      "comment": "",
      "child_ranges": [
        "(line 621,col 7)-(line 621,col 21)",
        "(line 622,col 7)-(line 624,col 7)",
        "(line 625,col 7)-(line 625,col 34)",
        "(line 626,col 7)-(line 626,col 33)",
        "(line 627,col 7)-(line 629,col 7)",
        "(line 630,col 7)-(line 630,col 31)",
        "(line 631,col 7)-(line 631,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LinearRank1Function",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 636,
      "end_line": 671,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 638,
      "end_line": 638,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.LinearRank1Function.LinearRank1Function(int, int, double, double, double)",
      "begin_line": 640,
      "end_line": 644,
      "comment": "",
      "child_ranges": [
        "(line 643,col 7)-(line 643,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.LinearRank1Function.jacobian(double[])",
      "begin_line": 646,
      "end_line": 656,
      "comment": "",
      "child_ranges": [
        "(line 648,col 7)-(line 648,col 44)",
        "(line 649,col 7)-(line 654,col 7)",
        "(line 655,col 7)-(line 655,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.LinearRank1Function.value(double[])",
      "begin_line": 658,
      "end_line": 669,
      "comment": "",
      "child_ranges": [
        "(line 660,col 7)-(line 660,col 33)",
        "(line 661,col 7)-(line 661,col 21)",
        "(line 662,col 7)-(line 664,col 7)",
        "(line 665,col 7)-(line 667,col 7)",
        "(line 668,col 7)-(line 668,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LinearRank1ZeroColsAndRowsFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 673,
      "end_line": 717,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 675,
      "end_line": 675,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.LinearRank1ZeroColsAndRowsFunction.LinearRank1ZeroColsAndRowsFunction(int, int, double)",
      "begin_line": 677,
      "end_line": 681,
      "comment": "",
      "child_ranges": [
        "(line 678,col 7)-(line 680,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.LinearRank1ZeroColsAndRowsFunction.jacobian(double[])",
      "begin_line": 683,
      "end_line": 701,
      "comment": "",
      "child_ranges": [
        "(line 685,col 7)-(line 685,col 44)",
        "(line 686,col 7)-(line 699,col 7)",
        "(line 700,col 7)-(line 700,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.LinearRank1ZeroColsAndRowsFunction.value(double[])",
      "begin_line": 703,
      "end_line": 715,
      "comment": "",
      "child_ranges": [
        "(line 705,col 7)-(line 705,col 33)",
        "(line 706,col 7)-(line 706,col 21)",
        "(line 707,col 7)-(line 709,col 7)",
        "(line 710,col 7)-(line 712,col 7)",
        "(line 713,col 7)-(line 713,col 20)",
        "(line 714,col 7)-(line 714,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "RosenbrockFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 719,
      "end_line": 740,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 721,
      "end_line": 721,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.RosenbrockFunction.RosenbrockFunction(double[], double)",
      "begin_line": 723,
      "end_line": 725,
      "comment": "",
      "child_ranges": [
        "(line 724,col 7)-(line 724,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.RosenbrockFunction.jacobian(double[])",
      "begin_line": 727,
      "end_line": 731,
      "comment": "",
      "child_ranges": [
        "(line 729,col 7)-(line 729,col 31)",
        "(line 730,col 7)-(line 730,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.RosenbrockFunction.value(double[])",
      "begin_line": 733,
      "end_line": 738,
      "comment": "",
      "child_ranges": [
        "(line 735,col 7)-(line 735,col 31)",
        "(line 736,col 7)-(line 736,col 31)",
        "(line 737,col 7)-(line 737,col 58)"
      ]
    },
    {
      "type": "class_interface",
      "name": "HelicalValleyFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 742,
      "end_line": 789,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 744,
      "end_line": 744,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.HelicalValleyFunction.HelicalValleyFunction(double[], double)",
      "begin_line": 746,
      "end_line": 749,
      "comment": "",
      "child_ranges": [
        "(line 748,col 7)-(line 748,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.HelicalValleyFunction.jacobian(double[])",
      "begin_line": 751,
      "end_line": 763,
      "comment": "",
      "child_ranges": [
        "(line 753,col 7)-(line 753,col 31)",
        "(line 754,col 7)-(line 754,col 31)",
        "(line 755,col 7)-(line 755,col 43)",
        "(line 756,col 7)-(line 756,col 38)",
        "(line 757,col 7)-(line 757,col 41)",
        "(line 758,col 7)-(line 762,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.HelicalValleyFunction.value(double[])",
      "begin_line": 765,
      "end_line": 785,
      "comment": "",
      "child_ranges": [
        "(line 767,col 7)-(line 767,col 31)",
        "(line 768,col 7)-(line 768,col 31)",
        "(line 769,col 7)-(line 769,col 31)",
        "(line 770,col 7)-(line 770,col 18)",
        "(line 771,col 7)-(line 778,col 7)",
        "(line 779,col 7)-(line 779,col 49)",
        "(line 780,col 7)-(line 784,col 8)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "twoPi"
      ],
      "begin_line": 787,
      "end_line": 787,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "PowellSingularFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 791,
      "end_line": 831,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 793,
      "end_line": 793,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.PowellSingularFunction.PowellSingularFunction(double[], double)",
      "begin_line": 795,
      "end_line": 798,
      "comment": "",
      "child_ranges": [
        "(line 797,col 7)-(line 797,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.PowellSingularFunction.jacobian(double[])",
      "begin_line": 800,
      "end_line": 812,
      "comment": "",
      "child_ranges": [
        "(line 802,col 7)-(line 802,col 31)",
        "(line 803,col 7)-(line 803,col 31)",
        "(line 804,col 7)-(line 804,col 31)",
        "(line 805,col 7)-(line 805,col 31)",
        "(line 806,col 7)-(line 811,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.PowellSingularFunction.value(double[])",
      "begin_line": 814,
      "end_line": 826,
      "comment": "",
      "child_ranges": [
        "(line 816,col 7)-(line 816,col 31)",
        "(line 817,col 7)-(line 817,col 31)",
        "(line 818,col 7)-(line 818,col 31)",
        "(line 819,col 7)-(line 819,col 31)",
        "(line 820,col 7)-(line 825,col 8)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "sqrt5"
      ],
      "begin_line": 828,
      "end_line": 828,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sqrt10"
      ],
      "begin_line": 829,
      "end_line": 829,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "FreudensteinRothFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 833,
      "end_line": 864,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 835,
      "end_line": 835,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.FreudensteinRothFunction.FreudensteinRothFunction(double[], double, double, double[])",
      "begin_line": 837,
      "end_line": 843,
      "comment": "",
      "child_ranges": [
        "(line 841,col 7)-(line 842,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.FreudensteinRothFunction.jacobian(double[])",
      "begin_line": 845,
      "end_line": 852,
      "comment": "",
      "child_ranges": [
        "(line 847,col 7)-(line 847,col 31)",
        "(line 848,col 7)-(line 851,col 8)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.FreudensteinRothFunction.value(double[])",
      "begin_line": 854,
      "end_line": 862,
      "comment": "",
      "child_ranges": [
        "(line 856,col 7)-(line 856,col 31)",
        "(line 857,col 7)-(line 857,col 31)",
        "(line 858,col 7)-(line 861,col 8)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BardFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 866,
      "end_line": 915,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 868,
      "end_line": 868,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.BardFunction.BardFunction(double, double, double, double[])",
      "begin_line": 870,
      "end_line": 876,
      "comment": "",
      "child_ranges": [
        "(line 874,col 7)-(line 875,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.BardFunction.jacobian(double[])",
      "begin_line": 878,
      "end_line": 892,
      "comment": "",
      "child_ranges": [
        "(line 880,col 7)-(line 880,col 33)",
        "(line 881,col 7)-(line 881,col 33)",
        "(line 882,col 7)-(line 882,col 44)",
        "(line 883,col 7)-(line 890,col 7)",
        "(line 891,col 7)-(line 891,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.BardFunction.value(double[])",
      "begin_line": 894,
      "end_line": 907,
      "comment": "",
      "child_ranges": [
        "(line 896,col 7)-(line 896,col 33)",
        "(line 897,col 7)-(line 897,col 33)",
        "(line 898,col 7)-(line 898,col 33)",
        "(line 899,col 7)-(line 899,col 33)",
        "(line 900,col 7)-(line 905,col 7)",
        "(line 906,col 7)-(line 906,col 15)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 909,
      "end_line": 913,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "KowalikOsborneFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 917,
      "end_line": 973,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 919,
      "end_line": 919,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.KowalikOsborneFunction.KowalikOsborneFunction(double[], double, double, double[])",
      "begin_line": 921,
      "end_line": 931,
      "comment": "",
      "child_ranges": [
        "(line 925,col 7)-(line 926,col 34)",
        "(line 927,col 7)-(line 930,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.KowalikOsborneFunction.jacobian(double[])",
      "begin_line": 933,
      "end_line": 949,
      "comment": "",
      "child_ranges": [
        "(line 935,col 7)-(line 935,col 33)",
        "(line 936,col 7)-(line 936,col 33)",
        "(line 937,col 7)-(line 937,col 33)",
        "(line 938,col 7)-(line 938,col 33)",
        "(line 939,col 7)-(line 939,col 44)",
        "(line 940,col 7)-(line 947,col 7)",
        "(line 948,col 7)-(line 948,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.KowalikOsborneFunction.value(double[])",
      "begin_line": 951,
      "end_line": 962,
      "comment": "",
      "child_ranges": [
        "(line 953,col 7)-(line 953,col 31)",
        "(line 954,col 7)-(line 954,col 31)",
        "(line 955,col 7)-(line 955,col 31)",
        "(line 956,col 7)-(line 956,col 31)",
        "(line 957,col 7)-(line 957,col 33)",
        "(line 958,col 7)-(line 960,col 7)",
        "(line 961,col 7)-(line 961,col 15)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "v"
      ],
      "begin_line": 964,
      "end_line": 966,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 968,
      "end_line": 971,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "MeyerFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 975,
      "end_line": 1026,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 977,
      "end_line": 977,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MeyerFunction.MeyerFunction(double[], double, double, double[])",
      "begin_line": 979,
      "end_line": 989,
      "comment": "",
      "child_ranges": [
        "(line 983,col 7)-(line 984,col 34)",
        "(line 985,col 7)-(line 988,col 7)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MeyerFunction.jacobian(double[])",
      "begin_line": 991,
      "end_line": 1005,
      "comment": "",
      "child_ranges": [
        "(line 993,col 7)-(line 993,col 33)",
        "(line 994,col 7)-(line 994,col 33)",
        "(line 995,col 7)-(line 995,col 33)",
        "(line 996,col 7)-(line 996,col 44)",
        "(line 997,col 7)-(line 1003,col 7)",
        "(line 1004,col 7)-(line 1004,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.MeyerFunction.value(double[])",
      "begin_line": 1007,
      "end_line": 1017,
      "comment": "",
      "child_ranges": [
        "(line 1009,col 7)-(line 1009,col 31)",
        "(line 1010,col 7)-(line 1010,col 31)",
        "(line 1011,col 7)-(line 1011,col 31)",
        "(line 1012,col 7)-(line 1012,col 33)",
        "(line 1013,col 7)-(line 1015,col 7)",
        "(line 1016,col 6)-(line 1016,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 1019,
      "end_line": 1024,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "WatsonFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1028,
      "end_line": 1102,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1030,
      "end_line": 1030,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.WatsonFunction.WatsonFunction(int, double, double, double, double[])",
      "begin_line": 1032,
      "end_line": 1038,
      "comment": "",
      "child_ranges": [
        "(line 1036,col 7)-(line 1037,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.WatsonFunction.jacobian(double[])",
      "begin_line": 1040,
      "end_line": 1071,
      "comment": "",
      "child_ranges": [
        "(line 1043,col 7)-(line 1043,col 44)",
        "(line 1045,col 7)-(line 1060,col 7)",
        "(line 1062,col 7)-(line 1062,col 41)",
        "(line 1063,col 7)-(line 1063,col 29)",
        "(line 1065,col 7)-(line 1065,col 40)",
        "(line 1066,col 7)-(line 1066,col 44)",
        "(line 1067,col 7)-(line 1067,col 28)",
        "(line 1069,col 7)-(line 1069,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.WatsonFunction.value(double[])",
      "begin_line": 1073,
      "end_line": 1100,
      "comment": "",
      "child_ranges": [
        "(line 1075,col 6)-(line 1075,col 32)",
        "(line 1076,col 6)-(line 1091,col 6)",
        "(line 1093,col 6)-(line 1093,col 30)",
        "(line 1094,col 6)-(line 1094,col 30)",
        "(line 1095,col 6)-(line 1095,col 19)",
        "(line 1096,col 6)-(line 1096,col 33)",
        "(line 1098,col 6)-(line 1098,col 14)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Box3DimensionalFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1104,
      "end_line": 1144,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1106,
      "end_line": 1106,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.Box3DimensionalFunction.Box3DimensionalFunction(int, double[], double)",
      "begin_line": 1108,
      "end_line": 1112,
      "comment": "",
      "child_ranges": [
        "(line 1110,col 7)-(line 1111,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.Box3DimensionalFunction.jacobian(double[])",
      "begin_line": 1114,
      "end_line": 1128,
      "comment": "",
      "child_ranges": [
        "(line 1116,col 7)-(line 1116,col 33)",
        "(line 1117,col 7)-(line 1117,col 33)",
        "(line 1118,col 7)-(line 1118,col 44)",
        "(line 1119,col 7)-(line 1126,col 7)",
        "(line 1127,col 7)-(line 1127,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.Box3DimensionalFunction.value(double[])",
      "begin_line": 1130,
      "end_line": 1142,
      "comment": "",
      "child_ranges": [
        "(line 1132,col 7)-(line 1132,col 31)",
        "(line 1133,col 7)-(line 1133,col 31)",
        "(line 1134,col 7)-(line 1134,col 31)",
        "(line 1135,col 7)-(line 1135,col 33)",
        "(line 1136,col 7)-(line 1140,col 7)",
        "(line 1141,col 7)-(line 1141,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "JennrichSampsonFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1146,
      "end_line": 1182,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1148,
      "end_line": 1148,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.JennrichSampsonFunction.JennrichSampsonFunction(int, double[], double, double, double[])",
      "begin_line": 1150,
      "end_line": 1156,
      "comment": "",
      "child_ranges": [
        "(line 1154,col 7)-(line 1155,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.JennrichSampsonFunction.jacobian(double[])",
      "begin_line": 1158,
      "end_line": 1168,
      "comment": "",
      "child_ranges": [
        "(line 1160,col 7)-(line 1160,col 33)",
        "(line 1161,col 7)-(line 1161,col 33)",
        "(line 1162,col 7)-(line 1162,col 44)",
        "(line 1163,col 7)-(line 1166,col 7)",
        "(line 1167,col 7)-(line 1167,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.JennrichSampsonFunction.value(double[])",
      "begin_line": 1170,
      "end_line": 1180,
      "comment": "",
      "child_ranges": [
        "(line 1172,col 7)-(line 1172,col 31)",
        "(line 1173,col 7)-(line 1173,col 31)",
        "(line 1174,col 7)-(line 1174,col 33)",
        "(line 1175,col 7)-(line 1178,col 7)",
        "(line 1179,col 7)-(line 1179,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BrownDennisFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1184,
      "end_line": 1232,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1186,
      "end_line": 1186,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.BrownDennisFunction.BrownDennisFunction(int, double[], double, double, double[])",
      "begin_line": 1188,
      "end_line": 1195,
      "comment": "",
      "child_ranges": [
        "(line 1192,col 7)-(line 1193,col 34)",
        "(line 1194,col 7)-(line 1194,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.BrownDennisFunction.jacobian(double[])",
      "begin_line": 1197,
      "end_line": 1214,
      "comment": "",
      "child_ranges": [
        "(line 1199,col 7)-(line 1199,col 33)",
        "(line 1200,col 7)-(line 1200,col 33)",
        "(line 1201,col 7)-(line 1201,col 33)",
        "(line 1202,col 7)-(line 1202,col 33)",
        "(line 1203,col 7)-(line 1203,col 44)",
        "(line 1204,col 7)-(line 1212,col 7)",
        "(line 1213,col 7)-(line 1213,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.BrownDennisFunction.value(double[])",
      "begin_line": 1216,
      "end_line": 1230,
      "comment": "",
      "child_ranges": [
        "(line 1218,col 7)-(line 1218,col 31)",
        "(line 1219,col 7)-(line 1219,col 31)",
        "(line 1220,col 7)-(line 1220,col 31)",
        "(line 1221,col 7)-(line 1221,col 31)",
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
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1234,
      "end_line": 1316,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1236,
      "end_line": 1236,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.ChebyquadFunction.buildChebyquadArray(int, double)",
      "begin_line": 1238,
      "end_line": 1245,
      "comment": "",
      "child_ranges": [
        "(line 1239,col 7)-(line 1239,col 37)",
        "(line 1240,col 7)-(line 1240,col 36)",
        "(line 1241,col 7)-(line 1243,col 7)",
        "(line 1244,col 7)-(line 1244,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.ChebyquadFunction.ChebyquadFunction(int, int, double, double, double, double[])",
      "begin_line": 1247,
      "end_line": 1253,
      "comment": "",
      "child_ranges": [
        "(line 1251,col 7)-(line 1252,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.ChebyquadFunction.jacobian(double[])",
      "begin_line": 1255,
      "end_line": 1283,
      "comment": "",
      "child_ranges": [
        "(line 1258,col 7)-(line 1258,col 44)",
        "(line 1259,col 7)-(line 1261,col 7)",
        "(line 1263,col 7)-(line 1263,col 26)",
        "(line 1264,col 7)-(line 1279,col 7)",
        "(line 1281,col 7)-(line 1281,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.ChebyquadFunction.value(double[])",
      "begin_line": 1285,
      "end_line": 1314,
      "comment": "",
      "child_ranges": [
        "(line 1288,col 7)-(line 1288,col 33)",
        "(line 1290,col 7)-(line 1300,col 7)",
        "(line 1302,col 7)-(line 1302,col 26)",
        "(line 1303,col 7)-(line 1303,col 26)",
        "(line 1304,col 7)-(line 1310,col 7)",
        "(line 1312,col 7)-(line 1312,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BrownAlmostLinearFunction",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1318,
      "end_line": 1380,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1320,
      "end_line": 1320,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.BrownAlmostLinearFunction.BrownAlmostLinearFunction(int, double, double, double, double[])",
      "begin_line": 1322,
      "end_line": 1328,
      "comment": "",
      "child_ranges": [
        "(line 1326,col 7)-(line 1327,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.BrownAlmostLinearFunction.jacobian(double[])",
      "begin_line": 1330,
      "end_line": 1362,
      "comment": "",
      "child_ranges": [
        "(line 1332,col 7)-(line 1332,col 44)",
        "(line 1333,col 7)-(line 1335,col 7)",
        "(line 1337,col 7)-(line 1337,col 22)",
        "(line 1338,col 7)-(line 1344,col 7)",
        "(line 1346,col 7)-(line 1358,col 7)",
        "(line 1360,col 7)-(line 1360,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.BrownAlmostLinearFunction.value(double[])",
      "begin_line": 1364,
      "end_line": 1378,
      "comment": "",
      "child_ranges": [
        "(line 1366,col 7)-(line 1366,col 33)",
        "(line 1367,col 7)-(line 1367,col 29)",
        "(line 1368,col 7)-(line 1368,col 22)",
        "(line 1369,col 7)-(line 1372,col 7)",
        "(line 1373,col 7)-(line 1375,col 7)",
        "(line 1376,col 7)-(line 1376,col 26)",
        "(line 1377,col 7)-(line 1377,col 15)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Osborne1Function",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1382,
      "end_line": 1435,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1384,
      "end_line": 1384,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.Osborne1Function.Osborne1Function(double[], double, double, double[])",
      "begin_line": 1386,
      "end_line": 1392,
      "comment": "",
      "child_ranges": [
        "(line 1390,col 7)-(line 1391,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.Osborne1Function.jacobian(double[])",
      "begin_line": 1394,
      "end_line": 1410,
      "comment": "",
      "child_ranges": [
        "(line 1396,col 7)-(line 1396,col 33)",
        "(line 1397,col 7)-(line 1397,col 33)",
        "(line 1398,col 7)-(line 1398,col 33)",
        "(line 1399,col 7)-(line 1399,col 33)",
        "(line 1400,col 7)-(line 1400,col 44)",
        "(line 1401,col 7)-(line 1408,col 7)",
        "(line 1409,col 7)-(line 1409,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.Osborne1Function.value(double[])",
      "begin_line": 1412,
      "end_line": 1427,
      "comment": "",
      "child_ranges": [
        "(line 1414,col 7)-(line 1414,col 31)",
        "(line 1415,col 7)-(line 1415,col 31)",
        "(line 1416,col 7)-(line 1416,col 31)",
        "(line 1417,col 7)-(line 1417,col 31)",
        "(line 1418,col 7)-(line 1418,col 31)",
        "(line 1419,col 7)-(line 1419,col 33)",
        "(line 1420,col 7)-(line 1425,col 7)",
        "(line 1426,col 7)-(line 1426,col 15)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 1429,
      "end_line": 1433,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Osborne2Function",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.general.MinpackTest.MinpackFunction"
      ],
      "begin_line": 1437,
      "end_line": 1527,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 1439,
      "end_line": 1439,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.Osborne2Function.Osborne2Function(double[], double, double, double[])",
      "begin_line": 1441,
      "end_line": 1447,
      "comment": "",
      "child_ranges": [
        "(line 1445,col 7)-(line 1446,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.Osborne2Function.jacobian(double[])",
      "begin_line": 1449,
      "end_line": 1484,
      "comment": "",
      "child_ranges": [
        "(line 1451,col 7)-(line 1451,col 34)",
        "(line 1452,col 7)-(line 1452,col 34)",
        "(line 1453,col 7)-(line 1453,col 34)",
        "(line 1454,col 7)-(line 1454,col 34)",
        "(line 1455,col 7)-(line 1455,col 34)",
        "(line 1456,col 7)-(line 1456,col 34)",
        "(line 1457,col 7)-(line 1457,col 34)",
        "(line 1458,col 7)-(line 1458,col 34)",
        "(line 1459,col 7)-(line 1459,col 34)",
        "(line 1460,col 7)-(line 1460,col 34)",
        "(line 1461,col 7)-(line 1461,col 35)",
        "(line 1462,col 7)-(line 1462,col 44)",
        "(line 1463,col 7)-(line 1482,col 7)",
        "(line 1483,col 7)-(line 1483,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.MinpackTest.Osborne2Function.value(double[])",
      "begin_line": 1486,
      "end_line": 1509,
      "comment": "",
      "child_ranges": [
        "(line 1488,col 7)-(line 1488,col 32)",
        "(line 1489,col 7)-(line 1489,col 32)",
        "(line 1490,col 7)-(line 1490,col 32)",
        "(line 1491,col 7)-(line 1491,col 32)",
        "(line 1492,col 7)-(line 1492,col 32)",
        "(line 1493,col 7)-(line 1493,col 32)",
        "(line 1494,col 7)-(line 1494,col 32)",
        "(line 1495,col 7)-(line 1495,col 32)",
        "(line 1496,col 7)-(line 1496,col 32)",
        "(line 1497,col 7)-(line 1497,col 32)",
        "(line 1498,col 7)-(line 1498,col 33)",
        "(line 1499,col 7)-(line 1499,col 33)",
        "(line 1500,col 7)-(line 1507,col 7)",
        "(line 1508,col 7)-(line 1508,col 15)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 1511,
      "end_line": 1525,
      "comment": ""
    }
  ]
}