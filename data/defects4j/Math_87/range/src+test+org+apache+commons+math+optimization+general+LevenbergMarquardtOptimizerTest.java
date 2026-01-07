{
  "filepath": "/tmp/Math-87b/src/test/org/apache/commons/math/optimization/general/LevenbergMarquardtOptimizerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LevenbergMarquardtOptimizerTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 101,
      "end_line": 677,
      "comment": "\n * \u003cp\u003eSome of the unit tests are re-implementations of the MINPACK \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file17\"\u003efile17\u003c/a\u003e and \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file22\"\u003efile22\u003c/a\u003e test files. \n * The redistribution policy for MINPACK is available \u003ca\n * href\u003d\"http://www.netlib.org/minpack/disclaimer\"\u003ehere\u003c/a\u003e, for\n * convenience, it is reproduced below.\u003c/p\u003e\n\n * \u003ctable border\u003d\"0\" width\u003d\"80%\" cellpadding\u003d\"10\" align\u003d\"center\" bgcolor\u003d\"#E0E0E0\"\u003e\n * \u003ctr\u003e\u003ctd\u003e\n *    Minpack Copyright Notice (1999) University of Chicago.\n *    All rights reserved\n * \u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003e\n * Redistribution and use in source and binary forms, with or without\n * modification, are permitted provided that the following conditions\n * are met:\n * \u003col\u003e\n *  \u003cli\u003eRedistributions of source code must retain the above copyright\n *      notice, this list of conditions and the following disclaimer.\u003c/li\u003e\n * \u003cli\u003eRedistributions in binary form must reproduce the above\n *     copyright notice, this list of conditions and the following\n *     disclaimer in the documentation and/or other materials provided\n *     with the distribution.\u003c/li\u003e\n * \u003cli\u003eThe end-user documentation included with the redistribution, if any,\n *     must include the following acknowledgment:\n *     \u003ccode\u003eThis product includes software developed by the University of\n *           Chicago, as Operator of Argonne National Laboratory.\u003c/code\u003e\n *     Alternately, this acknowledgment may appear in the software itself,\n *     if and wherever such third-party acknowledgments normally appear.\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eWARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED \"AS IS\"\n *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE\n *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND\n *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR\n *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES\n *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE\n *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY\n *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR\n *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF\n *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)\n *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION\n *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL\n *     BE CORRECTED.\u003c/strong\u003e\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eLIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT\n *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF\n *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,\n *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF\n *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF\n *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER\n *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT\n *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,\n *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE\n *     POSSIBILITY OF SUCH LOSS OR DAMAGES.\u003c/strong\u003e\u003c/li\u003e\n * \u003col\u003e\u003c/td\u003e\u003c/tr\u003e\n * \u003c/table\u003e\n\n * @author Argonne National Laboratory. MINPACK project. March 1980 (original fortran minpack tests)\n * @author Burton S. Garbow (original fortran minpack tests)\n * @author Kenneth E. Hillstrom (original fortran minpack tests)\n * @author Jorge J. More (original fortran minpack tests)\n * @author Luc Maisonobe (non-minpack tests and minpack tests Java translation)\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.LevenbergMarquardtOptimizerTest(java.lang.String)",
      "begin_line": 104,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testTrivial()",
      "begin_line": 108,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 109,col 9)-(line 110,col 76)",
        "(line 111,col 9)-(line 111,col 82)",
        "(line 112,col 9)-(line 113,col 96)",
        "(line 114,col 9)-(line 114,col 53)",
        "(line 115,col 9)-(line 122,col 9)",
        "(line 123,col 9)-(line 123,col 58)",
        "(line 124,col 9)-(line 124,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testQRColumnsPermutation()",
      "begin_line": 127,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 129,col 9)-(line 131,col 62)",
        "(line 133,col 9)-(line 133,col 82)",
        "(line 134,col 9)-(line 135,col 105)",
        "(line 136,col 9)-(line 136,col 53)",
        "(line 137,col 9)-(line 137,col 58)",
        "(line 138,col 9)-(line 138,col 58)",
        "(line 139,col 9)-(line 139,col 58)",
        "(line 140,col 9)-(line 140,col 58)",
        "(line 141,col 9)-(line 141,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testNoDependency()",
      "begin_line": 145,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 146,col 9)-(line 153,col 58)",
        "(line 154,col 9)-(line 154,col 82)",
        "(line 155,col 9)-(line 157,col 66)",
        "(line 158,col 9)-(line 158,col 53)",
        "(line 159,col 9)-(line 161,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testOneSet()",
      "begin_line": 164,
      "end_line": 179,
      "comment": "",
      "child_ranges": [
        "(line 166,col 9)-(line 170,col 36)",
        "(line 171,col 9)-(line 171,col 82)",
        "(line 172,col 9)-(line 173,col 108)",
        "(line 174,col 9)-(line 174,col 53)",
        "(line 175,col 9)-(line 175,col 58)",
        "(line 176,col 9)-(line 176,col 58)",
        "(line 177,col 9)-(line 177,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testTwoSets()",
      "begin_line": 181,
      "end_line": 204,
      "comment": "",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 32)",
        "(line 183,col 9)-(line 190,col 66)",
        "(line 192,col 9)-(line 192,col 82)",
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
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testNonInversible()",
      "begin_line": 206,
      "end_line": 226,
      "comment": "",
      "child_ranges": [
        "(line 208,col 9)-(line 212,col 37)",
        "(line 214,col 9)-(line 214,col 82)",
        "(line 215,col 9)-(line 215,col 104)",
        "(line 216,col 9)-(line 216,col 80)",
        "(line 217,col 9)-(line 224,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testIllConditioned()",
      "begin_line": 228,
      "end_line": 260,
      "comment": "",
      "child_ranges": [
        "(line 229,col 9)-(line 234,col 44)",
        "(line 235,col 9)-(line 235,col 82)",
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
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testMoreEstimatedParametersSimple()",
      "begin_line": 262,
      "end_line": 275,
      "comment": "",
      "child_ranges": [
        "(line 264,col 9)-(line 268,col 43)",
        "(line 270,col 9)-(line 270,col 82)",
        "(line 271,col 9)-(line 272,col 45)",
        "(line 273,col 9)-(line 273,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testMoreEstimatedParametersUnsorted()",
      "begin_line": 277,
      "end_line": 296,
      "comment": "",
      "child_ranges": [
        "(line 278,col 9)-(line 284,col 54)",
        "(line 286,col 9)-(line 286,col 82)",
        "(line 287,col 9)-(line 289,col 66)",
        "(line 290,col 9)-(line 290,col 53)",
        "(line 291,col 9)-(line 291,col 61)",
        "(line 292,col 9)-(line 292,col 61)",
        "(line 293,col 9)-(line 293,col 61)",
        "(line 294,col 9)-(line 294,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testRedundantEquations()",
      "begin_line": 298,
      "end_line": 313,
      "comment": "",
      "child_ranges": [
        "(line 299,col 9)-(line 303,col 43)",
        "(line 305,col 9)-(line 305,col 82)",
        "(line 306,col 9)-(line 308,col 54)",
        "(line 309,col 9)-(line 309,col 53)",
        "(line 310,col 9)-(line 310,col 61)",
        "(line 311,col 9)-(line 311,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testInconsistentEquations()",
      "begin_line": 315,
      "end_line": 326,
      "comment": "",
      "child_ranges": [
        "(line 316,col 9)-(line 320,col 43)",
        "(line 322,col 9)-(line 322,col 82)",
        "(line 323,col 9)-(line 323,col 101)",
        "(line 324,col 9)-(line 324,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testInconsistentSizes()",
      "begin_line": 328,
      "end_line": 361,
      "comment": "",
      "child_ranges": [
        "(line 329,col 9)-(line 330,col 93)",
        "(line 331,col 9)-(line 331,col 82)",
        "(line 333,col 9)-(line 334,col 102)",
        "(line 335,col 9)-(line 335,col 53)",
        "(line 336,col 9)-(line 336,col 57)",
        "(line 337,col 9)-(line 337,col 57)",
        "(line 339,col 9)-(line 348,col 9)",
        "(line 350,col 9)-(line 359,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testControlParameters()",
      "begin_line": 363,
      "end_line": 375,
      "comment": "",
      "child_ranges": [
        "(line 364,col 9)-(line 364,col 37)",
        "(line 365,col 9)-(line 365,col 38)",
        "(line 366,col 9)-(line 366,col 38)",
        "(line 367,col 9)-(line 367,col 38)",
        "(line 368,col 9)-(line 368,col 38)",
        "(line 369,col 9)-(line 369,col 38)",
        "(line 370,col 9)-(line 370,col 73)",
        "(line 371,col 9)-(line 371,col 72)",
        "(line 372,col 9)-(line 372,col 72)",
        "(line 373,col 9)-(line 373,col 35)",
        "(line 374,col 9)-(line 374,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.checkEstimate(org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction, double, int, double, double, double, boolean)",
      "begin_line": 377,
      "end_line": 398,
      "comment": "",
      "child_ranges": [
        "(line 381,col 9)-(line 397,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testCircleFitting()",
      "begin_line": 400,
      "end_line": 448,
      "comment": "",
      "child_ranges": [
        "(line 401,col 9)-(line 401,col 37)",
        "(line 402,col 9)-(line 402,col 38)",
        "(line 403,col 9)-(line 403,col 38)",
        "(line 404,col 9)-(line 404,col 38)",
        "(line 405,col 9)-(line 405,col 38)",
        "(line 406,col 9)-(line 406,col 38)",
        "(line 407,col 9)-(line 407,col 82)",
        "(line 408,col 9)-(line 410,col 64)",
        "(line 411,col 9)-(line 411,col 52)",
        "(line 412,col 9)-(line 412,col 60)",
        "(line 413,col 9)-(line 413,col 40)",
        "(line 414,col 9)-(line 414,col 83)",
        "(line 415,col 9)-(line 415,col 103)",
        "(line 416,col 9)-(line 416,col 75)",
        "(line 417,col 9)-(line 417,col 64)",
        "(line 418,col 9)-(line 418,col 64)",
        "(line 419,col 9)-(line 419,col 52)",
        "(line 420,col 9)-(line 420,col 46)",
        "(line 421,col 9)-(line 421,col 46)",
        "(line 422,col 9)-(line 422,col 52)",
        "(line 423,col 9)-(line 423,col 46)",
        "(line 424,col 9)-(line 424,col 60)",
        "(line 425,col 9)-(line 425,col 46)",
        "(line 426,col 9)-(line 426,col 46)",
        "(line 429,col 9)-(line 429,col 45)",
        "(line 430,col 9)-(line 432,col 9)",
        "(line 433,col 9)-(line 433,col 52)",
        "(line 434,col 9)-(line 434,col 33)",
        "(line 435,col 9)-(line 435,col 53)",
        "(line 436,col 9)-(line 436,col 34)",
        "(line 437,col 9)-(line 438,col 89)",
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
        "(line 491,col 9)-(line 491,col 91)",
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
      "end_line": 520,
      "comment": "",
      "child_ranges": [
        "(line 504,col 9)-(line 518,col 9)"
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
      "begin_line": 522,
      "end_line": 545,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 524,
      "end_line": 524,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "factors"
      ],
      "begin_line": 525,
      "end_line": 525,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "target"
      ],
      "begin_line": 526,
      "end_line": 526,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.LinearProblem.LinearProblem(double[][], double[])",
      "begin_line": 527,
      "end_line": 530,
      "comment": "",
      "child_ranges": [
        "(line 528,col 13)-(line 528,col 56)",
        "(line 529,col 13)-(line 529,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.LinearProblem.value(double[])",
      "begin_line": 532,
      "end_line": 534,
      "comment": "",
      "child_ranges": [
        "(line 533,col 13)-(line 533,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.LinearProblem.jacobian()",
      "begin_line": 536,
      "end_line": 543,
      "comment": "",
      "child_ranges": [
        "(line 537,col 13)-(line 542,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 538,
      "end_line": 538,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.LinearProblem.Anonymous-b52f9ff0-d390-4c01-be76-46c8ceb6c062.value(double[])",
      "begin_line": 539,
      "end_line": 541,
      "comment": "",
      "child_ranges": [
        "(line 540,col 21)-(line 540,col 45)"
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
      "begin_line": 547,
      "end_line": 626,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 549,
      "end_line": 549,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "points"
      ],
      "begin_line": 551,
      "end_line": 551,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.Circle.Circle()",
      "begin_line": 553,
      "end_line": 555,
      "comment": "",
      "child_ranges": [
        "(line 554,col 13)-(line 554,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.Circle.addPoint(double, double)",
      "begin_line": 557,
      "end_line": 559,
      "comment": "",
      "child_ranges": [
        "(line 558,col 13)-(line 558,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.Circle.getN()",
      "begin_line": 561,
      "end_line": 563,
      "comment": "",
      "child_ranges": [
        "(line 562,col 13)-(line 562,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.Circle.getRadius(java.awt.geom.Point2D.Double)",
      "begin_line": 565,
      "end_line": 571,
      "comment": "",
      "child_ranges": [
        "(line 566,col 13)-(line 566,col 25)",
        "(line 567,col 13)-(line 569,col 13)",
        "(line 570,col 13)-(line 570,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.Circle.jacobian(double[])",
      "begin_line": 573,
      "end_line": 600,
      "comment": "",
      "child_ranges": [
        "(line 575,col 13)-(line 575,col 34)",
        "(line 576,col 13)-(line 576,col 75)",
        "(line 579,col 13)-(line 579,col 28)",
        "(line 580,col 13)-(line 580,col 28)",
        "(line 581,col 13)-(line 585,col 13)",
        "(line 586,col 13)-(line 586,col 22)",
        "(line 587,col 13)-(line 587,col 22)",
        "(line 590,col 13)-(line 590,col 51)",
        "(line 591,col 13)-(line 596,col 13)",
        "(line 598,col 13)-(line 598,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.Circle.value(double[])",
      "begin_line": 602,
      "end_line": 615,
      "comment": "",
      "child_ranges": [
        "(line 605,col 13)-(line 605,col 83)",
        "(line 606,col 13)-(line 606,col 46)",
        "(line 608,col 13)-(line 608,col 59)",
        "(line 609,col 13)-(line 611,col 13)",
        "(line 613,col 13)-(line 613,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.Circle.jacobian()",
      "begin_line": 617,
      "end_line": 624,
      "comment": "",
      "child_ranges": [
        "(line 618,col 13)-(line 623,col 14)"
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
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.Circle.Anonymous-f61febaf-703b-486d-9df6-f2a21f73ad75.value(double[])",
      "begin_line": 620,
      "end_line": 622,
      "comment": "",
      "child_ranges": [
        "(line 621,col 21)-(line 621,col 43)"
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
      "begin_line": 628,
      "end_line": 671,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 630,
      "end_line": 630,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "x"
      ],
      "begin_line": 631,
      "end_line": 631,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 632,
      "end_line": 632,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.QuadraticProblem.QuadraticProblem()",
      "begin_line": 634,
      "end_line": 637,
      "comment": "",
      "child_ranges": [
        "(line 635,col 13)-(line 635,col 40)",
        "(line 636,col 13)-(line 636,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.QuadraticProblem.addPoint(double, double)",
      "begin_line": 639,
      "end_line": 642,
      "comment": "",
      "child_ranges": [
        "(line 640,col 13)-(line 640,col 26)",
        "(line 641,col 13)-(line 641,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.QuadraticProblem.jacobian(double[])",
      "begin_line": 644,
      "end_line": 652,
      "comment": "",
      "child_ranges": [
        "(line 645,col 13)-(line 645,col 58)",
        "(line 646,col 13)-(line 650,col 13)",
        "(line 651,col 13)-(line 651,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.QuadraticProblem.value(double[])",
      "begin_line": 654,
      "end_line": 660,
      "comment": "",
      "child_ranges": [
        "(line 655,col 13)-(line 655,col 51)",
        "(line 656,col 13)-(line 658,col 13)",
        "(line 659,col 13)-(line 659,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.QuadraticProblem.jacobian()",
      "begin_line": 662,
      "end_line": 669,
      "comment": "",
      "child_ranges": [
        "(line 663,col 13)-(line 668,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 664,
      "end_line": 664,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.QuadraticProblem.Anonymous-23b80065-3cea-425d-9d9f-c267b61cccc2.value(double[])",
      "begin_line": 665,
      "end_line": 667,
      "comment": "",
      "child_ranges": [
        "(line 666,col 21)-(line 666,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.suite()",
      "begin_line": 673,
      "end_line": 675,
      "comment": "",
      "child_ranges": [
        "(line 674,col 9)-(line 674,col 68)"
      ]
    }
  ]
}