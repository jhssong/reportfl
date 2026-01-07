{
  "filepath": "/tmp/Math-86b/src/test/org/apache/commons/math/optimization/general/GaussNewtonOptimizerTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GaussNewtonOptimizerTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 100,
      "end_line": 590,
      "comment": "\n * \u003cp\u003eSome of the unit tests are re-implementations of the MINPACK \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file17\"\u003efile17\u003c/a\u003e and \u003ca\n * href\u003d\"http://www.netlib.org/minpack/ex/file22\"\u003efile22\u003c/a\u003e test files. \n * The redistribution policy for MINPACK is available \u003ca\n * href\u003d\"http://www.netlib.org/minpack/disclaimer\"\u003ehere\u003c/a\u003e, for\n * convenience, it is reproduced below.\u003c/p\u003e\n\n * \u003ctable border\u003d\"0\" width\u003d\"80%\" cellpadding\u003d\"10\" align\u003d\"center\" bgcolor\u003d\"#E0E0E0\"\u003e\n * \u003ctr\u003e\u003ctd\u003e\n *    Minpack Copyright Notice (1999) University of Chicago.\n *    All rights reserved\n * \u003c/td\u003e\u003c/tr\u003e\n * \u003ctr\u003e\u003ctd\u003e\n * Redistribution and use in source and binary forms, with or without\n * modification, are permitted provided that the following conditions\n * are met:\n * \u003col\u003e\n *  \u003cli\u003eRedistributions of source code must retain the above copyright\n *      notice, this list of conditions and the following disclaimer.\u003c/li\u003e\n * \u003cli\u003eRedistributions in binary form must reproduce the above\n *     copyright notice, this list of conditions and the following\n *     disclaimer in the documentation and/or other materials provided\n *     with the distribution.\u003c/li\u003e\n * \u003cli\u003eThe end-user documentation included with the redistribution, if any,\n *     must include the following acknowledgment:\n *     \u003ccode\u003eThis product includes software developed by the University of\n *           Chicago, as Operator of Argonne National Laboratory.\u003c/code\u003e\n *     Alternately, this acknowledgment may appear in the software itself,\n *     if and wherever such third-party acknowledgments normally appear.\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eWARRANTY DISCLAIMER. THE SOFTWARE IS SUPPLIED \"AS IS\"\n *     WITHOUT WARRANTY OF ANY KIND. THE COPYRIGHT HOLDER, THE\n *     UNITED STATES, THE UNITED STATES DEPARTMENT OF ENERGY, AND\n *     THEIR EMPLOYEES: (1) DISCLAIM ANY WARRANTIES, EXPRESS OR\n *     IMPLIED, INCLUDING BUT NOT LIMITED TO ANY IMPLIED WARRANTIES\n *     OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, TITLE\n *     OR NON-INFRINGEMENT, (2) DO NOT ASSUME ANY LEGAL LIABILITY\n *     OR RESPONSIBILITY FOR THE ACCURACY, COMPLETENESS, OR\n *     USEFULNESS OF THE SOFTWARE, (3) DO NOT REPRESENT THAT USE OF\n *     THE SOFTWARE WOULD NOT INFRINGE PRIVATELY OWNED RIGHTS, (4)\n *     DO NOT WARRANT THAT THE SOFTWARE WILL FUNCTION\n *     UNINTERRUPTED, THAT IT IS ERROR-FREE OR THAT ANY ERRORS WILL\n *     BE CORRECTED.\u003c/strong\u003e\u003c/li\u003e\n * \u003cli\u003e\u003cstrong\u003eLIMITATION OF LIABILITY. IN NO EVENT WILL THE COPYRIGHT\n *     HOLDER, THE UNITED STATES, THE UNITED STATES DEPARTMENT OF\n *     ENERGY, OR THEIR EMPLOYEES: BE LIABLE FOR ANY INDIRECT,\n *     INCIDENTAL, CONSEQUENTIAL, SPECIAL OR PUNITIVE DAMAGES OF\n *     ANY KIND OR NATURE, INCLUDING BUT NOT LIMITED TO LOSS OF\n *     PROFITS OR LOSS OF DATA, FOR ANY REASON WHATSOEVER, WHETHER\n *     SUCH LIABILITY IS ASSERTED ON THE BASIS OF CONTRACT, TORT\n *     (INCLUDING NEGLIGENCE OR STRICT LIABILITY), OR OTHERWISE,\n *     EVEN IF ANY OF SAID PARTIES HAS BEEN WARNED OF THE\n *     POSSIBILITY OF SUCH LOSS OR DAMAGES.\u003c/strong\u003e\u003c/li\u003e\n * \u003col\u003e\u003c/td\u003e\u003c/tr\u003e\n * \u003c/table\u003e\n\n * @author Argonne National Laboratory. MINPACK project. March 1980 (original fortran minpack tests)\n * @author Burton S. Garbow (original fortran minpack tests)\n * @author Kenneth E. Hillstrom (original fortran minpack tests)\n * @author Jorge J. More (original fortran minpack tests)\n * @author Luc Maisonobe (non-minpack tests and minpack tests Java translation)\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.GaussNewtonOptimizerTest(java.lang.String)",
      "begin_line": 103,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testTrivial()",
      "begin_line": 107,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 108,col 9)-(line 109,col 76)",
        "(line 110,col 9)-(line 110,col 72)",
        "(line 111,col 9)-(line 111,col 40)",
        "(line 112,col 9)-(line 112,col 89)",
        "(line 113,col 9)-(line 114,col 96)",
        "(line 115,col 9)-(line 115,col 53)",
        "(line 116,col 9)-(line 116,col 58)",
        "(line 117,col 9)-(line 117,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testColumnsPermutation()",
      "begin_line": 120,
      "end_line": 138,
      "comment": "",
      "child_ranges": [
        "(line 122,col 9)-(line 124,col 62)",
        "(line 126,col 9)-(line 126,col 72)",
        "(line 127,col 9)-(line 127,col 40)",
        "(line 128,col 9)-(line 128,col 89)",
        "(line 129,col 9)-(line 130,col 105)",
        "(line 131,col 9)-(line 131,col 53)",
        "(line 132,col 9)-(line 132,col 58)",
        "(line 133,col 9)-(line 133,col 58)",
        "(line 134,col 9)-(line 134,col 58)",
        "(line 135,col 9)-(line 135,col 58)",
        "(line 136,col 9)-(line 136,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testNoDependency()",
      "begin_line": 140,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 141,col 9)-(line 148,col 58)",
        "(line 149,col 9)-(line 149,col 72)",
        "(line 150,col 9)-(line 150,col 40)",
        "(line 151,col 9)-(line 151,col 89)",
        "(line 152,col 9)-(line 154,col 66)",
        "(line 155,col 9)-(line 155,col 53)",
        "(line 156,col 9)-(line 158,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testOneSet()",
      "begin_line": 161,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 163,col 9)-(line 167,col 36)",
        "(line 168,col 9)-(line 168,col 72)",
        "(line 169,col 9)-(line 169,col 40)",
        "(line 170,col 9)-(line 170,col 89)",
        "(line 171,col 9)-(line 172,col 108)",
        "(line 173,col 9)-(line 173,col 53)",
        "(line 174,col 9)-(line 174,col 58)",
        "(line 175,col 9)-(line 175,col 58)",
        "(line 176,col 9)-(line 176,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testTwoSets()",
      "begin_line": 180,
      "end_line": 205,
      "comment": "",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 32)",
        "(line 182,col 9)-(line 189,col 66)",
        "(line 191,col 9)-(line 191,col 72)",
        "(line 192,col 9)-(line 192,col 40)",
        "(line 193,col 9)-(line 193,col 89)",
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
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testNonInversible()",
      "begin_line": 207,
      "end_line": 225,
      "comment": "",
      "child_ranges": [
        "(line 209,col 9)-(line 213,col 37)",
        "(line 214,col 9)-(line 214,col 72)",
        "(line 215,col 9)-(line 215,col 40)",
        "(line 216,col 9)-(line 216,col 89)",
        "(line 217,col 9)-(line 224,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testIllConditioned()",
      "begin_line": 227,
      "end_line": 261,
      "comment": "",
      "child_ranges": [
        "(line 228,col 9)-(line 233,col 44)",
        "(line 234,col 9)-(line 234,col 72)",
        "(line 235,col 9)-(line 235,col 40)",
        "(line 236,col 9)-(line 236,col 89)",
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
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testMoreEstimatedParametersSimple()",
      "begin_line": 263,
      "end_line": 284,
      "comment": "",
      "child_ranges": [
        "(line 265,col 9)-(line 269,col 43)",
        "(line 271,col 9)-(line 271,col 72)",
        "(line 272,col 9)-(line 272,col 40)",
        "(line 273,col 9)-(line 273,col 89)",
        "(line 274,col 9)-(line 282,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testMoreEstimatedParametersUnsorted()",
      "begin_line": 286,
      "end_line": 306,
      "comment": "",
      "child_ranges": [
        "(line 287,col 9)-(line 293,col 55)",
        "(line 294,col 9)-(line 294,col 72)",
        "(line 295,col 9)-(line 295,col 40)",
        "(line 296,col 9)-(line 296,col 89)",
        "(line 297,col 9)-(line 305,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testRedundantEquations()",
      "begin_line": 308,
      "end_line": 325,
      "comment": "",
      "child_ranges": [
        "(line 309,col 9)-(line 313,col 43)",
        "(line 315,col 9)-(line 315,col 72)",
        "(line 316,col 9)-(line 316,col 40)",
        "(line 317,col 9)-(line 317,col 89)",
        "(line 318,col 9)-(line 320,col 54)",
        "(line 321,col 9)-(line 321,col 53)",
        "(line 322,col 9)-(line 322,col 57)",
        "(line 323,col 9)-(line 323,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testInconsistentEquations()",
      "begin_line": 327,
      "end_line": 340,
      "comment": "",
      "child_ranges": [
        "(line 328,col 9)-(line 332,col 43)",
        "(line 334,col 9)-(line 334,col 72)",
        "(line 335,col 9)-(line 335,col 40)",
        "(line 336,col 9)-(line 336,col 89)",
        "(line 337,col 9)-(line 337,col 101)",
        "(line 338,col 9)-(line 338,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testInconsistentSizes()",
      "begin_line": 342,
      "end_line": 377,
      "comment": "",
      "child_ranges": [
        "(line 343,col 9)-(line 344,col 93)",
        "(line 345,col 9)-(line 345,col 72)",
        "(line 346,col 9)-(line 346,col 40)",
        "(line 347,col 9)-(line 347,col 89)",
        "(line 349,col 9)-(line 350,col 102)",
        "(line 351,col 9)-(line 351,col 53)",
        "(line 352,col 9)-(line 352,col 57)",
        "(line 353,col 9)-(line 353,col 57)",
        "(line 355,col 9)-(line 364,col 9)",
        "(line 366,col 9)-(line 375,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testMaxIterations()",
      "begin_line": 379,
      "end_line": 399,
      "comment": "",
      "child_ranges": [
        "(line 380,col 9)-(line 380,col 37)",
        "(line 381,col 9)-(line 381,col 38)",
        "(line 382,col 9)-(line 382,col 38)",
        "(line 383,col 9)-(line 383,col 38)",
        "(line 384,col 9)-(line 384,col 38)",
        "(line 385,col 9)-(line 385,col 38)",
        "(line 386,col 9)-(line 386,col 72)",
        "(line 387,col 9)-(line 387,col 40)",
        "(line 388,col 9)-(line 388,col 91)",
        "(line 389,col 9)-(line 398,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testCircleFitting()",
      "begin_line": 401,
      "end_line": 420,
      "comment": "",
      "child_ranges": [
        "(line 402,col 9)-(line 402,col 37)",
        "(line 403,col 9)-(line 403,col 38)",
        "(line 404,col 9)-(line 404,col 38)",
        "(line 405,col 9)-(line 405,col 38)",
        "(line 406,col 9)-(line 406,col 38)",
        "(line 407,col 9)-(line 407,col 38)",
        "(line 408,col 9)-(line 408,col 72)",
        "(line 409,col 9)-(line 409,col 40)",
        "(line 410,col 9)-(line 410,col 91)",
        "(line 411,col 9)-(line 414,col 64)",
        "(line 415,col 9)-(line 415,col 98)",
        "(line 416,col 9)-(line 416,col 103)",
        "(line 417,col 9)-(line 417,col 75)",
        "(line 418,col 9)-(line 418,col 59)",
        "(line 419,col 9)-(line 419,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.testCircleFittingBadInit()",
      "begin_line": 422,
      "end_line": 480,
      "comment": "",
      "child_ranges": [
        "(line 423,col 9)-(line 423,col 37)",
        "(line 424,col 9)-(line 454,col 10)",
        "(line 455,col 9)-(line 455,col 52)",
        "(line 456,col 9)-(line 456,col 33)",
        "(line 457,col 9)-(line 457,col 53)",
        "(line 458,col 9)-(line 458,col 34)",
        "(line 459,col 9)-(line 461,col 9)",
        "(line 462,col 9)-(line 462,col 72)",
        "(line 463,col 9)-(line 463,col 40)",
        "(line 464,col 9)-(line 464,col 89)",
        "(line 465,col 9)-(line 472,col 9)",
        "(line 474,col 9)-(line 475,col 79)",
        "(line 476,col 9)-(line 476,col 76)",
        "(line 477,col 9)-(line 477,col 76)",
        "(line 478,col 9)-(line 478,col 76)"
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
      "begin_line": 482,
      "end_line": 505,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 484,
      "end_line": 484,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "factors"
      ],
      "begin_line": 485,
      "end_line": 485,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "target"
      ],
      "begin_line": 486,
      "end_line": 486,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.LinearProblem.LinearProblem(double[][], double[])",
      "begin_line": 487,
      "end_line": 490,
      "comment": "",
      "child_ranges": [
        "(line 488,col 13)-(line 488,col 56)",
        "(line 489,col 13)-(line 489,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.LinearProblem.value(double[])",
      "begin_line": 492,
      "end_line": 494,
      "comment": "",
      "child_ranges": [
        "(line 493,col 13)-(line 493,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.LinearProblem.jacobian()",
      "begin_line": 496,
      "end_line": 503,
      "comment": "",
      "child_ranges": [
        "(line 497,col 13)-(line 502,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 498,
      "end_line": 498,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.LinearProblem.Anonymous-0d49bfd7-b89d-49fa-bf8c-3aebb6dffd38.value(double[])",
      "begin_line": 499,
      "end_line": 501,
      "comment": "",
      "child_ranges": [
        "(line 500,col 21)-(line 500,col 45)"
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
      "begin_line": 507,
      "end_line": 584,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 509,
      "end_line": 509,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "points"
      ],
      "begin_line": 510,
      "end_line": 510,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.Circle.Circle()",
      "begin_line": 512,
      "end_line": 514,
      "comment": "",
      "child_ranges": [
        "(line 513,col 13)-(line 513,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.Circle.addPoint(double, double)",
      "begin_line": 516,
      "end_line": 518,
      "comment": "",
      "child_ranges": [
        "(line 517,col 13)-(line 517,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.Circle.getN()",
      "begin_line": 520,
      "end_line": 522,
      "comment": "",
      "child_ranges": [
        "(line 521,col 13)-(line 521,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.Circle.getRadius(java.awt.geom.Point2D.Double)",
      "begin_line": 524,
      "end_line": 530,
      "comment": "",
      "child_ranges": [
        "(line 525,col 13)-(line 525,col 25)",
        "(line 526,col 13)-(line 528,col 13)",
        "(line 529,col 13)-(line 529,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.Circle.jacobian(double[])",
      "begin_line": 532,
      "end_line": 559,
      "comment": "",
      "child_ranges": [
        "(line 534,col 13)-(line 534,col 34)",
        "(line 535,col 13)-(line 535,col 83)",
        "(line 538,col 13)-(line 538,col 28)",
        "(line 539,col 13)-(line 539,col 28)",
        "(line 540,col 13)-(line 544,col 13)",
        "(line 545,col 13)-(line 545,col 22)",
        "(line 546,col 13)-(line 546,col 22)",
        "(line 549,col 13)-(line 549,col 51)",
        "(line 550,col 13)-(line 555,col 12)",
        "(line 557,col 13)-(line 557,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.Circle.value(double[])",
      "begin_line": 561,
      "end_line": 573,
      "comment": "",
      "child_ranges": [
        "(line 563,col 13)-(line 563,col 83)",
        "(line 564,col 13)-(line 564,col 46)",
        "(line 566,col 13)-(line 566,col 59)",
        "(line 567,col 13)-(line 569,col 13)",
        "(line 571,col 13)-(line 571,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.Circle.jacobian()",
      "begin_line": 575,
      "end_line": 582,
      "comment": "",
      "child_ranges": [
        "(line 576,col 13)-(line 581,col 14)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 577,
      "end_line": 577,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.Circle.Anonymous-33782f74-1f3a-40d2-8e92-0fb9e9681fe5.value(double[])",
      "begin_line": 578,
      "end_line": 580,
      "comment": "",
      "child_ranges": [
        "(line 579,col 21)-(line 579,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.general.GaussNewtonOptimizerTest.suite()",
      "begin_line": 586,
      "end_line": 588,
      "comment": "",
      "child_ranges": [
        "(line 587,col 9)-(line 587,col 61)"
      ]
    }
  ]
}