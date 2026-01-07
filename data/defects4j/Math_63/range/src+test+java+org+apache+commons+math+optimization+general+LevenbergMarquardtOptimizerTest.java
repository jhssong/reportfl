{
  "filepath": "/tmp/Math-63b/src/test/java/org/apache/commons/math/optimization/general/LevenbergMarquardtOptimizerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LevenbergMarquardtOptimizerTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 102,
      "end_line": 675,
      "comment": "\n * \u003cp\u003eSome of the unit tests are re-implementations of the MINPACK \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file17\"\u003efile17\u003c/a\u003e and \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file22\"\u003efile22\u003c/a\u003e test files.\n * The redistribution policy for MINPACK is available \u003ca\n * href\u003d\"http://www.netlib.org/minpack/disclaimer\"\u003ehere\u003c/a\u003e, for\n * convenience, it is reproduced below.\u003c/p\u003e\n\n * \u003ctable border\u003d\"0\" width\u003d\"80%\" cellpadding\u003d\"10\" align\u003d\"center\" bgcolor\u003d\"#E0E0E0\"\u003e\n * \u003ctr\u003e\u003ctd\u003e\n *    Minpack Copyright Notice (1999) University of Chicago.\n *    All rights reserved\n * \u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003e\n * Redistribution and use in source and binary forms, with or without\n * modification, are permitted provided that the following conditions\n * are met:\n * \u003col\u003e\n *  \u003cli\u003eRedistributions of source code must retain the above copyright\n *      notice, this list of conditions and the following disclaimer.\u003c/li\u003e\n * \u003cli\u003eRedistributions in binary form must reproduce the above\n *     copyright notice, this list of conditions and the following\n *     disclaimer in the documentation and/or other materials provided\n *     with the distribution.\u003c/li\u003e\n * \u003cli\u003eThe end-user documentation included with the redistribution, if any,\n *     must include the following acknowledgment:\n *     \u003ccode\u003eThis product includes software developed by the University of\n *           Chicago, as Operator of Argonne National Laboratory.\u003c/code\u003e\n *     Alternately, this acknowledgment may appear in the software itself,\n *     if and wherever such third-party acknowledgments normally appear.\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eWARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED \"AS IS\"\n *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE\n *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND\n *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR\n *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES\n *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE\n *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY\n *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR\n *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF\n *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)\n *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION\n *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL\n *     BE CORRECTED.\u003c/strong\u003e\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eLIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT\n *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF\n *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,\n *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF\n *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF\n *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER\n *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT\n *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,\n *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE\n *     POSSIBILITY OF SUCH LOSS OR DAMAGES.\u003c/strong\u003e\u003c/li\u003e\n * \u003col\u003e\u003c/td\u003e\u003c/tr\u003e\n * \u003c/table\u003e\n\n * @author Argonne National Laboratory. MINPACK project. March 1980 (original fortran minpack tests)\n * @author Burton S. Garbow (original fortran minpack tests)\n * @author Kenneth E. Hillstrom (original fortran minpack tests)\n * @author Jorge J. More (original fortran minpack tests)\n * @author Luc Maisonobe (non-minpack tests and minpack tests Java translation)\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.LevenbergMarquardtOptimizerTest(java.lang.String)",
      "begin_line": 105,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testTrivial()",
      "begin_line": 109,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 110,col 9)-(line 111,col 76)",
        "(line 112,col 9)-(line 112,col 82)",
        "(line 113,col 9)-(line 114,col 96)",
        "(line 115,col 9)-(line 115,col 53)",
        "(line 116,col 9)-(line 123,col 9)",
        "(line 124,col 9)-(line 124,col 58)",
        "(line 125,col 9)-(line 125,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testQRColumnsPermutation()",
      "begin_line": 128,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 130,col 9)-(line 132,col 62)",
        "(line 134,col 9)-(line 134,col 82)",
        "(line 135,col 9)-(line 136,col 105)",
        "(line 137,col 9)-(line 137,col 53)",
        "(line 138,col 9)-(line 138,col 58)",
        "(line 139,col 9)-(line 139,col 58)",
        "(line 140,col 9)-(line 140,col 58)",
        "(line 141,col 9)-(line 141,col 58)",
        "(line 142,col 9)-(line 142,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testNoDependency()",
      "begin_line": 146,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 147,col 9)-(line 154,col 58)",
        "(line 155,col 9)-(line 155,col 82)",
        "(line 156,col 9)-(line 158,col 66)",
        "(line 159,col 9)-(line 159,col 53)",
        "(line 160,col 9)-(line 162,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testOneSet()",
      "begin_line": 165,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 167,col 9)-(line 171,col 36)",
        "(line 172,col 9)-(line 172,col 82)",
        "(line 173,col 9)-(line 174,col 108)",
        "(line 175,col 9)-(line 175,col 53)",
        "(line 176,col 9)-(line 176,col 58)",
        "(line 177,col 9)-(line 177,col 58)",
        "(line 178,col 9)-(line 178,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testTwoSets()",
      "begin_line": 182,
      "end_line": 205,
      "comment": "",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 32)",
        "(line 184,col 9)-(line 191,col 66)",
        "(line 193,col 9)-(line 193,col 82)",
        "(line 194,col 9)-(line 196,col 66)",
        "(line 197,col 9)-(line 197,col 53)",
        "(line 198,col 9)-(line 198,col 59)",
        "(line 199,col 9)-(line 199,col 59)",
        "(line 200,col 9)-(line 200,col 59)",
        "(line 201,col 9)-(line 201,col 59)",
        "(line 202,col 9)-(line 202,col 69)",
        "(line 203,col 9)-(line 203,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testNonInversible()",
      "begin_line": 207,
      "end_line": 227,
      "comment": "",
      "child_ranges": [
        "(line 209,col 9)-(line 213,col 37)",
        "(line 215,col 9)-(line 215,col 82)",
        "(line 216,col 9)-(line 216,col 104)",
        "(line 217,col 9)-(line 217,col 84)",
        "(line 218,col 9)-(line 225,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testIllConditioned()",
      "begin_line": 229,
      "end_line": 261,
      "comment": "",
      "child_ranges": [
        "(line 230,col 9)-(line 235,col 44)",
        "(line 236,col 9)-(line 236,col 82)",
        "(line 237,col 9)-(line 239,col 60)",
        "(line 240,col 9)-(line 240,col 53)",
        "(line 241,col 9)-(line 241,col 59)",
        "(line 242,col 9)-(line 242,col 59)",
        "(line 243,col 9)-(line 243,col 59)",
        "(line 244,col 9)-(line 244,col 59)",
        "(line 246,col 9)-(line 251,col 44)",
        "(line 252,col 9)-(line 254,col 60)",
        "(line 255,col 9)-(line 255,col 53)",
        "(line 256,col 9)-(line 256,col 60)",
        "(line 257,col 9)-(line 257,col 60)",
        "(line 258,col 9)-(line 258,col 60)",
        "(line 259,col 9)-(line 259,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testMoreEstimatedParametersSimple()",
      "begin_line": 263,
      "end_line": 276,
      "comment": "",
      "child_ranges": [
        "(line 265,col 9)-(line 269,col 43)",
        "(line 271,col 9)-(line 271,col 82)",
        "(line 272,col 9)-(line 273,col 45)",
        "(line 274,col 9)-(line 274,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testMoreEstimatedParametersUnsorted()",
      "begin_line": 278,
      "end_line": 297,
      "comment": "",
      "child_ranges": [
        "(line 279,col 9)-(line 285,col 54)",
        "(line 287,col 9)-(line 287,col 82)",
        "(line 288,col 9)-(line 290,col 66)",
        "(line 291,col 9)-(line 291,col 53)",
        "(line 292,col 9)-(line 292,col 61)",
        "(line 293,col 9)-(line 293,col 61)",
        "(line 294,col 9)-(line 294,col 61)",
        "(line 295,col 9)-(line 295,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testRedundantEquations()",
      "begin_line": 299,
      "end_line": 314,
      "comment": "",
      "child_ranges": [
        "(line 300,col 9)-(line 304,col 43)",
        "(line 306,col 9)-(line 306,col 82)",
        "(line 307,col 9)-(line 309,col 54)",
        "(line 310,col 9)-(line 310,col 53)",
        "(line 311,col 9)-(line 311,col 61)",
        "(line 312,col 9)-(line 312,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testInconsistentEquations()",
      "begin_line": 316,
      "end_line": 327,
      "comment": "",
      "child_ranges": [
        "(line 317,col 9)-(line 321,col 43)",
        "(line 323,col 9)-(line 323,col 82)",
        "(line 324,col 9)-(line 324,col 101)",
        "(line 325,col 9)-(line 325,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testInconsistentSizes()",
      "begin_line": 329,
      "end_line": 362,
      "comment": "",
      "child_ranges": [
        "(line 330,col 9)-(line 331,col 93)",
        "(line 332,col 9)-(line 332,col 82)",
        "(line 334,col 9)-(line 335,col 102)",
        "(line 336,col 9)-(line 336,col 53)",
        "(line 337,col 9)-(line 337,col 57)",
        "(line 338,col 9)-(line 338,col 57)",
        "(line 340,col 9)-(line 349,col 9)",
        "(line 351,col 9)-(line 360,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testControlParameters()",
      "begin_line": 364,
      "end_line": 376,
      "comment": "",
      "child_ranges": [
        "(line 365,col 9)-(line 365,col 37)",
        "(line 366,col 9)-(line 366,col 38)",
        "(line 367,col 9)-(line 367,col 38)",
        "(line 368,col 9)-(line 368,col 38)",
        "(line 369,col 9)-(line 369,col 38)",
        "(line 370,col 9)-(line 370,col 38)",
        "(line 371,col 9)-(line 371,col 73)",
        "(line 372,col 9)-(line 372,col 72)",
        "(line 373,col 9)-(line 373,col 72)",
        "(line 374,col 9)-(line 374,col 35)",
        "(line 375,col 9)-(line 375,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.checkEstimate(org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction, double, int, double, double, double, boolean)",
      "begin_line": 378,
      "end_line": 399,
      "comment": "",
      "child_ranges": [
        "(line 382,col 9)-(line 398,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testCircleFitting()",
      "begin_line": 401,
      "end_line": 448,
      "comment": "",
      "child_ranges": [
        "(line 402,col 9)-(line 402,col 37)",
        "(line 403,col 9)-(line 403,col 38)",
        "(line 404,col 9)-(line 404,col 38)",
        "(line 405,col 9)-(line 405,col 38)",
        "(line 406,col 9)-(line 406,col 38)",
        "(line 407,col 9)-(line 407,col 38)",
        "(line 408,col 9)-(line 408,col 82)",
        "(line 409,col 9)-(line 411,col 64)",
        "(line 412,col 9)-(line 412,col 52)",
        "(line 413,col 9)-(line 413,col 60)",
        "(line 414,col 9)-(line 414,col 40)",
        "(line 415,col 9)-(line 415,col 87)",
        "(line 416,col 9)-(line 416,col 103)",
        "(line 417,col 9)-(line 417,col 75)",
        "(line 418,col 9)-(line 418,col 64)",
        "(line 419,col 9)-(line 419,col 64)",
        "(line 420,col 9)-(line 420,col 52)",
        "(line 421,col 9)-(line 421,col 46)",
        "(line 422,col 9)-(line 422,col 46)",
        "(line 423,col 9)-(line 423,col 52)",
        "(line 424,col 9)-(line 424,col 46)",
        "(line 425,col 9)-(line 425,col 60)",
        "(line 426,col 9)-(line 426,col 46)",
        "(line 427,col 9)-(line 427,col 46)",
        "(line 430,col 9)-(line 430,col 45)",
        "(line 431,col 9)-(line 433,col 9)",
        "(line 434,col 9)-(line 434,col 52)",
        "(line 435,col 9)-(line 435,col 33)",
        "(line 436,col 9)-(line 436,col 53)",
        "(line 437,col 9)-(line 437,col 34)",
        "(line 438,col 9)-(line 438,col 85)",
        "(line 439,col 9)-(line 439,col 41)",
        "(line 440,col 9)-(line 440,col 47)",
        "(line 441,col 9)-(line 441,col 48)",
        "(line 442,col 9)-(line 442,col 52)",
        "(line 443,col 9)-(line 443,col 47)",
        "(line 444,col 9)-(line 444,col 51)",
        "(line 445,col 9)-(line 445,col 46)",
        "(line 446,col 9)-(line 446,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testCircleFittingBadInit()",
      "begin_line": 450,
      "end_line": 501,
      "comment": "",
      "child_ranges": [
        "(line 451,col 9)-(line 451,col 37)",
        "(line 452,col 9)-(line 482,col 10)",
        "(line 483,col 9)-(line 483,col 52)",
        "(line 484,col 9)-(line 484,col 33)",
        "(line 485,col 9)-(line 485,col 53)",
        "(line 486,col 9)-(line 486,col 34)",
        "(line 487,col 9)-(line 489,col 9)",
        "(line 490,col 9)-(line 490,col 82)",
        "(line 491,col 9)-(line 491,col 89)",
        "(line 492,col 9)-(line 493,col 83)",
        "(line 494,col 9)-(line 494,col 103)",
        "(line 495,col 9)-(line 495,col 52)",
        "(line 496,col 9)-(line 496,col 60)",
        "(line 497,col 9)-(line 497,col 57)",
        "(line 498,col 9)-(line 498,col 67)",
        "(line 499,col 9)-(line 499,col 56)",
        "(line 500,col 9)-(line 500,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testMath199()",
      "begin_line": 503,
      "end_line": 522,
      "comment": "",
      "child_ranges": [
        "(line 504,col 9)-(line 520,col 9)"
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
      "begin_line": 524,
      "end_line": 547,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 526,
      "end_line": 526,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "factors"
      ],
      "begin_line": 527,
      "end_line": 527,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "target"
      ],
      "begin_line": 528,
      "end_line": 528,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.LinearProblem.LinearProblem(double[][], double[])",
      "begin_line": 529,
      "end_line": 532,
      "comment": "",
      "child_ranges": [
        "(line 530,col 13)-(line 530,col 56)",
        "(line 531,col 13)-(line 531,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.LinearProblem.value(double[])",
      "begin_line": 534,
      "end_line": 536,
      "comment": "",
      "child_ranges": [
        "(line 535,col 13)-(line 535,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.LinearProblem.jacobian()",
      "begin_line": 538,
      "end_line": 545,
      "comment": "",
      "child_ranges": [
        "(line 539,col 13)-(line 544,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 540,
      "end_line": 540,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.LinearProblem.Anonymous-dc89f12a-ec2e-4d17-a0dd-e9aabfcb52d3.value(double[])",
      "begin_line": 541,
      "end_line": 543,
      "comment": "",
      "child_ranges": [
        "(line 542,col 21)-(line 542,col 45)"
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
      "begin_line": 549,
      "end_line": 628,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 551,
      "end_line": 551,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "points"
      ],
      "begin_line": 553,
      "end_line": 553,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.Circle.Circle()",
      "begin_line": 555,
      "end_line": 557,
      "comment": "",
      "child_ranges": [
        "(line 556,col 13)-(line 556,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.Circle.addPoint(double, double)",
      "begin_line": 559,
      "end_line": 561,
      "comment": "",
      "child_ranges": [
        "(line 560,col 13)-(line 560,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.Circle.getN()",
      "begin_line": 563,
      "end_line": 565,
      "comment": "",
      "child_ranges": [
        "(line 564,col 13)-(line 564,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.Circle.getRadius(java.awt.geom.Point2D.Double)",
      "begin_line": 567,
      "end_line": 573,
      "comment": "",
      "child_ranges": [
        "(line 568,col 13)-(line 568,col 25)",
        "(line 569,col 13)-(line 571,col 13)",
        "(line 572,col 13)-(line 572,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.Circle.jacobian(double[])",
      "begin_line": 575,
      "end_line": 602,
      "comment": "",
      "child_ranges": [
        "(line 577,col 13)-(line 577,col 34)",
        "(line 578,col 13)-(line 578,col 75)",
        "(line 581,col 13)-(line 581,col 28)",
        "(line 582,col 13)-(line 582,col 28)",
        "(line 583,col 13)-(line 587,col 13)",
        "(line 588,col 13)-(line 588,col 22)",
        "(line 589,col 13)-(line 589,col 22)",
        "(line 592,col 13)-(line 592,col 51)",
        "(line 593,col 13)-(line 598,col 13)",
        "(line 600,col 13)-(line 600,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.Circle.value(double[])",
      "begin_line": 604,
      "end_line": 617,
      "comment": "",
      "child_ranges": [
        "(line 607,col 13)-(line 607,col 83)",
        "(line 608,col 13)-(line 608,col 46)",
        "(line 610,col 13)-(line 610,col 59)",
        "(line 611,col 13)-(line 613,col 13)",
        "(line 615,col 13)-(line 615,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.Circle.jacobian()",
      "begin_line": 619,
      "end_line": 626,
      "comment": "",
      "child_ranges": [
        "(line 620,col 13)-(line 625,col 14)"
      ]
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
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.Circle.Anonymous-a91ff36f-b038-45be-8f27-5902450a7847.value(double[])",
      "begin_line": 622,
      "end_line": 624,
      "comment": "",
      "child_ranges": [
        "(line 623,col 21)-(line 623,col 43)"
      ]
    },
    {
      "type": "class_interface",
      "name": "QuadraticProblem",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction",
        "java.io.Serializable"
      ],
      "begin_line": 630,
      "end_line": 673,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 632,
      "end_line": 632,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "x"
      ],
      "begin_line": 633,
      "end_line": 633,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 634,
      "end_line": 634,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.QuadraticProblem.QuadraticProblem()",
      "begin_line": 636,
      "end_line": 639,
      "comment": "",
      "child_ranges": [
        "(line 637,col 13)-(line 637,col 40)",
        "(line 638,col 13)-(line 638,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.QuadraticProblem.addPoint(double, double)",
      "begin_line": 641,
      "end_line": 644,
      "comment": "",
      "child_ranges": [
        "(line 642,col 13)-(line 642,col 26)",
        "(line 643,col 13)-(line 643,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.QuadraticProblem.jacobian(double[])",
      "begin_line": 646,
      "end_line": 654,
      "comment": "",
      "child_ranges": [
        "(line 647,col 13)-(line 647,col 58)",
        "(line 648,col 13)-(line 652,col 13)",
        "(line 653,col 13)-(line 653,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.QuadraticProblem.value(double[])",
      "begin_line": 656,
      "end_line": 662,
      "comment": "",
      "child_ranges": [
        "(line 657,col 13)-(line 657,col 51)",
        "(line 658,col 13)-(line 660,col 13)",
        "(line 661,col 13)-(line 661,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.QuadraticProblem.jacobian()",
      "begin_line": 664,
      "end_line": 671,
      "comment": "",
      "child_ranges": [
        "(line 665,col 13)-(line 670,col 14)"
      ]
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
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.QuadraticProblem.Anonymous-a088e679-8678-4f61-9e9c-c9cf981c7dfb.value(double[])",
      "begin_line": 667,
      "end_line": 669,
      "comment": "",
      "child_ranges": [
        "(line 668,col 21)-(line 668,col 43)"
      ]
    }
  ]
}