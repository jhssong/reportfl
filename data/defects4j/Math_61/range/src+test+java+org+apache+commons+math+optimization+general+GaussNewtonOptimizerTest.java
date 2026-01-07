{
  "filepath": "/tmp/Math-61b/src/test/java/org/apache/commons/math/optimization/general/GaussNewtonOptimizerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GaussNewtonOptimizerTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 102,
      "end_line": 588,
      "comment": "\n * \u003cp\u003eSome of the unit tests are re-implementations of the MINPACK \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file17\"\u003efile17\u003c/a\u003e and \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file22\"\u003efile22\u003c/a\u003e test files.\n * The redistribution policy for MINPACK is available \u003ca\n * href\u003d\"http://www.netlib.org/minpack/disclaimer\"\u003ehere\u003c/a\u003e, for\n * convenience, it is reproduced below.\u003c/p\u003e\n\n * \u003ctable border\u003d\"0\" width\u003d\"80%\" cellpadding\u003d\"10\" align\u003d\"center\" bgcolor\u003d\"#E0E0E0\"\u003e\n * \u003ctr\u003e\u003ctd\u003e\n *    Minpack Copyright Notice (1999) University of Chicago.\n *    All rights reserved\n * \u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003e\n * Redistribution and use in source and binary forms, with or without\n * modification, are permitted provided that the following conditions\n * are met:\n * \u003col\u003e\n *  \u003cli\u003eRedistributions of source code must retain the above copyright\n *      notice, this list of conditions and the following disclaimer.\u003c/li\u003e\n * \u003cli\u003eRedistributions in binary form must reproduce the above\n *     copyright notice, this list of conditions and the following\n *     disclaimer in the documentation and/or other materials provided\n *     with the distribution.\u003c/li\u003e\n * \u003cli\u003eThe end-user documentation included with the redistribution, if any,\n *     must include the following acknowledgment:\n *     \u003ccode\u003eThis product includes software developed by the University of\n *           Chicago, as Operator of Argonne National Laboratory.\u003c/code\u003e\n *     Alternately, this acknowledgment may appear in the software itself,\n *     if and wherever such third-party acknowledgments normally appear.\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eWARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED \"AS IS\"\n *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE\n *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND\n *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR\n *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES\n *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE\n *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY\n *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR\n *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF\n *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)\n *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION\n *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL\n *     BE CORRECTED.\u003c/strong\u003e\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eLIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT\n *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF\n *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,\n *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF\n *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF\n *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER\n *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT\n *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,\n *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE\n *     POSSIBILITY OF SUCH LOSS OR DAMAGES.\u003c/strong\u003e\u003c/li\u003e\n * \u003col\u003e\u003c/td\u003e\u003c/tr\u003e\n * \u003c/table\u003e\n\n * @author Argonne National Laboratory. MINPACK project. March 1980 (original fortran minpack tests)\n * @author Burton S. Garbow (original fortran minpack tests)\n * @author Kenneth E. Hillstrom (original fortran minpack tests)\n * @author Jorge J. More (original fortran minpack tests)\n * @author Luc Maisonobe (non-minpack tests and minpack tests Java translation)\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.GaussNewtonOptimizerTest(java.lang.String)",
      "begin_line": 105,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testTrivial()",
      "begin_line": 109,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 110,col 9)-(line 111,col 76)",
        "(line 112,col 9)-(line 112,col 72)",
        "(line 113,col 9)-(line 113,col 41)",
        "(line 114,col 9)-(line 114,col 89)",
        "(line 115,col 9)-(line 116,col 96)",
        "(line 117,col 9)-(line 117,col 53)",
        "(line 118,col 9)-(line 118,col 58)",
        "(line 119,col 9)-(line 119,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testColumnsPermutation()",
      "begin_line": 122,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 124,col 9)-(line 126,col 62)",
        "(line 128,col 9)-(line 128,col 72)",
        "(line 129,col 9)-(line 129,col 41)",
        "(line 130,col 9)-(line 130,col 89)",
        "(line 131,col 9)-(line 132,col 105)",
        "(line 133,col 9)-(line 133,col 53)",
        "(line 134,col 9)-(line 134,col 58)",
        "(line 135,col 9)-(line 135,col 58)",
        "(line 136,col 9)-(line 136,col 58)",
        "(line 137,col 9)-(line 137,col 58)",
        "(line 138,col 9)-(line 138,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testNoDependency()",
      "begin_line": 142,
      "end_line": 161,
      "comment": "",
      "child_ranges": [
        "(line 143,col 9)-(line 150,col 58)",
        "(line 151,col 9)-(line 151,col 72)",
        "(line 152,col 9)-(line 152,col 41)",
        "(line 153,col 9)-(line 153,col 89)",
        "(line 154,col 9)-(line 156,col 66)",
        "(line 157,col 9)-(line 157,col 53)",
        "(line 158,col 9)-(line 160,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testOneSet()",
      "begin_line": 163,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 165,col 9)-(line 169,col 36)",
        "(line 170,col 9)-(line 170,col 72)",
        "(line 171,col 9)-(line 171,col 41)",
        "(line 172,col 9)-(line 172,col 89)",
        "(line 173,col 9)-(line 174,col 108)",
        "(line 175,col 9)-(line 175,col 53)",
        "(line 176,col 9)-(line 176,col 58)",
        "(line 177,col 9)-(line 177,col 58)",
        "(line 178,col 9)-(line 178,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testTwoSets()",
      "begin_line": 182,
      "end_line": 207,
      "comment": "",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 32)",
        "(line 184,col 9)-(line 191,col 66)",
        "(line 193,col 9)-(line 193,col 72)",
        "(line 194,col 9)-(line 194,col 41)",
        "(line 195,col 9)-(line 195,col 89)",
        "(line 196,col 9)-(line 198,col 66)",
        "(line 199,col 9)-(line 199,col 53)",
        "(line 200,col 9)-(line 200,col 59)",
        "(line 201,col 9)-(line 201,col 59)",
        "(line 202,col 9)-(line 202,col 59)",
        "(line 203,col 9)-(line 203,col 59)",
        "(line 204,col 9)-(line 204,col 69)",
        "(line 205,col 9)-(line 205,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testNonInversible()",
      "begin_line": 209,
      "end_line": 227,
      "comment": "",
      "child_ranges": [
        "(line 211,col 9)-(line 215,col 37)",
        "(line 216,col 9)-(line 216,col 72)",
        "(line 217,col 9)-(line 217,col 41)",
        "(line 218,col 9)-(line 218,col 89)",
        "(line 219,col 9)-(line 226,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testIllConditioned()",
      "begin_line": 229,
      "end_line": 263,
      "comment": "",
      "child_ranges": [
        "(line 230,col 9)-(line 235,col 44)",
        "(line 236,col 9)-(line 236,col 72)",
        "(line 237,col 9)-(line 237,col 41)",
        "(line 238,col 9)-(line 238,col 89)",
        "(line 239,col 9)-(line 241,col 60)",
        "(line 242,col 9)-(line 242,col 53)",
        "(line 243,col 9)-(line 243,col 59)",
        "(line 244,col 9)-(line 244,col 59)",
        "(line 245,col 9)-(line 245,col 59)",
        "(line 246,col 9)-(line 246,col 59)",
        "(line 248,col 9)-(line 253,col 44)",
        "(line 254,col 9)-(line 256,col 60)",
        "(line 257,col 9)-(line 257,col 53)",
        "(line 258,col 9)-(line 258,col 60)",
        "(line 259,col 9)-(line 259,col 60)",
        "(line 260,col 9)-(line 260,col 60)",
        "(line 261,col 9)-(line 261,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testMoreEstimatedParametersSimple()",
      "begin_line": 265,
      "end_line": 286,
      "comment": "",
      "child_ranges": [
        "(line 267,col 9)-(line 271,col 43)",
        "(line 273,col 9)-(line 273,col 72)",
        "(line 274,col 9)-(line 274,col 41)",
        "(line 275,col 9)-(line 275,col 89)",
        "(line 276,col 9)-(line 284,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testMoreEstimatedParametersUnsorted()",
      "begin_line": 288,
      "end_line": 308,
      "comment": "",
      "child_ranges": [
        "(line 289,col 9)-(line 295,col 55)",
        "(line 296,col 9)-(line 296,col 72)",
        "(line 297,col 9)-(line 297,col 41)",
        "(line 298,col 9)-(line 298,col 89)",
        "(line 299,col 9)-(line 307,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testRedundantEquations()",
      "begin_line": 310,
      "end_line": 327,
      "comment": "",
      "child_ranges": [
        "(line 311,col 9)-(line 315,col 43)",
        "(line 317,col 9)-(line 317,col 72)",
        "(line 318,col 9)-(line 318,col 41)",
        "(line 319,col 9)-(line 319,col 89)",
        "(line 320,col 9)-(line 322,col 54)",
        "(line 323,col 9)-(line 323,col 53)",
        "(line 324,col 9)-(line 324,col 57)",
        "(line 325,col 9)-(line 325,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testInconsistentEquations()",
      "begin_line": 329,
      "end_line": 342,
      "comment": "",
      "child_ranges": [
        "(line 330,col 9)-(line 334,col 43)",
        "(line 336,col 9)-(line 336,col 72)",
        "(line 337,col 9)-(line 337,col 41)",
        "(line 338,col 9)-(line 338,col 89)",
        "(line 339,col 9)-(line 339,col 101)",
        "(line 340,col 9)-(line 340,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testInconsistentSizes()",
      "begin_line": 344,
      "end_line": 379,
      "comment": "",
      "child_ranges": [
        "(line 345,col 9)-(line 346,col 93)",
        "(line 347,col 9)-(line 347,col 72)",
        "(line 348,col 9)-(line 348,col 41)",
        "(line 349,col 9)-(line 349,col 89)",
        "(line 351,col 9)-(line 352,col 102)",
        "(line 353,col 9)-(line 353,col 53)",
        "(line 354,col 9)-(line 354,col 57)",
        "(line 355,col 9)-(line 355,col 57)",
        "(line 357,col 9)-(line 366,col 9)",
        "(line 368,col 9)-(line 377,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testMaxEvaluations()",
      "begin_line": 381,
      "end_line": 401,
      "comment": "",
      "child_ranges": [
        "(line 382,col 9)-(line 382,col 37)",
        "(line 383,col 9)-(line 383,col 38)",
        "(line 384,col 9)-(line 384,col 38)",
        "(line 385,col 9)-(line 385,col 38)",
        "(line 386,col 9)-(line 386,col 38)",
        "(line 387,col 9)-(line 387,col 38)",
        "(line 388,col 9)-(line 388,col 72)",
        "(line 389,col 9)-(line 389,col 41)",
        "(line 390,col 9)-(line 390,col 91)",
        "(line 391,col 9)-(line 400,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testCircleFitting()",
      "begin_line": 403,
      "end_line": 422,
      "comment": "",
      "child_ranges": [
        "(line 404,col 9)-(line 404,col 37)",
        "(line 405,col 9)-(line 405,col 38)",
        "(line 406,col 9)-(line 406,col 38)",
        "(line 407,col 9)-(line 407,col 38)",
        "(line 408,col 9)-(line 408,col 38)",
        "(line 409,col 9)-(line 409,col 38)",
        "(line 410,col 9)-(line 410,col 72)",
        "(line 411,col 9)-(line 411,col 41)",
        "(line 412,col 9)-(line 412,col 91)",
        "(line 413,col 9)-(line 416,col 64)",
        "(line 417,col 9)-(line 417,col 102)",
        "(line 418,col 9)-(line 418,col 103)",
        "(line 419,col 9)-(line 419,col 75)",
        "(line 420,col 9)-(line 420,col 59)",
        "(line 421,col 9)-(line 421,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testCircleFittingBadInit()",
      "begin_line": 424,
      "end_line": 482,
      "comment": "",
      "child_ranges": [
        "(line 425,col 9)-(line 425,col 37)",
        "(line 426,col 9)-(line 456,col 10)",
        "(line 457,col 9)-(line 457,col 52)",
        "(line 458,col 9)-(line 458,col 33)",
        "(line 459,col 9)-(line 459,col 53)",
        "(line 460,col 9)-(line 460,col 34)",
        "(line 461,col 9)-(line 463,col 9)",
        "(line 464,col 9)-(line 464,col 72)",
        "(line 465,col 9)-(line 465,col 41)",
        "(line 466,col 9)-(line 466,col 89)",
        "(line 467,col 9)-(line 474,col 9)",
        "(line 476,col 9)-(line 477,col 79)",
        "(line 478,col 9)-(line 478,col 76)",
        "(line 479,col 9)-(line 479,col 76)",
        "(line 480,col 9)-(line 480,col 76)"
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
      "begin_line": 484,
      "end_line": 507,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 486,
      "end_line": 486,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "factors"
      ],
      "begin_line": 487,
      "end_line": 487,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "target"
      ],
      "begin_line": 488,
      "end_line": 488,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.LinearProblem.LinearProblem(double[][], double[])",
      "begin_line": 489,
      "end_line": 492,
      "comment": "",
      "child_ranges": [
        "(line 490,col 13)-(line 490,col 56)",
        "(line 491,col 13)-(line 491,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.LinearProblem.value(double[])",
      "begin_line": 494,
      "end_line": 496,
      "comment": "",
      "child_ranges": [
        "(line 495,col 13)-(line 495,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.LinearProblem.jacobian()",
      "begin_line": 498,
      "end_line": 505,
      "comment": "",
      "child_ranges": [
        "(line 499,col 13)-(line 504,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 500,
      "end_line": 500,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.LinearProblem.Anonymous-24d2a25e-d288-4089-a374-5b5ddb4292a3.value(double[])",
      "begin_line": 501,
      "end_line": 503,
      "comment": "",
      "child_ranges": [
        "(line 502,col 21)-(line 502,col 45)"
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
      "begin_line": 509,
      "end_line": 586,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 511,
      "end_line": 511,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "points"
      ],
      "begin_line": 512,
      "end_line": 512,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.Circle.Circle()",
      "begin_line": 514,
      "end_line": 516,
      "comment": "",
      "child_ranges": [
        "(line 515,col 13)-(line 515,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.Circle.addPoint(double, double)",
      "begin_line": 518,
      "end_line": 520,
      "comment": "",
      "child_ranges": [
        "(line 519,col 13)-(line 519,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.Circle.getN()",
      "begin_line": 522,
      "end_line": 524,
      "comment": "",
      "child_ranges": [
        "(line 523,col 13)-(line 523,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.Circle.getRadius(java.awt.geom.Point2D.Double)",
      "begin_line": 526,
      "end_line": 532,
      "comment": "",
      "child_ranges": [
        "(line 527,col 13)-(line 527,col 25)",
        "(line 528,col 13)-(line 530,col 13)",
        "(line 531,col 13)-(line 531,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.Circle.jacobian(double[])",
      "begin_line": 534,
      "end_line": 561,
      "comment": "",
      "child_ranges": [
        "(line 536,col 13)-(line 536,col 34)",
        "(line 537,col 13)-(line 537,col 83)",
        "(line 540,col 13)-(line 540,col 28)",
        "(line 541,col 13)-(line 541,col 28)",
        "(line 542,col 13)-(line 546,col 13)",
        "(line 547,col 13)-(line 547,col 22)",
        "(line 548,col 13)-(line 548,col 22)",
        "(line 551,col 13)-(line 551,col 51)",
        "(line 552,col 13)-(line 557,col 12)",
        "(line 559,col 13)-(line 559,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.Circle.value(double[])",
      "begin_line": 563,
      "end_line": 575,
      "comment": "",
      "child_ranges": [
        "(line 565,col 13)-(line 565,col 83)",
        "(line 566,col 13)-(line 566,col 46)",
        "(line 568,col 13)-(line 568,col 59)",
        "(line 569,col 13)-(line 571,col 13)",
        "(line 573,col 13)-(line 573,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.Circle.jacobian()",
      "begin_line": 577,
      "end_line": 584,
      "comment": "",
      "child_ranges": [
        "(line 578,col 13)-(line 583,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 579,
      "end_line": 579,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.Circle.Anonymous-cc853651-be95-4959-9a10-0f8b9b0ed416.value(double[])",
      "begin_line": 580,
      "end_line": 582,
      "comment": "",
      "child_ranges": [
        "(line 581,col 21)-(line 581,col 43)"
      ]
    }
  ]
}