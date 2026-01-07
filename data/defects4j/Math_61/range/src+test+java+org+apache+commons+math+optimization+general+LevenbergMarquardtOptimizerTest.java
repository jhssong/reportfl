{
  "filepath": "/tmp/Math-61b/src/test/java/org/apache/commons/math/optimization/general/LevenbergMarquardtOptimizerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LevenbergMarquardtOptimizerTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 103,
      "end_line": 659,
      "comment": "\n * \u003cp\u003eSome of the unit tests are re-implementations of the MINPACK \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file17\"\u003efile17\u003c/a\u003e and \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file22\"\u003efile22\u003c/a\u003e test files.\n * The redistribution policy for MINPACK is available \u003ca\n * href\u003d\"http://www.netlib.org/minpack/disclaimer\"\u003ehere\u003c/a\u003e, for\n * convenience, it is reproduced below.\u003c/p\u003e\n\n * \u003ctable border\u003d\"0\" width\u003d\"80%\" cellpadding\u003d\"10\" align\u003d\"center\" bgcolor\u003d\"#E0E0E0\"\u003e\n * \u003ctr\u003e\u003ctd\u003e\n *    Minpack Copyright Notice (1999) University of Chicago.\n *    All rights reserved\n * \u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003e\n * Redistribution and use in source and binary forms, with or without\n * modification, are permitted provided that the following conditions\n * are met:\n * \u003col\u003e\n *  \u003cli\u003eRedistributions of source code must retain the above copyright\n *      notice, this list of conditions and the following disclaimer.\u003c/li\u003e\n * \u003cli\u003eRedistributions in binary form must reproduce the above\n *     copyright notice, this list of conditions and the following\n *     disclaimer in the documentation and/or other materials provided\n *     with the distribution.\u003c/li\u003e\n * \u003cli\u003eThe end-user documentation included with the redistribution, if any,\n *     must include the following acknowledgment:\n *     \u003ccode\u003eThis product includes software developed by the University of\n *           Chicago, as Operator of Argonne National Laboratory.\u003c/code\u003e\n *     Alternately, this acknowledgment may appear in the software itself,\n *     if and wherever such third-party acknowledgments normally appear.\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eWARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED \"AS IS\"\n *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE\n *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND\n *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR\n *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES\n *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE\n *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY\n *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR\n *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF\n *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)\n *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION\n *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL\n *     BE CORRECTED.\u003c/strong\u003e\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eLIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT\n *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF\n *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,\n *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF\n *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF\n *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER\n *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT\n *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,\n *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE\n *     POSSIBILITY OF SUCH LOSS OR DAMAGES.\u003c/strong\u003e\u003c/li\u003e\n * \u003col\u003e\u003c/td\u003e\u003c/tr\u003e\n * \u003c/table\u003e\n\n * @author Argonne National Laboratory. MINPACK project. March 1980 (original fortran minpack tests)\n * @author Burton S. Garbow (original fortran minpack tests)\n * @author Kenneth E. Hillstrom (original fortran minpack tests)\n * @author Jorge J. More (original fortran minpack tests)\n * @author Luc Maisonobe (non-minpack tests and minpack tests Java translation)\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.LevenbergMarquardtOptimizerTest(java.lang.String)",
      "begin_line": 106,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testTrivial()",
      "begin_line": 110,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 111,col 9)-(line 112,col 76)",
        "(line 113,col 9)-(line 113,col 82)",
        "(line 114,col 9)-(line 115,col 96)",
        "(line 116,col 9)-(line 116,col 53)",
        "(line 117,col 9)-(line 124,col 9)",
        "(line 125,col 9)-(line 125,col 58)",
        "(line 126,col 9)-(line 126,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testQRColumnsPermutation()",
      "begin_line": 129,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 131,col 9)-(line 133,col 62)",
        "(line 135,col 9)-(line 135,col 82)",
        "(line 136,col 9)-(line 137,col 105)",
        "(line 138,col 9)-(line 138,col 53)",
        "(line 139,col 9)-(line 139,col 58)",
        "(line 140,col 9)-(line 140,col 58)",
        "(line 141,col 9)-(line 141,col 58)",
        "(line 142,col 9)-(line 142,col 58)",
        "(line 143,col 9)-(line 143,col 58)"
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
      "end_line": 179,
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
      "begin_line": 181,
      "end_line": 203,
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
      "begin_line": 205,
      "end_line": 224,
      "comment": "",
      "child_ranges": [
        "(line 207,col 9)-(line 211,col 37)",
        "(line 213,col 9)-(line 213,col 82)",
        "(line 214,col 9)-(line 214,col 104)",
        "(line 215,col 9)-(line 215,col 84)",
        "(line 216,col 9)-(line 223,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testIllConditioned()",
      "begin_line": 226,
      "end_line": 257,
      "comment": "",
      "child_ranges": [
        "(line 227,col 9)-(line 232,col 44)",
        "(line 233,col 9)-(line 233,col 82)",
        "(line 234,col 9)-(line 236,col 60)",
        "(line 237,col 9)-(line 237,col 53)",
        "(line 238,col 9)-(line 238,col 59)",
        "(line 239,col 9)-(line 239,col 59)",
        "(line 240,col 9)-(line 240,col 59)",
        "(line 241,col 9)-(line 241,col 59)",
        "(line 243,col 9)-(line 248,col 44)",
        "(line 249,col 9)-(line 251,col 60)",
        "(line 252,col 9)-(line 252,col 53)",
        "(line 253,col 9)-(line 253,col 60)",
        "(line 254,col 9)-(line 254,col 60)",
        "(line 255,col 9)-(line 255,col 60)",
        "(line 256,col 9)-(line 256,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testMoreEstimatedParametersSimple()",
      "begin_line": 259,
      "end_line": 271,
      "comment": "",
      "child_ranges": [
        "(line 261,col 9)-(line 265,col 43)",
        "(line 267,col 9)-(line 267,col 82)",
        "(line 268,col 9)-(line 269,col 45)",
        "(line 270,col 9)-(line 270,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testMoreEstimatedParametersUnsorted()",
      "begin_line": 273,
      "end_line": 291,
      "comment": "",
      "child_ranges": [
        "(line 274,col 9)-(line 280,col 54)",
        "(line 282,col 9)-(line 282,col 82)",
        "(line 283,col 9)-(line 285,col 66)",
        "(line 286,col 9)-(line 286,col 53)",
        "(line 287,col 9)-(line 287,col 61)",
        "(line 288,col 9)-(line 288,col 61)",
        "(line 289,col 9)-(line 289,col 61)",
        "(line 290,col 9)-(line 290,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testRedundantEquations()",
      "begin_line": 293,
      "end_line": 307,
      "comment": "",
      "child_ranges": [
        "(line 294,col 9)-(line 298,col 43)",
        "(line 300,col 9)-(line 300,col 82)",
        "(line 301,col 9)-(line 303,col 54)",
        "(line 304,col 9)-(line 304,col 53)",
        "(line 305,col 9)-(line 305,col 61)",
        "(line 306,col 9)-(line 306,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testInconsistentEquations()",
      "begin_line": 309,
      "end_line": 319,
      "comment": "",
      "child_ranges": [
        "(line 310,col 9)-(line 314,col 43)",
        "(line 316,col 9)-(line 316,col 82)",
        "(line 317,col 9)-(line 317,col 101)",
        "(line 318,col 9)-(line 318,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testInconsistentSizes()",
      "begin_line": 321,
      "end_line": 353,
      "comment": "",
      "child_ranges": [
        "(line 322,col 9)-(line 323,col 93)",
        "(line 324,col 9)-(line 324,col 82)",
        "(line 326,col 9)-(line 327,col 102)",
        "(line 328,col 9)-(line 328,col 53)",
        "(line 329,col 9)-(line 329,col 57)",
        "(line 330,col 9)-(line 330,col 57)",
        "(line 332,col 9)-(line 341,col 9)",
        "(line 343,col 9)-(line 352,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testControlParameters()",
      "begin_line": 355,
      "end_line": 367,
      "comment": "",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 37)",
        "(line 357,col 9)-(line 357,col 38)",
        "(line 358,col 9)-(line 358,col 38)",
        "(line 359,col 9)-(line 359,col 38)",
        "(line 360,col 9)-(line 360,col 38)",
        "(line 361,col 9)-(line 361,col 38)",
        "(line 362,col 9)-(line 362,col 73)",
        "(line 363,col 9)-(line 363,col 72)",
        "(line 364,col 9)-(line 364,col 72)",
        "(line 365,col 9)-(line 365,col 35)",
        "(line 366,col 9)-(line 366,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.checkEstimate(org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction, double, int, double, double, double, boolean)",
      "begin_line": 369,
      "end_line": 391,
      "comment": "",
      "child_ranges": [
        "(line 373,col 9)-(line 390,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testCircleFitting()",
      "begin_line": 393,
      "end_line": 439,
      "comment": "",
      "child_ranges": [
        "(line 394,col 9)-(line 394,col 37)",
        "(line 395,col 9)-(line 395,col 38)",
        "(line 396,col 9)-(line 396,col 38)",
        "(line 397,col 9)-(line 397,col 38)",
        "(line 398,col 9)-(line 398,col 38)",
        "(line 399,col 9)-(line 399,col 38)",
        "(line 400,col 9)-(line 400,col 82)",
        "(line 401,col 9)-(line 403,col 64)",
        "(line 404,col 9)-(line 404,col 52)",
        "(line 405,col 9)-(line 405,col 60)",
        "(line 406,col 9)-(line 406,col 40)",
        "(line 407,col 9)-(line 407,col 87)",
        "(line 408,col 9)-(line 408,col 103)",
        "(line 409,col 9)-(line 409,col 75)",
        "(line 410,col 9)-(line 410,col 64)",
        "(line 411,col 9)-(line 411,col 64)",
        "(line 412,col 9)-(line 412,col 52)",
        "(line 413,col 9)-(line 413,col 46)",
        "(line 414,col 9)-(line 414,col 46)",
        "(line 415,col 9)-(line 415,col 52)",
        "(line 416,col 9)-(line 416,col 46)",
        "(line 417,col 9)-(line 417,col 60)",
        "(line 418,col 9)-(line 418,col 46)",
        "(line 419,col 9)-(line 419,col 46)",
        "(line 422,col 9)-(line 422,col 45)",
        "(line 423,col 9)-(line 425,col 9)",
        "(line 426,col 9)-(line 426,col 52)",
        "(line 427,col 9)-(line 427,col 33)",
        "(line 428,col 9)-(line 428,col 53)",
        "(line 429,col 9)-(line 429,col 34)",
        "(line 430,col 9)-(line 430,col 85)",
        "(line 431,col 9)-(line 431,col 41)",
        "(line 432,col 9)-(line 432,col 47)",
        "(line 433,col 9)-(line 433,col 48)",
        "(line 434,col 9)-(line 434,col 52)",
        "(line 435,col 9)-(line 435,col 47)",
        "(line 436,col 9)-(line 436,col 51)",
        "(line 437,col 9)-(line 437,col 46)",
        "(line 438,col 9)-(line 438,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testCircleFittingBadInit()",
      "begin_line": 441,
      "end_line": 492,
      "comment": "",
      "child_ranges": [
        "(line 442,col 9)-(line 442,col 37)",
        "(line 443,col 9)-(line 473,col 10)",
        "(line 474,col 9)-(line 474,col 52)",
        "(line 475,col 9)-(line 475,col 33)",
        "(line 476,col 9)-(line 476,col 53)",
        "(line 477,col 9)-(line 477,col 34)",
        "(line 478,col 9)-(line 480,col 9)",
        "(line 481,col 9)-(line 481,col 82)",
        "(line 482,col 9)-(line 482,col 89)",
        "(line 483,col 9)-(line 484,col 83)",
        "(line 485,col 9)-(line 485,col 103)",
        "(line 486,col 9)-(line 486,col 52)",
        "(line 487,col 9)-(line 487,col 60)",
        "(line 488,col 9)-(line 488,col 57)",
        "(line 489,col 9)-(line 489,col 67)",
        "(line 490,col 9)-(line 490,col 56)",
        "(line 491,col 9)-(line 491,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testMath199()",
      "begin_line": 494,
      "end_line": 512,
      "comment": "",
      "child_ranges": [
        "(line 495,col 9)-(line 511,col 9)"
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
      "begin_line": 514,
      "end_line": 536,
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
        "factors"
      ],
      "begin_line": 517,
      "end_line": 517,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "target"
      ],
      "begin_line": 518,
      "end_line": 518,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.LinearProblem.LinearProblem(double[][], double[])",
      "begin_line": 519,
      "end_line": 522,
      "comment": "",
      "child_ranges": [
        "(line 520,col 13)-(line 520,col 56)",
        "(line 521,col 13)-(line 521,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.LinearProblem.value(double[])",
      "begin_line": 524,
      "end_line": 526,
      "comment": "",
      "child_ranges": [
        "(line 525,col 13)-(line 525,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.LinearProblem.jacobian()",
      "begin_line": 528,
      "end_line": 535,
      "comment": "",
      "child_ranges": [
        "(line 529,col 13)-(line 534,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 530,
      "end_line": 530,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.LinearProblem.Anonymous-f7c53a62-2285-4a74-9a1b-4aca75df82e4.value(double[])",
      "begin_line": 531,
      "end_line": 533,
      "comment": "",
      "child_ranges": [
        "(line 532,col 21)-(line 532,col 45)"
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
      "begin_line": 538,
      "end_line": 614,
      "comment": ""
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
      "type": "field",
      "varNames": [
        "points"
      ],
      "begin_line": 542,
      "end_line": 542,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.Circle.Circle()",
      "begin_line": 544,
      "end_line": 546,
      "comment": "",
      "child_ranges": [
        "(line 545,col 13)-(line 545,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.Circle.addPoint(double, double)",
      "begin_line": 548,
      "end_line": 550,
      "comment": "",
      "child_ranges": [
        "(line 549,col 13)-(line 549,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.Circle.getN()",
      "begin_line": 552,
      "end_line": 554,
      "comment": "",
      "child_ranges": [
        "(line 553,col 13)-(line 553,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.Circle.getRadius(java.awt.geom.Point2D.Double)",
      "begin_line": 556,
      "end_line": 562,
      "comment": "",
      "child_ranges": [
        "(line 557,col 13)-(line 557,col 25)",
        "(line 558,col 13)-(line 560,col 13)",
        "(line 561,col 13)-(line 561,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.Circle.jacobian(double[])",
      "begin_line": 564,
      "end_line": 590,
      "comment": "",
      "child_ranges": [
        "(line 566,col 13)-(line 566,col 34)",
        "(line 567,col 13)-(line 567,col 75)",
        "(line 570,col 13)-(line 570,col 28)",
        "(line 571,col 13)-(line 571,col 28)",
        "(line 572,col 13)-(line 576,col 13)",
        "(line 577,col 13)-(line 577,col 22)",
        "(line 578,col 13)-(line 578,col 22)",
        "(line 581,col 13)-(line 581,col 51)",
        "(line 582,col 13)-(line 587,col 13)",
        "(line 589,col 13)-(line 589,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.Circle.value(double[])",
      "begin_line": 592,
      "end_line": 604,
      "comment": "",
      "child_ranges": [
        "(line 595,col 13)-(line 595,col 83)",
        "(line 596,col 13)-(line 596,col 46)",
        "(line 598,col 13)-(line 598,col 59)",
        "(line 599,col 13)-(line 601,col 13)",
        "(line 603,col 13)-(line 603,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.Circle.jacobian()",
      "begin_line": 606,
      "end_line": 613,
      "comment": "",
      "child_ranges": [
        "(line 607,col 13)-(line 612,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 608,
      "end_line": 608,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.Circle.Anonymous-3f580926-5592-4943-95ab-ba370683354f.value(double[])",
      "begin_line": 609,
      "end_line": 611,
      "comment": "",
      "child_ranges": [
        "(line 610,col 21)-(line 610,col 43)"
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
      "begin_line": 616,
      "end_line": 658,
      "comment": ""
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
      "type": "field",
      "varNames": [
        "x"
      ],
      "begin_line": 619,
      "end_line": 619,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 620,
      "end_line": 620,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.QuadraticProblem.QuadraticProblem()",
      "begin_line": 622,
      "end_line": 625,
      "comment": "",
      "child_ranges": [
        "(line 623,col 13)-(line 623,col 40)",
        "(line 624,col 13)-(line 624,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.QuadraticProblem.addPoint(double, double)",
      "begin_line": 627,
      "end_line": 630,
      "comment": "",
      "child_ranges": [
        "(line 628,col 13)-(line 628,col 26)",
        "(line 629,col 13)-(line 629,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.QuadraticProblem.jacobian(double[])",
      "begin_line": 632,
      "end_line": 640,
      "comment": "",
      "child_ranges": [
        "(line 633,col 13)-(line 633,col 58)",
        "(line 634,col 13)-(line 638,col 13)",
        "(line 639,col 13)-(line 639,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.QuadraticProblem.value(double[])",
      "begin_line": 642,
      "end_line": 648,
      "comment": "",
      "child_ranges": [
        "(line 643,col 13)-(line 643,col 51)",
        "(line 644,col 13)-(line 646,col 13)",
        "(line 647,col 13)-(line 647,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.QuadraticProblem.jacobian()",
      "begin_line": 650,
      "end_line": 657,
      "comment": "",
      "child_ranges": [
        "(line 651,col 13)-(line 656,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 652,
      "end_line": 652,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.QuadraticProblem.Anonymous-2c082ece-2020-4e55-b196-699e69fe5d4e.value(double[])",
      "begin_line": 653,
      "end_line": 655,
      "comment": "",
      "child_ranges": [
        "(line 654,col 21)-(line 654,col 43)"
      ]
    }
  ]
}