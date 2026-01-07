{
  "filepath": "/tmp/Math-64b/src/test/java/org/apache/commons/math/optimization/general/GaussNewtonOptimizerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GaussNewtonOptimizerTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 99,
      "end_line": 585,
      "comment": "\n * \u003cp\u003eSome of the unit tests are re-implementations of the MINPACK \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file17\"\u003efile17\u003c/a\u003e and \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file22\"\u003efile22\u003c/a\u003e test files.\n * The redistribution policy for MINPACK is available \u003ca\n * href\u003d\"http://www.netlib.org/minpack/disclaimer\"\u003ehere\u003c/a\u003e, for\n * convenience, it is reproduced below.\u003c/p\u003e\n\n * \u003ctable border\u003d\"0\" width\u003d\"80%\" cellpadding\u003d\"10\" align\u003d\"center\" bgcolor\u003d\"#E0E0E0\"\u003e\n * \u003ctr\u003e\u003ctd\u003e\n *    Minpack Copyright Notice (1999) University of Chicago.\n *    All rights reserved\n * \u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003e\n * Redistribution and use in source and binary forms, with or without\n * modification, are permitted provided that the following conditions\n * are met:\n * \u003col\u003e\n *  \u003cli\u003eRedistributions of source code must retain the above copyright\n *      notice, this list of conditions and the following disclaimer.\u003c/li\u003e\n * \u003cli\u003eRedistributions in binary form must reproduce the above\n *     copyright notice, this list of conditions and the following\n *     disclaimer in the documentation and/or other materials provided\n *     with the distribution.\u003c/li\u003e\n * \u003cli\u003eThe end-user documentation included with the redistribution, if any,\n *     must include the following acknowledgment:\n *     \u003ccode\u003eThis product includes software developed by the University of\n *           Chicago, as Operator of Argonne National Laboratory.\u003c/code\u003e\n *     Alternately, this acknowledgment may appear in the software itself,\n *     if and wherever such third-party acknowledgments normally appear.\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eWARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED \"AS IS\"\n *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE\n *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND\n *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR\n *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES\n *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE\n *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY\n *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR\n *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF\n *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)\n *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION\n *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL\n *     BE CORRECTED.\u003c/strong\u003e\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eLIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT\n *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF\n *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,\n *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF\n *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF\n *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER\n *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT\n *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,\n *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE\n *     POSSIBILITY OF SUCH LOSS OR DAMAGES.\u003c/strong\u003e\u003c/li\u003e\n * \u003col\u003e\u003c/td\u003e\u003c/tr\u003e\n * \u003c/table\u003e\n\n * @author Argonne National Laboratory. MINPACK project. March 1980 (original fortran minpack tests)\n * @author Burton S. Garbow (original fortran minpack tests)\n * @author Kenneth E. Hillstrom (original fortran minpack tests)\n * @author Jorge J. More (original fortran minpack tests)\n * @author Luc Maisonobe (non-minpack tests and minpack tests Java translation)\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.GaussNewtonOptimizerTest(java.lang.String)",
      "begin_line": 102,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testTrivial()",
      "begin_line": 106,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 107,col 9)-(line 108,col 76)",
        "(line 109,col 9)-(line 109,col 72)",
        "(line 110,col 9)-(line 110,col 40)",
        "(line 111,col 9)-(line 111,col 89)",
        "(line 112,col 9)-(line 113,col 96)",
        "(line 114,col 9)-(line 114,col 53)",
        "(line 115,col 9)-(line 115,col 58)",
        "(line 116,col 9)-(line 116,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testColumnsPermutation()",
      "begin_line": 119,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 121,col 9)-(line 123,col 62)",
        "(line 125,col 9)-(line 125,col 72)",
        "(line 126,col 9)-(line 126,col 40)",
        "(line 127,col 9)-(line 127,col 89)",
        "(line 128,col 9)-(line 129,col 105)",
        "(line 130,col 9)-(line 130,col 53)",
        "(line 131,col 9)-(line 131,col 58)",
        "(line 132,col 9)-(line 132,col 58)",
        "(line 133,col 9)-(line 133,col 58)",
        "(line 134,col 9)-(line 134,col 58)",
        "(line 135,col 9)-(line 135,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testNoDependency()",
      "begin_line": 139,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 140,col 9)-(line 147,col 58)",
        "(line 148,col 9)-(line 148,col 72)",
        "(line 149,col 9)-(line 149,col 40)",
        "(line 150,col 9)-(line 150,col 89)",
        "(line 151,col 9)-(line 153,col 66)",
        "(line 154,col 9)-(line 154,col 53)",
        "(line 155,col 9)-(line 157,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testOneSet()",
      "begin_line": 160,
      "end_line": 177,
      "comment": "",
      "child_ranges": [
        "(line 162,col 9)-(line 166,col 36)",
        "(line 167,col 9)-(line 167,col 72)",
        "(line 168,col 9)-(line 168,col 40)",
        "(line 169,col 9)-(line 169,col 89)",
        "(line 170,col 9)-(line 171,col 108)",
        "(line 172,col 9)-(line 172,col 53)",
        "(line 173,col 9)-(line 173,col 58)",
        "(line 174,col 9)-(line 174,col 58)",
        "(line 175,col 9)-(line 175,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testTwoSets()",
      "begin_line": 179,
      "end_line": 204,
      "comment": "",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 32)",
        "(line 181,col 9)-(line 188,col 66)",
        "(line 190,col 9)-(line 190,col 72)",
        "(line 191,col 9)-(line 191,col 40)",
        "(line 192,col 9)-(line 192,col 89)",
        "(line 193,col 9)-(line 195,col 66)",
        "(line 196,col 9)-(line 196,col 53)",
        "(line 197,col 9)-(line 197,col 59)",
        "(line 198,col 9)-(line 198,col 59)",
        "(line 199,col 9)-(line 199,col 59)",
        "(line 200,col 9)-(line 200,col 59)",
        "(line 201,col 9)-(line 201,col 69)",
        "(line 202,col 9)-(line 202,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testNonInversible()",
      "begin_line": 206,
      "end_line": 224,
      "comment": "",
      "child_ranges": [
        "(line 208,col 9)-(line 212,col 37)",
        "(line 213,col 9)-(line 213,col 72)",
        "(line 214,col 9)-(line 214,col 40)",
        "(line 215,col 9)-(line 215,col 89)",
        "(line 216,col 9)-(line 223,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testIllConditioned()",
      "begin_line": 226,
      "end_line": 260,
      "comment": "",
      "child_ranges": [
        "(line 227,col 9)-(line 232,col 44)",
        "(line 233,col 9)-(line 233,col 72)",
        "(line 234,col 9)-(line 234,col 40)",
        "(line 235,col 9)-(line 235,col 89)",
        "(line 236,col 9)-(line 238,col 60)",
        "(line 239,col 9)-(line 239,col 53)",
        "(line 240,col 9)-(line 240,col 59)",
        "(line 241,col 9)-(line 241,col 59)",
        "(line 242,col 9)-(line 242,col 59)",
        "(line 243,col 9)-(line 243,col 59)",
        "(line 245,col 9)-(line 250,col 44)",
        "(line 251,col 9)-(line 253,col 60)",
        "(line 254,col 9)-(line 254,col 53)",
        "(line 255,col 9)-(line 255,col 60)",
        "(line 256,col 9)-(line 256,col 60)",
        "(line 257,col 9)-(line 257,col 60)",
        "(line 258,col 9)-(line 258,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testMoreEstimatedParametersSimple()",
      "begin_line": 262,
      "end_line": 283,
      "comment": "",
      "child_ranges": [
        "(line 264,col 9)-(line 268,col 43)",
        "(line 270,col 9)-(line 270,col 72)",
        "(line 271,col 9)-(line 271,col 40)",
        "(line 272,col 9)-(line 272,col 89)",
        "(line 273,col 9)-(line 281,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testMoreEstimatedParametersUnsorted()",
      "begin_line": 285,
      "end_line": 305,
      "comment": "",
      "child_ranges": [
        "(line 286,col 9)-(line 292,col 55)",
        "(line 293,col 9)-(line 293,col 72)",
        "(line 294,col 9)-(line 294,col 40)",
        "(line 295,col 9)-(line 295,col 89)",
        "(line 296,col 9)-(line 304,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testRedundantEquations()",
      "begin_line": 307,
      "end_line": 324,
      "comment": "",
      "child_ranges": [
        "(line 308,col 9)-(line 312,col 43)",
        "(line 314,col 9)-(line 314,col 72)",
        "(line 315,col 9)-(line 315,col 40)",
        "(line 316,col 9)-(line 316,col 89)",
        "(line 317,col 9)-(line 319,col 54)",
        "(line 320,col 9)-(line 320,col 53)",
        "(line 321,col 9)-(line 321,col 57)",
        "(line 322,col 9)-(line 322,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testInconsistentEquations()",
      "begin_line": 326,
      "end_line": 339,
      "comment": "",
      "child_ranges": [
        "(line 327,col 9)-(line 331,col 43)",
        "(line 333,col 9)-(line 333,col 72)",
        "(line 334,col 9)-(line 334,col 40)",
        "(line 335,col 9)-(line 335,col 89)",
        "(line 336,col 9)-(line 336,col 101)",
        "(line 337,col 9)-(line 337,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testInconsistentSizes()",
      "begin_line": 341,
      "end_line": 376,
      "comment": "",
      "child_ranges": [
        "(line 342,col 9)-(line 343,col 93)",
        "(line 344,col 9)-(line 344,col 72)",
        "(line 345,col 9)-(line 345,col 40)",
        "(line 346,col 9)-(line 346,col 89)",
        "(line 348,col 9)-(line 349,col 102)",
        "(line 350,col 9)-(line 350,col 53)",
        "(line 351,col 9)-(line 351,col 57)",
        "(line 352,col 9)-(line 352,col 57)",
        "(line 354,col 9)-(line 363,col 9)",
        "(line 365,col 9)-(line 374,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testMaxIterations()",
      "begin_line": 378,
      "end_line": 398,
      "comment": "",
      "child_ranges": [
        "(line 379,col 9)-(line 379,col 37)",
        "(line 380,col 9)-(line 380,col 38)",
        "(line 381,col 9)-(line 381,col 38)",
        "(line 382,col 9)-(line 382,col 38)",
        "(line 383,col 9)-(line 383,col 38)",
        "(line 384,col 9)-(line 384,col 38)",
        "(line 385,col 9)-(line 385,col 72)",
        "(line 386,col 9)-(line 386,col 40)",
        "(line 387,col 9)-(line 387,col 91)",
        "(line 388,col 9)-(line 397,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testCircleFitting()",
      "begin_line": 400,
      "end_line": 419,
      "comment": "",
      "child_ranges": [
        "(line 401,col 9)-(line 401,col 37)",
        "(line 402,col 9)-(line 402,col 38)",
        "(line 403,col 9)-(line 403,col 38)",
        "(line 404,col 9)-(line 404,col 38)",
        "(line 405,col 9)-(line 405,col 38)",
        "(line 406,col 9)-(line 406,col 38)",
        "(line 407,col 9)-(line 407,col 72)",
        "(line 408,col 9)-(line 408,col 40)",
        "(line 409,col 9)-(line 409,col 91)",
        "(line 410,col 9)-(line 413,col 64)",
        "(line 414,col 9)-(line 414,col 98)",
        "(line 415,col 9)-(line 415,col 103)",
        "(line 416,col 9)-(line 416,col 75)",
        "(line 417,col 9)-(line 417,col 59)",
        "(line 418,col 9)-(line 418,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testCircleFittingBadInit()",
      "begin_line": 421,
      "end_line": 479,
      "comment": "",
      "child_ranges": [
        "(line 422,col 9)-(line 422,col 37)",
        "(line 423,col 9)-(line 453,col 10)",
        "(line 454,col 9)-(line 454,col 52)",
        "(line 455,col 9)-(line 455,col 33)",
        "(line 456,col 9)-(line 456,col 53)",
        "(line 457,col 9)-(line 457,col 34)",
        "(line 458,col 9)-(line 460,col 9)",
        "(line 461,col 9)-(line 461,col 72)",
        "(line 462,col 9)-(line 462,col 40)",
        "(line 463,col 9)-(line 463,col 89)",
        "(line 464,col 9)-(line 471,col 9)",
        "(line 473,col 9)-(line 474,col 79)",
        "(line 475,col 9)-(line 475,col 76)",
        "(line 476,col 9)-(line 476,col 76)",
        "(line 477,col 9)-(line 477,col 76)"
      ]
    },
    {
      "type": "class_interface",
      "name": "LinearProblem",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction",
        "java.io.Serializable"
      ],
      "begin_line": 481,
      "end_line": 504,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 483,
      "end_line": 483,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "factors"
      ],
      "begin_line": 484,
      "end_line": 484,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "target"
      ],
      "begin_line": 485,
      "end_line": 485,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.LinearProblem.LinearProblem(double[][], double[])",
      "begin_line": 486,
      "end_line": 489,
      "comment": "",
      "child_ranges": [
        "(line 487,col 13)-(line 487,col 56)",
        "(line 488,col 13)-(line 488,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.LinearProblem.value(double[])",
      "begin_line": 491,
      "end_line": 493,
      "comment": "",
      "child_ranges": [
        "(line 492,col 13)-(line 492,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.LinearProblem.jacobian()",
      "begin_line": 495,
      "end_line": 502,
      "comment": "",
      "child_ranges": [
        "(line 496,col 13)-(line 501,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 497,
      "end_line": 497,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.LinearProblem.Anonymous-2fbb4839-de1c-4f2f-91df-8e86c8a6eff8.value(double[])",
      "begin_line": 498,
      "end_line": 500,
      "comment": "",
      "child_ranges": [
        "(line 499,col 21)-(line 499,col 45)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Circle",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction",
        "java.io.Serializable"
      ],
      "begin_line": 506,
      "end_line": 583,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 508,
      "end_line": 508,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "points"
      ],
      "begin_line": 509,
      "end_line": 509,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.Circle.Circle()",
      "begin_line": 511,
      "end_line": 513,
      "comment": "",
      "child_ranges": [
        "(line 512,col 13)-(line 512,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.Circle.addPoint(double, double)",
      "begin_line": 515,
      "end_line": 517,
      "comment": "",
      "child_ranges": [
        "(line 516,col 13)-(line 516,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.Circle.getN()",
      "begin_line": 519,
      "end_line": 521,
      "comment": "",
      "child_ranges": [
        "(line 520,col 13)-(line 520,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.Circle.getRadius(java.awt.geom.Point2D.Double)",
      "begin_line": 523,
      "end_line": 529,
      "comment": "",
      "child_ranges": [
        "(line 524,col 13)-(line 524,col 25)",
        "(line 525,col 13)-(line 527,col 13)",
        "(line 528,col 13)-(line 528,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.Circle.jacobian(double[])",
      "begin_line": 531,
      "end_line": 558,
      "comment": "",
      "child_ranges": [
        "(line 533,col 13)-(line 533,col 34)",
        "(line 534,col 13)-(line 534,col 83)",
        "(line 537,col 13)-(line 537,col 28)",
        "(line 538,col 13)-(line 538,col 28)",
        "(line 539,col 13)-(line 543,col 13)",
        "(line 544,col 13)-(line 544,col 22)",
        "(line 545,col 13)-(line 545,col 22)",
        "(line 548,col 13)-(line 548,col 51)",
        "(line 549,col 13)-(line 554,col 12)",
        "(line 556,col 13)-(line 556,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.Circle.value(double[])",
      "begin_line": 560,
      "end_line": 572,
      "comment": "",
      "child_ranges": [
        "(line 562,col 13)-(line 562,col 83)",
        "(line 563,col 13)-(line 563,col 46)",
        "(line 565,col 13)-(line 565,col 59)",
        "(line 566,col 13)-(line 568,col 13)",
        "(line 570,col 13)-(line 570,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.Circle.jacobian()",
      "begin_line": 574,
      "end_line": 581,
      "comment": "",
      "child_ranges": [
        "(line 575,col 13)-(line 580,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 576,
      "end_line": 576,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.Circle.Anonymous-6a06fcb4-574f-48a7-927e-1c8bf08878e1.value(double[])",
      "begin_line": 577,
      "end_line": 579,
      "comment": "",
      "child_ranges": [
        "(line 578,col 21)-(line 578,col 43)"
      ]
    }
  ]
}