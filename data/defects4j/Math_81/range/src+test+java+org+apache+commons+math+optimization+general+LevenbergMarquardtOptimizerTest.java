{
  "filepath": "/tmp/Math-81b/src/test/java/org/apache/commons/math/optimization/general/LevenbergMarquardtOptimizerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LevenbergMarquardtOptimizerTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 101,
      "end_line": 676,
      "comment": "\n * \u003cp\u003eSome of the unit tests are re-implementations of the MINPACK \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file17\"\u003efile17\u003c/a\u003e and \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file22\"\u003efile22\u003c/a\u003e test files.\n * The redistribution policy for MINPACK is available \u003ca\n * href\u003d\"http://www.netlib.org/minpack/disclaimer\"\u003ehere\u003c/a\u003e, for\n * convenience, it is reproduced below.\u003c/p\u003e\n\n * \u003ctable border\u003d\"0\" width\u003d\"80%\" cellpadding\u003d\"10\" align\u003d\"center\" bgcolor\u003d\"#E0E0E0\"\u003e\n * \u003ctr\u003e\u003ctd\u003e\n *    Minpack Copyright Notice (1999) University of Chicago.\n *    All rights reserved\n * \u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003e\n * Redistribution and use in source and binary forms, with or without\n * modification, are permitted provided that the following conditions\n * are met:\n * \u003col\u003e\n *  \u003cli\u003eRedistributions of source code must retain the above copyright\n *      notice, this list of conditions and the following disclaimer.\u003c/li\u003e\n * \u003cli\u003eRedistributions in binary form must reproduce the above\n *     copyright notice, this list of conditions and the following\n *     disclaimer in the documentation and/or other materials provided\n *     with the distribution.\u003c/li\u003e\n * \u003cli\u003eThe end-user documentation included with the redistribution, if any,\n *     must include the following acknowledgment:\n *     \u003ccode\u003eThis product includes software developed by the University of\n *           Chicago, as Operator of Argonne National Laboratory.\u003c/code\u003e\n *     Alternately, this acknowledgment may appear in the software itself,\n *     if and wherever such third-party acknowledgments normally appear.\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eWARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED \"AS IS\"\n *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE\n *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND\n *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR\n *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES\n *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE\n *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY\n *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR\n *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF\n *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)\n *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION\n *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL\n *     BE CORRECTED.\u003c/strong\u003e\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eLIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT\n *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF\n *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,\n *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF\n *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF\n *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER\n *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT\n *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,\n *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE\n *     POSSIBILITY OF SUCH LOSS OR DAMAGES.\u003c/strong\u003e\u003c/li\u003e\n * \u003col\u003e\u003c/td\u003e\u003c/tr\u003e\n * \u003c/table\u003e\n\n * @author Argonne National Laboratory. MINPACK project. March 1980 (original fortran minpack tests)\n * @author Burton S. Garbow (original fortran minpack tests)\n * @author Kenneth E. Hillstrom (original fortran minpack tests)\n * @author Jorge J. More (original fortran minpack tests)\n * @author Luc Maisonobe (non-minpack tests and minpack tests Java translation)\n "
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
      "end_line": 447,
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
        "(line 437,col 9)-(line 437,col 85)",
        "(line 438,col 9)-(line 438,col 41)",
        "(line 439,col 9)-(line 439,col 47)",
        "(line 440,col 9)-(line 440,col 48)",
        "(line 441,col 9)-(line 441,col 52)",
        "(line 442,col 9)-(line 442,col 47)",
        "(line 443,col 9)-(line 443,col 51)",
        "(line 444,col 9)-(line 444,col 46)",
        "(line 445,col 9)-(line 445,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testCircleFittingBadInit()",
      "begin_line": 449,
      "end_line": 500,
      "comment": "",
      "child_ranges": [
        "(line 450,col 9)-(line 450,col 37)",
        "(line 451,col 9)-(line 481,col 10)",
        "(line 482,col 9)-(line 482,col 52)",
        "(line 483,col 9)-(line 483,col 33)",
        "(line 484,col 9)-(line 484,col 53)",
        "(line 485,col 9)-(line 485,col 34)",
        "(line 486,col 9)-(line 488,col 9)",
        "(line 489,col 9)-(line 489,col 82)",
        "(line 490,col 9)-(line 490,col 91)",
        "(line 491,col 9)-(line 492,col 83)",
        "(line 493,col 9)-(line 493,col 103)",
        "(line 494,col 9)-(line 494,col 52)",
        "(line 495,col 9)-(line 495,col 60)",
        "(line 496,col 9)-(line 496,col 57)",
        "(line 497,col 9)-(line 497,col 67)",
        "(line 498,col 9)-(line 498,col 56)",
        "(line 499,col 9)-(line 499,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testMath199()",
      "begin_line": 502,
      "end_line": 519,
      "comment": "",
      "child_ranges": [
        "(line 503,col 9)-(line 517,col 9)"
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
      "begin_line": 521,
      "end_line": 544,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 523,
      "end_line": 523,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "factors"
      ],
      "begin_line": 524,
      "end_line": 524,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "target"
      ],
      "begin_line": 525,
      "end_line": 525,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.LinearProblem.LinearProblem(double[][], double[])",
      "begin_line": 526,
      "end_line": 529,
      "comment": "",
      "child_ranges": [
        "(line 527,col 13)-(line 527,col 56)",
        "(line 528,col 13)-(line 528,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.LinearProblem.value(double[])",
      "begin_line": 531,
      "end_line": 533,
      "comment": "",
      "child_ranges": [
        "(line 532,col 13)-(line 532,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.LinearProblem.jacobian()",
      "begin_line": 535,
      "end_line": 542,
      "comment": "",
      "child_ranges": [
        "(line 536,col 13)-(line 541,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 537,
      "end_line": 537,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.LinearProblem.Anonymous-95375732-5a21-41b0-8cb0-6bb2cfac3bc1.value(double[])",
      "begin_line": 538,
      "end_line": 540,
      "comment": "",
      "child_ranges": [
        "(line 539,col 21)-(line 539,col 45)"
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
      "begin_line": 546,
      "end_line": 625,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 548,
      "end_line": 548,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "points"
      ],
      "begin_line": 550,
      "end_line": 550,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.Circle.Circle()",
      "begin_line": 552,
      "end_line": 554,
      "comment": "",
      "child_ranges": [
        "(line 553,col 13)-(line 553,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.Circle.addPoint(double, double)",
      "begin_line": 556,
      "end_line": 558,
      "comment": "",
      "child_ranges": [
        "(line 557,col 13)-(line 557,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.Circle.getN()",
      "begin_line": 560,
      "end_line": 562,
      "comment": "",
      "child_ranges": [
        "(line 561,col 13)-(line 561,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.Circle.getRadius(java.awt.geom.Point2D.Double)",
      "begin_line": 564,
      "end_line": 570,
      "comment": "",
      "child_ranges": [
        "(line 565,col 13)-(line 565,col 25)",
        "(line 566,col 13)-(line 568,col 13)",
        "(line 569,col 13)-(line 569,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.Circle.jacobian(double[])",
      "begin_line": 572,
      "end_line": 599,
      "comment": "",
      "child_ranges": [
        "(line 574,col 13)-(line 574,col 34)",
        "(line 575,col 13)-(line 575,col 75)",
        "(line 578,col 13)-(line 578,col 28)",
        "(line 579,col 13)-(line 579,col 28)",
        "(line 580,col 13)-(line 584,col 13)",
        "(line 585,col 13)-(line 585,col 22)",
        "(line 586,col 13)-(line 586,col 22)",
        "(line 589,col 13)-(line 589,col 51)",
        "(line 590,col 13)-(line 595,col 13)",
        "(line 597,col 13)-(line 597,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.Circle.value(double[])",
      "begin_line": 601,
      "end_line": 614,
      "comment": "",
      "child_ranges": [
        "(line 604,col 13)-(line 604,col 83)",
        "(line 605,col 13)-(line 605,col 46)",
        "(line 607,col 13)-(line 607,col 59)",
        "(line 608,col 13)-(line 610,col 13)",
        "(line 612,col 13)-(line 612,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.Circle.jacobian()",
      "begin_line": 616,
      "end_line": 623,
      "comment": "",
      "child_ranges": [
        "(line 617,col 13)-(line 622,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 618,
      "end_line": 618,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.Circle.Anonymous-2c4f5015-bd76-4794-89f2-a2fd2aaaad78.value(double[])",
      "begin_line": 619,
      "end_line": 621,
      "comment": "",
      "child_ranges": [
        "(line 620,col 21)-(line 620,col 43)"
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
      "begin_line": 627,
      "end_line": 670,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 629,
      "end_line": 629,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "x"
      ],
      "begin_line": 630,
      "end_line": 630,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 631,
      "end_line": 631,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.QuadraticProblem.QuadraticProblem()",
      "begin_line": 633,
      "end_line": 636,
      "comment": "",
      "child_ranges": [
        "(line 634,col 13)-(line 634,col 40)",
        "(line 635,col 13)-(line 635,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.QuadraticProblem.addPoint(double, double)",
      "begin_line": 638,
      "end_line": 641,
      "comment": "",
      "child_ranges": [
        "(line 639,col 13)-(line 639,col 26)",
        "(line 640,col 13)-(line 640,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.QuadraticProblem.jacobian(double[])",
      "begin_line": 643,
      "end_line": 651,
      "comment": "",
      "child_ranges": [
        "(line 644,col 13)-(line 644,col 58)",
        "(line 645,col 13)-(line 649,col 13)",
        "(line 650,col 13)-(line 650,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.QuadraticProblem.value(double[])",
      "begin_line": 653,
      "end_line": 659,
      "comment": "",
      "child_ranges": [
        "(line 654,col 13)-(line 654,col 51)",
        "(line 655,col 13)-(line 657,col 13)",
        "(line 658,col 13)-(line 658,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.QuadraticProblem.jacobian()",
      "begin_line": 661,
      "end_line": 668,
      "comment": "",
      "child_ranges": [
        "(line 662,col 13)-(line 667,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 663,
      "end_line": 663,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.QuadraticProblem.Anonymous-6fdc8663-17ca-4fef-b26c-435b8f1f68dd.value(double[])",
      "begin_line": 664,
      "end_line": 666,
      "comment": "",
      "child_ranges": [
        "(line 665,col 21)-(line 665,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.suite()",
      "begin_line": 672,
      "end_line": 674,
      "comment": "",
      "child_ranges": [
        "(line 673,col 9)-(line 673,col 68)"
      ]
    }
  ]
}