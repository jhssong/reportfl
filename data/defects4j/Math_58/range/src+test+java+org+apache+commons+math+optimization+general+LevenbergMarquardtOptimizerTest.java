{
  "filepath": "/tmp/Math-58b/src/test/java/org/apache/commons/math/optimization/general/LevenbergMarquardtOptimizerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LevenbergMarquardtOptimizerTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 104,
      "end_line": 572,
      "comment": "\n * \u003cp\u003eSome of the unit tests are re-implementations of the MINPACK \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file17\"\u003efile17\u003c/a\u003e and \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file22\"\u003efile22\u003c/a\u003e test files.\n * The redistribution policy for MINPACK is available \u003ca\n * href\u003d\"http://www.netlib.org/minpack/disclaimer\"\u003ehere\u003c/a\u003e, for\n * convenience, it is reproduced below.\u003c/p\u003e\n\n * \u003ctable border\u003d\"0\" width\u003d\"80%\" cellpadding\u003d\"10\" align\u003d\"center\" bgcolor\u003d\"#E0E0E0\"\u003e\n * \u003ctr\u003e\u003ctd\u003e\n *    Minpack Copyright Notice (1999) University of Chicago.\n *    All rights reserved\n * \u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003e\n * Redistribution and use in source and binary forms, with or without\n * modification, are permitted provided that the following conditions\n * are met:\n * \u003col\u003e\n *  \u003cli\u003eRedistributions of source code must retain the above copyright\n *      notice, this list of conditions and the following disclaimer.\u003c/li\u003e\n * \u003cli\u003eRedistributions in binary form must reproduce the above\n *     copyright notice, this list of conditions and the following\n *     disclaimer in the documentation and/or other materials provided\n *     with the distribution.\u003c/li\u003e\n * \u003cli\u003eThe end-user documentation included with the redistribution, if any,\n *     must include the following acknowledgment:\n *     \u003ccode\u003eThis product includes software developed by the University of\n *           Chicago, as Operator of Argonne National Laboratory.\u003c/code\u003e\n *     Alternately, this acknowledgment may appear in the software itself,\n *     if and wherever such third-party acknowledgments normally appear.\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eWARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED \"AS IS\"\n *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE\n *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND\n *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR\n *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES\n *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE\n *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY\n *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR\n *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF\n *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)\n *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION\n *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL\n *     BE CORRECTED.\u003c/strong\u003e\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eLIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT\n *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF\n *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,\n *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF\n *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF\n *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER\n *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT\n *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,\n *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE\n *     POSSIBILITY OF SUCH LOSS OR DAMAGES.\u003c/strong\u003e\u003c/li\u003e\n * \u003col\u003e\u003c/td\u003e\u003c/tr\u003e\n * \u003c/table\u003e\n\n * @author Argonne National Laboratory. MINPACK project. March 1980 (original fortran minpack tests)\n * @author Burton S. Garbow (original fortran minpack tests)\n * @author Kenneth E. Hillstrom (original fortran minpack tests)\n * @author Jorge J. More (original fortran minpack tests)\n * @author Luc Maisonobe (non-minpack tests and minpack tests Java translation)\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.LevenbergMarquardtOptimizerTest(java.lang.String)",
      "begin_line": 107,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testTrivial()",
      "begin_line": 111,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 112,col 9)-(line 113,col 76)",
        "(line 114,col 9)-(line 114,col 82)",
        "(line 115,col 9)-(line 116,col 101)",
        "(line 117,col 9)-(line 117,col 53)",
        "(line 118,col 9)-(line 123,col 9)",
        "(line 124,col 9)-(line 124,col 58)",
        "(line 125,col 9)-(line 125,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testQRColumnsPermutation()",
      "begin_line": 128,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 130,col 9)-(line 132,col 62)",
        "(line 134,col 9)-(line 134,col 82)",
        "(line 135,col 9)-(line 136,col 110)",
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
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 166,col 9)-(line 170,col 36)",
        "(line 171,col 9)-(line 171,col 82)",
        "(line 172,col 9)-(line 173,col 113)",
        "(line 174,col 9)-(line 174,col 53)",
        "(line 175,col 9)-(line 175,col 58)",
        "(line 176,col 9)-(line 176,col 58)",
        "(line 177,col 9)-(line 177,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testTwoSets()",
      "begin_line": 180,
      "end_line": 202,
      "comment": "",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 32)",
        "(line 182,col 9)-(line 189,col 66)",
        "(line 191,col 9)-(line 191,col 82)",
        "(line 192,col 9)-(line 194,col 66)",
        "(line 195,col 9)-(line 195,col 53)",
        "(line 196,col 9)-(line 196,col 59)",
        "(line 197,col 9)-(line 197,col 59)",
        "(line 198,col 9)-(line 198,col 59)",
        "(line 199,col 9)-(line 199,col 59)",
        "(line 200,col 9)-(line 200,col 69)",
        "(line 201,col 9)-(line 201,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testNonInvertible()",
      "begin_line": 204,
      "end_line": 221,
      "comment": "",
      "child_ranges": [
        "(line 206,col 9)-(line 210,col 37)",
        "(line 212,col 9)-(line 212,col 82)",
        "(line 213,col 9)-(line 213,col 109)",
        "(line 214,col 9)-(line 214,col 84)",
        "(line 215,col 9)-(line 220,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testIllConditioned()",
      "begin_line": 223,
      "end_line": 254,
      "comment": "",
      "child_ranges": [
        "(line 224,col 9)-(line 229,col 44)",
        "(line 230,col 9)-(line 230,col 82)",
        "(line 231,col 9)-(line 233,col 60)",
        "(line 234,col 9)-(line 234,col 53)",
        "(line 235,col 9)-(line 235,col 59)",
        "(line 236,col 9)-(line 236,col 59)",
        "(line 237,col 9)-(line 237,col 59)",
        "(line 238,col 9)-(line 238,col 59)",
        "(line 240,col 9)-(line 245,col 44)",
        "(line 246,col 9)-(line 248,col 60)",
        "(line 249,col 9)-(line 249,col 53)",
        "(line 250,col 9)-(line 250,col 60)",
        "(line 251,col 9)-(line 251,col 60)",
        "(line 252,col 9)-(line 252,col 60)",
        "(line 253,col 9)-(line 253,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testMoreEstimatedParametersSimple()",
      "begin_line": 256,
      "end_line": 268,
      "comment": "",
      "child_ranges": [
        "(line 258,col 9)-(line 262,col 43)",
        "(line 264,col 9)-(line 264,col 82)",
        "(line 265,col 9)-(line 266,col 45)",
        "(line 267,col 9)-(line 267,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testMoreEstimatedParametersUnsorted()",
      "begin_line": 270,
      "end_line": 288,
      "comment": "",
      "child_ranges": [
        "(line 271,col 9)-(line 277,col 54)",
        "(line 279,col 9)-(line 279,col 82)",
        "(line 280,col 9)-(line 282,col 66)",
        "(line 283,col 9)-(line 283,col 53)",
        "(line 284,col 9)-(line 284,col 61)",
        "(line 285,col 9)-(line 285,col 61)",
        "(line 286,col 9)-(line 286,col 61)",
        "(line 287,col 9)-(line 287,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testRedundantEquations()",
      "begin_line": 290,
      "end_line": 304,
      "comment": "",
      "child_ranges": [
        "(line 291,col 9)-(line 295,col 43)",
        "(line 297,col 9)-(line 297,col 82)",
        "(line 298,col 9)-(line 300,col 54)",
        "(line 301,col 9)-(line 301,col 53)",
        "(line 302,col 9)-(line 302,col 61)",
        "(line 303,col 9)-(line 303,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testInconsistentEquations()",
      "begin_line": 306,
      "end_line": 316,
      "comment": "",
      "child_ranges": [
        "(line 307,col 9)-(line 311,col 43)",
        "(line 313,col 9)-(line 313,col 82)",
        "(line 314,col 9)-(line 314,col 106)",
        "(line 315,col 9)-(line 315,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testInconsistentSizes()",
      "begin_line": 318,
      "end_line": 346,
      "comment": "",
      "child_ranges": [
        "(line 319,col 9)-(line 320,col 93)",
        "(line 321,col 9)-(line 321,col 82)",
        "(line 323,col 9)-(line 324,col 107)",
        "(line 325,col 9)-(line 325,col 53)",
        "(line 326,col 9)-(line 326,col 57)",
        "(line 327,col 9)-(line 327,col 57)",
        "(line 329,col 9)-(line 336,col 9)",
        "(line 338,col 9)-(line 345,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testControlParameters()",
      "begin_line": 348,
      "end_line": 360,
      "comment": "",
      "child_ranges": [
        "(line 349,col 9)-(line 349,col 55)",
        "(line 350,col 9)-(line 350,col 38)",
        "(line 351,col 9)-(line 351,col 38)",
        "(line 352,col 9)-(line 352,col 38)",
        "(line 353,col 9)-(line 353,col 38)",
        "(line 354,col 9)-(line 354,col 38)",
        "(line 355,col 9)-(line 355,col 73)",
        "(line 356,col 9)-(line 356,col 72)",
        "(line 357,col 9)-(line 357,col 72)",
        "(line 358,col 9)-(line 358,col 35)",
        "(line 359,col 9)-(line 359,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.checkEstimate(org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction, double, int, double, double, double, boolean)",
      "begin_line": 362,
      "end_line": 382,
      "comment": "",
      "child_ranges": [
        "(line 366,col 9)-(line 381,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testCircleFitting()",
      "begin_line": 384,
      "end_line": 430,
      "comment": "",
      "child_ranges": [
        "(line 385,col 9)-(line 385,col 55)",
        "(line 386,col 9)-(line 386,col 38)",
        "(line 387,col 9)-(line 387,col 38)",
        "(line 388,col 9)-(line 388,col 38)",
        "(line 389,col 9)-(line 389,col 38)",
        "(line 390,col 9)-(line 390,col 38)",
        "(line 391,col 9)-(line 391,col 82)",
        "(line 392,col 9)-(line 394,col 64)",
        "(line 395,col 9)-(line 395,col 52)",
        "(line 396,col 9)-(line 396,col 60)",
        "(line 397,col 9)-(line 397,col 40)",
        "(line 398,col 9)-(line 398,col 87)",
        "(line 399,col 9)-(line 399,col 103)",
        "(line 400,col 9)-(line 400,col 75)",
        "(line 401,col 9)-(line 401,col 64)",
        "(line 402,col 9)-(line 402,col 64)",
        "(line 403,col 9)-(line 403,col 52)",
        "(line 404,col 9)-(line 404,col 46)",
        "(line 405,col 9)-(line 405,col 46)",
        "(line 406,col 9)-(line 406,col 52)",
        "(line 407,col 9)-(line 407,col 46)",
        "(line 408,col 9)-(line 408,col 60)",
        "(line 409,col 9)-(line 409,col 46)",
        "(line 410,col 9)-(line 410,col 46)",
        "(line 413,col 9)-(line 413,col 45)",
        "(line 414,col 9)-(line 416,col 9)",
        "(line 417,col 9)-(line 417,col 52)",
        "(line 418,col 9)-(line 418,col 33)",
        "(line 419,col 9)-(line 419,col 53)",
        "(line 420,col 9)-(line 420,col 34)",
        "(line 421,col 9)-(line 421,col 90)",
        "(line 422,col 9)-(line 422,col 41)",
        "(line 423,col 9)-(line 423,col 47)",
        "(line 424,col 9)-(line 424,col 48)",
        "(line 425,col 9)-(line 425,col 52)",
        "(line 426,col 9)-(line 426,col 47)",
        "(line 427,col 9)-(line 427,col 51)",
        "(line 428,col 9)-(line 428,col 46)",
        "(line 429,col 9)-(line 429,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testCircleFittingBadInit()",
      "begin_line": 432,
      "end_line": 483,
      "comment": "",
      "child_ranges": [
        "(line 433,col 9)-(line 433,col 55)",
        "(line 434,col 9)-(line 464,col 10)",
        "(line 465,col 9)-(line 465,col 52)",
        "(line 466,col 9)-(line 466,col 33)",
        "(line 467,col 9)-(line 467,col 53)",
        "(line 468,col 9)-(line 468,col 34)",
        "(line 469,col 9)-(line 471,col 9)",
        "(line 472,col 9)-(line 472,col 82)",
        "(line 473,col 9)-(line 473,col 89)",
        "(line 474,col 9)-(line 475,col 88)",
        "(line 476,col 9)-(line 476,col 103)",
        "(line 477,col 9)-(line 477,col 52)",
        "(line 478,col 9)-(line 478,col 60)",
        "(line 479,col 9)-(line 479,col 57)",
        "(line 480,col 9)-(line 480,col 67)",
        "(line 481,col 9)-(line 481,col 56)",
        "(line 482,col 9)-(line 482,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.testMath199()",
      "begin_line": 485,
      "end_line": 503,
      "comment": "",
      "child_ranges": [
        "(line 486,col 9)-(line 502,col 9)"
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
      "begin_line": 505,
      "end_line": 527,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 507,
      "end_line": 507,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "factors"
      ],
      "begin_line": 508,
      "end_line": 508,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "target"
      ],
      "begin_line": 509,
      "end_line": 509,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.LinearProblem.LinearProblem(double[][], double[])",
      "begin_line": 510,
      "end_line": 513,
      "comment": "",
      "child_ranges": [
        "(line 511,col 13)-(line 511,col 56)",
        "(line 512,col 13)-(line 512,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.LinearProblem.value(double[])",
      "begin_line": 515,
      "end_line": 517,
      "comment": "",
      "child_ranges": [
        "(line 516,col 13)-(line 516,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.LinearProblem.jacobian()",
      "begin_line": 519,
      "end_line": 526,
      "comment": "",
      "child_ranges": [
        "(line 520,col 13)-(line 525,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 521,
      "end_line": 521,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.LinearProblem.Anonymous-bb7632d6-241c-49af-bf68-d140dc1de02c.value(double[])",
      "begin_line": 522,
      "end_line": 524,
      "comment": "",
      "child_ranges": [
        "(line 523,col 21)-(line 523,col 45)"
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
      "begin_line": 529,
      "end_line": 571,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 531,
      "end_line": 531,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "x"
      ],
      "begin_line": 532,
      "end_line": 532,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "y"
      ],
      "begin_line": 533,
      "end_line": 533,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.QuadraticProblem.QuadraticProblem()",
      "begin_line": 535,
      "end_line": 538,
      "comment": "",
      "child_ranges": [
        "(line 536,col 13)-(line 536,col 40)",
        "(line 537,col 13)-(line 537,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.QuadraticProblem.addPoint(double, double)",
      "begin_line": 540,
      "end_line": 543,
      "comment": "",
      "child_ranges": [
        "(line 541,col 13)-(line 541,col 26)",
        "(line 542,col 13)-(line 542,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.QuadraticProblem.jacobian(double[])",
      "begin_line": 545,
      "end_line": 553,
      "comment": "",
      "child_ranges": [
        "(line 546,col 13)-(line 546,col 58)",
        "(line 547,col 13)-(line 551,col 13)",
        "(line 552,col 13)-(line 552,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.QuadraticProblem.value(double[])",
      "begin_line": 555,
      "end_line": 561,
      "comment": "",
      "child_ranges": [
        "(line 556,col 13)-(line 556,col 51)",
        "(line 557,col 13)-(line 559,col 13)",
        "(line 560,col 13)-(line 560,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.QuadraticProblem.jacobian()",
      "begin_line": 563,
      "end_line": 570,
      "comment": "",
      "child_ranges": [
        "(line 564,col 13)-(line 569,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 565,
      "end_line": 565,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest.QuadraticProblem.Anonymous-caae0ff5-bab1-410d-8f69-e43b5b616dd3.value(double[])",
      "begin_line": 566,
      "end_line": 568,
      "comment": "",
      "child_ranges": [
        "(line 567,col 21)-(line 567,col 43)"
      ]
    }
  ]
}